package at.bestsolution.efxclipse.tooling.fxgraph.ui.util;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

public class RelativeFileLocator {
	public static File locateFile(URI uri, String filePath) {
		IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(uri.segment(1));
		IJavaProject jp = JavaCore.create(p);
		
		IFile f = p.getFile(filePath);
		if( f.exists() ) {
			return f.getLocation().toFile().getAbsoluteFile();
		} else if( jp != null ) {
			try {
				for( IPackageFragmentRoot r : jp.getPackageFragmentRoots() ) {
					if( r.isArchive() ) {
						//TODO We should allow to load styles from the referenced jars
					} else if( r.getResource() instanceof IFolder ) {
						IFolder folder = (IFolder) r.getResource();
						if( folder.exists() ) {
							f = folder.getFile(filePath);
							if( f.exists() ) {
								return f.getLocation().toFile().getAbsoluteFile();
							}
						}	
					}
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return null;
	}
}
