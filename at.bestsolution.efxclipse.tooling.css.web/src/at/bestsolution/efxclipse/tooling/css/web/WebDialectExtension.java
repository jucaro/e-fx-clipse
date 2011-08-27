package at.bestsolution.efxclipse.tooling.css.web;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.fromList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension;

public class WebDialectExtension implements CssDialectExtension {
	
	public static class ColorProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public ColorProperty(String name) {
			super(name);
			proposals.addAll(WebDialectExtension.createNamedColorProposals());
			proposals.add(new Proposal("rgb(0,0,0)"));
			proposals.add(new Proposal("#"));
			proposals.add(new Proposal("#000"));
			proposals.add(new Proposal("#000000"));
			
			if( isTransparentIncluded() ) {
				proposals.add(new Proposal("transparent"));	
			}
			
			proposals.add(new Proposal("inherit"));
		}
		
		public boolean isTransparentIncluded() {
			return false;
		}

		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class TransparentColorProperty extends ColorProperty {

		public TransparentColorProperty(String name) {
			super(name);
		}
		
		@Override
		public boolean isTransparentIncluded() {
			return true;
		}
	}
	
	public static List<Proposal> createLengthProprosals() {
		return fromList("1px","1pt","1em","1cm","1pc");
	}
	
	public static List<Proposal> createNamedColorProposals() {
		return fromList("aqua","black","blue","fuchsia","gray","green","lime","maroon","navy","olive","orange","purple","red","silver","teal","white","yellow");
	}
	
	public static List<String> getLengthUnits() {
		return Arrays.asList("px","pt","em","cm","pc");
	}
	
	
	private static List<Property> PROPERTIES = new ArrayList<Property>();
	
	static {
		init();	
	}
	
	private static void init() {
		// Chapter 8
		PROPERTIES.addAll(BoxModelProperties.init());
		
		// Chapter 9
		PROPERTIES.addAll(VirtualFormattingModel.init());
		
		// Chapter 10
		PROPERTIES.addAll(VirtualFormattingModelDetails.init());
		
		// Chapter 11
		PROPERTIES.addAll(VisualEffects.init());
		
		// Chapter 12
		PROPERTIES.addAll(ContentNumberLists.init());
		
		// Chapter 13
		PROPERTIES.addAll(PagedMedia.init());
		
		// Chapter 14
		PROPERTIES.addAll(ColorsAndBackgrounds.init());
		
		// Chapter 15
		PROPERTIES.addAll(Fonts.init());
		
		// Chapter 16
		PROPERTIES.addAll(Text.init());
		
		// Chapter 17
		PROPERTIES.addAll(Tables.init());
		
		// Chapter 18
		PROPERTIES.addAll(UserInterface.init());
	}
	
	@Override
	public List<Property> getProperties() {
		return PROPERTIES;
	}
	
	public boolean isActive(URI uri) {
		return uri.toString().endsWith(".css");
	}
}