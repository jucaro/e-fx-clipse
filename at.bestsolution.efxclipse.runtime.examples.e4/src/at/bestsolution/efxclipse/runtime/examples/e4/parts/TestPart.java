package at.bestsolution.efxclipse.runtime.examples.e4.parts;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;

@SuppressWarnings("restriction")
public class TestPart {
	@Inject
	public TestPart(Pane pane, MPart part) {
		Label l = new Label(part.getLabel());
		pane.getChildren().add(l);
	}
}
