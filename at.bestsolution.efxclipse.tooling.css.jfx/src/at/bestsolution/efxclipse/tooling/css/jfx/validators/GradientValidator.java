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
package at.bestsolution.efxclipse.tooling.css.jfx.validators;

import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.ValidationResult;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.ValidationStatus;
import at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension;

/**
 * @author Tom Schindl
 *
 */
public class GradientValidator {
	public static void validateColorStop(termGroup group, List<ValidationResult> list) {
		if( group.getTerms().size() > 0 ) {
			JFXDialectExtension.validateColor(group.getTerms().get(0), list);
			if( group.getTerms().size() > 1 ) {
				JFXDialectExtension.validateSize(group.getTerms().get(1), list);	
			}
		} else {
			list.add(new ValidationResult(ValidationStatus.ERROR, "The color stop has to have a color and optional a length", group, null, -1));
		}
	}
}
