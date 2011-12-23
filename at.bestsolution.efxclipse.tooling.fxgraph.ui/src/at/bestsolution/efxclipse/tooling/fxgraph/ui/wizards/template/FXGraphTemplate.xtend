package at.bestsolution.efxclipse.tooling.fxgraph.ui.wizards.template

import at.bestsolution.efxclipse.tooling.ui.wizards.template.IGenerator

class FXGraphTemplate implements IGenerator<FXGraphElement> {
	override generateContent(FXGraphElement element) '''
		«IF(element.packageFragment != null && ! element.packageFragment.elementName.empty)»package «element.packageFragment.elementName»«ENDIF»
		
		import «element.rootElement.fullyQualifiedName»
		
		component «element.name» {
			«element.rootElement.elementName» {
				//TODO Add Nodes
			}
		}
	'''
}