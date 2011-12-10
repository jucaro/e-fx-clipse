/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Element Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition#getProperties <em>Properties</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition#getChildren <em>Children</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition#getEndnamespace <em>Endnamespace</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition#getEndname <em>Endname</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage#getContainerElementDefinition()
 * @model
 * @generated
 */
public interface ContainerElementDefinition extends ElementDefinition
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.AttributePropertyDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage#getContainerElementDefinition_Properties()
   * @model containment="true"
   * @generated
   */
  EList<AttributePropertyDefinition> getProperties();

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ElementDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage#getContainerElementDefinition_Children()
   * @model containment="true"
   * @generated
   */
  EList<ElementDefinition> getChildren();

  /**
   * Returns the value of the '<em><b>Endnamespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Endnamespace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Endnamespace</em>' attribute.
   * @see #setEndnamespace(String)
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage#getContainerElementDefinition_Endnamespace()
   * @model
   * @generated
   */
  String getEndnamespace();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition#getEndnamespace <em>Endnamespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Endnamespace</em>' attribute.
   * @see #getEndnamespace()
   * @generated
   */
  void setEndnamespace(String value);

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
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage#getContainerElementDefinition_Endname()
   * @model
   * @generated
   */
  String getEndname();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition#getEndname <em>Endname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Endname</em>' attribute.
   * @see #getEndname()
   * @generated
   */
  void setEndname(String value);

  /**
   * Returns the value of the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' attribute.
   * @see #setContent(String)
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage#getContainerElementDefinition_Content()
   * @model
   * @generated
   */
  String getContent();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition#getContent <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' attribute.
   * @see #getContent()
   * @generated
   */
  void setContent(String value);

} // ContainerElementDefinition
