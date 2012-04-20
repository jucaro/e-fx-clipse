/**
 */
package at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Dec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.XMLDec#getProps <em>Props</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage#getXMLDec()
 * @model
 * @generated
 */
public interface XMLDec extends EObject
{
  /**
   * Returns the value of the '<em><b>Props</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.AttributePropertyDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Props</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Props</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage#getXMLDec_Props()
   * @model containment="true"
   * @generated
   */
  EList<AttributePropertyDefinition> getProps();

} // XMLDec
