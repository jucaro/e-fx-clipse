package at.bestsolution.efxclipse.tooling.css.ui;

import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.fromList;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.swt.graphics.Image;

import at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration;

public interface CssDialectExtension {
	public abstract static class Property {
		private final String name;
		
		public Property(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public abstract List<Proposal> getInitialTermProposals();
	}
	
	public interface MultiValuesGroupProperty {
		public List<Proposal> getNextTermProposal(int index, css_declaration currentDeclaration);
	}
	
	public interface MultiTermGroupProperty {
		public List<Proposal> getInitialTermProposal(int index, css_declaration currentDeclaration);
	}
	
	public static class IntegerProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public IntegerProperty(String name) {
			super(name);
			proposals.add(new Proposal("0"));
			proposals.add(new Proposal("1"));
			proposals.add(new Proposal("inherit"));
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class StringProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public StringProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class BooleanProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public BooleanProperty(String name) {
			super(name);
			proposals.addAll(fromList("true","false"));
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class NumberPropery extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public NumberPropery(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
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
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class UrlProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public UrlProperty(String name) {
			super(name);
			proposals.add(new Proposal("url(\"resource\")"));
			proposals.add(new Proposal("url('resource')"));
		}

		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class UrlsProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public UrlsProperty(String name) {
			super(name);
			proposals.add(new Proposal("url(\"resource\")"));
			proposals.add(new Proposal("url('resource')"));
		}

		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class EnumsProperty extends Property implements MultiValuesGroupProperty {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		private List<Proposal> singleTerms = new ArrayList<Proposal>();
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
				proposals.add(new Proposal(v));
				proposals.add(new Proposal(b.toString()));
				singleTerms.add(new Proposal(v));
			}
			proposals.add(new Proposal("inherit"));
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}

		@Override
		public List<Proposal> getNextTermProposal(int index,
				css_declaration currentDeclaration) {
			if( index < partCount ) {
				return singleTerms;
			}
			return Collections.emptyList();
		}
	}
	
	public static class Proposal {
		private String proposal;
		private String label;
		private String imageUrl;
		private int priority = 1;
		
		public Proposal(String label) {
			this.proposal = label;
			this.label = label;
		}
		
		public Proposal(int priority, String label) {
			this.priority = priority;
			this.proposal = label;
			this.label = label;
		}

		public String getProposal() {
			return proposal;
		}
		
		public String getImageUrl() {
			return imageUrl;
		}
		
		public String getLabel() {
			return label;
		}
		
		public int getPriority() {
			return priority;
		}
	}
	
	public static class Util {
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
	}
	
	public List<Property> getProperties();
}
