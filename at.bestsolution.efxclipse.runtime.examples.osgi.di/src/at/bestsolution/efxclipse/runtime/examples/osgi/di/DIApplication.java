package at.bestsolution.efxclipse.runtime.examples.osgi.di;

import java.io.IOException;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.equinox.app.IApplicationContext;

import at.bestsolution.efxclipse.runtime.di.FXMLBuilder;
import at.bestsolution.efxclipse.runtime.di.FXMLLoader;
import at.bestsolution.efxclipse.runtime.di.FXMLLoaderFactory;

public class DIApplication {
	@Inject
	@FXMLLoader
	FXMLLoaderFactory loaderFactory;
	
	@PostConstruct
	void run(IApplicationContext applicationContext, javafx.application.Application jfxApplication, Stage primaryStage) {
		FXMLBuilder<BorderPane> loader = loaderFactory.loadRequestorRelative("ExampleGraph.fxml");
		try {
			BorderPane pane = loader.load();
			Scene s = new Scene(pane, 200, 200);
			primaryStage.setScene(s);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
