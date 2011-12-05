package at.bestsolution.efxclipse.tooling.fxgraph.ui.handler

import at.bestsolution.efxclipse.tooling.fxml2.fXML.Model
import at.bestsolution.efxclipse.tooling.fxml2.fXML.ClassDefinition
import at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyAttributeDefinition

class FXMLToFXGraphConvert {
	def generate(Model fxmlModel) '''
		«FOR imp : fxmlModel.imports»
		import «imp.value»
		«ENDFOR»
		
		component «fxmlModel.eResource.URI.lastSegment.substring(0,fxmlModel.eResource.URI.lastSegment.length-4)» {
			«generateClassContent(fxmlModel.root)»
		}
	'''
	
	def generateClassContent(ClassDefinition classdef) '''
		«classdef.name» {
			«FOR p : classdef.attributes»
				«IF toType(p) == PropertyType::SIMPLE_STRING»
					«p.name» : "«p.value»"«IF p != classdef.attributes.last»,«ENDIF»
				«ELSEIF toType(p) == PropertyType::SIMPLE_NUMBER»
					«p.name» : «p.value»«IF p != classdef.attributes.last»,«ENDIF»
				«ELSEIF toType(p) == PropertyType::CONTROLLER_METHOD»
					«p.name» : controllermethod «p.value»«IF p != classdef.attributes.last»,«ENDIF»
				«ENDIF»
			«ENDFOR»
		}
	'''
	
	def toType(PropertyAttributeDefinition prop) {
		try {
			Double::parseDouble(prop.value);
			return PropertyType::SIMPLE_NUMBER;
		} catch(NumberFormatException e) {
		}
		
		if( prop.value.startsWith("#") ) {
			return PropertyType::CONTROLLER_METHOD;
		}
		
		return PropertyType::SIMPLE_STRING;
	}
}