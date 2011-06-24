package at.bestsolution.efxclipse.tooling.css.jfx.scene.control;

import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.IntegerProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.NumberPropery;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;

public class Slider {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(NumberPropery.class, "-fx-block-increment","-fx-major-tick-unit"));
		properties.addAll(createReflective(BooleanProperty.class, "-fx-click-to-position","-fx-show-tick-labels","-fx-show-tick-marks","-fx-snap-to-ticks","-fx-vertical"));
		properties.addAll(createReflective(IntegerProperty.class, "-fx-minor-tick-count"));
		
		return properties;
	}
}
