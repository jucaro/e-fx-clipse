package at.bestsolution.efxclipse.tooling.css.jfx.scene.chart;

import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.NumberPropery;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;

public class LineChart {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(NumberPropery.class, "-fx-data-opacity"));
		properties.addAll(createReflective(BooleanProperty.class, "-fx-show-symbols"));
		return properties;
	}
}
