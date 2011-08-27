/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
   * The feature id for the '<em><b>Sub Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR__SUB_SELECTORS = 1;

  /**
   * The number of structural features of the '<em>simple selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.sub_selectorImpl <em>sub selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.sub_selectorImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getsub_selector()
   * @generated
   */
  int SUB_SELECTOR = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SELECTOR__ID = 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SELECTOR__CLASS = 1;

  /**
   * The feature id for the '<em><b>Attrib</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SELECTOR__ATTRIB = 2;

  /**
   * The feature id for the '<em><b>Pseudoclass</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SELECTOR__PSEUDOCLASS = 3;

  /**
   * The number of structural features of the '<em>sub selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SELECTOR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.css_declarationImpl <em>css declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.css_declarationImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getcss_declaration()
   * @generated
   */
  int CSS_DECLARATION = 6;

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
  int CSS_GENERIC_DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_GENERIC_DECLARATION__PROPERTY = CSS_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
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
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.exprImpl <em>expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.exprImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getexpr()
   * @generated
   */
  int EXPR = 8;

  /**
   * The feature id for the '<em><b>Term Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__TERM_GROUPS = 0;

  /**
   * The number of structural features of the '<em>expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.termGroupImpl <em>term Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.termGroupImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#gettermGroup()
   * @generated
   */
  int TERM_GROUP = 9;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_GROUP__TERMS = 0;

  /**
   * The number of structural features of the '<em>term Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_GROUP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.termImpl <em>term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.termImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getterm()
   * @generated
   */
  int TERM = 10;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__NUMBER = 0;

  /**
   * The feature id for the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__STRING_VALUE = 1;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__IDENTIFIER = 2;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__URL = 3;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__FUNCTION = 4;

  /**
   * The feature id for the '<em><b>Hex Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__HEX_COLOR = 5;

  /**
   * The number of structural features of the '<em>term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.functionImpl <em>function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.functionImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfunction()
   * @generated
   */
  int FUNCTION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.URLTypeImpl <em>URL Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.URLTypeImpl
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getURLType()
   * @generated
   */
  int URL_TYPE = 12;

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
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector#getSubSelectors <em>Sub Selectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Selectors</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector#getSubSelectors()
   * @see #getsimple_selector()
   * @generated
   */
  EReference getsimple_selector_SubSelectors();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.sub_selector <em>sub selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sub selector</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.sub_selector
   * @generated
   */
  EClass getsub_selector();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.sub_selector#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.sub_selector#getId()
   * @see #getsub_selector()
   * @generated
   */
  EAttribute getsub_selector_Id();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.sub_selector#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.sub_selector#getClass_()
   * @see #getsub_selector()
   * @generated
   */
  EAttribute getsub_selector_Class();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.sub_selector#getAttrib <em>Attrib</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attrib</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.sub_selector#getAttrib()
   * @see #getsub_selector()
   * @generated
   */
  EAttribute getsub_selector_Attrib();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.sub_selector#getPseudoclass <em>Pseudoclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pseudoclass</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.sub_selector#getPseudoclass()
   * @see #getsub_selector()
   * @generated
   */
  EAttribute getsub_selector_Pseudoclass();

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
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration#getExpression()
   * @see #getcss_generic_declaration()
   * @generated
   */
  EReference getcss_generic_declaration_Expression();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.expr <em>expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expr</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.expr
   * @generated
   */
  EClass getexpr();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.expr#getTermGroups <em>Term Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Term Groups</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.expr#getTermGroups()
   * @see #getexpr()
   * @generated
   */
  EReference getexpr_TermGroups();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup <em>term Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>term Group</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup
   * @generated
   */
  EClass gettermGroup();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Terms</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup#getTerms()
   * @see #gettermGroup()
   * @generated
   */
  EReference gettermGroup_Terms();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.term <em>term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>term</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.term
   * @generated
   */
  EClass getterm();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.term#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.term#getNumber()
   * @see #getterm()
   * @generated
   */
  EAttribute getterm_Number();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.term#getStringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.term#getStringValue()
   * @see #getterm()
   * @generated
   */
  EAttribute getterm_StringValue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.term#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.term#getIdentifier()
   * @see #getterm()
   * @generated
   */
  EAttribute getterm_Identifier();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.term#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Url</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.term#getUrl()
   * @see #getterm()
   * @generated
   */
  EReference getterm_Url();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.term#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.term#getFunction()
   * @see #getterm()
   * @generated
   */
  EReference getterm_Function();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.term#getHexColor <em>Hex Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hex Color</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.term#getHexColor()
   * @see #getterm()
   * @generated
   */
  EAttribute getterm_HexColor();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.function <em>function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.function
   * @generated
   */
  EClass getfunction();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.function#getName()
   * @see #getfunction()
   * @generated
   */
  EAttribute getfunction_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.function#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.function#getExpression()
   * @see #getfunction()
   * @generated
   */
  EReference getfunction_Expression();

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
     * The meta object literal for the '<em><b>Sub Selectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SELECTOR__SUB_SELECTORS = eINSTANCE.getsimple_selector_SubSelectors();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.sub_selectorImpl <em>sub selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.sub_selectorImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getsub_selector()
     * @generated
     */
    EClass SUB_SELECTOR = eINSTANCE.getsub_selector();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_SELECTOR__ID = eINSTANCE.getsub_selector_Id();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_SELECTOR__CLASS = eINSTANCE.getsub_selector_Class();

    /**
     * The meta object literal for the '<em><b>Attrib</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_SELECTOR__ATTRIB = eINSTANCE.getsub_selector_Attrib();

    /**
     * The meta object literal for the '<em><b>Pseudoclass</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_SELECTOR__PSEUDOCLASS = eINSTANCE.getsub_selector_Pseudoclass();

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
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSS_GENERIC_DECLARATION__EXPRESSION = eINSTANCE.getcss_generic_declaration_Expression();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.exprImpl <em>expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.exprImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getexpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getexpr();

    /**
     * The meta object literal for the '<em><b>Term Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__TERM_GROUPS = eINSTANCE.getexpr_TermGroups();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.termGroupImpl <em>term Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.termGroupImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#gettermGroup()
     * @generated
     */
    EClass TERM_GROUP = eINSTANCE.gettermGroup();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM_GROUP__TERMS = eINSTANCE.gettermGroup_Terms();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.termImpl <em>term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.termImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getterm()
     * @generated
     */
    EClass TERM = eINSTANCE.getterm();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__NUMBER = eINSTANCE.getterm_Number();

    /**
     * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__STRING_VALUE = eINSTANCE.getterm_StringValue();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__IDENTIFIER = eINSTANCE.getterm_Identifier();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__URL = eINSTANCE.getterm_Url();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__FUNCTION = eINSTANCE.getterm_Function();

    /**
     * The meta object literal for the '<em><b>Hex Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__HEX_COLOR = eINSTANCE.getterm_HexColor();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.functionImpl <em>function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.functionImpl
     * @see at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslPackageImpl#getfunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getfunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getfunction_Name();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__EXPRESSION = eINSTANCE.getfunction_Expression();

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

  }

} //CssDslPackage
