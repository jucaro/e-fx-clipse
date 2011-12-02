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
	@Override
	public void bindWidget(MUIElement me, Object widget) {
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

	protected int calcIndex(MUIElement element) {
		MElementContainer<MUIElement> parent = element.getParent();
		return parent.getChildren().indexOf(element);
	}

	/**
	 * Calculates the index of the element in terms of the other <b>rendered</b>
	 * elements. This is useful when 'inserting' elements in the middle of
	 * existing, rendered parents.
	 * 
	 * @param element
	 *            The element to get the index for
	 * @return The visible index or -1 if the element is not a child of the
	 *         parent
	 */
	protected int calcVisibleIndex(MUIElement element) {
		MElementContainer<MUIElement> parent = element.getParent();

		int curIndex = 0;
		for (MUIElement child : parent.getChildren()) {
			if (child == element) {
				return curIndex;
			}

			if (child.getWidget() != null) {
				curIndex++;
			}
		}
		return -1;
	}

	@Override
	protected Object getParentWidget(MUIElement element) {
		if (element.getParent() != null) {
			return element.getParent().getWidget();
		}
		return null;
	}

	@Override
	public void disposeWidget(MUIElement part) {
	}

	@Override
	public void hookControllerLogic(MUIElement me) {
	}

	@Override
	public void childRendered(MElementContainer<MUIElement> parentElement, MUIElement element) {
	}

	@Override
	protected Object getImage(MUILabel element) {
		return null;
	}

	@Override
	protected boolean requiresFocus(MPart element) {
		return false;
	}

}
