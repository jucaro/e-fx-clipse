package at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard.templates


import at.bestsolution.efxclipse.tooling.ui.wizards.template.JDTElement
import at.bestsolution.efxclipse.tooling.ui.wizards.template.IGenerator

class PreloaderClassGenerator implements IGenerator<JDTElement> {
	override generateContent(JDTElement clazzDef) '''
		«IF(clazzDef.packageFragment != null && ! clazzDef.packageFragment.elementName.empty)»package «clazzDef.packageFragment.elementName»;«ENDIF»
		
		import javafx.application.Preloader;
		import javafx.stage.Stage;
		
		public class «clazzDef.name» extends Preloader {
			
			public void start(Stage primaryStage) throws Exception {
				
			}
		}
	'''
}