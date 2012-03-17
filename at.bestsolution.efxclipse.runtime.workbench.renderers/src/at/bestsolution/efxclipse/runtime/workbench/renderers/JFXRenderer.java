package at.bestsolution.efxclipse.runtime.workbench.renderers;

import java.util.List;

import javafx.scene.Node;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.IPresentationEngine;

import at.bestsolution.efxclipse.runtime.workbench.AbstractPartRenderer;

@SuppressWarnings("restriction")
public abstract class JFXRenderer extends AbstractPartRenderer {
	public static final String FX_EVENT_TOPIC_BASE = "at/bestsolution/efxclipse";
	public static final String FX_FOCUS_TOPIC = FX_EVENT_TOPIC_BASE + "/FocusElement";
	
	@Override
	public void bindWidget(MUIElement me, Object widget) {
		if( widget instanceof Node ) {
			((Node) widget).setUserData(me);
		}
		
		me.setWidget(widget);
		if (widget instanceof Node && me.getElementId() != null) {
			((Node) widget).setId(me.getElementId());
		}
	}

	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		// EMF gives us null lists if empty
		if (container == null) {
			return;
		}

		// Process any contents of the newly created ME
		List<MUIElement> parts = container.getChildren();
		if (parts != null) {
			// loading a legacy app will add children to the window while it is
			// being rendered.
			// this is *not* the correct place for this
			// hope that the ADD event will pick up the new part.
			String name = IPresentationEngine.class.getName();
			IPresentationEngine renderer = (IPresentationEngine) context.get(name);
			MUIElement[] plist = parts.toArray(new MUIElement[parts.size()]);
			for (int i = 0; i < plist.length; i++) {
				MUIElement childME = plist[i];
				renderer.createGui(childME);
			}
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
		// TODO Auto-generated method stub

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
//		MUIElement focussed = getModelElement(Display.getDefault()
//				.getFocusControl());
//		if (focussed == null) {
//			return true;
//		}
//		// we ignore menus
//		do {
//			if (focussed == element || focussed == element.getToolbar()) {
//				return false;
//			}
//			focussed = focussed.getParent();
//		} while (focussed != null);
		return true;
	}

}
