/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.fxgraph.fXGraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getController <em>Controller</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getPreviewCssFiles <em>Preview Css Files</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getPreviewResourceBundle <em>Preview Resource Bundle</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getScripts <em>Scripts</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getDefines <em>Defines</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getRootNode <em>Root Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage#getComponentDefinition()
 * @model
 * @generated
 */
public interface ComponentDefinition extends EObject
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
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage#getComponentDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Controller</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Controller</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controller</em>' containment reference.
   * @see #setController(JvmParameterizedTypeReference)
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage#getComponentDefinition_Controller()
   * @model containment="true"
   * @generated
   */
  JvmParameterizedTypeReference getController();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getController <em>Controller</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Controller</em>' containment reference.
   * @see #getController()
   * @generated
   */
  void setController(JvmParameterizedTypeReference value);

  /**
   * Returns the value of the '<em><b>Preview Css Files</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preview Css Files</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preview Css Files</em>' attribute list.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage#getComponentDefinition_PreviewCssFiles()
   * @model unique="false"
   * @generated
   */
  EList<String> getPreviewCssFiles();

  /**
   * Returns the value of the '<em><b>Preview Resource Bundle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preview Resource Bundle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preview Resource Bundle</em>' attribute.
   * @see #setPreviewResourceBundle(String)
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage#getComponentDefinition_PreviewResourceBundle()
   * @model
   * @generated
   */
  String getPreviewResourceBundle();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getPreviewResourceBundle <em>Preview Resource Bundle</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preview Resource Bundle</em>' attribute.
   * @see #getPreviewResourceBundle()
   * @generated
   */
  void setPreviewResourceBundle(String value);

  /**
   * Returns the value of the '<em><b>Scripts</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Script}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scripts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scripts</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage#getComponentDefinition_Scripts()
   * @model containment="true"
   * @generated
   */
  EList<Script> getScripts();

  /**
   * Returns the value of the '<em><b>Defines</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Define}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defines</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage#getComponentDefinition_Defines()
   * @model containment="true"
   * @generated
   */
  EList<Define> getDefines();

  /**
   * Returns the value of the '<em><b>Root Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Node</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Node</em>' containment reference.
   * @see #setRootNode(Element)
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage#getComponentDefinition_RootNode()
   * @model containment="true"
   * @generated
   */
  Element getRootNode();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getRootNode <em>Root Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root Node</em>' containment reference.
   * @see #getRootNode()
   * @generated
   */
  void setRootNode(Element value);

} // ComponentDefinition
