package at.bestsolution.efxclipse.tooling.css.web;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension;

public class WebDialectExtension implements CssDialectExtension {
	
	public static class EnumProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public EnumProperty(String name, String... enums) {
			super(name);
			proposals.addAll(fromList(enums));
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
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
	
	public static List<Proposal> createLengthProprosals() {
		return fromList("1px","1pt","1em","1cm","1pc");
	}
	
	public static List<Proposal> createNamedColorProposals() {
		return fromList("aqua","black","blue","fuchsia","gray","green","lime","maroon","navy","olive","orange","purple","red","silver","teal","white","yellow");
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
		
		// Chapter 15
		PROPERTIES.addAll(Fonts.init());
		
		// Chapter 16
		PROPERTIES.addAll(Text.init());
		
		// Chapter 17
		PROPERTIES.addAll(UserInterface.init());
	}
	
	@Override
	public List<Property> getProperties() {
		return PROPERTIES;
	}
	
//	@Override
//	public List<Proposal> getProperties(ruleset ruleset) {
//		List<Proposal> l = new ArrayList<Proposal>();
//		
//		for( Property p : PROPERTIES ) {
//			l.add(new Proposal(p.name));
//		}
//		
//		// Chapter 8
//		l.addAll(fromList(
//				"margin"
//				));
//		l.addAll(fromList(
//				"padding"
//				));
//		l.addAll(fromList(
//				"border-width",
//				"border-color",
//				"border-style",
//				"border"
//		));
//
//		// Chapter 12
//		l.add(new Proposal("content"));
//		l.add(new Proposal("quotes"));
//		l.addAll(fromList("counter-reset","counter-increment"));
//		l.add(new Proposal("list-style-image"));
//		l.add(new Proposal("list-style"));
//		
//		// Chapter 13
//		l.addAll(fromList("orphans","widows"));
//		
//		// Chapter 14
//		l.add(new Proposal("color"));
//		l.addAll(fromList(
//				"background-color","background-image","background-repeat","background-attachment","background-position",
//				"background"
//		));
//		
//		// Chapter 15
//		l.add(new Proposal("font-family"));
//		l.add(new Proposal("font-size"));
//		l.add(new Proposal("font"));
//		
//		// Chapter 16
//		l.add(new Proposal("text-indent"));
//		l.add(new Proposal("letter-spacing"));
//		l.add(new Proposal("word-spacing"));
//		
//		// Chapter 17
//		l.add(new Proposal("border-spacing"));
//		
//		return l;
//	}
//
//	@Override
//	public List<Proposal> getProposals(css_generic_declaration dec) {
//		List<Proposal> proposal = new ArrayList<Proposal>();
//		// TODO Auto-generated method stub
//		return proposal;
//	}

}
