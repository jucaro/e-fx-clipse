package at.bestsolution.efxclipse.runtime.application;

import javafx.application.Application;
import javafx.stage.Stage;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public abstract class AbstractJFXApplication implements IApplication {
	private static AbstractJFXApplication SELF;
	
	public static class JFXApp extends Application {
		private AbstractJFXApplication osgiApp = SELF;
		
		@Override
		public void start(Stage primaryStage) throws Exception {
			osgiApp.jfxStart(primaryStage);
		}
		
	}
	
	@Override
	public Object start(IApplicationContext context) throws Exception {
		SELF = this;
		Application.launch(JFXApp.class, null);
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
		
	}

	protected abstract void jfxStart(Stage primaryStage);
}
