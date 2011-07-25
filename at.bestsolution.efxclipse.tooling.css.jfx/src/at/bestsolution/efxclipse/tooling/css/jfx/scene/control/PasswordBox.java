package at.bestsolution.efxclipse.tooling.css.jfx.scene.control;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.StringProperty;

public class PasswordBox {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(StringProperty.class, "-fx-echo-char"));
		return properties;
	}
}
