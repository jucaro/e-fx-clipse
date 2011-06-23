package at.bestsolution.efxclipse.tooling.css.ui.internal;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension;

public class CssDialectExtensionComponent implements CssDialectExtension {
	private List<CssDialectExtension> extensions = new ArrayList<CssDialectExtension>();
	
	public void addExtension(CssDialectExtension extension) {
		synchronized (extensions) {
			extensions.add(extension);
		}
	}
	
	public void removeExtension(CssDialectExtension extension) {
		synchronized (extensions) {
			extensions.remove(extension);
		}
	}

	@Override
	public List<Property> getProperties() {
		List<Property> rv = new ArrayList<Property>();
		
		for( CssDialectExtension ext : getExtensions() ) {
			rv.addAll(ext.getProperties());
		}
		
		return rv;
	}

	public CssDialectExtension[] getExtensions() {
		CssDialectExtension[] exts;
		synchronized (extensions) {
			exts = extensions.toArray(new CssDialectExtension[0]);	
		}
		return exts;
	}
}