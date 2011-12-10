/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FXML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML#getXmlDec <em>Xml Dec</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML#getProcessingInstructions <em>Processing Instructions</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML#getRootElement <em>Root Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage#getFXML()
 * @model
 * @generated
 */
public interface FXML extends EObject
{
  /**
   * Returns the value of the '<em><b>Xml Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xml Dec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xml Dec</em>' containment reference.
   * @see #setXmlDec(XMLDec)
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage#getFXML_XmlDec()
   * @model containment="true"
   * @generated
   */
  XMLDec getXmlDec();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML#getXmlDec <em>Xml Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xml Dec</em>' containment reference.
   * @see #getXmlDec()
   * @generated
   */
  void setXmlDec(XMLDec value);

  /**
   * Returns the value of the '<em><b>Processing Instructions</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Processing Instructions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processing Instructions</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage#getFXML_ProcessingInstructions()
   * @model containment="true"
   * @generated
   */
  EList<ProcessingInstruction> getProcessingInstructions();

  /**
   * Returns the value of the '<em><b>Root Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Element</em>' containment reference.
   * @see #setRootElement(ElementDefinition)
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage#getFXML_RootElement()
   * @model containment="true"
   * @generated
   */
  ElementDefinition getRootElement();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML#getRootElement <em>Root Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root Element</em>' containment reference.
   * @see #getRootElement()
   * @generated
   */
  void setRootElement(ElementDefinition value);

} // FXML
