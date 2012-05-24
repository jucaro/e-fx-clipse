package at.bestsolution.efxclipse.runtime.examples.xtend

import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.layout.HBox
import javafx.scene.control.Button
import java.io.PrintStream
import javafx.scene.Scene
import javafx.scene.control.TextField
class MyWithApplication extends Application {
	private extension PrintStream out = System::out

	override start(Stage primaryStage) throws Exception {
		val p = new HBox => [
			children += new TextField => [
				id = "helloField"
			]
			children += new Button => [
				text = "Say hello"
				onAction = [
					val f = primaryStage.scene.root.lookup("#helloField") as TextField
					f.text.println
				]
			]
		]
		
		primaryStage.scene = new Scene(p)
		primaryStage.width = 300
		primaryStage.show
	}
	
	def static void main(String[] args) {
		launch(args)
	}
}