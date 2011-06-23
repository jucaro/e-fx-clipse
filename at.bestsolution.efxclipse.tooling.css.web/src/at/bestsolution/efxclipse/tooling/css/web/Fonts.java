package at.bestsolution.efxclipse.tooling.css.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;

public class Fonts {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("normal","italic","oblique","inherit"), 
					"font-style")
			);
			PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("normal","small-caps","inherit"), 
					"font-variant")
			);
			PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("normal","bold","bolder","lighter","100","200","300","400","500","600","700","800","900","inherit"), 
					"font-weight")
			);
		return PROPERTIES;
	}
}
