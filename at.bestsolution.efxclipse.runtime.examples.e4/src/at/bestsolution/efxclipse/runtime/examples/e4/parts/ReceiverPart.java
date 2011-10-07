package at.bestsolution.efxclipse.runtime.examples.e4.parts;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import javax.inject.Inject;

import org.eclipse.e4.core.di.extensions.EventTopic;

@SuppressWarnings("restriction")
public class ReceiverPart {
	private Label l;
	
	@Inject
	public ReceiverPart(Pane pane) {
		l = new Label();
		pane.getChildren().add(l);
	}
	
	@Inject
	void eventBla(@EventTopic("test/bla") String value) {
		if( value != null && ! value.isEmpty() ) {
			l.setText("Received Event @" + System.currentTimeMillis() + ":" + value);
		}
	}
}
