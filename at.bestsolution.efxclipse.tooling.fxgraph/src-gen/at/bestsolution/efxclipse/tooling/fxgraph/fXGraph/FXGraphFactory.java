/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.fxgraph.fXGraph;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage
 * @generated
 */
public interface FXGraphFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FXGraphFactory eINSTANCE = at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>Define</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Define</em>'.
   * @generated
   */
  Define createDefine();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Value Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Property</em>'.
   * @generated
   */
  ValueProperty createValueProperty();

  /**
   * Returns a new object of class '<em>Single Value Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Value Property</em>'.
   * @generated
   */
  SingleValueProperty createSingleValueProperty();

  /**
   * Returns a new object of class '<em>Multi Value Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Value Property</em>'.
   * @generated
   */
  MultiValueProperty createMultiValueProperty();

  /**
   * Returns a new object of class '<em>List Value Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Value Element</em>'.
   * @generated
   */
  ListValueElement createListValueElement();

  /**
   * Returns a new object of class '<em>List Value Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Value Property</em>'.
   * @generated
   */
  ListValueProperty createListValueProperty();

  /**
   * Returns a new object of class '<em>Map Value Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map Value Property</em>'.
   * @generated
   */
  MapValueProperty createMapValueProperty();

  /**
   * Returns a new object of class '<em>Simple Value Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Value Property</em>'.
   * @generated
   */
  SimpleValueProperty createSimpleValueProperty();

  /**
   * Returns a new object of class '<em>Reference Value Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Value Property</em>'.
   * @generated
   */
  ReferenceValueProperty createReferenceValueProperty();

  /**
   * Returns a new object of class '<em>Include Value Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Include Value Property</em>'.
   * @generated
   */
  IncludeValueProperty createIncludeValueProperty();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FXGraphPackage getFXGraphPackage();

} //FXGraphFactory
