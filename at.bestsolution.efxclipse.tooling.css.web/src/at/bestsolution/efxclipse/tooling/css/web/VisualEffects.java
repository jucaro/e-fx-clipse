package at.bestsolution.efxclipse.tooling.css.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Proposal;

public class VisualEffects {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("visible","hidden","scroll","auto","inherit"), 
						"overflow"
				)
			);
			PROPERTIES.addAll(WebDialectExtension.createReflective(ClipProperty.class, "clip")); 
			PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("visible","hidden","collapse","inherit"), 
					"visibility"
				)
			);
		return PROPERTIES;
	}
	
	public static class ClipProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public ClipProperty(String name) {
			super(name);
			proposals.add(new Proposal("rect(0,0,0,0)"));
			proposals.addAll(WebDialectExtension.fromList("auto","inherit"));
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
		
	}
}
