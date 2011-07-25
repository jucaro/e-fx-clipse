package at.bestsolution.efxclipse.tooling.css.jfx.scene.control;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.IntegerProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;

public class TextBox {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(IntegerProperty.class, "-fx-lines"));
		
		return properties;
	}
}
