package at.bestsolution.efxclipse.tooling.css.web;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Proposal;

public class VirtualFormattingModelDetails {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(WebDialectExtension.createReflective(WidthHeightProperty.class, "width","height"));
		PROPERTIES.addAll(WebDialectExtension.createReflective(MinWidthHeightProperty.class, "min-width","min-height"));
		PROPERTIES.addAll(WebDialectExtension.createReflective(MaxWidthHeightProperty.class, "max-width","max-height"));
		PROPERTIES.addAll(WebDialectExtension.createReflective(LineHeightProperty.class, "line-height"));
		PROPERTIES.addAll(WebDialectExtension.createReflective(VerticalAlignProperty.class, "vertical-align"));
		return PROPERTIES;
	}
	
	
	public static class WidthHeightProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public WidthHeightProperty(String name) {
			super(name);
			proposals.addAll(WebDialectExtension.createLengthProprosals());
			proposals.add(new Proposal("1%"));
			proposals.add(new Proposal("auto"));
			proposals.add(new Proposal("inherit"));
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
		
	}
	
	public static class LineHeightProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public LineHeightProperty(String name) {
			super(name);
			proposals.add(new Proposal("normal"));
			proposals.addAll(WebDialectExtension.createLengthProprosals());
			proposals.add(new Proposal("1"));
			proposals.add(new Proposal("1%"));
			proposals.add(new Proposal("inherit"));
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class MaxWidthHeightProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public MaxWidthHeightProperty(String name) {
			super(name);
			proposals.addAll(WebDialectExtension.createLengthProprosals());
			proposals.add(new Proposal("1%"));
			proposals.add(new Proposal("none"));
			proposals.add(new Proposal("inherit"));
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
		
	}
	
	public static class MinWidthHeightProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public MinWidthHeightProperty(String name) {
			super(name);
			proposals.addAll(WebDialectExtension.createLengthProprosals());
			proposals.add(new Proposal("1%"));
			proposals.add(new Proposal("inherit"));
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
		
	}
	
	public static class VerticalAlignProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public VerticalAlignProperty(String name) {
			super(name);
			proposals.addAll(WebDialectExtension.fromList("baseline","sub","super","top","text-top","middle","bottom","text-bottom"));
			proposals.addAll(WebDialectExtension.createLengthProprosals());
			proposals.add(new Proposal("1%"));
			proposals.add(new Proposal("inherit"));
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
}
