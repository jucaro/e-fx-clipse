package at.bestsolution.efxclipse.tooling.css.jfx.scene.chart;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.PaintProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.SizeProperty;

public class BarChart3D {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(PaintProperty.class, 
				"-fx-bottom-shelf-fill", "-fx-bottom-shelf-stroke","-fx-side-shelf-fill",
				"-fx-side-shelf-stroke", "-fx-zero-shelf-fill", "-fx-zero-shelf-stroke"));
		properties.addAll(createReflective(SizeProperty.class, 
				"-fx-offset-x", "-fx-offset-y"));
		return properties;
	}
}
