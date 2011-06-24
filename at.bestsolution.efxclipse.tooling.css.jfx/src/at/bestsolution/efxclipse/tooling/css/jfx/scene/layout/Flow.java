package at.bestsolution.efxclipse.tooling.css.jfx.scene.layout;

import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createReflective;
import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createEnumProperties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.SizeProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;

public class Flow {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(SizeProperty.class, "-fx-hgap","-fx-vgap"));
		properties.addAll(createEnumProperties(
				Arrays.asList("left","center","right","leading","trailing"), "-fx-hpos", "-fx-node-hpos"));
		properties.addAll(createEnumProperties(
				Arrays.asList("top","center","baseline","bottom","page-end","page-start"), "-fx-vpos", "-fx-node-vpos"));
		properties.addAll(createReflective(BooleanProperty.class, "-fx-vertical"));
		return properties;
	}
}
