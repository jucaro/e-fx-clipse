package at.bestsolution.efxclipse.runtime.example.photoedit.ui;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import javax.annotation.PostConstruct;

public class AlbumContentView {
	
	@PostConstruct
	void init(BorderPane pane) {
		pane.setCenter(new Label("Album Content View"));
	}
	
}
