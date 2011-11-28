package at.bestsolution.efxclipse.runtime.workbench.renderers;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.SplitPane;

import javax.inject.Inject;

import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

@SuppressWarnings("restriction")
public class SashRenderer extends JFXRenderer {

	private EventHandler sashOrientationHandler;
	private EventHandler sashWeightHandler;

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		if (!(element instanceof MPartSashContainer)) {
			return null;
		}
		MPartSashContainer partSashContainer = (MPartSashContainer) element;
		SplitPane splitPane = new SplitPane();
		Orientation orientation;
		if (partSashContainer.isHorizontal()) {
			orientation = Orientation.HORIZONTAL;
		} else {
			orientation = Orientation.VERTICAL;
		}
		splitPane.setOrientation(orientation);

		return splitPane;
	}

	@Override
	public void processContents(final MElementContainer<MUIElement> container) {
		if (container.getChildren().size() == 2) {
			super.processContents(container);
			SplitPane splitPane = (SplitPane) container.getWidget();
			splitPane.getItems().add((Node) container.getChildren().get(0).getWidget());
			splitPane.getItems().add((Node) container.getChildren().get(1).getWidget());

			// TODO This is not a good position to hook the controller logic
			// but hookControllerLogic() is invoked before processContents()...
			String dividerPos = container.getContainerData();
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

	@Inject
	void postConstruct(IEventBroker eventBroker) {
		sashOrientationHandler = new EventHandler() {
			@Override
			public void handleEvent(Event event) {
				// Ensure that this event is for a MPartSashContainer
				MUIElement element = (MUIElement) event.getProperty(UIEvents.EventTags.ELEMENT);
				if (element.getRenderer() != SashRenderer.this) {
					return;
				}
				Orientation orientation;
				if (((MPartSashContainer) (MUIElement) element).isHorizontal()) {
					orientation = Orientation.HORIZONTAL;
				} else {
					orientation = Orientation.VERTICAL;
				}
				((SplitPane) element.getWidget()).setOrientation(orientation);
			}
		};

		eventBroker.subscribe(UIEvents.buildTopic(UIEvents.GenericTile.TOPIC, UIEvents.GenericTile.HORIZONTAL),
				sashOrientationHandler);

		sashWeightHandler = new EventHandler() {
			@Override
			public void handleEvent(Event event) {
				// Ensure that this event is for a MPartSashContainer
				MUIElement element = (MUIElement) event.getProperty(UIEvents.EventTags.ELEMENT);
				if (element.getRenderer() != SashRenderer.this) {
					return;
				}

				String dividerPos = element.getContainerData();
				SplitPane splitPane = ((SplitPane) element.getWidget());
				if (dividerPos != null && dividerPos != ((Double) splitPane.getDividerPositions()[0]).toString()) {
					splitPane.setDividerPositions(Float.parseFloat(dividerPos));
				}
			}
		};

		eventBroker.subscribe(UIEvents.buildTopic(UIEvents.UIElement.TOPIC, UIEvents.UIElement.CONTAINERDATA),
				sashWeightHandler);
	}
}
