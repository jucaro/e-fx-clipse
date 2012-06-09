package at.bestsolution.efxclipse.runtime.guice;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.util.Callback;

import com.google.inject.Injector;


public class InjectingFXMLLoader {
	public static <N> N loadFXML(final Injector injector, URL url) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(url);
		loader.setBuilderFactory(new JavaFXBuilderFactory());
		loader.setControllerFactory(new Callback<Class<?>, Object>() {
			
			@Override
			public Object call(Class<?> param) {
				return injector.getInstance(param);
			}
		});
		
		InputStream in = url.openStream();
		@SuppressWarnings("unchecked")
		N value = (N) loader.load(in);
		in.close();
				
		return value;
	}
}
