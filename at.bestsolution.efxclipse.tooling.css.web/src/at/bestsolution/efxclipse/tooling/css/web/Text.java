package at.bestsolution.efxclipse.tooling.css.web;

import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createEnumProperties;
import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Proposal;


public class Text {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(
				createEnumProperties(
					Arrays.asList("left","right","center","justify","inherit"), 
					"text-align")
			);
		PROPERTIES.addAll(
				createEnumProperties(
					Arrays.asList("none","underline","overline","line-through","blink","inherit"), 
					"text-decoration")
			);
		PROPERTIES.addAll(
				createEnumProperties(
					Arrays.asList("capitalize","uppercase","lowercase","none","inherit"), 
					"text-transform")
			);
		PROPERTIES.addAll(
				createEnumProperties(
					Arrays.asList("normal","pre","nowrap","pre-wrap","pre-line","inherit"), 
					"white-space")
			);
		PROPERTIES.addAll(createReflective(TextIdentProperty.class, "text-ident"));
		PROPERTIES.addAll(createReflective(LetterSpacingProperty.class, "letter-spacing"));
		PROPERTIES.addAll(createReflective(WordSpacingProperty.class, "word-spacing"));
		return PROPERTIES;
	}
	
	public static class TextIdentProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public TextIdentProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class LetterSpacingProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public LetterSpacingProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class WordSpacingProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public WordSpacingProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
}
