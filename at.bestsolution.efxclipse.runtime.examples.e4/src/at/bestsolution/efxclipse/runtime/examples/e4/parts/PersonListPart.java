package at.bestsolution.efxclipse.runtime.examples.e4.parts;

import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

import javax.inject.Inject;

public class PersonListPart {
	@Inject
	public PersonListPart(BorderPane parent) {
		ListView<String> view = new ListView<String>();
		view.setId("detail-list");
		view.getItems().addAll("Test 1", "Test 2","Test 1", "Test 2","Test 1", "Test 2","Test 1", "Test 2");
		parent.setCenter(view);
	}
}
