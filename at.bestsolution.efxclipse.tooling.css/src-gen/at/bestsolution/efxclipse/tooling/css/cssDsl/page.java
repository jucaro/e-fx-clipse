/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.page#getPseudoPage <em>Pseudo Page</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.page#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getpage()
 * @model
 * @generated
 */
public interface page extends EObject
{
  /**
   * Returns the value of the '<em><b>Pseudo Page</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pseudo Page</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pseudo Page</em>' attribute.
   * @see #setPseudoPage(String)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getpage_PseudoPage()
   * @model
   * @generated
   */
  String getPseudoPage();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.page#getPseudoPage <em>Pseudo Page</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pseudo Page</em>' attribute.
   * @see #getPseudoPage()
   * @generated
   */
  void setPseudoPage(String value);

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getpage_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<css_generic_declaration> getDeclarations();

} // page
