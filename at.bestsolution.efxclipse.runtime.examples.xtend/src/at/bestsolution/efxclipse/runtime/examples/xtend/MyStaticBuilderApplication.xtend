package at.bestsolution.efxclipse.runtime.examples.xtend

import java.io.PrintStream
import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.TextField
import javafx.stage.Stage

import static javafx.application.Application.*

class MyStaticBuilderApplication extends Application {
	private extension FXBuilder b = new FXBuilder
	private extension PrintStream out = System::out

	override start(Stage primaryStage) throws Exception {
		val p = FxHBox(null) [
			children += FxTextfield[
				id = "helloField"
			]
			children += FxButton[
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