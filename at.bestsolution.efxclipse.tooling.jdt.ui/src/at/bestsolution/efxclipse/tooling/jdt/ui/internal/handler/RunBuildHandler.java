package at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler;

import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.externaltools.internal.IExternalToolConstants;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISources;

public class RunBuildHandler extends AbstractAntHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEvaluationContext context = (IEvaluationContext) event.getApplicationContext();
		ISelection s = (ISelection) context.getVariable(ISources.ACTIVE_MENU_SELECTION_NAME);
		if( s instanceof IStructuredSelection ) {
			Object o = ((IStructuredSelection) s).getFirstElement();
			if( o instanceof IFile ) {
				IFile f = (IFile) o;
				try {
					InputStream in = f.getContents();
					Properties prop = new Properties();
					prop.load(in);
					in.close();
					Map<String, Object> rv = prepareBuild(f, prop);
					if( rv != null ) {
						CreateBuildXML b = new CreateBuildXML();
						File buildFile = b.run(rv);
						ILaunchConfiguration cfg = getLaunchConfig(buildFile, rv, f);
						
						if( cfg != null ) {
							DebugUITools.launch(cfg, ILaunchManager.RUN_MODE);
						}
					}
				} catch (Exception e) {
					throw new ExecutionException("Failed to export application",e);
				}
			}
		}
		return null;
	}
	
	private ILaunchConfiguration getLaunchConfig(File buildFile, Map<String, Object> cfgData, IFile buildCfgFile) throws CoreException {
		ILaunchManager mgr = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType type = mgr.getLaunchConfigurationType("org.eclipse.ant.AntLaunchConfigurationType");
		
		if( type != null ) {
			String name = (String) cfgData.get("builderName");
			if( name == null ) {
				name = "JFX Build - " + cfgData.get("projectName");	
			}
			
			for( ILaunchConfiguration cfg : mgr.getLaunchConfigurations(type) ) {
				if( cfg.getName().equals(name) ) {
					String s = cfg.getAttribute(IExternalToolConstants.ATTR_LOCATION, IExternalToolConstants.EMPTY_STRING);
					if( s.equals("") && new File(s).equals(buildFile) ) {
						return cfg;
					} else {
						cfg.delete();
					}
				}
			}
			
			ILaunchConfigurationWorkingCopy cfg = type.newInstance(null,  name);
			cfg.setAttribute(IExternalToolConstants.ATTR_LOCATION, buildFile.getAbsolutePath());
			cfg.setAttribute(IExternalToolConstants.ATTR_WORKING_DIRECTORY, buildFile.getParentFile().getAbsolutePath());
			cfg.doSave();
			
			return cfg;
		}
		return null;
	}
}