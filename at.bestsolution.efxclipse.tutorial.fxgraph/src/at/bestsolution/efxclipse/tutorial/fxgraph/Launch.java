package at.bestsolution.efxclipse.tutorial.fxgraph;

import java.lang.reflect.Constructor;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launch extends Application {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Launch.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader l = new FXMLLoader();
		l.setBuilderFactory(new JavaFXBuilderFactory());
		
		// If we are on 2.0.x we need to use another constructor
		if( System.getProperty("javafx.version") != null && System.getProperty("javafx.version").startsWith("2.0") ) {
			try {
				Constructor<JavaFXBuilderFactory> c = JavaFXBuilderFactory.class.getConstructor(boolean.class);
				l.setBuilderFactory(c.newInstance(false));
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		l.setResources(ResourceBundle.getBundle("at.bestsolution.efxclipse.tutorial.fxgraph.messages"));
		
		Parent p = (Parent) l.load(Launch.class.getResourceAsStream("HelloWorld.fxml"));
//		Parent p = FXMLLoader.load(Launch.class.getResource("HelloWorld.fxml"), ResourceBundle.getBundle("at.bestsolution.efxclipse.tutorial.fxgraph.messages"));
		Scene s = new Scene(p);
		primaryStage.setScene(s);
		primaryStage.show();
	
	}

}
