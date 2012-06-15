package at.bestsolution.efxclipse.runtime.workbench.renderers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.ImageView;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MGenericStack;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.advanced.MPlaceholder;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.workbench.IPresentationEngine;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.efxclipse.runtime.workbench.renderers.internal.ExtendedTab;

@SuppressWarnings("restriction")
public class StackRenderer extends JFXRenderer {
	private org.osgi.service.event.EventHandler selectedItemHandler = new org.osgi.service.event.EventHandler() {
		
		@Override
		public void handleEvent(org.osgi.service.event.Event event) {
			Object element = event.getProperty(UIEvents.EventTags.ELEMENT);

			if (!(element instanceof MGenericStack<?>))
				return;

			MGenericStack<MUIElement> stack = (MGenericStack<MUIElement>) element;
			if( stack.getRenderer() != StackRenderer.this ) {
				return;
			}
			
			StackRenderer lsr = (StackRenderer) stack.getRenderer();

			// Gather up the elements that are being 'hidden' by this change
			MUIElement oldSel = (MUIElement) event
					.getProperty(UIEvents.EventTags.OLD_VALUE);
			if (oldSel != null) {
				List<MUIElement> goingHidden = new ArrayList<MUIElement>();
				hideElementRecursive(oldSel, goingHidden);
			}

			if (stack.getSelectedElement() != null)
				lsr.showTab(stack.getSelectedElement());
			
		}
	};
	
	private org.osgi.service.event.EventHandler focusPartHandler = new org.osgi.service.event.EventHandler() {
		
		@Override
		public void handleEvent(org.osgi.service.event.Event event) {
			Object element = event.getProperty(IEventBroker.DATA);
			if( ! ( element instanceof MGenericStack<?>) ) {
				return;
			}
			
			MGenericStack<MUIElement> stack = (MGenericStack<MUIElement>) element;
			if( stack.getRenderer() != StackRenderer.this ) {
				return;
			}
			
			System.err.println("Stack is activated");
			
			activateStack(stack);
		}
	};
	
	@Inject
	IEventBroker eventBroker;
	
	@Inject
	IPresentationEngine renderer;

	private boolean ignoreTabSelChanges = false;
	
	@Inject
	private MApplication application;
	
	private ActivationJob activationJob = null;

	private class ActivationJob implements Runnable {

		/**
		 * Returns whether it is acceptable for a stack to be activated. As the
		 * activation occurs asynchronously, the original activation request may
		 * have been invalidated since the request was originally enqueued.
		 * <p>
		 * For example, an activation request that was enqueued no longer should
		 * be honoured if a dialog window gets opened in the interim.
		 * </p>
		 * 
		 * @return <code>true</code> if the requested stack should be activated,
		 *         <code>false</code> otherwise
		 */
		private boolean shouldActivate() {
			if (application != null) {
				IEclipseContext applicationContext = application.getContext();
				IEclipseContext activeChild = applicationContext
						.getActiveChild();
				System.err.println(activeChild);
				if (activeChild == null
						|| activeChild.get(MWindow.class) != application
								.getSelectedElement()
						|| application.getSelectedElement() != modelService
								.getTopLevelWindowFor(stackToActivate)) {
					return false;
				}
			}
			return true;
		}

		public MElementContainer<MUIElement> stackToActivate = null;

		public void run() {
//			System.err.println("Running job");
			activationJob = null;
			if (stackToActivate != null
					&& stackToActivate.getSelectedElement() != null
//					&& shouldActivate()
					) {
//				System.err.println("Activation in process");
//				// Ensure we're activating a stack in the current perspective,
//				// when using a dialog to open a perspective
//				// we end up in the situation where this stack is in the
//				// previously active perspective
//				int location = modelService.getElementLocation(stackToActivate);
//				if ((location & EModelService.IN_ACTIVE_PERSPECTIVE) == 0
//						&& (location & EModelService.OUTSIDE_PERSPECTIVE) == 0
//						&& (location & EModelService.IN_SHARED_AREA) == 0)
//					return;

				MUIElement selElement = stackToActivate.getSelectedElement();
//				System.err.println("checking validness");
//				if (!isValid(selElement))
//					return;
//
//				if (selElement instanceof MPlaceholder)
//					selElement = ((MPlaceholder) selElement).getRef();
				
				System.err.println("calling activation: " + selElement);
				activate((MPart) selElement);
			}
		}
	}
	
	private boolean isValid(MUIElement element) {
		if (element == null || !element.isToBeRendered()) {
			return false;
		}

		if (element instanceof MApplication) {
			return true;
		}

		MUIElement parent = element.getParent();
		if (parent == null && element instanceof MWindow) {
			// might be a detached window
			parent = (MUIElement) ((EObject) element).eContainer();
		}

		if (parent == null) {
			// might be a shared part, try to find the placeholder
			MWindow window = modelService.getTopLevelWindowFor(element);
			return window == null ? false : isValid(modelService
					.findPlaceholderFor(window, element));
		}

		return isValid(parent);
	}
	
	@PostConstruct
	void init() {
		eventBroker.subscribe(UIEvents.ElementContainer.TOPIC_SELECTEDELEMENT, selectedItemHandler);
		eventBroker.subscribe(FX_FOCUS_TOPIC, focusPartHandler);
	}
	
	@Override
	public Object createWidget(MUIElement element, Object parent) {
		TabPane tabPane = new TabPane();
		tabPane.getStyleClass().add("MPartStack");
		return tabPane;
	}

	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		for (MUIElement e : container.getChildren()) {
			createTab(container, e);
		}
	}

	@Override
	protected Object getParentWidget(MUIElement element) {
		return (Node) element.getParent().getWidget();
	}

	@Override
	public void postProcess(MUIElement childElement) {
		if (!(childElement instanceof MGenericStack<?>))
			return;

		MGenericStack<MUIElement> stack = (MGenericStack<MUIElement>) childElement;
		MUIElement selPart = stack.getSelectedElement();
		if (selPart != null) {
			showTab(selPart);
		} else if (stack.getChildren().size() > 0) {
			// Set the selection to the first renderable element
			for (MUIElement kid : stack.getChildren()) {
				if (kid.isToBeRendered() && kid.isVisible()) {
					stack.setSelectedElement(kid);
					break;
				}
			}
		}
	}
	
	@Override
	public void disposeWidget(MUIElement part) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void hookControllerLogic(MUIElement me) {
		super.hookControllerLogic(me);

//		if (!(me instanceof MElementContainer<?>))
//			return;
//
//		final MElementContainer<MUIElement> stack = (MElementContainer<MUIElement>) me;
//		TabPane control = (TabPane) stack.getWidget();
//		control.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Tab>() {
//
//			@Override
//			public void changed(ObservableValue<? extends Tab> observable, Tab oldValue, Tab newValue) {
//				System.err.println("Hello world");
//				// prevent recursions
//				if (ignoreTabSelChanges || newValue == null)
//					return;
//
//				MUIElement ele = (MUIElement) ((ExtendedTab)newValue).getData();
//				ele.getParent().setSelectedElement(ele);
//				activateStack(stack);
//			}
//		});
	}

	@Override
	public void childRendered(final MElementContainer<MUIElement> parentElement, final MUIElement element) {
//		Platform.runLater(new Runnable() {
//			
//			@Override
//			public void run() {
				createTab(parentElement, element);
//			}
//		});
	}

	private void createTab(final MElementContainer<MUIElement> stack,
			MUIElement element) {
		final MPart part;
		if (element instanceof MPart)
			part = (MPart) element;
		else if (element instanceof MPlaceholder) {
			part = (MPart) ((MPlaceholder) element).getRef();
			part.setCurSharedRef((MPlaceholder) element);
		} else {
			part = null;
		}
		
		TabPane parentPane = (TabPane) stack.getWidget();
		
		Tab cti = findItemForPart(element, stack);
		
		if (cti != null) {
			if (element.getWidget() != null)
				cti.setContent((Node) element.getWidget());
			return;
		}
		
		final ExtendedTab tab = new ExtendedTab(getLabel(part, part.getLocalizedLabel()));
		if( part.getIconURI() != null ) {
			tab.setGraphic(new ImageView(part.getIconURI()));
		}
		tab.setData(element);
		tab.setClosable(isClosable(part));
		tab.setOnSelectionChanged(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				if( tab.isSelected() && tab.getContent() == null && ((MUIElement)tab.getData()).getParent() != null ) {
					IPresentationEngine renderer = (IPresentationEngine) context.get(IPresentationEngine.class
							.getName());
					Node node = (Node) renderer.createGui(part);
					tab.setContent(node);	
				}
				
				if( tab.isSelected() ) {
					MUIElement ele = (MUIElement) tab.getData();
					if( ele.isToBeRendered() ) {
						ele.getParent().setSelectedElement(ele);
						activateStack(stack);	
					}	
				}
			}
		});
		parentPane.getTabs().add(tab);
	}
	
	synchronized private void activateStack(MElementContainer<MUIElement> stack) {
		TabPane w = (TabPane) stack.getWidget();
		if( w == null || w.getParent() == null ) {
			return;
		}
		
		if (activationJob == null) {
			activationJob = new ActivationJob();
			activationJob.stackToActivate = stack;
			// Platform.runLater(activationJob); 
			 activationJob.run();
		} else {
			activationJob.stackToActivate = stack;
		}
	}
	
	@Override
	public void hideChild(final MElementContainer<MUIElement> parentElement, final MUIElement child) {
		super.hideChild(parentElement, child);
		System.err.println("Hiding");
//		Platform.runLater(new Runnable() {
//			
//			@Override
//			public void run() {
				doHideChild(parentElement, child);
//			}
//		});
	}
	
	private void doHideChild(MElementContainer<MUIElement> parentElement, MUIElement child) {
		TabPane ctf = (TabPane) parentElement.getWidget();
		if (ctf == null)
			return;

		// find the 'stale' tab for this element and dispose it
		Tab cti = findItemForPart(child, parentElement);
		if (cti != null ) {
			System.err.println("Removing children");
			cti.setContent(null);
			ctf.getTabs().remove(cti);
		}

		// Check if we have to reset the currently active child for the stack
		if (parentElement.getSelectedElement() == child) {
			clearTR(ctf);
		} else {
			if (child instanceof MPlaceholder) {
				MPlaceholder placeholder = (MPlaceholder) child;
				child = placeholder.getRef();

				if (child.getCurSharedRef() != placeholder) {
					// if this placeholder isn't currently managing this
					// element, no need to do anything about its toolbar, just
					// return here
					return;
				}
			}

			if (child instanceof MPart) {
				MToolBar toolbar = ((MPart) child).getToolbar();
				if (toolbar != null) {
					toolbar.setVisible(false);
				}
			}
		}
	}
	
	public void clearTR(TabPane ctf) {
//		ToolBar vmTB = getViewMenuTB(ctf);
//		if (vmTB != null && !vmTB.isDisposed())
//			vmTB.dispose();
//
//		MToolBar viewTBModel = getViewTB(ctf);
//		if (viewTBModel != null && viewTBModel.getWidget() != null)
//			viewTBModel.setVisible(false);
//
//		ctf.setTopRight(null);
//		getTRComposite(ctf).setVisible(false);
	}
	
	private String getLabel(MUILabel itemPart, String newName) {
		if (newName == null) {
			newName = ""; //$NON-NLS-1$
		}
		if (itemPart instanceof MDirtyable && ((MDirtyable) itemPart).isDirty()) {
			newName = '*' + newName;
		}
		return newName;
	}
	
	private boolean isClosable(MPart part) {
		// if it's a shared part check its current ref
		if (part.getCurSharedRef() != null) {
			return !(part.getCurSharedRef().getTags()
					.contains(IPresentationEngine.NO_CLOSE));
		}

		return part.isCloseable();
	}
	
	private Tab findItemForPart(MUIElement element,
			MElementContainer<MUIElement> stack) {
		if (stack == null)
			stack = element.getParent();

		TabPane ctf = (TabPane) stack.getWidget();
		if (ctf == null)
			return null;
		
		
		
		ExtendedTab[] items = ctf.getTabs().toArray(new ExtendedTab[0]);
		for (int i = 0; i < items.length; i++) {
			if (items[i].getData() == element)
				return items[i];
		}
		return null;
	}
	
	@Override
	protected Object getImage(MUILabel element) {
		// TODO Auto-generated method stub
		return null;
	}

	private void hideElementRecursive(MUIElement element,
			List<MUIElement> goingHidden) {
		//TODO Port from SWT
	}

	protected void showTab(MUIElement element) {
		//TODO Port from SWT
		// Now process any newly visible elements
//		List<MUIElement> becomingVisible = new ArrayList<MUIElement>();
//		MUIElement curSel = element.getParent().getSelectedElement();
//		if (curSel != null) {
//			showElementRecursive(curSel, becomingVisible);
//		}
	
		// an invisible element won't have the correct widget hierarchy
		if (!element.isVisible()) {
			return;
		}

		final TabPane ctf = (TabPane) getParentWidget(element);
		Tab cti = findItemForPart(element, null);
		if (cti == null) {
			createTab(element.getParent(), element);
			cti = findItemForPart(element, element.getParent());
		}
		Node ctrl = (Node) element.getWidget();
		if (ctrl != null && ctrl.getParent() != ctf) {
//			ctrl.setParent(ctf);
			cti.setContent(ctrl);
		} else if (element.getWidget() == null) {
			Node tabCtrl = (Node) renderer.createGui(element);
			cti.setContent(tabCtrl);
		}

		ignoreTabSelChanges = true;
		ctf.getSelectionModel().select(cti);
		ignoreTabSelChanges = false;

		// Clear out the current Top Right info
		MPart part = (MPart) ((element instanceof MPart) ? element
				: ((MPlaceholder) element).getRef());
//		adjustTR(ctf, part);
	}
}
