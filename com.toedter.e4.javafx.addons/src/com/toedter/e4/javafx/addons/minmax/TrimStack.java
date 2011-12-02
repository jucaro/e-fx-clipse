/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 ******************************************************************************/

package com.toedter.e4.javafx.addons.minmax;

import java.awt.Composite;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.event.ActionEvent;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.Separator;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.SideValue;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack;
import org.eclipse.e4.ui.model.application.ui.advanced.MPlaceholder;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MStackElement;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MToolControl;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.common.util.URI;
import org.osgi.service.event.EventHandler;

import com.toedter.e4.javafx.control.CTabPane;

/**
 * Class for representing window trim containing minimized views and shared
 * areas
 */
@SuppressWarnings("restriction")
public class TrimStack {

	/**
	 * Contribution URI for this class
	 */
	public static String CONTRIBUTION_URI = "platform:/plugin/com.toedter.e4.javafx.addons/com.toedter.e4.javafx.addons.minmax.TrimStack"; //$NON-NLS-1$

	private static final String LAYOUT_ICON_URI = "platform:/plugin/com.toedter.e4.javafx.addons/icons/full/obj16/layout_co.gif"; //$NON-NLS-1$

	private static final String RESTORE_ICON_URI = "platform:/plugin/com.toedter.e4.javafx.addons/icons/full/etool16/fastview_restore.gif"; //$NON-NLS-1$

	private static final String STATE_XSIZE = "XSize"; //$NON-NLS-1$

	private static final String STATE_YSIZE = "YSize"; //$NON-NLS-1$

	private Image layoutImage;

	private Image restoreImage;

	private VBox trimStackTB;

	/**
	 * The context menu for this trim stack's items.
	 */
	private Menu trimStackMenu;

	/**
	 * The tool item that the cursor is currently hovering over.
	 */
	private Button selectedToolItem;
	private boolean isShowing = false;
	private MUIElement minimizedElement;
	private Pane hostPane;

	/**
	 * A map of created images from a part's icon URI path.
	 */
	private final Map<String, Image> imageMap = new HashMap<String, Image>();

	@Inject
	EModelService modelService;

	@Inject
	EPartService partService;

	@Inject
	MWindow window;

	@Inject
	MToolControl toolControl;

	@Inject
	protected IEventBroker eventBroker;

	private final EventHandler closeHandler = new EventHandler() {
		@Override
		public void handleEvent(org.osgi.service.event.Event event) {
			if (!isShowing) {
				return;
			}

			// The only time we don't close is if I've selected my tab.
			MUIElement changedElement = (MUIElement) event.getProperty(UIEvents.EventTags.ELEMENT);

			// Perspective changed, close the visible stacks
			if (changedElement instanceof MPerspectiveStack) {
				showStack(false);
				return;
			}

			if (changedElement == getLeafPart(minimizedElement)) {
				// fixToolItemSelection((MPart) changedElement);
				return;
			}

			showStack(false);
		}
	};

	private boolean isEditorStack() {
		return minimizedElement instanceof MPlaceholder;
	}

	private MPart getLeafPart(MUIElement element) {
		if (element instanceof MPlaceholder) {
			return getLeafPart(((MPlaceholder) element).getRef());
		}

		if (element instanceof MElementContainer<?>) {
			return getLeafPart(((MElementContainer<?>) element).getSelectedElement());
		}

		if (element instanceof MPart) {
			return (MPart) element;
		}

		return null;
	}

	private final EventHandler openHandler = new EventHandler() {
		@Override
		public void handleEvent(org.osgi.service.event.Event event) {
			if (isShowing) {
				return;
			}

			MUIElement changedElement = (MUIElement) event.getProperty(UIEvents.EventTags.ELEMENT);

			// Open if shared area
			if (getLeafPart(minimizedElement) == changedElement) {
				showStack(true);
				return;
			}

			MUIElement selectedElement = null;

			if (minimizedElement instanceof MPlaceholder) {
				selectedElement = ((MPlaceholder) minimizedElement).getRef();
			} else if (minimizedElement instanceof MPartStack) {
				selectedElement = ((MPartStack) minimizedElement).getSelectedElement();
			}

			if (selectedElement == null) {
				return;
			}

			if (selectedElement instanceof MPlaceholder) {
				selectedElement = ((MPlaceholder) selectedElement).getRef();
			}

			if (changedElement != selectedElement) {
				return;
			}

			showStack(true);
		}
	};

	private final EventHandler toBeRenderedHandler = new EventHandler() {
		@Override
		public void handleEvent(org.osgi.service.event.Event event) {
			if (minimizedElement == null || trimStackTB == null) {
				return;
			}

			MUIElement changedElement = (MUIElement) event.getProperty(UIEvents.EventTags.ELEMENT);

			// if our stack is going away, so should we
			if (changedElement == minimizedElement && !minimizedElement.isToBeRendered()) {
				restoreStack();
				return;
			}

			// if one of the kids changes state, re-scrape the CTF
			MUIElement parentElement = changedElement.getParent();
			if (parentElement == minimizedElement) {
				updateTrimStackItems();
			}
		}
	};

	private final EventHandler childrenHandler = new EventHandler() {
		@Override
		public void handleEvent(org.osgi.service.event.Event event) {
			if (minimizedElement == null || trimStackTB == null) {
				return;
			}

			Object changedObj = event.getProperty(UIEvents.EventTags.ELEMENT);

			// if a child has been added or removed, re-scape the CTF
			updateTrimStackItems();
		}
	};

	private final EventHandler widgetHandler = new EventHandler() {
		@Override
		public void handleEvent(org.osgi.service.event.Event event) {
			Object changedObj = event.getProperty(UIEvents.EventTags.ELEMENT);
			if (changedObj != minimizedElement) {
				return;
			}

			if (minimizedElement.getWidget() != null) {
				updateTrimStackItems();
			}
		}
	};

	private MTrimBar bar;

	private int fixedSides;

	@PostConstruct
	void addListeners() {
		eventBroker.subscribe(UIEvents.buildTopic(UIEvents.ElementContainer.TOPIC, UIEvents.ElementContainer.CHILDREN),
				childrenHandler);
		eventBroker.subscribe(UIEvents.buildTopic(UIEvents.UIElement.TOPIC, UIEvents.UIElement.TOBERENDERED),
				toBeRenderedHandler);
		eventBroker.subscribe(UIEvents.buildTopic(UIEvents.UIElement.TOPIC, UIEvents.UIElement.WIDGET), widgetHandler);
		eventBroker.subscribe(UIEvents.UILifeCycle.BRINGTOTOP, openHandler);
		eventBroker.subscribe(UIEvents.UILifeCycle.ACTIVATE, closeHandler);
	}

	@PreDestroy
	void removeListeners() {
		eventBroker.unsubscribe(toBeRenderedHandler);
		eventBroker.unsubscribe(childrenHandler);
		eventBroker.unsubscribe(widgetHandler);
		eventBroker.unsubscribe(openHandler);
		eventBroker.unsubscribe(closeHandler);
	}

	@PostConstruct
	void createWidget(MToolControl parent, MToolControl me) {
		System.out.println("TrimStack.createWidget(): p: " + parent);
		if (minimizedElement == null) {
			minimizedElement = findElement();
		}

		MUIElement meParent = me.getParent();
		Orientation orientation = Orientation.HORIZONTAL;
		if (meParent instanceof MTrimBar) {
			bar = (MTrimBar) meParent;
			if (bar.getSide() == SideValue.RIGHT || bar.getSide() == SideValue.LEFT) {
				orientation = Orientation.VERTICAL;
			}
		}

		System.out.println("TrimStack.createWidget(): " + orientation);
		// if (orientation == Orientation.VERTICAL) {
		// trimStackTB = new VBox();
		// } else {
		// trimStackTB = new HBox();
		// }
		// ((Pane) parent.getWidget()).getChildren().add(trimStackTB);
		trimStackTB = (VBox) me.getWidget();
		System.out.println("trimStackTB: " + trimStackTB);

		if (minimizedElement instanceof MPartStack) {
			createPopupMenu();
		}

		Separator sep = new Separator();
		trimStackTB.getChildren().add(sep);

		Button restoreBtn = new Button();
		restoreBtn.setTooltip(new Tooltip(Messages.TrimStack_RestoreText));
		restoreBtn.setGraphic(new ImageView(getRestoreImage()));
		restoreBtn.setOnAction(new javafx.event.EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("Restored: " + minimizedElement);
				minimizedElement.getTags().remove(MinMaxAddon.MINIMIZED);
			}
		});
		trimStackTB.getChildren().add(restoreBtn);

		updateTrimStackItems();
	}

	@PreDestroy
	void destroy() {
	}

	private MUIElement findElement() {
		MUIElement result;
		List<MPerspectiveStack> ps = modelService.findElements(window, null, MPerspectiveStack.class, null);
		if (ps.size() == 0) {
			String toolControlId = toolControl.getElementId();
			int index = toolControlId.indexOf('(');
			String stackId = toolControlId.substring(0, index);
			result = modelService.find(stackId, window);
		} else {
			String toolControlId = toolControl.getElementId();
			int index = toolControlId.indexOf('(');
			String stackId = toolControlId.substring(0, index);
			String perspId = toolControlId.substring(index + 1, toolControlId.length() - 1);
			MPerspective persp = (MPerspective) modelService.find(perspId, ps.get(0));
			if (persp != null) {
				result = modelService.find(stackId, persp);
			} else {
				result = modelService.find(stackId, window);
			}
		}

		return result;
	}

	private String getLabel(MUILabel label) {
		String string = label.getLabel();
		return string == null ? "" : string; //$NON-NLS-1$
	}

	private Image getImage(MUILabel element) {
		String iconURI = element.getIconURI();
		if (iconURI != null && iconURI.length() > 0) {
			Image image = imageMap.get(iconURI);
			if (image == null) {
				URL url = Util.convertToOSGiURL(URI.createURI(iconURI));
				image = new Image(url.toExternalForm());
				imageMap.put(iconURI, image);
			}
			return image;
		}
		return null;
	}

	private MPart getPart(MStackElement element) {
		if (element instanceof MPart) {
			return (MPart) element;
		}
		return (MPart) ((MPlaceholder) element).getRef();
	}

	private void updateTrimStackItems() {
		System.out.println("TrimStack.updateTrimStackItems()");
		// Prevent exceptions on shutdown
		if (trimStackTB == null) {
			return;
		}

		if (isEditorStack()) {
			if (trimStackTB.getChildren().size() == 1) {
				MUIElement data = getLeafPart(minimizedElement);
				if (data != null) {
					Button ti = new Button();
					trimStackTB.getChildren().add(ti);
					ti.setTooltip(new Tooltip(Messages.TrimStack_SharedAreaTooltip));
					ti.setGraphic(new ImageView(getLayoutImage()));
					// ti.setData(data);
					// ti.addSelectionListener(toolItemSelectionListener);
				}
			}
		} else if (minimizedElement instanceof MPartStack) {
			MPartStack theStack = (MPartStack) minimizedElement;
			if (theStack.getWidget() == null) {
				return;
			}

			// check to see if this stack has any valid elements
			boolean check = false;
			for (MStackElement stackElement : theStack.getChildren()) {
				if (stackElement.isToBeRendered()) {
					check = true;
					break;
				}
			}

			if (!check) {
				// doesn't have any children that's showing, place it back in
				// the presentation
				restoreStack();
				return;
			}

			for (MStackElement stackElement : theStack.getChildren()) {
				if (!stackElement.isToBeRendered()) {
					continue;
				}

				MPart part = getPart(stackElement);
				Button newItem = new Button();
				trimStackTB.getChildren().add(newItem);
				newItem.setGraphic(new ImageView(getImage(part)));
				newItem.setTooltip(new Tooltip(getLabel(part)));
				// newItem.setData(part);
				// newItem.addSelectionListener(toolItemSelectionListener);
			}
		}

	}

	void restoreStack() {
		System.out.println("restore: " + minimizedElement);
		minimizedElement.setVisible(true);
		minimizedElement.getTags().remove(MinMaxAddon.MINIMIZED);
		toolControl.setToBeRendered(false);

		hostPane = null;
	}

	/**
	 * Create the popup menu that will appear when a minimized part has been
	 * selected by the cursor.
	 */
	private void createPopupMenu() {
		// trimStackMenu = new Menu(trimStackTB);
		// trimStackTB.setMenu(trimStackMenu);
		//
		// MenuItem closeItem = new MenuItem(trimStackMenu, SWT.NONE);
		// closeItem.setText(Messages.TrimStack_CloseText);
		// closeItem.addListener(SWT.Selection, new Listener() {
		// public void handleEvent(Event event) {
		// partService.hidePart((MPart) selectedToolItem.getData());
		// }
		// });
	}

	protected void showStack(boolean show) {
		System.out.println("TrimStack.showStack()");
		CTabPane ctf = (CTabPane) minimizedElement.getWidget();
		Composite clientArea = getShellClientComposite();
		if (clientArea == null) {
			return;
		}

		if (show && !isShowing) {
			hostPane = getHostPane();
			hostPane.getChildren().add(ctf);

			// clientArea.addControlListener(caResizeListener);

			// Set the initial location
			// setPaneLocation(hostPane);

			// hostPane.layout(true);
			// hostPane.moveAbove(null);
			// hostPane.setVisible(true);

			isShowing = true;
		} else if (!show && isShowing) {
			// Check to ensure that the client area is non-null since the
			// trimstack may be currently hosted in the limbo shell
			if (clientArea != null) {
				// clientArea.removeControlListener(caResizeListener);
			}

			if (hostPane != null && hostPane.isVisible()) {
				hostPane.setVisible(false);

				// capture the current shell's bounds
				toolControl.getPersistedState().put(STATE_XSIZE, Double.toString(hostPane.getWidth()));
				toolControl.getPersistedState().put(STATE_YSIZE, Double.toString(hostPane.getHeight()));
			}

			// fixToolItemSelection(null);
			isShowing = false;
		}
	}

	Composite getShellClientComposite() {
		if (trimStackTB == null) {
			return null;
		}
		return null;
	}

	private void setPaneLocation(Composite someShell) {
	}

	private Pane getHostPane() {
		if (hostPane != null) {
			return hostPane;
		}

		// Create one
		hostPane = new BorderPane();
		// hostPane.setData(ShellActivationListener.DIALOG_IGNORE_KEY,
		// Boolean.TRUE);

		return hostPane;
	}

	private Image getLayoutImage() {
		if (layoutImage == null) {
			URL url = Util.convertToOSGiURL(URI.createURI(LAYOUT_ICON_URI));
			layoutImage = new Image(url.toExternalForm());
		}
		return layoutImage;
	}

	private Image getRestoreImage() {
		if (restoreImage == null) {
			URL url = Util.convertToOSGiURL(URI.createURI(RESTORE_ICON_URI));
			restoreImage = new Image(url.toExternalForm());
		}
		return restoreImage;
	}

	private boolean isFixed(int swtSide) {
		return (fixedSides & swtSide) != 0;
	}
}
