/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction#getType <em>Type</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage#getProcessingInstruction()
 * @model
 * @generated
 */
public interface ProcessingInstruction extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage#getProcessingInstruction_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Namespace</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' containment reference.
   * @see #setImportedNamespace(QualifiedNameWithWildCard)
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage#getProcessingInstruction_ImportedNamespace()
   * @model containment="true"
   * @generated
   */
  QualifiedNameWithWildCard getImportedNamespace();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction#getImportedNamespace <em>Imported Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Namespace</em>' containment reference.
   * @see #getImportedNamespace()
   * @generated
   */
  void setImportedNamespace(QualifiedNameWithWildCard value);

} // ProcessingInstruction
