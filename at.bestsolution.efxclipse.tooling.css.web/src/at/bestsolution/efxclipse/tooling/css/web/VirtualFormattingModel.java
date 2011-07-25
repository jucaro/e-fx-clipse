package at.bestsolution.efxclipse.tooling.css.web;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createEnumProperties;
import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;
import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.fromList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;

public class VirtualFormattingModel {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(
				createEnumProperties(
					Arrays.asList("inline","block","list-item","inline-block","table","inline-table","table-row-group","table-header-group","table-footer-group","table-row","table-column-group","table-column","table-cell","table-caption","none","inherit"), 
					"display"
				)
			);
			
			PROPERTIES.addAll(
				createEnumProperties(
					Arrays.asList("static","relative","absolute","fixed"), 
					"position")
			);
			
			PROPERTIES.addAll(
				createReflective(BoxOffsetProperty.class, "top","right","bottom","left"));
		
			PROPERTIES.addAll(
				createEnumProperties(
					Arrays.asList("left","right","none","inherit"), 
					"float"
				)
			);
			
			PROPERTIES.addAll(
				createEnumProperties(
					Arrays.asList("none","left","right","both","inherit'"), 
					"clear"
				)
			);
			
			PROPERTIES.addAll(createReflective(ZIndexProperty.class, "z-index"));
			
			PROPERTIES.addAll(
				createEnumProperties(
					Arrays.asList("ltr","rtl","inherit"), 
					"direction"
				)
			);
			
			PROPERTIES.addAll(
				createEnumProperties(
					Arrays.asList("normal","embed","bidi-override","inherit"), 
					"unicode-bidi"
				)
			);
		return PROPERTIES;
	}
	
	public static class BoxOffsetProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public BoxOffsetProperty(String name) {
			super(name);
			proposals.add(new Proposal("auto")); 
			proposals.add(new Proposal("inherit"));
			proposals.add(new Proposal("1%"));
			proposals.addAll(WebDialectExtension.createLengthProprosals());
		}

		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class ZIndexProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public ZIndexProperty(String name) {
			super(name);
			proposals.addAll(fromList("auto","inherit"));
			proposals.addAll(fromList("1","2","3"));
		}

		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
		
	}
}
