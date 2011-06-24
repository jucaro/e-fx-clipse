package at.bestsolution.efxclipse.tooling.css.web;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension;

public class WebDialectExtension implements CssDialectExtension {
	public static class IntegerProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public IntegerProperty(String name) {
			super(name);
			proposals.add(new Proposal("0"));
			proposals.add(new Proposal("1"));
			proposals.add(new Proposal("inherit"));
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class EnumProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public EnumProperty(String name, String... enums) {
			super(name);
			proposals.addAll(fromList(enums));
			proposals.add(new Proposal("inherit"));
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class EnumsProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		private int partCount;
		
		public EnumsProperty(String name, int partCount, String... enums) {
			super(name);
			this.partCount = partCount;
			
			for( String v : enums ) {
				StringBuilder b = new StringBuilder();
				for( int i = 0; i < partCount; i++ ) {
					if( b.length() > 0 ) {
						b.append(" ");
					}
					b.append(v);
				}
				proposals.add(new Proposal(b.toString()));
			}
			proposals.add(new Proposal("inherit"));
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
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
		public List<Proposal> getInitialValueProposals() {
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
	
	public static List<Proposal> fromList(String... strings) {
		List<Proposal> rv = new ArrayList<Proposal>();
		for( String s : strings ) {
			rv.add(new Proposal(s));
		}
		return rv;
	}
	
	public static List<Property> createEnumProperties(List<String> enums, String... names) {
		List<Property> rv = new ArrayList<Property>(names.length);
		String[] arEnums = enums.toArray(new String[0]);
		
		for( String name : names ) {
			rv.add(new EnumProperty(name, arEnums));
		}
		
		return rv;
	}
	
	public static List<Property> createEnumsProperties(List<String> enums, int partCount, String... names) {
		List<Property> rv = new ArrayList<Property>(names.length);
		String[] arEnums = enums.toArray(new String[0]);
		
		for( String name : names ) {
			rv.add(new EnumsProperty(name, partCount, arEnums));
		}
		
		return rv;
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
	
	public static List<Property> createReflective(Class<? extends Property> clazz,String... names) {
		List<Property> rv = new ArrayList<Property>(names.length);
		Constructor<? extends Property> c;
		try {
			c = clazz.getConstructor(String.class);
			for( String name : names ) {
				rv.add(c.newInstance(name));
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return rv;
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
}