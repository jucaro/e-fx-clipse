package at.bestsolution.efxclipse.runtime.workbench.renderers;

import java.net.URL;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.inject.Inject;

import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.ItemType;
import org.eclipse.e4.ui.model.application.ui.menu.MDirectToolItem;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledItem;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledToolItem;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("restriction")
public class ToolItemRenderer extends ItemRenderer {
	@Inject
	IContributionFactory contributionFactory;

	static class RadioButton extends Button {

	}

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		MToolItem item = (MToolItem) element;

		ButtonBase button;

		if (item.getType() == ItemType.RADIO) {
			button = new RadioButton();
		} else {
			button = new Button();
		}

		if (item.getIconURI() != null) {
			URL url = Util.convertToOSGiURL(URI.createURI(item.getIconURI()));
			Image img = new Image(url.toExternalForm());
			button.setGraphic(new ImageView(img));
		}
		if (item.getTooltip() != null) {
			button.setTooltip(new Tooltip(item.getLocalizedTooltip()));
		}

		return button;
	}

	@Override
	public void hookControllerLogic(MUIElement me) {
		final EventHandler<ActionEvent> h;
		final ButtonBase button = (ButtonBase) me.getWidget();

		if (me instanceof MDirectToolItem) {
			final MDirectToolItem item = (MDirectToolItem) me;
			item.setObject(contributionFactory.create(item.getContributionURI(), getContext(item)));
			h = createEventHandler(item);
		} else if (me instanceof MHandledToolItem) {
			final MHandledItem item = (MHandledToolItem) me;
			h = createParametrizedCommandEventHandler(item);
		} else {
			h = null;
		}

		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (button instanceof RadioButton) {
					selectButton(button);
				}

				if (h != null) {
					h.handle(event);
				}
			}
		});
	}

	private void selectButton(ButtonBase button) {
		for (Node n : button.getParent().getChildrenUnmodifiable()) {
			if (n instanceof RadioButton) {
				n.getStyleClass().remove("efxSelectedRadioToolButton");	
			}
		}
		button.getStyleClass().add("efxSelectedRadioToolButton");
	}
}
