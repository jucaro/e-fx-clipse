package at.bestsolution.efxclipse.tooling.css.jfx.scene.control;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createEnumProperties;
import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;

public class ScrollView {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(BooleanProperty.class, "-fx-fit-to-height","-fx-fit-to-width","-fx-pannable"));
		properties.addAll(createEnumProperties(Arrays.asList("never","always","as_needed"), "-fx-hbar-policy","-fx-vbar-policy"));
		return properties;
	}
}
