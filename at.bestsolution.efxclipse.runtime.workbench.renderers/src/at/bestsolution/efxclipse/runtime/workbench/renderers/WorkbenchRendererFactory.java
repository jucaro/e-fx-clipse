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
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;

import at.bestsolution.efxclipse.runtime.workbench.AbstractPartRenderer;
import at.bestsolution.efxclipse.runtime.workbench.IRendererFactory;

@SuppressWarnings("restriction")
public class WorkbenchRendererFactory implements IRendererFactory {
	private WorkbenchWindowRenderer workbenchWindowRenderer;
	private SashLayoutPaneRenderer sashLayoutPaneRender;
	private PartRenderer partRenderer;
	private StackRenderer stackRenderer;
	private ToolbarRenderer toolbarRenderer;
	private TrimbarRenderer trimRenderer;
	
	private IEclipseContext context;
	
	@Inject
	public WorkbenchRendererFactory(IEclipseContext context) {
		this.context = context;
	}
	
	@Override
	public AbstractPartRenderer getRenderer(MUIElement uiElement, Object parent) {
		if( uiElement instanceof MWindow ) {
			if( workbenchWindowRenderer == null ) {
				workbenchWindowRenderer = ContextInjectionFactory.make(WorkbenchWindowRenderer.class, context);
			}
			return workbenchWindowRenderer;
		} else if( uiElement instanceof MPartSashContainer ) {
			if( sashLayoutPaneRender == null ) {
				sashLayoutPaneRender = ContextInjectionFactory.make(SashLayoutPaneRenderer.class, context);
			}
			return sashLayoutPaneRender;
		} else if( uiElement instanceof MPart ) {
			if( partRenderer == null ) {
				partRenderer = ContextInjectionFactory.make(PartRenderer.class, context);
			}
			return partRenderer;
		} else if( uiElement instanceof MPartStack ) {
			if( stackRenderer == null ) {
				stackRenderer = ContextInjectionFactory.make(StackRenderer.class, context);
			}
			return stackRenderer;
		} else if( uiElement instanceof MToolBar ) {
			if( toolbarRenderer == null ) {
				toolbarRenderer = ContextInjectionFactory.make(ToolbarRenderer.class, context);
			}
			return toolbarRenderer;
		} else if( uiElement instanceof MTrimBar ) {
			if( trimRenderer == null ) {
				trimRenderer = ContextInjectionFactory.make(TrimbarRenderer.class, context);
			}
			return trimRenderer;
		}
		return null;
	}

}
