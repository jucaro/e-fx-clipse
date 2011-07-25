package at.bestsolution.efxclipse.tooling.css.web;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createEnumProperties;
import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.IntegerProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;

public class PagedMedia {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(
			createEnumProperties(
				Arrays.asList("auto","always","avoid","left","right","inherit"), 
				"page-break-before")
		);
		PROPERTIES.addAll(
			createEnumProperties(
				Arrays.asList("auto","always","avoid","left","right","inherit"), 
				"page-break-after")
		);
		PROPERTIES.addAll(
			createEnumProperties(
				Arrays.asList("avoid","auto","inherit"), 
				"page-break-inside")
		);
		PROPERTIES.addAll(createReflective(IntegerProperty.class, "orphans","widows"));
		
		return PROPERTIES;
	}
}
