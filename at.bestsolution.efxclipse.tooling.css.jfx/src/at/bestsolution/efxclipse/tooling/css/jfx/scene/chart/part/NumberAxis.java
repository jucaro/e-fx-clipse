package at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.part;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.PaintProperty;

public class NumberAxis {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(PaintProperty.class, "-fx-fill","-fx-hover-fill"));
		return properties;
	}
}