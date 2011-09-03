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
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors;

import org.eclipse.jdt.internal.ui.propertiesfileeditor.PropertiesFileEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.outline.PropertyContentOutlinePage;

@SuppressWarnings("restriction")
public class PropertyTextEditor extends PropertiesFileEditor {
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (adapter == IContentOutlinePage.class) {
			final PropertyContentOutlinePage contentOutline = new PropertyContentOutlinePage(this);
			return contentOutline;
		}
		//
		// TODO Auto-generated method stub
		return super.getAdapter(adapter);
	}
}