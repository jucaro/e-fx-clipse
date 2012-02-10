package at.bestsolution.efxclipse.runtime.example.photoedit.core;


import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("restriction")
public interface ResourceURIProviderService {
	public URI openResource(IEclipseContext context);
}
