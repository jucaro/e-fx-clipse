package at.bestsolution.efxclipse.tooling.css.jfx.scene.image;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.UrlProperty;

public class ImageView {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(UrlProperty.class, "-fx-image"));
		return properties;
	}
}
