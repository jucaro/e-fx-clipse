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
		
		for( Property p : extension.getProperties() ) {
			if( propertyName.equals(p) ) {
				for( ValidationResult r : p.validate(dec) ) {
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
			}
		}
		
		System.err.println("Checking: " + extension + " => " + dec);
	}
}
