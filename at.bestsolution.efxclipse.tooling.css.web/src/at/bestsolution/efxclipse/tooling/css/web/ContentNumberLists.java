package at.bestsolution.efxclipse.tooling.css.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;

public class ContentNumberLists {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("disc","circle","square","decimal","decimal-leading-zero","lower-roman",
							"upper-roman","lower-greek","lower-latin","upper-latin","armenian",
							"georgian","lower-alpha","upper-alpha","none","inherit"), 
					"list-style-type")
			);
			
			PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("inside","outside","inherit"), 
					"list-style-position")
			);
		return PROPERTIES;
	}
}
