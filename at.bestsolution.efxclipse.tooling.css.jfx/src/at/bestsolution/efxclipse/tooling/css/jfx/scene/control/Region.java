/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.css.jfx.scene.control;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;
import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.fromList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.MultiTermGroupProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.MultiValuesGroupProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.StringProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.UrlsProperty;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.term;
import at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.MultiPaint4TimesProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.MultiPaintProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.MultiSize4TimesProperty;

public class Region {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(MultiPaintProperty.class, "-fx-background-color"));
		properties.addAll(createReflective(MultiSize4TimesProperty.class, "-fx-background-insets","-fx-background-radius","-fx-border-insets","-fx-border-radius","-fx-border-width","-fx-border-image-insets","-fx-border-image-width"));
		properties.addAll(createReflective(UrlsProperty.class, "-fx-background-image","-fx-border-image"));
		properties.addAll(createReflective(BackgroundPositionProperty.class, "-fx-background-image-position"));
		properties.addAll(createReflective(BackgroundRepeatProperty.class, "-fx-background-image-repeat","-fx-border-image-repeat"));
		properties.addAll(createReflective(BackgroundImageSizeProperty.class, "-fx-background-image-size"));
		properties.addAll(createReflective(MultiPaint4TimesProperty.class, "-fx-border-color"));
		properties.addAll(createReflective(BorderStyleProperty.class, "-fx-border-style"));
		properties.addAll(createReflective(BorderImageSliceProperty.class, "-fx-border-image-slice"));
		properties.addAll(createReflective(BooleanProperty.class, "-fx-position-shape","-fx-scale-shape"));
		properties.addAll(createReflective(StringProperty.class, "-fx-shape"));
		
		return properties;
	}

	public static class BackgroundPositionProperty extends Property implements MultiTermGroupProperty, MultiValuesGroupProperty {
		private List<Proposal> proposalTypesA_x = new ArrayList<Proposal>();
		private List<Proposal> proposalTypesA_y = new ArrayList<Proposal>();
		
		private List<Proposal> proposalTypesB_x = new ArrayList<Proposal>();
		private List<Proposal> proposalTypesB_y = new ArrayList<Proposal>();
		
		
		public BackgroundPositionProperty(String name) {
			super(name);
//			<bg-position> [ , <bg-position> ]*
//			where <bg-position> = [
//			    [ [ <size> | left | center | right ] [ <size> | top | center | bottom ]? ]
//			    | [ [ center | [ left | right ] <size>? ] || [ center | [ top | bottom ] <size>? ]
//			] 

			proposalTypesA_x.addAll(fromList("<size>","left","center","right"));
			proposalTypesA_y.addAll(fromList("<size>","top","center","bottom"));
			
			proposalTypesB_x.addAll(fromList("center","left","right","left <size>","right <size>"));
			proposalTypesB_y.addAll(fromList("center","top","bottom","top <size>","bottom <size>"));
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			List<Proposal> rv = new ArrayList<Proposal>();
			rv.addAll(proposalTypesA_x);
			rv.addAll(proposalTypesB_x);
			return rv;
		}

		@Override
		public List<Proposal> getNextTermProposal(int index,
				termGroup currentGroup, term term) {
			if( index == 1 ) {
				term prefTerm = currentGroup.getTerms().get(0);
				if( prefTerm.getNumber() != null ) {
					return proposalTypesA_y;
				} else {
					List<Proposal> rv = new ArrayList<Proposal>();
					rv.addAll(proposalTypesA_y);
					rv.addAll(proposalTypesB_y);
					return rv;
				}
			}
			// TODO Auto-generated method stub
			return Collections.emptyList();
		}

		@Override
		public List<Proposal> getInitialTermProposal(int index,
				css_declaration currentDeclaration) {
			return getInitialTermProposals();
		}
	}
	
	public static class BackgroundRepeatProperty extends Property implements MultiTermGroupProperty, MultiValuesGroupProperty {
		private List<Proposal> firstValueProposals = new ArrayList<Proposal>();
		private List<Proposal> secondValueProposals = new ArrayList<Proposal>();
		
		public BackgroundRepeatProperty(String name) {
			super(name);
			
//			<repeat-style> [ , <repeat-style> ]*
//			where <repeat-style> = repeat-x | repeat-y | [repeat | space | round | no-repeat]{1,2}
			
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
				if( ! "repeat-x".equals(currentGroup.getTerms().get(0).getIdentifier()) && ! "repeat-y".equals(currentGroup.getTerms().get(0).getIdentifier()) ) {
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
	
	public static class BackgroundImageSizeProperty extends Property implements MultiTermGroupProperty, MultiValuesGroupProperty {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public BackgroundImageSizeProperty(String name) {
			super(name);
			
//			<bg-size> [ , <bg-size> ]*
//			<bg-size> = [ <size> | auto ]{1,2} | cover | contain
			proposals.addAll(fromList("<size>","auto","cover","contain"));
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}

		@Override
		public List<Proposal> getNextTermProposal(int index,
				termGroup currentGroup, term term) {
			if( index == 1 ) {
				if( currentGroup.getTerms().get(0).getNumber() != null || "auto".equals(currentGroup.getTerms().get(0).getIdentifier()) ) {
					return fromList("<size>","auto");
				}
			}
			return Collections.emptyList();
		}

		@Override
		public List<Proposal> getInitialTermProposal(int index,
				css_declaration currentDeclaration) {
			return getInitialTermProposals();
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
	
	public static class BorderImageSliceProperty extends Property implements MultiTermGroupProperty, MultiValuesGroupProperty {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		private List<Proposal> singleTerm = new ArrayList<Proposal>();
		
		public BorderImageSliceProperty(String name) {
			super(name);
			
			proposals.add(new Proposal("1"));
			singleTerm.add(new Proposal("1"));
			proposals.add(new Proposal("1 1 1 1"));
			
			for( String u : JFXDialectExtension.sizeUnits() ) {
				proposals.add(new Proposal("1"+u));
				singleTerm.add(new Proposal("1"+u));
				proposals.add(new Proposal("1"+u+" 1"+u+" 1"+u+" 1"+u));
			}
			
//			[<size> | <size> <size> <size> <size> ] fill? [ , [ <size> | <size> <size> <size> <size> ] fill? ]*
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}

		@Override
		public List<Proposal> getNextTermProposal(int index,
				termGroup currentGroup, term term) {
			if( index == 1 ) {
				List<Proposal> rv = new ArrayList<Proposal>();
				rv.addAll(singleTerm);
				rv.addAll(fromList("fill"));
				return rv;
			} else if( index < 4 ) {
				return singleTerm;
			} else if( index == 4 ) {
				return fromList("fill");
			}
			return Collections.emptyList();
		}

		@Override
		public List<Proposal> getInitialTermProposal(int index,
				css_declaration currentDeclaration) {
			return getInitialTermProposals();
		}
	}
}
