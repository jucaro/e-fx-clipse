/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.*;

import org.eclipse.emf.ecore.EClass;
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
      case CssDslPackage.SUB_SELECTOR: return createsub_selector();
      case CssDslPackage.CSS_DECLARATION: return createcss_declaration();
      case CssDslPackage.CSS_GENERIC_DECLARATION: return createcss_generic_declaration();
      case CssDslPackage.EXPR: return createexpr();
      case CssDslPackage.TERM_GROUP: return createtermGroup();
      case CssDslPackage.TERM: return createterm();
      case CssDslPackage.FUNCTION: return createfunction();
      case CssDslPackage.URL_TYPE: return createURLType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
  public sub_selector createsub_selector()
  {
    sub_selectorImpl sub_selector = new sub_selectorImpl();
    return sub_selector;
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
  public expr createexpr()
  {
    exprImpl expr = new exprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public termGroup createtermGroup()
  {
    termGroupImpl termGroup = new termGroupImpl();
    return termGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public term createterm()
  {
    termImpl term = new termImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function createfunction()
  {
    functionImpl function = new functionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URLType createURLType()
  {
    URLTypeImpl urlType = new URLTypeImpl();
    return urlType;
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
