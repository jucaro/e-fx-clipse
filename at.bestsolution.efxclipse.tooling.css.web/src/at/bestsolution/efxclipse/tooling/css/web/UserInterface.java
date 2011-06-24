package at.bestsolution.efxclipse.tooling.css.web;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Proposal;

public class UserInterface {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(WebDialectExtension.createReflective(OutlineProperty.class, "outline"));
		PROPERTIES.addAll(WebDialectExtension.createReflective(OutlineWidthProperty.class, "outline-width"));
		PROPERTIES.addAll(WebDialectExtension.createReflective(OutlineStyleProperty.class, "outline-style"));
		PROPERTIES.addAll(WebDialectExtension.createReflective(OutlineColorProperty.class, "outline-color"));
		return PROPERTIES;
	}
	
	private static class OutlineProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public OutlineProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	private static class OutlineWidthProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public OutlineWidthProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	private static class OutlineStyleProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public OutlineStyleProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	private static class OutlineColorProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public OutlineColorProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
}
