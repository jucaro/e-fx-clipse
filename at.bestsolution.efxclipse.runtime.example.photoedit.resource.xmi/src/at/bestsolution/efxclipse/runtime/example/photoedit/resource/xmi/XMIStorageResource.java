package at.bestsolution.efxclipse.runtime.example.photoedit.resource.xmi;

import java.io.IOException;

import javax.inject.Inject;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import at.bestsolution.efxclipse.runtime.example.photoedit.core.EventTopics;
import at.bestsolution.efxclipse.runtime.example.photoedit.core.ResourceStore;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoEditApp;

@SuppressWarnings("restriction")
public class XMIStorageResource implements ResourceStore {

	@Inject
	IEventBroker eventBroker;
	
	private Resource resource;
	
	@Override
	public IStatus loadRoot(URI uri) {
		ResourceSet set = new ResourceSetImpl();
		resource = set.getResource(uri, true);
		eventBroker.send(EventTopics.STORE_NEW_CONTENT, getPhotoEditApp());
		
		return Status.OK_STATUS;
	}

	public PhotoEditApp getPhotoEditApp() {
		if( resource != null ) {
			return (PhotoEditApp) resource.getContents().get(0);
		}
		return null;
	}
	
	@Override
	public IStatus save() {
		if( resource != null ) {
			try {
				resource.save(null);
				return Status.OK_STATUS;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return new Status(IStatus.ERROR, "at.bestsolution.efxclipse.runtime.example.photoedit.resource.xmi", e.getMessage(),e);
			}
		}
		return Status.CANCEL_STATUS;
	}
}
