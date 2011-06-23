package at.bestsolution.efxclipse.tooling.css.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Proposal;

public class BoxModelProperties {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(
				WebDialectExtension.createReflective(MarginProperty.class, "margin-top","margin-right", "margin-bottom","margin-left") 
			);
			
			PROPERTIES.addAll(
				WebDialectExtension.createReflective(PaddingProperty.class, "padding-top","padding-right","padding-bottom","padding-left")
			);
			
			PROPERTIES.addAll(
				WebDialectExtension.createReflective(BorderWidthProperty.class, "border-top-width","border-right-width","border-bottom-width","border-left-width")
			);
			
			PROPERTIES.addAll(
				WebDialectExtension.createReflective(BorderColorProperty.class, "border-top-color","border-right-color","border-bottom-color","border-left-color")
			);
			
			PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("none","hidden","dotted","dashed","solid","double","groove","ridge","inset","outset"),
					"border-top-style","border-right-style","border-bottom-style","border-left-style"
				)
			);
		return PROPERTIES;
	}
	
	
	public static class MarginProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public MarginProperty(String name) {
			super(name);
			proposals.addAll(WebDialectExtension.createLengthProprosals());
			proposals.add(new Proposal("1%"));
			proposals.add(new Proposal("auto"));
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class PaddingProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public PaddingProperty(String name) {
			super(name);
			proposals.addAll(WebDialectExtension.createLengthProprosals());
			proposals.add(new Proposal("1%"));
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class BorderWidthProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public BorderWidthProperty(String name) {
			super(name);
			proposals.addAll(WebDialectExtension.createLengthProprosals());
			proposals.addAll(WebDialectExtension.fromList("thin","medium","thick")); 
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class BorderColorProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public BorderColorProperty(String name) {
			super(name);
			proposals.addAll(WebDialectExtension.createNamedColorProposals());
			proposals.add(new Proposal("rgb(0,0,0)"));
			proposals.add(new Proposal("#000"));
			proposals.add(new Proposal("#000000"));
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
		
	}
}
