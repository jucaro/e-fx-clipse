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
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler;

import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISources;

/**
 * @author Tom Schindl
 *
 */
public class RunFromFileBuildHandler extends AbstractBuildHandler {

	@Override
	protected IFile getConfigurationFile(IEvaluationContext context) {
		IFileEditorInput input = (IFileEditorInput) context.getVariable(ISources.ACTIVE_EDITOR_INPUT_NAME);
		return input.getFile();
	}

}
