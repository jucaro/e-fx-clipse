package at.bestsolution.efxclipse.tooling.ui.editor;

import java.net.URL;
import java.util.List;

import org.eclipse.core.resources.IFile;

public interface IFXMLProviderAdapter extends IFXPreviewAdapter {
	public String getPreviewFXML();
	public List<String> getPreviewCSSFiles();
	public String getPreviewResourceBundle();
	public List<URL> getPreviewClasspath();
	public IFile getFile();
}
