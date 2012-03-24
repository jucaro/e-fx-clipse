package at.bestsolution.efxclipse.runtime.example.photoedit.app;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.EventTopic;
import org.eclipse.e4.ui.model.application.MAddon;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.impl.ApplicationPackageImpl;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;

import at.bestsolution.efxclipse.runtime.example.photoedit.core.EventTopics;
import at.bestsolution.efxclipse.runtime.example.photoedit.core.ResourceStore;

@SuppressWarnings("restriction")
public class ResourceAddon {
	private static final String PERSISTED_STATE_STORAGE_URI_KEY = "PERSISTED_STATE_STORAGE_URI_KEY";
	
	private MAddon addon;
	
	@Inject
	ResourceStore store;
	
	@Inject
	public ResourceAddon(IEclipseContext context, MAddon addon, MApplication application, EModelService service, ResourceStore store) {
		this.addon = addon;
		this.store = store;
		
		List<MToolItem> items = service.findElements(application, null, MToolItem.class, null);
		
		for( MToolItem i : items ) {
			if( i.isSelected() ) {
				if( "toolitem.area".equals(i.getElementId()) ) {
					IEclipseContext c = context;
					if( c.getParent() != null ) {
						c = c.getParent();
					}
					c.set("activetool", "area");
				} else {
					IEclipseContext c = context;
					if( c.getParent() != null ) {
						c = c.getParent();
					}
					c.set("activetool", "select");
				}
			}
		}
		
		// Add the service to the injection system
		ContextInjectionFactory.inject(store, context);
		
		if( addon.getPersistedState().containsKey(PERSISTED_STATE_STORAGE_URI_KEY) ) {
			for( Entry<String, String> e : addon.getPersistedState().entrySet() ) {
				if( PERSISTED_STATE_STORAGE_URI_KEY.equals(e.getKey()) ) {
					newResourceURI(e);
				}
			}
		}
		
		// Work around for bug 371.233
		((EObject)this.addon).eAdapters().add(new EContentAdapter() {
			@SuppressWarnings("unchecked")
			@Override
			public void notifyChanged(Notification msg) {
				super.notifyChanged(msg);
				if( msg.getFeature() == ApplicationPackageImpl.Literals.APPLICATION_ELEMENT__PERSISTED_STATE ) {
					newResourceURI((Entry<String, String>) msg.getNewValue());
				} else if( msg.getFeature() == ApplicationPackageImpl.Literals.STRING_TO_STRING_MAP__VALUE ) {
					newResourceURI((Entry<String, String>) msg.getNotifier());
				}
			}
		});
	}
	
	// @Inject
	void newResourceURI(@Optional @EventTopic(UIEvents.StringToStringMap.TOPIC_ALL) Entry<String, String> data) {
		if( data != null && data.getKey().equals(PERSISTED_STATE_STORAGE_URI_KEY) ) {
			store.loadRoot(URI.createURI(data.getValue()));
		}
	}
	
	@Inject
	void openResource(@Optional @EventTopic(EventTopics.OPEN_RESOURCE) URI uri) {
		if( uri != null ) {
			System.err.println("Setting new uri: " + uri);
			addon.getPersistedState().put(PERSISTED_STATE_STORAGE_URI_KEY, uri.toString());
		}
	}
}
