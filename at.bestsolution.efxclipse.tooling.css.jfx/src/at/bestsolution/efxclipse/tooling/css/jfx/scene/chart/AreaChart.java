package at.bestsolution.efxclipse.tooling.css.jfx.scene.chart;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.NumberPropery;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;

public class AreaChart {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(NumberPropery.class, "-fx-data-opacity"));
		return properties;
	}
}
