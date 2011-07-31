package at.bestsolution.efxclipse.tooling.css;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.fromList;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.URLType;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.term;
import at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup;

public interface CssDialectExtension {
	public enum ValidationStatus {
		OK,
		WARNING,
		ERROR
	}
	
	public static class ValidationResult {
		public final ValidationStatus status;
		public final String message;
		public final EObject object;
		public final EStructuralFeature feature;
		public final int index;
		
		public ValidationResult(ValidationStatus status, String message, EObject object, EStructuralFeature feature, int index) {
			this.status = status;
			this.message = message;
			this.object = object;
			this.feature = feature;
			this.index = index;
		}
	}
	
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
		
		public ValidationResult[] validate(css_generic_declaration dec) {
			return new ValidationResult[0];
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
		
		@Override
		public ValidationResult[] validate(css_generic_declaration dec) {
			if( dec.getExpression() != null ) {
				if( dec.getExpression().getTermGroups().size() > 1 ) {
					return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The attribute does not support multiple term groups", null, null, -1) };
				} else if( dec.getExpression().getTermGroups().size() == 1 ) {
					if( dec.getExpression().getTermGroups().get(0).getTerms().size() > 1 ) {
						return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The attribute does not support multiple terms", null, null, -1) };
					} else if( dec.getExpression().getTermGroups().get(0).getTerms().size() == 1 ) {
						String number = dec.getExpression().getTermGroups().get(0).getTerms().get(0).getNumber();
						
						if( number == null ) {
							return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The value is not a integer value", null, null, -1) };	
						} else {
							try {
								double d = Double.parseDouble(number);	
								if( d != (int)d ) {
									return new ValidationResult[] { new ValidationResult(ValidationStatus.WARNING, "The value is floating point number but should be an integer", null, null, -1) };	
								}
							} catch( NumberFormatException e ) {
								return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The value is not a integer value", null, null, -1) };	
							}
							
						}
					}
				}
			}
			return super.validate(dec);
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
		
		@Override
		public ValidationResult[] validate(css_generic_declaration dec) {
			if( dec.getExpression() != null ) {
				if( dec.getExpression().getTermGroups().size() > 1 ) {
					return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The attribute does not support multiple term groups", null, null, -1) };
				} else if( dec.getExpression().getTermGroups().size() == 1 ) {
					if( dec.getExpression().getTermGroups().get(0).getTerms().size() > 1 ) {
						return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The attribute does not support multiple terms", null, null, -1) };
					} else if( dec.getExpression().getTermGroups().get(0).getTerms().size() == 1 ) {
						String number = dec.getExpression().getTermGroups().get(0).getTerms().get(0).getNumber();
						
						if( number == null ) {
							return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The value is not a floating point number", null, null, -1) };	
						} else {
							try {
								Double.parseDouble(number);	
							} catch( NumberFormatException e ) {
								return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The value is not a floating point number", null, null, -1) };	
							}
							
						}
					}
				}
			}
			return super.validate(dec);
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
		
		@Override
		public ValidationResult[] validate(css_generic_declaration dec) {
			if( dec.getExpression() != null ) {
				if( dec.getExpression().getTermGroups().size() > 1 ) {
					return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The attribute does not support multiple term groups", null, null, -1) };
				} else if( dec.getExpression().getTermGroups().size() == 1 ) {
					if( dec.getExpression().getTermGroups().get(0).getTerms().size() > 1 ) {
						return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The attribute does not support multiple terms", null, null, -1) };
					} else if( dec.getExpression().getTermGroups().get(0).getTerms().size() == 1 ) {
						String id = dec.getExpression().getTermGroups().get(0).getTerms().get(0).getIdentifier();
						for( Proposal p : proposals ) {
							if( p.getProposal().equals(id) ) {
								return new ValidationResult[0];
							}
						}
						
						StringBuilder b = new StringBuilder();
						for( Proposal p: proposals ) {
							b.append("- " + p.getProposal());
							if( p.getLabel() != null && ! p.getLabel().equals(p.getProposal()) ) {
								b.append(": " +p.getLabel());
							}
							b.append("\n");
						}
						
						return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The has to be:\n" + b, null, null, -1) };
					}
				}
			}
			return super.validate(dec);
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
		
		@Override
		public ValidationResult[] validate(css_generic_declaration dec) {
			if( dec.getExpression() != null ) {
				if( dec.getExpression().getTermGroups().size() > 1 ) {
					return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The attribute does not support multiple term groups", null, null, -1) };
				} else if( dec.getExpression().getTermGroups().size() == 1 ) {
					if( dec.getExpression().getTermGroups().get(0).getTerms().size() > 1 ) {
						return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The attribute does not support multiple terms", null, null, -1) };
					} else if( dec.getExpression().getTermGroups().get(0).getTerms().size() == 1 ) {
						URLType url = dec.getExpression().getTermGroups().get(0).getTerms().get(0).getUrl();
						
						if( url == null || url.getUrl().trim().length() == 0 ) {
							return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The value is not an url", null, null, -1) };
						} else {
							try {
								new URI(url.getUrl());
							} catch (URISyntaxException e) {
								return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The value is not an url", null, null, -1) };
							}
							
						}
					}
				}
			}
			return super.validate(dec);
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
		
		@Override
		public ValidationResult[] validate(css_generic_declaration dec) {
			if( dec.getExpression() != null ) {
				for( termGroup g : dec.getExpression().getTermGroups() ) {
					if( g.getTerms().size() > 1 ) {
						return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The attribute does not support multiple terms", null, null, -1) };
					} else if( g.getTerms().size() == 1 ) {
						URLType url = g.getTerms().get(0).getUrl();
						
						if( url == null || url.getUrl().trim().length() == 0 ) {
							return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The value is not an url", g.getTerms().get(0), CssDslPackage.Literals.TERM__URL, -1) };
						} else {
							try {
								new URI(url.getUrl());
							} catch (URISyntaxException e) {
								return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The value is not an url", null, null, -1) };
							}
							
						}
					}
				}
			}
			return super.validate(dec);
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
		
//		@Override
//		public ValidationResult[] validate(css_generic_declaration dec) {
//			if( dec.getExpression() != null ) {
//				if( dec.getExpression().getTermGroups().size() > 1 ) {
//					return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The attribute does not support multiple term groups", null, null, -1) };
//				} else if( dec.getExpression().getTermGroups().size() == 1 ) {
//					if( dec.getExpression().getTermGroups().get(0).getTerms().size() != partCount ) {
//						return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The attribute does not support multiple terms", null, null, -1) };
//					} else if( dec.getExpression().getTermGroups().get(0).getTerms().size() == 1 ) {
//						URLType url = dec.getExpression().getTermGroups().get(0).getTerms().get(0).getUrl();
//						
//						if( url == null || url.getUrl().trim().length() == 0 ) {
//							return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The value is not an url", null, null, -1) };
//						} else {
//							try {
//								new URI(url.getUrl());
//							} catch (URISyntaxException e) {
//								return new ValidationResult[] { new ValidationResult(ValidationStatus.ERROR, "The value is not an url", null, null, -1) };
//							}
//							
//						}
//					}
//				}
//			}
//			return super.validate(dec);
//		}
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
