package at.bestsolution.efxclipse.tooling.fxml.model.generator

import at.bestsolution.efxclipse.tooling.fxml.model.FXMLDocumentDefinition
import at.bestsolution.efxclipse.tooling.fxml.model.ElementDefinition
import at.bestsolution.efxclipse.tooling.fxml.model.PropertyDefinition
import at.bestsolution.efxclipse.tooling.fxml.model.ValuePropertyDefinition
import at.bestsolution.efxclipse.tooling.fxml.model.ListPropertyDefinition
import at.bestsolution.efxclipse.tooling.fxml.model.MapPropertyDefinition

class FXMLGen {
	def generate(FXMLDocumentDefinition definition) '''
		<?xml version="1.0"?>
		
		«FOR i : definition.imports»
		<?import «i.namespace»?>
		«ENDFOR»
		
		«elementDef(definition.rootElement)»
	'''
	
	def elementDef(ElementDefinition eDef) '''
		<«eDef.name»>
			«FOR p : eDef.staticPropertyDefinitions»
			<«p.name»>
				«propertyDef(p)»
			</«p.name»>
			«ENDFOR»
			«FOR p : eDef.elementPropertyDefinitions»
			<«p.name»>
				«propertyDef(p)»
			</«p.name»>
			«ENDFOR»
		</«eDef.name»>
	'''
	
	def propertyDef(PropertyDefinition d) {
		if( d instanceof ValuePropertyDefinition ) {
			val v = d as ValuePropertyDefinition;
			if( v.value instanceof ElementDefinition ) {
				return elementDef(v.value as ElementDefinition);
			} else {
				return v.value;	
			}
		} else if( d instanceof ListPropertyDefinition ) {
			return listProp(d as ListPropertyDefinition);
		} else if( d instanceof MapPropertyDefinition ) {
			return mapProp(d as MapPropertyDefinition);
		}
		
		return "";
	}
	
	def mapProp(MapPropertyDefinition mp) '''
		«FOR o : mp.subelementValues»
			<«o.name»>
				«propertyDef(o)»
			</«o.name»>
		«ENDFOR»
	'''
	
	def listProp(ListPropertyDefinition lp) '''
		«FOR o : lp.values»
			«IF o instanceof ElementDefinition»
				«elementDef(o as ElementDefinition)»
			«ELSE»
				«o»
			«ENDIF»
		«ENDFOR»
	'''
}