package at.bestsolution.efxclipse.tooling.css.jfx.scene.layout;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createEnumProperties;
import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.SizeProperty;

public class HBox {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createEnumProperties(Arrays.asList("left","center","right","leading","trailing"), "-fx-hpos"));
		properties.addAll(createEnumProperties(Arrays.asList("top","center","baseline","bottom","page-end","page-start"), "-fx-node-vpos","-fx-vpos"));
		properties.addAll(createReflective(SizeProperty.class, "-fx-spacing"));
		return properties;
	}
}
