package at.bestsolution.efxclipse.runtime.workbench.renderers;

import java.net.URL;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.workbench.IPresentationEngine;
import org.eclipse.emf.common.util.URI;

import com.toedter.e4.javafx.control.CTabPane;

@SuppressWarnings("restriction")
public class StackRenderer extends JFXRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		CTabPane tabPane = new CTabPane();
		return tabPane;
	}

	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		TabPane parentPane = (TabPane) container.getWidget();

		for (MUIElement element : container.getChildren()) {
			final MUIElement tmp = element;
			MUILabel mLabel = (MUILabel) element;
			final Tab tab = new Tab(mLabel.getLocalizedLabel());
			tab.setClosable(false); // TODO We need to read this from tags
			if (mLabel.getIconURI() != null) {
				URL url = Util.convertToOSGiURL(URI.createURI(mLabel.getIconURI()));
				Image img = new Image(url.toExternalForm());
				tab.setGraphic(new ImageView(img));
			}

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
}
