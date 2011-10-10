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
package at.bestsolution.efxclipse.tooling.css.validation;

import org.eclipse.xtext.validation.Check;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.ValidationResult;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.ValidationStatus;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration;
import at.bestsolution.efxclipse.tooling.css.internal.CssDialectExtensionComponent;
 

public class CssDslJavaValidator extends AbstractCssDslJavaValidator {
	private CssDialectExtensionComponent extension;
	
	public CssDslJavaValidator() {
		BundleContext context = FrameworkUtil.getBundle(CssDslJavaValidator.class).getBundleContext();
		ServiceReference<CssDialectExtensionComponent> ref = context.getServiceReference(CssDialectExtensionComponent.class);
		if( ref != null ) {
			extension = context.getService(ref);	
		}
	}
//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}

	@Check
	public void checkDeclaration(css_generic_declaration dec) {
		String propertyName = dec.getProperty();
		
		if( propertyName == null || propertyName.trim().length() == 0 ) {
			return;
		}
		
		if( dec.getExpression().getTermGroups().size() == 1 && dec.getExpression().getTermGroups().get(0).getTerms().size() == 1 && ("null".equals(dec.getExpression().getTermGroups().get(0).getTerms().get(0).getIdentifier()) || "inherit".equals(dec.getExpression().getTermGroups().get(0).getTerms().get(0).getIdentifier()) ) ) {
			return;
		}

		ValidationResult[] results = new ValidationResult[0];
		for( Property p : extension.getProperties(dec.eResource().getURI()) ) {
			if( propertyName.equals(p.getName()) ) {
				
				ValidationResult[] r = p.validate(dec);
				
				// At least one validation succeed
				if( r == null || r.length == 0 ) {
					return;
				} else if( r != null ) {
					results = r;
				}
			}
		}
		
		for( ValidationResult r : results ) {
			if( r.status == ValidationStatus.ERROR ) {
				if( r.object == null ) {
					error( r.message, CssDslPackage.Literals.CSS_GENERIC_DECLARATION__EXPRESSION );
				} else if( r.index == -1 ) {
					error(r.message, r.object, r.feature, 0);
				} else {
					error(r.message, r.object, r.feature, r.index);
				}
			} else if( r.status == ValidationStatus.WARNING ) {
				if( r.object == null ) {
					warning( r.message, CssDslPackage.Literals.CSS_GENERIC_DECLARATION__EXPRESSION );
				} else if( r.index == -1 ) {
					warning(r.message, r.object, r.feature, 0);
				} else {
					warning(r.message, r.object, r.feature, r.index);
				}
			}
		}
		
//		System.err.println("Checking: " + extension + " => " + dec);
	}
}
