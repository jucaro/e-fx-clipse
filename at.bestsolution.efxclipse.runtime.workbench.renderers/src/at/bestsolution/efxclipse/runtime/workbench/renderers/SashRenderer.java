package at.bestsolution.efxclipse.runtime.workbench.renderers;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.SplitPane;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;

@SuppressWarnings("restriction")
public class SashRenderer extends JFXRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		if (!(element instanceof MPartSashContainer)) {
			return null;
		}

		SplitPane splitPane = new SplitPane();
		Orientation orientation;
		if (((MPartSashContainer) (MUIElement) element).isHorizontal()) {
			orientation = Orientation.HORIZONTAL;
		} else {
			orientation = Orientation.VERTICAL;
		}
		splitPane.setOrientation(orientation);
		return splitPane;
	}

	@Override
	public void processContents(final MElementContainer<MUIElement> container) {
		System.out.println("SashRenderer.processContents()");
		if (container.getChildren().size() == 2) {
			super.processContents(container);
			SplitPane splitPane = (SplitPane) container.getWidget();
			splitPane.getItems().add((Node) container.getChildren().get(0).getWidget());
			splitPane.getItems().add((Node) container.getChildren().get(1).getWidget());

			// TODO This is not a good position to hook the controller logic
			// but hookControllerLogic() is invoked before processContents()...
			String dividerPos = container.getContainerData();
			System.out.println("divider pos: " + dividerPos);
			if (dividerPos != null) {
				splitPane.setDividerPositions(Float.parseFloat(dividerPos));
			}

			splitPane.getDividers().get(0).positionProperty().addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
					container.setContainerData(newValue.toString());
				}
			});

		} else {
			System.err.println("A sash has to have 2 children");
		}
	}

	@Override
	public void hookControllerLogic(MUIElement me) {
		if (me instanceof MPartSashContainer) {
			// TODO hook more?
		}
	}
}
