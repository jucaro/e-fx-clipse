package at.bestsolution.efxclipse.runtime.guice;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;

import com.google.inject.Injector;


public class InjectingFXMLLoader {
	public static <N> N loadFXML(Injector injector, URL url) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(url);
		loader.setBuilderFactory(new JavaFXBuilderFactory(false));
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
