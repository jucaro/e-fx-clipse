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
 * A representation of the model object '<em><b>stylesheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet#getMedia <em>Media</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getstylesheet()
 * @model
 * @generated
 */
public interface stylesheet extends EObject
{
  /**
   * Returns the value of the '<em><b>Ruleset</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ruleset</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ruleset</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getstylesheet_Ruleset()
   * @model containment="true"
   * @generated
   */
  EList<ruleset> getRuleset();

  /**
   * Returns the value of the '<em><b>Media</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.css.cssDsl.media}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Media</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Media</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getstylesheet_Media()
   * @model containment="true"
   * @generated
   */
  EList<media> getMedia();

} // stylesheet
