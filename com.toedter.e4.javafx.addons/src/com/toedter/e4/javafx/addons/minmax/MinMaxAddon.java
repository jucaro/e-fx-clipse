package com.toedter.e4.javafx.addons.minmax;

import java.util.ArrayList;
import java.util.List;

import javafx.stage.Stage;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.SideValue;
import org.eclipse.e4.ui.model.application.ui.advanced.MArea;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPlaceholder;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MToolControl;
import org.eclipse.e4.ui.model.application.ui.menu.impl.MenuFactoryImpl;
import org.eclipse.e4.ui.workbench.IPresentationEngine;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.UIEvents.EventTags;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;

import com.toedter.e4.javafx.control.CTabPane;

@SuppressWarnings("restriction")
public class MinMaxAddon {

	@Inject
	IEventBroker eventBroker;

	@Inject
	EModelService modelService;

	@Inject
	private EPartService partService;

	@Inject
	private IEclipseContext context;

	// Allow 'local' changes to the tags
	private boolean ignoreTagChanges = false;

	static String ID_SUFFIX = "(minimized)"; //$NON-NLS-1$

	// tags representing the min/max state
	public static String MINIMIZED = "Minimized"; //$NON-NLS-1$
	public static String MAXIMIZED = "Maximized"; //$NON-NLS-1$
	public static String MINIMIZED_BY_ZOOM = "MinimizedByZoom"; //$NON-NLS-1$

	/**
	 * The identifier for the shared area in the Eclipse Platform. This value
	 * should be identical to the value defined in
	 * org.eclipse.ui.IPageLayout.ID_EDITOR_AREA.
	 */
	private static final String ID_EDITOR_AREA = "org.eclipse.ui.editorss"; //$NON-NLS-1$

	private final EventHandler tagChangeListener = new EventHandler() {
		@Override
		public void handleEvent(Event event) {
			if (ignoreTagChanges) {
				return;
			}

			Object changedObj = event.getProperty(EventTags.ELEMENT);
			String eventType = (String) event
					.getProperty(UIEvents.EventTags.TYPE);
			String tag = (String) event
					.getProperty(UIEvents.EventTags.NEW_VALUE);
			String oldVal = (String) event
					.getProperty(UIEvents.EventTags.OLD_VALUE);

			if (!(changedObj instanceof MUIElement)) {
				return;
			}

			final MUIElement changedElement = (MUIElement) changedObj;
			System.out.println("Event Type: " + eventType + ":" + event);
			if (UIEvents.EventTypes.ADD.equals(eventType)) {
				if (MINIMIZED.equals(tag)) {
					minimize(changedElement);
				} else if (MAXIMIZED.equals(tag)) {
					maximize(changedElement);
				}
			} else if (UIEvents.EventTypes.REMOVE.equals(eventType)) {
				if (MINIMIZED.equals(oldVal)) {
					restore(changedElement);
				} else if (MAXIMIZED.equals(oldVal)) {
					unzoom(changedElement);
				}
			}
		}
	};

	private final EventHandler widgetListener = new EventHandler() {
		@Override
		public void handleEvent(Event event) {
			final MUIElement changedElement = (MUIElement) event
					.getProperty(EventTags.ELEMENT);
			if (!(changedElement instanceof MPartStack)
					&& !(changedElement instanceof MArea)) {
				return;
			}

			final CTabPane cTabPane = getcTabPaneFor(changedElement);
			if (cTabPane == null) {
				return;
			}

			MUIElement stateElement = changedElement;
			if (changedElement instanceof MPartStack) {
				MPartStack stack = (MPartStack) changedElement;
				MArea area = getAreaFor(stack);
				if (area != null && !(area.getWidget() instanceof CTabPane)) {
					stateElement = area.getCurSharedRef();
				}
			} else if (changedElement instanceof MArea) {
				stateElement = changedElement.getCurSharedRef();
			}

			adjustCTabPaneButtons(stateElement);

			final Runnable maximizeRunnable = new Runnable() {

				@Override
				public void run() {
					System.out.println("Maximized " + changedElement);
					maximize(changedElement);
				}
			};
			cTabPane.setMaximizedHandler(maximizeRunnable);

			final Runnable minimizeRunnable = new Runnable() {

				@Override
				public void run() {
					System.out.println("Minimized " + changedElement);
					minimize(changedElement);
				}
			};
			cTabPane.setMinimizedHandler(minimizeRunnable);

		}
	};

	/**
	 * Set the state of the min / max buttons on the cTabPane based on the model
	 * element's state. The input is expected to be the element that contains
	 * the min/max state info which should either be an MPartStack or an
	 * MPlaceholder for the shared area.
	 * 
	 * @param element
	 *            The element to test
	 */
	private void adjustCTabPaneButtons(MUIElement element) {
		if (!(element instanceof MPartStack)
				&& !(element instanceof MPlaceholder)) {
			return;
		}

		CTabPane cTabPane = getcTabPaneFor(element);
		if (cTabPane == null) {
			return;
		}

		if (element instanceof MPlaceholder) {
			setCTabPaneButtons(cTabPane, element, false);
		} else {
			MArea area = getAreaFor((MPartStack) element);
			if (area == null) {
				setCTabPaneButtons(cTabPane, element, false);
			}
		}
	}

	private CTabPane getcTabPaneFor(MUIElement element) {
		if (element instanceof MArea) {
			if (element.getWidget() instanceof CTabPane) {
				return (CTabPane) element.getWidget();
			}
			List<MPartStack> stacks = modelService.findElements(element, null,
					MPartStack.class, null);
			for (MPartStack stack : stacks) {
				if (stack.getWidget() instanceof CTabPane) {
					return (CTabPane) stack.getWidget();
				}
			}
		} else if (element.getWidget() instanceof CTabPane) {
			return (CTabPane) element.getWidget();
		} else if (element instanceof MPlaceholder) {
			MPlaceholder ph = (MPlaceholder) element;
			if (ph.getRef() instanceof MArea) {
				return getcTabPaneFor(ph.getRef());
			}
		}
		return null;
	}

	private MArea getAreaFor(MPartStack stack) {
		MUIElement parent = stack.getParent();
		while (parent != null) {
			if (parent instanceof MArea) {
				return (MArea) parent;
			}
			parent = parent.getParent();
		}
		return null;
	}

	private void setCTabPaneButtons(CTabPane cTabPane, MUIElement stateElement,
			boolean hideButtons) {
		if (hideButtons) {
			cTabPane.setMinimizeVisible(false);
			cTabPane.setMaximizeVisible(false);
		} else {
			if (stateElement.getTags().contains(MINIMIZED)) {
				cTabPane.setMinimizeVisible(false);
				cTabPane.setMaximizeVisible(true);
				cTabPane.setMaximized(true);
			} else if (stateElement.getTags().contains(MAXIMIZED)) {
				cTabPane.setMinimizeVisible(true);
				cTabPane.setMaximizeVisible(true);
				cTabPane.setMaximized(true);
			} else {
				cTabPane.setMinimizeVisible(true);
				cTabPane.setMaximizeVisible(true);
				cTabPane.setMinimized(false);
				cTabPane.setMaximized(false);
				cTabPane.layout();
			}
		}
	}

	@PostConstruct
	void hookListeners() {
		String topic = UIEvents.buildTopic(UIEvents.UIElement.TOPIC,
				UIEvents.UIElement.WIDGET);
		eventBroker.subscribe(topic, widgetListener);
		topic = UIEvents.buildTopic(UIEvents.ApplicationElement.TOPIC,
				UIEvents.ApplicationElement.TAGS);
		eventBroker.subscribe(topic, tagChangeListener);
	}

	void minimize(MUIElement element) {
		System.out.println("MinMaxAddon.minimize()");
		createTrim(element);
		element.setVisible(false);
		adjustMinMaxButtons(element);

		// Activate a part other than the trimStack so that if the tool item is
		// pressed immediately it will still open the stack.
		// TODO partService.requestActivation();
	}

	private void createTrim(MUIElement element) {
		System.out.println("MinMaxAddon.createTrim()");
		MTrimmedWindow window = (MTrimmedWindow) getWindowFor(element);
		Stage stage = (Stage) window.getWidget();

		// Is there already a TrimControl there ?
		String trimId = element.getElementId()
				+ getMinimizedElementSuffix(element);
		MToolControl trimStack = (MToolControl) modelService.find(trimId,
				window);

		if (trimStack == null) {
			trimStack = MenuFactoryImpl.eINSTANCE.createToolControl();
			trimStack.setElementId(trimId);
			trimStack.setContributionURI(TrimStack.CONTRIBUTION_URI);

			double stageCenterX = stage.getWidth() / 2;
			CTabPane stackPane = (CTabPane) element.getWidget();
			double stackCenterX = stackPane.getLayoutX() + stackPane.getWidth()
					/ 2;

			SideValue side = stackCenterX < stageCenterX ? SideValue.LEFT
					: SideValue.RIGHT;
			MTrimBar bar = modelService.getTrim(window, side);

			bar.getChildren().add(trimStack);
			bar.setVisible(true);

			// get the parent trim bar, see bug 320756
			if (bar.getWidget() == null) {
				// ask it to be rendered
				bar.setToBeRendered(true);

				// create the widget
				context.get(IPresentationEngine.class).createGui(bar,
						stage.getScene().getRoot(), window.getContext());
			}
		} else {
			// get the parent trim bar, see bug 320756
			MUIElement parent = trimStack.getParent();
			parent.setVisible(true);
			if (parent.getWidget() == null) {
				// ask it to be rendered
				parent.setToBeRendered(true);
				// create the widget
				context.get(IPresentationEngine.class).createGui(parent,
						stage.getScene().getRoot(), window.getContext());
			}
			trimStack.setToBeRendered(true);
		}
	}

	void maximize(final MUIElement element) {
		MWindow win = getWindowFor(element);
		MPerspective persp = modelService.getActivePerspective(win);

		List<String> maxTag = new ArrayList<String>();
		maxTag.add(MAXIMIZED);
		List<MUIElement> curMax = modelService.findElements(persp == null ? win
				: persp, null, MUIElement.class, maxTag);
		if (curMax.size() > 0) {
			for (MUIElement maxElement : curMax) {
				if (maxElement == element) {
					continue;
				}
				ignoreTagChanges = true;
				try {
					maxElement.getTags().remove(MAXIMIZED);
				} finally {
					ignoreTagChanges = false;
				}
			}
		}

		List<MPartStack> stacks = modelService.findElements(persp == null ? win
				: persp, null, MPartStack.class, null,
				EModelService.PRESENTATION);
		for (MPartStack theStack : stacks) {
			if (theStack == element) {
				continue;
			}

			// Exclude stacks in DW's
			if (getWindowFor(theStack) != win) {
				continue;
			}

			int loc = modelService.getElementLocation(theStack);
			if (loc != EModelService.IN_SHARED_AREA
					&& theStack.getWidget() != null
					&& !theStack.getTags().contains(MINIMIZED)) {
				theStack.getTags().add(MINIMIZED_BY_ZOOM);
				theStack.getTags().add(MINIMIZED);
			}
		}

		// Find the editor 'area'
		if (persp != null) {
			MPlaceholder eaPlaceholder = (MPlaceholder) modelService.find(
					ID_EDITOR_AREA, persp);
			if (element != eaPlaceholder && eaPlaceholder != null) {
				eaPlaceholder.getTags().add(MINIMIZED_BY_ZOOM);
				eaPlaceholder.getTags().add(MINIMIZED);
			}
		}

		adjustMinMaxButtons(element);
	}

	void restore(MUIElement element) {
		System.out.println("MinMaxAddon.restore()");
		MWindow window = modelService.getTopLevelWindowFor(element);
		String trimId = element.getElementId()
				+ getMinimizedElementSuffix(element);
		MToolControl trimStack = (MToolControl) modelService.find(trimId,
				window);
		TrimStack ts = (TrimStack) trimStack.getObject();
		ts.restoreStack();

		adjustCTabPaneButtons(element);
		element.getTags().remove(MINIMIZED_BY_ZOOM);
	}

	void unzoom(final MUIElement element) {
		MWindow win = modelService.getTopLevelWindowFor(element);
		MPerspective persp = modelService.getActivePerspective(win);

		List<MPartStack> stacks = modelService.findElements(win, null,
				MPartStack.class, null, EModelService.PRESENTATION);
		for (MPartStack theStack : stacks) {
			if (theStack.getWidget() != null
					&& theStack.getTags().contains(MINIMIZED)
					&& theStack.getTags().contains(MINIMIZED_BY_ZOOM)) {
				theStack.getTags().remove(MINIMIZED);
			}
		}

		// Find the editor 'area'
		MPlaceholder eaPlaceholder = (MPlaceholder) modelService.find(
				ID_EDITOR_AREA, persp == null ? win : persp);
		if (element != eaPlaceholder && eaPlaceholder != null) {
			eaPlaceholder.getTags().remove(MINIMIZED);
		}

		adjustMinMaxButtons(element);
	}

	/**
	 * Return the MWindow containing this element (if any). This may either be a
	 * 'top level' window -or- a detached window. This allows the min.max code
	 * to only affect elements in the window containing the element.
	 * 
	 * @param element
	 *            The element to check
	 * 
	 * @return the window containing the element.
	 */
	private MWindow getWindowFor(MUIElement element) {
		MUIElement parent = element.getParent();

		// We rely here on the fact that a DW's 'getParent' will return
		// null since it's not in the 'children' hierarchy
		while (parent != null && !(parent instanceof MWindow)) {
			parent = parent.getParent();
		}

		// A detached window will end up with getParent() == null
		return (MWindow) parent;
	}

	/**
	 * Set the state of the min / max buttons on the CTF based on the model
	 * element's state. The input is expected to be the element that contains
	 * the min/max state info which should either be an MPartStack or an
	 * MPlaceholder for the shared area.
	 * 
	 * @param element
	 *            The element to test
	 */
	private void adjustMinMaxButtons(MUIElement element) {
		System.out.println("MinMaxAddon.adjustMinMaxButtons()");
		if (!(element instanceof MPartStack)
				&& !(element instanceof MPlaceholder)) {
			return;
		}

		CTabPane cTabPane = getcTabPaneFor(element);
		if (cTabPane == null) {
			return;
		}

		if (element instanceof MPlaceholder) {
			setCTabPaneButtons(cTabPane, element, false);
		} else {
			MArea area = getAreaFor((MPartStack) element);
			if (area == null) {
				setCTabPaneButtons(cTabPane, element, false);
			}
		}
	}

	private String getMinimizedElementSuffix(MUIElement element) {
		String id = ID_SUFFIX;
		MPerspective persp = modelService.getPerspectiveFor(element);
		if (persp != null) {
			id = '(' + persp.getElementId() + ')';
		}
		return id;
	}
}
