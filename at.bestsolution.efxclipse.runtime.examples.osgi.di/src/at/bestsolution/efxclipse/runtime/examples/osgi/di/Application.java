package at.bestsolution.efxclipse.runtime.examples.osgi.di;

import javafx.stage.Stage;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.equinox.app.IApplicationContext;

import at.bestsolution.efxclipse.runtime.application.AbstractJFXApplication;

/**
 * This class controls all aspects of the JavaFX OSGi application's execution
 */
@SuppressWarnings("restriction")
public class Application extends AbstractJFXApplication {
	
	protected void jfxStart(IApplicationContext applicationContext, javafx.application.Application jfxApplication, Stage primaryStage) {
		IEclipseContext context = EclipseContextFactory.getServiceContext(Activator.getContext());
		context.set(IApplicationContext.class, applicationContext);
		context.set(javafx.application.Application.class, jfxApplication);
		context.set(Stage.class, primaryStage);
		
		ContextInjectionFactory.make(DIApplication.class, context);
	}
}