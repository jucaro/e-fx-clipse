package at.bestsolution.efxclipse.runtime.example.photoedit.ui.swt;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.util.URI;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import at.bestsolution.efxclipse.runtime.example.photoedit.core.ResourceURIProviderService;

@SuppressWarnings("restriction")
public class SWTResourceURIProviderService implements ResourceURIProviderService {

	@Override
	public URI openResource(IEclipseContext context) {
		Shell shell = (Shell) context.get(IServiceConstants.ACTIVE_SHELL);
		FileDialog dialog = new FileDialog(shell, SWT.OPEN);
		dialog.setFilterExtensions(new String[]{"*.pes"});
		
		String file = dialog.open();
		
		if( file != null ) {
			return URI.createFileURI(file);
		}
		
		return null;
	}

}
