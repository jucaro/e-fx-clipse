/**
 */
package at.bestsolution.efxclipse.tooling.css.cssDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage
 * @generated
 */
public interface CssDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CssDslFactory eINSTANCE = at.bestsolution.efxclipse.tooling.css.cssDsl.impl.CssDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>stylesheet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>stylesheet</em>'.
   * @generated
   */
  stylesheet createstylesheet();

  /**
   * Returns a new object of class '<em>charset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>charset</em>'.
   * @generated
   */
  charset createcharset();

  /**
   * Returns a new object of class '<em>import Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>import Expression</em>'.
   * @generated
   */
  importExpression createimportExpression();

  /**
   * Returns a new object of class '<em>page</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>page</em>'.
   * @generated
   */
  page createpage();

  /**
   * Returns a new object of class '<em>media</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>media</em>'.
   * @generated
   */
  media createmedia();

  /**
   * Returns a new object of class '<em>ruleset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ruleset</em>'.
   * @generated
   */
  ruleset createruleset();

  /**
   * Returns a new object of class '<em>selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>selector</em>'.
   * @generated
   */
  selector createselector();

  /**
   * Returns a new object of class '<em>simple selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>simple selector</em>'.
   * @generated
   */
  simple_selector createsimple_selector();

  /**
   * Returns a new object of class '<em>sub selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>sub selector</em>'.
   * @generated
   */
  sub_selector createsub_selector();

  /**
   * Returns a new object of class '<em>css declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>css declaration</em>'.
   * @generated
   */
  css_declaration createcss_declaration();

  /**
   * Returns a new object of class '<em>css generic declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>css generic declaration</em>'.
   * @generated
   */
  css_generic_declaration createcss_generic_declaration();

  /**
   * Returns a new object of class '<em>expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expr</em>'.
   * @generated
   */
  expr createexpr();

  /**
   * Returns a new object of class '<em>term Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>term Group</em>'.
   * @generated
   */
  termGroup createtermGroup();

  /**
   * Returns a new object of class '<em>term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>term</em>'.
   * @generated
   */
  term createterm();

  /**
   * Returns a new object of class '<em>function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function</em>'.
   * @generated
   */
  function createfunction();

  /**
   * Returns a new object of class '<em>URL Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>URL Type</em>'.
   * @generated
   */
  URLType createURLType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CssDslPackage getCssDslPackage();

} //CssDslFactory
