/**
 * <copyright>
 * </copyright>
 *
 */
package at.bestsolution.efxclipse.tooling.fxgraph.fXGraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Value Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ReferenceValueProperty#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage#getReferenceValueProperty()
 * @model
 * @generated
 */
public interface ReferenceValueProperty extends SingleValueProperty, ListValueElement
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(Element)
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage#getReferenceValueProperty_Reference()
   * @model
   * @generated
   */
  Element getReference();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ReferenceValueProperty#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(Element value);

} // ReferenceValueProperty
