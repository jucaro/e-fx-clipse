/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.BgPosition;
import at.bestsolution.efxclipse.tooling.css.cssDsl.BgSize;
import at.bestsolution.efxclipse.tooling.css.cssDsl.BorderStyle;
import at.bestsolution.efxclipse.tooling.css.cssDsl.Color;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslFactory;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.Dim4Size;
import at.bestsolution.efxclipse.tooling.css.cssDsl.Effect;
import at.bestsolution.efxclipse.tooling.css.cssDsl.EffectDropShadow;
import at.bestsolution.efxclipse.tooling.css.cssDsl.EffectInnerShadow;
import at.bestsolution.efxclipse.tooling.css.cssDsl.HPosition;
import at.bestsolution.efxclipse.tooling.css.cssDsl.HSBColor;
import at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient;
import at.bestsolution.efxclipse.tooling.css.cssDsl.LookedUpColor;
import at.bestsolution.efxclipse.tooling.css.cssDsl.MultiPaint;
import at.bestsolution.efxclipse.tooling.css.cssDsl.NamedColor;
import at.bestsolution.efxclipse.tooling.css.cssDsl.Paint;
import at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor;
import at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient;
import at.bestsolution.efxclipse.tooling.css.cssDsl.RepeatStyle;
import at.bestsolution.efxclipse.tooling.css.cssDsl.SizeFill;
import at.bestsolution.efxclipse.tooling.css.cssDsl.StopValue;
import at.bestsolution.efxclipse.tooling.css.cssDsl.URLType;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_fx_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_alignment_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_background_image_size_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_bar_policy_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_blend_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_boolean_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_image_slice_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_style_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_color_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_cursor_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_effect_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_family_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_size_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_style_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_weight_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_hposition_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_insets_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_integer_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multi_paint_properties;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_properties;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_properties;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_properties;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_position_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_repeat_properties;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_side_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_properties;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_string_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_cap_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_join_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_origin_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_overrun_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_properties;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_vposition_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.media;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset;
import at.bestsolution.efxclipse.tooling.css.cssDsl.selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CssDslPackageImpl extends EPackageImpl implements CssDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stylesheetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mediaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rulesetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simple_selectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass css_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass css_generic_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass css_fx_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_font_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_font_family_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_font_size_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_font_style_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_font_weight_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_cursor_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_effect_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_boolean_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_size_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_number_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_integer_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_paint_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_blend_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_url_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_paint_propertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_multisize_propertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_hposition_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_vposition_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_side_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_bar_policy_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_url_propertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_repeat_propertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_multisize_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_size_propertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_stroke_line_cap_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_stroke_line_join_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_alignment_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_text_origin_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_position_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_background_image_size_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_border_style_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_border_image_slice_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_text_overrun_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_insets_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_number_propertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_multi_paint_propertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_string_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass effectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass effectDropShadowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass effectInnerShadowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiPaintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linearGradientEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass radialGradientEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stopValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repeatStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dim4SizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bgPositionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fx_color_propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bgSizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass borderStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sizeFillEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lookedUpColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rgbColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hsbColorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass urlTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontweightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontstyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum hPositionEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CssDslPackageImpl()
  {
    super(eNS_URI, CssDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link CssDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CssDslPackage init()
  {
    if (isInited) return (CssDslPackage)EPackage.Registry.INSTANCE.getEPackage(CssDslPackage.eNS_URI);

    // Obtain or create and register package
    CssDslPackageImpl theCssDslPackage = (CssDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CssDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CssDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCssDslPackage.createPackageContents();

    // Initialize created meta-data
    theCssDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCssDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CssDslPackage.eNS_URI, theCssDslPackage);
    return theCssDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getstylesheet()
  {
    return stylesheetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstylesheet_Ruleset()
  {
    return (EReference)stylesheetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getstylesheet_Media()
  {
    return (EReference)stylesheetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmedia()
  {
    return mediaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getmedia_Medialist()
  {
    return (EAttribute)mediaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmedia_Rulesets()
  {
    return (EReference)mediaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getruleset()
  {
    return rulesetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleset_Selectors()
  {
    return (EReference)rulesetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleset_Declarations()
  {
    return (EReference)rulesetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getselector()
  {
    return selectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getselector_Simpleselectors()
  {
    return (EReference)selectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getselector_Selector()
  {
    return (EReference)selectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsimple_selector()
  {
    return simple_selectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsimple_selector_Element()
  {
    return (EAttribute)simple_selectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsimple_selector_Id()
  {
    return (EAttribute)simple_selectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsimple_selector_Class()
  {
    return (EAttribute)simple_selectorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsimple_selector_Pseudoclasses()
  {
    return (EAttribute)simple_selectorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcss_declaration()
  {
    return css_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcss_generic_declaration()
  {
    return css_generic_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcss_generic_declaration_Property()
  {
    return (EAttribute)css_generic_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getcss_generic_declaration_Expression()
  {
    return (EAttribute)css_generic_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcss_fx_declaration()
  {
    return css_fx_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_font_property()
  {
    return fx_font_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_font_property_Property()
  {
    return (EAttribute)fx_font_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfx_font_property_Value()
  {
    return (EReference)fx_font_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_font_family_property()
  {
    return fx_font_family_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_font_family_property_Property()
  {
    return (EAttribute)fx_font_family_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_font_family_property_Value()
  {
    return (EAttribute)fx_font_family_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_font_size_property()
  {
    return fx_font_size_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_font_size_property_Property()
  {
    return (EAttribute)fx_font_size_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_font_size_property_Value()
  {
    return (EAttribute)fx_font_size_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_font_style_property()
  {
    return fx_font_style_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_font_style_property_Property()
  {
    return (EAttribute)fx_font_style_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfx_font_style_property_Value()
  {
    return (EReference)fx_font_style_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_font_weight_property()
  {
    return fx_font_weight_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_font_weight_property_Property()
  {
    return (EAttribute)fx_font_weight_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfx_font_weight_property_Value()
  {
    return (EReference)fx_font_weight_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_cursor_property()
  {
    return fx_cursor_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_cursor_property_Property()
  {
    return (EAttribute)fx_cursor_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_cursor_property_Value()
  {
    return (EAttribute)fx_cursor_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_effect_property()
  {
    return fx_effect_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfx_effect_property_Value()
  {
    return (EReference)fx_effect_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_boolean_property()
  {
    return fx_boolean_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_boolean_property_Property()
  {
    return (EAttribute)fx_boolean_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_boolean_property_Value()
  {
    return (EAttribute)fx_boolean_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_size_property()
  {
    return fx_size_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_size_property_Property()
  {
    return (EAttribute)fx_size_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_size_property_Value()
  {
    return (EAttribute)fx_size_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_number_property()
  {
    return fx_number_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_number_property_Property()
  {
    return (EAttribute)fx_number_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_number_property_Value()
  {
    return (EAttribute)fx_number_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_integer_property()
  {
    return fx_integer_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_integer_property_Property()
  {
    return (EAttribute)fx_integer_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_integer_property_Value()
  {
    return (EAttribute)fx_integer_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_paint_property()
  {
    return fx_paint_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_paint_property_Property()
  {
    return (EAttribute)fx_paint_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfx_paint_property_Value()
  {
    return (EReference)fx_paint_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_blend_property()
  {
    return fx_blend_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_blend_property_Property()
  {
    return (EAttribute)fx_blend_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_blend_property_Value()
  {
    return (EAttribute)fx_blend_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_url_property()
  {
    return fx_url_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_url_property_Property()
  {
    return (EAttribute)fx_url_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfx_url_property_Value()
  {
    return (EReference)fx_url_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_paint_properties()
  {
    return fx_paint_propertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_paint_properties_Property()
  {
    return (EAttribute)fx_paint_propertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfx_paint_properties_Values()
  {
    return (EReference)fx_paint_propertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_multisize_properties()
  {
    return fx_multisize_propertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_multisize_properties_Property()
  {
    return (EAttribute)fx_multisize_propertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfx_multisize_properties_Values()
  {
    return (EReference)fx_multisize_propertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_hposition_property()
  {
    return fx_hposition_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_hposition_property_Property()
  {
    return (EAttribute)fx_hposition_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_hposition_property_Value()
  {
    return (EAttribute)fx_hposition_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_vposition_property()
  {
    return fx_vposition_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_vposition_property_Property()
  {
    return (EAttribute)fx_vposition_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_vposition_property_Value()
  {
    return (EAttribute)fx_vposition_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_side_property()
  {
    return fx_side_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_side_property_Property()
  {
    return (EAttribute)fx_side_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_side_property_Value()
  {
    return (EAttribute)fx_side_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_bar_policy_property()
  {
    return fx_bar_policy_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_bar_policy_property_Property()
  {
    return (EAttribute)fx_bar_policy_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_bar_policy_property_Value()
  {
    return (EAttribute)fx_bar_policy_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_url_properties()
  {
    return fx_url_propertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_url_properties_Property()
  {
    return (EAttribute)fx_url_propertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfx_url_properties_Values()
  {
    return (EReference)fx_url_propertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_repeat_properties()
  {
    return fx_repeat_propertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_repeat_properties_Property()
  {
    return (EAttribute)fx_repeat_propertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfx_repeat_properties_Values()
  {
    return (EReference)fx_repeat_propertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_multisize_property()
  {
    return fx_multisize_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_multisize_property_Property()
  {
    return (EAttribute)fx_multisize_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfx_multisize_property_Value()
  {
    return (EReference)fx_multisize_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_size_properties()
  {
    return fx_size_propertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_size_properties_Property()
  {
    return (EAttribute)fx_size_propertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_size_properties_Values()
  {
    return (EAttribute)fx_size_propertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_stroke_line_cap_property()
  {
    return fx_stroke_line_cap_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_stroke_line_cap_property_Property()
  {
    return (EAttribute)fx_stroke_line_cap_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_stroke_line_cap_property_Value()
  {
    return (EAttribute)fx_stroke_line_cap_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_stroke_line_join_property()
  {
    return fx_stroke_line_join_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_stroke_line_join_property_Property()
  {
    return (EAttribute)fx_stroke_line_join_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_stroke_line_join_property_Value()
  {
    return (EAttribute)fx_stroke_line_join_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_alignment_property()
  {
    return fx_alignment_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_alignment_property_Property()
  {
    return (EAttribute)fx_alignment_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_alignment_property_Value()
  {
    return (EAttribute)fx_alignment_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_text_origin_property()
  {
    return fx_text_origin_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_text_origin_property_Property()
  {
    return (EAttribute)fx_text_origin_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_text_origin_property_Value()
  {
    return (EAttribute)fx_text_origin_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_position_property()
  {
    return fx_position_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_position_property_Property()
  {
    return (EAttribute)fx_position_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfx_position_property_Values()
  {
    return (EReference)fx_position_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_background_image_size_property()
  {
    return fx_background_image_size_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_background_image_size_property_Property()
  {
    return (EAttribute)fx_background_image_size_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfx_background_image_size_property_Values()
  {
    return (EReference)fx_background_image_size_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_border_style_property()
  {
    return fx_border_style_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_border_style_property_Property()
  {
    return (EAttribute)fx_border_style_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfx_border_style_property_Values()
  {
    return (EReference)fx_border_style_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_border_image_slice_property()
  {
    return fx_border_image_slice_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_border_image_slice_property_Property()
  {
    return (EAttribute)fx_border_image_slice_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfx_border_image_slice_property_Values()
  {
    return (EReference)fx_border_image_slice_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_text_overrun_property()
  {
    return fx_text_overrun_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_text_overrun_property_Property()
  {
    return (EAttribute)fx_text_overrun_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_text_overrun_property_Value()
  {
    return (EAttribute)fx_text_overrun_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_insets_property()
  {
    return fx_insets_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_insets_property_Property()
  {
    return (EAttribute)fx_insets_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_insets_property_Value()
  {
    return (EAttribute)fx_insets_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_number_properties()
  {
    return fx_number_propertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_number_properties_Property()
  {
    return (EAttribute)fx_number_propertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_number_properties_Value()
  {
    return (EAttribute)fx_number_propertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_multi_paint_properties()
  {
    return fx_multi_paint_propertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_multi_paint_properties_Property()
  {
    return (EAttribute)fx_multi_paint_propertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfx_multi_paint_properties_Values()
  {
    return (EReference)fx_multi_paint_propertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_string_property()
  {
    return fx_string_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_string_property_Property()
  {
    return (EAttribute)fx_string_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_string_property_Value()
  {
    return (EAttribute)fx_string_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEffect()
  {
    return effectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEffect_Blur()
  {
    return (EAttribute)effectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEffect_Color()
  {
    return (EReference)effectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEffect_BlurRadius()
  {
    return (EAttribute)effectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEffect_OffsetX()
  {
    return (EAttribute)effectEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEffect_OffsetY()
  {
    return (EAttribute)effectEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEffectDropShadow()
  {
    return effectDropShadowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEffectDropShadow_Spread()
  {
    return (EAttribute)effectDropShadowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEffectInnerShadow()
  {
    return effectInnerShadowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEffectInnerShadow_Choke()
  {
    return (EAttribute)effectInnerShadowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiPaint()
  {
    return multiPaintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiPaint_Values()
  {
    return (EReference)multiPaintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPaint()
  {
    return paintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinearGradient()
  {
    return linearGradientEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinearGradient_X1()
  {
    return (EAttribute)linearGradientEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinearGradient_Y1()
  {
    return (EAttribute)linearGradientEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinearGradient_X2()
  {
    return (EAttribute)linearGradientEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinearGradient_Y2()
  {
    return (EAttribute)linearGradientEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinearGradient_Stops()
  {
    return (EReference)linearGradientEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRadialGradient()
  {
    return radialGradientEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRadialGradient_Cx()
  {
    return (EAttribute)radialGradientEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRadialGradient_Cy()
  {
    return (EAttribute)radialGradientEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRadialGradient_Radius()
  {
    return (EAttribute)radialGradientEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRadialGradient_Fx()
  {
    return (EAttribute)radialGradientEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRadialGradient_Fy()
  {
    return (EAttribute)radialGradientEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRadialGradient_Stops()
  {
    return (EReference)radialGradientEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStopValue()
  {
    return stopValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStopValue_Pos()
  {
    return (EAttribute)stopValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStopValue_Color()
  {
    return (EReference)stopValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRepeatStyle()
  {
    return repeatStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepeatStyle_V()
  {
    return (EAttribute)repeatStyleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRepeatStyle_V2()
  {
    return (EAttribute)repeatStyleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDim4Size()
  {
    return dim4SizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDim4Size_Values()
  {
    return (EAttribute)dim4SizeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBgPosition()
  {
    return bgPositionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBgPosition_Absx()
  {
    return (EAttribute)bgPositionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBgPosition_Relx()
  {
    return (EAttribute)bgPositionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBgPosition_Absy()
  {
    return (EAttribute)bgPositionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBgPosition_Rely()
  {
    return (EAttribute)bgPositionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfx_color_property()
  {
    return fx_color_propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfx_color_property_Property()
  {
    return (EAttribute)fx_color_propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfx_color_property_Value()
  {
    return (EReference)fx_color_propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBgSize()
  {
    return bgSizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBgSize_Xsize()
  {
    return (EAttribute)bgSizeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBgSize_Ysize()
  {
    return (EAttribute)bgSizeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBgSize_Predefined()
  {
    return (EAttribute)bgSizeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBorderStyle()
  {
    return borderStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBorderStyle_DashStyle()
  {
    return (EAttribute)borderStyleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBorderStyle_Location()
  {
    return (EAttribute)borderStyleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBorderStyle_MiterAbs()
  {
    return (EAttribute)borderStyleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBorderStyle_MiterPredefined()
  {
    return (EAttribute)borderStyleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBorderStyle_LineCap()
  {
    return (EAttribute)borderStyleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSizeFill()
  {
    return sizeFillEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSizeFill_Value()
  {
    return (EReference)sizeFillEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSizeFill_Fill()
  {
    return (EAttribute)sizeFillEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColor()
  {
    return colorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLookedUpColor()
  {
    return lookedUpColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLookedUpColor_Value()
  {
    return (EAttribute)lookedUpColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedColor()
  {
    return namedColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedColor_Value()
  {
    return (EAttribute)namedColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRGBColor()
  {
    return rgbColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGBColor_Hexcolor()
  {
    return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGBColor_R()
  {
    return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGBColor_G()
  {
    return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGBColor_B()
  {
    return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGBColor_Rp()
  {
    return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGBColor_Gp()
  {
    return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGBColor_Bp()
  {
    return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRGBColor_Alpha()
  {
    return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHSBColor()
  {
    return hsbColorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHSBColor_Hue()
  {
    return (EAttribute)hsbColorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHSBColor_Saturation()
  {
    return (EAttribute)hsbColorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHSBColor_Brightness()
  {
    return (EAttribute)hsbColorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHSBColor_Alpha()
  {
    return (EAttribute)hsbColorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColorFunction()
  {
    return colorFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorFunction_Orig()
  {
    return (EReference)colorFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorFunction_Mod()
  {
    return (EAttribute)colorFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColorFunction_StopNumbers()
  {
    return (EAttribute)colorFunctionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getColorFunction_StopColors()
  {
    return (EReference)colorFunctionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getURLType()
  {
    return urlTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getURLType_Url()
  {
    return (EAttribute)urlTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFONT()
  {
    return fontEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFONT_StyleOrWeightString()
  {
    return (EAttribute)fontEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFONT_Weight()
  {
    return (EAttribute)fontEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFONT_Size()
  {
    return (EAttribute)fontEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFONT_Family()
  {
    return (EAttribute)fontEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFONTWEIGHT()
  {
    return fontweightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFONTWEIGHT_ValueString()
  {
    return (EAttribute)fontweightEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFONTWEIGHT_ValueInt()
  {
    return (EAttribute)fontweightEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFONTSTYLE()
  {
    return fontstyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFONTSTYLE_Value()
  {
    return (EAttribute)fontstyleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getHPosition()
  {
    return hPositionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssDslFactory getCssDslFactory()
  {
    return (CssDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    stylesheetEClass = createEClass(STYLESHEET);
    createEReference(stylesheetEClass, STYLESHEET__RULESET);
    createEReference(stylesheetEClass, STYLESHEET__MEDIA);

    mediaEClass = createEClass(MEDIA);
    createEAttribute(mediaEClass, MEDIA__MEDIALIST);
    createEReference(mediaEClass, MEDIA__RULESETS);

    rulesetEClass = createEClass(RULESET);
    createEReference(rulesetEClass, RULESET__SELECTORS);
    createEReference(rulesetEClass, RULESET__DECLARATIONS);

    selectorEClass = createEClass(SELECTOR);
    createEReference(selectorEClass, SELECTOR__SIMPLESELECTORS);
    createEReference(selectorEClass, SELECTOR__SELECTOR);

    simple_selectorEClass = createEClass(SIMPLE_SELECTOR);
    createEAttribute(simple_selectorEClass, SIMPLE_SELECTOR__ELEMENT);
    createEAttribute(simple_selectorEClass, SIMPLE_SELECTOR__ID);
    createEAttribute(simple_selectorEClass, SIMPLE_SELECTOR__CLASS);
    createEAttribute(simple_selectorEClass, SIMPLE_SELECTOR__PSEUDOCLASSES);

    css_declarationEClass = createEClass(CSS_DECLARATION);

    css_generic_declarationEClass = createEClass(CSS_GENERIC_DECLARATION);
    createEAttribute(css_generic_declarationEClass, CSS_GENERIC_DECLARATION__PROPERTY);
    createEAttribute(css_generic_declarationEClass, CSS_GENERIC_DECLARATION__EXPRESSION);

    css_fx_declarationEClass = createEClass(CSS_FX_DECLARATION);

    fx_font_propertyEClass = createEClass(FX_FONT_PROPERTY);
    createEAttribute(fx_font_propertyEClass, FX_FONT_PROPERTY__PROPERTY);
    createEReference(fx_font_propertyEClass, FX_FONT_PROPERTY__VALUE);

    fx_font_family_propertyEClass = createEClass(FX_FONT_FAMILY_PROPERTY);
    createEAttribute(fx_font_family_propertyEClass, FX_FONT_FAMILY_PROPERTY__PROPERTY);
    createEAttribute(fx_font_family_propertyEClass, FX_FONT_FAMILY_PROPERTY__VALUE);

    fx_font_size_propertyEClass = createEClass(FX_FONT_SIZE_PROPERTY);
    createEAttribute(fx_font_size_propertyEClass, FX_FONT_SIZE_PROPERTY__PROPERTY);
    createEAttribute(fx_font_size_propertyEClass, FX_FONT_SIZE_PROPERTY__VALUE);

    fx_font_style_propertyEClass = createEClass(FX_FONT_STYLE_PROPERTY);
    createEAttribute(fx_font_style_propertyEClass, FX_FONT_STYLE_PROPERTY__PROPERTY);
    createEReference(fx_font_style_propertyEClass, FX_FONT_STYLE_PROPERTY__VALUE);

    fx_font_weight_propertyEClass = createEClass(FX_FONT_WEIGHT_PROPERTY);
    createEAttribute(fx_font_weight_propertyEClass, FX_FONT_WEIGHT_PROPERTY__PROPERTY);
    createEReference(fx_font_weight_propertyEClass, FX_FONT_WEIGHT_PROPERTY__VALUE);

    fx_cursor_propertyEClass = createEClass(FX_CURSOR_PROPERTY);
    createEAttribute(fx_cursor_propertyEClass, FX_CURSOR_PROPERTY__PROPERTY);
    createEAttribute(fx_cursor_propertyEClass, FX_CURSOR_PROPERTY__VALUE);

    fx_effect_propertyEClass = createEClass(FX_EFFECT_PROPERTY);
    createEReference(fx_effect_propertyEClass, FX_EFFECT_PROPERTY__VALUE);

    fx_boolean_propertyEClass = createEClass(FX_BOOLEAN_PROPERTY);
    createEAttribute(fx_boolean_propertyEClass, FX_BOOLEAN_PROPERTY__PROPERTY);
    createEAttribute(fx_boolean_propertyEClass, FX_BOOLEAN_PROPERTY__VALUE);

    fx_size_propertyEClass = createEClass(FX_SIZE_PROPERTY);
    createEAttribute(fx_size_propertyEClass, FX_SIZE_PROPERTY__PROPERTY);
    createEAttribute(fx_size_propertyEClass, FX_SIZE_PROPERTY__VALUE);

    fx_number_propertyEClass = createEClass(FX_NUMBER_PROPERTY);
    createEAttribute(fx_number_propertyEClass, FX_NUMBER_PROPERTY__PROPERTY);
    createEAttribute(fx_number_propertyEClass, FX_NUMBER_PROPERTY__VALUE);

    fx_integer_propertyEClass = createEClass(FX_INTEGER_PROPERTY);
    createEAttribute(fx_integer_propertyEClass, FX_INTEGER_PROPERTY__PROPERTY);
    createEAttribute(fx_integer_propertyEClass, FX_INTEGER_PROPERTY__VALUE);

    fx_paint_propertyEClass = createEClass(FX_PAINT_PROPERTY);
    createEAttribute(fx_paint_propertyEClass, FX_PAINT_PROPERTY__PROPERTY);
    createEReference(fx_paint_propertyEClass, FX_PAINT_PROPERTY__VALUE);

    fx_blend_propertyEClass = createEClass(FX_BLEND_PROPERTY);
    createEAttribute(fx_blend_propertyEClass, FX_BLEND_PROPERTY__PROPERTY);
    createEAttribute(fx_blend_propertyEClass, FX_BLEND_PROPERTY__VALUE);

    fx_url_propertyEClass = createEClass(FX_URL_PROPERTY);
    createEAttribute(fx_url_propertyEClass, FX_URL_PROPERTY__PROPERTY);
    createEReference(fx_url_propertyEClass, FX_URL_PROPERTY__VALUE);

    fx_paint_propertiesEClass = createEClass(FX_PAINT_PROPERTIES);
    createEAttribute(fx_paint_propertiesEClass, FX_PAINT_PROPERTIES__PROPERTY);
    createEReference(fx_paint_propertiesEClass, FX_PAINT_PROPERTIES__VALUES);

    fx_multisize_propertiesEClass = createEClass(FX_MULTISIZE_PROPERTIES);
    createEAttribute(fx_multisize_propertiesEClass, FX_MULTISIZE_PROPERTIES__PROPERTY);
    createEReference(fx_multisize_propertiesEClass, FX_MULTISIZE_PROPERTIES__VALUES);

    fx_hposition_propertyEClass = createEClass(FX_HPOSITION_PROPERTY);
    createEAttribute(fx_hposition_propertyEClass, FX_HPOSITION_PROPERTY__PROPERTY);
    createEAttribute(fx_hposition_propertyEClass, FX_HPOSITION_PROPERTY__VALUE);

    fx_vposition_propertyEClass = createEClass(FX_VPOSITION_PROPERTY);
    createEAttribute(fx_vposition_propertyEClass, FX_VPOSITION_PROPERTY__PROPERTY);
    createEAttribute(fx_vposition_propertyEClass, FX_VPOSITION_PROPERTY__VALUE);

    fx_side_propertyEClass = createEClass(FX_SIDE_PROPERTY);
    createEAttribute(fx_side_propertyEClass, FX_SIDE_PROPERTY__PROPERTY);
    createEAttribute(fx_side_propertyEClass, FX_SIDE_PROPERTY__VALUE);

    fx_bar_policy_propertyEClass = createEClass(FX_BAR_POLICY_PROPERTY);
    createEAttribute(fx_bar_policy_propertyEClass, FX_BAR_POLICY_PROPERTY__PROPERTY);
    createEAttribute(fx_bar_policy_propertyEClass, FX_BAR_POLICY_PROPERTY__VALUE);

    fx_url_propertiesEClass = createEClass(FX_URL_PROPERTIES);
    createEAttribute(fx_url_propertiesEClass, FX_URL_PROPERTIES__PROPERTY);
    createEReference(fx_url_propertiesEClass, FX_URL_PROPERTIES__VALUES);

    fx_repeat_propertiesEClass = createEClass(FX_REPEAT_PROPERTIES);
    createEAttribute(fx_repeat_propertiesEClass, FX_REPEAT_PROPERTIES__PROPERTY);
    createEReference(fx_repeat_propertiesEClass, FX_REPEAT_PROPERTIES__VALUES);

    fx_multisize_propertyEClass = createEClass(FX_MULTISIZE_PROPERTY);
    createEAttribute(fx_multisize_propertyEClass, FX_MULTISIZE_PROPERTY__PROPERTY);
    createEReference(fx_multisize_propertyEClass, FX_MULTISIZE_PROPERTY__VALUE);

    fx_size_propertiesEClass = createEClass(FX_SIZE_PROPERTIES);
    createEAttribute(fx_size_propertiesEClass, FX_SIZE_PROPERTIES__PROPERTY);
    createEAttribute(fx_size_propertiesEClass, FX_SIZE_PROPERTIES__VALUES);

    fx_stroke_line_cap_propertyEClass = createEClass(FX_STROKE_LINE_CAP_PROPERTY);
    createEAttribute(fx_stroke_line_cap_propertyEClass, FX_STROKE_LINE_CAP_PROPERTY__PROPERTY);
    createEAttribute(fx_stroke_line_cap_propertyEClass, FX_STROKE_LINE_CAP_PROPERTY__VALUE);

    fx_stroke_line_join_propertyEClass = createEClass(FX_STROKE_LINE_JOIN_PROPERTY);
    createEAttribute(fx_stroke_line_join_propertyEClass, FX_STROKE_LINE_JOIN_PROPERTY__PROPERTY);
    createEAttribute(fx_stroke_line_join_propertyEClass, FX_STROKE_LINE_JOIN_PROPERTY__VALUE);

    fx_alignment_propertyEClass = createEClass(FX_ALIGNMENT_PROPERTY);
    createEAttribute(fx_alignment_propertyEClass, FX_ALIGNMENT_PROPERTY__PROPERTY);
    createEAttribute(fx_alignment_propertyEClass, FX_ALIGNMENT_PROPERTY__VALUE);

    fx_text_origin_propertyEClass = createEClass(FX_TEXT_ORIGIN_PROPERTY);
    createEAttribute(fx_text_origin_propertyEClass, FX_TEXT_ORIGIN_PROPERTY__PROPERTY);
    createEAttribute(fx_text_origin_propertyEClass, FX_TEXT_ORIGIN_PROPERTY__VALUE);

    fx_position_propertyEClass = createEClass(FX_POSITION_PROPERTY);
    createEAttribute(fx_position_propertyEClass, FX_POSITION_PROPERTY__PROPERTY);
    createEReference(fx_position_propertyEClass, FX_POSITION_PROPERTY__VALUES);

    fx_background_image_size_propertyEClass = createEClass(FX_BACKGROUND_IMAGE_SIZE_PROPERTY);
    createEAttribute(fx_background_image_size_propertyEClass, FX_BACKGROUND_IMAGE_SIZE_PROPERTY__PROPERTY);
    createEReference(fx_background_image_size_propertyEClass, FX_BACKGROUND_IMAGE_SIZE_PROPERTY__VALUES);

    fx_border_style_propertyEClass = createEClass(FX_BORDER_STYLE_PROPERTY);
    createEAttribute(fx_border_style_propertyEClass, FX_BORDER_STYLE_PROPERTY__PROPERTY);
    createEReference(fx_border_style_propertyEClass, FX_BORDER_STYLE_PROPERTY__VALUES);

    fx_border_image_slice_propertyEClass = createEClass(FX_BORDER_IMAGE_SLICE_PROPERTY);
    createEAttribute(fx_border_image_slice_propertyEClass, FX_BORDER_IMAGE_SLICE_PROPERTY__PROPERTY);
    createEReference(fx_border_image_slice_propertyEClass, FX_BORDER_IMAGE_SLICE_PROPERTY__VALUES);

    fx_text_overrun_propertyEClass = createEClass(FX_TEXT_OVERRUN_PROPERTY);
    createEAttribute(fx_text_overrun_propertyEClass, FX_TEXT_OVERRUN_PROPERTY__PROPERTY);
    createEAttribute(fx_text_overrun_propertyEClass, FX_TEXT_OVERRUN_PROPERTY__VALUE);

    fx_insets_propertyEClass = createEClass(FX_INSETS_PROPERTY);
    createEAttribute(fx_insets_propertyEClass, FX_INSETS_PROPERTY__PROPERTY);
    createEAttribute(fx_insets_propertyEClass, FX_INSETS_PROPERTY__VALUE);

    fx_number_propertiesEClass = createEClass(FX_NUMBER_PROPERTIES);
    createEAttribute(fx_number_propertiesEClass, FX_NUMBER_PROPERTIES__PROPERTY);
    createEAttribute(fx_number_propertiesEClass, FX_NUMBER_PROPERTIES__VALUE);

    fx_multi_paint_propertiesEClass = createEClass(FX_MULTI_PAINT_PROPERTIES);
    createEAttribute(fx_multi_paint_propertiesEClass, FX_MULTI_PAINT_PROPERTIES__PROPERTY);
    createEReference(fx_multi_paint_propertiesEClass, FX_MULTI_PAINT_PROPERTIES__VALUES);

    fx_string_propertyEClass = createEClass(FX_STRING_PROPERTY);
    createEAttribute(fx_string_propertyEClass, FX_STRING_PROPERTY__PROPERTY);
    createEAttribute(fx_string_propertyEClass, FX_STRING_PROPERTY__VALUE);

    effectEClass = createEClass(EFFECT);
    createEAttribute(effectEClass, EFFECT__BLUR);
    createEReference(effectEClass, EFFECT__COLOR);
    createEAttribute(effectEClass, EFFECT__BLUR_RADIUS);
    createEAttribute(effectEClass, EFFECT__OFFSET_X);
    createEAttribute(effectEClass, EFFECT__OFFSET_Y);

    effectDropShadowEClass = createEClass(EFFECT_DROP_SHADOW);
    createEAttribute(effectDropShadowEClass, EFFECT_DROP_SHADOW__SPREAD);

    effectInnerShadowEClass = createEClass(EFFECT_INNER_SHADOW);
    createEAttribute(effectInnerShadowEClass, EFFECT_INNER_SHADOW__CHOKE);

    multiPaintEClass = createEClass(MULTI_PAINT);
    createEReference(multiPaintEClass, MULTI_PAINT__VALUES);

    paintEClass = createEClass(PAINT);

    linearGradientEClass = createEClass(LINEAR_GRADIENT);
    createEAttribute(linearGradientEClass, LINEAR_GRADIENT__X1);
    createEAttribute(linearGradientEClass, LINEAR_GRADIENT__Y1);
    createEAttribute(linearGradientEClass, LINEAR_GRADIENT__X2);
    createEAttribute(linearGradientEClass, LINEAR_GRADIENT__Y2);
    createEReference(linearGradientEClass, LINEAR_GRADIENT__STOPS);

    radialGradientEClass = createEClass(RADIAL_GRADIENT);
    createEAttribute(radialGradientEClass, RADIAL_GRADIENT__CX);
    createEAttribute(radialGradientEClass, RADIAL_GRADIENT__CY);
    createEAttribute(radialGradientEClass, RADIAL_GRADIENT__RADIUS);
    createEAttribute(radialGradientEClass, RADIAL_GRADIENT__FX);
    createEAttribute(radialGradientEClass, RADIAL_GRADIENT__FY);
    createEReference(radialGradientEClass, RADIAL_GRADIENT__STOPS);

    stopValueEClass = createEClass(STOP_VALUE);
    createEAttribute(stopValueEClass, STOP_VALUE__POS);
    createEReference(stopValueEClass, STOP_VALUE__COLOR);

    repeatStyleEClass = createEClass(REPEAT_STYLE);
    createEAttribute(repeatStyleEClass, REPEAT_STYLE__V);
    createEAttribute(repeatStyleEClass, REPEAT_STYLE__V2);

    dim4SizeEClass = createEClass(DIM4_SIZE);
    createEAttribute(dim4SizeEClass, DIM4_SIZE__VALUES);

    bgPositionEClass = createEClass(BG_POSITION);
    createEAttribute(bgPositionEClass, BG_POSITION__ABSX);
    createEAttribute(bgPositionEClass, BG_POSITION__RELX);
    createEAttribute(bgPositionEClass, BG_POSITION__ABSY);
    createEAttribute(bgPositionEClass, BG_POSITION__RELY);

    fx_color_propertyEClass = createEClass(FX_COLOR_PROPERTY);
    createEAttribute(fx_color_propertyEClass, FX_COLOR_PROPERTY__PROPERTY);
    createEReference(fx_color_propertyEClass, FX_COLOR_PROPERTY__VALUE);

    bgSizeEClass = createEClass(BG_SIZE);
    createEAttribute(bgSizeEClass, BG_SIZE__XSIZE);
    createEAttribute(bgSizeEClass, BG_SIZE__YSIZE);
    createEAttribute(bgSizeEClass, BG_SIZE__PREDEFINED);

    borderStyleEClass = createEClass(BORDER_STYLE);
    createEAttribute(borderStyleEClass, BORDER_STYLE__DASH_STYLE);
    createEAttribute(borderStyleEClass, BORDER_STYLE__LOCATION);
    createEAttribute(borderStyleEClass, BORDER_STYLE__MITER_ABS);
    createEAttribute(borderStyleEClass, BORDER_STYLE__MITER_PREDEFINED);
    createEAttribute(borderStyleEClass, BORDER_STYLE__LINE_CAP);

    sizeFillEClass = createEClass(SIZE_FILL);
    createEReference(sizeFillEClass, SIZE_FILL__VALUE);
    createEAttribute(sizeFillEClass, SIZE_FILL__FILL);

    colorEClass = createEClass(COLOR);

    lookedUpColorEClass = createEClass(LOOKED_UP_COLOR);
    createEAttribute(lookedUpColorEClass, LOOKED_UP_COLOR__VALUE);

    namedColorEClass = createEClass(NAMED_COLOR);
    createEAttribute(namedColorEClass, NAMED_COLOR__VALUE);

    rgbColorEClass = createEClass(RGB_COLOR);
    createEAttribute(rgbColorEClass, RGB_COLOR__HEXCOLOR);
    createEAttribute(rgbColorEClass, RGB_COLOR__R);
    createEAttribute(rgbColorEClass, RGB_COLOR__G);
    createEAttribute(rgbColorEClass, RGB_COLOR__B);
    createEAttribute(rgbColorEClass, RGB_COLOR__RP);
    createEAttribute(rgbColorEClass, RGB_COLOR__GP);
    createEAttribute(rgbColorEClass, RGB_COLOR__BP);
    createEAttribute(rgbColorEClass, RGB_COLOR__ALPHA);

    hsbColorEClass = createEClass(HSB_COLOR);
    createEAttribute(hsbColorEClass, HSB_COLOR__HUE);
    createEAttribute(hsbColorEClass, HSB_COLOR__SATURATION);
    createEAttribute(hsbColorEClass, HSB_COLOR__BRIGHTNESS);
    createEAttribute(hsbColorEClass, HSB_COLOR__ALPHA);

    colorFunctionEClass = createEClass(COLOR_FUNCTION);
    createEReference(colorFunctionEClass, COLOR_FUNCTION__ORIG);
    createEAttribute(colorFunctionEClass, COLOR_FUNCTION__MOD);
    createEAttribute(colorFunctionEClass, COLOR_FUNCTION__STOP_NUMBERS);
    createEReference(colorFunctionEClass, COLOR_FUNCTION__STOP_COLORS);

    urlTypeEClass = createEClass(URL_TYPE);
    createEAttribute(urlTypeEClass, URL_TYPE__URL);

    fontEClass = createEClass(FONT);
    createEAttribute(fontEClass, FONT__STYLE_OR_WEIGHT_STRING);
    createEAttribute(fontEClass, FONT__WEIGHT);
    createEAttribute(fontEClass, FONT__SIZE);
    createEAttribute(fontEClass, FONT__FAMILY);

    fontweightEClass = createEClass(FONTWEIGHT);
    createEAttribute(fontweightEClass, FONTWEIGHT__VALUE_STRING);
    createEAttribute(fontweightEClass, FONTWEIGHT__VALUE_INT);

    fontstyleEClass = createEClass(FONTSTYLE);
    createEAttribute(fontstyleEClass, FONTSTYLE__VALUE);

    // Create enums
    hPositionEEnum = createEEnum(HPOSITION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    css_generic_declarationEClass.getESuperTypes().add(this.getcss_declaration());
    css_fx_declarationEClass.getESuperTypes().add(this.getcss_declaration());
    fx_font_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_font_family_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_font_size_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_font_style_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_font_weight_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_cursor_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_effect_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_boolean_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_size_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_number_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_integer_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_paint_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_blend_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_url_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_paint_propertiesEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_multisize_propertiesEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_hposition_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_vposition_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_side_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_bar_policy_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_url_propertiesEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_repeat_propertiesEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_multisize_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_size_propertiesEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_stroke_line_cap_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_stroke_line_join_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_alignment_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_text_origin_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_position_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_background_image_size_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_border_style_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_border_image_slice_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_text_overrun_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_insets_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_number_propertiesEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_multi_paint_propertiesEClass.getESuperTypes().add(this.getcss_fx_declaration());
    fx_string_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    effectDropShadowEClass.getESuperTypes().add(this.getEffect());
    effectInnerShadowEClass.getESuperTypes().add(this.getEffect());
    linearGradientEClass.getESuperTypes().add(this.getPaint());
    radialGradientEClass.getESuperTypes().add(this.getPaint());
    fx_color_propertyEClass.getESuperTypes().add(this.getcss_fx_declaration());
    colorEClass.getESuperTypes().add(this.getPaint());
    lookedUpColorEClass.getESuperTypes().add(this.getColor());
    namedColorEClass.getESuperTypes().add(this.getColor());
    rgbColorEClass.getESuperTypes().add(this.getColor());
    hsbColorEClass.getESuperTypes().add(this.getColor());
    colorFunctionEClass.getESuperTypes().add(this.getColor());

    // Initialize classes and features; add operations and parameters
    initEClass(stylesheetEClass, stylesheet.class, "stylesheet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getstylesheet_Ruleset(), this.getruleset(), null, "ruleset", null, 0, -1, stylesheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getstylesheet_Media(), this.getmedia(), null, "media", null, 0, -1, stylesheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mediaEClass, media.class, "media", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getmedia_Medialist(), ecorePackage.getEString(), "medialist", null, 0, 1, media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmedia_Rulesets(), this.getruleset(), null, "rulesets", null, 0, -1, media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rulesetEClass, ruleset.class, "ruleset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getruleset_Selectors(), this.getselector(), null, "selectors", null, 0, -1, ruleset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getruleset_Declarations(), this.getcss_declaration(), null, "declarations", null, 0, -1, ruleset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectorEClass, selector.class, "selector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getselector_Simpleselectors(), this.getsimple_selector(), null, "simpleselectors", null, 0, -1, selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getselector_Selector(), this.getselector(), null, "selector", null, 0, 1, selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simple_selectorEClass, simple_selector.class, "simple_selector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsimple_selector_Element(), ecorePackage.getEString(), "element", null, 0, 1, simple_selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsimple_selector_Id(), ecorePackage.getEString(), "id", null, 0, 1, simple_selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsimple_selector_Class(), ecorePackage.getEString(), "class", null, 0, 1, simple_selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsimple_selector_Pseudoclasses(), ecorePackage.getEString(), "pseudoclasses", null, 0, -1, simple_selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(css_declarationEClass, css_declaration.class, "css_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(css_generic_declarationEClass, css_generic_declaration.class, "css_generic_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getcss_generic_declaration_Property(), ecorePackage.getEString(), "property", null, 0, 1, css_generic_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getcss_generic_declaration_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, css_generic_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(css_fx_declarationEClass, css_fx_declaration.class, "css_fx_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fx_font_propertyEClass, fx_font_property.class, "fx_font_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_font_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_font_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfx_font_property_Value(), this.getFONT(), null, "value", null, 0, 1, fx_font_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_font_family_propertyEClass, fx_font_family_property.class, "fx_font_family_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_font_family_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_font_family_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_font_family_property_Value(), ecorePackage.getEString(), "value", null, 0, 1, fx_font_family_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_font_size_propertyEClass, fx_font_size_property.class, "fx_font_size_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_font_size_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_font_size_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_font_size_property_Value(), ecorePackage.getEString(), "value", null, 0, 1, fx_font_size_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_font_style_propertyEClass, fx_font_style_property.class, "fx_font_style_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_font_style_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_font_style_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfx_font_style_property_Value(), this.getFONTSTYLE(), null, "value", null, 0, 1, fx_font_style_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_font_weight_propertyEClass, fx_font_weight_property.class, "fx_font_weight_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_font_weight_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_font_weight_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfx_font_weight_property_Value(), this.getFONTWEIGHT(), null, "value", null, 0, 1, fx_font_weight_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_cursor_propertyEClass, fx_cursor_property.class, "fx_cursor_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_cursor_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_cursor_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_cursor_property_Value(), ecorePackage.getEString(), "value", null, 0, 1, fx_cursor_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_effect_propertyEClass, fx_effect_property.class, "fx_effect_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfx_effect_property_Value(), this.getEffect(), null, "value", null, 0, 1, fx_effect_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_boolean_propertyEClass, fx_boolean_property.class, "fx_boolean_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_boolean_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_boolean_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_boolean_property_Value(), ecorePackage.getEString(), "value", null, 0, 1, fx_boolean_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_size_propertyEClass, fx_size_property.class, "fx_size_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_size_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_size_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_size_property_Value(), ecorePackage.getEString(), "value", null, 0, 1, fx_size_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_number_propertyEClass, fx_number_property.class, "fx_number_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_number_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_number_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_number_property_Value(), ecorePackage.getEString(), "value", null, 0, 1, fx_number_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_integer_propertyEClass, fx_integer_property.class, "fx_integer_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_integer_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_integer_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_integer_property_Value(), ecorePackage.getEString(), "value", null, 0, 1, fx_integer_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_paint_propertyEClass, fx_paint_property.class, "fx_paint_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_paint_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_paint_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfx_paint_property_Value(), this.getPaint(), null, "value", null, 0, 1, fx_paint_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_blend_propertyEClass, fx_blend_property.class, "fx_blend_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_blend_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_blend_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_blend_property_Value(), ecorePackage.getEString(), "value", null, 0, 1, fx_blend_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_url_propertyEClass, fx_url_property.class, "fx_url_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_url_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_url_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfx_url_property_Value(), this.getURLType(), null, "value", null, 0, 1, fx_url_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_paint_propertiesEClass, fx_paint_properties.class, "fx_paint_properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_paint_properties_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_paint_properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfx_paint_properties_Values(), this.getPaint(), null, "values", null, 0, -1, fx_paint_properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_multisize_propertiesEClass, fx_multisize_properties.class, "fx_multisize_properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_multisize_properties_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_multisize_properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfx_multisize_properties_Values(), this.getDim4Size(), null, "values", null, 0, -1, fx_multisize_properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_hposition_propertyEClass, fx_hposition_property.class, "fx_hposition_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_hposition_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_hposition_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_hposition_property_Value(), this.getHPosition(), "value", null, 0, 1, fx_hposition_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_vposition_propertyEClass, fx_vposition_property.class, "fx_vposition_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_vposition_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_vposition_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_vposition_property_Value(), ecorePackage.getEString(), "value", null, 0, 1, fx_vposition_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_side_propertyEClass, fx_side_property.class, "fx_side_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_side_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_side_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_side_property_Value(), ecorePackage.getEString(), "value", null, 0, 1, fx_side_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_bar_policy_propertyEClass, fx_bar_policy_property.class, "fx_bar_policy_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_bar_policy_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_bar_policy_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_bar_policy_property_Value(), ecorePackage.getEString(), "value", null, 0, 1, fx_bar_policy_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_url_propertiesEClass, fx_url_properties.class, "fx_url_properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_url_properties_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_url_properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfx_url_properties_Values(), this.getURLType(), null, "values", null, 0, -1, fx_url_properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_repeat_propertiesEClass, fx_repeat_properties.class, "fx_repeat_properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_repeat_properties_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_repeat_properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfx_repeat_properties_Values(), this.getRepeatStyle(), null, "values", null, 0, -1, fx_repeat_properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_multisize_propertyEClass, fx_multisize_property.class, "fx_multisize_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_multisize_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_multisize_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfx_multisize_property_Value(), this.getDim4Size(), null, "value", null, 0, 1, fx_multisize_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_size_propertiesEClass, fx_size_properties.class, "fx_size_properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_size_properties_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_size_properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_size_properties_Values(), ecorePackage.getEString(), "values", null, 0, -1, fx_size_properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_stroke_line_cap_propertyEClass, fx_stroke_line_cap_property.class, "fx_stroke_line_cap_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_stroke_line_cap_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_stroke_line_cap_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_stroke_line_cap_property_Value(), ecorePackage.getEString(), "value", null, 0, 1, fx_stroke_line_cap_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_stroke_line_join_propertyEClass, fx_stroke_line_join_property.class, "fx_stroke_line_join_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_stroke_line_join_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_stroke_line_join_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_stroke_line_join_property_Value(), ecorePackage.getEString(), "value", null, 0, 1, fx_stroke_line_join_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_alignment_propertyEClass, fx_alignment_property.class, "fx_alignment_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_alignment_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_alignment_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_alignment_property_Value(), ecorePackage.getEString(), "value", null, 0, 1, fx_alignment_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_text_origin_propertyEClass, fx_text_origin_property.class, "fx_text_origin_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_text_origin_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_text_origin_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_text_origin_property_Value(), ecorePackage.getEString(), "value", null, 0, 1, fx_text_origin_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_position_propertyEClass, fx_position_property.class, "fx_position_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_position_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_position_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfx_position_property_Values(), this.getBgPosition(), null, "values", null, 0, -1, fx_position_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_background_image_size_propertyEClass, fx_background_image_size_property.class, "fx_background_image_size_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_background_image_size_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_background_image_size_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfx_background_image_size_property_Values(), this.getBgSize(), null, "values", null, 0, -1, fx_background_image_size_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_border_style_propertyEClass, fx_border_style_property.class, "fx_border_style_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_border_style_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_border_style_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfx_border_style_property_Values(), this.getBorderStyle(), null, "values", null, 0, -1, fx_border_style_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_border_image_slice_propertyEClass, fx_border_image_slice_property.class, "fx_border_image_slice_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_border_image_slice_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_border_image_slice_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfx_border_image_slice_property_Values(), this.getSizeFill(), null, "values", null, 0, -1, fx_border_image_slice_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_text_overrun_propertyEClass, fx_text_overrun_property.class, "fx_text_overrun_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_text_overrun_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_text_overrun_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_text_overrun_property_Value(), ecorePackage.getEString(), "value", null, 0, 1, fx_text_overrun_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_insets_propertyEClass, fx_insets_property.class, "fx_insets_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_insets_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_insets_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_insets_property_Value(), ecorePackage.getEString(), "value", null, 0, -1, fx_insets_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_number_propertiesEClass, fx_number_properties.class, "fx_number_properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_number_properties_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_number_properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_number_properties_Value(), ecorePackage.getEString(), "value", null, 0, -1, fx_number_properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_multi_paint_propertiesEClass, fx_multi_paint_properties.class, "fx_multi_paint_properties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_multi_paint_properties_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_multi_paint_properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfx_multi_paint_properties_Values(), this.getMultiPaint(), null, "values", null, 0, -1, fx_multi_paint_properties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_string_propertyEClass, fx_string_property.class, "fx_string_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_string_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_string_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfx_string_property_Value(), ecorePackage.getEString(), "value", null, 0, 1, fx_string_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectEClass, Effect.class, "Effect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEffect_Blur(), ecorePackage.getEString(), "blur", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEffect_Color(), this.getColor(), null, "color", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEffect_BlurRadius(), ecorePackage.getEString(), "blurRadius", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEffect_OffsetX(), ecorePackage.getEString(), "offsetX", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEffect_OffsetY(), ecorePackage.getEString(), "offsetY", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectDropShadowEClass, EffectDropShadow.class, "EffectDropShadow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEffectDropShadow_Spread(), ecorePackage.getEString(), "spread", null, 0, 1, EffectDropShadow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectInnerShadowEClass, EffectInnerShadow.class, "EffectInnerShadow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEffectInnerShadow_Choke(), ecorePackage.getEString(), "choke", null, 0, 1, EffectInnerShadow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiPaintEClass, MultiPaint.class, "MultiPaint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiPaint_Values(), this.getPaint(), null, "values", null, 0, -1, MultiPaint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paintEClass, Paint.class, "Paint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(linearGradientEClass, LinearGradient.class, "LinearGradient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLinearGradient_X1(), ecorePackage.getEString(), "x1", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLinearGradient_Y1(), ecorePackage.getEString(), "y1", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLinearGradient_X2(), ecorePackage.getEString(), "x2", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLinearGradient_Y2(), ecorePackage.getEString(), "y2", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLinearGradient_Stops(), this.getStopValue(), null, "stops", null, 0, -1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(radialGradientEClass, RadialGradient.class, "RadialGradient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRadialGradient_Cx(), ecorePackage.getEString(), "cx", null, 0, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRadialGradient_Cy(), ecorePackage.getEString(), "cy", null, 0, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRadialGradient_Radius(), ecorePackage.getEString(), "radius", null, 0, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRadialGradient_Fx(), ecorePackage.getEString(), "fx", null, 0, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRadialGradient_Fy(), ecorePackage.getEString(), "fy", null, 0, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRadialGradient_Stops(), this.getStopValue(), null, "stops", null, 0, -1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stopValueEClass, StopValue.class, "StopValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStopValue_Pos(), ecorePackage.getEString(), "pos", null, 0, 1, StopValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStopValue_Color(), this.getColor(), null, "color", null, 0, 1, StopValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repeatStyleEClass, RepeatStyle.class, "RepeatStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRepeatStyle_V(), ecorePackage.getEString(), "v", null, 0, 1, RepeatStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRepeatStyle_V2(), ecorePackage.getEString(), "v2", null, 0, 1, RepeatStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dim4SizeEClass, Dim4Size.class, "Dim4Size", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDim4Size_Values(), ecorePackage.getEString(), "values", null, 0, -1, Dim4Size.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bgPositionEClass, BgPosition.class, "BgPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBgPosition_Absx(), ecorePackage.getEString(), "absx", null, 0, 1, BgPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBgPosition_Relx(), ecorePackage.getEString(), "relx", null, 0, 1, BgPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBgPosition_Absy(), ecorePackage.getEString(), "absy", null, 0, 1, BgPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBgPosition_Rely(), ecorePackage.getEString(), "rely", null, 0, 1, BgPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fx_color_propertyEClass, fx_color_property.class, "fx_color_property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfx_color_property_Property(), ecorePackage.getEString(), "property", null, 0, 1, fx_color_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfx_color_property_Value(), this.getColor(), null, "value", null, 0, 1, fx_color_property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bgSizeEClass, BgSize.class, "BgSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBgSize_Xsize(), ecorePackage.getEString(), "xsize", null, 0, 1, BgSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBgSize_Ysize(), ecorePackage.getEString(), "ysize", null, 0, 1, BgSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBgSize_Predefined(), ecorePackage.getEString(), "predefined", null, 0, 1, BgSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(borderStyleEClass, BorderStyle.class, "BorderStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBorderStyle_DashStyle(), ecorePackage.getEString(), "dashStyle", null, 0, 1, BorderStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBorderStyle_Location(), ecorePackage.getEString(), "location", null, 0, 1, BorderStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBorderStyle_MiterAbs(), ecorePackage.getEString(), "miterAbs", null, 0, 1, BorderStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBorderStyle_MiterPredefined(), ecorePackage.getEString(), "miterPredefined", null, 0, 1, BorderStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBorderStyle_LineCap(), ecorePackage.getEString(), "lineCap", null, 0, 1, BorderStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sizeFillEClass, SizeFill.class, "SizeFill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSizeFill_Value(), this.getDim4Size(), null, "value", null, 0, 1, SizeFill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSizeFill_Fill(), ecorePackage.getEString(), "fill", null, 0, 1, SizeFill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lookedUpColorEClass, LookedUpColor.class, "LookedUpColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLookedUpColor_Value(), ecorePackage.getEString(), "value", null, 0, 1, LookedUpColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedColorEClass, NamedColor.class, "NamedColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedColor_Value(), ecorePackage.getEString(), "value", null, 0, 1, NamedColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rgbColorEClass, RGBColor.class, "RGBColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRGBColor_Hexcolor(), ecorePackage.getEString(), "hexcolor", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGBColor_R(), ecorePackage.getEString(), "r", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGBColor_G(), ecorePackage.getEString(), "g", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGBColor_B(), ecorePackage.getEString(), "b", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGBColor_Rp(), ecorePackage.getEString(), "rp", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGBColor_Gp(), ecorePackage.getEString(), "gp", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGBColor_Bp(), ecorePackage.getEString(), "bp", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRGBColor_Alpha(), ecorePackage.getEString(), "alpha", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hsbColorEClass, HSBColor.class, "HSBColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHSBColor_Hue(), ecorePackage.getEString(), "hue", null, 0, 1, HSBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHSBColor_Saturation(), ecorePackage.getEString(), "saturation", null, 0, 1, HSBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHSBColor_Brightness(), ecorePackage.getEString(), "brightness", null, 0, 1, HSBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHSBColor_Alpha(), ecorePackage.getEString(), "alpha", null, 0, 1, HSBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorFunctionEClass, ColorFunction.class, "ColorFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getColorFunction_Orig(), this.getColor(), null, "orig", null, 0, 1, ColorFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColorFunction_Mod(), ecorePackage.getEString(), "mod", null, 0, 1, ColorFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColorFunction_StopNumbers(), ecorePackage.getEString(), "stopNumbers", null, 0, -1, ColorFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getColorFunction_StopColors(), this.getColor(), null, "stopColors", null, 0, -1, ColorFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(urlTypeEClass, URLType.class, "URLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getURLType_Url(), ecorePackage.getEString(), "url", null, 0, 1, URLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontEClass, at.bestsolution.efxclipse.tooling.css.cssDsl.FONT.class, "FONT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFONT_StyleOrWeightString(), ecorePackage.getEString(), "styleOrWeightString", null, 0, 1, at.bestsolution.efxclipse.tooling.css.cssDsl.FONT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFONT_Weight(), ecorePackage.getEString(), "weight", null, 0, 1, at.bestsolution.efxclipse.tooling.css.cssDsl.FONT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFONT_Size(), ecorePackage.getEString(), "size", null, 0, 1, at.bestsolution.efxclipse.tooling.css.cssDsl.FONT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFONT_Family(), ecorePackage.getEString(), "family", null, 0, 1, at.bestsolution.efxclipse.tooling.css.cssDsl.FONT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontweightEClass, at.bestsolution.efxclipse.tooling.css.cssDsl.FONTWEIGHT.class, "FONTWEIGHT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFONTWEIGHT_ValueString(), ecorePackage.getEString(), "valueString", null, 0, 1, at.bestsolution.efxclipse.tooling.css.cssDsl.FONTWEIGHT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFONTWEIGHT_ValueInt(), ecorePackage.getEString(), "valueInt", null, 0, 1, at.bestsolution.efxclipse.tooling.css.cssDsl.FONTWEIGHT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontstyleEClass, at.bestsolution.efxclipse.tooling.css.cssDsl.FONTSTYLE.class, "FONTSTYLE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFONTSTYLE_Value(), ecorePackage.getEString(), "value", null, 0, 1, at.bestsolution.efxclipse.tooling.css.cssDsl.FONTSTYLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(hPositionEEnum, HPosition.class, "HPosition");
    addEEnumLiteral(hPositionEEnum, HPosition.LEFT);
    addEEnumLiteral(hPositionEEnum, HPosition.CENTER);
    addEEnumLiteral(hPositionEEnum, HPosition.RIGHT);
    addEEnumLiteral(hPositionEEnum, HPosition.LEADING);
    addEEnumLiteral(hPositionEEnum, HPosition.TRAILING);

    // Create resource
    createResource(eNS_URI);
  }

} //CssDslPackageImpl
