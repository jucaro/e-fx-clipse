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
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector#getClass_ <em>Class</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector#getAttrib <em>Attrib</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector#getPseudoclasses <em>Pseudoclasses</em>}</li>
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
   * Returns the value of the '<em><b>Id</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute list.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getsimple_selector_Id()
   * @model unique="false"
   * @generated
   */
  EList<String> getId();

  /**
   * Returns the value of the '<em><b>Class</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' attribute list.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getsimple_selector_Class()
   * @model unique="false"
   * @generated
   */
  EList<String> getClass_();

  /**
   * Returns the value of the '<em><b>Attrib</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attrib</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrib</em>' attribute list.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getsimple_selector_Attrib()
   * @model unique="false"
   * @generated
   */
  EList<String> getAttrib();

  /**
   * Returns the value of the '<em><b>Pseudoclasses</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pseudoclasses</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pseudoclasses</em>' attribute list.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getsimple_selector_Pseudoclasses()
   * @model unique="false"
   * @generated
   */
  EList<String> getPseudoclasses();

} // simple_selector
