package at.bestsolution.efxclipse.runtime.examples.osgi;

import javafx.stage.Stage;
import at.bestsolution.efxclipse.runtime.application.AbstractJFXApplication;

/**
 * This class controls all aspects of the application's execution
 */
public class Application extends AbstractJFXApplication {

	@Override
	protected void jfxStart(Stage primaryStage) {
		primaryStage.show();
	}	
}