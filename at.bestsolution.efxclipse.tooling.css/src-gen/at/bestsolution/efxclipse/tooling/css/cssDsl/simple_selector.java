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
 * A representation of the model object '<em><b>simple selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector#getElement <em>Element</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector#getUniversal <em>Universal</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector#getSubSelectors <em>Sub Selectors</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getsimple_selector()
 * @model
 * @generated
 */
public interface simple_selector extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' attribute.
   * @see #setElement(String)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getsimple_selector_Element()
   * @model
   * @generated
   */
  String getElement();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector#getElement <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' attribute.
   * @see #getElement()
   * @generated
   */
  void setElement(String value);

  /**
   * Returns the value of the '<em><b>Universal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Universal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Universal</em>' attribute.
   * @see #setUniversal(String)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getsimple_selector_Universal()
   * @model
   * @generated
   */
  String getUniversal();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector#getUniversal <em>Universal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Universal</em>' attribute.
   * @see #getUniversal()
   * @generated
   */
  void setUniversal(String value);

  /**
   * Returns the value of the '<em><b>Sub Selectors</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.css.cssDsl.sub_selector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Selectors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Selectors</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getsimple_selector_SubSelectors()
   * @model containment="true"
   * @generated
   */
  EList<sub_selector> getSubSelectors();

} // simple_selector
