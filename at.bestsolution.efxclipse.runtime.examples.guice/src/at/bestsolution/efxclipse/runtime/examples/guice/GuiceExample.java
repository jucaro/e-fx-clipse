package at.bestsolution.efxclipse.runtime.examples.guice;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import at.bestsolution.efxclipse.runtime.guice.InjectingFXMLLoader;

import com.google.inject.Guice;

public class GuiceExample extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent node = InjectingFXMLLoader.loadFXML(Guice.createInjector(new ExampleModule()), getClass().getResource("guice.fxml"));
		Scene scene = new Scene(node);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
