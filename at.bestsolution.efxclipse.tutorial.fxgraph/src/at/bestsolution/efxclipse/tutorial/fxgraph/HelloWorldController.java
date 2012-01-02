package at.bestsolution.efxclipse.tutorial.fxgraph;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloWorldController {
	@FXML
	public Button myButton;
	
	@FXML
	public void clicked(ActionEvent event) {
		System.out.println("Button clicked");
	}
}
