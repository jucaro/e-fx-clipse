package at.bestsolution.efxclipse.tooling.css.web;

import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.fromList;
import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createEnumProperties;
import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createEnumsProperties;
import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Proposal;
import at.bestsolution.efxclipse.tooling.css.web.WebDialectExtension.TransparentColorProperty;

public class BoxModelProperties {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		// ----------------
		PROPERTIES.addAll(
			createReflective(MarginProperty.class, "margin-top","margin-right", "margin-bottom","margin-left") 
		);
		PROPERTIES.addAll(createReflective(MarginsProperty.class, "margin"));

		// ----------------
		PROPERTIES.addAll(
			createReflective(PaddingProperty.class, "padding-top","padding-right","padding-bottom","padding-left")
		);
		PROPERTIES.addAll(createReflective(PaddingsProperty.class, "margin"));
		
		// ----------------
		PROPERTIES.addAll(
			createReflective(BorderWidthProperty.class, "border-top-width","border-right-width","border-bottom-width","border-left-width")
		);
		PROPERTIES.addAll(
			createReflective(BorderWidthsProperty.class, "border-width")
		);
		
		// ----------------
		PROPERTIES.addAll(
			createReflective(TransparentColorProperty.class, "border-top-color","border-right-color","border-bottom-color","border-left-color")
		);
		PROPERTIES.addAll(
			createReflective(BorderColorsProperty.class, "border-color")
		);
			
		// ----------------
		PROPERTIES.addAll(
			createEnumProperties(
				Arrays.asList("none","hidden","dotted","dashed","solid","double","groove","ridge","inset","outset"),
				"border-top-style","border-right-style","border-bottom-style","border-left-style"
			)
		);
		PROPERTIES.addAll(
				createEnumsProperties(
					Arrays.asList("none","hidden","dotted","dashed","solid","double","groove","ridge","inset","outset"),
					4,
					"border-style"
				)
			);
		PROPERTIES.addAll(
			createReflective(BordersProperty.class, 
				"border-top", "border-right","border-bottom","border-left","border")
		);
		
		return PROPERTIES;
	}
	
	public static class MarginsProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		private List<String> units;

		public MarginsProperty(String name) {
			super(name);
			units = new ArrayList<String>();
			units.addAll(WebDialectExtension.getLengthUnits());
			units.add("%");
			
			proposals.addAll(fromList("0","0 0 0 0"));
			for( String u : units ) {
				proposals.add(new Proposal("0"+u));
				proposals.add(new Proposal("0"+u+" 0"+u+" 0"+u+" 0"+u));
			}
			proposals.add(new Proposal("auto"));
			proposals.add(new Proposal("auto auto auto auto"));
			proposals.add(new Proposal("inherit"));
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class MarginProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public MarginProperty(String name) {
			super(name);
			proposals.addAll(WebDialectExtension.createLengthProprosals());
			proposals.add(new Proposal("1%"));
			proposals.add(new Proposal("auto"));
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class PaddingsProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		private List<String> units;
		
		public PaddingsProperty(String name) {
			super(name);
			units = new ArrayList<String>();
			units.addAll(WebDialectExtension.getLengthUnits());
			units.add("%");
			
			proposals.addAll(fromList("0","0 0 0 0"));
			for( String u : units ) {
				proposals.add(new Proposal("0"+u));
				proposals.add(new Proposal("0"+u+" 0"+u+" 0"+u+" 0"+u));
			}
			proposals.add(new Proposal("inherit"));
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class PaddingProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public PaddingProperty(String name) {
			super(name);
			proposals.addAll(WebDialectExtension.createLengthProprosals());
			proposals.add(new Proposal("1%"));
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class BorderWidthProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public BorderWidthProperty(String name) {
			super(name);
			proposals.addAll(WebDialectExtension.createLengthProprosals());
			proposals.addAll(fromList("thin","medium","thick")); 
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class BorderWidthsProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		private List<String> units;
		private List<String> predefinedValues = Arrays.asList("thin","medium","thick");
		
		public BorderWidthsProperty(String name) {
			super(name);
			units = new ArrayList<String>();
			units.addAll(WebDialectExtension.getLengthUnits());

			proposals.addAll(fromList("0","0 0 0 0"));
			for( String u : units ) {
				proposals.add(new Proposal("0"+u));
				proposals.add(new Proposal("0"+u+" 0"+u+" 0"+u+" 0"+u));
			}
			
			for( String value : predefinedValues ) {
				proposals.add(new Proposal(value));
				proposals.add(new Proposal(value + " " + value + " " + value + " " + value));
			}
			
			proposals.add(new Proposal("inherit"));
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class BorderColorsProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public BorderColorsProperty(String name) {
			super(name);
			
			for( String v : Arrays.asList("#000","#000000","transparent") ) {
				proposals.add(new Proposal(v));
				proposals.add(new Proposal(v + " " + v + " " + v + " " + v));
			}
			proposals.add(new Proposal("inherit"));
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class BordersProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public BordersProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
}
