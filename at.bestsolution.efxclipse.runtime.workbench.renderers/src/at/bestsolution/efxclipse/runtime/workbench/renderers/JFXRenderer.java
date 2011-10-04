package at.bestsolution.efxclipse.runtime.workbench.renderers;

import org.eclipse.e4.ui.model.application.ui.MUIElement;

import at.bestsolution.efxclipse.runtime.workbench.AbstractPartRenderer;

@SuppressWarnings("restriction")
public abstract class JFXRenderer extends AbstractPartRenderer {
	@Override
	public void bindWidget(MUIElement me, Object widget) {
		me.setWidget(widget);
	}
}
