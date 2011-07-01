package at.bestsolution.efxclipse.tooling.css.web;

import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createEnumProperties;
import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.fromList;
import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Proposal;

public class VisualEffects {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(
				createEnumProperties(
					Arrays.asList("visible","hidden","scroll","auto","inherit"), 
						"overflow"
				)
			);
			PROPERTIES.addAll(createReflective(ClipProperty.class, "clip")); 
			PROPERTIES.addAll(
				createEnumProperties(
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
			proposals.addAll(fromList("auto","inherit"));
		}

		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
		
	}
}
