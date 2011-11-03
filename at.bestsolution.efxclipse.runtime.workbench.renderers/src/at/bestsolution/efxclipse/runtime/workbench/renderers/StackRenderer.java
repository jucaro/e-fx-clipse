package at.bestsolution.efxclipse.runtime.workbench.renderers;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.IPresentationEngine;

@SuppressWarnings("restriction")
public class StackRenderer extends JFXRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		TabPane tabPane = new TabPane();
		return tabPane;
	}

	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		TabPane parentPane = (TabPane) container.getWidget();

		for (MUIElement e : container.getChildren()) {
			final MUIElement tmp = e;
			MUILabel mLabel = (MUILabel) e;
			final Tab tab = new Tab(mLabel.getLocalizedLabel());
			tab.setClosable(false); // TODO We need to read this from tags
			tab.setOnSelectionChanged(new EventHandler<Event>() {

				@Override
				public void handle(Event event) {
					IPresentationEngine renderer = (IPresentationEngine) context.get(IPresentationEngine.class
							.getName());
					Node node = (Node) renderer.createGui(tmp);
					tab.setContent(node);
				}
			});
			parentPane.getTabs().add(tab);
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
