package at.bestsolution.efxclipse.runtime.di;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.util.BuilderFactory;
import javafx.util.Callback;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osgi.framework.Bundle;

import at.bestsolution.efxclipse.runtime.osgi.util.OSGiFXMLLoader;


@SuppressWarnings("restriction")
public abstract class InjectingFXMLLoader<N> implements FXMLBuilder<N> {
	ResourceBundle resourceBundle;
	BuilderFactory builderFactory;
	
	public static <N> InjectingFXMLLoader<N> create(final IEclipseContext context, final Class<?> requester, final String relativeFxmlPath) {
		return new InjectingFXMLLoader<N>() {

			public N load() throws IOException {
				return OSGiFXMLLoader.load(requester, relativeFxmlPath, resourceBundle, builderFactory, new ControllerFactory(context));
			}
			
		};
	}
	
	public static <N> InjectingFXMLLoader<N> create(final IEclipseContext context, final Bundle bundle, final String bundleRelativeFxmlPath) {
		return new InjectingFXMLLoader<N>() {

			public N load() throws IOException {
				return OSGiFXMLLoader.load(bundle, bundleRelativeFxmlPath, resourceBundle, builderFactory, new ControllerFactory(context));
			}
			
		};
	}
	
	public static <N> InjectingFXMLLoader<N> create(final IEclipseContext context, final ClassLoader classloader, final URL url) {
		return new InjectingFXMLLoader<N>() {

			public N load() throws IOException {
				return OSGiFXMLLoader.load(classloader, url, resourceBundle, builderFactory, new ControllerFactory(context));
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
	
	static class ControllerFactory implements Callback<Class<?>, Object> {

		private final IEclipseContext context;
		
		public ControllerFactory(IEclipseContext context) {
			this.context = context;
		}
		
		public Object call(Class<?> param) {
			return ContextInjectionFactory.make(param, context);
		}
		
	}
}
