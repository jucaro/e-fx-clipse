package at.bestsolution.efxclipse.tooling.css.web;

import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createEnumProperties;
import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.fromList;
import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Proposal;

public class ContentNumberLists {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(
			createReflective(ContentProperty.class, "content")
		);
		PROPERTIES.addAll(createReflective(QuotesProperty.class, "quotes"));
		PROPERTIES.addAll(createReflective(CounterProperty.class, "counter-reset", "counter-increment"));
		
		PROPERTIES.addAll(
			createEnumProperties(
				Arrays.asList("disc","circle","square","decimal","decimal-leading-zero","lower-roman",
						"upper-roman","lower-greek","lower-latin","upper-latin","armenian",
						"georgian","lower-alpha","upper-alpha","none"), 
				"list-style-type")
		);
		PROPERTIES.addAll(
			createReflective(ListStyleImageProperty.class, "list-style-image")
		);
		
		PROPERTIES.addAll(
			createEnumProperties(
				Arrays.asList("inside","outside"), 
				"list-style-position")
		);
		PROPERTIES.addAll(createReflective(ListStyleProperty.class, "list-style"));
		
		return PROPERTIES;
	}
	
	public static class ContentProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public ContentProperty(String name) {
			super(name);
			proposals.addAll(
				fromList("normal","none","open-quote","close-quote","no-open-quote","no-close-quote","inherit")
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
	
	public static class QuotesProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public QuotesProperty(String name) {
			super(name);
			proposals.add(new Proposal("'\"' '\"'"));
			proposals.add(new Proposal("\"«\" \"»\""));
			proposals.addAll(fromList("none","inherit"));
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class CounterProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public CounterProperty(String name) {
			super(name);
			proposals.add(new Proposal("chapter"));
			proposals.add(new Proposal("chapter 2"));
			proposals.addAll(fromList("none","inherit"));
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class ListStyleImageProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public ListStyleImageProperty(String name) {
			super(name);
			proposals.add(new Proposal("url(\"http://png.com/ellipse.png\")"));
			proposals.addAll(fromList("none","inherit"));
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class ListStyleProperty extends Property {
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
