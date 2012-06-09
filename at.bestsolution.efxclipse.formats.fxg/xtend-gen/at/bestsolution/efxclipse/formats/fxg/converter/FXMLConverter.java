package at.bestsolution.efxclipse.formats.fxg.converter;

import at.bestsolution.efxclipse.formats.fxg.fxg.BlendMode;
import at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse;
import at.bestsolution.efxclipse.formats.fxg.fxg.FXGElement;
import at.bestsolution.efxclipse.formats.fxg.fxg.Fill;
import at.bestsolution.efxclipse.formats.fxg.fxg.GradientEntry;
import at.bestsolution.efxclipse.formats.fxg.fxg.Graphic;
import at.bestsolution.efxclipse.formats.fxg.fxg.Group;
import at.bestsolution.efxclipse.formats.fxg.fxg.InterpolationMethod;
import at.bestsolution.efxclipse.formats.fxg.fxg.Library;
import at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient;
import at.bestsolution.efxclipse.formats.fxg.fxg.Path;
import at.bestsolution.efxclipse.formats.fxg.fxg.Private;
import at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient;
import at.bestsolution.efxclipse.formats.fxg.fxg.Rect;
import at.bestsolution.efxclipse.formats.fxg.fxg.SolidColor;
import at.bestsolution.efxclipse.formats.fxg.fxg.SpreadMethod;
import at.bestsolution.efxclipse.formats.fxg.fxg.Transform;
import at.bestsolution.efxclipse.formats.fxg.fxg.Winding;
import com.google.common.base.Objects;
import java.util.Arrays;
import javafx.scene.paint.CycleMethod;
import javafx.scene.shape.FillRule;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class FXMLConverter {
  public CharSequence generate(final Graphic graphic) {
    StringConcatenation _builder = new StringConcatenation();
    final CharSequence content = this.handle(graphic);
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
    _builder.newLine();
    _builder.append(content, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence handle(final Graphic graphic) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Group fx:id=\'_root\' xmlns:fx=\"http://javafx.com/fxml\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<children>");
    _builder.newLine();
    {
      EList<FXGElement> __children = graphic.get_children();
      final Function1<FXGElement,Boolean> _function = new Function1<FXGElement,Boolean>() {
          public Boolean apply(final FXGElement o) {
            boolean _or = false;
            if ((o instanceof Library)) {
              _or = true;
            } else {
              _or = ((o instanceof Library) || (o instanceof Private));
            }
            boolean _not = (!_or);
            return Boolean.valueOf(_not);
          }
        };
      Iterable<FXGElement> _filter = IterableExtensions.<FXGElement>filter(__children, _function);
      for(final FXGElement o : _filter) {
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
  
  protected CharSequence _handle(final Group group) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Group");
    _builder.newLine();
    _builder.append("\t");
    {
      Double _alpha = group.getAlpha();
      boolean _notEquals = (!Objects.equal(_alpha, null));
      if (_notEquals) {
        _builder.append("opacity=\"");
        Double _alpha_1 = group.getAlpha();
        _builder.append(_alpha_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      BlendMode _blendMode = group.getBlendMode();
      boolean _notEquals_1 = (!Objects.equal(_blendMode, BlendMode.NOT_SET));
      if (_notEquals_1) {
        _builder.append("blendMode=\"");
        BlendMode _blendMode_1 = group.getBlendMode();
        String _fX = this.toFX(_blendMode_1);
        _builder.append(_fX, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _id = group.getId();
      boolean _notEquals_2 = (!Objects.equal(_id, null));
      if (_notEquals_2) {
        _builder.append("fx:id=\"");
        String _id_1 = group.getId();
        _builder.append(_id_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _rotation = group.getRotation();
      boolean _notEquals_3 = (!Objects.equal(_rotation, null));
      if (_notEquals_3) {
        _builder.append("rotate=\"");
        String _rotation_1 = group.getRotation();
        _builder.append(_rotation_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _scaleGridBottom = group.getScaleGridBottom();
      boolean _notEquals_4 = (!Objects.equal(_scaleGridBottom, null));
      if (_notEquals_4) {
        _builder.append("fx:todo=\"scaleGridBottom\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _scaleGridLeft = group.getScaleGridLeft();
      boolean _notEquals_5 = (!Objects.equal(_scaleGridLeft, null));
      if (_notEquals_5) {
        _builder.append("fx:todo=\"scaleGridLeft\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _scaleGridRight = group.getScaleGridRight();
      boolean _notEquals_6 = (!Objects.equal(_scaleGridRight, null));
      if (_notEquals_6) {
        _builder.append("fx:todo=\"scaleGridRight\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _scaleGridTop = group.getScaleGridTop();
      boolean _notEquals_7 = (!Objects.equal(_scaleGridTop, null));
      if (_notEquals_7) {
        _builder.append("fx:todo=\"scaleGridTop\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _scaleX = group.getScaleX();
      boolean _notEquals_8 = (!Objects.equal(_scaleX, null));
      if (_notEquals_8) {
        _builder.append("scaleX=\"");
        String _scaleX_1 = group.getScaleX();
        _builder.append(_scaleX_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _scaleY = group.getScaleY();
      boolean _notEquals_9 = (!Objects.equal(_scaleY, null));
      if (_notEquals_9) {
        _builder.append("scaleY=\"");
        String _scaleY_1 = group.getScaleY();
        _builder.append(_scaleY_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _visible = group.getVisible();
      boolean _notEquals_10 = (!Objects.equal(_visible, null));
      if (_notEquals_10) {
        _builder.append("visible=\"");
        String _visible_1 = group.getVisible();
        _builder.append(_visible_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _x = group.getX();
      boolean _notEquals_11 = (!Objects.equal(_x, null));
      if (_notEquals_11) {
        _builder.append("translateX=\"");
        String _x_1 = group.getX();
        _builder.append(_x_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _y = group.getY();
      boolean _notEquals_12 = (!Objects.equal(_y, null));
      if (_notEquals_12) {
        _builder.append("translateY=\"");
        String _y_1 = group.getY();
        _builder.append(_y_1, "	");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<FXGElement> __children = group.get_children();
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(__children);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("\t");
        _builder.append("<children>");
        _builder.newLine();
        {
          EList<FXGElement> __children_1 = group.get_children();
          for(final FXGElement o : __children_1) {
            _builder.append("\t");
            _builder.append("\t");
            CharSequence _handle = this.handle(o);
            _builder.append(_handle, "		");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("</children>");
        _builder.newLine();
      }
    }
    {
      Group _mask = group.getMask();
      boolean _notEquals_13 = (!Objects.equal(_mask, null));
      if (_notEquals_13) {
        {
          boolean _or = false;
          String _maskType = group.getMaskType();
          boolean _equals = Objects.equal(_maskType, null);
          if (_equals) {
            _or = true;
          } else {
            String _maskType_1 = group.getMaskType();
            boolean _equals_1 = _maskType_1.equals("clip");
            _or = (_equals || _equals_1);
          }
          if (_or) {
            _builder.append("\t");
            _builder.append("<clip>");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            Group _mask_1 = group.getMask();
            CharSequence _handle_1 = this.handle(_mask_1);
            _builder.append(_handle_1, "		");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("</clip>");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("<!-- TODO Handle masktype: ");
            String _maskType_2 = group.getMaskType();
            _builder.append(_maskType_2, "	");
            _builder.append(" -->");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("</Group>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final Transform transform) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _handle(final Rect rect) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Rectangle");
    _builder.newLine();
    _builder.append("\t");
    {
      Double _alpha = rect.getAlpha();
      boolean _notEquals = (!Objects.equal(_alpha, null));
      if (_notEquals) {
        _builder.append("opacity=\"");
        Double _alpha_1 = rect.getAlpha();
        _builder.append(_alpha_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      BlendMode _blendMode = rect.getBlendMode();
      boolean _notEquals_1 = (!Objects.equal(_blendMode, BlendMode.NOT_SET));
      if (_notEquals_1) {
        _builder.append("blendMode=\"");
        BlendMode _blendMode_1 = rect.getBlendMode();
        String _fX = this.toFX(_blendMode_1);
        _builder.append(_fX, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _height = rect.getHeight();
      boolean _notEquals_2 = (!Objects.equal(_height, null));
      if (_notEquals_2) {
        _builder.append("height=\"");
        String _height_1 = rect.getHeight();
        _builder.append(_height_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _rotation = rect.getRotation();
      boolean _notEquals_3 = (!Objects.equal(_rotation, null));
      if (_notEquals_3) {
        _builder.append("rotate=\"");
        Double _rotation_1 = rect.getRotation();
        _builder.append(_rotation_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _scaleX = rect.getScaleX();
      boolean _notEquals_4 = (!Objects.equal(_scaleX, null));
      if (_notEquals_4) {
        _builder.append("scaleX=\"");
        Double _scaleX_1 = rect.getScaleX();
        _builder.append(_scaleX_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _scaleY = rect.getScaleY();
      boolean _notEquals_5 = (!Objects.equal(_scaleY, null));
      if (_notEquals_5) {
        _builder.append("scaleY=\"");
        Double _scaleY_1 = rect.getScaleY();
        _builder.append(_scaleY_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Boolean _visible = rect.getVisible();
      boolean _notEquals_6 = (!Objects.equal(_visible, null));
      if (_notEquals_6) {
        _builder.append("visible=\"");
        Boolean _visible_1 = rect.getVisible();
        _builder.append(_visible_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _width = rect.getWidth();
      boolean _notEquals_7 = (!Objects.equal(_width, null));
      if (_notEquals_7) {
        _builder.append("width=\"");
        String _width_1 = rect.getWidth();
        _builder.append(_width_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _x = rect.getX();
      boolean _notEquals_8 = (!Objects.equal(_x, null));
      if (_notEquals_8) {
        _builder.append("x=\"");
        Double _x_1 = rect.getX();
        _builder.append(_x_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _y = rect.getY();
      boolean _notEquals_9 = (!Objects.equal(_y, null));
      if (_notEquals_9) {
        _builder.append("y=\"");
        Double _y_1 = rect.getY();
        _builder.append(_y_1, "	");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      Fill _fill = rect.getFill();
      boolean _notEquals_10 = (!Objects.equal(_fill, null));
      if (_notEquals_10) {
        _builder.append("\t");
        _builder.append("<fill>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        Fill _fill_1 = rect.getFill();
        CharSequence _handle = this.handle(_fill_1);
        _builder.append(_handle, "		");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</fill>");
        _builder.newLine();
      }
    }
    {
      Group _mask = rect.getMask();
      boolean _notEquals_11 = (!Objects.equal(_mask, null));
      if (_notEquals_11) {
        _builder.append("\t");
        _builder.append("<clip>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        Group _mask_1 = rect.getMask();
        CharSequence _handle_1 = this.handle(_mask_1);
        _builder.append(_handle_1, "		");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</clip>");
        _builder.newLine();
      }
    }
    _builder.append("</Rectangle>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final SolidColor color) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Color>");
    _builder.newLine();
    _builder.append("\t");
    {
      String _color = color.getColor();
      boolean _notEquals = (!Objects.equal(_color, null));
      if (_notEquals) {
        _builder.append("<red>");
        String _color_1 = color.getColor();
        double _red = this.red(_color_1);
        _builder.append(_red, "	");
        _builder.append("</red>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _color_2 = color.getColor();
      boolean _notEquals_1 = (!Objects.equal(_color_2, null));
      if (_notEquals_1) {
        _builder.append("<green>");
        String _color_3 = color.getColor();
        double _green = this.green(_color_3);
        _builder.append(_green, "	");
        _builder.append("</green>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _color_4 = color.getColor();
      boolean _notEquals_2 = (!Objects.equal(_color_4, null));
      if (_notEquals_2) {
        _builder.append("<blue>");
        String _color_5 = color.getColor();
        double _blue = this.blue(_color_5);
        _builder.append(_blue, "	");
        _builder.append("</blue>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _alpha = color.getAlpha();
      boolean _notEquals_3 = (!Objects.equal(_alpha, null));
      if (_notEquals_3) {
        _builder.append("<opacity>");
        Double _alpha_1 = color.getAlpha();
        _builder.append(_alpha_1, "	");
        _builder.append("</opacity>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</Color>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final RadialGradient gradient) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<RadialGradient");
    _builder.newLine();
    _builder.append("\t");
    {
      Double _focalPointRatio = gradient.getFocalPointRatio();
      boolean _notEquals = (!Objects.equal(_focalPointRatio, null));
      if (_notEquals) {
        _builder.append("fx:todo=\"focalPointRatio\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      InterpolationMethod _interpolationMethod = gradient.getInterpolationMethod();
      boolean _notEquals_1 = (!Objects.equal(_interpolationMethod, InterpolationMethod.NOT_SET));
      if (_notEquals_1) {
        _builder.append("fx:todo=\"interpolationMethod\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _rotation = gradient.getRotation();
      boolean _notEquals_2 = (!Objects.equal(_rotation, null));
      if (_notEquals_2) {
        _builder.append("fx:todo=\"rotation\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _scaleX = gradient.getScaleX();
      boolean _notEquals_3 = (!Objects.equal(_scaleX, null));
      if (_notEquals_3) {
        _builder.append("radius=\"");
        Double _scaleX_1 = gradient.getScaleX();
        _builder.append(_scaleX_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _scaleY = gradient.getScaleY();
      boolean _notEquals_4 = (!Objects.equal(_scaleY, null));
      if (_notEquals_4) {
        _builder.append("fx:todo=\"scaleY\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      SpreadMethod _spreadMethod = gradient.getSpreadMethod();
      boolean _notEquals_5 = (!Objects.equal(_spreadMethod, SpreadMethod.NOT_SET));
      if (_notEquals_5) {
        _builder.append("cycleMethod=\"");
        {
          SpreadMethod _spreadMethod_1 = gradient.getSpreadMethod();
          boolean _equals = Objects.equal(_spreadMethod_1, SpreadMethod.REFLECT);
          if (_equals) {
            String _name = CycleMethod.REFLECT.name();
            _builder.append(_name, "	");
          } else {
            String _name_1 = CycleMethod.REPEAT.name();
            _builder.append(_name_1, "	");
          }
        }
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _x = gradient.getX();
      boolean _notEquals_6 = (!Objects.equal(_x, null));
      if (_notEquals_6) {
        _builder.append("centerX=\"");
        Double _x_1 = gradient.getX();
        _builder.append(_x_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _y = gradient.getY();
      boolean _notEquals_7 = (!Objects.equal(_y, null));
      if (_notEquals_7) {
        _builder.append("centerY=\"");
        Double _y_1 = gradient.getY();
        _builder.append(_y_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("proporional=\"false\">");
    _builder.newLine();
    {
      EList<GradientEntry> __children = gradient.get_children();
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(__children);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("\t");
        _builder.append("<stops>");
        _builder.newLine();
        {
          EList<GradientEntry> __children_1 = gradient.get_children();
          for(final GradientEntry o : __children_1) {
            _builder.append("\t");
            _builder.append("\t");
            CharSequence _handle = this.handle(o);
            _builder.append(_handle, "		");
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
  
  protected CharSequence _handle(final LinearGradient gradient) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<LinearGradient");
    _builder.newLine();
    _builder.append("\t");
    {
      InterpolationMethod _interpolationMethod = gradient.getInterpolationMethod();
      boolean _notEquals = (!Objects.equal(_interpolationMethod, InterpolationMethod.NOT_SET));
      if (_notEquals) {
        _builder.append("fx:todo=\"interpolationMethod\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _rotation = gradient.getRotation();
      boolean _notEquals_1 = (!Objects.equal(_rotation, null));
      if (_notEquals_1) {
        _builder.append("fx:todo=\"rotation\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _scaleX = gradient.getScaleX();
      boolean _notEquals_2 = (!Objects.equal(_scaleX, null));
      if (_notEquals_2) {
        _builder.append("endX=\"");
        Double _scaleX_1 = gradient.getScaleX();
        _builder.append(_scaleX_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _scaleX_2 = gradient.getScaleX();
      boolean _notEquals_3 = (!Objects.equal(_scaleX_2, null));
      if (_notEquals_3) {
        _builder.append("endY=\"");
        Double _scaleX_3 = gradient.getScaleX();
        _builder.append(_scaleX_3, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      SpreadMethod _spreadMethod = gradient.getSpreadMethod();
      boolean _notEquals_4 = (!Objects.equal(_spreadMethod, SpreadMethod.NOT_SET));
      if (_notEquals_4) {
        _builder.append("cycleMethod=\"");
        {
          SpreadMethod _spreadMethod_1 = gradient.getSpreadMethod();
          boolean _equals = Objects.equal(_spreadMethod_1, SpreadMethod.REFLECT);
          if (_equals) {
            String _name = CycleMethod.REFLECT.name();
            _builder.append(_name, "	");
          } else {
            String _name_1 = CycleMethod.REPEAT.name();
            _builder.append(_name_1, "	");
          }
        }
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _x = gradient.getX();
      boolean _notEquals_5 = (!Objects.equal(_x, null));
      if (_notEquals_5) {
        _builder.append("startX=\"");
        Double _x_1 = gradient.getX();
        _builder.append(_x_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _y = gradient.getY();
      boolean _notEquals_6 = (!Objects.equal(_y, null));
      if (_notEquals_6) {
        _builder.append("startY=\"");
        Double _y_1 = gradient.getY();
        _builder.append(_y_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("proporional=\"false\">");
    _builder.newLine();
    {
      EList<GradientEntry> __children = gradient.get_children();
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(__children);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        _builder.append("\t");
        _builder.append("<stops>");
        _builder.newLine();
        {
          EList<GradientEntry> __children_1 = gradient.get_children();
          for(final GradientEntry o : __children_1) {
            _builder.append("\t");
            _builder.append("\t");
            CharSequence _handle = this.handle(o);
            _builder.append(_handle, "		");
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
  
  protected CharSequence _handle(final GradientEntry entry) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Stop");
    _builder.newLine();
    _builder.append("\t");
    {
      Double _ratio = entry.getRatio();
      boolean _notEquals = (!Objects.equal(_ratio, null));
      if (_notEquals) {
        _builder.append("offset=\"");
        Double _ratio_1 = entry.getRatio();
        _builder.append(_ratio_1, "	");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      String _color = entry.getColor();
      boolean _notEquals_1 = (!Objects.equal(_color, null));
      if (_notEquals_1) {
        _builder.append("\t");
        _builder.append("<color>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<red>");
        String _color_1 = entry.getColor();
        double _red = this.red(_color_1);
        _builder.append(_red, "		");
        _builder.append("</red>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<green>");
        String _color_2 = entry.getColor();
        double _green = this.green(_color_2);
        _builder.append(_green, "		");
        _builder.append("</green>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<blue>");
        String _color_3 = entry.getColor();
        double _blue = this.blue(_color_3);
        _builder.append(_blue, "		");
        _builder.append("</blue>");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        {
          Double _alpha = entry.getAlpha();
          boolean _notEquals_2 = (!Objects.equal(_alpha, null));
          if (_notEquals_2) {
            _builder.append("<opacity>");
            Double _alpha_1 = entry.getAlpha();
            _builder.append(_alpha_1, "		");
            _builder.append("</opacity>");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</color>");
        _builder.newLine();
      }
    }
    _builder.append("</Stop>");
    _builder.newLine();
    return _builder;
  }
  
  public double red(final String color) {
    String _substring = color.substring(1, 3);
    Integer _valueOf = Integer.valueOf(_substring, 16);
    Double _valueOf_1 = Double.valueOf("255.0");
    return (((double) (_valueOf).intValue()) / (_valueOf_1).doubleValue());
  }
  
  public double green(final String color) {
    String _substring = color.substring(3, 5);
    Integer _valueOf = Integer.valueOf(_substring, 16);
    Double _valueOf_1 = Double.valueOf("255.0");
    return (((double) (_valueOf).intValue()) / (_valueOf_1).doubleValue());
  }
  
  public double blue(final String color) {
    String _substring = color.substring(5, 7);
    Integer _valueOf = Integer.valueOf(_substring, 16);
    Double _valueOf_1 = Double.valueOf("255.0");
    return (((double) (_valueOf).intValue()) / (_valueOf_1).doubleValue());
  }
  
  protected CharSequence _handle(final Path path) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<SVGPath");
    _builder.newLine();
    _builder.append("\t");
    {
      Double _alpha = path.getAlpha();
      boolean _notEquals = (!Objects.equal(_alpha, null));
      if (_notEquals) {
        _builder.append("opacity=\"");
        Double _alpha_1 = path.getAlpha();
        _builder.append(_alpha_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      BlendMode _blendMode = path.getBlendMode();
      boolean _notEquals_1 = (!Objects.equal(_blendMode, BlendMode.NOT_SET));
      if (_notEquals_1) {
        _builder.append("blendMode=\"");
        BlendMode _blendMode_1 = path.getBlendMode();
        String _fX = this.toFX(_blendMode_1);
        _builder.append(_fX, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _data = path.getData();
      boolean _notEquals_2 = (!Objects.equal(_data, null));
      if (_notEquals_2) {
        _builder.append("content=\"");
        String _data_1 = path.getData();
        _builder.append(_data_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _rotation = path.getRotation();
      boolean _notEquals_3 = (!Objects.equal(_rotation, null));
      if (_notEquals_3) {
        _builder.append("rotate=\"");
        Double _rotation_1 = path.getRotation();
        _builder.append(_rotation_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _scaleX = path.getScaleX();
      boolean _notEquals_4 = (!Objects.equal(_scaleX, null));
      if (_notEquals_4) {
        _builder.append("scaleX=\"");
        Double _scaleX_1 = path.getScaleX();
        _builder.append(_scaleX_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _scaleY = path.getScaleY();
      boolean _notEquals_5 = (!Objects.equal(_scaleY, null));
      if (_notEquals_5) {
        _builder.append("scaleY=\"");
        Double _scaleY_1 = path.getScaleY();
        _builder.append(_scaleY_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Boolean _visible = path.getVisible();
      boolean _notEquals_6 = (!Objects.equal(_visible, null));
      if (_notEquals_6) {
        _builder.append("visible=\"");
        Boolean _visible_1 = path.getVisible();
        _builder.append(_visible_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Winding _winding = path.getWinding();
      boolean _notEquals_7 = (!Objects.equal(_winding, Winding.NOT_SET));
      if (_notEquals_7) {
        _builder.append("fillRule=\"");
        String _xifexpression = null;
        Winding _winding_1 = path.getWinding();
        boolean _equals = Objects.equal(_winding_1, Winding.EVEN_ODD);
        if (_equals) {
          String _name = FillRule.EVEN_ODD.name();
          _xifexpression = _name;
        } else {
          String _name_1 = FillRule.NON_ZERO.name();
          _xifexpression = _name_1;
        }
        _builder.append(_xifexpression, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _x = path.getX();
      boolean _notEquals_8 = (!Objects.equal(_x, null));
      if (_notEquals_8) {
        _builder.append("fx:todo=\"x\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _y = path.getY();
      boolean _notEquals_9 = (!Objects.equal(_y, null));
      if (_notEquals_9) {
        _builder.append("fx:todo=\"y\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      Fill _fill = path.getFill();
      boolean _notEquals_10 = (!Objects.equal(_fill, null));
      if (_notEquals_10) {
        _builder.append("\t");
        _builder.append("<fill>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        Fill _fill_1 = path.getFill();
        CharSequence _handle = this.handle(_fill_1);
        _builder.append(_handle, "		");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</fill>");
        _builder.newLine();
      }
    }
    {
      Group _mask = path.getMask();
      boolean _notEquals_11 = (!Objects.equal(_mask, null));
      if (_notEquals_11) {
        _builder.append("\t");
        _builder.append("<clip>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        Group _mask_1 = path.getMask();
        CharSequence _handle_1 = this.handle(_mask_1);
        _builder.append(_handle_1, "		");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</clip>");
        _builder.newLine();
      }
    }
    _builder.append("</SVGPath>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _handle(final Ellipse ellipse) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<Ellipse");
    _builder.newLine();
    _builder.append("\t");
    {
      Double _alpha = ellipse.getAlpha();
      boolean _notEquals = (!Objects.equal(_alpha, null));
      if (_notEquals) {
        _builder.append("opacity=\"");
        Double _alpha_1 = ellipse.getAlpha();
        _builder.append(_alpha_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      BlendMode _blendMode = ellipse.getBlendMode();
      boolean _notEquals_1 = (!Objects.equal(_blendMode, BlendMode.NOT_SET));
      if (_notEquals_1) {
        _builder.append("blendMode=\"");
        BlendMode _blendMode_1 = ellipse.getBlendMode();
        String _fX = this.toFX(_blendMode_1);
        _builder.append(_fX, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _height = ellipse.getHeight();
      boolean _notEquals_2 = (!Objects.equal(_height, null));
      if (_notEquals_2) {
        _builder.append("radiusX=\"");
        String _width = ellipse.getWidth();
        double _parseLength = this.parseLength(_width);
        Double _valueOf = Double.valueOf("0.5");
        double _multiply = (_parseLength * (_valueOf).doubleValue());
        _builder.append(_multiply, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _rotation = ellipse.getRotation();
      boolean _notEquals_3 = (!Objects.equal(_rotation, null));
      if (_notEquals_3) {
        _builder.append("rotate=\"");
        Double _rotation_1 = ellipse.getRotation();
        _builder.append(_rotation_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _scaleX = ellipse.getScaleX();
      boolean _notEquals_4 = (!Objects.equal(_scaleX, null));
      if (_notEquals_4) {
        _builder.append("scaleX=\"");
        Double _scaleX_1 = ellipse.getScaleX();
        _builder.append(_scaleX_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _scaleY = ellipse.getScaleY();
      boolean _notEquals_5 = (!Objects.equal(_scaleY, null));
      if (_notEquals_5) {
        _builder.append("scaleY=\"");
        Double _scaleY_1 = ellipse.getScaleY();
        _builder.append(_scaleY_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Boolean _visible = ellipse.getVisible();
      boolean _notEquals_6 = (!Objects.equal(_visible, null));
      if (_notEquals_6) {
        _builder.append("visible=\"");
        Boolean _visible_1 = ellipse.getVisible();
        _builder.append(_visible_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      String _width_1 = ellipse.getWidth();
      boolean _notEquals_7 = (!Objects.equal(_width_1, null));
      if (_notEquals_7) {
        _builder.append("radiusY=\"");
        String _height_1 = ellipse.getHeight();
        double _parseLength_1 = this.parseLength(_height_1);
        Double _valueOf_1 = Double.valueOf("0.5");
        double _multiply_1 = (_parseLength_1 * (_valueOf_1).doubleValue());
        _builder.append(_multiply_1, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _x = ellipse.getX();
      boolean _notEquals_8 = (!Objects.equal(_x, null));
      if (_notEquals_8) {
        _builder.append("centerX=\"");
        Double _xifexpression = null;
        String _width_2 = ellipse.getWidth();
        boolean _equals = Objects.equal(_width_2, null);
        if (_equals) {
          Double _x_1 = ellipse.getX();
          _xifexpression = _x_1;
        } else {
          Double _x_2 = ellipse.getX();
          String _width_3 = ellipse.getWidth();
          double _parseLength_2 = this.parseLength(_width_3);
          Double _valueOf_2 = Double.valueOf("0.5");
          double _multiply_2 = (_parseLength_2 * (_valueOf_2).doubleValue());
          double _plus = ((_x_2).doubleValue() + _multiply_2);
          _xifexpression = _plus;
        }
        _builder.append(_xifexpression, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Double _y = ellipse.getY();
      boolean _notEquals_9 = (!Objects.equal(_y, null));
      if (_notEquals_9) {
        _builder.append("centerY=\"");
        Double _xifexpression_1 = null;
        String _height_2 = ellipse.getHeight();
        boolean _equals_1 = Objects.equal(_height_2, null);
        if (_equals_1) {
          Double _y_1 = ellipse.getY();
          _xifexpression_1 = _y_1;
        } else {
          Double _y_2 = ellipse.getY();
          String _height_3 = ellipse.getHeight();
          double _parseLength_3 = this.parseLength(_height_3);
          Double _valueOf_3 = Double.valueOf("0.5");
          double _multiply_3 = (_parseLength_3 * (_valueOf_3).doubleValue());
          double _plus_1 = ((_y_2).doubleValue() + _multiply_3);
          _xifexpression_1 = _plus_1;
        }
        _builder.append(_xifexpression_1, "	");
        _builder.append("\"");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      Fill _fill = ellipse.getFill();
      boolean _notEquals_10 = (!Objects.equal(_fill, null));
      if (_notEquals_10) {
        _builder.append("\t");
        _builder.append("<fill>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        Fill _fill_1 = ellipse.getFill();
        CharSequence _handle = this.handle(_fill_1);
        _builder.append(_handle, "		");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</fill>");
        _builder.newLine();
      }
    }
    {
      Group _mask = ellipse.getMask();
      boolean _notEquals_11 = (!Objects.equal(_mask, null));
      if (_notEquals_11) {
        _builder.append("\t");
        _builder.append("<clip>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        Group _mask_1 = ellipse.getMask();
        CharSequence _handle_1 = this.handle(_mask_1);
        _builder.append(_handle_1, "		");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("</clip>");
        _builder.newLine();
      }
    }
    _builder.append("</Ellipse>");
    _builder.newLine();
    return _builder;
  }
  
  public double parseLength(final String length) {
    return Double.parseDouble(length);
  }
  
  public String toFX(final BlendMode fxgMode) {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(fxgMode,BlendMode.ADD)) {
        _matched=true;
        return javafx.scene.effect.BlendMode.ADD.toString();
      }
    }
    if (!_matched) {
      if (Objects.equal(fxgMode,BlendMode.ALPHA)) {
        _matched=true;
        return "null";
      }
    }
    if (!_matched) {
      if (Objects.equal(fxgMode,BlendMode.DARKEN)) {
        _matched=true;
        return javafx.scene.effect.BlendMode.DARKEN.toString();
      }
    }
    if (!_matched) {
      if (Objects.equal(fxgMode,BlendMode.DIFFERENCE)) {
        _matched=true;
        return javafx.scene.effect.BlendMode.DIFFERENCE.toString();
      }
    }
    if (!_matched) {
      if (Objects.equal(fxgMode,BlendMode.ERASE)) {
        _matched=true;
        return "null";
      }
    }
    if (!_matched) {
      if (Objects.equal(fxgMode,BlendMode.HARDLIGHT)) {
        _matched=true;
        return "null";
      }
    }
    if (!_matched) {
      if (Objects.equal(fxgMode,BlendMode.INVERT)) {
        _matched=true;
        return "null";
      }
    }
    if (!_matched) {
      if (Objects.equal(fxgMode,BlendMode.LAYER)) {
        _matched=true;
        return "null";
      }
    }
    if (!_matched) {
      if (Objects.equal(fxgMode,BlendMode.LIGHTEN)) {
        _matched=true;
        return javafx.scene.effect.BlendMode.LIGHTEN.toString();
      }
    }
    if (!_matched) {
      if (Objects.equal(fxgMode,BlendMode.MULTIPLY)) {
        _matched=true;
        return javafx.scene.effect.BlendMode.MULTIPLY.toString();
      }
    }
    if (!_matched) {
      if (Objects.equal(fxgMode,BlendMode.NORMAL)) {
        _matched=true;
        return "null";
      }
    }
    if (!_matched) {
      if (Objects.equal(fxgMode,BlendMode.OVERLAY)) {
        _matched=true;
        return javafx.scene.effect.BlendMode.OVERLAY.toString();
      }
    }
    if (!_matched) {
      if (Objects.equal(fxgMode,BlendMode.SCREEN)) {
        _matched=true;
        return javafx.scene.effect.BlendMode.SCREEN.toString();
      }
    }
    if (!_matched) {
      if (Objects.equal(fxgMode,BlendMode.SHADER)) {
        _matched=true;
        return "null";
      }
    }
    if (!_matched) {
      if (Objects.equal(fxgMode,BlendMode.SUBTRACT)) {
        _matched=true;
        return "null";
      }
    }
    if (!_matched) {
      if (Objects.equal(fxgMode,BlendMode.NOT_SET)) {
        _matched=true;
        return "null";
      }
    }
    return "null";
  }
  
  public CharSequence handle(final EObject ellipse) {
    if (ellipse instanceof Ellipse) {
      return _handle((Ellipse)ellipse);
    } else if (ellipse instanceof Group) {
      return _handle((Group)ellipse);
    } else if (ellipse instanceof LinearGradient) {
      return _handle((LinearGradient)ellipse);
    } else if (ellipse instanceof RadialGradient) {
      return _handle((RadialGradient)ellipse);
    } else if (ellipse instanceof Rect) {
      return _handle((Rect)ellipse);
    } else if (ellipse instanceof SolidColor) {
      return _handle((SolidColor)ellipse);
    } else if (ellipse instanceof GradientEntry) {
      return _handle((GradientEntry)ellipse);
    } else if (ellipse instanceof Path) {
      return _handle((Path)ellipse);
    } else if (ellipse instanceof Transform) {
      return _handle((Transform)ellipse);
    } else if (ellipse != null) {
      return _handle(ellipse);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ellipse).toString());
    }
  }
}
