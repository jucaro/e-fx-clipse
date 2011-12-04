/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.fxml2.fXML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.FXMLFactory
 * @model kind="package"
 * @generated
 */
public interface FXMLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fXML";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bestsolution.at/efxclipse/tooling/fxml2/FXML";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fXML";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FXMLPackage eINSTANCE = at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.FXMLPackageImpl.init();

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.ModelImpl
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.FXMLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Xml Dec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__XML_DEC = 0;

  /**
   * The feature id for the '<em><b>Comments</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COMMENTS = 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 2;

  /**
   * The feature id for the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ROOT = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.ProcessingInstructionImpl <em>Processing Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.ProcessingInstructionImpl
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.FXMLPackageImpl#getProcessingInstruction()
   * @generated
   */
  int PROCESSING_INSTRUCTION = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSING_INSTRUCTION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSING_INSTRUCTION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Processing Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSING_INSTRUCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.ClassDefinitionImpl <em>Class Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.ClassDefinitionImpl
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.FXMLPackageImpl#getClassDefinition()
   * @generated
   */
  int CLASS_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEFINITION__ATTRIBUTES = 1;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEFINITION__CHILDREN = 2;

  /**
   * The feature id for the '<em><b>Endname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEFINITION__ENDNAME = 3;

  /**
   * The number of structural features of the '<em>Class Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEFINITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.PropertyAttributeDefinitionImpl <em>Property Attribute Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.PropertyAttributeDefinitionImpl
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.FXMLPackageImpl#getPropertyAttributeDefinition()
   * @generated
   */
  int PROPERTY_ATTRIBUTE_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ATTRIBUTE_DEFINITION__NAMESPACE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ATTRIBUTE_DEFINITION__NAME = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ATTRIBUTE_DEFINITION__VALUE = 2;

  /**
   * The number of structural features of the '<em>Property Attribute Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ATTRIBUTE_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.PropertyDefinitionImpl
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.FXMLPackageImpl#getPropertyDefinition()
   * @generated
   */
  int PROPERTY_DEFINITION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__CHILDREN = 1;

  /**
   * The feature id for the '<em><b>Simple Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__SIMPLE_VALUE = 2;

  /**
   * The feature id for the '<em><b>Endname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__ENDNAME = 3;

  /**
   * The number of structural features of the '<em>Property Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.Model#getXmlDec <em>Xml Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Xml Dec</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.Model#getXmlDec()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_XmlDec();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.Model#getComments <em>Comments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Comments</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.Model#getComments()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Comments();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.Model#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.Model#getRoot()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Root();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.ProcessingInstruction <em>Processing Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Processing Instruction</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.ProcessingInstruction
   * @generated
   */
  EClass getProcessingInstruction();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.ProcessingInstruction#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.ProcessingInstruction#getType()
   * @see #getProcessingInstruction()
   * @generated
   */
  EAttribute getProcessingInstruction_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.ProcessingInstruction#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.ProcessingInstruction#getValue()
   * @see #getProcessingInstruction()
   * @generated
   */
  EAttribute getProcessingInstruction_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.ClassDefinition <em>Class Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Definition</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.ClassDefinition
   * @generated
   */
  EClass getClassDefinition();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.ClassDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.ClassDefinition#getName()
   * @see #getClassDefinition()
   * @generated
   */
  EAttribute getClassDefinition_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.ClassDefinition#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.ClassDefinition#getAttributes()
   * @see #getClassDefinition()
   * @generated
   */
  EReference getClassDefinition_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.ClassDefinition#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.ClassDefinition#getChildren()
   * @see #getClassDefinition()
   * @generated
   */
  EReference getClassDefinition_Children();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.ClassDefinition#getEndname <em>Endname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Endname</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.ClassDefinition#getEndname()
   * @see #getClassDefinition()
   * @generated
   */
  EAttribute getClassDefinition_Endname();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyAttributeDefinition <em>Property Attribute Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Attribute Definition</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyAttributeDefinition
   * @generated
   */
  EClass getPropertyAttributeDefinition();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyAttributeDefinition#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namespace</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyAttributeDefinition#getNamespace()
   * @see #getPropertyAttributeDefinition()
   * @generated
   */
  EAttribute getPropertyAttributeDefinition_Namespace();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyAttributeDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyAttributeDefinition#getName()
   * @see #getPropertyAttributeDefinition()
   * @generated
   */
  EAttribute getPropertyAttributeDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyAttributeDefinition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyAttributeDefinition#getValue()
   * @see #getPropertyAttributeDefinition()
   * @generated
   */
  EAttribute getPropertyAttributeDefinition_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyDefinition <em>Property Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Definition</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyDefinition
   * @generated
   */
  EClass getPropertyDefinition();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyDefinition#getName()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyDefinition#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyDefinition#getChildren()
   * @see #getPropertyDefinition()
   * @generated
   */
  EReference getPropertyDefinition_Children();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyDefinition#getSimpleValue <em>Simple Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Simple Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyDefinition#getSimpleValue()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_SimpleValue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyDefinition#getEndname <em>Endname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Endname</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyDefinition#getEndname()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_Endname();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FXMLFactory getFXMLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.ModelImpl
     * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.FXMLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Xml Dec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__XML_DEC = eINSTANCE.getModel_XmlDec();

    /**
     * The meta object literal for the '<em><b>Comments</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__COMMENTS = eINSTANCE.getModel_Comments();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ROOT = eINSTANCE.getModel_Root();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.ProcessingInstructionImpl <em>Processing Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.ProcessingInstructionImpl
     * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.FXMLPackageImpl#getProcessingInstruction()
     * @generated
     */
    EClass PROCESSING_INSTRUCTION = eINSTANCE.getProcessingInstruction();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESSING_INSTRUCTION__TYPE = eINSTANCE.getProcessingInstruction_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESSING_INSTRUCTION__VALUE = eINSTANCE.getProcessingInstruction_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.ClassDefinitionImpl <em>Class Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.ClassDefinitionImpl
     * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.FXMLPackageImpl#getClassDefinition()
     * @generated
     */
    EClass CLASS_DEFINITION = eINSTANCE.getClassDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DEFINITION__NAME = eINSTANCE.getClassDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DEFINITION__ATTRIBUTES = eINSTANCE.getClassDefinition_Attributes();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DEFINITION__CHILDREN = eINSTANCE.getClassDefinition_Children();

    /**
     * The meta object literal for the '<em><b>Endname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DEFINITION__ENDNAME = eINSTANCE.getClassDefinition_Endname();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.PropertyAttributeDefinitionImpl <em>Property Attribute Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.PropertyAttributeDefinitionImpl
     * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.FXMLPackageImpl#getPropertyAttributeDefinition()
     * @generated
     */
    EClass PROPERTY_ATTRIBUTE_DEFINITION = eINSTANCE.getPropertyAttributeDefinition();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_ATTRIBUTE_DEFINITION__NAMESPACE = eINSTANCE.getPropertyAttributeDefinition_Namespace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_ATTRIBUTE_DEFINITION__NAME = eINSTANCE.getPropertyAttributeDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_ATTRIBUTE_DEFINITION__VALUE = eINSTANCE.getPropertyAttributeDefinition_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.PropertyDefinitionImpl
     * @see at.bestsolution.efxclipse.tooling.fxml2.fXML.impl.FXMLPackageImpl#getPropertyDefinition()
     * @generated
     */
    EClass PROPERTY_DEFINITION = eINSTANCE.getPropertyDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__NAME = eINSTANCE.getPropertyDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DEFINITION__CHILDREN = eINSTANCE.getPropertyDefinition_Children();

    /**
     * The meta object literal for the '<em><b>Simple Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__SIMPLE_VALUE = eINSTANCE.getPropertyDefinition_SimpleValue();

    /**
     * The meta object literal for the '<em><b>Endname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__ENDNAME = eINSTANCE.getPropertyDefinition_Endname();

  }

} //FXMLPackage
