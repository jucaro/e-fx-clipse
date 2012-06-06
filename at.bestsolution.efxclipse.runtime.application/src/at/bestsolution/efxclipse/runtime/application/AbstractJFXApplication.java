package at.bestsolution.efxclipse.runtime.application;

import javafx.application.Application;
import javafx.stage.Stage;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import at.bestsolution.efxclipse.runtime.databinding.JFXRealm;

public abstract class AbstractJFXApplication implements IApplication {
	private static AbstractJFXApplication SELF;
	
	private IApplicationContext applicationContext;
	private Object returnValue;
	
	public static class JFXApp extends Application {
		private AbstractJFXApplication osgiApp = SELF;
		private IApplicationContext applicationContext;
		
		@Override
		public void start(final Stage primaryStage) throws Exception {
			this.applicationContext = osgiApp.applicationContext;
			
			JFXRealm.createDefault();
			osgiApp.jfxStart(applicationContext,JFXApp.this,primaryStage);
		}
		
		@Override
		public void stop() throws Exception {
			super.stop();
			osgiApp.returnValue = osgiApp.jfxStop();
		}
	}
	
	@Override
	public final Object start(IApplicationContext context) throws Exception {
		SELF = this;
		this.applicationContext = context;
		this.applicationContext.applicationRunning();
		
		// Looks like OS-X wants to have the context class loader to locate FX-Classes
		Thread.currentThread().setContextClassLoader(Application.class.getClassLoader());
		
		Application.launch(JFXApp.class, null);
		
		try {
			return returnValue == null ? IApplication.EXIT_OK : returnValue;
		} finally {
			returnValue = null;
		}
	}

	@Override
	public final void stop() {
		
	}

	protected abstract void jfxStart(IApplicationContext applicationContext, Application jfxApplication, Stage primaryStage);
	
	protected Object jfxStop() {
		return IApplication.EXIT_OK;
	}
}
