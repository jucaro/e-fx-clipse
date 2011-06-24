package at.bestsolution.efxclipse.tooling.css.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Proposal;

public class Text {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("left","right","center","justify","inherit"), 
					"text-align")
			);
		PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("none","underline","overline","line-through","blink","inherit"), 
					"text-decoration")
			);
		PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("capitalize","uppercase","lowercase","none","inherit"), 
					"text-transform")
			);
		PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("normal","pre","nowrap","pre-wrap","pre-line","inherit"), 
					"white-space")
			);
		PROPERTIES.addAll(WebDialectExtension.createReflective(TextIdentProperty.class, "text-ident"));
		PROPERTIES.addAll(WebDialectExtension.createReflective(LetterSpacingProperty.class, "letter-spacing"));
		PROPERTIES.addAll(WebDialectExtension.createReflective(WordSpacingProperty.class, "word-spacing"));
		return PROPERTIES;
	}
	
	private static class TextIdentProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public TextIdentProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	private static class LetterSpacingProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public LetterSpacingProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	private static class WordSpacingProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public WordSpacingProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
}
