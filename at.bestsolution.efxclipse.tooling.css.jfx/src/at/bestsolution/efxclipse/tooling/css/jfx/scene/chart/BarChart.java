package at.bestsolution.efxclipse.tooling.css.jfx.scene.chart;

import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.PaintProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.SizeProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;

public class BarChart {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(SizeProperty.class, "-fx-bar-gap","-fx-category-gap"));
		properties.addAll(createReflective(PaintProperty.class, "-fx-bar-fill","-fx-bar-stroke"));
		return properties;
	}
}
