package at.bestsolution.efxclipse.runtime.example.photoedit.core.handlers;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;

import at.bestsolution.efxclipse.runtime.example.photoedit.core.ResourceStore;

@SuppressWarnings("restriction")
public class SaveResource {
	
	@Execute
	public void saveResource(IEclipseContext context, ResourceStore store) {
		System.err.println("Saving resource");
		store.save();
	}
}