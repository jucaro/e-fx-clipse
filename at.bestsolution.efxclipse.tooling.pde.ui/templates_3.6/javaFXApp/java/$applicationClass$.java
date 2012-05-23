package $packageName$;

import org.eclipse.equinox.app.IApplicationContext;

import javafx.stage.Stage;
import at.bestsolution.efxclipse.runtime.application.AbstractJFXApplication;

/**
 * This class controls all aspects of the JavaFX OSGi application's execution
 */
public class $applicationClass$ extends AbstractJFXApplication {
	protected void jfxStart(IApplicationContext applicationContext, javafx.application.Application jfxApplication, Stage primaryStage) {
		primaryStage.setTitle("$windowTitle$");
		primaryStage.show();
	}
}