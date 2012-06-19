package at.bestsolution.efxclipse.runtime.examples.xtend

import javafx.beans.property.DoubleProperty

class PropertyExtension {
	 def static operator_mappedTo(DoubleProperty x, DoubleProperty y) {
		x.bind(y);
	}
	
	def static operator_upTo(DoubleProperty x, DoubleProperty y) {
		x.bindBidirectional(y);
	}
}