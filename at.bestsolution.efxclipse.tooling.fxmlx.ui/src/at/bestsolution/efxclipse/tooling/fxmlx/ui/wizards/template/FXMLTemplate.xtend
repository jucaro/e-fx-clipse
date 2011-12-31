package at.bestsolution.efxclipse.tooling.fxmlx.ui.wizards.template

import at.bestsolution.efxclipse.tooling.ui.wizards.template.IGenerator

class FXMLTemplate implements IGenerator<at.bestsolution.efxclipse.tooling.fxmlx.ui.wizards.template.FXMLElement> { 
	override generateContent(at.bestsolution.efxclipse.tooling.fxmlx.ui.wizards.template.FXMLElement element) '''
		<?xml version="1.0" encoding="UTF-8"?>
		
		<?import «element.getRootElement.fullyQualifiedName»?>
		
		<«element.getRootElement.elementName»>
			<!-- TODO Add Nodes -->
		</«element.getRootElement.elementName»>
		
	'''
}