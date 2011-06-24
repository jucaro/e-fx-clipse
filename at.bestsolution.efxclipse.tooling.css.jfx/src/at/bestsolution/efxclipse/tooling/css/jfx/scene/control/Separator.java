package at.bestsolution.efxclipse.tooling.css.jfx.scene.control;

import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createEnumProperties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;

public class Separator {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createEnumProperties(Arrays.asList("left","center","right","leading","trailing"), "-fx-hpos"));
		properties.addAll(createEnumProperties(Arrays.asList("top","center","baseline","bottom","page-end","page-start"), "-fx-vpos"));
		return properties;
	}
}
