package at.bestsolution.efxclipse.tooling.css.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;

public class Text {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("left","right","center","justify","inherit"), 
					"text-align")
			);
		PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("none","underline","overline","line-through","blink","inherit"), 
					"text-decoration")
			);
		PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("capitalize","uppercase","lowercase","none","inherit"), 
					"text-transform")
			);
		PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("normal","pre","nowrap","pre-wrap","pre-line","inherit"), 
					"white-space")
			);
		return PROPERTIES;
	}
}
