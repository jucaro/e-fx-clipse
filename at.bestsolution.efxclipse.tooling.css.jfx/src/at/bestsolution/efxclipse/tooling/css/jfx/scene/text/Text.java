package at.bestsolution.efxclipse.tooling.css.jfx.scene.text;

import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createEnumProperties;
import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;

public class Text {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(BooleanProperty.class, "-fx-strikethrough","-fx-underline"));
		properties.addAll(createEnumProperties(Arrays.asList("left","center","right","justify"), "-fx-text-alignment"));
		properties.addAll(createEnumProperties(Arrays.asList("baseline","top","bottom"), "-fx-text-alignment"));
		
		return properties;
	}
}
