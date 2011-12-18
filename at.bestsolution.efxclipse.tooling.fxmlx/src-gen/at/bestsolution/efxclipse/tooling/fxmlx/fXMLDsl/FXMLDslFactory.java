/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage
 * @generated
 */
public interface FXMLDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FXMLDslFactory eINSTANCE = at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>FXML</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>FXML</em>'.
   * @generated
   */
  FXML createFXML();

  /**
   * Returns a new object of class '<em>XML Dec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XML Dec</em>'.
   * @generated
   */
  XMLDec createXMLDec();

  /**
   * Returns a new object of class '<em>Processing Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Processing Instruction</em>'.
   * @generated
   */
  ProcessingInstruction createProcessingInstruction();

  /**
   * Returns a new object of class '<em>Element Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Definition</em>'.
   * @generated
   */
  ElementDefinition createElementDefinition();

  /**
   * Returns a new object of class '<em>Container Element Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container Element Definition</em>'.
   * @generated
   */
  ContainerElementDefinition createContainerElementDefinition();

  /**
   * Returns a new object of class '<em>Empty Element Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Empty Element Definition</em>'.
   * @generated
   */
  EmptyElementDefinition createEmptyElementDefinition();

  /**
   * Returns a new object of class '<em>PC Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PC Data</em>'.
   * @generated
   */
  PCData createPCData();

  /**
   * Returns a new object of class '<em>Attribute Property Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Property Definition</em>'.
   * @generated
   */
  AttributePropertyDefinition createAttributePropertyDefinition();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FXMLDslPackage getFXMLDslPackage();

} //FXMLDslFactory
