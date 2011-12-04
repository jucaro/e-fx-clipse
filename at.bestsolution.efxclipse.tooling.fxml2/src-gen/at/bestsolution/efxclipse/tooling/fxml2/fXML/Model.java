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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.Model#getXmlDec <em>Xml Dec</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.Model#getComments <em>Comments</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.Model#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.FXMLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Xml Dec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xml Dec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xml Dec</em>' attribute.
   * @see #setXmlDec(String)
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.FXMLPackage#getModel_XmlDec()
   * @model
   * @generated
   */
  String getXmlDec();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.Model#getXmlDec <em>Xml Dec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xml Dec</em>' attribute.
   * @see #getXmlDec()
   * @generated
   */
  void setXmlDec(String value);

  /**
   * Returns the value of the '<em><b>Comments</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comments</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comments</em>' attribute list.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.FXMLPackage#getModel_Comments()
   * @model unique="false"
   * @generated
   */
  EList<String> getComments();

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.fxml2.fXML.ProcessingInstruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.FXMLPackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ProcessingInstruction> getImports();

  /**
   * Returns the value of the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' containment reference.
   * @see #setRoot(ClassDefinition)
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.FXMLPackage#getModel_Root()
   * @model containment="true"
   * @generated
   */
  ClassDefinition getRoot();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.Model#getRoot <em>Root</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' containment reference.
   * @see #getRoot()
   * @generated
   */
  void setRoot(ClassDefinition value);

} // Model
