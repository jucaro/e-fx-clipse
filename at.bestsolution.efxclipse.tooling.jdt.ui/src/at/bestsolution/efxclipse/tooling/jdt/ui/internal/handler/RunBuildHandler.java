package at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.eclipse.ant.core.AntCorePlugin;
import org.eclipse.ant.core.AntCorePreferences;
import org.eclipse.ant.core.AntRunner;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.ISources;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.osgi.framework.FrameworkUtil;

import at.bestsolution.efxclipse.tooling.jdt.core.internal.JavaFXCorePlugin;
import at.bestsolution.efxclipse.tooling.jdt.core.internal.JavaFXPreferencesConstants;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.JavaFXUIPlugin;

public class RunBuildHandler extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEvaluationContext context = (IEvaluationContext) event.getApplicationContext();
		ISelection s = (ISelection) context.getVariable(ISources.ACTIVE_MENU_SELECTION_NAME);
		if( s instanceof IStructuredSelection ) {
			Object o = ((IStructuredSelection) s).getFirstElement();
			if( o instanceof IFile ) {
				IFile f = (IFile) o;
				MessageConsole console = findConsole("JavaFXBuild");
				final MessageConsoleStream stream = console.newMessageStream();
				
				try {
					stream.println("Launching Build ...");
					
					InputStream in = f.getContents();
					Properties prop = new Properties();
					prop.load(in);
					in.close();
					Map<String, Object> rv = prepareBuild(f, prop);
					if( rv != null ) {
						CreateBuildXML b = new CreateBuildXML();
						File buildFile = b.run(rv);

						// set custom classpath
						AntRunner runner = new AntRunner();
						runner.setBuildFileLocation(buildFile.getAbsolutePath());
//						runner.addBuildLogger("at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler.AntLogger");
//						runner.addBuildListener("at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler.AntBuildListener");
						runner.run(new NullProgressMonitor());
						stream.println("Build finished");
					}
				} catch (Exception e) {
					stream.println("Failed to execute build");
					throw new ExecutionException("Failed to export application",e);
				}
			}
		}
		// TODO Auto-generated method stub
		return null;
	}
	
	private MessageConsole findConsole(String name) {
	      ConsolePlugin plugin = ConsolePlugin.getDefault();
	      IConsoleManager conMan = plugin.getConsoleManager();
	      IConsole[] existing = conMan.getConsoles();
	      for (int i = 0; i < existing.length; i++)
	         if (name.equals(existing[i].getName()))
	            return (MessageConsole) existing[i];
	      
	      //no console found, so create a new one
	      MessageConsole myConsole = new MessageConsole(name, null);
	      conMan.addConsoles(new IConsole[]{myConsole});
	      return myConsole;
	   }
	
	private Map<String,Object> prepareBuild(IFile f, Properties properties) {
		IEclipsePreferences pref = InstanceScope.INSTANCE.getNode(JavaFXCorePlugin.PLUGIN_ID);
		String dir = pref.get(JavaFXPreferencesConstants.JAVAFX_DIR,"");
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("jfxSdk", dir);
		
		if( properties.getProperty("jfx.build.stagingdir") == null ) {
			DirectoryDialog dialog = new DirectoryDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
			dialog.setText("Staging Directory");
			String directory = dialog.open();
			if( directory == null ) {
				return null;
			}
		} else {
			map.put("jfx.build.stagingdir", properties.getProperty("jfx.build.stagingdir"));
		}

		map.put("projectName",properties.getProperty("jfx.build.projectname"));
		map.put("appVendor", properties.getProperty("jfx.build.vendorname"));
		map.put("appTitle",properties.getProperty("jfx.build.apptitle"));
		map.put("appVersion",properties.getProperty("jfx.build.appversion"));
		

		map.put("applicationClass", properties.getProperty("jfx.build.applicationClass"));
		map.put("appletWith", properties.getProperty("jfx.deploy.appletWith"));
		map.put("appletHeight", properties.getProperty("jfx.deploy.appletHeight"));
		
		IJavaProject project = JavaCore.create(f.getProject());

		Set<IPath> listProjectSourceDirs = new HashSet<IPath>();
		Set<IPath> listRefProjectSourceDirs = new HashSet<IPath>();
		Set<IPath> listRefLibraries = new HashSet<IPath>();

		resolveDataProject(project, listProjectSourceDirs, listRefProjectSourceDirs, listRefLibraries);
		
		{
			Set<String> set = new HashSet<String>();
			Set<File> set2 = new HashSet<File>();
			for( IPath p : listRefLibraries ) {
				set.add(p.lastSegment());
				IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(p);
				if( file != null && file.exists() ) {
					p = file.getLocation();
				}
				set2.add(p.toFile());
			}
			map.put("externalLibs", set);
			map.put("orig.externalLibs",set2);
		}
		
		{
			Set<String> set = new HashSet<String>();
			Set<SetupDirectory> set2 = new HashSet<SetupDirectory>();
			for( IPath p : listProjectSourceDirs ) {
				IFolder t = ResourcesPlugin.getWorkspace().getRoot().getFolder(p);
				set.add(t.getProjectRelativePath().toString());
				set2.add(
						new SetupDirectory(
								t.getLocation().toFile().getParentFile(), 
								new File(t.getProjectRelativePath().toString())));
			}
			map.put("projectSourceDirs", set);
			map.put("orig.projectSourceDirs",set2);
		}
		
		{
			Set<String> set = new HashSet<String>();
			Set<SetupDirectory> set2 = new HashSet<SetupDirectory>();
			for( IPath p : listRefProjectSourceDirs ) {
				IFolder t = ResourcesPlugin.getWorkspace().getRoot().getFolder(p);
				set.add(t.getProject().getName() + "/" + t.getProjectRelativePath());
				set2.add(
						new SetupDirectory(
								t.getProject().getLocation().toFile().getParentFile(), 
								new File(t.getProject().getName()+"/" + t.getProjectRelativePath().toString())));
				
//				set2.add(
//						new SetupDirectory(
//								t.getProjectRelativePath().toFile().getAbsoluteFile(), 
//								new File(t.getProject().getName()+"/" + t.getProjectRelativePath().toString())));
			}
			map.put("projectRefSourceDirs", set);
			map.put("orig.projectRefSourceDirs",set2);
		}
		
		return map;
	}
	
	private void resolveDataProject(IJavaProject project, Set<IPath> listProjectSourceDirs, Set<IPath> listRefProjectSourceDirs, Set<IPath> listRefLibraries) {
		try {
			IClasspathEntry[] entries = project.getRawClasspath();
			for( IClasspathEntry e : entries ) {
				if( e.getEntryKind() == IClasspathEntry.CPE_PROJECT ) {
					IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(e.getPath().lastSegment());
					if( p.exists() ) {
						resolveDataProject(JavaCore.create(p), listRefProjectSourceDirs, listRefProjectSourceDirs, listRefLibraries);
					}
				} else if( e.getEntryKind() == IClasspathEntry.CPE_LIBRARY ) {
					listRefLibraries.add(e.getPath());
				} else if( e.getEntryKind() == IClasspathEntry.CPE_SOURCE ) {
					listProjectSourceDirs.add(e.getPath());
				}
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}