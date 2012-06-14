/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler;

import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

import org.eclipse.ant.launching.IAntLaunchConstants;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.externaltools.internal.IExternalToolConstants;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;

/**
 * @author Tom Schindl
 *
 */
@SuppressWarnings("restriction")
public abstract class AbstractBuildHandler extends AbstractAntHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEvaluationContext context = (IEvaluationContext) event.getApplicationContext();
		
		IFile f = getConfigurationFile(context);
		if( f == null ) {
			return null;
		}
		
		try {
			InputStream in = f.getContents();
			Properties prop = new Properties();
			prop.load(in);
			in.close();
			Map<String, Object> rv = prepareBuild(f, prop);
			if( rv != null ) {
				CreateBuildXML b = new CreateBuildXML();
				File buildFile = b.run(rv);
				
				f.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
				
				ILaunchConfiguration cfg = getLaunchConfig(buildFile, rv, f);
				
				if( cfg != null && launchAnt() ) {
					DebugUITools.launch(cfg, ILaunchManager.RUN_MODE);
				}
			}
		} catch (Exception e) {
			throw new ExecutionException("Failed to export application",e);
		}
		return null;
	}
	
	protected abstract boolean launchAnt();
	
	protected abstract IFile getConfigurationFile(IEvaluationContext context);
	
	private ILaunchConfiguration getLaunchConfig(File buildFile, Map<String, Object> cfgData, IFile buildCfgFile) throws CoreException {
		ILaunchManager mgr = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType type = mgr.getLaunchConfigurationType("org.eclipse.ant.AntLaunchConfigurationType");
		
		if( type != null ) {
			String name = (String) cfgData.get("builderName");
			if( name == null ) {
				name = "JFX Build - " + cfgData.get("projectName");	
			}
			
			File fBuildFile = new File(cfgData.get("jfx.build.stagingdir") + "/build.xml");
			
			for( ILaunchConfiguration cfg : mgr.getLaunchConfigurations(type) ) {
				if( cfg.getName().equals(name) ) {
					String s = cfg.getAttribute(IExternalToolConstants.ATTR_LOCATION, IExternalToolConstants.EMPTY_STRING);
					if( ! s.equals("") && new File(s).equals(fBuildFile) ) {
						return cfg;
					} else {
						cfg.delete();
					}
				}
			}
			
			ILaunchConfigurationWorkingCopy cfg = type.newInstance(null,  name);
			cfg.setAttribute(IExternalToolConstants.ATTR_LOCATION, buildFile.getAbsolutePath());
			cfg.setAttribute(IExternalToolConstants.ATTR_WORKING_DIRECTORY, buildFile.getParentFile().getAbsolutePath());
			cfg.setAttribute(IAntLaunchConstants.ATTR_DEFAULT_VM_INSTALL,false);
			
			for( IClasspathEntry e : project.getRawClasspath() ) {
				String start = e.getPath().segment(0);
				if( "org.eclipse.jdt.launching.JRE_CONTAINER".equals(start)) {
					cfg.setAttribute(IJavaLaunchConfigurationConstants.ATTR_JRE_CONTAINER_PATH, e.getPath().toString());
				}
			}
			
			
			cfg.doSave();
			
			return cfg;
		}
		return null;
	}
}