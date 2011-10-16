package at.bestsolution.efxclipse.runtime.examples.e4.parts;

import java.io.IOException;

import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import at.bestsolution.efxclipse.runtime.di.FXMLBuilder;
import at.bestsolution.efxclipse.runtime.di.FXMLLoader;
import at.bestsolution.efxclipse.runtime.di.FXMLLoaderFactory;

public class PersonDetailPart {
	
	@Inject
	public PersonDetailPart(BorderPane parent) {
//		try {
//			Node n = FXMLLoader.load(PersonDetailPart.class.getResource("personform.fxml"), null, new JavaFXBuilderFactory());
//			parent.setCenter(n);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	@PostConstruct
	void init(BorderPane parent, @FXMLLoader FXMLLoaderFactory factory) {
		try {
			FXMLBuilder<Node> builder = factory.loadRequestorRelative("personform.fxml");
			parent.setCenter(builder.load());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
