package at.bestsolution.efxclipse.runtime.osgi.util;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.util.ResourceBundle;

import org.osgi.framework.Bundle;
import org.osgi.framework.wiring.BundleWiring;

import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.util.BuilderFactory;

public class OSGiFXMLLoader {
	public static <O> O load(Class<?> requester, String relativeFxmlPath, ResourceBundle resourceBundle, BuilderFactory builderFactory) throws IOException {
		URL url = requester.getResource(relativeFxmlPath);
		ClassLoader loader = requester.getClassLoader();
		return load(loader, url, resourceBundle, builderFactory);
	}
	
	public static <O> O load(Bundle bundle, String bundleRelativeFxmlPath, ResourceBundle resourceBundle, BuilderFactory builderFactory) throws IOException {
		URL url = bundle.getResource(bundleRelativeFxmlPath);
		ClassLoader loader = bundle.adapt(BundleWiring.class).getClassLoader();
		return load(loader, url, resourceBundle, builderFactory);
	}
	
	public static <O> O load(ClassLoader classloader, URL url, ResourceBundle resourceBundle, BuilderFactory builderFactory) throws IOException {
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		
		try {
			Thread.currentThread().setContextClassLoader(classloader);
			O o = FXMLLoader.load(url, resourceBundle, builderFactory);
			return o;
		} finally {
			Thread.currentThread().setContextClassLoader(cl);
		}
	}
	
	public static <O> O load(Class<?> requester, String relativeFxmlPath, ResourceBundle resourceBundle, BuilderFactory builderFactory, FXMLLoaderProcessor postprocessor) throws IOException {
		URL url = requester.getResource(relativeFxmlPath);
		ClassLoader loader = requester.getClassLoader();
		return load(loader, url, resourceBundle, builderFactory, postprocessor);
	}
	
	public static <O> O load(Bundle bundle, String bundleRelativeFxmlPath, ResourceBundle resourceBundle, BuilderFactory builderFactory, FXMLLoaderProcessor postprocessor) throws IOException {
		URL url = bundle.getResource(bundleRelativeFxmlPath);
		ClassLoader loader = bundle.adapt(BundleWiring.class).getClassLoader();
		return load(loader, url, resourceBundle, builderFactory, postprocessor);
	}
	
	@SuppressWarnings("unchecked")
	public static <O> O load(ClassLoader classloader, URL url, ResourceBundle resourceBundle, BuilderFactory builderFactory, FXMLLoaderProcessor postprocessor) throws IOException {
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		InputStream in = null;
		
		try {
			Thread.currentThread().setContextClassLoader(classloader);
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(url);
			loader.setBuilderFactory(new JavaFXBuilderFactory());
			
			// If we are on 2.0.x we need to use another constructor
			if( System.getProperty("javafx.version") != null && System.getProperty("javafx.version").startsWith("2.0") ) {
				try {
					Constructor<JavaFXBuilderFactory> c = JavaFXBuilderFactory.class.getConstructor(boolean.class);
					loader.setBuilderFactory(c.newInstance(false));
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			in = url.openStream();
			O value = (O) loader.load(in);
			in.close();
			
			postprocessor.postProcess(loader);
			
			return value;
		} finally {
			Thread.currentThread().setContextClassLoader(cl);
			if( in != null ) {
				in.close();
			}
		}
	}
	
	public interface FXMLLoaderProcessor {
		public void postProcess(FXMLLoader loader);
	}
}
