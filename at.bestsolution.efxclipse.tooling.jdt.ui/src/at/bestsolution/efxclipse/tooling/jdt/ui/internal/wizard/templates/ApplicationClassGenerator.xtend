package at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard.templates


import at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard.templates.model.JavaClass

class ApplicationClassGenerator implements IGenerator<JavaClass> {
	override generateContent(JavaClass clazzDef) '''
		«IF(clazzDef.packageFragment != null && ! clazzDef.packageFragment.elementName.empty)»package «clazzDef.packageFragment.elementName»;«ENDIF»
		
		import javafx.application.Application;
		import javafx.stage.Stage;
		
		public class «clazzDef.name» extends Application {
		
			@Override
			public void start(Stage primaryStage) {
				
			}
		
			public static void main(String[] args) {
				launch(args);
			}
		}
	 '''
}