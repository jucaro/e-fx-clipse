package at.bestsolution.efxclipse.tooling.css.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;

public class PagedMedia {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("auto","always","avoid","left","right","inherit"), 
					"page-break-before")
			);
			PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("auto","always","avoid","left","right","inherit"), 
					"page-break-after")
			);
			PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("avoid","auto","inherit"), 
					"page-break-inside")
			);
		return PROPERTIES;
	}
}
