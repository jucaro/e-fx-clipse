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
 * A representation of the model object '<em><b>media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.media#getMedialist <em>Medialist</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.media#getRulesets <em>Rulesets</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getmedia()
 * @model
 * @generated
 */
public interface media extends EObject
{
  /**
   * Returns the value of the '<em><b>Medialist</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Medialist</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Medialist</em>' attribute.
   * @see #setMedialist(String)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getmedia_Medialist()
   * @model
   * @generated
   */
  String getMedialist();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.media#getMedialist <em>Medialist</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Medialist</em>' attribute.
   * @see #getMedialist()
   * @generated
   */
  void setMedialist(String value);

  /**
   * Returns the value of the '<em><b>Rulesets</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rulesets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rulesets</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getmedia_Rulesets()
   * @model containment="true"
   * @generated
   */
  EList<ruleset> getRulesets();

} // media
