package at.bestsolution.efxclipse.runtime.workbench.renderers;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;

@SuppressWarnings("restriction")
public class ToolBarRenderer extends JFXRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		// Since we use a JavaFX ToolBar for the TrimBar, each e4 toolbar is
		// rendered as JavaFX HBox
		HBox toolBar = new HBox();
		return toolBar;
	}

	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		super.processContents(container);

		HBox toolBar = (HBox) container.getWidget();
		for (MUIElement element : container.getChildren()) {
			toolBar.getChildren().add((Button) element.getWidget());
		}
	}
}
