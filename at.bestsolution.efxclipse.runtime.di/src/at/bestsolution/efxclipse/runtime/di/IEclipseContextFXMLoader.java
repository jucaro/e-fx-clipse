package at.bestsolution.efxclipse.runtime.di;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

@SuppressWarnings("restriction")
public class IEclipseContextFXMLoader {
	public static <N> N loadFXML(IEclipseContext context, URL url) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(url);
		loader.setBuilderFactory(new JavaFXBuilderFactory());
		InputStream in = url.openStream();
		N value = (N) loader.load(in);
		in.close();
		
		if( loader.getController() != null ) {
			ContextInjectionFactory.inject(loader.getController(), context);	
		}
		
		injectLoaders(loader, context);
		
		return value;
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
