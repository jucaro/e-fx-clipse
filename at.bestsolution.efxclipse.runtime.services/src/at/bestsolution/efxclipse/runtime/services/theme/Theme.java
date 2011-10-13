package at.bestsolution.efxclipse.runtime.services.theme;

import java.net.URL;
import java.util.List;

public interface Theme {
	public String getId();
	public String getName();
	public List<URL> getStylesheetURL();
}
