package $packageName$;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import org.eclipse.equinox.app.IApplicationContext;

import at.bestsolution.efxclipse.runtime.application.AbstractJFXApplication;

/**
 * This class controls all aspects of the JavaFX OSGi application's execution
 */
public class $applicationClass$ extends AbstractJFXApplication {
	protected void jfxStart(IApplicationContext applicationContext, javafx.application.Application jfxApplication, Stage primaryStage) {
		Scene s = new Scene(new Label("$windowTitle$"));
		primaryStage.setScene(s);
		primaryStage.setWidth(300);
		primaryStage.setHeight(400);
		primaryStage.setTitle("$windowTitle$");
		primaryStage.show();
	}
}