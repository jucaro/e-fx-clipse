package at.bestsolution.efxclipse.tooling.css.jfx.scene.control;

import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createReflective;
import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.fromList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.term;
import at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.MultiPaint4TimesProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.MultiPaintProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.MultiSize4TimesProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.MultiTermGroupProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.MultiValuesGroupProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Proposal;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.StringProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.UrlsProperty;

public class Region {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(MultiPaintProperty.class, "-fx-background-color"));
		properties.addAll(createReflective(MultiSize4TimesProperty.class, "-fx-background-insets","-fx-background-radius","-fx-border-insets","-fx-border-radius","-fx-border-width","-fx-border-image-insets","-fx-border-image-width"));
		properties.addAll(createReflective(UrlsProperty.class, "-fx-background-image","-fx-border-image"));
		properties.addAll(createReflective(BackgroundPositionProperty.class, "-fx-background-image-position"));
		properties.addAll(createReflective(BackgroundRepeatProperty.class, "-fx-background-image-repeat"));
		properties.addAll(createReflective(BackgroundImageSizeProperty.class, "-fx-background-image-size"));
		properties.addAll(createReflective(MultiPaint4TimesProperty.class, "-fx-border-color"));
		properties.addAll(createReflective(BorderStyleProperty.class, "-fx-border-style"));
		properties.addAll(createReflective(BorderImageRepeatProperty.class, "-fx-border-image-slice"));
		properties.addAll(createReflective(BooleanProperty.class, "-fx-position-shape","-fx-scale-shape"));
		properties.addAll(createReflective(StringProperty.class, "-fx-shape"));
		
		return properties;
	}
	
	public static class BackgroundPositionProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public BackgroundPositionProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class BackgroundRepeatProperty extends Property implements MultiTermGroupProperty, MultiValuesGroupProperty {
		private List<Proposal> firstValueProposals = new ArrayList<Proposal>();
		private List<Proposal> secondValueProposals = new ArrayList<Proposal>();
		
		public BackgroundRepeatProperty(String name) {
			super(name);
			firstValueProposals.addAll(fromList("repeat-x","repeat-y"));
			firstValueProposals.addAll(fromList("repeat","space","round","no-repeat"));
			secondValueProposals.addAll(fromList("repeat","space","round","no-repeat"));
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return firstValueProposals;
		}

		@Override
		public List<Proposal> getNextTermProposal(int index,
				termGroup currentGroup, term term) {
			if( index == 1 ) {
				if( ! currentGroup.getTerms().get(0).getIdentifier().startsWith("repeat-") ) {
					return secondValueProposals;
				}
			}
			
			return Collections.emptyList();
		}

		@Override
		public List<Proposal> getInitialTermProposal(int index,
				css_declaration currentDeclaration) {
			return firstValueProposals;
		}
	}
	
	public static class BackgroundImageSizeProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public BackgroundImageSizeProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class BorderStyleProperty extends Property implements MultiTermGroupProperty, MultiValuesGroupProperty {
		private List<Proposal> dashStyles = new ArrayList<Proposal>();
		private List<Proposal> styleLocations = new ArrayList<Proposal>();
		private List<Proposal> lineJoins = new ArrayList<Proposal>();
		private List<Proposal> lineCaps = new ArrayList<Proposal>();
		
		public BorderStyleProperty(String name) {
			super(name);
			dashStyles.addAll(fromList("none","solid","dotted","dashed"));
			styleLocations.addAll(fromList("centered","inside","outside"));
			lineJoins.addAll(fromList("line-join miter <number>","line-join bevel","line-join round"));
			lineCaps.addAll(fromList("line-cap square","line-cap butt","line-cap round"));
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return dashStyles;
		}

		@Override
		public List<Proposal> getNextTermProposal(int index,
				termGroup currentGroup, term term) {
			if( index == 1 ) {
				List<Proposal> rv = new ArrayList<Proposal>(styleLocations);
				rv.addAll(lineJoins);
				rv.addAll(lineCaps);
				return rv;
			} else if( index == 2 ) {
				if( "line-join".equals(currentGroup.getTerms().get(1)) ) {
					return fromList("miter <number>","bevel","round");
				} else if( "line-cap".equals(currentGroup.getTerms().get(1)) ) {
					return fromList("square","butt","round");
				} else {
					return fromList("line-join","line-cap");
				}
			} else if( index == 3 ) {
				if( "line-join".equals(currentGroup.getTerms().get(2)) ) {
					return fromList("miter <number>","bevel","round");
				} else if( "line-cap".equals(currentGroup.getTerms().get(2)) ) {
					return fromList("square","butt","round");
				}
			} else if( index > 3 ) {
				if( "line-cap".equals(currentGroup.getTerms().get(index - 1)) ) {
					return fromList("square","butt","round");
				}
			}
			
			return Collections.emptyList();
		}

		@Override
		public List<Proposal> getInitialTermProposal(int index,
				css_declaration currentDeclaration) {
			return dashStyles;
		}
		
		
	}
	
	public static class BorderImageRepeatProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		private List<String> values = Arrays.asList("repeat-x","repeat-y","repeat","space","round","no-repeat");
		
		public BorderImageRepeatProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
}
