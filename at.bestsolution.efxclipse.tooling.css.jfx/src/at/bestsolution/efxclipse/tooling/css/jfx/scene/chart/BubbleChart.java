package at.bestsolution.efxclipse.tooling.css.jfx.scene.chart;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.NumberPropery;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;

public class BubbleChart {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(NumberPropery.class, "-fx-radius-scale"));
		properties.addAll(createReflective(BooleanProperty.class, "-fx-scale-bubble-radius-using-axis"));
		return properties;
	}
}
