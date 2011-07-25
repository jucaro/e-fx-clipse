package at.bestsolution.efxclipse.tooling.css;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.fromList;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.term;
import at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup;

public interface CssDialectExtension {
	public abstract static class Property {
		private final String name;
		private final String description;
		
		public Property(String name) {
			this(name,null);
		}
		
		public Property(String name, String description) {
			this.name = name;
			this.description = description;
		}
		
		public String getName() {
			return name;
		}
		
		public String getDescription() {
			return description;
		}
		
		public abstract List<Proposal> getInitialTermProposals();
		
		public IStatus validate(css_declaration dec) {
			return Status.OK_STATUS;
		}
	}
	
	public interface MultiValuesGroupProperty {
		public List<Proposal> getNextTermProposal(int index, termGroup currentGroup, term term);
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
			this(name,null,enums);
		}
		
		public EnumProperty(String name, String description, String... enums) {
			super(name, description);
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
			this(name,null,partCount,enums);
		}
		
		public EnumsProperty(String name, String description, int partCount, String... enums) {
			super(name, description);
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
				termGroup currentGroup, term term) {
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
		public static class DescribedName {
			private final String name;
			private final String description;
			
			public DescribedName(String name, String description) {
				this.name = name;
				this.description = description;
			}
			
			public static DescribedName c(String name, String description) {
				return new DescribedName(name, description);
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
		
		public static List<Property> createEnumProperties(List<String> enums, DescribedName... names) {
			List<Property> rv = new ArrayList<Property>(names.length);
			String[] arEnums = enums.toArray(new String[0]);
			
			for( DescribedName name : names ) {
				rv.add(new EnumProperty(name.name, name.description, arEnums));
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
		
		public static List<Property> createEnumsProperties(List<String> enums, int partCount, DescribedName... names) {
			List<Property> rv = new ArrayList<Property>(names.length);
			String[] arEnums = enums.toArray(new String[0]);
			
			for( DescribedName name : names ) {
				rv.add(new EnumsProperty(name.name, name.description, partCount, arEnums));
			}
			
			return rv;
		}
		
		public static List<Property> createReflective(Class<? extends Property> clazz, String... names) {
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
