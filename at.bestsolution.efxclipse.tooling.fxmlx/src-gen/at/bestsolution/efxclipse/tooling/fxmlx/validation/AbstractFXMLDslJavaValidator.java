package at.bestsolution.efxclipse.tooling.fxmlx.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractFXMLDslJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage.eINSTANCE);
		return result;
	}

}
