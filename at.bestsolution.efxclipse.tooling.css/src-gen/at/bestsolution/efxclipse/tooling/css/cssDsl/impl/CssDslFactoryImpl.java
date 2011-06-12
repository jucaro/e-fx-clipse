/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CssDslFactoryImpl extends EFactoryImpl implements CssDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CssDslFactory init()
  {
    try
    {
      CssDslFactory theCssDslFactory = (CssDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.bestsolution.at/efxclipse/tooling/css/CssDsl"); 
      if (theCssDslFactory != null)
      {
        return theCssDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CssDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CssDslPackage.STYLESHEET: return createstylesheet();
      case CssDslPackage.MEDIA: return createmedia();
      case CssDslPackage.RULESET: return createruleset();
      case CssDslPackage.SELECTOR: return createselector();
      case CssDslPackage.SIMPLE_SELECTOR: return createsimple_selector();
      case CssDslPackage.ELEMENT_NAME: return createelement_name();
      case CssDslPackage.CSS_CLASS: return createcss_class();
      case CssDslPackage.CSS_ID: return createcss_id();
      case CssDslPackage.CSS_DECLARATION: return createcss_declaration();
      case CssDslPackage.CSS_GENERIC_DECLARATION: return createcss_generic_declaration();
      case CssDslPackage.CSS_FX_DECLARATION: return createcss_fx_declaration();
      case CssDslPackage.FX_FONT_PROPERTY: return createfx_font_property();
      case CssDslPackage.FX_FONT_FAMILY_PROPERTY: return createfx_font_family_property();
      case CssDslPackage.FX_FONT_SIZE_PROPERTY: return createfx_font_size_property();
      case CssDslPackage.FX_FONT_STYLE_PROPERTY: return createfx_font_style_property();
      case CssDslPackage.FX_FONT_WEIGHT_PROPERTY: return createfx_font_weight_property();
      case CssDslPackage.FX_CURSOR_PROPERTY: return createfx_cursor_property();
      case CssDslPackage.FX_EFFECT_PROPERTY: return createfx_effect_property();
      case CssDslPackage.FX_BOOLEAN_PROPERTY: return createfx_boolean_property();
      case CssDslPackage.FX_SIZE_PROPERTY: return createfx_size_property();
      case CssDslPackage.FX_NUMBER_PROPERTY: return createfx_number_property();
      case CssDslPackage.FX_INTEGER_PROPERTY: return createfx_integer_property();
      case CssDslPackage.FX_PAINT_PROPERTY: return createfx_paint_property();
      case CssDslPackage.FX_BLEND_PROPERTY: return createfx_blend_property();
      case CssDslPackage.FX_URL_PROPERTY: return createfx_url_property();
      case CssDslPackage.FX_PAINT_PROPERTIES: return createfx_paint_properties();
      case CssDslPackage.FX_MULTISIZE_PROPERTIES: return createfx_multisize_properties();
      case CssDslPackage.FX_HPOSITION_PROPERTY: return createfx_hposition_property();
      case CssDslPackage.FX_VPOSITION_PROPERTY: return createfx_vposition_property();
      case CssDslPackage.FX_SIDE_PROPERTY: return createfx_side_property();
      case CssDslPackage.FX_BAR_POLICY_PROPERTY: return createfx_bar_policy_property();
      case CssDslPackage.FX_URL_PROPERTIES: return createfx_url_properties();
      case CssDslPackage.FX_REPEAT_PROPERTIES: return createfx_repeat_properties();
      case CssDslPackage.FX_MULTISIZE_PROPERTY: return createfx_multisize_property();
      case CssDslPackage.FX_SIZE_PROPERTIES: return createfx_size_properties();
      case CssDslPackage.FX_STROKE_LINE_CAP_PROPERTY: return createfx_stroke_line_cap_property();
      case CssDslPackage.FX_STROKE_LINE_JOIN_PROPERTY: return createfx_stroke_line_join_property();
      case CssDslPackage.FX_ALIGNMENT_PROPERTY: return createfx_alignment_property();
      case CssDslPackage.FX_TEXT_ORIGIN_PROPERTY: return createfx_text_origin_property();
      case CssDslPackage.FX_POSITION_PROPERTY: return createfx_position_property();
      case CssDslPackage.FX_BACKGROUND_IMAGE_SIZE_PROPERTY: return createfx_background_image_size_property();
      case CssDslPackage.FX_BORDER_STYLE_PROPERTY: return createfx_border_style_property();
      case CssDslPackage.FX_BORDER_IMAGE_SLICE_PROPERTY: return createfx_border_image_slice_property();
      case CssDslPackage.FX_TEXT_OVERRUN_PROPERTY: return createfx_text_overrun_property();
      case CssDslPackage.FX_INSETS_PROPERTY: return createfx_insets_property();
      case CssDslPackage.FX_NUMBER_PROPERTIES: return createfx_number_properties();
      case CssDslPackage.FX_MULTI_PAINT_PROPERTIES: return createfx_multi_paint_properties();
      case CssDslPackage.FX_STRING_PROPERTY: return createfx_string_property();
      case CssDslPackage.EFFECT: return createEffect();
      case CssDslPackage.EFFECT_DROP_SHADOW: return createEffectDropShadow();
      case CssDslPackage.EFFECT_INNER_SHADOW: return createEffectInnerShadow();
      case CssDslPackage.MULTI_PAINT: return createMultiPaint();
      case CssDslPackage.PAINT: return createPaint();
      case CssDslPackage.LINEAR_GRADIENT: return createLinearGradient();
      case CssDslPackage.RADIAL_GRADIENT: return createRadialGradient();
      case CssDslPackage.STOP_VALUE: return createStopValue();
      case CssDslPackage.REPEAT_STYLE: return createRepeatStyle();
      case CssDslPackage.DIM4_SIZE: return createDim4Size();
      case CssDslPackage.BG_POSITION: return createBgPosition();
      case CssDslPackage.FX_COLOR_PROPERTY: return createfx_color_property();
      case CssDslPackage.BG_SIZE: return createBgSize();
      case CssDslPackage.BORDER_STYLE: return createBorderStyle();
      case CssDslPackage.SIZE_FILL: return createSizeFill();
      case CssDslPackage.COLOR: return createColor();
      case CssDslPackage.LOOKED_UP_COLOR: return createLookedUpColor();
      case CssDslPackage.NAMED_COLOR: return createNamedColor();
      case CssDslPackage.RGB_COLOR: return createRGBColor();
      case CssDslPackage.HSB_COLOR: return createHSBColor();
      case CssDslPackage.COLOR_FUNCTION: return createColorFunction();
      case CssDslPackage.FONT: return createFONT();
      case CssDslPackage.FONTWEIGHT: return createFONTWEIGHT();
      case CssDslPackage.FONTSTYLE: return createFONTSTYLE();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CssDslPackage.HPOSITION:
        return createHPositionFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CssDslPackage.HPOSITION:
        return convertHPositionToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public stylesheet createstylesheet()
  {
    stylesheetImpl stylesheet = new stylesheetImpl();
    return stylesheet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public media createmedia()
  {
    mediaImpl media = new mediaImpl();
    return media;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ruleset createruleset()
  {
    rulesetImpl ruleset = new rulesetImpl();
    return ruleset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public selector createselector()
  {
    selectorImpl selector = new selectorImpl();
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_selector createsimple_selector()
  {
    simple_selectorImpl simple_selector = new simple_selectorImpl();
    return simple_selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public element_name createelement_name()
  {
    element_nameImpl element_name = new element_nameImpl();
    return element_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public css_class createcss_class()
  {
    css_classImpl css_class = new css_classImpl();
    return css_class;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public css_id createcss_id()
  {
    css_idImpl css_id = new css_idImpl();
    return css_id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public css_declaration createcss_declaration()
  {
    css_declarationImpl css_declaration = new css_declarationImpl();
    return css_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public css_generic_declaration createcss_generic_declaration()
  {
    css_generic_declarationImpl css_generic_declaration = new css_generic_declarationImpl();
    return css_generic_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public css_fx_declaration createcss_fx_declaration()
  {
    css_fx_declarationImpl css_fx_declaration = new css_fx_declarationImpl();
    return css_fx_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_font_property createfx_font_property()
  {
    fx_font_propertyImpl fx_font_property = new fx_font_propertyImpl();
    return fx_font_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_font_family_property createfx_font_family_property()
  {
    fx_font_family_propertyImpl fx_font_family_property = new fx_font_family_propertyImpl();
    return fx_font_family_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_font_size_property createfx_font_size_property()
  {
    fx_font_size_propertyImpl fx_font_size_property = new fx_font_size_propertyImpl();
    return fx_font_size_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_font_style_property createfx_font_style_property()
  {
    fx_font_style_propertyImpl fx_font_style_property = new fx_font_style_propertyImpl();
    return fx_font_style_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_font_weight_property createfx_font_weight_property()
  {
    fx_font_weight_propertyImpl fx_font_weight_property = new fx_font_weight_propertyImpl();
    return fx_font_weight_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_cursor_property createfx_cursor_property()
  {
    fx_cursor_propertyImpl fx_cursor_property = new fx_cursor_propertyImpl();
    return fx_cursor_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_effect_property createfx_effect_property()
  {
    fx_effect_propertyImpl fx_effect_property = new fx_effect_propertyImpl();
    return fx_effect_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_boolean_property createfx_boolean_property()
  {
    fx_boolean_propertyImpl fx_boolean_property = new fx_boolean_propertyImpl();
    return fx_boolean_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_size_property createfx_size_property()
  {
    fx_size_propertyImpl fx_size_property = new fx_size_propertyImpl();
    return fx_size_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_number_property createfx_number_property()
  {
    fx_number_propertyImpl fx_number_property = new fx_number_propertyImpl();
    return fx_number_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_integer_property createfx_integer_property()
  {
    fx_integer_propertyImpl fx_integer_property = new fx_integer_propertyImpl();
    return fx_integer_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_paint_property createfx_paint_property()
  {
    fx_paint_propertyImpl fx_paint_property = new fx_paint_propertyImpl();
    return fx_paint_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_blend_property createfx_blend_property()
  {
    fx_blend_propertyImpl fx_blend_property = new fx_blend_propertyImpl();
    return fx_blend_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_url_property createfx_url_property()
  {
    fx_url_propertyImpl fx_url_property = new fx_url_propertyImpl();
    return fx_url_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_paint_properties createfx_paint_properties()
  {
    fx_paint_propertiesImpl fx_paint_properties = new fx_paint_propertiesImpl();
    return fx_paint_properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_multisize_properties createfx_multisize_properties()
  {
    fx_multisize_propertiesImpl fx_multisize_properties = new fx_multisize_propertiesImpl();
    return fx_multisize_properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_hposition_property createfx_hposition_property()
  {
    fx_hposition_propertyImpl fx_hposition_property = new fx_hposition_propertyImpl();
    return fx_hposition_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_vposition_property createfx_vposition_property()
  {
    fx_vposition_propertyImpl fx_vposition_property = new fx_vposition_propertyImpl();
    return fx_vposition_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_side_property createfx_side_property()
  {
    fx_side_propertyImpl fx_side_property = new fx_side_propertyImpl();
    return fx_side_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_bar_policy_property createfx_bar_policy_property()
  {
    fx_bar_policy_propertyImpl fx_bar_policy_property = new fx_bar_policy_propertyImpl();
    return fx_bar_policy_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_url_properties createfx_url_properties()
  {
    fx_url_propertiesImpl fx_url_properties = new fx_url_propertiesImpl();
    return fx_url_properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_repeat_properties createfx_repeat_properties()
  {
    fx_repeat_propertiesImpl fx_repeat_properties = new fx_repeat_propertiesImpl();
    return fx_repeat_properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_multisize_property createfx_multisize_property()
  {
    fx_multisize_propertyImpl fx_multisize_property = new fx_multisize_propertyImpl();
    return fx_multisize_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_size_properties createfx_size_properties()
  {
    fx_size_propertiesImpl fx_size_properties = new fx_size_propertiesImpl();
    return fx_size_properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_stroke_line_cap_property createfx_stroke_line_cap_property()
  {
    fx_stroke_line_cap_propertyImpl fx_stroke_line_cap_property = new fx_stroke_line_cap_propertyImpl();
    return fx_stroke_line_cap_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_stroke_line_join_property createfx_stroke_line_join_property()
  {
    fx_stroke_line_join_propertyImpl fx_stroke_line_join_property = new fx_stroke_line_join_propertyImpl();
    return fx_stroke_line_join_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_alignment_property createfx_alignment_property()
  {
    fx_alignment_propertyImpl fx_alignment_property = new fx_alignment_propertyImpl();
    return fx_alignment_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_text_origin_property createfx_text_origin_property()
  {
    fx_text_origin_propertyImpl fx_text_origin_property = new fx_text_origin_propertyImpl();
    return fx_text_origin_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_position_property createfx_position_property()
  {
    fx_position_propertyImpl fx_position_property = new fx_position_propertyImpl();
    return fx_position_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_background_image_size_property createfx_background_image_size_property()
  {
    fx_background_image_size_propertyImpl fx_background_image_size_property = new fx_background_image_size_propertyImpl();
    return fx_background_image_size_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_border_style_property createfx_border_style_property()
  {
    fx_border_style_propertyImpl fx_border_style_property = new fx_border_style_propertyImpl();
    return fx_border_style_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_border_image_slice_property createfx_border_image_slice_property()
  {
    fx_border_image_slice_propertyImpl fx_border_image_slice_property = new fx_border_image_slice_propertyImpl();
    return fx_border_image_slice_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_text_overrun_property createfx_text_overrun_property()
  {
    fx_text_overrun_propertyImpl fx_text_overrun_property = new fx_text_overrun_propertyImpl();
    return fx_text_overrun_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_insets_property createfx_insets_property()
  {
    fx_insets_propertyImpl fx_insets_property = new fx_insets_propertyImpl();
    return fx_insets_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_number_properties createfx_number_properties()
  {
    fx_number_propertiesImpl fx_number_properties = new fx_number_propertiesImpl();
    return fx_number_properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_multi_paint_properties createfx_multi_paint_properties()
  {
    fx_multi_paint_propertiesImpl fx_multi_paint_properties = new fx_multi_paint_propertiesImpl();
    return fx_multi_paint_properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_string_property createfx_string_property()
  {
    fx_string_propertyImpl fx_string_property = new fx_string_propertyImpl();
    return fx_string_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Effect createEffect()
  {
    EffectImpl effect = new EffectImpl();
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectDropShadow createEffectDropShadow()
  {
    EffectDropShadowImpl effectDropShadow = new EffectDropShadowImpl();
    return effectDropShadow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EffectInnerShadow createEffectInnerShadow()
  {
    EffectInnerShadowImpl effectInnerShadow = new EffectInnerShadowImpl();
    return effectInnerShadow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiPaint createMultiPaint()
  {
    MultiPaintImpl multiPaint = new MultiPaintImpl();
    return multiPaint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Paint createPaint()
  {
    PaintImpl paint = new PaintImpl();
    return paint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinearGradient createLinearGradient()
  {
    LinearGradientImpl linearGradient = new LinearGradientImpl();
    return linearGradient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RadialGradient createRadialGradient()
  {
    RadialGradientImpl radialGradient = new RadialGradientImpl();
    return radialGradient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StopValue createStopValue()
  {
    StopValueImpl stopValue = new StopValueImpl();
    return stopValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RepeatStyle createRepeatStyle()
  {
    RepeatStyleImpl repeatStyle = new RepeatStyleImpl();
    return repeatStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dim4Size createDim4Size()
  {
    Dim4SizeImpl dim4Size = new Dim4SizeImpl();
    return dim4Size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BgPosition createBgPosition()
  {
    BgPositionImpl bgPosition = new BgPositionImpl();
    return bgPosition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fx_color_property createfx_color_property()
  {
    fx_color_propertyImpl fx_color_property = new fx_color_propertyImpl();
    return fx_color_property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BgSize createBgSize()
  {
    BgSizeImpl bgSize = new BgSizeImpl();
    return bgSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderStyle createBorderStyle()
  {
    BorderStyleImpl borderStyle = new BorderStyleImpl();
    return borderStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeFill createSizeFill()
  {
    SizeFillImpl sizeFill = new SizeFillImpl();
    return sizeFill;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColor()
  {
    ColorImpl color = new ColorImpl();
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LookedUpColor createLookedUpColor()
  {
    LookedUpColorImpl lookedUpColor = new LookedUpColorImpl();
    return lookedUpColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedColor createNamedColor()
  {
    NamedColorImpl namedColor = new NamedColorImpl();
    return namedColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RGBColor createRGBColor()
  {
    RGBColorImpl rgbColor = new RGBColorImpl();
    return rgbColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HSBColor createHSBColor()
  {
    HSBColorImpl hsbColor = new HSBColorImpl();
    return hsbColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorFunction createColorFunction()
  {
    ColorFunctionImpl colorFunction = new ColorFunctionImpl();
    return colorFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FONT createFONT()
  {
    FONTImpl font = new FONTImpl();
    return font;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FONTWEIGHT createFONTWEIGHT()
  {
    FONTWEIGHTImpl fontweight = new FONTWEIGHTImpl();
    return fontweight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FONTSTYLE createFONTSTYLE()
  {
    FONTSTYLEImpl fontstyle = new FONTSTYLEImpl();
    return fontstyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HPosition createHPositionFromString(EDataType eDataType, String initialValue)
  {
    HPosition result = HPosition.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertHPositionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssDslPackage getCssDslPackage()
  {
    return (CssDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CssDslPackage getPackage()
  {
    return CssDslPackage.eINSTANCE;
  }

} //CssDslFactoryImpl
