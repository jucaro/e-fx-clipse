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
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard.templates;

import org.eclipse.xtext.xtend2.lib.StringConcatenation;

import at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard.templates.model.JavaClass;


/**
 * @author Tom Schindl
 *
 */
public interface IGenerator<O extends JavaClass> {
	public CharSequence generateContent(O clazzDef);
}
