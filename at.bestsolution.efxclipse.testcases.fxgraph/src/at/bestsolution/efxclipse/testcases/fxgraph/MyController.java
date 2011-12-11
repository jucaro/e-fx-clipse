package at.bestsolution.efxclipse.testcases.fxgraph;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class MyController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.err.println("The controller is created!!!");
	}

	@FXML
	public void clicked(ActionEvent event) {
		
	}
	
	@FXML
	public void clicked2(ActionEvent event) {
		
	}
	
	@FXML
	public void clicked(String event) {
		
	}
	
	@FXML
	public void clicked() {
		
	}
}
