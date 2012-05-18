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

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.XtextEditor;

import at.bestsolution.efxclipse.tooling.ui.editor.IFXPreviewAdapter;

public class PreviewAdapterFactory implements IAdapterFactory {

	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if(adapterType == IFXPreviewAdapter.class && adaptableObject instanceof XtextEditor ) {
			final XtextEditor editor = (XtextEditor) adaptableObject;
			if( "at.bestsolution.efxclipse.tooling.css.CssDsl".equals(editor.getLanguageName()) ) {
				return new IFXPreviewAdapter() {
					
					@Override
					public IEditorPart getEditorPart() {
						return editor;
					}
				};
			}
		}
		return null;
	}

	@Override
	public Class[] getAdapterList() {
		return new Class[]{IFXPreviewAdapter.class};
	}

}
