/*
 * Currently not used anymore....
 */
package at.bestsolution.efxclipse.runtime.workbench.renderers;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import javafx.scene.layout.BorderPane;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;

@SuppressWarnings("restriction")
public class PartRenderer extends JFXRenderer {
	private org.osgi.service.event.EventHandler focusPartHandler = new org.osgi.service.event.EventHandler() {
		
		@Override
		public void handleEvent(org.osgi.service.event.Event event) {
			Object element = event.getProperty(IEventBroker.DATA);
			if( !(element instanceof MPart) ) {
				return;
			}
			
			activate((MPart) element);
		}
	};
	
	@Inject
	IEventBroker eventBroker;
	
	@PostConstruct
	void init() {
		eventBroker.subscribe(FX_FOCUS_TOPIC, focusPartHandler);
	}
	
	@Override
	public Object createWidget(final MUIElement element, Object parent) {
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
