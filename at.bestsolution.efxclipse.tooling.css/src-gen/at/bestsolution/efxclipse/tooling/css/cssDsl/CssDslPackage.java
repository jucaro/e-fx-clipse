/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslFactory
 * @model kind="package"
 * @generated
 */
public interface CssDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cssDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bestsolution.at/efxclipse/tooling/css/CssDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cssDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CssDslPackage eINSTANCE = at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl.init();

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.stylesheetImpl <em>stylesheet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.stylesheetImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getstylesheet()
   * @generated
   */
  int STYLESHEET = 0;

  /**
   * The feature id for the '<em><b>Ruleset</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLESHEET__RULESET = 0;

  /**
   * The feature id for the '<em><b>Media</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLESHEET__MEDIA = 1;

  /**
   * The number of structural features of the '<em>stylesheet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLESHEET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.mediaImpl <em>media</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.mediaImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getmedia()
   * @generated
   */
  int MEDIA = 1;

  /**
   * The feature id for the '<em><b>Medialist</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA__MEDIALIST = 0;

  /**
   * The feature id for the '<em><b>Rulesets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA__RULESETS = 1;

  /**
   * The number of structural features of the '<em>media</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEDIA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.rulesetImpl <em>ruleset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.rulesetImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getruleset()
   * @generated
   */
  int RULESET = 2;

  /**
   * The feature id for the '<em><b>Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULESET__SELECTORS = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULESET__DECLARATIONS = 1;

  /**
   * The number of structural features of the '<em>ruleset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULESET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.selectorImpl <em>selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.selectorImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getselector()
   * @generated
   */
  int SELECTOR = 3;

  /**
   * The feature id for the '<em><b>Simpleselectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR__SIMPLESELECTORS = 0;

  /**
   * The feature id for the '<em><b>Combinator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR__COMBINATOR = 1;

  /**
   * The feature id for the '<em><b>Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR__SELECTOR = 2;

  /**
   * The number of structural features of the '<em>selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.simple_selectorImpl <em>simple selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.simple_selectorImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getsimple_selector()
   * @generated
   */
  int SIMPLE_SELECTOR = 4;

  /**
   * The feature id for the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR__ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR__ID = 1;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR__CLASS = 2;

  /**
   * The feature id for the '<em><b>Pseudoclasses</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR__PSEUDOCLASSES = 3;

  /**
   * The number of structural features of the '<em>simple selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.css_declarationImpl <em>css declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.css_declarationImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getcss_declaration()
   * @generated
   */
  int CSS_DECLARATION = 5;

  /**
   * The number of structural features of the '<em>css declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_DECLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.css_generic_declarationImpl <em>css generic declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.css_generic_declarationImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getcss_generic_declaration()
   * @generated
   */
  int CSS_GENERIC_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_GENERIC_DECLARATION__PROPERTY = CSS_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_GENERIC_DECLARATION__EXPRESSION = CSS_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>css generic declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_GENERIC_DECLARATION_FEATURE_COUNT = CSS_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.css_fx_declarationImpl <em>css fx declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.css_fx_declarationImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getcss_fx_declaration()
   * @generated
   */
  int CSS_FX_DECLARATION = 7;

  /**
   * The number of structural features of the '<em>css fx declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_FX_DECLARATION_FEATURE_COUNT = CSS_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_propertyImpl <em>fx font property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_font_property()
   * @generated
   */
  int FX_FONT_PROPERTY = 8;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_FONT_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_FONT_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx font property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_FONT_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_family_propertyImpl <em>fx font family property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_family_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_font_family_property()
   * @generated
   */
  int FX_FONT_FAMILY_PROPERTY = 9;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_FONT_FAMILY_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_FONT_FAMILY_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx font family property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_FONT_FAMILY_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_size_propertyImpl <em>fx font size property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_size_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_font_size_property()
   * @generated
   */
  int FX_FONT_SIZE_PROPERTY = 10;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_FONT_SIZE_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_FONT_SIZE_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx font size property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_FONT_SIZE_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_style_propertyImpl <em>fx font style property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_style_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_font_style_property()
   * @generated
   */
  int FX_FONT_STYLE_PROPERTY = 11;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_FONT_STYLE_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_FONT_STYLE_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx font style property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_FONT_STYLE_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_weight_propertyImpl <em>fx font weight property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_weight_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_font_weight_property()
   * @generated
   */
  int FX_FONT_WEIGHT_PROPERTY = 12;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_FONT_WEIGHT_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_FONT_WEIGHT_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx font weight property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_FONT_WEIGHT_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_cursor_propertyImpl <em>fx cursor property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_cursor_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_cursor_property()
   * @generated
   */
  int FX_CURSOR_PROPERTY = 13;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_CURSOR_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_CURSOR_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx cursor property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_CURSOR_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_effect_propertyImpl <em>fx effect property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_effect_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_effect_property()
   * @generated
   */
  int FX_EFFECT_PROPERTY = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_EFFECT_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>fx effect property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_EFFECT_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_boolean_propertyImpl <em>fx boolean property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_boolean_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_boolean_property()
   * @generated
   */
  int FX_BOOLEAN_PROPERTY = 15;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BOOLEAN_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BOOLEAN_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx boolean property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BOOLEAN_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_size_propertyImpl <em>fx size property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_size_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_size_property()
   * @generated
   */
  int FX_SIZE_PROPERTY = 16;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_SIZE_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_SIZE_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx size property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_SIZE_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_number_propertyImpl <em>fx number property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_number_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_number_property()
   * @generated
   */
  int FX_NUMBER_PROPERTY = 17;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_NUMBER_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_NUMBER_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx number property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_NUMBER_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_integer_propertyImpl <em>fx integer property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_integer_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_integer_property()
   * @generated
   */
  int FX_INTEGER_PROPERTY = 18;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_INTEGER_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_INTEGER_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx integer property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_INTEGER_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_paint_propertyImpl <em>fx paint property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_paint_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_paint_property()
   * @generated
   */
  int FX_PAINT_PROPERTY = 19;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_PAINT_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_PAINT_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx paint property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_PAINT_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_blend_propertyImpl <em>fx blend property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_blend_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_blend_property()
   * @generated
   */
  int FX_BLEND_PROPERTY = 20;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BLEND_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BLEND_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx blend property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BLEND_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_url_propertyImpl <em>fx url property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_url_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_url_property()
   * @generated
   */
  int FX_URL_PROPERTY = 21;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_URL_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_URL_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx url property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_URL_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_paint_propertiesImpl <em>fx paint properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_paint_propertiesImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_paint_properties()
   * @generated
   */
  int FX_PAINT_PROPERTIES = 22;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_PAINT_PROPERTIES__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_PAINT_PROPERTIES__VALUES = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx paint properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_PAINT_PROPERTIES_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_multisize_propertiesImpl <em>fx multisize properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_multisize_propertiesImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_multisize_properties()
   * @generated
   */
  int FX_MULTISIZE_PROPERTIES = 23;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_MULTISIZE_PROPERTIES__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_MULTISIZE_PROPERTIES__VALUES = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx multisize properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_MULTISIZE_PROPERTIES_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_hposition_propertyImpl <em>fx hposition property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_hposition_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_hposition_property()
   * @generated
   */
  int FX_HPOSITION_PROPERTY = 24;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_HPOSITION_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_HPOSITION_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx hposition property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_HPOSITION_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_vposition_propertyImpl <em>fx vposition property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_vposition_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_vposition_property()
   * @generated
   */
  int FX_VPOSITION_PROPERTY = 25;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_VPOSITION_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_VPOSITION_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx vposition property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_VPOSITION_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_side_propertyImpl <em>fx side property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_side_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_side_property()
   * @generated
   */
  int FX_SIDE_PROPERTY = 26;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_SIDE_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_SIDE_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx side property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_SIDE_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_bar_policy_propertyImpl <em>fx bar policy property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_bar_policy_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_bar_policy_property()
   * @generated
   */
  int FX_BAR_POLICY_PROPERTY = 27;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BAR_POLICY_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BAR_POLICY_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx bar policy property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BAR_POLICY_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_url_propertiesImpl <em>fx url properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_url_propertiesImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_url_properties()
   * @generated
   */
  int FX_URL_PROPERTIES = 28;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_URL_PROPERTIES__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_URL_PROPERTIES__VALUES = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx url properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_URL_PROPERTIES_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_repeat_propertiesImpl <em>fx repeat properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_repeat_propertiesImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_repeat_properties()
   * @generated
   */
  int FX_REPEAT_PROPERTIES = 29;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_REPEAT_PROPERTIES__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_REPEAT_PROPERTIES__VALUES = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx repeat properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_REPEAT_PROPERTIES_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_multisize_propertyImpl <em>fx multisize property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_multisize_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_multisize_property()
   * @generated
   */
  int FX_MULTISIZE_PROPERTY = 30;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_MULTISIZE_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_MULTISIZE_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx multisize property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_MULTISIZE_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_size_propertiesImpl <em>fx size properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_size_propertiesImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_size_properties()
   * @generated
   */
  int FX_SIZE_PROPERTIES = 31;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_SIZE_PROPERTIES__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_SIZE_PROPERTIES__VALUES = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx size properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_SIZE_PROPERTIES_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_stroke_line_cap_propertyImpl <em>fx stroke line cap property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_stroke_line_cap_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_stroke_line_cap_property()
   * @generated
   */
  int FX_STROKE_LINE_CAP_PROPERTY = 32;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_STROKE_LINE_CAP_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_STROKE_LINE_CAP_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx stroke line cap property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_STROKE_LINE_CAP_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_stroke_line_join_propertyImpl <em>fx stroke line join property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_stroke_line_join_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_stroke_line_join_property()
   * @generated
   */
  int FX_STROKE_LINE_JOIN_PROPERTY = 33;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_STROKE_LINE_JOIN_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_STROKE_LINE_JOIN_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx stroke line join property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_STROKE_LINE_JOIN_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_alignment_propertyImpl <em>fx alignment property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_alignment_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_alignment_property()
   * @generated
   */
  int FX_ALIGNMENT_PROPERTY = 34;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_ALIGNMENT_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_ALIGNMENT_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx alignment property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_ALIGNMENT_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_text_origin_propertyImpl <em>fx text origin property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_text_origin_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_text_origin_property()
   * @generated
   */
  int FX_TEXT_ORIGIN_PROPERTY = 35;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_TEXT_ORIGIN_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_TEXT_ORIGIN_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx text origin property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_TEXT_ORIGIN_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_position_propertyImpl <em>fx position property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_position_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_position_property()
   * @generated
   */
  int FX_POSITION_PROPERTY = 36;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_POSITION_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_POSITION_PROPERTY__VALUES = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx position property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_POSITION_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_background_image_size_propertyImpl <em>fx background image size property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_background_image_size_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_background_image_size_property()
   * @generated
   */
  int FX_BACKGROUND_IMAGE_SIZE_PROPERTY = 37;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BACKGROUND_IMAGE_SIZE_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BACKGROUND_IMAGE_SIZE_PROPERTY__VALUES = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx background image size property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BACKGROUND_IMAGE_SIZE_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_border_style_propertyImpl <em>fx border style property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_border_style_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_border_style_property()
   * @generated
   */
  int FX_BORDER_STYLE_PROPERTY = 38;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BORDER_STYLE_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BORDER_STYLE_PROPERTY__VALUES = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx border style property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BORDER_STYLE_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_border_image_slice_propertyImpl <em>fx border image slice property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_border_image_slice_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_border_image_slice_property()
   * @generated
   */
  int FX_BORDER_IMAGE_SLICE_PROPERTY = 39;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BORDER_IMAGE_SLICE_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BORDER_IMAGE_SLICE_PROPERTY__VALUES = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx border image slice property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_BORDER_IMAGE_SLICE_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_text_overrun_propertyImpl <em>fx text overrun property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_text_overrun_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_text_overrun_property()
   * @generated
   */
  int FX_TEXT_OVERRUN_PROPERTY = 40;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_TEXT_OVERRUN_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_TEXT_OVERRUN_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx text overrun property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_TEXT_OVERRUN_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_insets_propertyImpl <em>fx insets property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_insets_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_insets_property()
   * @generated
   */
  int FX_INSETS_PROPERTY = 41;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_INSETS_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_INSETS_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx insets property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_INSETS_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_number_propertiesImpl <em>fx number properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_number_propertiesImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_number_properties()
   * @generated
   */
  int FX_NUMBER_PROPERTIES = 42;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_NUMBER_PROPERTIES__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_NUMBER_PROPERTIES__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx number properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_NUMBER_PROPERTIES_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_multi_paint_propertiesImpl <em>fx multi paint properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_multi_paint_propertiesImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_multi_paint_properties()
   * @generated
   */
  int FX_MULTI_PAINT_PROPERTIES = 43;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_MULTI_PAINT_PROPERTIES__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_MULTI_PAINT_PROPERTIES__VALUES = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx multi paint properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_MULTI_PAINT_PROPERTIES_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_string_propertyImpl <em>fx string property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_string_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_string_property()
   * @generated
   */
  int FX_STRING_PROPERTY = 44;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_STRING_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_STRING_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx string property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_STRING_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.EffectImpl <em>Effect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.EffectImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getEffect()
   * @generated
   */
  int EFFECT = 45;

  /**
   * The feature id for the '<em><b>Blur</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__BLUR = 0;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__COLOR = 1;

  /**
   * The feature id for the '<em><b>Blur Radius</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__BLUR_RADIUS = 2;

  /**
   * The feature id for the '<em><b>Offset X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__OFFSET_X = 3;

  /**
   * The feature id for the '<em><b>Offset Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT__OFFSET_Y = 4;

  /**
   * The number of structural features of the '<em>Effect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.EffectDropShadowImpl <em>Effect Drop Shadow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.EffectDropShadowImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getEffectDropShadow()
   * @generated
   */
  int EFFECT_DROP_SHADOW = 46;

  /**
   * The feature id for the '<em><b>Blur</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_DROP_SHADOW__BLUR = EFFECT__BLUR;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_DROP_SHADOW__COLOR = EFFECT__COLOR;

  /**
   * The feature id for the '<em><b>Blur Radius</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_DROP_SHADOW__BLUR_RADIUS = EFFECT__BLUR_RADIUS;

  /**
   * The feature id for the '<em><b>Offset X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_DROP_SHADOW__OFFSET_X = EFFECT__OFFSET_X;

  /**
   * The feature id for the '<em><b>Offset Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_DROP_SHADOW__OFFSET_Y = EFFECT__OFFSET_Y;

  /**
   * The feature id for the '<em><b>Spread</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_DROP_SHADOW__SPREAD = EFFECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Effect Drop Shadow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_DROP_SHADOW_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.EffectInnerShadowImpl <em>Effect Inner Shadow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.EffectInnerShadowImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getEffectInnerShadow()
   * @generated
   */
  int EFFECT_INNER_SHADOW = 47;

  /**
   * The feature id for the '<em><b>Blur</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_INNER_SHADOW__BLUR = EFFECT__BLUR;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_INNER_SHADOW__COLOR = EFFECT__COLOR;

  /**
   * The feature id for the '<em><b>Blur Radius</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_INNER_SHADOW__BLUR_RADIUS = EFFECT__BLUR_RADIUS;

  /**
   * The feature id for the '<em><b>Offset X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_INNER_SHADOW__OFFSET_X = EFFECT__OFFSET_X;

  /**
   * The feature id for the '<em><b>Offset Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_INNER_SHADOW__OFFSET_Y = EFFECT__OFFSET_Y;

  /**
   * The feature id for the '<em><b>Choke</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_INNER_SHADOW__CHOKE = EFFECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Effect Inner Shadow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EFFECT_INNER_SHADOW_FEATURE_COUNT = EFFECT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.MultiPaintImpl <em>Multi Paint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.MultiPaintImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getMultiPaint()
   * @generated
   */
  int MULTI_PAINT = 48;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_PAINT__VALUES = 0;

  /**
   * The number of structural features of the '<em>Multi Paint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_PAINT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.PaintImpl <em>Paint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.PaintImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getPaint()
   * @generated
   */
  int PAINT = 49;

  /**
   * The number of structural features of the '<em>Paint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAINT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.LinearGradientImpl <em>Linear Gradient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.LinearGradientImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getLinearGradient()
   * @generated
   */
  int LINEAR_GRADIENT = 50;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_GRADIENT__START = PAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_GRADIENT__END = PAINT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_GRADIENT__STOPS = PAINT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Linear Gradient</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINEAR_GRADIENT_FEATURE_COUNT = PAINT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RadialGradientImpl <em>Radial Gradient</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RadialGradientImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getRadialGradient()
   * @generated
   */
  int RADIAL_GRADIENT = 51;

  /**
   * The feature id for the '<em><b>Center</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIAL_GRADIENT__CENTER = PAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Radius</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIAL_GRADIENT__RADIUS = PAINT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Focus</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIAL_GRADIENT__FOCUS = PAINT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Stops</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIAL_GRADIENT__STOPS = PAINT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Radial Gradient</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIAL_GRADIENT_FEATURE_COUNT = PAINT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.StopValueImpl <em>Stop Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.StopValueImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getStopValue()
   * @generated
   */
  int STOP_VALUE = 52;

  /**
   * The feature id for the '<em><b>Pos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOP_VALUE__POS = 0;

  /**
   * The feature id for the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOP_VALUE__COLOR = 1;

  /**
   * The number of structural features of the '<em>Stop Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STOP_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.PointValueImpl <em>Point Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.PointValueImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getPointValue()
   * @generated
   */
  int POINT_VALUE = 53;

  /**
   * The feature id for the '<em><b>X</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_VALUE__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_VALUE__Y = 1;

  /**
   * The number of structural features of the '<em>Point Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RepeatStyleImpl <em>Repeat Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RepeatStyleImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getRepeatStyle()
   * @generated
   */
  int REPEAT_STYLE = 54;

  /**
   * The feature id for the '<em><b>V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STYLE__V = 0;

  /**
   * The feature id for the '<em><b>V2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STYLE__V2 = 1;

  /**
   * The number of structural features of the '<em>Repeat Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_STYLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.Dim4SizeImpl <em>Dim4 Size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.Dim4SizeImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getDim4Size()
   * @generated
   */
  int DIM4_SIZE = 55;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIM4_SIZE__VALUES = 0;

  /**
   * The number of structural features of the '<em>Dim4 Size</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIM4_SIZE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BgPositionImpl <em>Bg Position</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BgPositionImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getBgPosition()
   * @generated
   */
  int BG_POSITION = 56;

  /**
   * The feature id for the '<em><b>Absx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_POSITION__ABSX = 0;

  /**
   * The feature id for the '<em><b>Relx</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_POSITION__RELX = 1;

  /**
   * The feature id for the '<em><b>Absy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_POSITION__ABSY = 2;

  /**
   * The feature id for the '<em><b>Rely</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_POSITION__RELY = 3;

  /**
   * The number of structural features of the '<em>Bg Position</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_POSITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_color_propertyImpl <em>fx color property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_color_propertyImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_color_property()
   * @generated
   */
  int FX_COLOR_PROPERTY = 57;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_COLOR_PROPERTY__PROPERTY = CSS_FX_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_COLOR_PROPERTY__VALUE = CSS_FX_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>fx color property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FX_COLOR_PROPERTY_FEATURE_COUNT = CSS_FX_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BgSizeImpl <em>Bg Size</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BgSizeImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getBgSize()
   * @generated
   */
  int BG_SIZE = 58;

  /**
   * The feature id for the '<em><b>Xsize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_SIZE__XSIZE = 0;

  /**
   * The feature id for the '<em><b>Ysize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_SIZE__YSIZE = 1;

  /**
   * The feature id for the '<em><b>Predefined</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_SIZE__PREDEFINED = 2;

  /**
   * The number of structural features of the '<em>Bg Size</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BG_SIZE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BorderStyleImpl <em>Border Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BorderStyleImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getBorderStyle()
   * @generated
   */
  int BORDER_STYLE = 59;

  /**
   * The feature id for the '<em><b>Dash Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_STYLE__DASH_STYLE = 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_STYLE__LOCATION = 1;

  /**
   * The feature id for the '<em><b>Miter Abs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_STYLE__MITER_ABS = 2;

  /**
   * The feature id for the '<em><b>Miter Predefined</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_STYLE__MITER_PREDEFINED = 3;

  /**
   * The feature id for the '<em><b>Line Cap</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_STYLE__LINE_CAP = 4;

  /**
   * The number of structural features of the '<em>Border Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BORDER_STYLE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.SizeFillImpl <em>Size Fill</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.SizeFillImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getSizeFill()
   * @generated
   */
  int SIZE_FILL = 60;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FILL__VALUE = 0;

  /**
   * The feature id for the '<em><b>Fill</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FILL__FILL = 1;

  /**
   * The number of structural features of the '<em>Size Fill</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_FILL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.ColorImpl <em>Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.ColorImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getColor()
   * @generated
   */
  int COLOR = 61;

  /**
   * The number of structural features of the '<em>Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE_COUNT = PAINT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.LookedUpColorImpl <em>Looked Up Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.LookedUpColorImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getLookedUpColor()
   * @generated
   */
  int LOOKED_UP_COLOR = 62;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKED_UP_COLOR__VALUE = COLOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Looked Up Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOKED_UP_COLOR_FEATURE_COUNT = COLOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.NamedColorImpl <em>Named Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.NamedColorImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getNamedColor()
   * @generated
   */
  int NAMED_COLOR = 63;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_COLOR__VALUE = COLOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_COLOR_FEATURE_COUNT = COLOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RGBColorImpl <em>RGB Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RGBColorImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getRGBColor()
   * @generated
   */
  int RGB_COLOR = 64;

  /**
   * The feature id for the '<em><b>Hexcolor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__HEXCOLOR = COLOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>R</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__R = COLOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>G</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__G = COLOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>B</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__B = COLOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Rp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__RP = COLOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Gp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__GP = COLOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Bp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__BP = COLOR_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Alpha</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR__ALPHA = COLOR_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>RGB Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RGB_COLOR_FEATURE_COUNT = COLOR_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.HSBColorImpl <em>HSB Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.HSBColorImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getHSBColor()
   * @generated
   */
  int HSB_COLOR = 65;

  /**
   * The feature id for the '<em><b>Hue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HSB_COLOR__HUE = COLOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Saturation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HSB_COLOR__SATURATION = COLOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Brightness</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HSB_COLOR__BRIGHTNESS = COLOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Alpha</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HSB_COLOR__ALPHA = COLOR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>HSB Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HSB_COLOR_FEATURE_COUNT = COLOR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.ColorFunctionImpl <em>Color Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.ColorFunctionImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getColorFunction()
   * @generated
   */
  int COLOR_FUNCTION = 66;

  /**
   * The feature id for the '<em><b>Orig</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FUNCTION__ORIG = COLOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mod</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FUNCTION__MOD = COLOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Stop Numbers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FUNCTION__STOP_NUMBERS = COLOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Stop Colors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FUNCTION__STOP_COLORS = COLOR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Color Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FUNCTION_FEATURE_COUNT = COLOR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.URLTypeImpl <em>URL Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.URLTypeImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getURLType()
   * @generated
   */
  int URL_TYPE = 67;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_TYPE__URL = 0;

  /**
   * The number of structural features of the '<em>URL Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.FONTImpl <em>FONT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.FONTImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getFONT()
   * @generated
   */
  int FONT = 68;

  /**
   * The feature id for the '<em><b>Style Or Weight String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT__STYLE_OR_WEIGHT_STRING = 0;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT__WEIGHT = 1;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT__SIZE = 2;

  /**
   * The feature id for the '<em><b>Family</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT__FAMILY = 3;

  /**
   * The number of structural features of the '<em>FONT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.FONTWEIGHTImpl <em>FONTWEIGHT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.FONTWEIGHTImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getFONTWEIGHT()
   * @generated
   */
  int FONTWEIGHT = 69;

  /**
   * The feature id for the '<em><b>Value String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONTWEIGHT__VALUE_STRING = 0;

  /**
   * The feature id for the '<em><b>Value Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONTWEIGHT__VALUE_INT = 1;

  /**
   * The number of structural features of the '<em>FONTWEIGHT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONTWEIGHT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.FONTSTYLEImpl <em>FONTSTYLE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.FONTSTYLEImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getFONTSTYLE()
   * @generated
   */
  int FONTSTYLE = 70;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONTSTYLE__VALUE = 0;

  /**
   * The number of structural features of the '<em>FONTSTYLE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONTSTYLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.SizeTypeImpl <em>Size Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.SizeTypeImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getSizeType()
   * @generated
   */
  int SIZE_TYPE = 71;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_TYPE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Size Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIZE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.HPosition <em>HPosition</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.HPosition
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getHPosition()
   * @generated
   */
  int HPOSITION = 72;


  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet <em>stylesheet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>stylesheet</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet
   * @generated
   */
  EClass getstylesheet();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet#getRuleset <em>Ruleset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ruleset</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet#getRuleset()
   * @see #getstylesheet()
   * @generated
   */
  EReference getstylesheet_Ruleset();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet#getMedia <em>Media</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Media</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet#getMedia()
   * @see #getstylesheet()
   * @generated
   */
  EReference getstylesheet_Media();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.media <em>media</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>media</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.media
   * @generated
   */
  EClass getmedia();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.media#getMedialist <em>Medialist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Medialist</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.media#getMedialist()
   * @see #getmedia()
   * @generated
   */
  EAttribute getmedia_Medialist();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.media#getRulesets <em>Rulesets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rulesets</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.media#getRulesets()
   * @see #getmedia()
   * @generated
   */
  EReference getmedia_Rulesets();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset <em>ruleset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ruleset</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset
   * @generated
   */
  EClass getruleset();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset#getSelectors <em>Selectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Selectors</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset#getSelectors()
   * @see #getruleset()
   * @generated
   */
  EReference getruleset_Selectors();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset#getDeclarations()
   * @see #getruleset()
   * @generated
   */
  EReference getruleset_Declarations();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.selector <em>selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>selector</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.selector
   * @generated
   */
  EClass getselector();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.selector#getSimpleselectors <em>Simpleselectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Simpleselectors</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.selector#getSimpleselectors()
   * @see #getselector()
   * @generated
   */
  EReference getselector_Simpleselectors();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.selector#getCombinator <em>Combinator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Combinator</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.selector#getCombinator()
   * @see #getselector()
   * @generated
   */
  EAttribute getselector_Combinator();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.selector#getSelector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selector</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.selector#getSelector()
   * @see #getselector()
   * @generated
   */
  EReference getselector_Selector();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector <em>simple selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>simple selector</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector
   * @generated
   */
  EClass getsimple_selector();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector#getElement()
   * @see #getsimple_selector()
   * @generated
   */
  EAttribute getsimple_selector_Element();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector#getId()
   * @see #getsimple_selector()
   * @generated
   */
  EAttribute getsimple_selector_Id();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector#getClass_()
   * @see #getsimple_selector()
   * @generated
   */
  EAttribute getsimple_selector_Class();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector#getPseudoclasses <em>Pseudoclasses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Pseudoclasses</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector#getPseudoclasses()
   * @see #getsimple_selector()
   * @generated
   */
  EAttribute getsimple_selector_Pseudoclasses();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration <em>css declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>css declaration</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration
   * @generated
   */
  EClass getcss_declaration();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration <em>css generic declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>css generic declaration</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration
   * @generated
   */
  EClass getcss_generic_declaration();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration#getProperty()
   * @see #getcss_generic_declaration()
   * @generated
   */
  EAttribute getcss_generic_declaration_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration#getExpression()
   * @see #getcss_generic_declaration()
   * @generated
   */
  EAttribute getcss_generic_declaration_Expression();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_fx_declaration <em>css fx declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>css fx declaration</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.css_fx_declaration
   * @generated
   */
  EClass getcss_fx_declaration();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_property <em>fx font property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx font property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_property
   * @generated
   */
  EClass getfx_font_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_property#getProperty()
   * @see #getfx_font_property()
   * @generated
   */
  EAttribute getfx_font_property_Property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_property#getValue()
   * @see #getfx_font_property()
   * @generated
   */
  EReference getfx_font_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_family_property <em>fx font family property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx font family property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_family_property
   * @generated
   */
  EClass getfx_font_family_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_family_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_family_property#getProperty()
   * @see #getfx_font_family_property()
   * @generated
   */
  EAttribute getfx_font_family_property_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_family_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_family_property#getValue()
   * @see #getfx_font_family_property()
   * @generated
   */
  EAttribute getfx_font_family_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_size_property <em>fx font size property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx font size property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_size_property
   * @generated
   */
  EClass getfx_font_size_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_size_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_size_property#getProperty()
   * @see #getfx_font_size_property()
   * @generated
   */
  EAttribute getfx_font_size_property_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_size_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_size_property#getValue()
   * @see #getfx_font_size_property()
   * @generated
   */
  EAttribute getfx_font_size_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_style_property <em>fx font style property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx font style property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_style_property
   * @generated
   */
  EClass getfx_font_style_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_style_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_style_property#getProperty()
   * @see #getfx_font_style_property()
   * @generated
   */
  EAttribute getfx_font_style_property_Property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_style_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_style_property#getValue()
   * @see #getfx_font_style_property()
   * @generated
   */
  EReference getfx_font_style_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_weight_property <em>fx font weight property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx font weight property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_weight_property
   * @generated
   */
  EClass getfx_font_weight_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_weight_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_weight_property#getProperty()
   * @see #getfx_font_weight_property()
   * @generated
   */
  EAttribute getfx_font_weight_property_Property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_weight_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_weight_property#getValue()
   * @see #getfx_font_weight_property()
   * @generated
   */
  EReference getfx_font_weight_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_cursor_property <em>fx cursor property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx cursor property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_cursor_property
   * @generated
   */
  EClass getfx_cursor_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_cursor_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_cursor_property#getProperty()
   * @see #getfx_cursor_property()
   * @generated
   */
  EAttribute getfx_cursor_property_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_cursor_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_cursor_property#getValue()
   * @see #getfx_cursor_property()
   * @generated
   */
  EAttribute getfx_cursor_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_effect_property <em>fx effect property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx effect property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_effect_property
   * @generated
   */
  EClass getfx_effect_property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_effect_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_effect_property#getValue()
   * @see #getfx_effect_property()
   * @generated
   */
  EReference getfx_effect_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_boolean_property <em>fx boolean property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx boolean property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_boolean_property
   * @generated
   */
  EClass getfx_boolean_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_boolean_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_boolean_property#getProperty()
   * @see #getfx_boolean_property()
   * @generated
   */
  EAttribute getfx_boolean_property_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_boolean_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_boolean_property#getValue()
   * @see #getfx_boolean_property()
   * @generated
   */
  EAttribute getfx_boolean_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_property <em>fx size property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx size property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_property
   * @generated
   */
  EClass getfx_size_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_property#getProperty()
   * @see #getfx_size_property()
   * @generated
   */
  EAttribute getfx_size_property_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_property#getValue()
   * @see #getfx_size_property()
   * @generated
   */
  EAttribute getfx_size_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_property <em>fx number property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx number property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_property
   * @generated
   */
  EClass getfx_number_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_property#getProperty()
   * @see #getfx_number_property()
   * @generated
   */
  EAttribute getfx_number_property_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_property#getValue()
   * @see #getfx_number_property()
   * @generated
   */
  EAttribute getfx_number_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_integer_property <em>fx integer property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx integer property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_integer_property
   * @generated
   */
  EClass getfx_integer_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_integer_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_integer_property#getProperty()
   * @see #getfx_integer_property()
   * @generated
   */
  EAttribute getfx_integer_property_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_integer_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_integer_property#getValue()
   * @see #getfx_integer_property()
   * @generated
   */
  EAttribute getfx_integer_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_property <em>fx paint property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx paint property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_property
   * @generated
   */
  EClass getfx_paint_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_property#getProperty()
   * @see #getfx_paint_property()
   * @generated
   */
  EAttribute getfx_paint_property_Property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_property#getValue()
   * @see #getfx_paint_property()
   * @generated
   */
  EReference getfx_paint_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_blend_property <em>fx blend property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx blend property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_blend_property
   * @generated
   */
  EClass getfx_blend_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_blend_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_blend_property#getProperty()
   * @see #getfx_blend_property()
   * @generated
   */
  EAttribute getfx_blend_property_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_blend_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_blend_property#getValue()
   * @see #getfx_blend_property()
   * @generated
   */
  EAttribute getfx_blend_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_property <em>fx url property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx url property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_property
   * @generated
   */
  EClass getfx_url_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_property#getProperty()
   * @see #getfx_url_property()
   * @generated
   */
  EAttribute getfx_url_property_Property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_property#getValue()
   * @see #getfx_url_property()
   * @generated
   */
  EReference getfx_url_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_properties <em>fx paint properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx paint properties</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_properties
   * @generated
   */
  EClass getfx_paint_properties();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_properties#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_properties#getProperty()
   * @see #getfx_paint_properties()
   * @generated
   */
  EAttribute getfx_paint_properties_Property();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_properties#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_properties#getValues()
   * @see #getfx_paint_properties()
   * @generated
   */
  EReference getfx_paint_properties_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_properties <em>fx multisize properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx multisize properties</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_properties
   * @generated
   */
  EClass getfx_multisize_properties();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_properties#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_properties#getProperty()
   * @see #getfx_multisize_properties()
   * @generated
   */
  EAttribute getfx_multisize_properties_Property();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_properties#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_properties#getValues()
   * @see #getfx_multisize_properties()
   * @generated
   */
  EReference getfx_multisize_properties_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_hposition_property <em>fx hposition property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx hposition property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_hposition_property
   * @generated
   */
  EClass getfx_hposition_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_hposition_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_hposition_property#getProperty()
   * @see #getfx_hposition_property()
   * @generated
   */
  EAttribute getfx_hposition_property_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_hposition_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_hposition_property#getValue()
   * @see #getfx_hposition_property()
   * @generated
   */
  EAttribute getfx_hposition_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_vposition_property <em>fx vposition property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx vposition property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_vposition_property
   * @generated
   */
  EClass getfx_vposition_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_vposition_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_vposition_property#getProperty()
   * @see #getfx_vposition_property()
   * @generated
   */
  EAttribute getfx_vposition_property_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_vposition_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_vposition_property#getValue()
   * @see #getfx_vposition_property()
   * @generated
   */
  EAttribute getfx_vposition_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_side_property <em>fx side property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx side property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_side_property
   * @generated
   */
  EClass getfx_side_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_side_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_side_property#getProperty()
   * @see #getfx_side_property()
   * @generated
   */
  EAttribute getfx_side_property_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_side_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_side_property#getValue()
   * @see #getfx_side_property()
   * @generated
   */
  EAttribute getfx_side_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_bar_policy_property <em>fx bar policy property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx bar policy property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_bar_policy_property
   * @generated
   */
  EClass getfx_bar_policy_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_bar_policy_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_bar_policy_property#getProperty()
   * @see #getfx_bar_policy_property()
   * @generated
   */
  EAttribute getfx_bar_policy_property_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_bar_policy_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_bar_policy_property#getValue()
   * @see #getfx_bar_policy_property()
   * @generated
   */
  EAttribute getfx_bar_policy_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_properties <em>fx url properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx url properties</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_properties
   * @generated
   */
  EClass getfx_url_properties();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_properties#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_properties#getProperty()
   * @see #getfx_url_properties()
   * @generated
   */
  EAttribute getfx_url_properties_Property();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_properties#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_properties#getValues()
   * @see #getfx_url_properties()
   * @generated
   */
  EReference getfx_url_properties_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_repeat_properties <em>fx repeat properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx repeat properties</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_repeat_properties
   * @generated
   */
  EClass getfx_repeat_properties();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_repeat_properties#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_repeat_properties#getProperty()
   * @see #getfx_repeat_properties()
   * @generated
   */
  EAttribute getfx_repeat_properties_Property();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_repeat_properties#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_repeat_properties#getValues()
   * @see #getfx_repeat_properties()
   * @generated
   */
  EReference getfx_repeat_properties_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_property <em>fx multisize property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx multisize property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_property
   * @generated
   */
  EClass getfx_multisize_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_property#getProperty()
   * @see #getfx_multisize_property()
   * @generated
   */
  EAttribute getfx_multisize_property_Property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_property#getValue()
   * @see #getfx_multisize_property()
   * @generated
   */
  EReference getfx_multisize_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_properties <em>fx size properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx size properties</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_properties
   * @generated
   */
  EClass getfx_size_properties();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_properties#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_properties#getProperty()
   * @see #getfx_size_properties()
   * @generated
   */
  EAttribute getfx_size_properties_Property();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_properties#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_properties#getValues()
   * @see #getfx_size_properties()
   * @generated
   */
  EAttribute getfx_size_properties_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_cap_property <em>fx stroke line cap property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx stroke line cap property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_cap_property
   * @generated
   */
  EClass getfx_stroke_line_cap_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_cap_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_cap_property#getProperty()
   * @see #getfx_stroke_line_cap_property()
   * @generated
   */
  EAttribute getfx_stroke_line_cap_property_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_cap_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_cap_property#getValue()
   * @see #getfx_stroke_line_cap_property()
   * @generated
   */
  EAttribute getfx_stroke_line_cap_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_join_property <em>fx stroke line join property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx stroke line join property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_join_property
   * @generated
   */
  EClass getfx_stroke_line_join_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_join_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_join_property#getProperty()
   * @see #getfx_stroke_line_join_property()
   * @generated
   */
  EAttribute getfx_stroke_line_join_property_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_join_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_join_property#getValue()
   * @see #getfx_stroke_line_join_property()
   * @generated
   */
  EAttribute getfx_stroke_line_join_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_alignment_property <em>fx alignment property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx alignment property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_alignment_property
   * @generated
   */
  EClass getfx_alignment_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_alignment_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_alignment_property#getProperty()
   * @see #getfx_alignment_property()
   * @generated
   */
  EAttribute getfx_alignment_property_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_alignment_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_alignment_property#getValue()
   * @see #getfx_alignment_property()
   * @generated
   */
  EAttribute getfx_alignment_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_origin_property <em>fx text origin property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx text origin property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_origin_property
   * @generated
   */
  EClass getfx_text_origin_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_origin_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_origin_property#getProperty()
   * @see #getfx_text_origin_property()
   * @generated
   */
  EAttribute getfx_text_origin_property_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_origin_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_origin_property#getValue()
   * @see #getfx_text_origin_property()
   * @generated
   */
  EAttribute getfx_text_origin_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_position_property <em>fx position property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx position property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_position_property
   * @generated
   */
  EClass getfx_position_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_position_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_position_property#getProperty()
   * @see #getfx_position_property()
   * @generated
   */
  EAttribute getfx_position_property_Property();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_position_property#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_position_property#getValues()
   * @see #getfx_position_property()
   * @generated
   */
  EReference getfx_position_property_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_background_image_size_property <em>fx background image size property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx background image size property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_background_image_size_property
   * @generated
   */
  EClass getfx_background_image_size_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_background_image_size_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_background_image_size_property#getProperty()
   * @see #getfx_background_image_size_property()
   * @generated
   */
  EAttribute getfx_background_image_size_property_Property();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_background_image_size_property#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_background_image_size_property#getValues()
   * @see #getfx_background_image_size_property()
   * @generated
   */
  EReference getfx_background_image_size_property_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_style_property <em>fx border style property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx border style property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_style_property
   * @generated
   */
  EClass getfx_border_style_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_style_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_style_property#getProperty()
   * @see #getfx_border_style_property()
   * @generated
   */
  EAttribute getfx_border_style_property_Property();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_style_property#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_style_property#getValues()
   * @see #getfx_border_style_property()
   * @generated
   */
  EReference getfx_border_style_property_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_image_slice_property <em>fx border image slice property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx border image slice property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_image_slice_property
   * @generated
   */
  EClass getfx_border_image_slice_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_image_slice_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_image_slice_property#getProperty()
   * @see #getfx_border_image_slice_property()
   * @generated
   */
  EAttribute getfx_border_image_slice_property_Property();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_image_slice_property#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_image_slice_property#getValues()
   * @see #getfx_border_image_slice_property()
   * @generated
   */
  EReference getfx_border_image_slice_property_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_overrun_property <em>fx text overrun property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx text overrun property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_overrun_property
   * @generated
   */
  EClass getfx_text_overrun_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_overrun_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_overrun_property#getProperty()
   * @see #getfx_text_overrun_property()
   * @generated
   */
  EAttribute getfx_text_overrun_property_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_overrun_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_overrun_property#getValue()
   * @see #getfx_text_overrun_property()
   * @generated
   */
  EAttribute getfx_text_overrun_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_insets_property <em>fx insets property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx insets property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_insets_property
   * @generated
   */
  EClass getfx_insets_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_insets_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_insets_property#getProperty()
   * @see #getfx_insets_property()
   * @generated
   */
  EAttribute getfx_insets_property_Property();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_insets_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_insets_property#getValue()
   * @see #getfx_insets_property()
   * @generated
   */
  EAttribute getfx_insets_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_properties <em>fx number properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx number properties</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_properties
   * @generated
   */
  EClass getfx_number_properties();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_properties#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_properties#getProperty()
   * @see #getfx_number_properties()
   * @generated
   */
  EAttribute getfx_number_properties_Property();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_properties#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_properties#getValue()
   * @see #getfx_number_properties()
   * @generated
   */
  EAttribute getfx_number_properties_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multi_paint_properties <em>fx multi paint properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx multi paint properties</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multi_paint_properties
   * @generated
   */
  EClass getfx_multi_paint_properties();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multi_paint_properties#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multi_paint_properties#getProperty()
   * @see #getfx_multi_paint_properties()
   * @generated
   */
  EAttribute getfx_multi_paint_properties_Property();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multi_paint_properties#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multi_paint_properties#getValues()
   * @see #getfx_multi_paint_properties()
   * @generated
   */
  EReference getfx_multi_paint_properties_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_string_property <em>fx string property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx string property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_string_property
   * @generated
   */
  EClass getfx_string_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_string_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_string_property#getProperty()
   * @see #getfx_string_property()
   * @generated
   */
  EAttribute getfx_string_property_Property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_string_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_string_property#getValue()
   * @see #getfx_string_property()
   * @generated
   */
  EAttribute getfx_string_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Effect <em>Effect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effect</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.Effect
   * @generated
   */
  EClass getEffect();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getBlur <em>Blur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Blur</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getBlur()
   * @see #getEffect()
   * @generated
   */
  EAttribute getEffect_Blur();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getColor()
   * @see #getEffect()
   * @generated
   */
  EReference getEffect_Color();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getBlurRadius <em>Blur Radius</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Blur Radius</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getBlurRadius()
   * @see #getEffect()
   * @generated
   */
  EAttribute getEffect_BlurRadius();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getOffsetX <em>Offset X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Offset X</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getOffsetX()
   * @see #getEffect()
   * @generated
   */
  EAttribute getEffect_OffsetX();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getOffsetY <em>Offset Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Offset Y</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getOffsetY()
   * @see #getEffect()
   * @generated
   */
  EAttribute getEffect_OffsetY();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.EffectDropShadow <em>Effect Drop Shadow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effect Drop Shadow</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.EffectDropShadow
   * @generated
   */
  EClass getEffectDropShadow();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.EffectDropShadow#getSpread <em>Spread</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Spread</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.EffectDropShadow#getSpread()
   * @see #getEffectDropShadow()
   * @generated
   */
  EAttribute getEffectDropShadow_Spread();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.EffectInnerShadow <em>Effect Inner Shadow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Effect Inner Shadow</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.EffectInnerShadow
   * @generated
   */
  EClass getEffectInnerShadow();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.EffectInnerShadow#getChoke <em>Choke</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Choke</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.EffectInnerShadow#getChoke()
   * @see #getEffectInnerShadow()
   * @generated
   */
  EAttribute getEffectInnerShadow_Choke();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.MultiPaint <em>Multi Paint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Paint</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.MultiPaint
   * @generated
   */
  EClass getMultiPaint();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.MultiPaint#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.MultiPaint#getValues()
   * @see #getMultiPaint()
   * @generated
   */
  EReference getMultiPaint_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Paint <em>Paint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paint</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.Paint
   * @generated
   */
  EClass getPaint();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient <em>Linear Gradient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Linear Gradient</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient
   * @generated
   */
  EClass getLinearGradient();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient#getStart()
   * @see #getLinearGradient()
   * @generated
   */
  EReference getLinearGradient_Start();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient#getEnd()
   * @see #getLinearGradient()
   * @generated
   */
  EReference getLinearGradient_End();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient#getStops <em>Stops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stops</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient#getStops()
   * @see #getLinearGradient()
   * @generated
   */
  EReference getLinearGradient_Stops();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient <em>Radial Gradient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Radial Gradient</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient
   * @generated
   */
  EClass getRadialGradient();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient#getCenter <em>Center</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Center</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient#getCenter()
   * @see #getRadialGradient()
   * @generated
   */
  EReference getRadialGradient_Center();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient#getRadius <em>Radius</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Radius</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient#getRadius()
   * @see #getRadialGradient()
   * @generated
   */
  EReference getRadialGradient_Radius();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient#getFocus <em>Focus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Focus</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient#getFocus()
   * @see #getRadialGradient()
   * @generated
   */
  EReference getRadialGradient_Focus();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient#getStops <em>Stops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stops</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient#getStops()
   * @see #getRadialGradient()
   * @generated
   */
  EReference getRadialGradient_Stops();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.StopValue <em>Stop Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stop Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.StopValue
   * @generated
   */
  EClass getStopValue();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.StopValue#getPos <em>Pos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pos</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.StopValue#getPos()
   * @see #getStopValue()
   * @generated
   */
  EReference getStopValue_Pos();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.StopValue#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.StopValue#getColor()
   * @see #getStopValue()
   * @generated
   */
  EReference getStopValue_Color();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.PointValue <em>Point Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.PointValue
   * @generated
   */
  EClass getPointValue();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.PointValue#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>X</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.PointValue#getX()
   * @see #getPointValue()
   * @generated
   */
  EReference getPointValue_X();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.PointValue#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Y</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.PointValue#getY()
   * @see #getPointValue()
   * @generated
   */
  EReference getPointValue_Y();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RepeatStyle <em>Repeat Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repeat Style</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RepeatStyle
   * @generated
   */
  EClass getRepeatStyle();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RepeatStyle#getV <em>V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>V</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RepeatStyle#getV()
   * @see #getRepeatStyle()
   * @generated
   */
  EAttribute getRepeatStyle_V();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RepeatStyle#getV2 <em>V2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>V2</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RepeatStyle#getV2()
   * @see #getRepeatStyle()
   * @generated
   */
  EAttribute getRepeatStyle_V2();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Dim4Size <em>Dim4 Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dim4 Size</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.Dim4Size
   * @generated
   */
  EClass getDim4Size();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Dim4Size#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.Dim4Size#getValues()
   * @see #getDim4Size()
   * @generated
   */
  EAttribute getDim4Size_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.BgPosition <em>Bg Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bg Position</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.BgPosition
   * @generated
   */
  EClass getBgPosition();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.BgPosition#getAbsx <em>Absx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Absx</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.BgPosition#getAbsx()
   * @see #getBgPosition()
   * @generated
   */
  EAttribute getBgPosition_Absx();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.BgPosition#getRelx <em>Relx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Relx</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.BgPosition#getRelx()
   * @see #getBgPosition()
   * @generated
   */
  EAttribute getBgPosition_Relx();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.BgPosition#getAbsy <em>Absy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Absy</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.BgPosition#getAbsy()
   * @see #getBgPosition()
   * @generated
   */
  EAttribute getBgPosition_Absy();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.BgPosition#getRely <em>Rely</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rely</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.BgPosition#getRely()
   * @see #getBgPosition()
   * @generated
   */
  EAttribute getBgPosition_Rely();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_color_property <em>fx color property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>fx color property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_color_property
   * @generated
   */
  EClass getfx_color_property();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_color_property#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_color_property#getProperty()
   * @see #getfx_color_property()
   * @generated
   */
  EAttribute getfx_color_property_Property();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.fx_color_property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.fx_color_property#getValue()
   * @see #getfx_color_property()
   * @generated
   */
  EReference getfx_color_property_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.BgSize <em>Bg Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bg Size</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.BgSize
   * @generated
   */
  EClass getBgSize();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.BgSize#getXsize <em>Xsize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Xsize</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.BgSize#getXsize()
   * @see #getBgSize()
   * @generated
   */
  EAttribute getBgSize_Xsize();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.BgSize#getYsize <em>Ysize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ysize</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.BgSize#getYsize()
   * @see #getBgSize()
   * @generated
   */
  EAttribute getBgSize_Ysize();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.BgSize#getPredefined <em>Predefined</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Predefined</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.BgSize#getPredefined()
   * @see #getBgSize()
   * @generated
   */
  EAttribute getBgSize_Predefined();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.BorderStyle <em>Border Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Border Style</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.BorderStyle
   * @generated
   */
  EClass getBorderStyle();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.BorderStyle#getDashStyle <em>Dash Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dash Style</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.BorderStyle#getDashStyle()
   * @see #getBorderStyle()
   * @generated
   */
  EAttribute getBorderStyle_DashStyle();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.BorderStyle#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.BorderStyle#getLocation()
   * @see #getBorderStyle()
   * @generated
   */
  EAttribute getBorderStyle_Location();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.BorderStyle#getMiterAbs <em>Miter Abs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Miter Abs</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.BorderStyle#getMiterAbs()
   * @see #getBorderStyle()
   * @generated
   */
  EAttribute getBorderStyle_MiterAbs();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.BorderStyle#getMiterPredefined <em>Miter Predefined</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Miter Predefined</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.BorderStyle#getMiterPredefined()
   * @see #getBorderStyle()
   * @generated
   */
  EAttribute getBorderStyle_MiterPredefined();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.BorderStyle#getLineCap <em>Line Cap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Line Cap</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.BorderStyle#getLineCap()
   * @see #getBorderStyle()
   * @generated
   */
  EAttribute getBorderStyle_LineCap();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.SizeFill <em>Size Fill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size Fill</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.SizeFill
   * @generated
   */
  EClass getSizeFill();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.SizeFill#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.SizeFill#getValue()
   * @see #getSizeFill()
   * @generated
   */
  EReference getSizeFill_Value();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.SizeFill#getFill <em>Fill</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fill</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.SizeFill#getFill()
   * @see #getSizeFill()
   * @generated
   */
  EAttribute getSizeFill_Fill();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.Color
   * @generated
   */
  EClass getColor();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.LookedUpColor <em>Looked Up Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Looked Up Color</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.LookedUpColor
   * @generated
   */
  EClass getLookedUpColor();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.LookedUpColor#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.LookedUpColor#getValue()
   * @see #getLookedUpColor()
   * @generated
   */
  EAttribute getLookedUpColor_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.NamedColor <em>Named Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Color</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.NamedColor
   * @generated
   */
  EClass getNamedColor();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.NamedColor#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.NamedColor#getValue()
   * @see #getNamedColor()
   * @generated
   */
  EAttribute getNamedColor_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor <em>RGB Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RGB Color</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor
   * @generated
   */
  EClass getRGBColor();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor#getHexcolor <em>Hexcolor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hexcolor</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor#getHexcolor()
   * @see #getRGBColor()
   * @generated
   */
  EAttribute getRGBColor_Hexcolor();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor#getR <em>R</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>R</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor#getR()
   * @see #getRGBColor()
   * @generated
   */
  EAttribute getRGBColor_R();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor#getG <em>G</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>G</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor#getG()
   * @see #getRGBColor()
   * @generated
   */
  EAttribute getRGBColor_G();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>B</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor#getB()
   * @see #getRGBColor()
   * @generated
   */
  EAttribute getRGBColor_B();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor#getRp <em>Rp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rp</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor#getRp()
   * @see #getRGBColor()
   * @generated
   */
  EAttribute getRGBColor_Rp();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor#getGp <em>Gp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Gp</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor#getGp()
   * @see #getRGBColor()
   * @generated
   */
  EAttribute getRGBColor_Gp();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor#getBp <em>Bp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bp</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor#getBp()
   * @see #getRGBColor()
   * @generated
   */
  EAttribute getRGBColor_Bp();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor#getAlpha <em>Alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alpha</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor#getAlpha()
   * @see #getRGBColor()
   * @generated
   */
  EAttribute getRGBColor_Alpha();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.HSBColor <em>HSB Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HSB Color</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.HSBColor
   * @generated
   */
  EClass getHSBColor();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.HSBColor#getHue <em>Hue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hue</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.HSBColor#getHue()
   * @see #getHSBColor()
   * @generated
   */
  EAttribute getHSBColor_Hue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.HSBColor#getSaturation <em>Saturation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Saturation</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.HSBColor#getSaturation()
   * @see #getHSBColor()
   * @generated
   */
  EAttribute getHSBColor_Saturation();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.HSBColor#getBrightness <em>Brightness</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Brightness</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.HSBColor#getBrightness()
   * @see #getHSBColor()
   * @generated
   */
  EAttribute getHSBColor_Brightness();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.HSBColor#getAlpha <em>Alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alpha</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.HSBColor#getAlpha()
   * @see #getHSBColor()
   * @generated
   */
  EAttribute getHSBColor_Alpha();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction <em>Color Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color Function</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction
   * @generated
   */
  EClass getColorFunction();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction#getOrig <em>Orig</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Orig</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction#getOrig()
   * @see #getColorFunction()
   * @generated
   */
  EReference getColorFunction_Orig();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction#getMod <em>Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mod</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction#getMod()
   * @see #getColorFunction()
   * @generated
   */
  EAttribute getColorFunction_Mod();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction#getStopNumbers <em>Stop Numbers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Stop Numbers</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction#getStopNumbers()
   * @see #getColorFunction()
   * @generated
   */
  EAttribute getColorFunction_StopNumbers();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction#getStopColors <em>Stop Colors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stop Colors</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction#getStopColors()
   * @see #getColorFunction()
   * @generated
   */
  EReference getColorFunction_StopColors();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.URLType <em>URL Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>URL Type</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.URLType
   * @generated
   */
  EClass getURLType();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.URLType#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.URLType#getUrl()
   * @see #getURLType()
   * @generated
   */
  EAttribute getURLType_Url();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.FONT <em>FONT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FONT</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.FONT
   * @generated
   */
  EClass getFONT();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.FONT#getStyleOrWeightString <em>Style Or Weight String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style Or Weight String</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.FONT#getStyleOrWeightString()
   * @see #getFONT()
   * @generated
   */
  EAttribute getFONT_StyleOrWeightString();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.FONT#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.FONT#getWeight()
   * @see #getFONT()
   * @generated
   */
  EAttribute getFONT_Weight();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.FONT#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.FONT#getSize()
   * @see #getFONT()
   * @generated
   */
  EAttribute getFONT_Size();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.FONT#getFamily <em>Family</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Family</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.FONT#getFamily()
   * @see #getFONT()
   * @generated
   */
  EAttribute getFONT_Family();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.FONTWEIGHT <em>FONTWEIGHT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FONTWEIGHT</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.FONTWEIGHT
   * @generated
   */
  EClass getFONTWEIGHT();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.FONTWEIGHT#getValueString <em>Value String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value String</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.FONTWEIGHT#getValueString()
   * @see #getFONTWEIGHT()
   * @generated
   */
  EAttribute getFONTWEIGHT_ValueString();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.FONTWEIGHT#getValueInt <em>Value Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Int</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.FONTWEIGHT#getValueInt()
   * @see #getFONTWEIGHT()
   * @generated
   */
  EAttribute getFONTWEIGHT_ValueInt();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.FONTSTYLE <em>FONTSTYLE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FONTSTYLE</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.FONTSTYLE
   * @generated
   */
  EClass getFONTSTYLE();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.FONTSTYLE#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.FONTSTYLE#getValue()
   * @see #getFONTSTYLE()
   * @generated
   */
  EAttribute getFONTSTYLE_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.SizeType <em>Size Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Size Type</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.SizeType
   * @generated
   */
  EClass getSizeType();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.SizeType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.SizeType#getValue()
   * @see #getSizeType()
   * @generated
   */
  EAttribute getSizeType_Value();

  /**
   * Returns the meta object for enum '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.HPosition <em>HPosition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>HPosition</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.HPosition
   * @generated
   */
  EEnum getHPosition();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CssDslFactory getCssDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.stylesheetImpl <em>stylesheet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.stylesheetImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getstylesheet()
     * @generated
     */
    EClass STYLESHEET = eINSTANCE.getstylesheet();

    /**
     * The meta object literal for the '<em><b>Ruleset</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLESHEET__RULESET = eINSTANCE.getstylesheet_Ruleset();

    /**
     * The meta object literal for the '<em><b>Media</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLESHEET__MEDIA = eINSTANCE.getstylesheet_Media();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.mediaImpl <em>media</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.mediaImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getmedia()
     * @generated
     */
    EClass MEDIA = eINSTANCE.getmedia();

    /**
     * The meta object literal for the '<em><b>Medialist</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEDIA__MEDIALIST = eINSTANCE.getmedia_Medialist();

    /**
     * The meta object literal for the '<em><b>Rulesets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEDIA__RULESETS = eINSTANCE.getmedia_Rulesets();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.rulesetImpl <em>ruleset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.rulesetImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getruleset()
     * @generated
     */
    EClass RULESET = eINSTANCE.getruleset();

    /**
     * The meta object literal for the '<em><b>Selectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULESET__SELECTORS = eINSTANCE.getruleset_Selectors();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULESET__DECLARATIONS = eINSTANCE.getruleset_Declarations();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.selectorImpl <em>selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.selectorImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getselector()
     * @generated
     */
    EClass SELECTOR = eINSTANCE.getselector();

    /**
     * The meta object literal for the '<em><b>Simpleselectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTOR__SIMPLESELECTORS = eINSTANCE.getselector_Simpleselectors();

    /**
     * The meta object literal for the '<em><b>Combinator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECTOR__COMBINATOR = eINSTANCE.getselector_Combinator();

    /**
     * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTOR__SELECTOR = eINSTANCE.getselector_Selector();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.simple_selectorImpl <em>simple selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.simple_selectorImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getsimple_selector()
     * @generated
     */
    EClass SIMPLE_SELECTOR = eINSTANCE.getsimple_selector();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_SELECTOR__ELEMENT = eINSTANCE.getsimple_selector_Element();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_SELECTOR__ID = eINSTANCE.getsimple_selector_Id();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_SELECTOR__CLASS = eINSTANCE.getsimple_selector_Class();

    /**
     * The meta object literal for the '<em><b>Pseudoclasses</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_SELECTOR__PSEUDOCLASSES = eINSTANCE.getsimple_selector_Pseudoclasses();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.css_declarationImpl <em>css declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.css_declarationImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getcss_declaration()
     * @generated
     */
    EClass CSS_DECLARATION = eINSTANCE.getcss_declaration();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.css_generic_declarationImpl <em>css generic declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.css_generic_declarationImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getcss_generic_declaration()
     * @generated
     */
    EClass CSS_GENERIC_DECLARATION = eINSTANCE.getcss_generic_declaration();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_GENERIC_DECLARATION__PROPERTY = eINSTANCE.getcss_generic_declaration_Property();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_GENERIC_DECLARATION__EXPRESSION = eINSTANCE.getcss_generic_declaration_Expression();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.css_fx_declarationImpl <em>css fx declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.css_fx_declarationImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getcss_fx_declaration()
     * @generated
     */
    EClass CSS_FX_DECLARATION = eINSTANCE.getcss_fx_declaration();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_propertyImpl <em>fx font property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_font_property()
     * @generated
     */
    EClass FX_FONT_PROPERTY = eINSTANCE.getfx_font_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_FONT_PROPERTY__PROPERTY = eINSTANCE.getfx_font_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_FONT_PROPERTY__VALUE = eINSTANCE.getfx_font_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_family_propertyImpl <em>fx font family property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_family_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_font_family_property()
     * @generated
     */
    EClass FX_FONT_FAMILY_PROPERTY = eINSTANCE.getfx_font_family_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_FONT_FAMILY_PROPERTY__PROPERTY = eINSTANCE.getfx_font_family_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_FONT_FAMILY_PROPERTY__VALUE = eINSTANCE.getfx_font_family_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_size_propertyImpl <em>fx font size property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_size_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_font_size_property()
     * @generated
     */
    EClass FX_FONT_SIZE_PROPERTY = eINSTANCE.getfx_font_size_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_FONT_SIZE_PROPERTY__PROPERTY = eINSTANCE.getfx_font_size_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_FONT_SIZE_PROPERTY__VALUE = eINSTANCE.getfx_font_size_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_style_propertyImpl <em>fx font style property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_style_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_font_style_property()
     * @generated
     */
    EClass FX_FONT_STYLE_PROPERTY = eINSTANCE.getfx_font_style_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_FONT_STYLE_PROPERTY__PROPERTY = eINSTANCE.getfx_font_style_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_FONT_STYLE_PROPERTY__VALUE = eINSTANCE.getfx_font_style_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_weight_propertyImpl <em>fx font weight property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_font_weight_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_font_weight_property()
     * @generated
     */
    EClass FX_FONT_WEIGHT_PROPERTY = eINSTANCE.getfx_font_weight_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_FONT_WEIGHT_PROPERTY__PROPERTY = eINSTANCE.getfx_font_weight_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_FONT_WEIGHT_PROPERTY__VALUE = eINSTANCE.getfx_font_weight_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_cursor_propertyImpl <em>fx cursor property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_cursor_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_cursor_property()
     * @generated
     */
    EClass FX_CURSOR_PROPERTY = eINSTANCE.getfx_cursor_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_CURSOR_PROPERTY__PROPERTY = eINSTANCE.getfx_cursor_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_CURSOR_PROPERTY__VALUE = eINSTANCE.getfx_cursor_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_effect_propertyImpl <em>fx effect property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_effect_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_effect_property()
     * @generated
     */
    EClass FX_EFFECT_PROPERTY = eINSTANCE.getfx_effect_property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_EFFECT_PROPERTY__VALUE = eINSTANCE.getfx_effect_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_boolean_propertyImpl <em>fx boolean property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_boolean_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_boolean_property()
     * @generated
     */
    EClass FX_BOOLEAN_PROPERTY = eINSTANCE.getfx_boolean_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_BOOLEAN_PROPERTY__PROPERTY = eINSTANCE.getfx_boolean_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_BOOLEAN_PROPERTY__VALUE = eINSTANCE.getfx_boolean_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_size_propertyImpl <em>fx size property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_size_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_size_property()
     * @generated
     */
    EClass FX_SIZE_PROPERTY = eINSTANCE.getfx_size_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_SIZE_PROPERTY__PROPERTY = eINSTANCE.getfx_size_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_SIZE_PROPERTY__VALUE = eINSTANCE.getfx_size_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_number_propertyImpl <em>fx number property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_number_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_number_property()
     * @generated
     */
    EClass FX_NUMBER_PROPERTY = eINSTANCE.getfx_number_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_NUMBER_PROPERTY__PROPERTY = eINSTANCE.getfx_number_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_NUMBER_PROPERTY__VALUE = eINSTANCE.getfx_number_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_integer_propertyImpl <em>fx integer property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_integer_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_integer_property()
     * @generated
     */
    EClass FX_INTEGER_PROPERTY = eINSTANCE.getfx_integer_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_INTEGER_PROPERTY__PROPERTY = eINSTANCE.getfx_integer_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_INTEGER_PROPERTY__VALUE = eINSTANCE.getfx_integer_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_paint_propertyImpl <em>fx paint property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_paint_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_paint_property()
     * @generated
     */
    EClass FX_PAINT_PROPERTY = eINSTANCE.getfx_paint_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_PAINT_PROPERTY__PROPERTY = eINSTANCE.getfx_paint_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_PAINT_PROPERTY__VALUE = eINSTANCE.getfx_paint_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_blend_propertyImpl <em>fx blend property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_blend_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_blend_property()
     * @generated
     */
    EClass FX_BLEND_PROPERTY = eINSTANCE.getfx_blend_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_BLEND_PROPERTY__PROPERTY = eINSTANCE.getfx_blend_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_BLEND_PROPERTY__VALUE = eINSTANCE.getfx_blend_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_url_propertyImpl <em>fx url property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_url_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_url_property()
     * @generated
     */
    EClass FX_URL_PROPERTY = eINSTANCE.getfx_url_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_URL_PROPERTY__PROPERTY = eINSTANCE.getfx_url_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_URL_PROPERTY__VALUE = eINSTANCE.getfx_url_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_paint_propertiesImpl <em>fx paint properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_paint_propertiesImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_paint_properties()
     * @generated
     */
    EClass FX_PAINT_PROPERTIES = eINSTANCE.getfx_paint_properties();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_PAINT_PROPERTIES__PROPERTY = eINSTANCE.getfx_paint_properties_Property();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_PAINT_PROPERTIES__VALUES = eINSTANCE.getfx_paint_properties_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_multisize_propertiesImpl <em>fx multisize properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_multisize_propertiesImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_multisize_properties()
     * @generated
     */
    EClass FX_MULTISIZE_PROPERTIES = eINSTANCE.getfx_multisize_properties();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_MULTISIZE_PROPERTIES__PROPERTY = eINSTANCE.getfx_multisize_properties_Property();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_MULTISIZE_PROPERTIES__VALUES = eINSTANCE.getfx_multisize_properties_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_hposition_propertyImpl <em>fx hposition property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_hposition_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_hposition_property()
     * @generated
     */
    EClass FX_HPOSITION_PROPERTY = eINSTANCE.getfx_hposition_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_HPOSITION_PROPERTY__PROPERTY = eINSTANCE.getfx_hposition_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_HPOSITION_PROPERTY__VALUE = eINSTANCE.getfx_hposition_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_vposition_propertyImpl <em>fx vposition property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_vposition_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_vposition_property()
     * @generated
     */
    EClass FX_VPOSITION_PROPERTY = eINSTANCE.getfx_vposition_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_VPOSITION_PROPERTY__PROPERTY = eINSTANCE.getfx_vposition_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_VPOSITION_PROPERTY__VALUE = eINSTANCE.getfx_vposition_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_side_propertyImpl <em>fx side property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_side_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_side_property()
     * @generated
     */
    EClass FX_SIDE_PROPERTY = eINSTANCE.getfx_side_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_SIDE_PROPERTY__PROPERTY = eINSTANCE.getfx_side_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_SIDE_PROPERTY__VALUE = eINSTANCE.getfx_side_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_bar_policy_propertyImpl <em>fx bar policy property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_bar_policy_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_bar_policy_property()
     * @generated
     */
    EClass FX_BAR_POLICY_PROPERTY = eINSTANCE.getfx_bar_policy_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_BAR_POLICY_PROPERTY__PROPERTY = eINSTANCE.getfx_bar_policy_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_BAR_POLICY_PROPERTY__VALUE = eINSTANCE.getfx_bar_policy_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_url_propertiesImpl <em>fx url properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_url_propertiesImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_url_properties()
     * @generated
     */
    EClass FX_URL_PROPERTIES = eINSTANCE.getfx_url_properties();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_URL_PROPERTIES__PROPERTY = eINSTANCE.getfx_url_properties_Property();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_URL_PROPERTIES__VALUES = eINSTANCE.getfx_url_properties_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_repeat_propertiesImpl <em>fx repeat properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_repeat_propertiesImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_repeat_properties()
     * @generated
     */
    EClass FX_REPEAT_PROPERTIES = eINSTANCE.getfx_repeat_properties();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_REPEAT_PROPERTIES__PROPERTY = eINSTANCE.getfx_repeat_properties_Property();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_REPEAT_PROPERTIES__VALUES = eINSTANCE.getfx_repeat_properties_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_multisize_propertyImpl <em>fx multisize property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_multisize_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_multisize_property()
     * @generated
     */
    EClass FX_MULTISIZE_PROPERTY = eINSTANCE.getfx_multisize_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_MULTISIZE_PROPERTY__PROPERTY = eINSTANCE.getfx_multisize_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_MULTISIZE_PROPERTY__VALUE = eINSTANCE.getfx_multisize_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_size_propertiesImpl <em>fx size properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_size_propertiesImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_size_properties()
     * @generated
     */
    EClass FX_SIZE_PROPERTIES = eINSTANCE.getfx_size_properties();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_SIZE_PROPERTIES__PROPERTY = eINSTANCE.getfx_size_properties_Property();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_SIZE_PROPERTIES__VALUES = eINSTANCE.getfx_size_properties_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_stroke_line_cap_propertyImpl <em>fx stroke line cap property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_stroke_line_cap_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_stroke_line_cap_property()
     * @generated
     */
    EClass FX_STROKE_LINE_CAP_PROPERTY = eINSTANCE.getfx_stroke_line_cap_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_STROKE_LINE_CAP_PROPERTY__PROPERTY = eINSTANCE.getfx_stroke_line_cap_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_STROKE_LINE_CAP_PROPERTY__VALUE = eINSTANCE.getfx_stroke_line_cap_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_stroke_line_join_propertyImpl <em>fx stroke line join property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_stroke_line_join_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_stroke_line_join_property()
     * @generated
     */
    EClass FX_STROKE_LINE_JOIN_PROPERTY = eINSTANCE.getfx_stroke_line_join_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_STROKE_LINE_JOIN_PROPERTY__PROPERTY = eINSTANCE.getfx_stroke_line_join_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_STROKE_LINE_JOIN_PROPERTY__VALUE = eINSTANCE.getfx_stroke_line_join_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_alignment_propertyImpl <em>fx alignment property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_alignment_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_alignment_property()
     * @generated
     */
    EClass FX_ALIGNMENT_PROPERTY = eINSTANCE.getfx_alignment_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_ALIGNMENT_PROPERTY__PROPERTY = eINSTANCE.getfx_alignment_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_ALIGNMENT_PROPERTY__VALUE = eINSTANCE.getfx_alignment_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_text_origin_propertyImpl <em>fx text origin property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_text_origin_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_text_origin_property()
     * @generated
     */
    EClass FX_TEXT_ORIGIN_PROPERTY = eINSTANCE.getfx_text_origin_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_TEXT_ORIGIN_PROPERTY__PROPERTY = eINSTANCE.getfx_text_origin_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_TEXT_ORIGIN_PROPERTY__VALUE = eINSTANCE.getfx_text_origin_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_position_propertyImpl <em>fx position property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_position_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_position_property()
     * @generated
     */
    EClass FX_POSITION_PROPERTY = eINSTANCE.getfx_position_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_POSITION_PROPERTY__PROPERTY = eINSTANCE.getfx_position_property_Property();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_POSITION_PROPERTY__VALUES = eINSTANCE.getfx_position_property_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_background_image_size_propertyImpl <em>fx background image size property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_background_image_size_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_background_image_size_property()
     * @generated
     */
    EClass FX_BACKGROUND_IMAGE_SIZE_PROPERTY = eINSTANCE.getfx_background_image_size_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_BACKGROUND_IMAGE_SIZE_PROPERTY__PROPERTY = eINSTANCE.getfx_background_image_size_property_Property();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_BACKGROUND_IMAGE_SIZE_PROPERTY__VALUES = eINSTANCE.getfx_background_image_size_property_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_border_style_propertyImpl <em>fx border style property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_border_style_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_border_style_property()
     * @generated
     */
    EClass FX_BORDER_STYLE_PROPERTY = eINSTANCE.getfx_border_style_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_BORDER_STYLE_PROPERTY__PROPERTY = eINSTANCE.getfx_border_style_property_Property();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_BORDER_STYLE_PROPERTY__VALUES = eINSTANCE.getfx_border_style_property_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_border_image_slice_propertyImpl <em>fx border image slice property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_border_image_slice_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_border_image_slice_property()
     * @generated
     */
    EClass FX_BORDER_IMAGE_SLICE_PROPERTY = eINSTANCE.getfx_border_image_slice_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_BORDER_IMAGE_SLICE_PROPERTY__PROPERTY = eINSTANCE.getfx_border_image_slice_property_Property();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_BORDER_IMAGE_SLICE_PROPERTY__VALUES = eINSTANCE.getfx_border_image_slice_property_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_text_overrun_propertyImpl <em>fx text overrun property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_text_overrun_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_text_overrun_property()
     * @generated
     */
    EClass FX_TEXT_OVERRUN_PROPERTY = eINSTANCE.getfx_text_overrun_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_TEXT_OVERRUN_PROPERTY__PROPERTY = eINSTANCE.getfx_text_overrun_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_TEXT_OVERRUN_PROPERTY__VALUE = eINSTANCE.getfx_text_overrun_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_insets_propertyImpl <em>fx insets property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_insets_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_insets_property()
     * @generated
     */
    EClass FX_INSETS_PROPERTY = eINSTANCE.getfx_insets_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_INSETS_PROPERTY__PROPERTY = eINSTANCE.getfx_insets_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_INSETS_PROPERTY__VALUE = eINSTANCE.getfx_insets_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_number_propertiesImpl <em>fx number properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_number_propertiesImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_number_properties()
     * @generated
     */
    EClass FX_NUMBER_PROPERTIES = eINSTANCE.getfx_number_properties();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_NUMBER_PROPERTIES__PROPERTY = eINSTANCE.getfx_number_properties_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_NUMBER_PROPERTIES__VALUE = eINSTANCE.getfx_number_properties_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_multi_paint_propertiesImpl <em>fx multi paint properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_multi_paint_propertiesImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_multi_paint_properties()
     * @generated
     */
    EClass FX_MULTI_PAINT_PROPERTIES = eINSTANCE.getfx_multi_paint_properties();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_MULTI_PAINT_PROPERTIES__PROPERTY = eINSTANCE.getfx_multi_paint_properties_Property();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_MULTI_PAINT_PROPERTIES__VALUES = eINSTANCE.getfx_multi_paint_properties_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_string_propertyImpl <em>fx string property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_string_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_string_property()
     * @generated
     */
    EClass FX_STRING_PROPERTY = eINSTANCE.getfx_string_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_STRING_PROPERTY__PROPERTY = eINSTANCE.getfx_string_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_STRING_PROPERTY__VALUE = eINSTANCE.getfx_string_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.EffectImpl <em>Effect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.EffectImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getEffect()
     * @generated
     */
    EClass EFFECT = eINSTANCE.getEffect();

    /**
     * The meta object literal for the '<em><b>Blur</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFFECT__BLUR = eINSTANCE.getEffect_Blur();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EFFECT__COLOR = eINSTANCE.getEffect_Color();

    /**
     * The meta object literal for the '<em><b>Blur Radius</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFFECT__BLUR_RADIUS = eINSTANCE.getEffect_BlurRadius();

    /**
     * The meta object literal for the '<em><b>Offset X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFFECT__OFFSET_X = eINSTANCE.getEffect_OffsetX();

    /**
     * The meta object literal for the '<em><b>Offset Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFFECT__OFFSET_Y = eINSTANCE.getEffect_OffsetY();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.EffectDropShadowImpl <em>Effect Drop Shadow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.EffectDropShadowImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getEffectDropShadow()
     * @generated
     */
    EClass EFFECT_DROP_SHADOW = eINSTANCE.getEffectDropShadow();

    /**
     * The meta object literal for the '<em><b>Spread</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFFECT_DROP_SHADOW__SPREAD = eINSTANCE.getEffectDropShadow_Spread();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.EffectInnerShadowImpl <em>Effect Inner Shadow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.EffectInnerShadowImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getEffectInnerShadow()
     * @generated
     */
    EClass EFFECT_INNER_SHADOW = eINSTANCE.getEffectInnerShadow();

    /**
     * The meta object literal for the '<em><b>Choke</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EFFECT_INNER_SHADOW__CHOKE = eINSTANCE.getEffectInnerShadow_Choke();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.MultiPaintImpl <em>Multi Paint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.MultiPaintImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getMultiPaint()
     * @generated
     */
    EClass MULTI_PAINT = eINSTANCE.getMultiPaint();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_PAINT__VALUES = eINSTANCE.getMultiPaint_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.PaintImpl <em>Paint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.PaintImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getPaint()
     * @generated
     */
    EClass PAINT = eINSTANCE.getPaint();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.LinearGradientImpl <em>Linear Gradient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.LinearGradientImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getLinearGradient()
     * @generated
     */
    EClass LINEAR_GRADIENT = eINSTANCE.getLinearGradient();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINEAR_GRADIENT__START = eINSTANCE.getLinearGradient_Start();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINEAR_GRADIENT__END = eINSTANCE.getLinearGradient_End();

    /**
     * The meta object literal for the '<em><b>Stops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINEAR_GRADIENT__STOPS = eINSTANCE.getLinearGradient_Stops();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RadialGradientImpl <em>Radial Gradient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RadialGradientImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getRadialGradient()
     * @generated
     */
    EClass RADIAL_GRADIENT = eINSTANCE.getRadialGradient();

    /**
     * The meta object literal for the '<em><b>Center</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RADIAL_GRADIENT__CENTER = eINSTANCE.getRadialGradient_Center();

    /**
     * The meta object literal for the '<em><b>Radius</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RADIAL_GRADIENT__RADIUS = eINSTANCE.getRadialGradient_Radius();

    /**
     * The meta object literal for the '<em><b>Focus</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RADIAL_GRADIENT__FOCUS = eINSTANCE.getRadialGradient_Focus();

    /**
     * The meta object literal for the '<em><b>Stops</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RADIAL_GRADIENT__STOPS = eINSTANCE.getRadialGradient_Stops();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.StopValueImpl <em>Stop Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.StopValueImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getStopValue()
     * @generated
     */
    EClass STOP_VALUE = eINSTANCE.getStopValue();

    /**
     * The meta object literal for the '<em><b>Pos</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STOP_VALUE__POS = eINSTANCE.getStopValue_Pos();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STOP_VALUE__COLOR = eINSTANCE.getStopValue_Color();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.PointValueImpl <em>Point Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.PointValueImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getPointValue()
     * @generated
     */
    EClass POINT_VALUE = eINSTANCE.getPointValue();

    /**
     * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT_VALUE__X = eINSTANCE.getPointValue_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT_VALUE__Y = eINSTANCE.getPointValue_Y();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RepeatStyleImpl <em>Repeat Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RepeatStyleImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getRepeatStyle()
     * @generated
     */
    EClass REPEAT_STYLE = eINSTANCE.getRepeatStyle();

    /**
     * The meta object literal for the '<em><b>V</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPEAT_STYLE__V = eINSTANCE.getRepeatStyle_V();

    /**
     * The meta object literal for the '<em><b>V2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPEAT_STYLE__V2 = eINSTANCE.getRepeatStyle_V2();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.Dim4SizeImpl <em>Dim4 Size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.Dim4SizeImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getDim4Size()
     * @generated
     */
    EClass DIM4_SIZE = eINSTANCE.getDim4Size();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIM4_SIZE__VALUES = eINSTANCE.getDim4Size_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BgPositionImpl <em>Bg Position</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BgPositionImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getBgPosition()
     * @generated
     */
    EClass BG_POSITION = eINSTANCE.getBgPosition();

    /**
     * The meta object literal for the '<em><b>Absx</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BG_POSITION__ABSX = eINSTANCE.getBgPosition_Absx();

    /**
     * The meta object literal for the '<em><b>Relx</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BG_POSITION__RELX = eINSTANCE.getBgPosition_Relx();

    /**
     * The meta object literal for the '<em><b>Absy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BG_POSITION__ABSY = eINSTANCE.getBgPosition_Absy();

    /**
     * The meta object literal for the '<em><b>Rely</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BG_POSITION__RELY = eINSTANCE.getBgPosition_Rely();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_color_propertyImpl <em>fx color property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.fx_color_propertyImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfx_color_property()
     * @generated
     */
    EClass FX_COLOR_PROPERTY = eINSTANCE.getfx_color_property();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FX_COLOR_PROPERTY__PROPERTY = eINSTANCE.getfx_color_property_Property();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FX_COLOR_PROPERTY__VALUE = eINSTANCE.getfx_color_property_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BgSizeImpl <em>Bg Size</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BgSizeImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getBgSize()
     * @generated
     */
    EClass BG_SIZE = eINSTANCE.getBgSize();

    /**
     * The meta object literal for the '<em><b>Xsize</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BG_SIZE__XSIZE = eINSTANCE.getBgSize_Xsize();

    /**
     * The meta object literal for the '<em><b>Ysize</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BG_SIZE__YSIZE = eINSTANCE.getBgSize_Ysize();

    /**
     * The meta object literal for the '<em><b>Predefined</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BG_SIZE__PREDEFINED = eINSTANCE.getBgSize_Predefined();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BorderStyleImpl <em>Border Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BorderStyleImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getBorderStyle()
     * @generated
     */
    EClass BORDER_STYLE = eINSTANCE.getBorderStyle();

    /**
     * The meta object literal for the '<em><b>Dash Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BORDER_STYLE__DASH_STYLE = eINSTANCE.getBorderStyle_DashStyle();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BORDER_STYLE__LOCATION = eINSTANCE.getBorderStyle_Location();

    /**
     * The meta object literal for the '<em><b>Miter Abs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BORDER_STYLE__MITER_ABS = eINSTANCE.getBorderStyle_MiterAbs();

    /**
     * The meta object literal for the '<em><b>Miter Predefined</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BORDER_STYLE__MITER_PREDEFINED = eINSTANCE.getBorderStyle_MiterPredefined();

    /**
     * The meta object literal for the '<em><b>Line Cap</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BORDER_STYLE__LINE_CAP = eINSTANCE.getBorderStyle_LineCap();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.SizeFillImpl <em>Size Fill</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.SizeFillImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getSizeFill()
     * @generated
     */
    EClass SIZE_FILL = eINSTANCE.getSizeFill();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIZE_FILL__VALUE = eINSTANCE.getSizeFill_Value();

    /**
     * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE_FILL__FILL = eINSTANCE.getSizeFill_Fill();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.ColorImpl <em>Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.ColorImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getColor()
     * @generated
     */
    EClass COLOR = eINSTANCE.getColor();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.LookedUpColorImpl <em>Looked Up Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.LookedUpColorImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getLookedUpColor()
     * @generated
     */
    EClass LOOKED_UP_COLOR = eINSTANCE.getLookedUpColor();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOOKED_UP_COLOR__VALUE = eINSTANCE.getLookedUpColor_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.NamedColorImpl <em>Named Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.NamedColorImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getNamedColor()
     * @generated
     */
    EClass NAMED_COLOR = eINSTANCE.getNamedColor();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_COLOR__VALUE = eINSTANCE.getNamedColor_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RGBColorImpl <em>RGB Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RGBColorImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getRGBColor()
     * @generated
     */
    EClass RGB_COLOR = eINSTANCE.getRGBColor();

    /**
     * The meta object literal for the '<em><b>Hexcolor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB_COLOR__HEXCOLOR = eINSTANCE.getRGBColor_Hexcolor();

    /**
     * The meta object literal for the '<em><b>R</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB_COLOR__R = eINSTANCE.getRGBColor_R();

    /**
     * The meta object literal for the '<em><b>G</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB_COLOR__G = eINSTANCE.getRGBColor_G();

    /**
     * The meta object literal for the '<em><b>B</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB_COLOR__B = eINSTANCE.getRGBColor_B();

    /**
     * The meta object literal for the '<em><b>Rp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB_COLOR__RP = eINSTANCE.getRGBColor_Rp();

    /**
     * The meta object literal for the '<em><b>Gp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB_COLOR__GP = eINSTANCE.getRGBColor_Gp();

    /**
     * The meta object literal for the '<em><b>Bp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB_COLOR__BP = eINSTANCE.getRGBColor_Bp();

    /**
     * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RGB_COLOR__ALPHA = eINSTANCE.getRGBColor_Alpha();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.HSBColorImpl <em>HSB Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.HSBColorImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getHSBColor()
     * @generated
     */
    EClass HSB_COLOR = eINSTANCE.getHSBColor();

    /**
     * The meta object literal for the '<em><b>Hue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HSB_COLOR__HUE = eINSTANCE.getHSBColor_Hue();

    /**
     * The meta object literal for the '<em><b>Saturation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HSB_COLOR__SATURATION = eINSTANCE.getHSBColor_Saturation();

    /**
     * The meta object literal for the '<em><b>Brightness</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HSB_COLOR__BRIGHTNESS = eINSTANCE.getHSBColor_Brightness();

    /**
     * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HSB_COLOR__ALPHA = eINSTANCE.getHSBColor_Alpha();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.ColorFunctionImpl <em>Color Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.ColorFunctionImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getColorFunction()
     * @generated
     */
    EClass COLOR_FUNCTION = eINSTANCE.getColorFunction();

    /**
     * The meta object literal for the '<em><b>Orig</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_FUNCTION__ORIG = eINSTANCE.getColorFunction_Orig();

    /**
     * The meta object literal for the '<em><b>Mod</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_FUNCTION__MOD = eINSTANCE.getColorFunction_Mod();

    /**
     * The meta object literal for the '<em><b>Stop Numbers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR_FUNCTION__STOP_NUMBERS = eINSTANCE.getColorFunction_StopNumbers();

    /**
     * The meta object literal for the '<em><b>Stop Colors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_FUNCTION__STOP_COLORS = eINSTANCE.getColorFunction_StopColors();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.URLTypeImpl <em>URL Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.URLTypeImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getURLType()
     * @generated
     */
    EClass URL_TYPE = eINSTANCE.getURLType();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL_TYPE__URL = eINSTANCE.getURLType_Url();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.FONTImpl <em>FONT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.FONTImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getFONT()
     * @generated
     */
    EClass FONT = eINSTANCE.getFONT();

    /**
     * The meta object literal for the '<em><b>Style Or Weight String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT__STYLE_OR_WEIGHT_STRING = eINSTANCE.getFONT_StyleOrWeightString();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT__WEIGHT = eINSTANCE.getFONT_Weight();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT__SIZE = eINSTANCE.getFONT_Size();

    /**
     * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONT__FAMILY = eINSTANCE.getFONT_Family();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.FONTWEIGHTImpl <em>FONTWEIGHT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.FONTWEIGHTImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getFONTWEIGHT()
     * @generated
     */
    EClass FONTWEIGHT = eINSTANCE.getFONTWEIGHT();

    /**
     * The meta object literal for the '<em><b>Value String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONTWEIGHT__VALUE_STRING = eINSTANCE.getFONTWEIGHT_ValueString();

    /**
     * The meta object literal for the '<em><b>Value Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONTWEIGHT__VALUE_INT = eINSTANCE.getFONTWEIGHT_ValueInt();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.FONTSTYLEImpl <em>FONTSTYLE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.FONTSTYLEImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getFONTSTYLE()
     * @generated
     */
    EClass FONTSTYLE = eINSTANCE.getFONTSTYLE();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FONTSTYLE__VALUE = eINSTANCE.getFONTSTYLE_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.SizeTypeImpl <em>Size Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.SizeTypeImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getSizeType()
     * @generated
     */
    EClass SIZE_TYPE = eINSTANCE.getSizeType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIZE_TYPE__VALUE = eINSTANCE.getSizeType_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.HPosition <em>HPosition</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.HPosition
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getHPosition()
     * @generated
     */
    EEnum HPOSITION = eINSTANCE.getHPosition();

  }

} //CssDslPackage
