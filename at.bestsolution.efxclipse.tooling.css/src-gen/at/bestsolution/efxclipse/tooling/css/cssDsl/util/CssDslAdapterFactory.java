/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.util;

import at.bestsolution.efxclipse.tooling.css.cssDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage
 * @generated
 */
public class CssDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CssDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CssDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CssDslSwitch<Adapter> modelSwitch =
    new CssDslSwitch<Adapter>()
    {
      @Override
      public Adapter casestylesheet(stylesheet object)
      {
        return createstylesheetAdapter();
      }
      @Override
      public Adapter casemedia(media object)
      {
        return createmediaAdapter();
      }
      @Override
      public Adapter caseruleset(ruleset object)
      {
        return createrulesetAdapter();
      }
      @Override
      public Adapter caseselector(selector object)
      {
        return createselectorAdapter();
      }
      @Override
      public Adapter casesimple_selector(simple_selector object)
      {
        return createsimple_selectorAdapter();
      }
      @Override
      public Adapter caseelement_name(element_name object)
      {
        return createelement_nameAdapter();
      }
      @Override
      public Adapter casecss_class(css_class object)
      {
        return createcss_classAdapter();
      }
      @Override
      public Adapter casecss_id(css_id object)
      {
        return createcss_idAdapter();
      }
      @Override
      public Adapter casecss_declaration(css_declaration object)
      {
        return createcss_declarationAdapter();
      }
      @Override
      public Adapter casecss_generic_declaration(css_generic_declaration object)
      {
        return createcss_generic_declarationAdapter();
      }
      @Override
      public Adapter casecss_fx_declaration(css_fx_declaration object)
      {
        return createcss_fx_declarationAdapter();
      }
      @Override
      public Adapter casefx_font_property(fx_font_property object)
      {
        return createfx_font_propertyAdapter();
      }
      @Override
      public Adapter casefx_font_family_property(fx_font_family_property object)
      {
        return createfx_font_family_propertyAdapter();
      }
      @Override
      public Adapter casefx_font_size_property(fx_font_size_property object)
      {
        return createfx_font_size_propertyAdapter();
      }
      @Override
      public Adapter casefx_font_style_property(fx_font_style_property object)
      {
        return createfx_font_style_propertyAdapter();
      }
      @Override
      public Adapter casefx_font_weight_property(fx_font_weight_property object)
      {
        return createfx_font_weight_propertyAdapter();
      }
      @Override
      public Adapter casefx_cursor_property(fx_cursor_property object)
      {
        return createfx_cursor_propertyAdapter();
      }
      @Override
      public Adapter casefx_effect_property(fx_effect_property object)
      {
        return createfx_effect_propertyAdapter();
      }
      @Override
      public Adapter casefx_boolean_property(fx_boolean_property object)
      {
        return createfx_boolean_propertyAdapter();
      }
      @Override
      public Adapter casefx_size_property(fx_size_property object)
      {
        return createfx_size_propertyAdapter();
      }
      @Override
      public Adapter casefx_number_property(fx_number_property object)
      {
        return createfx_number_propertyAdapter();
      }
      @Override
      public Adapter casefx_integer_property(fx_integer_property object)
      {
        return createfx_integer_propertyAdapter();
      }
      @Override
      public Adapter casefx_paint_property(fx_paint_property object)
      {
        return createfx_paint_propertyAdapter();
      }
      @Override
      public Adapter casefx_blend_property(fx_blend_property object)
      {
        return createfx_blend_propertyAdapter();
      }
      @Override
      public Adapter casefx_url_property(fx_url_property object)
      {
        return createfx_url_propertyAdapter();
      }
      @Override
      public Adapter casefx_paint_properties(fx_paint_properties object)
      {
        return createfx_paint_propertiesAdapter();
      }
      @Override
      public Adapter casefx_multisize_properties(fx_multisize_properties object)
      {
        return createfx_multisize_propertiesAdapter();
      }
      @Override
      public Adapter casefx_hposition_property(fx_hposition_property object)
      {
        return createfx_hposition_propertyAdapter();
      }
      @Override
      public Adapter casefx_vposition_property(fx_vposition_property object)
      {
        return createfx_vposition_propertyAdapter();
      }
      @Override
      public Adapter casefx_side_property(fx_side_property object)
      {
        return createfx_side_propertyAdapter();
      }
      @Override
      public Adapter casefx_bar_policy_property(fx_bar_policy_property object)
      {
        return createfx_bar_policy_propertyAdapter();
      }
      @Override
      public Adapter casefx_url_properties(fx_url_properties object)
      {
        return createfx_url_propertiesAdapter();
      }
      @Override
      public Adapter casefx_repeat_properties(fx_repeat_properties object)
      {
        return createfx_repeat_propertiesAdapter();
      }
      @Override
      public Adapter casefx_multisize_property(fx_multisize_property object)
      {
        return createfx_multisize_propertyAdapter();
      }
      @Override
      public Adapter casefx_size_properties(fx_size_properties object)
      {
        return createfx_size_propertiesAdapter();
      }
      @Override
      public Adapter casefx_stroke_line_cap_property(fx_stroke_line_cap_property object)
      {
        return createfx_stroke_line_cap_propertyAdapter();
      }
      @Override
      public Adapter casefx_stroke_line_join_property(fx_stroke_line_join_property object)
      {
        return createfx_stroke_line_join_propertyAdapter();
      }
      @Override
      public Adapter casefx_alignment_property(fx_alignment_property object)
      {
        return createfx_alignment_propertyAdapter();
      }
      @Override
      public Adapter casefx_text_origin_property(fx_text_origin_property object)
      {
        return createfx_text_origin_propertyAdapter();
      }
      @Override
      public Adapter casefx_position_property(fx_position_property object)
      {
        return createfx_position_propertyAdapter();
      }
      @Override
      public Adapter casefx_background_image_size_property(fx_background_image_size_property object)
      {
        return createfx_background_image_size_propertyAdapter();
      }
      @Override
      public Adapter casefx_border_style_property(fx_border_style_property object)
      {
        return createfx_border_style_propertyAdapter();
      }
      @Override
      public Adapter casefx_border_image_slice_property(fx_border_image_slice_property object)
      {
        return createfx_border_image_slice_propertyAdapter();
      }
      @Override
      public Adapter casefx_text_overrun_property(fx_text_overrun_property object)
      {
        return createfx_text_overrun_propertyAdapter();
      }
      @Override
      public Adapter casefx_insets_property(fx_insets_property object)
      {
        return createfx_insets_propertyAdapter();
      }
      @Override
      public Adapter casefx_number_properties(fx_number_properties object)
      {
        return createfx_number_propertiesAdapter();
      }
      @Override
      public Adapter casefx_multi_paint_properties(fx_multi_paint_properties object)
      {
        return createfx_multi_paint_propertiesAdapter();
      }
      @Override
      public Adapter casefx_string_property(fx_string_property object)
      {
        return createfx_string_propertyAdapter();
      }
      @Override
      public Adapter caseEffect(Effect object)
      {
        return createEffectAdapter();
      }
      @Override
      public Adapter caseEffectDropShadow(EffectDropShadow object)
      {
        return createEffectDropShadowAdapter();
      }
      @Override
      public Adapter caseEffectInnerShadow(EffectInnerShadow object)
      {
        return createEffectInnerShadowAdapter();
      }
      @Override
      public Adapter caseMultiPaint(MultiPaint object)
      {
        return createMultiPaintAdapter();
      }
      @Override
      public Adapter casePaint(Paint object)
      {
        return createPaintAdapter();
      }
      @Override
      public Adapter caseLinearGradient(LinearGradient object)
      {
        return createLinearGradientAdapter();
      }
      @Override
      public Adapter caseRadialGradient(RadialGradient object)
      {
        return createRadialGradientAdapter();
      }
      @Override
      public Adapter caseStopValue(StopValue object)
      {
        return createStopValueAdapter();
      }
      @Override
      public Adapter caseRepeatStyle(RepeatStyle object)
      {
        return createRepeatStyleAdapter();
      }
      @Override
      public Adapter caseDim4Size(Dim4Size object)
      {
        return createDim4SizeAdapter();
      }
      @Override
      public Adapter caseBgPosition(BgPosition object)
      {
        return createBgPositionAdapter();
      }
      @Override
      public Adapter casefx_color_property(fx_color_property object)
      {
        return createfx_color_propertyAdapter();
      }
      @Override
      public Adapter caseBgSize(BgSize object)
      {
        return createBgSizeAdapter();
      }
      @Override
      public Adapter caseBorderStyle(BorderStyle object)
      {
        return createBorderStyleAdapter();
      }
      @Override
      public Adapter caseSizeFill(SizeFill object)
      {
        return createSizeFillAdapter();
      }
      @Override
      public Adapter caseColor(Color object)
      {
        return createColorAdapter();
      }
      @Override
      public Adapter caseLookedUpColor(LookedUpColor object)
      {
        return createLookedUpColorAdapter();
      }
      @Override
      public Adapter caseNamedColor(NamedColor object)
      {
        return createNamedColorAdapter();
      }
      @Override
      public Adapter caseRGBColor(RGBColor object)
      {
        return createRGBColorAdapter();
      }
      @Override
      public Adapter caseHSBColor(HSBColor object)
      {
        return createHSBColorAdapter();
      }
      @Override
      public Adapter caseColorFunction(ColorFunction object)
      {
        return createColorFunctionAdapter();
      }
      @Override
      public Adapter caseHexColor(HexColor object)
      {
        return createHexColorAdapter();
      }
      @Override
      public Adapter caseFONT(FONT object)
      {
        return createFONTAdapter();
      }
      @Override
      public Adapter caseFONTWEIGHT(FONTWEIGHT object)
      {
        return createFONTWEIGHTAdapter();
      }
      @Override
      public Adapter caseFONTSTYLE(FONTSTYLE object)
      {
        return createFONTSTYLEAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet <em>stylesheet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet
   * @generated
   */
  public Adapter createstylesheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.media <em>media</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.media
   * @generated
   */
  public Adapter createmediaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset <em>ruleset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset
   * @generated
   */
  public Adapter createrulesetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.selector <em>selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.selector
   * @generated
   */
  public Adapter createselectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector <em>simple selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector
   * @generated
   */
  public Adapter createsimple_selectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.element_name <em>element name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.element_name
   * @generated
   */
  public Adapter createelement_nameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_class <em>css class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.css_class
   * @generated
   */
  public Adapter createcss_classAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_id <em>css id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.css_id
   * @generated
   */
  public Adapter createcss_idAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration <em>css declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration
   * @generated
   */
  public Adapter createcss_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration <em>css generic declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration
   * @generated
   */
  public Adapter createcss_generic_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_fx_declaration <em>css fx declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.css_fx_declaration
   * @generated
   */
  public Adapter createcss_fx_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_property <em>fx font property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_property
   * @generated
   */
  public Adapter createfx_font_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_family_property <em>fx font family property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_family_property
   * @generated
   */
  public Adapter createfx_font_family_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_size_property <em>fx font size property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_size_property
   * @generated
   */
  public Adapter createfx_font_size_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_style_property <em>fx font style property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_style_property
   * @generated
   */
  public Adapter createfx_font_style_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_weight_property <em>fx font weight property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_weight_property
   * @generated
   */
  public Adapter createfx_font_weight_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_cursor_property <em>fx cursor property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_cursor_property
   * @generated
   */
  public Adapter createfx_cursor_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_effect_property <em>fx effect property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_effect_property
   * @generated
   */
  public Adapter createfx_effect_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_boolean_property <em>fx boolean property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_boolean_property
   * @generated
   */
  public Adapter createfx_boolean_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_property <em>fx size property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_property
   * @generated
   */
  public Adapter createfx_size_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_property <em>fx number property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_property
   * @generated
   */
  public Adapter createfx_number_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_integer_property <em>fx integer property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_integer_property
   * @generated
   */
  public Adapter createfx_integer_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_property <em>fx paint property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_property
   * @generated
   */
  public Adapter createfx_paint_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_blend_property <em>fx blend property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_blend_property
   * @generated
   */
  public Adapter createfx_blend_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_property <em>fx url property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_property
   * @generated
   */
  public Adapter createfx_url_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_properties <em>fx paint properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_properties
   * @generated
   */
  public Adapter createfx_paint_propertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_properties <em>fx multisize properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_properties
   * @generated
   */
  public Adapter createfx_multisize_propertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_hposition_property <em>fx hposition property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_hposition_property
   * @generated
   */
  public Adapter createfx_hposition_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_vposition_property <em>fx vposition property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_vposition_property
   * @generated
   */
  public Adapter createfx_vposition_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_side_property <em>fx side property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_side_property
   * @generated
   */
  public Adapter createfx_side_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_bar_policy_property <em>fx bar policy property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_bar_policy_property
   * @generated
   */
  public Adapter createfx_bar_policy_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_properties <em>fx url properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_properties
   * @generated
   */
  public Adapter createfx_url_propertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_repeat_properties <em>fx repeat properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_repeat_properties
   * @generated
   */
  public Adapter createfx_repeat_propertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_property <em>fx multisize property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_property
   * @generated
   */
  public Adapter createfx_multisize_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_properties <em>fx size properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_properties
   * @generated
   */
  public Adapter createfx_size_propertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_cap_property <em>fx stroke line cap property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_cap_property
   * @generated
   */
  public Adapter createfx_stroke_line_cap_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_join_property <em>fx stroke line join property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_join_property
   * @generated
   */
  public Adapter createfx_stroke_line_join_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_alignment_property <em>fx alignment property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_alignment_property
   * @generated
   */
  public Adapter createfx_alignment_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_origin_property <em>fx text origin property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_origin_property
   * @generated
   */
  public Adapter createfx_text_origin_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_position_property <em>fx position property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_position_property
   * @generated
   */
  public Adapter createfx_position_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_background_image_size_property <em>fx background image size property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_background_image_size_property
   * @generated
   */
  public Adapter createfx_background_image_size_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_style_property <em>fx border style property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_style_property
   * @generated
   */
  public Adapter createfx_border_style_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_image_slice_property <em>fx border image slice property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_image_slice_property
   * @generated
   */
  public Adapter createfx_border_image_slice_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_overrun_property <em>fx text overrun property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_overrun_property
   * @generated
   */
  public Adapter createfx_text_overrun_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_insets_property <em>fx insets property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_insets_property
   * @generated
   */
  public Adapter createfx_insets_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_properties <em>fx number properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_properties
   * @generated
   */
  public Adapter createfx_number_propertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multi_paint_properties <em>fx multi paint properties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multi_paint_properties
   * @generated
   */
  public Adapter createfx_multi_paint_propertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_string_property <em>fx string property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_string_property
   * @generated
   */
  public Adapter createfx_string_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.Effect
   * @generated
   */
  public Adapter createEffectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.EffectDropShadow <em>Effect Drop Shadow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.EffectDropShadow
   * @generated
   */
  public Adapter createEffectDropShadowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.EffectInnerShadow <em>Effect Inner Shadow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.EffectInnerShadow
   * @generated
   */
  public Adapter createEffectInnerShadowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.MultiPaint <em>Multi Paint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.MultiPaint
   * @generated
   */
  public Adapter createMultiPaintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Paint <em>Paint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.Paint
   * @generated
   */
  public Adapter createPaintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient <em>Linear Gradient</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient
   * @generated
   */
  public Adapter createLinearGradientAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient <em>Radial Gradient</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient
   * @generated
   */
  public Adapter createRadialGradientAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.StopValue <em>Stop Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.StopValue
   * @generated
   */
  public Adapter createStopValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RepeatStyle <em>Repeat Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RepeatStyle
   * @generated
   */
  public Adapter createRepeatStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Dim4Size <em>Dim4 Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.Dim4Size
   * @generated
   */
  public Adapter createDim4SizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.BgPosition <em>Bg Position</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.BgPosition
   * @generated
   */
  public Adapter createBgPositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_color_property <em>fx color property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_color_property
   * @generated
   */
  public Adapter createfx_color_propertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.BgSize <em>Bg Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.BgSize
   * @generated
   */
  public Adapter createBgSizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.BorderStyle <em>Border Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.BorderStyle
   * @generated
   */
  public Adapter createBorderStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.SizeFill <em>Size Fill</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.SizeFill
   * @generated
   */
  public Adapter createSizeFillAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.Color
   * @generated
   */
  public Adapter createColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.LookedUpColor <em>Looked Up Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.LookedUpColor
   * @generated
   */
  public Adapter createLookedUpColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.NamedColor <em>Named Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.NamedColor
   * @generated
   */
  public Adapter createNamedColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor <em>RGB Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor
   * @generated
   */
  public Adapter createRGBColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.HSBColor <em>HSB Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.HSBColor
   * @generated
   */
  public Adapter createHSBColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction <em>Color Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction
   * @generated
   */
  public Adapter createColorFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.HexColor <em>Hex Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.HexColor
   * @generated
   */
  public Adapter createHexColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.FONT <em>FONT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.FONT
   * @generated
   */
  public Adapter createFONTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.FONTWEIGHT <em>FONTWEIGHT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.FONTWEIGHT
   * @generated
   */
  public Adapter createFONTWEIGHTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.FONTSTYLE <em>FONTSTYLE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.FONTSTYLE
   * @generated
   */
  public Adapter createFONTSTYLEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CssDslAdapterFactory
