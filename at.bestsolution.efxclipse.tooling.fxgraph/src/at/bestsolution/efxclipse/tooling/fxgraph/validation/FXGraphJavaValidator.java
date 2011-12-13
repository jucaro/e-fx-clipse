package at.bestsolution.efxclipse.tooling.fxgraph.validation;

import java.io.File;

import org.eclipse.xtext.validation.Check;

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model;
import at.bestsolution.efxclipse.tooling.fxgraph.util.RelativeFileLocator;
 

public class FXGraphJavaValidator extends AbstractFXGraphJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}

	@Check
	public void validateModel(Model model) {
		if( model.getPackage() == null ) {
			warning("You should add a package declaration to use a namespace", FXGraphPackage.Literals.MODEL__PACKAGE);
		} else {
			//TODO Validate package nameIJa
		}
	}
	
	@Check
	public void validateComponent(ComponentDefinition componentDef) {
		int i = 0;
		for( String cssFile : componentDef.getPreviewCssFiles() ) {
			File absFile = RelativeFileLocator.locateFile(componentDef.eResource().getURI(),
					cssFile);
			if( absFile == null || ! absFile.exists() ) {
				warning("The specified file '"+cssFile+"' could not be found", FXGraphPackage.Literals.COMPONENT_DEFINITION__PREVIEW_CSS_FILES,i);
			}
			
			i++;
		}
		
		if( componentDef.getPreviewResourceBundle() != null ) {
			File absFile = RelativeFileLocator.locateFile(componentDef.eResource().getURI(),
					componentDef.getPreviewResourceBundle());
			
			if( absFile == null || ! absFile.exists() ) {
				error("The specified resource file '"+componentDef.getPreviewResourceBundle()+"'", FXGraphPackage.Literals.COMPONENT_DEFINITION__PREVIEW_RESOURCE_BUNDLE);
			}
		}
	}
}
