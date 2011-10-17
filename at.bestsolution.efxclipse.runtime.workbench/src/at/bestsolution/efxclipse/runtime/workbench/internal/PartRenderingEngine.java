package at.bestsolution.efxclipse.runtime.workbench.internal;

import java.util.Map;

import javafx.scene.Group;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.internal.workbench.E4Workbench;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.MApplicationElement;
import org.eclipse.e4.ui.model.application.ui.MContext;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.advanced.MPlaceholder;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.IPresentationEngine;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.efxclipse.runtime.workbench.AbstractPartRenderer;
import at.bestsolution.efxclipse.runtime.workbench.IRendererFactory;

@SuppressWarnings({ "restriction" })
public class PartRenderingEngine implements IPresentationEngine {
	public static final String engineURI = "platform:/plugin/at.bestsolution.efxclipse.runtime.workbench/" + "at.bestsolution.efxclipse.runtime.workbench.internal.PartRenderingEngine";

	private static final String defaultFactoryUrl = "platform:/plugin/at.bestsolution.efxclipse.runtime.workbench.renderers/" + "at.bestsolution.efxclipse.runtime.workbench.renderers.WorkbenchRendererFactory";

	private String factoryUrl;
	private IRendererFactory curFactory = null;
	private IEclipseContext appContext;

	@Inject
	protected Logger logger;

	@Inject
	@Optional
	protected IEventBroker eventBroker;

	@Inject
	@Optional
	EModelService modelService;

	private MApplication theApp;
	
	private Group limboContainer;

	@Inject
	public PartRenderingEngine(@Named(E4Workbench.RENDERER_FACTORY_URI) @Optional String factoryUrl) {
		if (factoryUrl == null) {
			factoryUrl = defaultFactoryUrl;
		}
		this.factoryUrl = factoryUrl;
	}

	@PostConstruct
	void initialize(IEclipseContext context) {
		this.appContext = context;

		// initialize the correct key-binding display formatter
		// KeyFormatterFactory.setDefault(SWTKeySupport
		// .getKeyFormatterForPlatform());

		// Add the renderer to the context
		context.set(IPresentationEngine.class.getName(), this);

		IRendererFactory factory = null;
		IContributionFactory contribFactory = context.get(IContributionFactory.class);
		try {
			factory = (IRendererFactory) contribFactory.create(factoryUrl, context);
		} catch (Exception e) {
			logger.warn(e, "Could not create rendering factory");
		}

		// Try to load the default one
		if (factory == null) {
			try {
				factory = (IRendererFactory) contribFactory.create(defaultFactoryUrl, context);
			} catch (Exception e) {
				logger.error(e, "Could not create default rendering factory");
			}
		}

		if (factory == null) {
			throw new IllegalStateException("Could not create any rendering factory. Aborting ...");
		}

		curFactory = factory;
		context.set(IRendererFactory.class, curFactory);
	}

	@PreDestroy
	void contextDisposed() {
		if (eventBroker == null)
			return;
	}

	@SuppressWarnings("unchecked")
	public Object createGui(MUIElement element, Object parentWidget, IEclipseContext parentContext) {
		if (!element.isToBeRendered())
			return null;
		
		if (element instanceof MContext) {
			MContext ctxt = (MContext) element;
			// Assert.isTrue(ctxt.getContext() == null,
			// "Before rendering Context should be null");
			if (ctxt.getContext() == null) {
				IEclipseContext lclContext = parentContext
						.createChild(getContextName(element));
				populateModelInterfaces(ctxt, lclContext, element.getClass()
						.getInterfaces());
				ctxt.setContext(lclContext);

				// System.out.println("New Context: " + lclContext.toString()
				// + " parent: " + parentContext.toString());

				// make sure the context knows about these variables that have
				// been defined in the model
				for (String variable : ctxt.getVariables()) {
					lclContext.declareModifiable(variable);
				}

				Map<String, String> props = ctxt.getProperties();
				for (String key : props.keySet()) {
					lclContext.set(key, props.get(key));
				}

				E4Workbench.processHierarchy(element);
			}
		}
		
		Object newWidget = createWidget(element, parentWidget);
		
		if (newWidget != null) {
			AbstractPartRenderer renderer = getRendererFor(element);

			// Have the renderer hook up any widget specific listeners
			renderer.hookControllerLogic(element);

			// Process its internal structure through the renderer that created
			// it
			if (element instanceof MElementContainer) {
				renderer.processContents((MElementContainer<MUIElement>) element);
			}

			// Allow a final chance to set up
			renderer.postProcess(element);

			// Now that we have a widget let the parent (if any) know
			if (element.getParent() instanceof MUIElement) {
				MElementContainer<MUIElement> parentElement = element
						.getParent();
				AbstractPartRenderer parentRenderer = getRendererFor(parentElement);
				if (parentRenderer != null)
					parentRenderer.childRendered(parentElement, element);
			}
		} else {
			// failed to create the widget, dispose its context if necessary
			if (element instanceof MContext) {
				MContext ctxt = (MContext) element;
				IEclipseContext lclContext = ctxt.getContext();
				if (lclContext != null) {
					lclContext.dispose();
					ctxt.setContext(null);
				}
			}
		}
		
		return newWidget;
	}
	
	private static void populateModelInterfaces(MContext contextModel,
			IEclipseContext context, Class<?>[] interfaces) {
		for (Class<?> intf : interfaces) {
//			Activator.trace(Policy.DEBUG_CONTEXTS,
//					"Adding " + intf.getName() + " for " //$NON-NLS-1$ //$NON-NLS-2$
//							+ contextModel.getClass().getName(), null);
			context.set(intf.getName(), contextModel);

			populateModelInterfaces(contextModel, context, intf.getInterfaces());
		}
	}

	private IEclipseContext getContext(MUIElement parent) {
		if (parent instanceof MContext) {
			return ((MContext) parent).getContext();
		}
		return modelService.getContainingContext(parent);
	}

	protected AbstractPartRenderer getRendererFor(MUIElement element) {
		return (AbstractPartRenderer) element.getRenderer();
	}

	public Object createGui(final MUIElement element) {
		// Obtain the necessary parent widget
		Object parent = null;
		MUIElement parentME = element.getParent();
		if (parentME == null)
			parentME = (MUIElement) ((EObject) element).eContainer();
		if (parentME != null) {
			AbstractPartRenderer renderer = getRendererFor(parentME);
			if (renderer != null) {
				if (!element.isVisible()) {
					parent = getLimboContainer();
				} else {
					parent = renderer.getUIContainer(element);
				}
			}
		}

		// Obtain the necessary parent context
		IEclipseContext parentContext = null;
		if (element.getCurSharedRef() != null) {
			MPlaceholder ph = element.getCurSharedRef();
			parentContext = getContext(ph.getParent());
		} else if (parentContext == null && element.getParent() != null) {
			parentContext = getContext(element.getParent());
		} else if (parentContext == null && element.getParent() == null) {
			parentContext = getContext((MUIElement) ((EObject) element).eContainer());
		}

		return createGui(element, parent, parentContext);
	}

	private Object getLimboContainer() {
		if( limboContainer != null ) {
			limboContainer = new Group();
		}
		return limboContainer;
	}

	private String getContextName(MUIElement element) {
		StringBuilder builder = new StringBuilder(element.getClass().getSimpleName());
		String elementId = element.getElementId();
		if (elementId != null && elementId.length() != 0) {
			builder.append(" (").append(elementId).append(") ");
		}
		builder.append("Context");
		return builder.toString();
	}

	protected Object createWidget(MUIElement element, Object parent) {
		AbstractPartRenderer renderer = getRenderer(element, parent);
		if (renderer != null) {
			// Remember which renderer is responsible for this widget 
			element.setRenderer(renderer);
			Object newWidget = renderer.createWidget(element,parent); 
			if (newWidget != null) {
				renderer.bindWidget(element, newWidget);
				return newWidget;
			}
		}

		return null;
	}

	private AbstractPartRenderer getRenderer(MUIElement uiElement, Object parent) {
		return curFactory.getRenderer(uiElement, parent);
	}

	public void removeGui(MUIElement element) {
		// TODO Auto-generated method stub

	}

	public Object run(MApplicationElement uiRoot, IEclipseContext appContext) {
		if (uiRoot instanceof MApplication) {
			theApp = (MApplication) uiRoot;
			MWindow selected = theApp.getSelectedElement();
			if (selected == null) {
				for (MWindow window : theApp.getChildren()) {
					createGui(window);
				}
			} else {
				// render the selected one first
				createGui(selected);
				for (MWindow window : theApp.getChildren()) {
					if (selected != window) {
						createGui(window);
					}
				}
			}
		}
		return null;
	}

	public void stop() {
		// TODO Auto-generated method stub

	}
}
