package at.bestsolution.efxclipse.runtime.examples.e4.parts;

import java.io.IOException;

import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

import javax.annotation.PostConstruct;

import at.bestsolution.efxclipse.runtime.di.FXMLBuilder;
import at.bestsolution.efxclipse.runtime.di.FXMLLoader;
import at.bestsolution.efxclipse.runtime.di.FXMLLoaderFactory;

public class PersonDetailPart {

	@PostConstruct
	void init(BorderPane parent, @FXMLLoader FXMLLoaderFactory factory) {
		try {
			FXMLBuilder<Node> builder = factory.loadRequestorRelative("personform.fxml");
			parent.setCenter(builder.load());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
