/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.css.ui.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;

public class CssDialectExtensionComponent {
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