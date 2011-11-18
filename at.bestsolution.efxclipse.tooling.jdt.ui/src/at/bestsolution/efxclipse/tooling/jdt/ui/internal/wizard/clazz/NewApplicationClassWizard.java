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
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard.clazz;

import org.eclipse.core.resources.ResourcesPlugin;

import at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard.templates.ApplicationClassGenerator;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard.templates.IGenerator;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard.templates.model.JavaClass;

/**
 * @author Tom Schindl
 *
 */
public class NewApplicationClassWizard extends AbstractNewClassWizard<JavaClass> {

	@Override
	public void addPages() {
		addPage(new NewApplicationClassPage(root,ResourcesPlugin.getWorkspace().getRoot()));
	}
	
	
	@Override
	protected IGenerator<JavaClass> getGenerator() {
		return new ApplicationClassGenerator();
	}

}
