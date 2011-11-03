package at.bestsolution.efxclipse.runtime.workbench.renderers;

import javafx.scene.Node;
import javafx.scene.control.SplitPane;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;

@SuppressWarnings("restriction")
public class SashRenderer extends JFXRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		if (!(element instanceof MPartSashContainer)) {
			return null;
		}

		SplitPane split = new SplitPane();
		return split;
	}

	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		if (container.getChildren().size() == 2) {
			super.processContents(container);

			SplitPane splitPane = (SplitPane) container.getWidget();
			splitPane.getItems().add((Node) container.getChildren().get(0).getWidget());
			splitPane.getItems().add((Node) container.getChildren().get(1).getWidget());
			// TODO hack for contacts demo
			splitPane.setDividerPositions(0.235f);
		} else {
			System.err.println("A sash has to have 2 children");
		}
	}

	@Override
	protected Object getParentWidget(MUIElement element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void disposeWidget(MUIElement part) {
		// TODO Auto-generated method stub

	}

	@Override
	public void hookControllerLogic(MUIElement me) {
		// TODO Auto-generated method stub

	}

	@Override
	public void childRendered(MElementContainer<MUIElement> parentElement, MUIElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	protected Object getImage(MUILabel element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean requiresFocus(MPart element) {
		// TODO Auto-generated method stub
		return false;
	}
}
