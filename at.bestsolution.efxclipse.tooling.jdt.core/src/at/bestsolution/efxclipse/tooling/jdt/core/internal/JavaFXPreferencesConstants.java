package at.bestsolution.efxclipse.tooling.jdt.core.internal;

import org.eclipse.core.runtime.Platform;
import org.eclipse.osgi.service.environment.Constants;
import org.osgi.framework.Version;


public class JavaFXPreferencesConstants {
	public static final String JAVAFX_CONFIGTYPE = JavaFXCorePlugin.PLUGIN_ID + ".javafx.configtype"; //$NON-NLS-1$
	
	public static final String CONFIG_TYPE_SDK = "SDK";
	public static final String CONFIG_TYPE_BUILTIN = "Builtin";
	public static final String CONFIG_TYPE_CUSTOM = "Custom";
	
	public static final String DEFAULT_TYPE = isJDKBuiltin() ? CONFIG_TYPE_BUILTIN : CONFIG_TYPE_SDK;
	
	// type == SDK
	public static final String JAVAFX_DIR = JavaFXCorePlugin.PLUGIN_ID + ".javafx.dirlocation"; //$NON-NLS-1$
	
	// type == Custom
	public static final String JAVAFX_JAR= JavaFXCorePlugin.PLUGIN_ID + ".javafx.jarlocation"; //$NON-NLS-1$
	public static final String JAVAFX_ANTJAR= JavaFXCorePlugin.PLUGIN_ID + ".javafx.antjarlocation"; //$NON-NLS-1$
	public static final String JAVAFX_JAVADOC= JavaFXCorePlugin.PLUGIN_ID + ".javafx.javadoclocation"; //$NON-NLS-1$
	
	private static int parseQualifier(String qualifier) {
		try {
			String[] parts = qualifier.split("[\\-|_]");
			return Integer.parseInt(parts[0]);		
		} catch(Throwable t ) {
			//TODO log error
			t.printStackTrace();
		}
		return 0;
	}
	
	public static final boolean isJDKBuiltin() {
		Version v = new Version(System.getProperty("java.version").replaceFirst("_", "."));
		if( Platform.getOS().equals(Constants.OS_LINUX) ) {
			return false;
		} else if( Platform.getOS().equals(Constants.OS_MACOSX) ) {
			return v.getMinor() >= 7 && v.getMicro() >= 0;
		} else if( Platform.getOS().equals(Constants.OS_WIN32) ) {
			System.err.println(v.getMinor());
			System.err.println(v.getMicro());
			System.err.println(v.getQualifier());
			System.err.println("Checking win32: " + (v.getMinor() >= 7 && (v.getMicro() == 0 && parseQualifier(v.getQualifier()) >= 6) || v.getMicro() > 0));
			return v.getMinor() >= 7 && (v.getMicro() == 0 && parseQualifier(v.getQualifier()) >= 6) || v.getMicro() > 0;
		}
		return false;
	}
}
