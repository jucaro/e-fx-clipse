package at.bestsolution.efxclipse.tooling.jdt.core.internal;

import org.eclipse.core.runtime.Platform;
import org.eclipse.osgi.service.environment.Constants;


public class JavaFXPreferencesConstants {
	public static final String JAVAFX_CONFIGTYPE = JavaFXCorePlugin.PLUGIN_ID + ".javafx.configtype"; //$NON-NLS-1$
	
	public static final String CONFIG_TYPE_SDK = "SDK";
	public static final String CONFIG_TYPE_BUILTIN = "Builtin";
	public static final String CONFIG_TYPE_CUSTOM = "Custom";
	
	public static final String DEFAULT_TYPE = Platform.getOS().equals(Constants.OS_MACOSX) ? CONFIG_TYPE_BUILTIN : CONFIG_TYPE_SDK;
	
	// type == SDK
	public static final String JAVAFX_DIR = JavaFXCorePlugin.PLUGIN_ID + ".javafx.dirlocation"; //$NON-NLS-1$
	
	// type == Custom
	public static final String JAVAFX_JAR= JavaFXCorePlugin.PLUGIN_ID + ".javafx.jarlocation"; //$NON-NLS-1$
	public static final String JAVAFX_ANTJAR= JavaFXCorePlugin.PLUGIN_ID + ".javafx.antjarlocation"; //$NON-NLS-1$
	public static final String JAVAFX_JAVADOC= JavaFXCorePlugin.PLUGIN_ID + ".javafx.javadoclocation"; //$NON-NLS-1$
}
