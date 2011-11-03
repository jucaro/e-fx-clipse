/*
 * Currently not used anymore....
 */
package at.bestsolution.efxclipse.runtime.workbench.renderers;

import javafx.scene.layout.BorderPane;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;

@SuppressWarnings("restriction")
public class PartRenderer extends JFXRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		BorderPane pane = new BorderPane();

		final MPart part = (MPart) element;

		// Create a context for this part
		IEclipseContext localContext = part.getContext();
		localContext.set(BorderPane.class, pane);

		IContributionFactory contributionFactory = (IContributionFactory) localContext.get(IContributionFactory.class
				.getName());
		Object newPart = contributionFactory.create(part.getContributionURI(), localContext);
		part.setObject(newPart);

		return pane;
	}
}
