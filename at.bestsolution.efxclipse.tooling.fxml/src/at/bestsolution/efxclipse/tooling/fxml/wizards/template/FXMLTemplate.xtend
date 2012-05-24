package at.bestsolution.efxclipse.tooling.fxml.wizards.template

import at.bestsolution.efxclipse.tooling.ui.wizards.template.IGenerator

class FXMLTemplate implements IGenerator<at.bestsolution.efxclipse.tooling.fxml.wizards.template.FXMLElement> { 
	override generateContent(at.bestsolution.efxclipse.tooling.fxml.wizards.template.FXMLElement element) '''
		<?xml version="1.0" encoding="UTF-8"?>
		
		<?import «element.getRootElement.fullyQualifiedName»?>
		
		<«element.getRootElement.elementName» xmlns:fx="http://javafx.com/fxml">
			<!-- TODO Add Nodes -->
		</«element.getRootElement.elementName»>
		
	'''
}