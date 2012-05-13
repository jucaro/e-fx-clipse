package at.bestsolution.efxclipse.tooling.jdt.core.internal;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jdt.core.IAccessRule;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;

public class BuildPathSupport {
	public static final String WEB_JAVADOC_LOCATION = "http://docs.oracle.com/javafx/2/api/";
	
	public static IClasspathEntry getJavaFXLibraryEntry() {
		IPath[] paths = getPreferencePaths();
		
		if( paths != null ) {
			IPath jarLocationPath = paths[0];
			IPath javadocLocation = paths[1];
			
			IClasspathAttribute[] attributes;
			IAccessRule[] accessRules= { };
			if (!javadocLocation.toFile().exists()) {
				attributes= new IClasspathAttribute[] { JavaCore.newClasspathAttribute(IClasspathAttribute.JAVADOC_LOCATION_ATTRIBUTE_NAME, WEB_JAVADOC_LOCATION) };
			} else {
				attributes= new IClasspathAttribute[] { JavaCore.newClasspathAttribute(IClasspathAttribute.JAVADOC_LOCATION_ATTRIBUTE_NAME, javadocLocation.toFile().toURI().toString()) };
			}
			
			if( jarLocationPath.toFile().exists() ) {
				return JavaCore.newLibraryEntry(jarLocationPath, null, null, accessRules, attributes, false);	
			}	
		}
		
		return null;
	}
	
	public static IPath[] getPreferencePaths() {
		IEclipsePreferences pref = InstanceScope.INSTANCE.getNode(JavaFXCorePlugin.PLUGIN_ID);
		
		String type = pref.get(JavaFXPreferencesConstants.JAVAFX_CONFIGTYPE, JavaFXPreferencesConstants.DEFAULT_TYPE);
		
		IPath jarLocationPath = null;
		IPath javadocLocation = null;
		IPath antJarLocationPath = null;
		
		if( type.equals(JavaFXPreferencesConstants.CONFIG_TYPE_SDK) ) {
			String dir = pref.get(JavaFXPreferencesConstants.JAVAFX_DIR,"");
			
			if( dir.length() > 0 ) {
				jarLocationPath = new Path(dir).append("rt").append("lib").append("jfxrt.jar");
				javadocLocation = new Path(dir).append("docs").append("api");
				antJarLocationPath = new Path(dir).append("tools").append("ant-javafx.jar");
			}	
		} else if( type.equals(JavaFXPreferencesConstants.CONFIG_TYPE_BUILTIN) ) {
			File javaHome; 
			try {
				javaHome= new File (System.getProperty("java.home")).getCanonicalFile(); //$NON-NLS-1$
			} catch (IOException e) {
				//TODO Add logging
				e.printStackTrace();
				return null;
			}
			if (!javaHome.exists()) {
				return null;
			}
			
			jarLocationPath = new Path(javaHome.getAbsolutePath()).append("lib").append("jfxrt.jar");
			javadocLocation = null; //TODO Fix with JDK-7u6 for OS-X
			antJarLocationPath = new Path(javaHome.getParent()).append("lib").append("ant-javafx.jar");
		} else if( type.equals(JavaFXPreferencesConstants.CONFIG_TYPE_CUSTOM) ) {
			String jar = pref.get(JavaFXPreferencesConstants.JAVAFX_JAR, null);
			String javadoc = pref.get(JavaFXPreferencesConstants.JAVAFX_JAVADOC, null);
			String antJar = pref.get(JavaFXPreferencesConstants.JAVAFX_ANTJAR, null);
			
			if( jar != null ) {
				jarLocationPath = new Path(jar);
			}
			
			if( javadoc != null ) {
				javadocLocation = new Path(javadoc);
			}
			
			if( antJar != null ) {
				antJarLocationPath = new Path(antJar);
			}
		}
		
		return new IPath[] { jarLocationPath, javadocLocation, antJarLocationPath };
	}
}
