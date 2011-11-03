package at.bestsolution.efxclipse.runtime.workbench.renderers;

import javafx.scene.Node;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.workbench.IPresentationEngine;

@SuppressWarnings("restriction")
public class TrimBarRenderer extends JFXRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		ToolBar pane = new ToolBar();
		return pane;
	}

	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		IPresentationEngine renderer = (IPresentationEngine) context.get(IPresentationEngine.class.getName());
		ToolBar pane = (ToolBar) container.getWidget();

		for (MUIElement e : container.getChildren()) {
			Node n = (Node) renderer.createGui(e);
			if (n != null) {
				pane.getItems().add(new Separator());
				pane.getItems().add(n);
			}
		}
	}
}
