package at.bestsolution.efxclipse.runtime.examples.xtend

import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.layout.BorderPane
import javafx.scene.control.Label
import javafx.scene.control.Slider
import javafx.scene.Scene
import javafx.geometry.Insets
import static extension at.bestsolution.efxclipse.runtime.examples.xtend.PropertyExtension.* 

class BindingSample extends Application {
	
	override start(Stage stage) throws Exception {
		val l = new Label("Hello World")
		val sl_1 = new Slider
		val sl_2 = new Slider
		
		val root = new BorderPane => [
			padding = new Insets(10)
			top = sl_1
			center = l
			bottom = sl_2
		]
		
		sl_1.valueProperty .. sl_2.valueProperty;
		
		l.scaleXProperty -> sl_2.valueProperty;
		l.scaleYProperty -> sl_2.valueProperty;
		
		stage.scene = new Scene(root);
		stage.width = 600;
		stage.height = 600;
		stage.show;
	}

	def static void main(String[] args) {
		launch(args);
	}
		
}