package at.bestsolution.efxclipse.tooling.css.jfx.scene;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createEnumProperties;
import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.NumberPropery;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;

public class Node {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		
		properties.addAll(
			createEnumProperties(
					Arrays.asList("null","crosshair","default","hand","move","e-resize","h-resize","ne-resize",
							"nw-resize","n-resize","se-resize","sw-resize","s-resize","w-resize","v-resize",
							"text","wait"), 
			"-fx-cursor")
		);
		properties.addAll(createReflective(EffectProperty.class, "-fx-effect"));
		properties.addAll(createReflective(BooleanProperty.class, "-fx-focus-traversable"));
		properties.addAll(createReflective(NumberPropery.class, "-fx-opacity","-fx-rotate", "-fx-scale-x","-fx-scale-y",
				"-fx-scale-z", "-fx-translate-x","-fx-translate-y","-fx-translate-z"));
		
		return properties;
	}
	
	public static class EffectProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public EffectProperty(String name) {
			super(name);
			proposals.add(new Proposal("dropshadow( <blurtype>, <color>, <number>, <number>, <number>, <number> )"));
			proposals.add(new Proposal("innershadow( <blurtype>, <color>, <number>, <number>, <number>, <number> )"));
		}

		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
}
