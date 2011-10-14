package at.bestsolution.efxclipse.runtime.examples.e4.parts;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

import javax.inject.Inject;

public class PersonDetailPart {
	
	@Inject
	public PersonDetailPart(BorderPane parent) {
		try {
			Node n = FXMLLoader.load(PersonDetailPart.class.getResource("personform.fxml"), null, new JavaFXBuilderFactory());
			parent.setCenter(n);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
