package at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.part;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.SizeProperty;

public class CategoryAxis {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(SizeProperty.class, "-fx-end-margin","-fx-start-margin"));
		properties.addAll(createReflective(BooleanProperty.class, "-fx-gap-start-and-end"));
		return properties;
	}
}
