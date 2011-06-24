package at.bestsolution.efxclipse.tooling.css.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Proposal;

public class ContentNumberLists {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(
			WebDialectExtension.createReflective(ContentProperty.class, "content")
		);
		PROPERTIES.addAll(WebDialectExtension.createReflective(QuotesProperty.class, "quotes"));
		PROPERTIES.addAll(WebDialectExtension.createReflective(CounterProperty.class, "counter-reset", "counter-increment"));
		
		PROPERTIES.addAll(
			WebDialectExtension.createEnumProperties(
				Arrays.asList("disc","circle","square","decimal","decimal-leading-zero","lower-roman",
						"upper-roman","lower-greek","lower-latin","upper-latin","armenian",
						"georgian","lower-alpha","upper-alpha","none"), 
				"list-style-type")
		);
		PROPERTIES.addAll(
			WebDialectExtension.createReflective(ListStyleImageProperty.class, "list-style-image")
		);
		
		PROPERTIES.addAll(
			WebDialectExtension.createEnumProperties(
				Arrays.asList("inside","outside"), 
				"list-style-position")
		);
		PROPERTIES.addAll(WebDialectExtension.createReflective(ListStyleProperty.class, "list-style"));
		
		return PROPERTIES;
	}
	
	private static class ContentProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public ContentProperty(String name) {
			super(name);
			proposals.addAll(
				WebDialectExtension.fromList("normal","none","open-quote","close-quote","no-open-quote","no-close-quote","inherit")
			);
			proposals.add(new Proposal("\"text\""));
			proposals.add(new Proposal("counter(chapter, upper-roman)"));
			proposals.add(new Proposal("attr( attrib )"));
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	private static class QuotesProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public QuotesProperty(String name) {
			super(name);
			proposals.add(new Proposal("'\"' '\"'"));
			proposals.add(new Proposal("\"«\" \"»\""));
			proposals.addAll(WebDialectExtension.fromList("none","inherit"));
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	private static class CounterProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public CounterProperty(String name) {
			super(name);
			proposals.add(new Proposal("chapter"));
			proposals.add(new Proposal("chapter 2"));
			proposals.addAll(WebDialectExtension.fromList("none","inherit"));
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	private static class ListStyleImageProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public ListStyleImageProperty(String name) {
			super(name);
			proposals.add(new Proposal("url(\"http://png.com/ellipse.png\")"));
			proposals.addAll(WebDialectExtension.fromList("none","inherit"));
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	private static class ListStyleProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public ListStyleProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
}
