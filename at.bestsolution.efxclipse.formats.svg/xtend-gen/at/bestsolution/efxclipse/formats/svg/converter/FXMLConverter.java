package at.bestsolution.efxclipse.formats.svg.converter;

import at.bestsolution.efxclipse.formats.svg.converter.Colors;
import at.bestsolution.efxclipse.formats.svg.svg.ContentElement;
import at.bestsolution.efxclipse.formats.svg.svg.CoreAttributes;
import at.bestsolution.efxclipse.formats.svg.svg.Fill_rule;
import at.bestsolution.efxclipse.formats.svg.svg.FilterPrimitiveElement;
import at.bestsolution.efxclipse.formats.svg.svg.PresentationAttributes;
import at.bestsolution.efxclipse.formats.svg.svg.SpreadMethod;
import at.bestsolution.efxclipse.formats.svg.svg.Stroke_linecap;
import at.bestsolution.efxclipse.formats.svg.svg.Stroke_linejoin;
import at.bestsolution.efxclipse.formats.svg.svg.SvgCircleElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgClipPathElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgDefsElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgEllipseElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeGaussianBlurElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgFilterElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgGElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgLinearGradientElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgPackage.Literals;
import at.bestsolution.efxclipse.formats.svg.svg.SvgPathElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgPolygonElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgRadialGradientElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgRectElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgStopElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgSvgElement;
import at.bestsolution.efxclipse.formats.svg.svg.SvgUseElement;
import at.bestsolution.efxclipse.formats.svg.svg.XLinkAttributes;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javafx.scene.paint.CycleMethod;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class FXMLConverter {
  private SvgSvgElement rootElement;
  
  public FXMLConverter(final SvgSvgElement rootElement) {
    this.rootElement = rootElement;
  }
  
  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    final CharSequence content = this.handle(this.rootElement);
    _builder.newLineIfNotEmpty();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<?import java.lang.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.shape.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.paint.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.image.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.transform.*?>");
    _builder.newLine();
    _builder.append("<?import javafx.scene.effect.*?>");
    _builder.newLine();
    _builder.newLine();
    _builder.append(content, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _handle(final EObject o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!-- Unhandled type \'");
    EClass _eClass = o.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.append("\' -->");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgLinearGradientElement o) {
    return null;
  }
  
  protected CharSequence _handle(final SvgRadialGradientElement o) {
    return null;
  }
  
  protected CharSequence _handle(final SvgSvgElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Group fx:id=\'_root\' xmlns:fx=\"http://javafx.com/fxml\" xmlns:fxsvg=\"http://efxclipse.org/fxml-svg\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<children>");
    _builder.newLine();
    {
      EList<SvgElement> _children = element.getChildren();
      for(final SvgElement o : _children) {
        _builder.append("\t\t");
        CharSequence _handle = this.handle(o);
        _builder.append(_handle, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</children>");
    _builder.newLine();
    _builder.append("</Group>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgDefsElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<fx:define>");
    _builder.newLine();
    {
      EList<SvgElement> _children = element.getChildren();
      for(final SvgElement o : _children) {
        _builder.append("\t");
        CharSequence _handle = this.handle(o);
        _builder.append(_handle, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</fx:define>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence handleGradient(final SvgLinearGradientElement element, final Double opacity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<LinearGradient");
    _builder.newLine();
    _builder.append("\t");
    String _gradientTransform = element.getGradientTransform();
    AffineTransform _createAffineTransform = this.createAffineTransform(_gradientTransform);
    final AffineTransform t = ((AffineTransform) _createAffineTransform);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _x1 = element.getX1();
    double x1 = this.parseCoordinate(_x1);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _y1 = element.getY1();
    double y1 = this.parseCoordinate(_y1);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _x2 = element.getX2();
    double x2 = this.parseCoordinate(_x2);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _y2 = element.getY2();
    double y2 = this.parseCoordinate(_y2);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    {
      String _x1_1 = element.getX1();
      boolean _notEquals = (!Objects.equal(_x1_1, null));
      if (_notEquals) {
        _builder.append("startX=\"");
        java.awt.geom.Point2D.Double _double = new java.awt.geom.Point2D.Double(x1, y1);
        Point2D _transform = t.transform(_double, null);
        double _x = _transform.getX();
        _builder.append(_x, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _y1_1 = element.getY1();
      boolean _notEquals_1 = (!Objects.equal(_y1_1, null));
      if (_notEquals_1) {
        _builder.append("startY=\"");
        java.awt.geom.Point2D.Double _double_1 = new java.awt.geom.Point2D.Double(x1, y1);
        Point2D _transform_1 = t.transform(_double_1, null);
        double _y = _transform_1.getY();
        _builder.append(_y, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _x2_1 = element.getX2();
      boolean _notEquals_2 = (!Objects.equal(_x2_1, null));
      if (_notEquals_2) {
        _builder.append("endX=\"");
        java.awt.geom.Point2D.Double _double_2 = new java.awt.geom.Point2D.Double(x2, y2);
        Point2D _transform_2 = t.transform(_double_2, null);
        double _x_1 = _transform_2.getX();
        _builder.append(_x_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _y2_1 = element.getY2();
      boolean _notEquals_3 = (!Objects.equal(_y2_1, null));
      if (_notEquals_3) {
        _builder.append("endY=\"");
        java.awt.geom.Point2D.Double _double_3 = new java.awt.geom.Point2D.Double(x2, y2);
        Point2D _transform_3 = t.transform(_double_3, null);
        double _y_1 = _transform_3.getY();
        _builder.append(_y_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      SpreadMethod _spreadMethod = element.getSpreadMethod();
      boolean _notEquals_4 = (!Objects.equal(_spreadMethod, SpreadMethod.PAD));
      if (_notEquals_4) {
        _builder.append("cycleMethod=\"");
        SpreadMethod _spreadMethod_1 = element.getSpreadMethod();
        CycleMethod _fx = this.toFx(_spreadMethod_1);
        _builder.append(_fx, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _id = element.getId();
      boolean _notEquals_5 = (!Objects.equal(_id, null));
      if (_notEquals_5) {
        _builder.append("fx:id=\"");
        String _id_1 = element.getId();
        _builder.append(_id_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("proportional=\"false\">");
    _builder.newLine();
    _builder.append("\t");
    final Object owner = this.resolveGradientStopElement(element);
    _builder.newLineIfNotEmpty();
    {
      boolean _notEquals_6 = (!Objects.equal(owner, null));
      if (_notEquals_6) {
        _builder.append("\t");
        _builder.append("<stops>");
        _builder.newLine();
        {
          EList _children = ((ContentElement) owner).getChildren();
          Iterable<SvgStopElement> _filter = Iterables.<SvgStopElement>filter(_children, SvgStopElement.class);
          for(final SvgStopElement o : _filter) {
            _builder.append("\t");
            CharSequence _handleStop = this.handleStop(o, opacity);
            _builder.append(_handleStop, "	");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("</stops>");
        _builder.newLine();
      }
    }
    _builder.append("</LinearGradient>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence handleGradient(final SvgRadialGradientElement element, final Double opacity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<RadialGradient");
    _builder.newLine();
    _builder.append("\t");
    String _gradientTransform = element.getGradientTransform();
    AffineTransform _createAffineTransform = this.createAffineTransform(_gradientTransform);
    final AffineTransform t = ((AffineTransform) _createAffineTransform);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _cx = element.getCx();
    double cx = this.parseCoordinate(_cx);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _cy = element.getCy();
    double cy = this.parseCoordinate(_cy);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _fx = element.getFx();
    double fx = this.parseCoordinate(_fx);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _fy = element.getFy();
    double fy = this.parseCoordinate(_fy);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    {
      String _cx_1 = element.getCx();
      boolean _notEquals = (!Objects.equal(_cx_1, null));
      if (_notEquals) {
        _builder.append("centerX=\"");
        java.awt.geom.Point2D.Double _double = new java.awt.geom.Point2D.Double(cx, cy);
        Point2D _transform = t.transform(_double, null);
        double _x = _transform.getX();
        _builder.append(_x, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _cy_1 = element.getCy();
      boolean _notEquals_1 = (!Objects.equal(_cy_1, null));
      if (_notEquals_1) {
        _builder.append("centerY=\"");
        java.awt.geom.Point2D.Double _double_1 = new java.awt.geom.Point2D.Double(cx, cy);
        Point2D _transform_1 = t.transform(_double_1, null);
        double _y = _transform_1.getY();
        _builder.append(_y, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _r = element.getR();
      boolean _notEquals_2 = (!Objects.equal(_r, null));
      if (_notEquals_2) {
        _builder.append("radius=\"");
        String _r_1 = element.getR();
        double _parseLength = this.parseLength(_r_1);
        double _scaleX = t.getScaleX();
        double _multiply = (_parseLength * _scaleX);
        _builder.append(_multiply, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      boolean _or = false;
      String _fx_1 = element.getFx();
      boolean _notEquals_3 = (!Objects.equal(_fx_1, null));
      if (_notEquals_3) {
        _or = true;
      } else {
        String _fy_1 = element.getFy();
        boolean _notEquals_4 = (!Objects.equal(_fy_1, null));
        _or = (_notEquals_3 || _notEquals_4);
      }
      if (_or) {
        _builder.append("focusDistance=\"");
        double _calculateFocusDistance = this.calculateFocusDistance(t, cx, cy, fx, fy);
        _builder.append(_calculateFocusDistance, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      boolean _or_1 = false;
      String _fx_2 = element.getFx();
      boolean _notEquals_5 = (!Objects.equal(_fx_2, null));
      if (_notEquals_5) {
        _or_1 = true;
      } else {
        String _fy_2 = element.getFy();
        boolean _notEquals_6 = (!Objects.equal(_fy_2, null));
        _or_1 = (_notEquals_5 || _notEquals_6);
      }
      if (_or_1) {
        _builder.append("focusAngle=\"");
        double _calculateFocusAngle = this.calculateFocusAngle(t, cx, cy, fx, fy);
        _builder.append(_calculateFocusAngle, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      SpreadMethod _spreadMethod = element.getSpreadMethod();
      boolean _notEquals_7 = (!Objects.equal(_spreadMethod, SpreadMethod.PAD));
      if (_notEquals_7) {
        _builder.append("cycleMethod=\"");
        SpreadMethod _spreadMethod_1 = element.getSpreadMethod();
        CycleMethod _fx_3 = this.toFx(_spreadMethod_1);
        _builder.append(_fx_3, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _id = element.getId();
      boolean _notEquals_8 = (!Objects.equal(_id, null));
      if (_notEquals_8) {
        _builder.append("fx:id=\"");
        String _id_1 = element.getId();
        _builder.append(_id_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("proportional=\"false\">");
    _builder.newLine();
    _builder.append("\t");
    final Object owner = this.resolveGradientStopElement(element);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    {
      boolean _notEquals_9 = (!Objects.equal(owner, null));
      if (_notEquals_9) {
        _builder.append("\t");
        _builder.append("<stops>");
        _builder.newLine();
        {
          EList _children = ((ContentElement) owner).getChildren();
          Iterable<SvgStopElement> _filter = Iterables.<SvgStopElement>filter(_children, SvgStopElement.class);
          for(final SvgStopElement o : _filter) {
            _builder.append("\t");
            CharSequence _handleStop = this.handleStop(o, opacity);
            _builder.append(_handleStop, "	");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("</stops>");
        _builder.newLine();
      }
    }
    _builder.append("</RadialGradient>");
    _builder.newLine();
    return _builder;
  }
  
  public AffineTransform createAffineTransform(final String transformSpec) {
    boolean _equals = Objects.equal(transformSpec, null);
    if (_equals) {
      AffineTransform _affineTransform = new AffineTransform();
      return _affineTransform;
    } else {
      int _indexOf = transformSpec.indexOf("(");
      int _plus = (_indexOf + 1);
      int _indexOf_1 = transformSpec.indexOf(")");
      final String params = transformSpec.substring(_plus, _indexOf_1);
      boolean _startsWith = transformSpec.startsWith("matrix");
      if (_startsWith) {
        final String[] parts = params.split("\\s*,\\s*|\\s+");
        String _get = ((List<String>)Conversions.doWrapArray(parts)).get(0);
        double _parseDouble = Double.parseDouble(_get);
        String _get_1 = ((List<String>)Conversions.doWrapArray(parts)).get(1);
        double _parseDouble_1 = Double.parseDouble(_get_1);
        String _get_2 = ((List<String>)Conversions.doWrapArray(parts)).get(2);
        double _parseDouble_2 = Double.parseDouble(_get_2);
        String _get_3 = ((List<String>)Conversions.doWrapArray(parts)).get(3);
        double _parseDouble_3 = Double.parseDouble(_get_3);
        String _get_4 = ((List<String>)Conversions.doWrapArray(parts)).get(4);
        double _parseDouble_4 = Double.parseDouble(_get_4);
        String _get_5 = ((List<String>)Conversions.doWrapArray(parts)).get(5);
        double _parseDouble_5 = Double.parseDouble(_get_5);
        AffineTransform _affineTransform_1 = new AffineTransform(_parseDouble, _parseDouble_1, _parseDouble_2, _parseDouble_3, _parseDouble_4, _parseDouble_5);
        final AffineTransform rv = _affineTransform_1;
        return rv;
      } else {
        boolean _startsWith_1 = transformSpec.startsWith("translate");
        if (_startsWith_1) {
          final String[] parts_1 = params.split("\\s*,\\s*|\\s+");
          AffineTransform _affineTransform_2 = new AffineTransform();
          final AffineTransform rv_1 = _affineTransform_2;
          String _get_6 = ((List<String>)Conversions.doWrapArray(parts_1)).get(0);
          double _parseDouble_6 = Double.parseDouble(_get_6);
          String _get_7 = ((List<String>)Conversions.doWrapArray(parts_1)).get(1);
          double _parseDouble_7 = Double.parseDouble(_get_7);
          rv_1.translate(_parseDouble_6, _parseDouble_7);
          return rv_1;
        } else {
          boolean _startsWith_2 = transformSpec.startsWith("scale");
          if (_startsWith_2) {
            final String[] parts_2 = params.split("\\s*,\\s*|\\s+");
            AffineTransform _affineTransform_3 = new AffineTransform();
            final AffineTransform rv_2 = _affineTransform_3;
            String _get_8 = ((List<String>)Conversions.doWrapArray(parts_2)).get(0);
            double _parseDouble_8 = Double.parseDouble(_get_8);
            String _get_9 = ((List<String>)Conversions.doWrapArray(parts_2)).get(1);
            double _parseDouble_9 = Double.parseDouble(_get_9);
            rv_2.scale(_parseDouble_8, _parseDouble_9);
            return rv_2;
          } else {
            boolean _startsWith_3 = transformSpec.startsWith("rotate");
            if (_startsWith_3) {
              final String[] parts_3 = params.split("\\s*,\\s*|\\s+");
              AffineTransform _affineTransform_4 = new AffineTransform();
              final AffineTransform rv_3 = _affineTransform_4;
              String _get_10 = ((List<String>)Conversions.doWrapArray(parts_3)).get(0);
              double _parseDouble_10 = Double.parseDouble(_get_10);
              String _get_11 = ((List<String>)Conversions.doWrapArray(parts_3)).get(1);
              double _parseDouble_11 = Double.parseDouble(_get_11);
              String _get_12 = ((List<String>)Conversions.doWrapArray(parts_3)).get(2);
              double _parseDouble_12 = Double.parseDouble(_get_12);
              rv_3.rotate(_parseDouble_10, _parseDouble_11, _parseDouble_12);
              return rv_3;
            }
          }
        }
      }
    }
    AffineTransform _affineTransform_5 = new AffineTransform();
    return _affineTransform_5;
  }
  
  public double calculateFocusDistance(final AffineTransform transform, final double cx, final double cy, final double fx, final double fy) {
    boolean _and = false;
    boolean _equals = (fx == cx);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = (fy == cy);
      _and = (_equals && _equals_1);
    }
    if (_and) {
      return 0;
    } else {
      java.awt.geom.Point2D.Double _double = new java.awt.geom.Point2D.Double(cx, cy);
      final Point2D c = transform.transform(_double, null);
      java.awt.geom.Point2D.Double _double_1 = new java.awt.geom.Point2D.Double(fx, fy);
      final Point2D f = transform.transform(_double_1, null);
      double _x = c.getX();
      double _x_1 = f.getX();
      double _minus = (_x - _x_1);
      double _pow = Math.pow(_minus, 2);
      double _y = c.getY();
      double _y_1 = f.getY();
      double _minus_1 = (_y - _y_1);
      double _pow_1 = Math.pow(_minus_1, 2);
      double _plus = (_pow + _pow_1);
      return Math.sqrt(_plus);
    }
  }
  
  public double calculateFocusAngle(final AffineTransform transform, final double cx, final double cy, final double fx, final double fy) {
    boolean _and = false;
    boolean _equals = (fx == cx);
    if (!_equals) {
      _and = false;
    } else {
      boolean _equals_1 = (fy == cy);
      _and = (_equals && _equals_1);
    }
    if (_and) {
      return 0;
    } else {
      java.awt.geom.Point2D.Double _double = new java.awt.geom.Point2D.Double(cx, cy);
      final Point2D c = transform.transform(_double, null);
      java.awt.geom.Point2D.Double _double_1 = new java.awt.geom.Point2D.Double(fx, fy);
      final Point2D f = transform.transform(_double_1, null);
      double _y = c.getY();
      double _y_1 = f.getY();
      double _minus = (_y - _y_1);
      double _pow = Math.pow(_minus, 2);
      double _x = c.getX();
      double _x_1 = f.getX();
      double _minus_1 = (_x - _x_1);
      double _pow_1 = Math.pow(_minus_1, 2);
      double _divide = (_pow / _pow_1);
      return Math.atan(_divide);
    }
  }
  
  public Object resolveGradientStopElement(final SvgElement element) {
    if ((element instanceof ContentElement)) {
      final ContentElement rv = ((ContentElement) element);
      EList _children = rv.getChildren();
      Iterable<SvgStopElement> _filter = Iterables.<SvgStopElement>filter(_children, SvgStopElement.class);
      boolean _isEmpty = IterableExtensions.isEmpty(_filter);
      if (_isEmpty) {
        if ((element instanceof XLinkAttributes)) {
          final XLinkAttributes v = ((XLinkAttributes) element);
          SvgElement _resolvedInstance = v.getResolvedInstance();
          boolean _notEquals = (!Objects.equal(_resolvedInstance, null));
          if (_notEquals) {
            SvgElement _resolvedInstance_1 = v.getResolvedInstance();
            return this.resolveGradientStopElement(_resolvedInstance_1);
          }
        }
      } else {
        return rv;
      }
    }
    return null;
  }
  
  public SvgElement resolveElement(final String id) {
    TreeIterator<Object> _allContents = EcoreUtil.<Object>getAllContents(this.rootElement, true);
    final Iterator<SvgElement> treeIt = Iterators.<SvgElement>filter(_allContents, SvgElement.class);
    boolean _hasNext = treeIt.hasNext();
    boolean _while = _hasNext;
    while (_while) {
      {
        final SvgElement o = treeIt.next();
        if ((o instanceof CoreAttributes)) {
          String _id = ((CoreAttributes) o).getId();
          boolean _equals = id.equals(_id);
          if (_equals) {
            return o;
          }
        } else {
          final SvgElement eo = ((SvgElement) o);
          EClass _eClass = eo.eClass();
          final EStructuralFeature f = _eClass.getEStructuralFeature("id");
          boolean _and = false;
          boolean _notEquals = (!Objects.equal(f, null));
          if (!_notEquals) {
            _and = false;
          } else {
            Object _eGet = eo.eGet(f);
            boolean _equals_1 = id.equals(_eGet);
            _and = (_notEquals && _equals_1);
          }
          if (_and) {
            return o;
          }
        }
      }
      boolean _hasNext_1 = treeIt.hasNext();
      _while = _hasNext_1;
    }
    return null;
  }
  
  public CharSequence handleStop(final SvgStopElement element, final Double opacity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Stop");
    _builder.newLine();
    _builder.append("\t");
    {
      String _offset = element.getOffset();
      boolean _notEquals = (!Objects.equal(_offset, null));
      if (_notEquals) {
        _builder.append("offset=\"");
        String _offset_1 = element.getOffset();
        double _parsePercentage = this.parsePercentage(_offset_1);
        _builder.append(_parsePercentage, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(">");
    _builder.newLine();
    {
      String _stop_opacity = element.getStop_opacity();
      boolean _notEquals_1 = (!Objects.equal(_stop_opacity, null));
      if (_notEquals_1) {
        _builder.append("\t");
        _builder.append("<color>");
        _builder.newLine();
        {
          boolean _notEquals_2 = (!Objects.equal(opacity, null));
          if (_notEquals_2) {
            {
              String _stop_color = element.getStop_color();
              boolean _notEquals_3 = (!Objects.equal(_stop_color, null));
              if (_notEquals_3) {
                _builder.append("\t");
                _builder.append("\t");
                String _stop_color_1 = element.getStop_color();
                String _stop_opacity_1 = element.getStop_opacity();
                double _parseDouble = Double.parseDouble(_stop_opacity_1);
                double _multiply = (_parseDouble * (opacity).doubleValue());
                CharSequence _fillPaint = this.fillPaint(_stop_color_1, Double.valueOf(_multiply));
                _builder.append(_fillPaint, "		");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<opacity>");
                String _stop_opacity_2 = element.getStop_opacity();
                double _parseDouble_1 = Double.parseDouble(_stop_opacity_2);
                double _multiply_1 = (_parseDouble_1 * (opacity).doubleValue());
                _builder.append(_multiply_1, "		");
                _builder.append("</opacity>");
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            {
              String _stop_color_2 = element.getStop_color();
              boolean _notEquals_4 = (!Objects.equal(_stop_color_2, null));
              if (_notEquals_4) {
                _builder.append("\t");
                _builder.append("\t");
                String _stop_color_3 = element.getStop_color();
                String _stop_opacity_3 = element.getStop_opacity();
                double _parseDouble_2 = Double.parseDouble(_stop_opacity_3);
                CharSequence _fillPaint_1 = this.fillPaint(_stop_color_3, Double.valueOf(_parseDouble_2));
                _builder.append(_fillPaint_1, "		");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("<opacity>");
                String _stop_opacity_4 = element.getStop_opacity();
                _builder.append(_stop_opacity_4, "		");
                _builder.append("</opacity>");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("</color>");
        _builder.newLine();
      } else {
        String _stop_color_4 = element.getStop_color();
        boolean _notEquals_5 = (!Objects.equal(_stop_color_4, null));
        if (_notEquals_5) {
          _builder.append("\t");
          _builder.append("<color>");
          _builder.newLine();
          {
            boolean _notEquals_6 = (!Objects.equal(opacity, null));
            if (_notEquals_6) {
              _builder.append("\t");
              _builder.append("\t");
              String _stop_color_5 = element.getStop_color();
              CharSequence _fillPaint_2 = this.fillPaint(_stop_color_5, opacity);
              _builder.append(_fillPaint_2, "		");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t");
              _builder.append("\t");
              String _stop_color_6 = element.getStop_color();
              CharSequence _fillPaint_3 = this.fillPaint(_stop_color_6);
              _builder.append(_fillPaint_3, "		");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.append("</color>");
          _builder.newLine();
        }
      }
    }
    _builder.append("</Stop>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgRectElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Rectangle");
    _builder.newLine();
    _builder.append("\t");
    {
      String _x = element.getX();
      boolean _notEquals = (!Objects.equal(_x, null));
      if (_notEquals) {
        _builder.append("x=\"");
        String _x_1 = element.getX();
        double _parseLength = this.parseLength(_x_1);
        _builder.append(_parseLength, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _y = element.getY();
      boolean _notEquals_1 = (!Objects.equal(_y, null));
      if (_notEquals_1) {
        _builder.append("y=\"");
        String _y_1 = element.getY();
        double _parseLength_1 = this.parseLength(_y_1);
        _builder.append(_parseLength_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _width = element.getWidth();
      boolean _notEquals_2 = (!Objects.equal(_width, null));
      if (_notEquals_2) {
        _builder.append("width=\"");
        String _width_1 = element.getWidth();
        double _parseLength_2 = this.parseLength(_width_1);
        _builder.append(_parseLength_2, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _height = element.getHeight();
      boolean _notEquals_3 = (!Objects.equal(_height, null));
      if (_notEquals_3) {
        _builder.append("height=\"");
        String _height_1 = element.getHeight();
        double _parseLength_3 = this.parseLength(_height_1);
        _builder.append(_parseLength_3, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _rx = element.getRx();
      boolean _notEquals_4 = (!Objects.equal(_rx, null));
      if (_notEquals_4) {
        _builder.append("arcWidth=\"");
        String _rx_1 = element.getRx();
        double _parseLength_4 = this.parseLength(_rx_1);
        Double _valueOf = Double.valueOf("2.0");
        double _multiply = (_parseLength_4 * (_valueOf).doubleValue());
        _builder.append(_multiply, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _ry = element.getRy();
      boolean _notEquals_5 = (!Objects.equal(_ry, null));
      if (_notEquals_5) {
        _builder.append("arcHeight=\"");
        String _ry_1 = element.getRy();
        double _parseLength_5 = this.parseLength(_ry_1);
        Double _valueOf_1 = Double.valueOf("2.0");
        double _multiply_1 = (_parseLength_5 * (_valueOf_1).doubleValue());
        _builder.append(_multiply_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _opacity = element.getOpacity();
      boolean _notEquals_6 = (!Objects.equal(_opacity, null));
      if (_notEquals_6) {
        _builder.append("opacity=\"");
        String _opacity_1 = element.getOpacity();
        _builder.append(_opacity_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _handleShapePresentationAttributes = this.handleShapePresentationAttributes(element);
    _builder.append(_handleShapePresentationAttributes, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(">");
    _builder.newLine();
    _builder.append("\t");
    Object _lookupFeature = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__FILL, element);
    Object _lookupFeature_1 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__FILL_OPACITY, element);
    CharSequence _handlePaint = this.handlePaint("fill", ((String) _lookupFeature), ((String) _lookupFeature_1));
    _builder.append(_handlePaint, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    Object _lookupFeature_2 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE, element);
    Object _lookupFeature_3 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE_OPACITY, element);
    CharSequence _handlePaint_1 = this.handlePaint("stroke", ((String) _lookupFeature_2), ((String) _lookupFeature_3));
    _builder.append(_handlePaint_1, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      String _transform = element.getTransform();
      boolean _notEquals_7 = (!Objects.equal(_transform, null));
      if (_notEquals_7) {
        _builder.append("\t");
        _builder.append("<transforms>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        String _transform_1 = element.getTransform();
        CharSequence _handleTransform = this.handleTransform(_transform_1);
        _builder.append(_handleTransform, "		");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</transforms>");
        _builder.newLine();
      }
    }
    {
      String _filter = element.getFilter();
      boolean _notEquals_8 = (!Objects.equal(_filter, null));
      if (_notEquals_8) {
        _builder.append("\t");
        String _filter_1 = element.getFilter();
        String _filter_2 = element.getFilter();
        int _length = _filter_2.length();
        int _minus = (_length - 1);
        String _substring = _filter_1.substring(5, _minus);
        String _trim = _substring.trim();
        SvgElement _resolveElement = this.resolveElement(_trim);
        final SvgFilterElement e = ((SvgFilterElement) _resolveElement);
        _builder.newLineIfNotEmpty();
        {
          boolean _notEquals_9 = (!Objects.equal(e, null));
          if (_notEquals_9) {
            {
              EList<SvgElement> _children = e.getChildren();
              Iterable<FilterPrimitiveElement> _filter_3 = Iterables.<FilterPrimitiveElement>filter(_children, FilterPrimitiveElement.class);
              int _size = IterableExtensions.size(_filter_3);
              boolean _equals = (_size == 1);
              if (_equals) {
                _builder.append("\t");
                EList<SvgElement> _children_1 = e.getChildren();
                Iterable<FilterPrimitiveElement> _filter_4 = Iterables.<FilterPrimitiveElement>filter(_children_1, FilterPrimitiveElement.class);
                FilterPrimitiveElement _head = IterableExtensions.<FilterPrimitiveElement>head(_filter_4);
                final SvgElement fiElement = ((SvgElement) _head);
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("<effect>");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                CharSequence _handleFilter = this.handleFilter(fiElement);
                _builder.append(_handleFilter, "		");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("</effect>");
                _builder.newLine();
              } else {
                _builder.append("\t");
                _builder.append("<!-- Multi filter needs different handling -->");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    {
      boolean _and = false;
      boolean _and_1 = false;
      String _clip_path = element.getClip_path();
      boolean _notEquals_10 = (!Objects.equal(_clip_path, null));
      if (!_notEquals_10) {
        _and_1 = false;
      } else {
        String _clip_path_1 = element.getClip_path();
        String _trim_1 = _clip_path_1.trim();
        int _length_1 = _trim_1.length();
        boolean _greaterThan = (_length_1 > 0);
        _and_1 = (_notEquals_10 && _greaterThan);
      }
      if (!_and_1) {
        _and = false;
      } else {
        String _clip_path_2 = element.getClip_path();
        String _trim_2 = _clip_path_2.trim();
        boolean _equals_1 = _trim_2.equals("none");
        boolean _not = (!_equals_1);
        _and = (_and_1 && _not);
      }
      if (_and) {
        _builder.append("\t");
        _builder.append("<clip>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        String _clip_path_3 = element.getClip_path();
        String _clip_path_4 = element.getClip_path();
        int _length_2 = _clip_path_4.length();
        int _minus_1 = (_length_2 - 1);
        String _substring_1 = _clip_path_3.substring(5, _minus_1);
        SvgElement _resolveElement_1 = this.resolveElement(_substring_1);
        final SvgClipPathElement clipElement = ((SvgClipPathElement) _resolveElement_1);
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<Group>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("<children>");
        _builder.newLine();
        {
          EList<SvgElement> _children_2 = clipElement.getChildren();
          for(final SvgElement e_1 : _children_2) {
            _builder.append("\t");
            _builder.append("\t\t\t");
            CharSequence _handle = this.handle(e_1);
            _builder.append(_handle, "				");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("</children>");
        _builder.newLine();
        {
          boolean _and_2 = false;
          boolean _and_3 = false;
          String _transform_2 = clipElement.getTransform();
          boolean _notEquals_11 = (!Objects.equal(_transform_2, null));
          if (!_notEquals_11) {
            _and_3 = false;
          } else {
            String _transform_3 = clipElement.getTransform();
            String _trim_3 = _transform_3.trim();
            int _length_3 = _trim_3.length();
            boolean _greaterThan_1 = (_length_3 > 0);
            _and_3 = (_notEquals_11 && _greaterThan_1);
          }
          if (!_and_3) {
            _and_2 = false;
          } else {
            String _clip_path_5 = element.getClip_path();
            boolean _equals_2 = _clip_path_5.equals("none");
            boolean _not_1 = (!_equals_2);
            _and_2 = (_and_3 && _not_1);
          }
          if (_and_2) {
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("<transforms>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            String _transform_4 = clipElement.getTransform();
            CharSequence _handleTransform_1 = this.handleTransform(_transform_4);
            _builder.append(_handleTransform_1, "				");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("</transforms>");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("</Group>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</clip>");
        _builder.newLine();
      }
    }
    _builder.append("</Rectangle>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgGElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Group");
    _builder.newLine();
    _builder.append("\t");
    {
      String _x = element.getX();
      boolean _notEquals = (!Objects.equal(_x, null));
      if (_notEquals) {
        _builder.append("translateX=\"");
        String _x_1 = element.getX();
        double _parseCoordinate = this.parseCoordinate(_x_1);
        _builder.append(_parseCoordinate, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _y = element.getY();
      boolean _notEquals_1 = (!Objects.equal(_y, null));
      if (_notEquals_1) {
        _builder.append("translateY=\"");
        String _y_1 = element.getY();
        double _parseCoordinate_1 = this.parseCoordinate(_y_1);
        _builder.append(_parseCoordinate_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _opacity = element.getOpacity();
      boolean _notEquals_2 = (!Objects.equal(_opacity, null));
      if (_notEquals_2) {
        _builder.append("opacity=\"");
        String _opacity_1 = element.getOpacity();
        double _parseDouble = this.parseDouble(_opacity_1);
        String _fill_opacity = element.getFill_opacity();
        double _parseDouble_1 = this.parseDouble(_fill_opacity);
        double _multiply = (_parseDouble * _parseDouble_1);
        _builder.append(_multiply, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<children>");
    _builder.newLine();
    {
      EList<SvgElement> _children = element.getChildren();
      for(final SvgElement o : _children) {
        _builder.append("\t\t");
        CharSequence _handle = this.handle(o);
        _builder.append(_handle, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</children>");
    _builder.newLine();
    {
      String _transform = element.getTransform();
      boolean _notEquals_3 = (!Objects.equal(_transform, null));
      if (_notEquals_3) {
        _builder.append("\t");
        _builder.append("<transforms>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        String _transform_1 = element.getTransform();
        CharSequence _handleTransform = this.handleTransform(_transform_1);
        _builder.append(_handleTransform, "		");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</transforms>");
        _builder.newLine();
      }
    }
    {
      String _filter = element.getFilter();
      boolean _notEquals_4 = (!Objects.equal(_filter, null));
      if (_notEquals_4) {
        _builder.append("\t");
        String _filter_1 = element.getFilter();
        String _filter_2 = element.getFilter();
        int _length = _filter_2.length();
        int _minus = (_length - 1);
        String _substring = _filter_1.substring(5, _minus);
        String _trim = _substring.trim();
        SvgElement _resolveElement = this.resolveElement(_trim);
        final SvgFilterElement e = ((SvgFilterElement) _resolveElement);
        _builder.newLineIfNotEmpty();
        {
          boolean _notEquals_5 = (!Objects.equal(e, null));
          if (_notEquals_5) {
            {
              EList<SvgElement> _children_1 = e.getChildren();
              Iterable<FilterPrimitiveElement> _filter_3 = Iterables.<FilterPrimitiveElement>filter(_children_1, FilterPrimitiveElement.class);
              int _size = IterableExtensions.size(_filter_3);
              boolean _equals = (_size == 1);
              if (_equals) {
                _builder.append("\t");
                EList<SvgElement> _children_2 = e.getChildren();
                Iterable<FilterPrimitiveElement> _filter_4 = Iterables.<FilterPrimitiveElement>filter(_children_2, FilterPrimitiveElement.class);
                FilterPrimitiveElement _head = IterableExtensions.<FilterPrimitiveElement>head(_filter_4);
                final SvgElement fiElement = ((SvgElement) _head);
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("<effect>");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                CharSequence _handleFilter = this.handleFilter(fiElement);
                _builder.append(_handleFilter, "		");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("</effect>");
                _builder.newLine();
              } else {
                _builder.append("\t");
                _builder.append("<!-- Multi filter needs different handling -->");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    {
      boolean _and = false;
      boolean _and_1 = false;
      String _clip_path = element.getClip_path();
      boolean _notEquals_6 = (!Objects.equal(_clip_path, null));
      if (!_notEquals_6) {
        _and_1 = false;
      } else {
        String _clip_path_1 = element.getClip_path();
        String _trim_1 = _clip_path_1.trim();
        int _length_1 = _trim_1.length();
        boolean _greaterThan = (_length_1 > 0);
        _and_1 = (_notEquals_6 && _greaterThan);
      }
      if (!_and_1) {
        _and = false;
      } else {
        String _clip_path_2 = element.getClip_path();
        String _trim_2 = _clip_path_2.trim();
        boolean _equals_1 = _trim_2.equals("none");
        boolean _not = (!_equals_1);
        _and = (_and_1 && _not);
      }
      if (_and) {
        _builder.append("\t");
        _builder.append("<clip>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        String _clip_path_3 = element.getClip_path();
        String _clip_path_4 = element.getClip_path();
        int _length_2 = _clip_path_4.length();
        int _minus_1 = (_length_2 - 1);
        String _substring_1 = _clip_path_3.substring(5, _minus_1);
        SvgElement _resolveElement_1 = this.resolveElement(_substring_1);
        final SvgClipPathElement clipElement = ((SvgClipPathElement) _resolveElement_1);
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<Group>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("<children>");
        _builder.newLine();
        {
          EList<SvgElement> _children_3 = clipElement.getChildren();
          for(final SvgElement e_1 : _children_3) {
            _builder.append("\t");
            _builder.append("\t\t\t");
            CharSequence _handle_1 = this.handle(e_1);
            _builder.append(_handle_1, "				");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("</children>");
        _builder.newLine();
        {
          boolean _and_2 = false;
          boolean _and_3 = false;
          String _transform_2 = clipElement.getTransform();
          boolean _notEquals_7 = (!Objects.equal(_transform_2, null));
          if (!_notEquals_7) {
            _and_3 = false;
          } else {
            String _transform_3 = clipElement.getTransform();
            String _trim_3 = _transform_3.trim();
            int _length_3 = _trim_3.length();
            boolean _greaterThan_1 = (_length_3 > 0);
            _and_3 = (_notEquals_7 && _greaterThan_1);
          }
          if (!_and_3) {
            _and_2 = false;
          } else {
            String _clip_path_5 = element.getClip_path();
            boolean _equals_2 = _clip_path_5.equals("none");
            boolean _not_1 = (!_equals_2);
            _and_2 = (_and_3 && _not_1);
          }
          if (_and_2) {
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("<transforms>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            String _transform_4 = clipElement.getTransform();
            CharSequence _handleTransform_1 = this.handleTransform(_transform_4);
            _builder.append(_handleTransform_1, "				");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("</transforms>");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("</Group>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</clip>");
        _builder.newLine();
      }
    }
    _builder.append("</Group>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgUseElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Group");
    _builder.newLine();
    _builder.append("\t");
    {
      String _x = element.getX();
      boolean _notEquals = (!Objects.equal(_x, null));
      if (_notEquals) {
        _builder.append("translateX=\"");
        String _x_1 = element.getX();
        double _parseCoordinate = this.parseCoordinate(_x_1);
        _builder.append(_parseCoordinate, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _y = element.getY();
      boolean _notEquals_1 = (!Objects.equal(_y, null));
      if (_notEquals_1) {
        _builder.append("translateY=\"");
        String _y_1 = element.getY();
        double _parseCoordinate_1 = this.parseCoordinate(_y_1);
        _builder.append(_parseCoordinate_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _opacity = element.getOpacity();
      boolean _notEquals_2 = (!Objects.equal(_opacity, null));
      if (_notEquals_2) {
        _builder.append("opacity=\"");
        String _opacity_1 = element.getOpacity();
        double _parseDouble = this.parseDouble(_opacity_1);
        String _fill_opacity = element.getFill_opacity();
        double _parseDouble_1 = this.parseDouble(_fill_opacity);
        double _multiply = (_parseDouble * _parseDouble_1);
        _builder.append(_multiply, "	");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      SvgElement _resolvedInstance = element.getResolvedInstance();
      boolean _notEquals_3 = (!Objects.equal(_resolvedInstance, null));
      if (_notEquals_3) {
        _builder.append("\t");
        _builder.append("<children>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        SvgElement _resolvedInstance_1 = element.getResolvedInstance();
        CharSequence _handle = this.handle(_resolvedInstance_1);
        _builder.append(_handle, "		");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</children>");
        _builder.newLine();
      }
    }
    {
      String _transform = element.getTransform();
      boolean _notEquals_4 = (!Objects.equal(_transform, null));
      if (_notEquals_4) {
        _builder.append("\t");
        _builder.append("<transforms>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        String _transform_1 = element.getTransform();
        CharSequence _handleTransform = this.handleTransform(_transform_1);
        _builder.append(_handleTransform, "		");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</transforms>");
        _builder.newLine();
      }
    }
    {
      String _filter = element.getFilter();
      boolean _notEquals_5 = (!Objects.equal(_filter, null));
      if (_notEquals_5) {
        _builder.append("\t");
        String _filter_1 = element.getFilter();
        String _filter_2 = element.getFilter();
        int _length = _filter_2.length();
        int _minus = (_length - 1);
        String _substring = _filter_1.substring(5, _minus);
        String _trim = _substring.trim();
        SvgElement _resolveElement = this.resolveElement(_trim);
        final SvgFilterElement e = ((SvgFilterElement) _resolveElement);
        _builder.newLineIfNotEmpty();
        {
          boolean _notEquals_6 = (!Objects.equal(e, null));
          if (_notEquals_6) {
            {
              EList<SvgElement> _children = e.getChildren();
              Iterable<FilterPrimitiveElement> _filter_3 = Iterables.<FilterPrimitiveElement>filter(_children, FilterPrimitiveElement.class);
              int _size = IterableExtensions.size(_filter_3);
              boolean _equals = (_size == 1);
              if (_equals) {
                _builder.append("\t");
                EList<SvgElement> _children_1 = e.getChildren();
                Iterable<FilterPrimitiveElement> _filter_4 = Iterables.<FilterPrimitiveElement>filter(_children_1, FilterPrimitiveElement.class);
                FilterPrimitiveElement _head = IterableExtensions.<FilterPrimitiveElement>head(_filter_4);
                final SvgElement fiElement = ((SvgElement) _head);
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("<effect>");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                CharSequence _handleFilter = this.handleFilter(fiElement);
                _builder.append(_handleFilter, "		");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("</effect>");
                _builder.newLine();
              } else {
                _builder.append("\t");
                _builder.append("<!-- Multi filter needs different handling -->");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    {
      boolean _and = false;
      boolean _and_1 = false;
      String _clip_path = element.getClip_path();
      boolean _notEquals_7 = (!Objects.equal(_clip_path, null));
      if (!_notEquals_7) {
        _and_1 = false;
      } else {
        String _clip_path_1 = element.getClip_path();
        String _trim_1 = _clip_path_1.trim();
        int _length_1 = _trim_1.length();
        boolean _greaterThan = (_length_1 > 0);
        _and_1 = (_notEquals_7 && _greaterThan);
      }
      if (!_and_1) {
        _and = false;
      } else {
        String _clip_path_2 = element.getClip_path();
        String _trim_2 = _clip_path_2.trim();
        boolean _equals_1 = _trim_2.equals("none");
        boolean _not = (!_equals_1);
        _and = (_and_1 && _not);
      }
      if (_and) {
        _builder.append("\t");
        _builder.append("<clip>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        String _clip_path_3 = element.getClip_path();
        String _clip_path_4 = element.getClip_path();
        int _length_2 = _clip_path_4.length();
        int _minus_1 = (_length_2 - 1);
        String _substring_1 = _clip_path_3.substring(5, _minus_1);
        SvgElement _resolveElement_1 = this.resolveElement(_substring_1);
        final SvgClipPathElement clipElement = ((SvgClipPathElement) _resolveElement_1);
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<Group>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("<children>");
        _builder.newLine();
        {
          EList<SvgElement> _children_2 = clipElement.getChildren();
          for(final SvgElement e_1 : _children_2) {
            _builder.append("\t");
            _builder.append("\t\t\t");
            CharSequence _handle_1 = this.handle(e_1);
            _builder.append(_handle_1, "				");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("</children>");
        _builder.newLine();
        {
          boolean _and_2 = false;
          boolean _and_3 = false;
          String _transform_2 = clipElement.getTransform();
          boolean _notEquals_8 = (!Objects.equal(_transform_2, null));
          if (!_notEquals_8) {
            _and_3 = false;
          } else {
            String _transform_3 = clipElement.getTransform();
            String _trim_3 = _transform_3.trim();
            int _length_3 = _trim_3.length();
            boolean _greaterThan_1 = (_length_3 > 0);
            _and_3 = (_notEquals_8 && _greaterThan_1);
          }
          if (!_and_3) {
            _and_2 = false;
          } else {
            String _clip_path_5 = element.getClip_path();
            boolean _equals_2 = _clip_path_5.equals("none");
            boolean _not_1 = (!_equals_2);
            _and_2 = (_and_3 && _not_1);
          }
          if (_and_2) {
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("<transforms>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            String _transform_4 = clipElement.getTransform();
            CharSequence _handleTransform_1 = this.handleTransform(_transform_4);
            _builder.append(_handleTransform_1, "				");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("</transforms>");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("</Group>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</clip>");
        _builder.newLine();
      }
    }
    _builder.append("</Group>");
    _builder.newLine();
    return _builder;
  }
  
  public Object lookupFeature(final EStructuralFeature feature, final EObject object) {
    EObject eo = object;
    boolean _dowhile = false;
    do {
      {
        EClass _eClass = eo.eClass();
        EList<EStructuralFeature> _eAllStructuralFeatures = _eClass.getEAllStructuralFeatures();
        boolean _contains = _eAllStructuralFeatures.contains(feature);
        if (_contains) {
          boolean _eIsSet = eo.eIsSet(feature);
          if (_eIsSet) {
            return eo.eGet(feature);
          }
        }
        EObject _eContainer = eo.eContainer();
        eo = _eContainer;
      }
      boolean _notEquals = (!Objects.equal(eo, null));
      _dowhile = _notEquals;
    } while(_dowhile);
    return null;
  }
  
  public CharSequence handleShapePresentationAttributes(final PresentationAttributes element) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Object _lookupFeature = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE_DASHOFFSET, element);
      boolean _notEquals = (!Objects.equal(_lookupFeature, null));
      if (_notEquals) {
        _builder.append("strokeDashOffset=\"");
        Object _lookupFeature_1 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE_DASHOFFSET, element);
        double _parseLength = this.parseLength(((String) _lookupFeature_1));
        _builder.append(_parseLength, "");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Object _lookupFeature_2 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE_LINECAP, element);
      boolean _notEquals_1 = (!Objects.equal(_lookupFeature_2, null));
      if (_notEquals_1) {
        _builder.append("strokeLineCap=\"");
        Object _lookupFeature_3 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE_LINECAP, element);
        StrokeLineCap _fx = this.toFx(((Stroke_linecap) _lookupFeature_3));
        _builder.append(_fx, "");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Object _lookupFeature_4 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE_LINEJOIN, element);
      boolean _notEquals_2 = (!Objects.equal(_lookupFeature_4, null));
      if (_notEquals_2) {
        _builder.append("strokeLineJoin=\"");
        Object _lookupFeature_5 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE_LINEJOIN, element);
        StrokeLineJoin _fx_1 = this.toFx(((Stroke_linejoin) _lookupFeature_5));
        _builder.append(_fx_1, "");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Object _lookupFeature_6 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE_MITERLIMIT, element);
      boolean _notEquals_3 = (!Objects.equal(_lookupFeature_6, null));
      if (_notEquals_3) {
        _builder.append("strokeLineJoin=\"");
        Object _lookupFeature_7 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE_MITERLIMIT, element);
        double _parseLength_1 = this.parseLength(((String) _lookupFeature_7));
        _builder.append(_parseLength_1, "");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Object _lookupFeature_8 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE_WIDTH, element);
      boolean _notEquals_4 = (!Objects.equal(_lookupFeature_8, null));
      if (_notEquals_4) {
        _builder.append("strokeWidth=\"");
        Object _lookupFeature_9 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE_WIDTH, element);
        double _parseLength_2 = this.parseLength(((String) _lookupFeature_9));
        _builder.append(_parseLength_2, "");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgPathElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<SVGPath");
    _builder.newLine();
    _builder.append("\t");
    {
      String _d = element.getD();
      boolean _notEquals = (!Objects.equal(_d, null));
      if (_notEquals) {
        _builder.append("content=\"");
        String _d_1 = element.getD();
        _builder.append(_d_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _opacity = element.getOpacity();
      boolean _notEquals_1 = (!Objects.equal(_opacity, null));
      if (_notEquals_1) {
        _builder.append("opacity=\"");
        String _opacity_1 = element.getOpacity();
        _builder.append(_opacity_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Fill_rule _fill_rule = element.getFill_rule();
      boolean _notEquals_2 = (!Objects.equal(_fill_rule, Fill_rule.NONZERO));
      if (_notEquals_2) {
        _builder.append("fillRule=\"EVEN_ODD\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _handleShapePresentationAttributes = this.handleShapePresentationAttributes(element);
    _builder.append(_handleShapePresentationAttributes, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _id = element.getId();
      boolean _notEquals_3 = (!Objects.equal(_id, null));
      if (_notEquals_3) {
        _builder.append("fx:id=\"");
        String _id_1 = element.getId();
        _builder.append(_id_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(">");
    _builder.newLine();
    _builder.append("\t");
    Object _lookupFeature = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__FILL, element);
    Object _lookupFeature_1 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__FILL_OPACITY, element);
    CharSequence _handlePaint = this.handlePaint("fill", ((String) _lookupFeature), ((String) _lookupFeature_1));
    _builder.append(_handlePaint, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    Object _lookupFeature_2 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE, element);
    Object _lookupFeature_3 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE_OPACITY, element);
    CharSequence _handlePaint_1 = this.handlePaint("stroke", ((String) _lookupFeature_2), ((String) _lookupFeature_3));
    _builder.append(_handlePaint_1, "	");
    _builder.newLineIfNotEmpty();
    {
      String _transform = element.getTransform();
      boolean _notEquals_4 = (!Objects.equal(_transform, null));
      if (_notEquals_4) {
        _builder.append("\t");
        _builder.append("<transforms>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        String _transform_1 = element.getTransform();
        CharSequence _handleTransform = this.handleTransform(_transform_1);
        _builder.append(_handleTransform, "		");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</transforms>");
        _builder.newLine();
      }
    }
    {
      String _filter = element.getFilter();
      boolean _notEquals_5 = (!Objects.equal(_filter, null));
      if (_notEquals_5) {
        _builder.append("\t");
        String _filter_1 = element.getFilter();
        String _filter_2 = element.getFilter();
        int _length = _filter_2.length();
        int _minus = (_length - 1);
        String _substring = _filter_1.substring(5, _minus);
        String _trim = _substring.trim();
        SvgElement _resolveElement = this.resolveElement(_trim);
        final SvgFilterElement e = ((SvgFilterElement) _resolveElement);
        _builder.newLineIfNotEmpty();
        {
          boolean _notEquals_6 = (!Objects.equal(e, null));
          if (_notEquals_6) {
            {
              EList<SvgElement> _children = e.getChildren();
              Iterable<FilterPrimitiveElement> _filter_3 = Iterables.<FilterPrimitiveElement>filter(_children, FilterPrimitiveElement.class);
              int _size = IterableExtensions.size(_filter_3);
              boolean _equals = (_size == 1);
              if (_equals) {
                _builder.append("\t");
                EList<SvgElement> _children_1 = e.getChildren();
                Iterable<FilterPrimitiveElement> _filter_4 = Iterables.<FilterPrimitiveElement>filter(_children_1, FilterPrimitiveElement.class);
                FilterPrimitiveElement _head = IterableExtensions.<FilterPrimitiveElement>head(_filter_4);
                final SvgElement fiElement = ((SvgElement) _head);
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("<effect>");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                CharSequence _handleFilter = this.handleFilter(fiElement);
                _builder.append(_handleFilter, "		");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("</effect>");
                _builder.newLine();
              } else {
                _builder.append("\t");
                _builder.append("<!-- Multi filter needs different handling -->");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    {
      boolean _and = false;
      boolean _and_1 = false;
      String _clip_path = element.getClip_path();
      boolean _notEquals_7 = (!Objects.equal(_clip_path, null));
      if (!_notEquals_7) {
        _and_1 = false;
      } else {
        String _clip_path_1 = element.getClip_path();
        String _trim_1 = _clip_path_1.trim();
        int _length_1 = _trim_1.length();
        boolean _greaterThan = (_length_1 > 0);
        _and_1 = (_notEquals_7 && _greaterThan);
      }
      if (!_and_1) {
        _and = false;
      } else {
        String _clip_path_2 = element.getClip_path();
        String _trim_2 = _clip_path_2.trim();
        boolean _equals_1 = _trim_2.equals("none");
        boolean _not = (!_equals_1);
        _and = (_and_1 && _not);
      }
      if (_and) {
        _builder.append("\t");
        _builder.append("<clip>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        String _clip_path_3 = element.getClip_path();
        String _clip_path_4 = element.getClip_path();
        int _length_2 = _clip_path_4.length();
        int _minus_1 = (_length_2 - 1);
        String _substring_1 = _clip_path_3.substring(5, _minus_1);
        SvgElement _resolveElement_1 = this.resolveElement(_substring_1);
        final SvgClipPathElement clipElement = ((SvgClipPathElement) _resolveElement_1);
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<Group>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("<children>");
        _builder.newLine();
        {
          EList<SvgElement> _children_2 = clipElement.getChildren();
          for(final SvgElement e_1 : _children_2) {
            _builder.append("\t");
            _builder.append("\t\t\t");
            CharSequence _handle = this.handle(e_1);
            _builder.append(_handle, "				");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("</children>");
        _builder.newLine();
        {
          boolean _and_2 = false;
          boolean _and_3 = false;
          String _transform_2 = clipElement.getTransform();
          boolean _notEquals_8 = (!Objects.equal(_transform_2, null));
          if (!_notEquals_8) {
            _and_3 = false;
          } else {
            String _transform_3 = clipElement.getTransform();
            String _trim_3 = _transform_3.trim();
            int _length_3 = _trim_3.length();
            boolean _greaterThan_1 = (_length_3 > 0);
            _and_3 = (_notEquals_8 && _greaterThan_1);
          }
          if (!_and_3) {
            _and_2 = false;
          } else {
            String _clip_path_5 = element.getClip_path();
            boolean _equals_2 = _clip_path_5.equals("none");
            boolean _not_1 = (!_equals_2);
            _and_2 = (_and_3 && _not_1);
          }
          if (_and_2) {
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("<transforms>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            String _transform_4 = clipElement.getTransform();
            CharSequence _handleTransform_1 = this.handleTransform(_transform_4);
            _builder.append(_handleTransform_1, "				");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("</transforms>");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("</Group>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</clip>");
        _builder.newLine();
      }
    }
    _builder.append("</SVGPath>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handleFilter(final EObject o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!-- Unsupported filter type -->");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handleFilter(final SvgFeGaussianBlurElement blur) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<GaussianBlur");
    _builder.newLine();
    _builder.append("\t");
    {
      String _stdDeviation = blur.getStdDeviation();
      boolean _notEquals = (!Objects.equal(_stdDeviation, null));
      if (_notEquals) {
        _builder.append("radius=\"");
        String _stdDeviation_1 = blur.getStdDeviation();
        double _parseDouble = this.parseDouble(_stdDeviation_1);
        double _multiply = (_parseDouble * 2);
        _builder.append(_multiply, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("/>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence handlePaint(final String type, final String fillDefinition, final String typeOpacity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<");
    _builder.append(type, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      boolean _or = false;
      boolean _equals = Objects.equal(fillDefinition, null);
      if (_equals) {
        _or = true;
      } else {
        boolean _equals_1 = fillDefinition.equals("none");
        _or = (_equals || _equals_1);
      }
      if (_or) {
        _builder.append("\t");
        _builder.append("TRANSPARENT");
        _builder.newLine();
      } else {
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(typeOpacity, null));
        if (!_notEquals) {
          _and = false;
        } else {
          double _parseDouble = Double.parseDouble(typeOpacity);
          Double _valueOf = Double.valueOf("1.0");
          boolean _notEquals_1 = (_parseDouble != (_valueOf).doubleValue());
          _and = (_notEquals && _notEquals_1);
        }
        if (_and) {
          _builder.append("\t");
          double _parseDouble_1 = Double.parseDouble(typeOpacity);
          CharSequence _fillPaint = this.fillPaint(fillDefinition, Double.valueOf(_parseDouble_1));
          _builder.append(_fillPaint, "	");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("\t");
          CharSequence _fillPaint_1 = this.fillPaint(fillDefinition);
          _builder.append(_fillPaint_1, "	");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    _builder.append("</");
    _builder.append(type, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgClipPathElement element) {
    return null;
  }
  
  protected CharSequence _handle(final SvgEllipseElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Ellipse");
    _builder.newLine();
    _builder.append("\t");
    {
      String _rx = element.getRx();
      boolean _notEquals = (!Objects.equal(_rx, null));
      if (_notEquals) {
        _builder.append("radiusX=\"");
        String _rx_1 = element.getRx();
        double _parseLength = this.parseLength(_rx_1);
        _builder.append(_parseLength, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _ry = element.getRy();
      boolean _notEquals_1 = (!Objects.equal(_ry, null));
      if (_notEquals_1) {
        _builder.append("radiusY=\"");
        String _ry_1 = element.getRy();
        double _parseLength_1 = this.parseLength(_ry_1);
        _builder.append(_parseLength_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _cx = element.getCx();
      boolean _notEquals_2 = (!Objects.equal(_cx, null));
      if (_notEquals_2) {
        _builder.append("centerX=\"");
        String _cx_1 = element.getCx();
        double _parseCoordinate = this.parseCoordinate(_cx_1);
        _builder.append(_parseCoordinate, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _cy = element.getCy();
      boolean _notEquals_3 = (!Objects.equal(_cy, null));
      if (_notEquals_3) {
        _builder.append("centerY=\"");
        String _cy_1 = element.getCy();
        double _parseCoordinate_1 = this.parseCoordinate(_cy_1);
        _builder.append(_parseCoordinate_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _opacity = element.getOpacity();
      boolean _notEquals_4 = (!Objects.equal(_opacity, null));
      if (_notEquals_4) {
        _builder.append("opacity=\"");
        String _opacity_1 = element.getOpacity();
        _builder.append(_opacity_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _handleShapePresentationAttributes = this.handleShapePresentationAttributes(element);
    _builder.append(_handleShapePresentationAttributes, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(">");
    _builder.newLine();
    _builder.append("\t");
    Object _lookupFeature = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__FILL, element);
    Object _lookupFeature_1 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__FILL_OPACITY, element);
    CharSequence _handlePaint = this.handlePaint("fill", ((String) _lookupFeature), ((String) _lookupFeature_1));
    _builder.append(_handlePaint, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    Object _lookupFeature_2 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE, element);
    Object _lookupFeature_3 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE_OPACITY, element);
    CharSequence _handlePaint_1 = this.handlePaint("stroke", ((String) _lookupFeature_2), ((String) _lookupFeature_3));
    _builder.append(_handlePaint_1, "	");
    _builder.newLineIfNotEmpty();
    {
      String _transform = element.getTransform();
      boolean _notEquals_5 = (!Objects.equal(_transform, null));
      if (_notEquals_5) {
        _builder.append("\t");
        _builder.append("<transforms>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        String _transform_1 = element.getTransform();
        CharSequence _handleTransform = this.handleTransform(_transform_1);
        _builder.append(_handleTransform, "		");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</transforms>");
        _builder.newLine();
      }
    }
    {
      String _filter = element.getFilter();
      boolean _notEquals_6 = (!Objects.equal(_filter, null));
      if (_notEquals_6) {
        _builder.append("\t");
        String _filter_1 = element.getFilter();
        String _filter_2 = element.getFilter();
        int _length = _filter_2.length();
        int _minus = (_length - 1);
        String _substring = _filter_1.substring(5, _minus);
        String _trim = _substring.trim();
        SvgElement _resolveElement = this.resolveElement(_trim);
        final SvgFilterElement e = ((SvgFilterElement) _resolveElement);
        _builder.newLineIfNotEmpty();
        {
          boolean _notEquals_7 = (!Objects.equal(e, null));
          if (_notEquals_7) {
            {
              EList<SvgElement> _children = e.getChildren();
              Iterable<FilterPrimitiveElement> _filter_3 = Iterables.<FilterPrimitiveElement>filter(_children, FilterPrimitiveElement.class);
              int _size = IterableExtensions.size(_filter_3);
              boolean _equals = (_size == 1);
              if (_equals) {
                _builder.append("\t");
                EList<SvgElement> _children_1 = e.getChildren();
                Iterable<FilterPrimitiveElement> _filter_4 = Iterables.<FilterPrimitiveElement>filter(_children_1, FilterPrimitiveElement.class);
                FilterPrimitiveElement _head = IterableExtensions.<FilterPrimitiveElement>head(_filter_4);
                final SvgElement fiElement = ((SvgElement) _head);
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("<effect>");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                CharSequence _handleFilter = this.handleFilter(fiElement);
                _builder.append(_handleFilter, "		");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("</effect>");
                _builder.newLine();
              } else {
                _builder.append("\t");
                _builder.append("<!-- Multi filter needs different handling -->");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    {
      boolean _and = false;
      boolean _and_1 = false;
      String _clip_path = element.getClip_path();
      boolean _notEquals_8 = (!Objects.equal(_clip_path, null));
      if (!_notEquals_8) {
        _and_1 = false;
      } else {
        String _clip_path_1 = element.getClip_path();
        String _trim_1 = _clip_path_1.trim();
        int _length_1 = _trim_1.length();
        boolean _greaterThan = (_length_1 > 0);
        _and_1 = (_notEquals_8 && _greaterThan);
      }
      if (!_and_1) {
        _and = false;
      } else {
        String _clip_path_2 = element.getClip_path();
        String _trim_2 = _clip_path_2.trim();
        boolean _equals_1 = _trim_2.equals("none");
        boolean _not = (!_equals_1);
        _and = (_and_1 && _not);
      }
      if (_and) {
        _builder.append("\t");
        _builder.append("<clip>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        String _clip_path_3 = element.getClip_path();
        String _clip_path_4 = element.getClip_path();
        int _length_2 = _clip_path_4.length();
        int _minus_1 = (_length_2 - 1);
        String _substring_1 = _clip_path_3.substring(5, _minus_1);
        SvgElement _resolveElement_1 = this.resolveElement(_substring_1);
        final SvgClipPathElement clipElement = ((SvgClipPathElement) _resolveElement_1);
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<Group>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("<children>");
        _builder.newLine();
        {
          EList<SvgElement> _children_2 = clipElement.getChildren();
          for(final SvgElement e_1 : _children_2) {
            _builder.append("\t");
            _builder.append("\t\t\t");
            CharSequence _handle = this.handle(e_1);
            _builder.append(_handle, "				");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("</children>");
        _builder.newLine();
        {
          boolean _and_2 = false;
          boolean _and_3 = false;
          String _transform_2 = clipElement.getTransform();
          boolean _notEquals_9 = (!Objects.equal(_transform_2, null));
          if (!_notEquals_9) {
            _and_3 = false;
          } else {
            String _transform_3 = clipElement.getTransform();
            String _trim_3 = _transform_3.trim();
            int _length_3 = _trim_3.length();
            boolean _greaterThan_1 = (_length_3 > 0);
            _and_3 = (_notEquals_9 && _greaterThan_1);
          }
          if (!_and_3) {
            _and_2 = false;
          } else {
            String _clip_path_5 = element.getClip_path();
            boolean _equals_2 = _clip_path_5.equals("none");
            boolean _not_1 = (!_equals_2);
            _and_2 = (_and_3 && _not_1);
          }
          if (_and_2) {
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("<transforms>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            String _transform_4 = clipElement.getTransform();
            CharSequence _handleTransform_1 = this.handleTransform(_transform_4);
            _builder.append(_handleTransform_1, "				");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("</transforms>");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("</Group>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</clip>");
        _builder.newLine();
      }
    }
    _builder.append("</Ellipse>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgCircleElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Circle");
    _builder.newLine();
    _builder.append("\t");
    {
      String _r = element.getR();
      boolean _notEquals = (!Objects.equal(_r, null));
      if (_notEquals) {
        _builder.append("radius=\"");
        String _r_1 = element.getR();
        double _parseLength = this.parseLength(_r_1);
        _builder.append(_parseLength, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _cx = element.getCx();
      boolean _notEquals_1 = (!Objects.equal(_cx, null));
      if (_notEquals_1) {
        _builder.append("centerX=\"");
        String _cx_1 = element.getCx();
        double _parseCoordinate = this.parseCoordinate(_cx_1);
        _builder.append(_parseCoordinate, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _cy = element.getCy();
      boolean _notEquals_2 = (!Objects.equal(_cy, null));
      if (_notEquals_2) {
        _builder.append("centerY=\"");
        String _cy_1 = element.getCy();
        double _parseCoordinate_1 = this.parseCoordinate(_cy_1);
        _builder.append(_parseCoordinate_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _opacity = element.getOpacity();
      boolean _notEquals_3 = (!Objects.equal(_opacity, null));
      if (_notEquals_3) {
        _builder.append("opacity=\"");
        String _opacity_1 = element.getOpacity();
        _builder.append(_opacity_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _handleShapePresentationAttributes = this.handleShapePresentationAttributes(element);
    _builder.append(_handleShapePresentationAttributes, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(">");
    _builder.newLine();
    _builder.append("\t");
    Object _lookupFeature = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__FILL, element);
    Object _lookupFeature_1 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__FILL_OPACITY, element);
    CharSequence _handlePaint = this.handlePaint("fill", ((String) _lookupFeature), ((String) _lookupFeature_1));
    _builder.append(_handlePaint, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    Object _lookupFeature_2 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE, element);
    Object _lookupFeature_3 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE_OPACITY, element);
    CharSequence _handlePaint_1 = this.handlePaint("stroke", ((String) _lookupFeature_2), ((String) _lookupFeature_3));
    _builder.append(_handlePaint_1, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      String _transform = element.getTransform();
      boolean _notEquals_4 = (!Objects.equal(_transform, null));
      if (_notEquals_4) {
        _builder.append("\t");
        _builder.append("<transforms>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        String _transform_1 = element.getTransform();
        CharSequence _handleTransform = this.handleTransform(_transform_1);
        _builder.append(_handleTransform, "		");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</transforms>");
        _builder.newLine();
      }
    }
    {
      String _filter = element.getFilter();
      boolean _notEquals_5 = (!Objects.equal(_filter, null));
      if (_notEquals_5) {
        _builder.append("\t");
        String _filter_1 = element.getFilter();
        String _filter_2 = element.getFilter();
        int _length = _filter_2.length();
        int _minus = (_length - 1);
        String _substring = _filter_1.substring(5, _minus);
        String _trim = _substring.trim();
        SvgElement _resolveElement = this.resolveElement(_trim);
        final SvgFilterElement e = ((SvgFilterElement) _resolveElement);
        _builder.newLineIfNotEmpty();
        {
          boolean _notEquals_6 = (!Objects.equal(e, null));
          if (_notEquals_6) {
            {
              EList<SvgElement> _children = e.getChildren();
              Iterable<FilterPrimitiveElement> _filter_3 = Iterables.<FilterPrimitiveElement>filter(_children, FilterPrimitiveElement.class);
              int _size = IterableExtensions.size(_filter_3);
              boolean _equals = (_size == 1);
              if (_equals) {
                _builder.append("\t");
                EList<SvgElement> _children_1 = e.getChildren();
                Iterable<FilterPrimitiveElement> _filter_4 = Iterables.<FilterPrimitiveElement>filter(_children_1, FilterPrimitiveElement.class);
                FilterPrimitiveElement _head = IterableExtensions.<FilterPrimitiveElement>head(_filter_4);
                final SvgElement fiElement = ((SvgElement) _head);
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("<effect>");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                CharSequence _handleFilter = this.handleFilter(fiElement);
                _builder.append(_handleFilter, "		");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("</effect>");
                _builder.newLine();
              } else {
                _builder.append("\t");
                _builder.append("<!-- Multi filter needs different handling -->");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    {
      boolean _and = false;
      boolean _and_1 = false;
      String _clip_path = element.getClip_path();
      boolean _notEquals_7 = (!Objects.equal(_clip_path, null));
      if (!_notEquals_7) {
        _and_1 = false;
      } else {
        String _clip_path_1 = element.getClip_path();
        String _trim_1 = _clip_path_1.trim();
        int _length_1 = _trim_1.length();
        boolean _greaterThan = (_length_1 > 0);
        _and_1 = (_notEquals_7 && _greaterThan);
      }
      if (!_and_1) {
        _and = false;
      } else {
        String _clip_path_2 = element.getClip_path();
        String _trim_2 = _clip_path_2.trim();
        boolean _equals_1 = _trim_2.equals("none");
        boolean _not = (!_equals_1);
        _and = (_and_1 && _not);
      }
      if (_and) {
        _builder.append("\t");
        _builder.append("<clip>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        String _clip_path_3 = element.getClip_path();
        String _clip_path_4 = element.getClip_path();
        int _length_2 = _clip_path_4.length();
        int _minus_1 = (_length_2 - 1);
        String _substring_1 = _clip_path_3.substring(5, _minus_1);
        SvgElement _resolveElement_1 = this.resolveElement(_substring_1);
        final SvgClipPathElement clipElement = ((SvgClipPathElement) _resolveElement_1);
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<Group>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("<children>");
        _builder.newLine();
        {
          EList<SvgElement> _children_2 = clipElement.getChildren();
          for(final SvgElement e_1 : _children_2) {
            _builder.append("\t");
            _builder.append("\t\t\t");
            CharSequence _handle = this.handle(e_1);
            _builder.append(_handle, "				");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("</children>");
        _builder.newLine();
        {
          boolean _and_2 = false;
          boolean _and_3 = false;
          String _transform_2 = clipElement.getTransform();
          boolean _notEquals_8 = (!Objects.equal(_transform_2, null));
          if (!_notEquals_8) {
            _and_3 = false;
          } else {
            String _transform_3 = clipElement.getTransform();
            String _trim_3 = _transform_3.trim();
            int _length_3 = _trim_3.length();
            boolean _greaterThan_1 = (_length_3 > 0);
            _and_3 = (_notEquals_8 && _greaterThan_1);
          }
          if (!_and_3) {
            _and_2 = false;
          } else {
            String _clip_path_5 = element.getClip_path();
            boolean _equals_2 = _clip_path_5.equals("none");
            boolean _not_1 = (!_equals_2);
            _and_2 = (_and_3 && _not_1);
          }
          if (_and_2) {
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("<transforms>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("\t");
            String _transform_4 = clipElement.getTransform();
            CharSequence _handleTransform_1 = this.handleTransform(_transform_4);
            _builder.append(_handleTransform_1, "				");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t\t");
            _builder.append("</transforms>");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("</Group>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</clip>");
        _builder.newLine();
      }
    }
    _builder.append("</Circle>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final SvgPolygonElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Polygon");
    _builder.newLine();
    _builder.append("\t");
    {
      String _points = element.getPoints();
      boolean _notEquals = (!Objects.equal(_points, null));
      if (_notEquals) {
        _builder.append("points=\"");
        String _points_1 = element.getPoints();
        String _replaceAll = _points_1.replaceAll("\\s+", ",");
        _builder.append(_replaceAll, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _opacity = element.getOpacity();
      boolean _notEquals_1 = (!Objects.equal(_opacity, null));
      if (_notEquals_1) {
        _builder.append("opacity=\"");
        String _opacity_1 = element.getOpacity();
        _builder.append(_opacity_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _handleShapePresentationAttributes = this.handleShapePresentationAttributes(element);
    _builder.append(_handleShapePresentationAttributes, "	");
    _builder.newLineIfNotEmpty();
    _builder.append(">");
    _builder.newLine();
    Object _lookupFeature = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__FILL, element);
    Object _lookupFeature_1 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__FILL_OPACITY, element);
    CharSequence _handlePaint = this.handlePaint("fill", ((String) _lookupFeature), ((String) _lookupFeature_1));
    _builder.append(_handlePaint, "");
    _builder.newLineIfNotEmpty();
    Object _lookupFeature_2 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE, element);
    Object _lookupFeature_3 = this.lookupFeature(Literals.PRESENTATION_ATTRIBUTES__STROKE_OPACITY, element);
    CharSequence _handlePaint_1 = this.handlePaint("stroke", ((String) _lookupFeature_2), ((String) _lookupFeature_3));
    _builder.append(_handlePaint_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      String _transform = element.getTransform();
      boolean _notEquals_2 = (!Objects.equal(_transform, null));
      if (_notEquals_2) {
        _builder.append("<transforms>");
        _builder.newLine();
        _builder.append("\t");
        String _transform_1 = element.getTransform();
        CharSequence _handleTransform = this.handleTransform(_transform_1);
        _builder.append(_handleTransform, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("</transforms>");
        _builder.newLine();
      }
    }
    {
      String _filter = element.getFilter();
      boolean _notEquals_3 = (!Objects.equal(_filter, null));
      if (_notEquals_3) {
        _builder.append("\t");
        String _filter_1 = element.getFilter();
        String _filter_2 = element.getFilter();
        int _length = _filter_2.length();
        int _minus = (_length - 1);
        String _substring = _filter_1.substring(5, _minus);
        String _trim = _substring.trim();
        SvgElement _resolveElement = this.resolveElement(_trim);
        final SvgFilterElement e = ((SvgFilterElement) _resolveElement);
        _builder.newLineIfNotEmpty();
        {
          boolean _notEquals_4 = (!Objects.equal(e, null));
          if (_notEquals_4) {
            {
              EList<SvgElement> _children = e.getChildren();
              Iterable<FilterPrimitiveElement> _filter_3 = Iterables.<FilterPrimitiveElement>filter(_children, FilterPrimitiveElement.class);
              int _size = IterableExtensions.size(_filter_3);
              boolean _equals = (_size == 1);
              if (_equals) {
                _builder.append("\t");
                EList<SvgElement> _children_1 = e.getChildren();
                Iterable<FilterPrimitiveElement> _filter_4 = Iterables.<FilterPrimitiveElement>filter(_children_1, FilterPrimitiveElement.class);
                FilterPrimitiveElement _head = IterableExtensions.<FilterPrimitiveElement>head(_filter_4);
                final SvgElement fiElement = ((SvgElement) _head);
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("<effect>");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("\t");
                CharSequence _handleFilter = this.handleFilter(fiElement);
                _builder.append(_handleFilter, "		");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("</effect>");
                _builder.newLine();
              } else {
                _builder.append("\t");
                _builder.append("<!-- Multi filter needs different handling -->");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    {
      boolean _and = false;
      boolean _and_1 = false;
      String _clip_path = element.getClip_path();
      boolean _notEquals_5 = (!Objects.equal(_clip_path, null));
      if (!_notEquals_5) {
        _and_1 = false;
      } else {
        String _clip_path_1 = element.getClip_path();
        String _trim_1 = _clip_path_1.trim();
        int _length_1 = _trim_1.length();
        boolean _greaterThan = (_length_1 > 0);
        _and_1 = (_notEquals_5 && _greaterThan);
      }
      if (!_and_1) {
        _and = false;
      } else {
        String _clip_path_2 = element.getClip_path();
        String _trim_2 = _clip_path_2.trim();
        boolean _equals_1 = _trim_2.equals("none");
        boolean _not = (!_equals_1);
        _and = (_and_1 && _not);
      }
      if (_and) {
        _builder.append("<clip>");
        _builder.newLine();
        _builder.append("\t");
        String _clip_path_3 = element.getClip_path();
        String _clip_path_4 = element.getClip_path();
        int _length_2 = _clip_path_4.length();
        int _minus_1 = (_length_2 - 1);
        String _substring_1 = _clip_path_3.substring(5, _minus_1);
        SvgElement _resolveElement_1 = this.resolveElement(_substring_1);
        final SvgClipPathElement clipElement = ((SvgClipPathElement) _resolveElement_1);
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("<Group>");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("<children>");
        _builder.newLine();
        {
          EList<SvgElement> _children_2 = clipElement.getChildren();
          for(final SvgElement e_1 : _children_2) {
            _builder.append("\t\t\t");
            CharSequence _handle = this.handle(e_1);
            _builder.append(_handle, "			");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append("</children>");
        _builder.newLine();
        {
          boolean _and_2 = false;
          boolean _and_3 = false;
          String _transform_2 = clipElement.getTransform();
          boolean _notEquals_6 = (!Objects.equal(_transform_2, null));
          if (!_notEquals_6) {
            _and_3 = false;
          } else {
            String _transform_3 = clipElement.getTransform();
            String _trim_3 = _transform_3.trim();
            int _length_3 = _trim_3.length();
            boolean _greaterThan_1 = (_length_3 > 0);
            _and_3 = (_notEquals_6 && _greaterThan_1);
          }
          if (!_and_3) {
            _and_2 = false;
          } else {
            String _clip_path_5 = element.getClip_path();
            boolean _equals_2 = _clip_path_5.equals("none");
            boolean _not_1 = (!_equals_2);
            _and_2 = (_and_3 && _not_1);
          }
          if (_and_2) {
            _builder.append("\t\t");
            _builder.append("<transforms>");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            String _transform_4 = clipElement.getTransform();
            CharSequence _handleTransform_1 = this.handleTransform(_transform_4);
            _builder.append(_handleTransform_1, "			");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("</transforms>");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("</Group>");
        _builder.newLine();
        _builder.append("</clip>");
        _builder.newLine();
      }
    }
    _builder.append("</Polygon>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence fillPaint(final String fill) {
    CharSequence _xifexpression = null;
    boolean _startsWith = fill.startsWith("#");
    if (_startsWith) {
      return this.hexColor(fill);
    } else {
      CharSequence _xifexpression_1 = null;
      boolean _startsWith_1 = fill.startsWith("rgb");
      if (_startsWith_1) {
        _xifexpression_1 = null;
      } else {
        CharSequence _xifexpression_2 = null;
        boolean _startsWith_2 = fill.startsWith("argb");
        if (_startsWith_2) {
          _xifexpression_2 = null;
        } else {
          boolean _startsWith_3 = fill.startsWith("url");
          if (_startsWith_3) {
            int _length = fill.length();
            int _minus = (_length - 1);
            String _substring = fill.substring(5, _minus);
            final SvgElement e = this.resolveElement(_substring);
            if ((e instanceof SvgLinearGradientElement)) {
              return this.handleGradient(((SvgLinearGradientElement) e), null);
            } else {
              if ((e instanceof SvgRadialGradientElement)) {
                return this.handleGradient(((SvgRadialGradientElement) e), null);
              }
            }
          } else {
            return fill.toUpperCase();
          }
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence fillPaint(final String fill, final Double opacity) {
    CharSequence _xifexpression = null;
    boolean _startsWith = fill.startsWith("#");
    if (_startsWith) {
      return this.hexColor(fill, opacity);
    } else {
      CharSequence _xifexpression_1 = null;
      String _lowerCase = fill.toLowerCase();
      boolean _startsWith_1 = _lowerCase.startsWith("rgb");
      if (_startsWith_1) {
        int _indexOf = fill.indexOf("(");
        int _indexOf_1 = fill.indexOf(")");
        final String c = fill.substring(_indexOf, _indexOf_1);
        return this.rgbColor(c);
      } else {
        CharSequence _xifexpression_2 = null;
        boolean _startsWith_2 = fill.startsWith("argb");
        if (_startsWith_2) {
          _xifexpression_2 = null;
        } else {
          boolean _startsWith_3 = fill.startsWith("url");
          if (_startsWith_3) {
            int _length = fill.length();
            int _minus = (_length - 1);
            String _substring = fill.substring(5, _minus);
            final SvgElement e = this.resolveElement(_substring);
            if ((e instanceof SvgLinearGradientElement)) {
              return this.handleGradient(((SvgLinearGradientElement) e), opacity);
            } else {
              if ((e instanceof SvgRadialGradientElement)) {
                return this.handleGradient(((SvgRadialGradientElement) e), opacity);
              }
            }
          } else {
            final Colors c_1 = Colors.findColorByName(fill);
            boolean _notEquals = (!Objects.equal(c_1, null));
            if (_notEquals) {
              return this.hexColor(c_1.hexvalue, opacity);
            }
            return fill.toUpperCase();
          }
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence rgbColor(final String fill) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Color>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<red>");
    double _rgbRed = this.rgbRed(fill);
    _builder.append(_rgbRed, "	");
    _builder.append("</red>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<green>");
    double _rgbGreen = this.rgbGreen(fill);
    _builder.append(_rgbGreen, "	");
    _builder.append("</green>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<blue>");
    double _rgbBlue = this.rgbBlue(fill);
    _builder.append(_rgbBlue, "	");
    _builder.append("</blue>");
    _builder.newLineIfNotEmpty();
    _builder.append("</Color>");
    _builder.newLine();
    return _builder;
  }
  
  public double rgbRed(final String color) {
    String[] _split = color.split(";");
    String _get = ((List<String>)Conversions.doWrapArray(_split)).get(0);
    int _parseInt = Integer.parseInt(_get);
    double _parseDouble = Double.parseDouble("255");
    return (_parseInt / _parseDouble);
  }
  
  public double rgbGreen(final String color) {
    String[] _split = color.split(";");
    String _get = ((List<String>)Conversions.doWrapArray(_split)).get(1);
    int _parseInt = Integer.parseInt(_get);
    double _parseDouble = Double.parseDouble("255");
    return (_parseInt / _parseDouble);
  }
  
  public double rgbBlue(final String color) {
    String[] _split = color.split(";");
    String _get = ((List<String>)Conversions.doWrapArray(_split)).get(2);
    int _parseInt = Integer.parseInt(_get);
    double _parseDouble = Double.parseDouble("255");
    return (_parseInt / _parseDouble);
  }
  
  public CharSequence hexColor(final String fill) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Color>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<red>");
    double _hexRed = this.hexRed(fill);
    _builder.append(_hexRed, "	");
    _builder.append("</red>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<green>");
    double _hexGreen = this.hexGreen(fill);
    _builder.append(_hexGreen, "	");
    _builder.append("</green>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<blue>");
    double _hexBlue = this.hexBlue(fill);
    _builder.append(_hexBlue, "	");
    _builder.append("</blue>");
    _builder.newLineIfNotEmpty();
    _builder.append("</Color>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence hexColor(final String fill, final Double opacity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Color>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<red>");
    double _hexRed = this.hexRed(fill);
    _builder.append(_hexRed, "	");
    _builder.append("</red>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<green>");
    double _hexGreen = this.hexGreen(fill);
    _builder.append(_hexGreen, "	");
    _builder.append("</green>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<blue>");
    double _hexBlue = this.hexBlue(fill);
    _builder.append(_hexBlue, "	");
    _builder.append("</blue>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<opacity>");
    _builder.append(opacity, "	");
    _builder.append("</opacity>");
    _builder.newLineIfNotEmpty();
    _builder.append("</Color>");
    _builder.newLine();
    return _builder;
  }
  
  public double hexRed(final String color) {
    return Colors.hexRed(color);
  }
  
  public double hexGreen(final String color) {
    return Colors.hexGreen(color);
  }
  
  public double hexBlue(final String color) {
    return Colors.hexBlue(color);
  }
  
  public CharSequence handleTransform(final String transform) {
    StringConcatenation _builder = new StringConcatenation();
    int _indexOf = transform.indexOf("(");
    int _plus = (_indexOf + 1);
    int _indexOf_1 = transform.indexOf(")");
    final String params = transform.substring(_plus, _indexOf_1);
    _builder.newLineIfNotEmpty();
    {
      boolean _startsWith = transform.startsWith("translate");
      if (_startsWith) {
        _builder.append("<Translate");
        _builder.newLine();
        {
          int _indexOf_2 = params.indexOf(",");
          int _minus = (-1);
          boolean _notEquals = (_indexOf_2 != _minus);
          if (_notEquals) {
            _builder.append("\t");
            final String[] parts = params.split(",");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("x=\"");
            String _get = ((List<String>)Conversions.doWrapArray(parts)).get(0);
            _builder.append(_get, "	");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("y=\"");
            String _get_1 = ((List<String>)Conversions.doWrapArray(parts)).get(1);
            _builder.append(_get_1, "	");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            _builder.append("x=\"");
            _builder.append(params, "	");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("y=\"");
            _builder.append(params, "	");
            _builder.append("\"");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append(">");
        _builder.newLine();
        _builder.append("</Translate>");
        _builder.newLine();
      } else {
        boolean _startsWith_1 = transform.startsWith("scale");
        if (_startsWith_1) {
          _builder.append("<Scale");
          _builder.newLine();
          {
            int _indexOf_3 = params.indexOf(",");
            int _minus_1 = (-1);
            boolean _notEquals_1 = (_indexOf_3 != _minus_1);
            if (_notEquals_1) {
              _builder.append("\t");
              final String[] parts_1 = params.split(",");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("x=\"");
              String _get_2 = ((List<String>)Conversions.doWrapArray(parts_1)).get(0);
              _builder.append(_get_2, "	");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("y=\"");
              String _get_3 = ((List<String>)Conversions.doWrapArray(parts_1)).get(1);
              _builder.append(_get_3, "	");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t");
              _builder.append("x=\"");
              _builder.append(params, "	");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("y=\"");
              _builder.append(params, "	");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append(">");
          _builder.newLine();
          _builder.append("</Scale>");
          _builder.newLine();
        } else {
          boolean _startsWith_2 = transform.startsWith("rotate");
          if (_startsWith_2) {
            _builder.append("<Rotate");
            _builder.newLine();
            {
              int _indexOf_4 = params.indexOf(",");
              int _minus_2 = (-1);
              boolean _notEquals_2 = (_indexOf_4 != _minus_2);
              if (_notEquals_2) {
                _builder.append("\t");
                final String[] parts_2 = params.split(",");
                _builder.newLineIfNotEmpty();
                {
                  int _size = ((List<String>)Conversions.doWrapArray(parts_2)).size();
                  boolean _equals = (_size == 2);
                  if (_equals) {
                    _builder.append("\t");
                    _builder.append("angle=\"");
                    String _get_4 = ((List<String>)Conversions.doWrapArray(parts_2)).get(0);
                    _builder.append(_get_4, "	");
                    _builder.append("\"");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("pivotX=\"");
                    String _get_5 = ((List<String>)Conversions.doWrapArray(parts_2)).get(1);
                    _builder.append(_get_5, "	");
                    _builder.append("\"");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("pivotY=\"");
                    String _get_6 = ((List<String>)Conversions.doWrapArray(parts_2)).get(1);
                    _builder.append(_get_6, "	");
                    _builder.append("\"");
                    _builder.newLineIfNotEmpty();
                  } else {
                    int _size_1 = ((List<String>)Conversions.doWrapArray(parts_2)).size();
                    boolean _equals_1 = (_size_1 == 3);
                    if (_equals_1) {
                      _builder.append("\t");
                      _builder.append("angle=\"");
                      String _get_7 = ((List<String>)Conversions.doWrapArray(parts_2)).get(0);
                      _builder.append(_get_7, "	");
                      _builder.append("\"");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("pivotX=\"");
                      String _get_8 = ((List<String>)Conversions.doWrapArray(parts_2)).get(1);
                      _builder.append(_get_8, "	");
                      _builder.append("\"");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("pivotY=\"");
                      String _get_9 = ((List<String>)Conversions.doWrapArray(parts_2)).get(2);
                      _builder.append(_get_9, "	");
                      _builder.append("\"");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                }
              } else {
                _builder.append("\t");
                _builder.append("angle=\"");
                _builder.append(params, "	");
                _builder.append("\"");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append(">");
            _builder.newLine();
            _builder.append("</Rotate>");
            _builder.newLine();
          } else {
            boolean _startsWith_3 = transform.startsWith("matrix");
            if (_startsWith_3) {
              final String[] parts_3 = params.split(",");
              _builder.newLineIfNotEmpty();
              _builder.append("<Affine");
              _builder.newLine();
              _builder.append("\t");
              _builder.append("mxx=\"");
              String _get_10 = ((List<String>)Conversions.doWrapArray(parts_3)).get(0);
              _builder.append(_get_10, "	");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("myx=\"");
              String _get_11 = ((List<String>)Conversions.doWrapArray(parts_3)).get(1);
              _builder.append(_get_11, "	");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("mxy=\"");
              String _get_12 = ((List<String>)Conversions.doWrapArray(parts_3)).get(2);
              _builder.append(_get_12, "	");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("myy=\"");
              String _get_13 = ((List<String>)Conversions.doWrapArray(parts_3)).get(3);
              _builder.append(_get_13, "	");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("tx=\"");
              String _get_14 = ((List<String>)Conversions.doWrapArray(parts_3)).get(4);
              _builder.append(_get_14, "	");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("ty=\"");
              String _get_15 = ((List<String>)Conversions.doWrapArray(parts_3)).get(5);
              _builder.append(_get_15, "	");
              _builder.append("\"");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append(">");
              _builder.newLine();
              _builder.append("</Affine>");
              _builder.newLine();
            }
          }
        }
      }
    }
    return _builder;
  }
  
  protected CharSequence _handle(final SvgFilterElement filter) {
    return null;
  }
  
  protected CharSequence _handle(final SvgFeGaussianBlurElement f) {
    return null;
  }
  
  public CycleMethod toFx(final SpreadMethod m) {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(m,SpreadMethod.PAD)) {
        _matched=true;
        return CycleMethod.NO_CYCLE;
      }
    }
    if (!_matched) {
      if (Objects.equal(m,SpreadMethod.REFLECT)) {
        _matched=true;
        return CycleMethod.REFLECT;
      }
    }
    if (!_matched) {
      if (Objects.equal(m,SpreadMethod.REPEAT)) {
        _matched=true;
        return CycleMethod.REPEAT;
      }
    }
    return CycleMethod.NO_CYCLE;
  }
  
  public StrokeLineCap toFx(final Stroke_linecap m) {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(m,Stroke_linecap.BUTT)) {
        _matched=true;
        return StrokeLineCap.BUTT;
      }
    }
    if (!_matched) {
      if (Objects.equal(m,Stroke_linecap.ROUND)) {
        _matched=true;
        return StrokeLineCap.ROUND;
      }
    }
    if (!_matched) {
      if (Objects.equal(m,Stroke_linecap.SQUARE)) {
        _matched=true;
        return StrokeLineCap.SQUARE;
      }
    }
    return StrokeLineCap.BUTT;
  }
  
  public StrokeLineJoin toFx(final Stroke_linejoin m) {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(m,Stroke_linejoin.BEVEL)) {
        _matched=true;
        return StrokeLineJoin.BEVEL;
      }
    }
    if (!_matched) {
      if (Objects.equal(m,Stroke_linejoin.MITER)) {
        _matched=true;
        return StrokeLineJoin.MITER;
      }
    }
    if (!_matched) {
      if (Objects.equal(m,Stroke_linejoin.ROUND)) {
        _matched=true;
        return StrokeLineJoin.ROUND;
      }
    }
    return StrokeLineJoin.BEVEL;
  }
  
  public double parseLength(final String length) {
    boolean _notEquals = (!Objects.equal(length, null));
    if (_notEquals) {
      boolean _endsWith = length.endsWith("px");
      if (_endsWith) {
        int _length = length.length();
        int _minus = (_length - 2);
        String _substring = length.substring(0, _minus);
        return Double.parseDouble(_substring);
      } else {
        return Double.parseDouble(length);
      }
    }
    return 0.0;
  }
  
  public double parseCoordinate(final String coordinate) {
    boolean _notEquals = (!Objects.equal(coordinate, null));
    if (_notEquals) {
      return Double.parseDouble(coordinate);
    }
    return 0.0;
  }
  
  public double parsePercentage(final String percentage) {
    boolean _notEquals = (!Objects.equal(percentage, null));
    if (_notEquals) {
      return Double.parseDouble(percentage);
    }
    return 0.0;
  }
  
  public double parseDouble(final String value) {
    boolean _notEquals = (!Objects.equal(value, null));
    if (_notEquals) {
      return Double.parseDouble(value);
    }
    return 0.0;
  }
  
  public CharSequence handle(final EObject element) {
    if (element instanceof SvgDefsElement) {
      return _handle((SvgDefsElement)element);
    } else if (element instanceof SvgGElement) {
      return _handle((SvgGElement)element);
    } else if (element instanceof SvgSvgElement) {
      return _handle((SvgSvgElement)element);
    } else if (element instanceof SvgCircleElement) {
      return _handle((SvgCircleElement)element);
    } else if (element instanceof SvgClipPathElement) {
      return _handle((SvgClipPathElement)element);
    } else if (element instanceof SvgEllipseElement) {
      return _handle((SvgEllipseElement)element);
    } else if (element instanceof SvgFeGaussianBlurElement) {
      return _handle((SvgFeGaussianBlurElement)element);
    } else if (element instanceof SvgFilterElement) {
      return _handle((SvgFilterElement)element);
    } else if (element instanceof SvgLinearGradientElement) {
      return _handle((SvgLinearGradientElement)element);
    } else if (element instanceof SvgPathElement) {
      return _handle((SvgPathElement)element);
    } else if (element instanceof SvgPolygonElement) {
      return _handle((SvgPolygonElement)element);
    } else if (element instanceof SvgRadialGradientElement) {
      return _handle((SvgRadialGradientElement)element);
    } else if (element instanceof SvgRectElement) {
      return _handle((SvgRectElement)element);
    } else if (element instanceof SvgUseElement) {
      return _handle((SvgUseElement)element);
    } else if (element != null) {
      return _handle(element);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element).toString());
    }
  }
  
  public CharSequence handleFilter(final EObject blur) {
    if (blur instanceof SvgFeGaussianBlurElement) {
      return _handleFilter((SvgFeGaussianBlurElement)blur);
    } else if (blur != null) {
      return _handleFilter(blur);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(blur).toString());
    }
  }
}
