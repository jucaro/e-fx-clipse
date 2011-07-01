package at.bestsolution.efxclipse.tooling.jdt.core.internal;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jdt.core.IAccessRule;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;

public class BuildPathSupport {
	public static IClasspathEntry getJavaFXLibraryEntry() {
		IEclipsePreferences pref = InstanceScope.INSTANCE.getNode(JavaFXCorePlugin.PLUGIN_ID);
		String dir = pref.get(JavaFXPreferencesConstants.JAVAFX_DIR,"");
		
		if( dir.length() > 0 ) {
			IPath jarLocationPath = new Path(dir).append("rt").append("lib").append("jfxrt.jar");
			IPath javadocLocation = new Path(dir).append("docs").append("api");
			
			IClasspathAttribute[] attributes;
			IAccessRule[] accessRules= { };
			if (!javadocLocation.toFile().exists()) {
				attributes= new IClasspathAttribute[0];
			} else {
				attributes= new IClasspathAttribute[] { JavaCore.newClasspathAttribute(IClasspathAttribute.JAVADOC_LOCATION_ATTRIBUTE_NAME, javadocLocation.toFile().toURI().toString()) };
			}
			
			if( jarLocationPath.toFile().exists() ) {
				return JavaCore.newLibraryEntry(jarLocationPath, null, null, accessRules, attributes, false);	
			}	
		}
		
		return null;
	}
}
