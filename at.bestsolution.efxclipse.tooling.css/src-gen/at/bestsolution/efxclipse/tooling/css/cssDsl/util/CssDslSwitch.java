/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.util;

import at.bestsolution.efxclipse.tooling.css.cssDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage
 * @generated
 */
public class CssDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CssDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CssDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CssDslPackage.STYLESHEET:
      {
        stylesheet stylesheet = (stylesheet)theEObject;
        T result = casestylesheet(stylesheet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.MEDIA:
      {
        media media = (media)theEObject;
        T result = casemedia(media);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.RULESET:
      {
        ruleset ruleset = (ruleset)theEObject;
        T result = caseruleset(ruleset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.SELECTOR:
      {
        selector selector = (selector)theEObject;
        T result = caseselector(selector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.SIMPLE_SELECTOR:
      {
        simple_selector simple_selector = (simple_selector)theEObject;
        T result = casesimple_selector(simple_selector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.CSS_DECLARATION:
      {
        css_declaration css_declaration = (css_declaration)theEObject;
        T result = casecss_declaration(css_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.CSS_GENERIC_DECLARATION:
      {
        css_generic_declaration css_generic_declaration = (css_generic_declaration)theEObject;
        T result = casecss_generic_declaration(css_generic_declaration);
        if (result == null) result = casecss_declaration(css_generic_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.CSS_FX_DECLARATION:
      {
        css_fx_declaration css_fx_declaration = (css_fx_declaration)theEObject;
        T result = casecss_fx_declaration(css_fx_declaration);
        if (result == null) result = casecss_declaration(css_fx_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_FONT_PROPERTY:
      {
        fx_font_property fx_font_property = (fx_font_property)theEObject;
        T result = casefx_font_property(fx_font_property);
        if (result == null) result = casecss_fx_declaration(fx_font_property);
        if (result == null) result = casecss_declaration(fx_font_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_FONT_FAMILY_PROPERTY:
      {
        fx_font_family_property fx_font_family_property = (fx_font_family_property)theEObject;
        T result = casefx_font_family_property(fx_font_family_property);
        if (result == null) result = casecss_fx_declaration(fx_font_family_property);
        if (result == null) result = casecss_declaration(fx_font_family_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_FONT_SIZE_PROPERTY:
      {
        fx_font_size_property fx_font_size_property = (fx_font_size_property)theEObject;
        T result = casefx_font_size_property(fx_font_size_property);
        if (result == null) result = casecss_fx_declaration(fx_font_size_property);
        if (result == null) result = casecss_declaration(fx_font_size_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_FONT_STYLE_PROPERTY:
      {
        fx_font_style_property fx_font_style_property = (fx_font_style_property)theEObject;
        T result = casefx_font_style_property(fx_font_style_property);
        if (result == null) result = casecss_fx_declaration(fx_font_style_property);
        if (result == null) result = casecss_declaration(fx_font_style_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_FONT_WEIGHT_PROPERTY:
      {
        fx_font_weight_property fx_font_weight_property = (fx_font_weight_property)theEObject;
        T result = casefx_font_weight_property(fx_font_weight_property);
        if (result == null) result = casecss_fx_declaration(fx_font_weight_property);
        if (result == null) result = casecss_declaration(fx_font_weight_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_CURSOR_PROPERTY:
      {
        fx_cursor_property fx_cursor_property = (fx_cursor_property)theEObject;
        T result = casefx_cursor_property(fx_cursor_property);
        if (result == null) result = casecss_fx_declaration(fx_cursor_property);
        if (result == null) result = casecss_declaration(fx_cursor_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_EFFECT_PROPERTY:
      {
        fx_effect_property fx_effect_property = (fx_effect_property)theEObject;
        T result = casefx_effect_property(fx_effect_property);
        if (result == null) result = casecss_fx_declaration(fx_effect_property);
        if (result == null) result = casecss_declaration(fx_effect_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_BOOLEAN_PROPERTY:
      {
        fx_boolean_property fx_boolean_property = (fx_boolean_property)theEObject;
        T result = casefx_boolean_property(fx_boolean_property);
        if (result == null) result = casecss_fx_declaration(fx_boolean_property);
        if (result == null) result = casecss_declaration(fx_boolean_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_SIZE_PROPERTY:
      {
        fx_size_property fx_size_property = (fx_size_property)theEObject;
        T result = casefx_size_property(fx_size_property);
        if (result == null) result = casecss_fx_declaration(fx_size_property);
        if (result == null) result = casecss_declaration(fx_size_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_NUMBER_PROPERTY:
      {
        fx_number_property fx_number_property = (fx_number_property)theEObject;
        T result = casefx_number_property(fx_number_property);
        if (result == null) result = casecss_fx_declaration(fx_number_property);
        if (result == null) result = casecss_declaration(fx_number_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_INTEGER_PROPERTY:
      {
        fx_integer_property fx_integer_property = (fx_integer_property)theEObject;
        T result = casefx_integer_property(fx_integer_property);
        if (result == null) result = casecss_fx_declaration(fx_integer_property);
        if (result == null) result = casecss_declaration(fx_integer_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_PAINT_PROPERTY:
      {
        fx_paint_property fx_paint_property = (fx_paint_property)theEObject;
        T result = casefx_paint_property(fx_paint_property);
        if (result == null) result = casecss_fx_declaration(fx_paint_property);
        if (result == null) result = casecss_declaration(fx_paint_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_BLEND_PROPERTY:
      {
        fx_blend_property fx_blend_property = (fx_blend_property)theEObject;
        T result = casefx_blend_property(fx_blend_property);
        if (result == null) result = casecss_fx_declaration(fx_blend_property);
        if (result == null) result = casecss_declaration(fx_blend_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_URL_PROPERTY:
      {
        fx_url_property fx_url_property = (fx_url_property)theEObject;
        T result = casefx_url_property(fx_url_property);
        if (result == null) result = casecss_fx_declaration(fx_url_property);
        if (result == null) result = casecss_declaration(fx_url_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_PAINT_PROPERTIES:
      {
        fx_paint_properties fx_paint_properties = (fx_paint_properties)theEObject;
        T result = casefx_paint_properties(fx_paint_properties);
        if (result == null) result = casecss_fx_declaration(fx_paint_properties);
        if (result == null) result = casecss_declaration(fx_paint_properties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_MULTISIZE_PROPERTIES:
      {
        fx_multisize_properties fx_multisize_properties = (fx_multisize_properties)theEObject;
        T result = casefx_multisize_properties(fx_multisize_properties);
        if (result == null) result = casecss_fx_declaration(fx_multisize_properties);
        if (result == null) result = casecss_declaration(fx_multisize_properties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_HPOSITION_PROPERTY:
      {
        fx_hposition_property fx_hposition_property = (fx_hposition_property)theEObject;
        T result = casefx_hposition_property(fx_hposition_property);
        if (result == null) result = casecss_fx_declaration(fx_hposition_property);
        if (result == null) result = casecss_declaration(fx_hposition_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_VPOSITION_PROPERTY:
      {
        fx_vposition_property fx_vposition_property = (fx_vposition_property)theEObject;
        T result = casefx_vposition_property(fx_vposition_property);
        if (result == null) result = casecss_fx_declaration(fx_vposition_property);
        if (result == null) result = casecss_declaration(fx_vposition_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_SIDE_PROPERTY:
      {
        fx_side_property fx_side_property = (fx_side_property)theEObject;
        T result = casefx_side_property(fx_side_property);
        if (result == null) result = casecss_fx_declaration(fx_side_property);
        if (result == null) result = casecss_declaration(fx_side_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_BAR_POLICY_PROPERTY:
      {
        fx_bar_policy_property fx_bar_policy_property = (fx_bar_policy_property)theEObject;
        T result = casefx_bar_policy_property(fx_bar_policy_property);
        if (result == null) result = casecss_fx_declaration(fx_bar_policy_property);
        if (result == null) result = casecss_declaration(fx_bar_policy_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_URL_PROPERTIES:
      {
        fx_url_properties fx_url_properties = (fx_url_properties)theEObject;
        T result = casefx_url_properties(fx_url_properties);
        if (result == null) result = casecss_fx_declaration(fx_url_properties);
        if (result == null) result = casecss_declaration(fx_url_properties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_REPEAT_PROPERTIES:
      {
        fx_repeat_properties fx_repeat_properties = (fx_repeat_properties)theEObject;
        T result = casefx_repeat_properties(fx_repeat_properties);
        if (result == null) result = casecss_fx_declaration(fx_repeat_properties);
        if (result == null) result = casecss_declaration(fx_repeat_properties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_MULTISIZE_PROPERTY:
      {
        fx_multisize_property fx_multisize_property = (fx_multisize_property)theEObject;
        T result = casefx_multisize_property(fx_multisize_property);
        if (result == null) result = casecss_fx_declaration(fx_multisize_property);
        if (result == null) result = casecss_declaration(fx_multisize_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_SIZE_PROPERTIES:
      {
        fx_size_properties fx_size_properties = (fx_size_properties)theEObject;
        T result = casefx_size_properties(fx_size_properties);
        if (result == null) result = casecss_fx_declaration(fx_size_properties);
        if (result == null) result = casecss_declaration(fx_size_properties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_STROKE_LINE_CAP_PROPERTY:
      {
        fx_stroke_line_cap_property fx_stroke_line_cap_property = (fx_stroke_line_cap_property)theEObject;
        T result = casefx_stroke_line_cap_property(fx_stroke_line_cap_property);
        if (result == null) result = casecss_fx_declaration(fx_stroke_line_cap_property);
        if (result == null) result = casecss_declaration(fx_stroke_line_cap_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_STROKE_LINE_JOIN_PROPERTY:
      {
        fx_stroke_line_join_property fx_stroke_line_join_property = (fx_stroke_line_join_property)theEObject;
        T result = casefx_stroke_line_join_property(fx_stroke_line_join_property);
        if (result == null) result = casecss_fx_declaration(fx_stroke_line_join_property);
        if (result == null) result = casecss_declaration(fx_stroke_line_join_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_ALIGNMENT_PROPERTY:
      {
        fx_alignment_property fx_alignment_property = (fx_alignment_property)theEObject;
        T result = casefx_alignment_property(fx_alignment_property);
        if (result == null) result = casecss_fx_declaration(fx_alignment_property);
        if (result == null) result = casecss_declaration(fx_alignment_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_TEXT_ORIGIN_PROPERTY:
      {
        fx_text_origin_property fx_text_origin_property = (fx_text_origin_property)theEObject;
        T result = casefx_text_origin_property(fx_text_origin_property);
        if (result == null) result = casecss_fx_declaration(fx_text_origin_property);
        if (result == null) result = casecss_declaration(fx_text_origin_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_POSITION_PROPERTY:
      {
        fx_position_property fx_position_property = (fx_position_property)theEObject;
        T result = casefx_position_property(fx_position_property);
        if (result == null) result = casecss_fx_declaration(fx_position_property);
        if (result == null) result = casecss_declaration(fx_position_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_BACKGROUND_IMAGE_SIZE_PROPERTY:
      {
        fx_background_image_size_property fx_background_image_size_property = (fx_background_image_size_property)theEObject;
        T result = casefx_background_image_size_property(fx_background_image_size_property);
        if (result == null) result = casecss_fx_declaration(fx_background_image_size_property);
        if (result == null) result = casecss_declaration(fx_background_image_size_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_BORDER_STYLE_PROPERTY:
      {
        fx_border_style_property fx_border_style_property = (fx_border_style_property)theEObject;
        T result = casefx_border_style_property(fx_border_style_property);
        if (result == null) result = casecss_fx_declaration(fx_border_style_property);
        if (result == null) result = casecss_declaration(fx_border_style_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_BORDER_IMAGE_SLICE_PROPERTY:
      {
        fx_border_image_slice_property fx_border_image_slice_property = (fx_border_image_slice_property)theEObject;
        T result = casefx_border_image_slice_property(fx_border_image_slice_property);
        if (result == null) result = casecss_fx_declaration(fx_border_image_slice_property);
        if (result == null) result = casecss_declaration(fx_border_image_slice_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_TEXT_OVERRUN_PROPERTY:
      {
        fx_text_overrun_property fx_text_overrun_property = (fx_text_overrun_property)theEObject;
        T result = casefx_text_overrun_property(fx_text_overrun_property);
        if (result == null) result = casecss_fx_declaration(fx_text_overrun_property);
        if (result == null) result = casecss_declaration(fx_text_overrun_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_INSETS_PROPERTY:
      {
        fx_insets_property fx_insets_property = (fx_insets_property)theEObject;
        T result = casefx_insets_property(fx_insets_property);
        if (result == null) result = casecss_fx_declaration(fx_insets_property);
        if (result == null) result = casecss_declaration(fx_insets_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_NUMBER_PROPERTIES:
      {
        fx_number_properties fx_number_properties = (fx_number_properties)theEObject;
        T result = casefx_number_properties(fx_number_properties);
        if (result == null) result = casecss_fx_declaration(fx_number_properties);
        if (result == null) result = casecss_declaration(fx_number_properties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_MULTI_PAINT_PROPERTIES:
      {
        fx_multi_paint_properties fx_multi_paint_properties = (fx_multi_paint_properties)theEObject;
        T result = casefx_multi_paint_properties(fx_multi_paint_properties);
        if (result == null) result = casecss_fx_declaration(fx_multi_paint_properties);
        if (result == null) result = casecss_declaration(fx_multi_paint_properties);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_STRING_PROPERTY:
      {
        fx_string_property fx_string_property = (fx_string_property)theEObject;
        T result = casefx_string_property(fx_string_property);
        if (result == null) result = casecss_fx_declaration(fx_string_property);
        if (result == null) result = casecss_declaration(fx_string_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.EFFECT:
      {
        Effect effect = (Effect)theEObject;
        T result = caseEffect(effect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.EFFECT_DROP_SHADOW:
      {
        EffectDropShadow effectDropShadow = (EffectDropShadow)theEObject;
        T result = caseEffectDropShadow(effectDropShadow);
        if (result == null) result = caseEffect(effectDropShadow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.EFFECT_INNER_SHADOW:
      {
        EffectInnerShadow effectInnerShadow = (EffectInnerShadow)theEObject;
        T result = caseEffectInnerShadow(effectInnerShadow);
        if (result == null) result = caseEffect(effectInnerShadow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.MULTI_PAINT:
      {
        MultiPaint multiPaint = (MultiPaint)theEObject;
        T result = caseMultiPaint(multiPaint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.PAINT:
      {
        Paint paint = (Paint)theEObject;
        T result = casePaint(paint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.LINEAR_GRADIENT:
      {
        LinearGradient linearGradient = (LinearGradient)theEObject;
        T result = caseLinearGradient(linearGradient);
        if (result == null) result = casePaint(linearGradient);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.RADIAL_GRADIENT:
      {
        RadialGradient radialGradient = (RadialGradient)theEObject;
        T result = caseRadialGradient(radialGradient);
        if (result == null) result = casePaint(radialGradient);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.STOP_VALUE:
      {
        StopValue stopValue = (StopValue)theEObject;
        T result = caseStopValue(stopValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.REPEAT_STYLE:
      {
        RepeatStyle repeatStyle = (RepeatStyle)theEObject;
        T result = caseRepeatStyle(repeatStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.DIM4_SIZE:
      {
        Dim4Size dim4Size = (Dim4Size)theEObject;
        T result = caseDim4Size(dim4Size);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.BG_POSITION:
      {
        BgPosition bgPosition = (BgPosition)theEObject;
        T result = caseBgPosition(bgPosition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FX_COLOR_PROPERTY:
      {
        fx_color_property fx_color_property = (fx_color_property)theEObject;
        T result = casefx_color_property(fx_color_property);
        if (result == null) result = casecss_fx_declaration(fx_color_property);
        if (result == null) result = casecss_declaration(fx_color_property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.BG_SIZE:
      {
        BgSize bgSize = (BgSize)theEObject;
        T result = caseBgSize(bgSize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.BORDER_STYLE:
      {
        BorderStyle borderStyle = (BorderStyle)theEObject;
        T result = caseBorderStyle(borderStyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.SIZE_FILL:
      {
        SizeFill sizeFill = (SizeFill)theEObject;
        T result = caseSizeFill(sizeFill);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.COLOR:
      {
        Color color = (Color)theEObject;
        T result = caseColor(color);
        if (result == null) result = casePaint(color);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.LOOKED_UP_COLOR:
      {
        LookedUpColor lookedUpColor = (LookedUpColor)theEObject;
        T result = caseLookedUpColor(lookedUpColor);
        if (result == null) result = caseColor(lookedUpColor);
        if (result == null) result = casePaint(lookedUpColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.NAMED_COLOR:
      {
        NamedColor namedColor = (NamedColor)theEObject;
        T result = caseNamedColor(namedColor);
        if (result == null) result = caseColor(namedColor);
        if (result == null) result = casePaint(namedColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.RGB_COLOR:
      {
        RGBColor rgbColor = (RGBColor)theEObject;
        T result = caseRGBColor(rgbColor);
        if (result == null) result = caseColor(rgbColor);
        if (result == null) result = casePaint(rgbColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.HSB_COLOR:
      {
        HSBColor hsbColor = (HSBColor)theEObject;
        T result = caseHSBColor(hsbColor);
        if (result == null) result = caseColor(hsbColor);
        if (result == null) result = casePaint(hsbColor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.COLOR_FUNCTION:
      {
        ColorFunction colorFunction = (ColorFunction)theEObject;
        T result = caseColorFunction(colorFunction);
        if (result == null) result = caseColor(colorFunction);
        if (result == null) result = casePaint(colorFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.URL_TYPE:
      {
        URLType urlType = (URLType)theEObject;
        T result = caseURLType(urlType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FONT:
      {
        FONT font = (FONT)theEObject;
        T result = caseFONT(font);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FONTWEIGHT:
      {
        FONTWEIGHT fontweight = (FONTWEIGHT)theEObject;
        T result = caseFONTWEIGHT(fontweight);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FONTSTYLE:
      {
        FONTSTYLE fontstyle = (FONTSTYLE)theEObject;
        T result = caseFONTSTYLE(fontstyle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>stylesheet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>stylesheet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestylesheet(stylesheet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>media</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>media</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemedia(media object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ruleset</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ruleset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseruleset(ruleset object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseselector(selector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>simple selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>simple selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesimple_selector(simple_selector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>css declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>css declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecss_declaration(css_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>css generic declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>css generic declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecss_generic_declaration(css_generic_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>css fx declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>css fx declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecss_fx_declaration(css_fx_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx font property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx font property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_font_property(fx_font_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx font family property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx font family property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_font_family_property(fx_font_family_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx font size property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx font size property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_font_size_property(fx_font_size_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx font style property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx font style property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_font_style_property(fx_font_style_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx font weight property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx font weight property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_font_weight_property(fx_font_weight_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx cursor property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx cursor property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_cursor_property(fx_cursor_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx effect property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx effect property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_effect_property(fx_effect_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx boolean property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx boolean property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_boolean_property(fx_boolean_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx size property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx size property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_size_property(fx_size_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx number property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx number property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_number_property(fx_number_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx integer property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx integer property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_integer_property(fx_integer_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx paint property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx paint property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_paint_property(fx_paint_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx blend property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx blend property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_blend_property(fx_blend_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx url property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx url property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_url_property(fx_url_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx paint properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx paint properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_paint_properties(fx_paint_properties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx multisize properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx multisize properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_multisize_properties(fx_multisize_properties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx hposition property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx hposition property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_hposition_property(fx_hposition_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx vposition property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx vposition property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_vposition_property(fx_vposition_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx side property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx side property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_side_property(fx_side_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx bar policy property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx bar policy property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_bar_policy_property(fx_bar_policy_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx url properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx url properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_url_properties(fx_url_properties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx repeat properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx repeat properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_repeat_properties(fx_repeat_properties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx multisize property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx multisize property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_multisize_property(fx_multisize_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx size properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx size properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_size_properties(fx_size_properties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx stroke line cap property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx stroke line cap property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_stroke_line_cap_property(fx_stroke_line_cap_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx stroke line join property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx stroke line join property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_stroke_line_join_property(fx_stroke_line_join_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx alignment property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx alignment property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_alignment_property(fx_alignment_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx text origin property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx text origin property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_text_origin_property(fx_text_origin_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx position property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx position property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_position_property(fx_position_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx background image size property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx background image size property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_background_image_size_property(fx_background_image_size_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx border style property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx border style property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_border_style_property(fx_border_style_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx border image slice property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx border image slice property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_border_image_slice_property(fx_border_image_slice_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx text overrun property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx text overrun property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_text_overrun_property(fx_text_overrun_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx insets property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx insets property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_insets_property(fx_insets_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx number properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx number properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_number_properties(fx_number_properties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx multi paint properties</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx multi paint properties</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_multi_paint_properties(fx_multi_paint_properties object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx string property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx string property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_string_property(fx_string_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Effect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEffect(Effect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Effect Drop Shadow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Effect Drop Shadow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEffectDropShadow(EffectDropShadow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Effect Inner Shadow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Effect Inner Shadow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEffectInnerShadow(EffectInnerShadow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Paint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Paint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiPaint(MultiPaint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Paint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Paint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePaint(Paint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Linear Gradient</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Linear Gradient</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinearGradient(LinearGradient object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Radial Gradient</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Radial Gradient</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRadialGradient(RadialGradient object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stop Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stop Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStopValue(StopValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repeat Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repeat Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepeatStyle(RepeatStyle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dim4 Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dim4 Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDim4Size(Dim4Size object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bg Position</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bg Position</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBgPosition(BgPosition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>fx color property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>fx color property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefx_color_property(fx_color_property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bg Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bg Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBgSize(BgSize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Border Style</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Border Style</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBorderStyle(BorderStyle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Size Fill</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Size Fill</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSizeFill(SizeFill object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColor(Color object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Looked Up Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Looked Up Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLookedUpColor(LookedUpColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedColor(NamedColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RGB Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RGB Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRGBColor(RGBColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>HSB Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>HSB Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHSBColor(HSBColor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColorFunction(ColorFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>URL Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>URL Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseURLType(URLType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FONT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FONT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFONT(FONT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FONTWEIGHT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FONTWEIGHT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFONTWEIGHT(FONTWEIGHT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FONTSTYLE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FONTSTYLE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFONTSTYLE(FONTSTYLE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CssDslSwitch
