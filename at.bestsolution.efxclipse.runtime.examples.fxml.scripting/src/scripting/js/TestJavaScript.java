package scripting.js;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestJavaScript extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent p = FXMLLoader.load(getClass().getResource("TestJavaScript.fxml"));
			primaryStage.setScene(new Scene(p));
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
