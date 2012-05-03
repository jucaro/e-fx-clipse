package at.bestsolution.efxclipse.runtime.examples.swt;

import org.eclipse.equinox.app.IApplicationContext;

import at.bestsolution.efxclipse.runtime.application.AbstractJFXApplication;
import javafx.application.Application;
import javafx.stage.Stage;

public abstract class SWTApplication extends AbstractJFXApplication {

	@Override
	protected void jfxStart(IApplicationContext applicationContext, Application jfxApplication, Stage primaryStage) {
		run();
	}
	
	public abstract void run();

	public void spinEventLoop() {

	}
}
