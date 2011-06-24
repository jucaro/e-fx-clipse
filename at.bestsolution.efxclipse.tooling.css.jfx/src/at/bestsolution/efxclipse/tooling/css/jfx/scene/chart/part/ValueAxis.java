package at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.part;

import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.SizeProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.IntegerProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;

public class ValueAxis {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(IntegerProperty.class, "-fx-minor-tick-count"));
		properties.addAll(createReflective(SizeProperty.class, "-fx-minor-tick-length"));
		properties.addAll(createReflective(BooleanProperty.class, "-fx-minor-tick-visible"));
		return properties;
	}
}
