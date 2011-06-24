package at.bestsolution.efxclipse.tooling.css.web;

import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createEnumProperties;
import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Proposal;

public class Tables {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(
				createEnumProperties(
					Arrays.asList("top","bottom","inherit"), 
					"caption-side")
			);
		PROPERTIES.addAll(
				createEnumProperties(
					Arrays.asList("auto","fixed","inherit"), 
					"table-layout")
			);
		PROPERTIES.addAll(
				createEnumProperties(
					Arrays.asList("collapse","separate","inherit"), 
					"border-collapse")
			);
		
		PROPERTIES.addAll(
				createEnumProperties(
					Arrays.asList("show","hide","inherit"), 
					"empty-cells")
			);
		PROPERTIES.addAll(createReflective(BorderSpacing.class, "border-spacing"));
		return PROPERTIES;
	}
	
	public static class BorderSpacing extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public BorderSpacing(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
}
