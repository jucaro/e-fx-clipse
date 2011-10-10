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
import at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension;

/**
 * @author Tom Schindl
 * <linear-gradient> = linear-gradient(
 * 		[ [from <point> to <point>] | [ to <side-or-corner> ] ] ,]? [ [ repeat | reflect ] ,]?
 * 		<color-stop>[, <color-stop>]+
 * 	)
 * 
 * 	<point> = <percentage> <percentage> | <length> <length>
 * 	<side-or-corner> = [left | right] || [top | bottom] 
 */
public class LinearGradientValidator extends GradientValidator {
	public static void validateLinearGradient(function function, List<ValidationResult> list) {
		expr e = function.getExpression();
		if( e.getTermGroups().size() > 0 ) {
			termGroup g = e.getTermGroups().get(0);
			if( g.getTerms().size() > 0 ) {
				if( "from".equals(g.getTerms().get(0).getIdentifier()) ) {
					if( g.getTerms().size() == 6 ) {
						JFXDialectExtension.validateSize(g.getTerms().get(1), list);
						JFXDialectExtension.validateSize(g.getTerms().get(2), list);
						if( ! "to".equals(g.getTerms().get(3).getIdentifier()) ) {
							list.add(new ValidationResult(ValidationStatus.ERROR, "The value has to be 'to'", g.getTerms().get(3), null, -1));
						}
						JFXDialectExtension.validateSize(g.getTerms().get(4), list);
						JFXDialectExtension.validateSize(g.getTerms().get(5), list);
						
						if( e.getTermGroups().size() > 1 ) {
							g = e.getTermGroups().get(1);
							if( g.getTerms().size() > 0 ) {
								if( g.getTerms().size() == 1 ) {
									if( "repeat".equals(g.getTerms().get(0).getIdentifier()) || "reflect".equals(g.getTerms().get(0).getIdentifier()) ) {
										if( e.getTermGroups().size() > 2 ) {
											for( int i = 2; i < e.getTermGroups().size(); i++ ) {
												validateColorStop(e.getTermGroups().get(i),list);
											}
										} else {
											list.add(new ValidationResult(ValidationStatus.ERROR, "You need to specify at least one color stop", g, null, -1));
										}
									} else {
										for( int i = 1; i < e.getTermGroups().size(); i++ ) {
											validateColorStop(e.getTermGroups().get(i),list);
										}
									}
								} else {
									for( int i = 1; i < e.getTermGroups().size(); i++ ) {
										validateColorStop(e.getTermGroups().get(i),list);
									}
								}
							} else {
								list.add(new ValidationResult(ValidationStatus.ERROR, "You need to specify at least one color stop", function, CssDslPackage.Literals.FUNCTION__EXPRESSION, -1));
							}
						} else {
							list.add(new ValidationResult(ValidationStatus.ERROR, "You need to specify at least one color stop", function, CssDslPackage.Literals.FUNCTION__EXPRESSION, -1));
						}
					} else {
						list.add(new ValidationResult(ValidationStatus.ERROR, "First element has to be 'from <size> <size> to <size> <size>'", g, null, -1));
					}
				} else if( "to".equals(g.getTerms().get(0).getIdentifier()) ) {
					if( g.getTerms().size() == 2 || g.getTerms().size() == 3 ) {
						String v = g.getTerms().get(1).getIdentifier();
						if( !("bottom".equals(v) || "top".equals(v) || "left".equals(v) || "right".equals(v)) ) {
							list.add(new ValidationResult(ValidationStatus.ERROR, "The value has to be top, bottom, left, right", g, null, -1));
						}
						
						if( g.getTerms().size() == 3 ) {
							if( !("bottom".equals(v) || "top".equals(v)) ) {
								list.add(new ValidationResult(ValidationStatus.ERROR, "The value has to be to or bottom", g, null, -1));
							}
							
							v = g.getTerms().get(2).getIdentifier();
							if( !("left".equals(v) || "right".equals(v)) ) {
								list.add(new ValidationResult(ValidationStatus.ERROR, "The value has to be left or right", g, null, -1));
							}
						}
						
						if( e.getTermGroups().size() > 1 ) {
							g = e.getTermGroups().get(1);
							if( g.getTerms().size() > 0 ) {
								if( g.getTerms().size() == 1 ) {
									if( "repeat".equals(g.getTerms().get(0).getIdentifier()) || "reflect".equals(g.getTerms().get(0).getIdentifier()) ) {
										if( e.getTermGroups().size() > 1 ) {
											for( int i = 2; i < e.getTermGroups().size(); i++ ) {
												validateColorStop(e.getTermGroups().get(i),list);
											}
										} else {
											list.add(new ValidationResult(ValidationStatus.ERROR, "You need to specify at least one color stop", g, null, -1));
										}
									} else {
										for( int i = 1; i < e.getTermGroups().size(); i++ ) {
											validateColorStop(e.getTermGroups().get(i),list);
										}
									}
								} else {
									for( int i = 1; i < e.getTermGroups().size(); i++ ) {
										validateColorStop(e.getTermGroups().get(i),list);
									}
								}
							} else {
								list.add(new ValidationResult(ValidationStatus.ERROR, "You need to specify at least one color stop", function, CssDslPackage.Literals.FUNCTION__EXPRESSION, -1));
							}
						} else {
							list.add(new ValidationResult(ValidationStatus.ERROR, "You need to specify at least one color stop", function, CssDslPackage.Literals.FUNCTION__EXPRESSION, -1));
						}
					} else {
						list.add(new ValidationResult(ValidationStatus.ERROR, "The to group has to have a 2nd term left, right and top, bottom", g, null, -1));
					}
				} else if( "repeat".equals(g.getTerms().get(0).getIdentifier()) || "reflect".equals(g.getTerms().get(0).getIdentifier()) ) {
					if( e.getTermGroups().size() > 1 ) {
						for( int i = 1; i < e.getTermGroups().size(); i++ ) {
							validateColorStop(e.getTermGroups().get(i),list);
						}
					} else {
						list.add(new ValidationResult(ValidationStatus.ERROR, "You need to specify at least one color stop", function, CssDslPackage.Literals.FUNCTION__EXPRESSION, -1));
					}
				} else {
					for( termGroup stopGroup : e.getTermGroups() ) {
						validateColorStop(stopGroup,list);	
					}
				}
			} else {
				list.add(new ValidationResult(ValidationStatus.ERROR, "You need to specify at least one color stop", function, CssDslPackage.Literals.FUNCTION__EXPRESSION, -1));
			}
		} else {
			list.add(new ValidationResult(ValidationStatus.ERROR, "You need to specify at least one color stop", function, CssDslPackage.Literals.FUNCTION__EXPRESSION, -1));
		}
	}
}
