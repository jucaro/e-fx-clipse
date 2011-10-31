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
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.expr;
import at.bestsolution.efxclipse.tooling.css.cssDsl.function;
import at.bestsolution.efxclipse.tooling.css.cssDsl.term;
import at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension;

/**
 * @author Tom Schindl
 * <radial-gradient> = radial-gradient(
 * 		[ focus-angle <angle>, ]?
 * 		[ focus-distance <percentage>, ]?
 * 		[ center <point>, ]?
 * 		[ [ repeat | reflect ] ,]?
 * 		 <color-stop>[, <color-stop>]+ ) 
 */
public class RadialGradientValidator extends GradientValidator {
	public static void validateRadialGradient(function function, List<ValidationResult> list) {
		expr e = function.getExpression();
		
		if( e.getTermGroups().size() > 0 ) {
			int groupIdx = 0;
			termGroup g = e.getTermGroups().get(groupIdx);
			if( g.getTerms().size() > 0 ) {
				term t1 = g.getTerms().get(0);
				
				if( "focus-angle".equals(t1.getIdentifier()) ) {
					groupIdx += 1;
					if( g.getTerms().size() == 2 ) {
						term t2 = g.getTerms().get(1);
						JFXDialectExtension.validateAngle(t2, list);
					} else {
						list.add(new ValidationResult(ValidationStatus.ERROR, "The focus-angle has to have an angle", g, null, -1));
					}
				}
			}
			
			if( e.getTermGroups().size() <= groupIdx ) {
				list.add(new ValidationResult(ValidationStatus.ERROR, "A radial gradient has to have at least one color stop", function, CssDslPackage.Literals.FUNCTION__EXPRESSION, -1));
				return;
			}
			
			g = e.getTermGroups().get(groupIdx);
			if( g.getTerms().size() > 0 ) {
				term t1 = g.getTerms().get(0);
				if( "focus-distance".equals(t1.getIdentifier()) ) {
					groupIdx += 1;
					if( g.getTerms().size() == 2 ) {
						term t2 = g.getTerms().get(1);
						JFXDialectExtension.validatePercentage(t2, list);
					} else {
						list.add(new ValidationResult(ValidationStatus.ERROR, "The focus-distance has to have a percentage", g, null, -1));
					}
				}
			}
			
			if( e.getTermGroups().size() <= groupIdx ) {
				list.add(new ValidationResult(ValidationStatus.ERROR, "A radial gradient has to have at least one color stop", function, CssDslPackage.Literals.FUNCTION__EXPRESSION, -1));
				return;
			}

			g = e.getTermGroups().get(groupIdx);
			if( g.getTerms().size() > 0 ) {
				term t1 = g.getTerms().get(0);
				if( "center".equals(t1.getIdentifier()) ) {
					groupIdx += 1;
					if( g.getTerms().size() == 3 ) {
						JFXDialectExtension.validateSize(g.getTerms().get(1), list);
						JFXDialectExtension.validateSize(g.getTerms().get(2), list);
					} else {
						list.add(new ValidationResult(ValidationStatus.ERROR, "The center has to have a point with x and y", g, null, -1));
					}
				}
			}
			
			if( e.getTermGroups().size() <= groupIdx ) {
				list.add(new ValidationResult(ValidationStatus.ERROR, "A radial gradient has to have a radius", function, CssDslPackage.Literals.FUNCTION__EXPRESSION, -1));
				return;
			}
			
			g = e.getTermGroups().get(groupIdx);
			if( g.getTerms().size() > 0 ) {
				term t1 = g.getTerms().get(0);
				if( "radius".equals(t1.getIdentifier()) ) {
					groupIdx += 1;
					if( g.getTerms().size() == 2 ) {
						JFXDialectExtension.validateSize(g.getTerms().get(1), list);
					}
				} else {
					list.add(new ValidationResult(ValidationStatus.ERROR, "A radial gradient has to have a radius", function, CssDslPackage.Literals.FUNCTION__EXPRESSION, -1));
					return;
				}
			} else {
				list.add(new ValidationResult(ValidationStatus.ERROR, "A radial gradient has to have a radius", function, CssDslPackage.Literals.FUNCTION__EXPRESSION, -1));
				return;
			}
			
			if( e.getTermGroups().size() <= groupIdx ) {
				list.add(new ValidationResult(ValidationStatus.ERROR, "A radial gradient has to have at least one color stop", function, CssDslPackage.Literals.FUNCTION__EXPRESSION, -1));
				return;
			}

			g = e.getTermGroups().get(groupIdx);
			if( g.getTerms().size() == 1 ) {
				term t1 = g.getTerms().get(0);
				if( "repeat".equals(t1.getIdentifier()) || "reflect".equals(t1.getIdentifier()) ) {
					groupIdx += 1;
				}
			}
			
			if( e.getTermGroups().size() <= groupIdx ) {
				list.add(new ValidationResult(ValidationStatus.ERROR, "A radial gradient has to have at least one color stop", function, CssDslPackage.Literals.FUNCTION__EXPRESSION, -1));
			} else {
				for( int i = groupIdx; i < e.getTermGroups().size(); i++ ) {
					validateColorStop(e.getTermGroups().get(i), list);
				}
			}
		}
	}
}
