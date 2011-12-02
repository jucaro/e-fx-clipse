package at.bestsolution.efxclipse.runtime.workbench.renderers;

import java.util.List;

import javafx.scene.Node;
import javafx.scene.control.Separator;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBarSeparator;

@SuppressWarnings("restriction")
public class SeparatorRenderer extends JFXRenderer {

	@Override
	public Object createWidget(final MUIElement element, Object parent) {
		Node separator = null;
		if (!element.isVisible()) {
			return null;
		}
		int objIndex = calcIndex(element);
		int addIndex = calcVisibleIndex(element);
		MUIElement nextVisibleChild = getNextVisibleChild(element, objIndex);
		if (addIndex == 0) {
			return null;
		}
		if (nextVisibleChild == null) {
			return null;
		}
		if (nextVisibleChild.isVisible() && (nextVisibleChild instanceof MToolBarSeparator)) {
			return null;
		}
		if (element instanceof MToolBarSeparator) {
			separator = new Separator();
		}

		return separator;
	}

	MUIElement getNextVisibleChild(final MUIElement element, int objIndex) {
		List<MUIElement> children = element.getParent().getChildren();
		for (int i = objIndex + 1; i < children.size(); i++) {
			MUIElement child = children.get(i);
			if (child.isVisible()) {
				return child;
			}
		}
		return null;
	}

}
