package at.bestsolution.efxclipse.tooling.css.web;

import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Proposal;

public class UserInterface {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(createReflective(OutlineProperty.class, "outline"));
		PROPERTIES.addAll(createReflective(OutlineWidthProperty.class, "outline-width"));
		PROPERTIES.addAll(createReflective(OutlineStyleProperty.class, "outline-style"));
		PROPERTIES.addAll(createReflective(OutlineColorProperty.class, "outline-color"));
		return PROPERTIES;
	}
	
	public static class OutlineProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public OutlineProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class OutlineWidthProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public OutlineWidthProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class OutlineStyleProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public OutlineStyleProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class OutlineColorProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public OutlineColorProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
}
