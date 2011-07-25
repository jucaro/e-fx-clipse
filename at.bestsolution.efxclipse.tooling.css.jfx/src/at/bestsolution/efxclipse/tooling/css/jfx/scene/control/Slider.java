package at.bestsolution.efxclipse.tooling.css.jfx.scene.control;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.IntegerProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.NumberPropery;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;

public class Slider {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(NumberPropery.class, "-fx-block-increment","-fx-major-tick-unit"));
		properties.addAll(createReflective(BooleanProperty.class, "-fx-click-to-position","-fx-show-tick-labels","-fx-show-tick-marks","-fx-snap-to-ticks","-fx-vertical"));
		properties.addAll(createReflective(IntegerProperty.class, "-fx-minor-tick-count"));
		
		return properties;
	}
}
