package at.bestsolution.efxclipse.runtime.examples.guice.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import at.bestsolution.efxclipse.runtime.examples.guice.service.ILoginService;

import com.google.inject.Inject;

public class LoginController {
	@Inject
	ILoginService loginService;
	
	@FXML
	TextField username;
	
	@FXML
	PasswordField password;
	
	@FXML
	Label message;
	
	@FXML
	public void login(ActionEvent event) {
		try {
			long id = loginService.login(username.getText(), password.getText());
			message.setStyle("-fx-text-fill: green;");
			message.setText("Logged in as User: " + id);
		} catch (IllegalArgumentException e) {
			message.setStyle("-fx-text-fill: red;");
			message.setText(e.getMessage());
		}
	}
}