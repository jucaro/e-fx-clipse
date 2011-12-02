/*******************************************************************************
 * Copyright (c) 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.runtime.workbench.renderers;

import java.awt.Composite;

import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.MToolControl;

/**
 * Create a contribute part.
 */
@SuppressWarnings("restriction")
public class ToolControlRenderer extends JFXRenderer {

	@Override
	public Object createWidget(final MUIElement element, Object parent) {
		if (!(element instanceof MToolControl) || !(parent instanceof ToolBar || parent instanceof Pane)) {
			return null;
		}

		MToolControl toolControl = (MToolControl) element;
		IEclipseContext parentContext = getContextForParent(element);

		Separator sep = null;
		final VBox newComposite = new VBox();
		if (parent instanceof ToolBar) {
			((ToolBar) parent).getItems().add(newComposite);
		} else {
			((Pane) parent).getChildren().add(newComposite);
		}

		bindWidget(element, newComposite);

		// Create a context just to contain the parameters for injection
		IContributionFactory contributionFactory = parentContext.get(IContributionFactory.class);

		IEclipseContext localContext = EclipseContextFactory.create();

		localContext.set(Composite.class.getName(), newComposite);
		localContext.set(MToolControl.class.getName(), toolControl);

		Object tcImpl = contributionFactory.create(toolControl.getContributionURI(), parentContext, localContext);
		toolControl.setObject(tcImpl);

		System.out.println("ToolControlRenderer.createWidget():  " + newComposite);
		return newComposite;
	}

}
