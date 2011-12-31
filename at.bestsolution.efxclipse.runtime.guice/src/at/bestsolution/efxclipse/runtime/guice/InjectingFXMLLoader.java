package at.bestsolution.efxclipse.runtime.guice;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;

import com.google.inject.Injector;


public class InjectingFXMLLoader {
	public static <N> N loadFXML(Injector injector, URL url) throws IOException {
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
		
		InputStream in = url.openStream();
		N value = (N) loader.load(in);
		in.close();
		
		if( loader.getController() != null ) {
			injector.injectMembers(loader.getController());
		}
		
		injectLoaders(loader, injector);
		
		return value;
	}
	
	private static void injectLoaders(FXMLLoader parentLoader, Injector injector) {
		for( FXMLLoader l : parentLoader.getIncludes() ) {
			if( l.getController() != null ) {
				injector.injectMembers(l.getController());
				injectLoaders(l, injector);
			}
		}
	}
}
