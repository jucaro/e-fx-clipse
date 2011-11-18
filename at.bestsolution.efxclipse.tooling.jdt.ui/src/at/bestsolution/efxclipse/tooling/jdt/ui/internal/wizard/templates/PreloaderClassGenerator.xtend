package at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard.templates


import at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard.templates.model.JavaClass

class PreloaderClassGenerator implements IGenerator<JavaClass> {
	override generateContent(JavaClass clazzDef) '''
		«IF(clazzDef.packageFragment != null && ! clazzDef.packageFragment.elementName.empty)»package «clazzDef.packageFragment.elementName»«ENDIF»;
		
		import javafx.application.Preloader;
		import javafx.stage.Stage;
		
		public class «clazzDef.name» extends Preloader {
			
			public void start(Stage primaryStage) throws Exception {
				
			}
		}
	'''
}