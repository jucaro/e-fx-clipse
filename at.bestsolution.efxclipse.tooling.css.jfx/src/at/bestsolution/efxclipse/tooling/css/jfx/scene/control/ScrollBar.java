package at.bestsolution.efxclipse.tooling.css.jfx.scene.control;

import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.NumberPropery;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;

public class ScrollBar {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(NumberPropery.class, "-fx-block-increment","-fx-unit-increment"));
		properties.addAll(createReflective(BooleanProperty.class, "-fx-block-increment"));
		return properties;
	}
}