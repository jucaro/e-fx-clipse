package at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.part;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.Number4TimesProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.PaintProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.SizeProperty;

public class Legend {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(Number4TimesProperty.class, "-fx-background-insets"));
		properties.addAll(createReflective(PaintProperty.class, "-fx-fill","-fx-stroke","-fx-text-fill"));
		properties.addAll(createReflective(SizeProperty.class, "-fx-stroke-width"));
		properties.addAll(createReflective(BooleanProperty.class, "-fx-vertical"));
		
		return properties;
	}
}
