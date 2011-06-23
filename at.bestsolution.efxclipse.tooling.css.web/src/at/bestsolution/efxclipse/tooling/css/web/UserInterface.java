package at.bestsolution.efxclipse.tooling.css.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;

public class UserInterface {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("top","bottom","inherit"), 
					"caption-side")
			);
		PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("auto","fixed","inherit"), 
					"table-layout")
			);
		PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("collapse","separate","inherit"), 
					"border-collapse")
			);
		PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("show","hide","inherit"), 
					"empty-cells")
			);
		return PROPERTIES;
	}
}
