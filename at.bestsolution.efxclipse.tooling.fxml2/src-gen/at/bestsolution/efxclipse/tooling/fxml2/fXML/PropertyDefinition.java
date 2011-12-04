/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.fxml2.fXML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyDefinition#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyDefinition#getChildren <em>Children</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyDefinition#getSimpleValue <em>Simple Value</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyDefinition#getEndname <em>Endname</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.FXMLPackage#getPropertyDefinition()
 * @model
 * @generated
 */
public interface PropertyDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.FXMLPackage#getPropertyDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.fxml2.fXML.ClassDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.FXMLPackage#getPropertyDefinition_Children()
   * @model containment="true"
   * @generated
   */
  EList<ClassDefinition> getChildren();

  /**
   * Returns the value of the '<em><b>Simple Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Value</em>' attribute.
   * @see #setSimpleValue(String)
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.FXMLPackage#getPropertyDefinition_SimpleValue()
   * @model
   * @generated
   */
  String getSimpleValue();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyDefinition#getSimpleValue <em>Simple Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Value</em>' attribute.
   * @see #getSimpleValue()
   * @generated
   */
  void setSimpleValue(String value);

  /**
   * Returns the value of the '<em><b>Endname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Endname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Endname</em>' attribute.
   * @see #setEndname(String)
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.FXMLPackage#getPropertyDefinition_Endname()
   * @model
   * @generated
   */
  String getEndname();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyDefinition#getEndname <em>Endname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Endname</em>' attribute.
   * @see #getEndname()
   * @generated
   */
  void setEndname(String value);

} // PropertyDefinition
