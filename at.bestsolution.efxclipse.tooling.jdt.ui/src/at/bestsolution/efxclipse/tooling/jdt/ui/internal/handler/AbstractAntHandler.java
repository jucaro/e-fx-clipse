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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.ui.PlatformUI;

import at.bestsolution.efxclipse.tooling.jdt.core.internal.JavaFXCorePlugin;
import at.bestsolution.efxclipse.tooling.jdt.core.internal.JavaFXPreferencesConstants;

public abstract class AbstractAntHandler extends AbstractHandler {

	protected Map<String,Object> prepareBuild(IFile f, Properties properties) {
		Map<String,Object> map = new HashMap<String, Object>();
		String workbench = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		
		IEclipsePreferences pref = InstanceScope.INSTANCE.getNode(JavaFXCorePlugin.PLUGIN_ID);
		String dir = pref.get(JavaFXPreferencesConstants.JAVAFX_DIR,"");
		
		map.put("jfxSdk", properties.getProperty("jfx.build.jfxsdk",dir));
		
		if( properties.getProperty("jfx.build.stagingdir") == null ) {
			DirectoryDialog dialog = new DirectoryDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
			dialog.setText("Staging Directory");
			String directory = dialog.open();
			if( directory == null ) {
				return null;
			}
			map.put("jfx.build.stagingdir",directory);
		} else {
			map.put("jfx.build.stagingdir", properties.getProperty("jfx.build.stagingdir").replace("${workspace}", workbench));
		}

		map.put("builderName", properties.getProperty("jfx.eclipse.buildername"));
		map.put("projectName",properties.getProperty("jfx.build.projectname",f.getProject().getName()));
		map.put("appVendor", properties.getProperty("jfx.build.vendorname"));
		map.put("appTitle",properties.getProperty("jfx.build.apptitle"));
		map.put("appVersion",properties.getProperty("jfx.build.appversion"));
		
		map.put("applicationClass", properties.getProperty("jfx.build.applicationClass"));
		map.put("preloaderClass",properties.getProperty("jfx.build.preloaderClass"));
		
		map.put("appletWith", properties.getProperty("jfx.deploy.appletWith"));
		map.put("appletHeight", properties.getProperty("jfx.deploy.appletHeight"));
		
		map.put("keyStore", properties.getProperty("jfx.sign.keystore") != null ? properties.getProperty("jfx.sign.keystore").replace("${workspace}", workbench) : null);
		map.put("keyStoreAlias", properties.getProperty("jfx.sign.alias"));
		map.put("keyStorePass", properties.getProperty("jfx.sign.password"));
		
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
