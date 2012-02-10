package at.bestsolution.efxclipse.runtime.example.photoedit.core;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;

import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoEditApp;

public interface ResourceStore {
	public IStatus loadRoot(URI uri);
	public PhotoEditApp getPhotoEditApp();
}
