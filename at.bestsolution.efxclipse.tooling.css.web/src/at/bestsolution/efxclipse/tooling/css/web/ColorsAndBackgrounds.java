package at.bestsolution.efxclipse.tooling.css.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Proposal;
import at.bestsolution.efxclipse.tooling.css.web.WebDialectExtension.ColorProperty;
import at.bestsolution.efxclipse.tooling.css.web.WebDialectExtension.TransparentColorProperty;

public class ColorsAndBackgrounds {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		
		PROPERTIES.addAll(WebDialectExtension.createReflective(ColorProperty.class, "color"));
		PROPERTIES.addAll(WebDialectExtension.createReflective(TransparentColorProperty.class, "background-color"));
		PROPERTIES.addAll(WebDialectExtension.createReflective(BackgroundImageProperty.class, "background-image"));
		PROPERTIES.addAll(WebDialectExtension.createEnumProperties(
			Arrays.asList("repeat","repeat-x","repeat-y","no-repeat"), "background-repeat")
		);
		PROPERTIES.addAll(WebDialectExtension.createEnumProperties(
				Arrays.asList("scroll","fixed","inherit"), "background-attachment")
			);
		PROPERTIES.addAll(WebDialectExtension.createReflective(BackgroundPositionProperty.class, "background-position"));
		PROPERTIES.addAll(WebDialectExtension.createReflective(BackgroundProperty.class, "background"));
		
		return PROPERTIES;
	}
	
	private static class BackgroundImageProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public BackgroundImageProperty(String name) {
			super(name);
			proposals.add(new Proposal("url(\"bg.png\")"));
			proposals.addAll(WebDialectExtension.fromList("none","inherit"));
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	private static class BackgroundPositionProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public BackgroundPositionProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	private static class BackgroundProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public BackgroundProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
}