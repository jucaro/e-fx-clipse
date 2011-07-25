package at.bestsolution.efxclipse.tooling.css.jfx.scene.chart;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.NumberPropery;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.FontProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.PaintProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.SizeProperty;

public class PieChart {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(BooleanProperty.class, "-fx-clockwise","-fx-pie-label-visible","-fx-pie-to-label-line-curved","-fx-pie-value-visible"));
		properties.addAll(createReflective(PaintProperty.class, "-fx-pie-label-fill","-fx-pie-stroke","-fx-pie-to-label-line-stroke","-fx-pie-value-label-fill"));
		properties.addAll(createReflective(FontProperty.class, "-fx-pie-label-font","-fx-pie-value-label-font"));
		properties.addAll(createReflective(SizeProperty.class, "-fx-pie-stroke-width"));
		properties.addAll(createReflective(NumberPropery.class, "-fx-pie-to-label-line-one-length","-fx-pie-to-label-line-stroke-width","-fx-pie-to-label-line-two-length","-fx-start-angle"));
		return properties;
	}
}
