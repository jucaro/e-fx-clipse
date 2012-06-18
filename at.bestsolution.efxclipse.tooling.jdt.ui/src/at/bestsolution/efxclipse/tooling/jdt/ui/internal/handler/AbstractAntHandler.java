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
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.ui.PlatformUI;

import at.bestsolution.efxclipse.tooling.jdt.core.internal.BuildPathSupport;

public abstract class AbstractAntHandler extends AbstractHandler {
	protected IJavaProject project;
	
	protected Map<String,Object> prepareBuild(IFile f, Properties properties) {
		Map<String,Object> map = new HashMap<String, Object>();
		String workbench = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		
		IPath[] paths = BuildPathSupport.getPreferencePaths();
		if( paths != null ) {
			map.put("jfxjar", paths[0].toFile().getAbsolutePath());
			map.put("jfxantjar", paths[2].toFile().getAbsolutePath());
		}
		
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
		
		map.put("nativePackage", properties.getProperty("jfx.deploy.nativePackage"));
		map.put("appletWith", properties.getProperty("jfx.deploy.appletWith"));
		map.put("appletHeight", properties.getProperty("jfx.deploy.appletHeight"));
		
		map.put("keyStore", properties.getProperty("jfx.sign.keystore") != null ? properties.getProperty("jfx.sign.keystore").replace("${workspace}", workbench) : null);
		map.put("keyStoreAlias", properties.getProperty("jfx.sign.alias"));
		map.put("keyStorePass", properties.getProperty("jfx.sign.password"));
		map.put("keyPass", properties.getProperty("jfx.sign.keypassword"));
		
		try {
			map.put("projectEncoding", f.getProject().getDefaultCharset());
			IJavaProject p = JavaCore.create(f.getProject());
			map.put("sourceCompliance", p.getOption(JavaCore.COMPILER_SOURCE, true));
			map.put("targetCompliance", p.getOption(JavaCore.COMPILER_COMPLIANCE, true));
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		project = JavaCore.create(f.getProject());

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
				} else if( e.getEntryKind() == IClasspathEntry.CPE_CONTAINER ) {
					String start = e.getPath().segment(0);
					if( !"org.eclipse.jdt.launching.JRE_CONTAINER".equals(start)
							&& ! "at.bestsolution.efxclipse.tooling.jdt.core.JAVAFX_CONTAINER".equals(start)) {
						IClasspathContainer cpe = JavaCore.getClasspathContainer(e.getPath(), project);
						IClasspathEntry[] cpEntries = cpe.getClasspathEntries();
						for( IClasspathEntry tmp : cpEntries ) {
							if( tmp.getEntryKind() == IClasspathEntry.CPE_LIBRARY ) {
								listRefLibraries.add(tmp.getPath());
							}
						}
					}
				}
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
