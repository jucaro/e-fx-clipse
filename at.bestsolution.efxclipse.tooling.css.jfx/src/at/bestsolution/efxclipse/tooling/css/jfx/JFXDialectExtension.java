package at.bestsolution.efxclipse.tooling.css.jfx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.jfx.scene.Group;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.Node;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.AreaChart;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.BarChart;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.BarChart3D;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.BubbleChart;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.Chart;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.LineChart;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.PieChart;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.PieChart3D;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.ScatterChart;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.XYChart;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.part.Axis;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.part.CategoryAxis;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.part.Legend;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.part.NumberAxis;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.part.PlotSymbol;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.chart.part.ValueAxis;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.Label;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.Labeled;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.PasswordBox;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.Region;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.ScrollBar;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.ScrollView;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.Separator;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.Slider;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.TextBox;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.control.TextInputControl;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.image.ImageView;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.layout.ClipView;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.layout.Container;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.layout.Flow;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.layout.HBox;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.layout.Stack;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.layout.Tile;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.layout.VBox;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.shape.Rectangle;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.shape.Shape;
import at.bestsolution.efxclipse.tooling.css.jfx.scene.text.Text;
import at.bestsolution.efxclipse.tooling.css.ui.CssDialectExtension;

public class JFXDialectExtension implements CssDialectExtension {
	private static List<Property> PROPERTIES = new ArrayList<Property>();
	
	static {
		init();	
	}
	
	private static void init() {
		PROPERTIES.addAll(Node.init());
		PROPERTIES.addAll(Group.init());
		PROPERTIES.addAll(ImageView.init());
		PROPERTIES.addAll(ClipView.init());
		PROPERTIES.addAll(Container.init());
		PROPERTIES.addAll(Flow.init());
		PROPERTIES.addAll(HBox.init());
		PROPERTIES.addAll(Stack.init());
		PROPERTIES.addAll(Tile.init());
		PROPERTIES.addAll(VBox.init());
		PROPERTIES.addAll(Shape.init());
		PROPERTIES.addAll(Rectangle.init());
		PROPERTIES.addAll(Text.init());
		PROPERTIES.addAll(Region.init());
		PROPERTIES.addAll(Label.init());
		PROPERTIES.addAll(Labeled.init());
		PROPERTIES.addAll(PasswordBox.init());
		PROPERTIES.addAll(ScrollBar.init());
		PROPERTIES.addAll(ScrollView.init());
		PROPERTIES.addAll(Separator.init());
		PROPERTIES.addAll(Slider.init());
		PROPERTIES.addAll(TextBox.init());
		PROPERTIES.addAll(TextInputControl.init());
		PROPERTIES.addAll(AreaChart.init());
		PROPERTIES.addAll(BarChart.init());
		PROPERTIES.addAll(BarChart3D.init());
		PROPERTIES.addAll(BubbleChart.init());
		PROPERTIES.addAll(Chart.init());
		PROPERTIES.addAll(LineChart.init());
		PROPERTIES.addAll(PieChart.init());
		PROPERTIES.addAll(PieChart3D.init());
		PROPERTIES.addAll(ScatterChart.init());
		PROPERTIES.addAll(XYChart.init());
		PROPERTIES.addAll(Axis.init());
		PROPERTIES.addAll(CategoryAxis.init());
		PROPERTIES.addAll(Legend.init());
		PROPERTIES.addAll(NumberAxis.init());
		PROPERTIES.addAll(PlotSymbol.init());
		PROPERTIES.addAll(ValueAxis.init());
	}
	
	@Override
	public List<Property> getProperties() {
		return PROPERTIES;
	}
	
	public static class SizeProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public SizeProperty(String name) {
			super(name);
			proposals.add(new Proposal("1"));
			for( String u : sizeUnits() ) {
				proposals.add(new Proposal("1"+u));
			}
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class Size4TimesProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public Size4TimesProperty(String name) {
			super(name);
			proposals.add(new Proposal("1"));
			proposals.add(new Proposal("1 1 1 1"));
			
			for( String u : sizeUnits() ) {
				proposals.add(new Proposal("1"+u));
				proposals.add(new Proposal("1"+u+" 1"+u+" 1"+u+" 1"+u));
			}
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class MultiSize4TimesProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public MultiSize4TimesProperty(String name) {
			super(name);
			proposals.add(new Proposal("1"));
			proposals.add(new Proposal("1 1 1 1"));
			
			for( String u : sizeUnits() ) {
				proposals.add(new Proposal("1"+u));
				proposals.add(new Proposal("1"+u+" 1"+u+" 1"+u+" 1"+u));
			}
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class PaintProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public PaintProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class MultiPaintProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public MultiPaintProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class MultiPaint4TimesProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public MultiPaint4TimesProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class Number4TimesProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public Number4TimesProperty(String name) {
			super(name);
			proposals.add(new Proposal("10"));
			proposals.add(new Proposal("10 10 10 10"));
		}

		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class FontProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public FontProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class FontFamilyProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public FontFamilyProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class FontSizeProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public FontSizeProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class FontStyleProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public FontStyleProperty(String name) {
			super(name);
			proposals.addAll(CssDialectExtension.Util.fromList("normal","italic","oblique"));
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static class FontWeightProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public FontWeightProperty(String name) {
			super(name);
			proposals.addAll(CssDialectExtension.Util.fromList("normal","bold","bolder","lighter","100","200","300","400","500","600","700","800","900"));
		}
		
		@Override
		public List<Proposal> getInitialValueProposals() {
			return proposals;
		}
	}
	
	public static List<String> sizeUnits() {
		return Arrays.asList("%","px","mm","cm","in","pt","pc","em","ex");
	}
}