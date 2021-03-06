/**
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
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet#getCharset <em>Charset</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet#getImports <em>Imports</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet#getMedia <em>Media</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet#getPage <em>Page</em>}</li>
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
   * Returns the value of the '<em><b>Charset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Charset</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Charset</em>' containment reference.
   * @see #setCharset(charset)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getstylesheet_Charset()
   * @model containment="true"
   * @generated
   */
  charset getCharset();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet#getCharset <em>Charset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Charset</em>' containment reference.
   * @see #getCharset()
   * @generated
   */
  void setCharset(charset value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.css.cssDsl.importExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getstylesheet_Imports()
   * @model containment="true"
   * @generated
   */
  EList<importExpression> getImports();

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

  /**
   * Returns the value of the '<em><b>Page</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.css.cssDsl.page}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Page</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Page</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getstylesheet_Page()
   * @model containment="true"
   * @generated
   */
  EList<page> getPage();

} // stylesheet
