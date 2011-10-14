package at.bestsolution.efxclipse.runtime.di;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osgi.framework.Bundle;

import at.bestsolution.efxclipse.runtime.javafx.OSGiFXMLLoader;
import at.bestsolution.efxclipse.runtime.javafx.OSGiFXMLLoader.FXMLLoaderProcessor;

@SuppressWarnings("restriction")
public class InjectingFXMLLoader {
	public static <N> N loadFXML(final IEclipseContext context, Class<?> requester, String relativeFxmlPath) throws IOException {
		return OSGiFXMLLoader.load(requester, relativeFxmlPath, null, new JavaFXBuilderFactory(), new Postprocessor(context));
	}
	
	public static <N> N loadFXML(final IEclipseContext context, Bundle bundle, String bundleRelativeFxmlPath) throws IOException {
		return OSGiFXMLLoader.load(bundle, bundleRelativeFxmlPath, null, new JavaFXBuilderFactory(), new Postprocessor(context));
	}
	
	public static <N> N loadFXML(IEclipseContext context, ClassLoader classloader, URL url) throws IOException {
		return OSGiFXMLLoader.load(classloader, url, null, new JavaFXBuilderFactory(), new Postprocessor(context));
	}
	
	static class Postprocessor implements FXMLLoaderProcessor {
		private final IEclipseContext context;
		
		public Postprocessor(IEclipseContext context) {
			this.context = context;
		}
		
		@Override
		public void postProcess(FXMLLoader loader) {
			if( loader.getController() != null ) {
				ContextInjectionFactory.inject(loader.getController(), context);	
			}
			
			injectLoaders(loader, context);
		}
		
		private static void injectLoaders(FXMLLoader parentLoader, IEclipseContext context) {
			for( FXMLLoader l : parentLoader.getIncludes() ) {
				if( l.getController() != null ) {
					ContextInjectionFactory.inject(l.getController(), context);
					injectLoaders(l, context);
				}
			}
		}
	}
	
	
}
