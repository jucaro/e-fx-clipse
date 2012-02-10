package at.bestsolution.efxclipse.runtime.example.photoedit.ui.fx;

import java.io.File;

import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.common.util.URI;

import at.bestsolution.efxclipse.runtime.example.photoedit.core.ResourceURIProviderService;

@SuppressWarnings("restriction")
public class FXResourceURIProviderService implements ResourceURIProviderService {

	@Override
	public URI openResource(IEclipseContext context) {
		FileChooser chooser = new FileChooser();
		chooser.getExtensionFilters().add(new ExtensionFilter("Photo Edit Store", "*.pes"));
		File f = chooser.showOpenDialog(context.get(Stage.class));
		
		if( f != null ) {
			return URI.createFileURI(f.getAbsolutePath());
		}
		
		return null;
	}

}
