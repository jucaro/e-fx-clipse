package at.bestsolution.efxclipse.runtime.workbench.renderers;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuItem;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;

import at.bestsolution.efxclipse.runtime.workbench.AbstractPartRenderer;
import at.bestsolution.efxclipse.runtime.workbench.IRendererFactory;

@SuppressWarnings("restriction")
public class WorkbenchRendererFactory implements IRendererFactory {
	private WorkbenchWindowRenderer workbenchWindowRenderer;
	private SashRenderer sashRenderer;
	private SashLayoutPaneRenderer sashLayoutRenderer;
	private PartRenderer partRenderer;
	private StackRenderer stackRenderer;
	private ToolItemRenderer toolItemRenderer;
	private ToolBarRenderer toolBarRenderer;
	private MenuBarRenderer menuBarRenderer;
	private MenuItemRenderer menuItemRenderer;
	private TrimBarRenderer trimRenderer;

	private final IEclipseContext context;

	@Inject
	public WorkbenchRendererFactory(IEclipseContext context) {
		this.context = context;
	}

	@Override
	public AbstractPartRenderer getRenderer(MUIElement uiElement, Object parent) {
		if (uiElement instanceof MWindow) {
			if (workbenchWindowRenderer == null) {
				workbenchWindowRenderer = ContextInjectionFactory.make(WorkbenchWindowRenderer.class, context);
			}
			return workbenchWindowRenderer;
		} else if (uiElement instanceof MPartSashContainer) {
			if (sashRenderer == null) {
				sashRenderer = ContextInjectionFactory.make(SashRenderer.class, context);
			}
			return sashRenderer;
//		} else if (uiElement instanceof MPartSashContainer) {
//			if (sashLayoutRenderer == null) {
//				sashLayoutRenderer = ContextInjectionFactory.make(SashLayoutPaneRenderer.class, context);
//			}
//			return sashRenderer;
		} else if (uiElement instanceof MPart) {
			if (partRenderer == null) {
				partRenderer = ContextInjectionFactory.make(PartRenderer.class, context);
			}
			return partRenderer;
		} else if (uiElement instanceof MPartStack) {
			if (stackRenderer == null) {
				stackRenderer = ContextInjectionFactory.make(StackRenderer.class, context);
			}
			return stackRenderer;
		} else if (uiElement instanceof MToolBar) {
			if (toolBarRenderer == null) {
				toolBarRenderer = ContextInjectionFactory.make(ToolBarRenderer.class, context);
			}
			return toolBarRenderer;
		} else if (uiElement instanceof MToolItem) {
			if (toolItemRenderer == null) {
				toolItemRenderer = ContextInjectionFactory.make(ToolItemRenderer.class, context);
			}
			return toolItemRenderer;
		} else if (uiElement instanceof MMenu) {
			if (menuBarRenderer == null) {
				menuBarRenderer = ContextInjectionFactory.make(MenuBarRenderer.class, context);
			}
			return menuBarRenderer;
		} else if (uiElement instanceof MMenuItem) {
			if (menuItemRenderer == null) {
				menuItemRenderer = ContextInjectionFactory.make(MenuItemRenderer.class, context);
			}
			return menuItemRenderer;
		} else if (uiElement instanceof MTrimBar) {
			if (trimRenderer == null) {
				trimRenderer = ContextInjectionFactory.make(TrimBarRenderer.class, context);
			}
			return trimRenderer;
		}
		return null;
	}

}
