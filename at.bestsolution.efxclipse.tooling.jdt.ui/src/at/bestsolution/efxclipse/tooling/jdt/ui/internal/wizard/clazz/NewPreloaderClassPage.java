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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.swt.widgets.Composite;

import at.bestsolution.efxclipse.tooling.ui.wizards.AbstractJDTElementPage;
import at.bestsolution.efxclipse.tooling.ui.wizards.template.JDTElement;

/**
 * @author Tom Schindl
 *
 */
public class NewPreloaderClassPage extends AbstractJDTElementPage<JDTElement> {
	
	/**
	 * @param pageName
	 * @param title
	 * @param description
	 * @param froot
	 * @param fWorkspaceRoot
	 */
	protected NewPreloaderClassPage(IPackageFragmentRoot froot, IPackageFragment fragment,
			IWorkspaceRoot fWorkspaceRoot) {
		super("newApplicationId", "JavaFX Preloader Class", "Create a new JavaFX Preloader Class", froot, fragment, fWorkspaceRoot);
	}

	@Override
	protected void createFields(Composite parent, DataBindingContext dbc) {
		
	}

	@Override
	protected JDTElement createInstance() {
		return new JDTElement();
	}

}
