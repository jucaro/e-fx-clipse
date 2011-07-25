package at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.part;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.FontFamilyProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.FontProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.FontSizeProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.FontStyleProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.FontWeightProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.PaintProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.SizeProperty;

public class Axis {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(PaintProperty.class, "-fx-axis-stroke","-fx-label-fill","-fx-tick-mark-stroke"));
		properties.addAll(createReflective(SizeProperty.class, "-fx-axis-stroke-width","-fx-tick-label-tick-gap","-fx-tick-mark-length","-fx-tick-mark-stroke-width"));
		properties.addAll(createReflective(FontProperty.class, "-fx-label-font"));
		properties.addAll(createReflective(FontFamilyProperty.class, "-fx-tick-label-font-family"));
		properties.addAll(createReflective(FontSizeProperty.class, "-fx-tick-label-font-size"));
		properties.addAll(createReflective(FontStyleProperty.class, "-fx-tick-label-font-style"));
		properties.addAll(createReflective(FontWeightProperty.class, "-fx-tick-label-font-weight"));
		properties.addAll(createReflective(BooleanProperty.class, "-fx-tick-labels-visible","-fx-tick-mark-visible"));
		return properties;
	}
}
