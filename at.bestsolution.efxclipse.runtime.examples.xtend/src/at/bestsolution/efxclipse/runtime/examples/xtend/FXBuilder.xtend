package at.bestsolution.efxclipse.runtime.examples.xtend

import java.util.List
import javafx.scene.Node
import javafx.scene.control.Button
import javafx.scene.control.TextField
import javafx.scene.layout.BorderPane
import javafx.scene.layout.HBox

class FXBuilder {
	def FxBorderPane(Node it, (BorderPane)=>void f) {
		val borderPane = new BorderPane
		f.apply(borderPane)
		borderPane
	}
	
	def FxButton(Node it, (Button)=>void f) { 
		val button = new Button
		f.apply(button)
		button
	}
	
	def FxTextfield(Node it, (TextField)=>void f) {
		val textField = new TextField
		f.apply(textField)
		textField
	}
	
	def FxHBox(Node it, (HBox)=>void f) {
		val box = new HBox
		f.apply(box)
		box
	}
	
	def <N extends Object>FxBean(Object it, Class<N> clazz, (N)=>void f) {
		val c = clazz.newInstance
		f.apply(c);
		c
	}
	
	def <N extends Object>FxElement(Object it, Class<N> clazz, List<Class<?>> types, List<? extends Object> params, (N)=>void f) {
		
		val c = ReflectionHelper::createInstance(clazz, types, params)
		f.apply(c);
		c
	}
}