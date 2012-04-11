package at.bestsolution.efxclipse.runtime.examples.xtend

import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.layout.BorderPane
import javafx.scene.control.Button
import javafx.scene.Scene
import javafx.scene.control.TextField
import java.io.PrintStream

class MyApplication extends Application {
	
	extension PrintStream out = System::out;
	
	override start(Stage primaryStage) throws Exception {
		val root = new BorderPane
		val button = new Button
		val text = new TextField
		
		button.text = "Say Hello"
	
		button.onAction = [
			text.text.println
		]
		
		root.top = text
		root.bottom = button
		
		primaryStage.scene = new Scene(root)
		primaryStage.width = 300
		primaryStage.show
	}
	
	def static void main(String[] args) {
		launch(args)
	}
}