package at.bestsolution.efxclipse.runtime.di;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.util.BuilderFactory;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osgi.framework.Bundle;

import at.bestsolution.efxclipse.runtime.osgi.util.OSGiFXMLLoader;
import at.bestsolution.efxclipse.runtime.osgi.util.OSGiFXMLLoader.FXMLLoaderProcessor;


@SuppressWarnings("restriction")
public abstract class InjectingFXMLLoader<N> implements FXMLBuilder<N> {
	ResourceBundle resourceBundle;
	BuilderFactory builderFactory = new JavaFXBuilderFactory();
	
	public static <N> InjectingFXMLLoader<N> create(final IEclipseContext context, final Class<?> requester, final String relativeFxmlPath) {
		return new InjectingFXMLLoader<N>() {

			@Override
			public N load() throws IOException {
				return OSGiFXMLLoader.load(requester, relativeFxmlPath, resourceBundle, builderFactory, new Postprocessor(context));
			}
			
		};
	}
	
	public static <N> InjectingFXMLLoader<N> create(final IEclipseContext context, final Bundle bundle, final String bundleRelativeFxmlPath) {
		return new InjectingFXMLLoader<N>() {

			@Override
			public N load() throws IOException {
				return OSGiFXMLLoader.load(bundle, bundleRelativeFxmlPath, resourceBundle, builderFactory, new Postprocessor(context));
			}
			
		};
	}
	
	public static <N> InjectingFXMLLoader<N> create(final IEclipseContext context, final ClassLoader classloader, final URL url) {
		return new InjectingFXMLLoader<N>() {

			@Override
			public N load() throws IOException {
				return OSGiFXMLLoader.load(classloader, url, null, new JavaFXBuilderFactory(), new Postprocessor(context));
			}
			
		};
	}
	
	public InjectingFXMLLoader<N> resourceBundle(ResourceBundle resourceBundle) {
		this.resourceBundle = resourceBundle;
		return this;
	}
	
	public InjectingFXMLLoader<N> builderFactory(BuilderFactory builderFactory) {
		this.builderFactory = builderFactory;
		return this;
	}
	
	static class Postprocessor implements FXMLLoaderProcessor {
		private final IEclipseContext context;
		
		public Postprocessor(IEclipseContext context) {
			this.context = context;
		}
		
		@Override
		public void postProcess(FXMLLoader loader) {
			if( loader.getController() != null ) {
				context.set(FXMLLoaderFactory.CONTEXT_KEY, loader.getRoot());
				context.set(loader.getController().getClass().getName(), loader.getController());
				ContextInjectionFactory.inject(loader.getController(), context);
			}
			
			injectLoaders(loader, context);
		}
		
		private static void injectLoaders(FXMLLoader parentLoader, IEclipseContext context) {
			for( FXMLLoader l : parentLoader.getIncludes() ) {
				if( l.getController() != null ) {
					IEclipseContext localContext = context.createChild();
					localContext.set(FXMLLoaderFactory.CONTEXT_KEY, l.getRoot());
					localContext.set(l.getController().getClass().getName(), l.getController());
					ContextInjectionFactory.inject(l.getController(), localContext);
					injectLoaders(l, localContext);
				}
			}
		}
	}
	
	
}
