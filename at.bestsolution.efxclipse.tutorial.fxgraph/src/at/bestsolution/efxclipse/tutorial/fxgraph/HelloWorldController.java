package at.bestsolution.efxclipse.tutorial.fxgraph;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class HelloWorldController {
	
	@FXML
	public void clicked(ActionEvent event) {
		System.out.println("Button clicked");
	}
}
