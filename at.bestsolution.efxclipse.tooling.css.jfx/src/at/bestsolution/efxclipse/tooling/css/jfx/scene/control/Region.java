package at.bestsolution.efxclipse.tooling.css.jfx.scene.control;

import static at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.MultiPaint4TimesProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.MultiPaintProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.MultiSize4TimesProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.Proposal;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.StringProperty;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension.UrlsProperty;

public class Region {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(MultiPaintProperty.class, "-fx-background-color"));
		properties.addAll(createReflective(MultiSize4TimesProperty.class, "-fx-background-insets","-fx-background-radius","-fx-border-insets","-fx-border-radius","-fx-border-width","-fx-border-image-insets","-fx-border-image-width"));
		properties.addAll(createReflective(UrlsProperty.class, "-fx-background-image","-fx-border-image"));
		properties.addAll(createReflective(BackgroundPositionProperty.class, "-fx-background-image-position"));
		properties.addAll(createReflective(BackgroundRepeatProperty.class, "-fx-background-image-repeat"));
		properties.addAll(createReflective(BackgroundImageSizeProperty.class, "-fx-background-image-size"));
		properties.addAll(createReflective(MultiPaint4TimesProperty.class, "-fx-border-color"));
		properties.addAll(createReflective(BorderStyleProperty.class, "-fx-border-style"));
		properties.addAll(createReflective(BorderImageRepeatProperty.class, "-fx-border-image-slice"));
		properties.addAll(createReflective(BooleanProperty.class, "-fx-position-shape","-fx-scale-shape"));
		properties.addAll(createReflective(StringProperty.class, "-fx-shape"));
		
		return properties;
	}
	
	public static class BackgroundPositionProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public BackgroundPositionProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class BackgroundRepeatProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		private List<String> values = Arrays.asList("repeat-x","repeat-y","repeat","space","round","no-repeat");
		
		public BackgroundRepeatProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class BackgroundImageSizeProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public BackgroundImageSizeProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class BorderStyleProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public BorderStyleProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class BorderImageRepeatProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		private List<String> values = Arrays.asList("repeat-x","repeat-y","repeat","space","round","no-repeat");
		
		public BorderImageRepeatProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
}
