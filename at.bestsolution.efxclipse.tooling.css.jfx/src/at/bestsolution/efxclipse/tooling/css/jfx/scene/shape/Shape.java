package at.bestsolution.efxclipse.tooling.css.jfx.scene.shape;

import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createEnumProperties;
import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.PaintProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.SizeProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.NumberPropery;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Proposal;

public class Shape {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(PaintProperty.class, "-fx-fill","-fx-stroke"));
		properties.addAll(createReflective(BooleanProperty.class, "-fx-smooth"));
		properties.addAll(createReflective(StrokeDashArray.class, "-fx-stroke-dash-array"));
		properties.addAll(createReflective(NumberPropery.class, "-fx-stroke-dash-offset","-fx-stroke-miter-limit"));
		properties.addAll(createEnumProperties(Arrays.asList("square","butt","round"), "-fx-stroke-line-cap"));
		properties.addAll(createEnumProperties(Arrays.asList("miter","bevel","round"), "-fx-stroke-line-join"));
		properties.addAll(createReflective(SizeProperty.class, "-fx-stroke-width"));
		
		return properties;
	}
	
	private static class StrokeDashArray extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public StrokeDashArray(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
}
