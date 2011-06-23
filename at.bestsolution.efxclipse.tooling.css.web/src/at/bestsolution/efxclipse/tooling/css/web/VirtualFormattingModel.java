package at.bestsolution.efxclipse.tooling.css.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Proposal;

public class VirtualFormattingModel {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("inline","block","list-item","inline-block","table","inline-table","table-row-group","table-header-group","table-footer-group","table-row","table-column-group","table-column","table-cell","table-caption","none","inherit"), 
					"display"
				)
			);
			
			PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("static","relative","absolute","fixed"), 
					"position")
			);
			
			PROPERTIES.addAll(
				WebDialectExtension.createReflective(BoxOffsetProperty.class, "top","right","bottom","left"));
		
			PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("left","right","none","inherit"), 
					"float"
				)
			);
			
			PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("none","left","right","both","inherit'"), 
					"clear"
				)
			);
			
			PROPERTIES.addAll(WebDialectExtension.createReflective(ZIndexProperty.class, "z-index"));
			
			PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
					Arrays.asList("ltr","rtl","inherit"), 
					"direction"
				)
			);
			
			PROPERTIES.addAll(
				WebDialectExtension.createEnumProperties(
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
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class ZIndexProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public ZIndexProperty(String name) {
			super(name);
			proposals.addAll(WebDialectExtension.fromList("auto","inherit"));
			proposals.addAll(WebDialectExtension.fromList("1","2","3"));
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
		
	}
}
