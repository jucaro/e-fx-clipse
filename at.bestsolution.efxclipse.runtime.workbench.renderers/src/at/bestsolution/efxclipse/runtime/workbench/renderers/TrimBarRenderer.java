package at.bestsolution.efxclipse.runtime.workbench.renderers;

import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.SideValue;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.workbench.IPresentationEngine;

@SuppressWarnings("restriction")
public class TrimBarRenderer extends JFXRenderer {

	// TODO Hack, try to make this renderer stateless
	private BorderPane borderPane;

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		if (!(element instanceof MTrimBar)) {
			return null;
		}
		final MTrimBar trimModel = (MTrimBar) element;

		ToolBar toolBar = new ToolBar();

		switch (trimModel.getSide().getValue()) {
		case SideValue.TOP_VALUE:
		case SideValue.BOTTOM_VALUE:
			toolBar.setOrientation(Orientation.HORIZONTAL);
			break;
		case SideValue.LEFT_VALUE:
		case SideValue.RIGHT_VALUE:
			toolBar.setOrientation(Orientation.VERTICAL);
			break;
		default:
			return null;
		}

		// needed by MinMax addon
		if (parent != null && parent instanceof BorderPane || parent instanceof Stage) {
			if (parent instanceof BorderPane) {
				borderPane = (BorderPane) parent;
			} else {
				borderPane = (BorderPane) ((Stage) parent).getScene().getRoot();
			}
			switch (trimModel.getSide().getValue()) {
			case SideValue.TOP_VALUE:
				borderPane.setTop(toolBar);
				break;
			case SideValue.BOTTOM_VALUE:
				borderPane.setBottom(toolBar);
				break;
			case SideValue.LEFT_VALUE:
				borderPane.setLeft(toolBar);
				break;
			case SideValue.RIGHT_VALUE:
				borderPane.setRight(toolBar);
				break;
			}
		}
		return toolBar;
	}

	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		IPresentationEngine renderer = (IPresentationEngine) context.get(IPresentationEngine.class.getName());
		ToolBar pane = (ToolBar) container.getWidget();

		boolean isFirst = true;
		for (MUIElement e : container.getChildren()) {
			Node n = (Node) renderer.createGui(e);
			if (n != null) {
				if (!isFirst) {
					pane.getItems().add(new Separator());
				}
				pane.getItems().add(n);
				isFirst = false;
			}
		}
	}

	@Override
	public void disposeWidget(MUIElement part) {
		System.out.println("TrimBarRenderer.disposeWidget()");
		Group limbo = (Group) getContext(part).get("limbo");
		limbo.getChildren().add((Node) part.getWidget());
		borderPane.setLeft(null);
	}

}
