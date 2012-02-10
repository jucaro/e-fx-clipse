package at.bestsolution.efxclipse.runtime.example.photoedit.core.handlers;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.emf.common.util.URI;

import at.bestsolution.efxclipse.runtime.example.photoedit.core.EventTopics;
import at.bestsolution.efxclipse.runtime.example.photoedit.core.ResourceURIProviderService;

@SuppressWarnings("restriction")
public class OpenResource {
	
	@Execute
	public void openResource(IEclipseContext context, IEventBroker eventBroker, ResourceURIProviderService uriProvider) {
		URI uri = uriProvider.openResource(context);
		if( uri != null ) {
			eventBroker.post(EventTopics.OPEN_RESOURCE, uri);
		}
	}
}
