/**
 */
package at.bestsolution.efxclipse.tooling.fxgraph.fXGraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Value Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.IncludeValueProperty#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage#getIncludeValueProperty()
 * @model
 * @generated
 */
public interface IncludeValueProperty extends SingleValueProperty, ListValueElement
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(ComponentDefinition)
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage#getIncludeValueProperty_Source()
   * @model
   * @generated
   */
  ComponentDefinition getSource();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.IncludeValueProperty#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(ComponentDefinition value);

} // IncludeValueProperty
