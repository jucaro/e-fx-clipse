package at.bestsolution.efxclipse.tooling.css.jfx.scene.chart;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.PaintProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.SizeProperty;

public class XYChart {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(PaintProperty.class, 
				"-fx-horizontal-alternate-row-fill","-fx-horizontal-grid-line-stroke","-fx-plot-background-fill",
				"-fx-plot-background-stroke","-fx-vertical-alternate-row-fill","-fx-vertical-grid-line-stroke"));
		properties.addAll(createReflective(StrokeDashArray.class, 
				"-fx-horizontal-grid-line-stroke-dash-array","-fx-vertical-grid-line-stroke-dash-array"));
		properties.addAll(createReflective(SizeProperty.class, 
				"-fx-horizontal-grid-line-stroke-width","-fx-plot-background-stroke-width","-fx-vertical-grid-line-stroke-width"));
		properties.addAll(createReflective(BooleanProperty.class, 
				"-fx-horizontal-grid-line-visible","-fx-horizontal-zero-line-visible","-fx-vertical-grid-line-visible",
				"-fx-vertical-zero-line-visible"));
		return properties;
	}
	
	public static class StrokeDashArray extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public StrokeDashArray(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
}
