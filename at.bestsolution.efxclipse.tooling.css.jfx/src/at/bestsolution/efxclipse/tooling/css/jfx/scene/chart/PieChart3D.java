package at.bestsolution.efxclipse.tooling.css.jfx.scene.chart;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.SizeProperty;

public class PieChart3D {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(SizeProperty.class, "-fx-pie-thickness"));
		return properties;
	}
}