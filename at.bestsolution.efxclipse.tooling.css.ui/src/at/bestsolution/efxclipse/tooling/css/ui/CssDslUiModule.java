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
package at.bestsolution.efxclipse.tooling.css.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.hover.IEObjectHover;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import at.bestsolution.efxclipse.tooling.css.ui.highlighting.CssDslHighlightingCalculator;
import at.bestsolution.efxclipse.tooling.css.ui.highlighting.CssDslHighlightingConfiguration;
import at.bestsolution.efxclipse.tooling.css.ui.hover.CssHoverProvider;

import com.google.inject.Binder;

/**
 * Use this class to register components to be used within the IDE.
 */
public class CssDslUiModule extends at.bestsolution.efxclipse.tooling.css.ui.AbstractCssDslUiModule {
	public CssDslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(ISemanticHighlightingCalculator.class).to(CssDslHighlightingCalculator.class);
		binder.bind(IHighlightingConfiguration.class).to(CssDslHighlightingConfiguration.class);
		binder.bind(IEObjectHoverProvider.class).to(CssHoverProvider.class);
	}
}
