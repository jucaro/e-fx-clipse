package at.bestsolution.efxclipse.tooling.css.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;

public class CssDialectExtensionComponent {
	private List<CssDialectExtension> extensions = new ArrayList<CssDialectExtension>();
	
	public void addExtension(CssDialectExtension extension) {
		synchronized (extensions) {
			System.err.println(extension);
			extensions.add(extension);
		}
	}
	
	public void removeExtension(CssDialectExtension extension) {
		synchronized (extensions) {
			extensions.remove(extension);
		}
	}

	public List<Property> getProperties(URI uri) {
		List<Property> rv = new ArrayList<Property>();
		
		for( CssDialectExtension ext : getExtensions(uri) ) {
			rv.addAll(ext.getProperties());
		}
		
		return rv;
	}

	public CssDialectExtension[] getExtensions(URI uri) {
		List<CssDialectExtension> exts = new ArrayList<CssDialectExtension>();
		synchronized (extensions) {
			for( CssDialectExtension e : extensions ) {
				if( e.isActive(uri) ) {
					exts.add(e);
				}
			}
		}
		return exts.toArray(new CssDialectExtension[0]);
	}
}