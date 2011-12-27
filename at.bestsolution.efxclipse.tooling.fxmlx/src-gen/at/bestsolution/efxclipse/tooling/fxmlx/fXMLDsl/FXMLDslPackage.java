/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl;

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
 * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslFactory
 * @model kind="package"
 * @generated
 */
public interface FXMLDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fXMLDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bestsolution.at/efxclipse/tooling/fxmlx/FXMLDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fXMLDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FXMLDslPackage eINSTANCE = at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslPackageImpl.init();

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLImpl <em>FXML</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLImpl
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslPackageImpl#getFXML()
   * @generated
   */
  int FXML = 0;

  /**
   * The feature id for the '<em><b>Xml Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FXML__XML_DEC = 0;

  /**
   * The feature id for the '<em><b>Processing Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FXML__PROCESSING_INSTRUCTIONS = 1;

  /**
   * The feature id for the '<em><b>Root Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FXML__ROOT_ELEMENT = 2;

  /**
   * The number of structural features of the '<em>FXML</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FXML_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.XMLDecImpl <em>XML Dec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.XMLDecImpl
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslPackageImpl#getXMLDec()
   * @generated
   */
  int XML_DEC = 1;

  /**
   * The feature id for the '<em><b>Props</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_DEC__PROPS = 0;

  /**
   * The number of structural features of the '<em>XML Dec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XML_DEC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.ProcessingInstructionImpl <em>Processing Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.ProcessingInstructionImpl
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslPackageImpl#getProcessingInstruction()
   * @generated
   */
  int PROCESSING_INSTRUCTION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSING_INSTRUCTION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSING_INSTRUCTION__IMPORTED_NAMESPACE = 1;

  /**
   * The number of structural features of the '<em>Processing Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESSING_INSTRUCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.ElementDefinitionImpl
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslPackageImpl#getElementDefinition()
   * @generated
   */
  int ELEMENT_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DEFINITION__NAMESPACE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DEFINITION__NAME = 1;

  /**
   * The number of structural features of the '<em>Element Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.ContainerElementDefinitionImpl <em>Container Element Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.ContainerElementDefinitionImpl
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslPackageImpl#getContainerElementDefinition()
   * @generated
   */
  int CONTAINER_ELEMENT_DEFINITION = 4;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_ELEMENT_DEFINITION__NAMESPACE = ELEMENT_DEFINITION__NAMESPACE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_ELEMENT_DEFINITION__NAME = ELEMENT_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_ELEMENT_DEFINITION__PROPERTIES = ELEMENT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_ELEMENT_DEFINITION__CONTENT = ELEMENT_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_ELEMENT_DEFINITION__CHILDREN = ELEMENT_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Endnamespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_ELEMENT_DEFINITION__ENDNAMESPACE = ELEMENT_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Endname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_ELEMENT_DEFINITION__ENDNAME = ELEMENT_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Container Element Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_ELEMENT_DEFINITION_FEATURE_COUNT = ELEMENT_DEFINITION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.EmptyElementDefinitionImpl <em>Empty Element Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.EmptyElementDefinitionImpl
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslPackageImpl#getEmptyElementDefinition()
   * @generated
   */
  int EMPTY_ELEMENT_DEFINITION = 5;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_ELEMENT_DEFINITION__NAMESPACE = ELEMENT_DEFINITION__NAMESPACE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_ELEMENT_DEFINITION__NAME = ELEMENT_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Props</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_ELEMENT_DEFINITION__PROPS = ELEMENT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Empty Element Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_ELEMENT_DEFINITION_FEATURE_COUNT = ELEMENT_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.PCDataImpl <em>PC Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.PCDataImpl
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslPackageImpl#getPCData()
   * @generated
   */
  int PC_DATA = 6;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PC_DATA__CONTENT = 0;

  /**
   * The number of structural features of the '<em>PC Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PC_DATA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.AttributePropertyDefinitionImpl <em>Attribute Property Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.AttributePropertyDefinitionImpl
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslPackageImpl#getAttributePropertyDefinition()
   * @generated
   */
  int ATTRIBUTE_PROPERTY_DEFINITION = 7;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PROPERTY_DEFINITION__NAMESPACE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PROPERTY_DEFINITION__NAME = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PROPERTY_DEFINITION__VALUE = 2;

  /**
   * The number of structural features of the '<em>Attribute Property Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PROPERTY_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.QualifiedNameWithWildCardImpl <em>Qualified Name With Wild Card</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.QualifiedNameWithWildCardImpl
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslPackageImpl#getQualifiedNameWithWildCard()
   * @generated
   */
  int QUALIFIED_NAME_WITH_WILD_CARD = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_WITH_WILD_CARD__VALUE = 0;

  /**
   * The number of structural features of the '<em>Qualified Name With Wild Card</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_WITH_WILD_CARD_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML <em>FXML</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FXML</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML
   * @generated
   */
  EClass getFXML();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML#getXmlDec <em>Xml Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xml Dec</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML#getXmlDec()
   * @see #getFXML()
   * @generated
   */
  EReference getFXML_XmlDec();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML#getProcessingInstructions <em>Processing Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Processing Instructions</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML#getProcessingInstructions()
   * @see #getFXML()
   * @generated
   */
  EReference getFXML_ProcessingInstructions();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML#getRootElement <em>Root Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root Element</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML#getRootElement()
   * @see #getFXML()
   * @generated
   */
  EReference getFXML_RootElement();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.XMLDec <em>XML Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XML Dec</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.XMLDec
   * @generated
   */
  EClass getXMLDec();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.XMLDec#getProps <em>Props</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Props</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.XMLDec#getProps()
   * @see #getXMLDec()
   * @generated
   */
  EReference getXMLDec_Props();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction <em>Processing Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Processing Instruction</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction
   * @generated
   */
  EClass getProcessingInstruction();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction#getType()
   * @see #getProcessingInstruction()
   * @generated
   */
  EAttribute getProcessingInstruction_Type();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Imported Namespace</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction#getImportedNamespace()
   * @see #getProcessingInstruction()
   * @generated
   */
  EReference getProcessingInstruction_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ElementDefinition <em>Element Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Definition</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ElementDefinition
   * @generated
   */
  EClass getElementDefinition();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ElementDefinition#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namespace</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ElementDefinition#getNamespace()
   * @see #getElementDefinition()
   * @generated
   */
  EAttribute getElementDefinition_Namespace();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ElementDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ElementDefinition#getName()
   * @see #getElementDefinition()
   * @generated
   */
  EAttribute getElementDefinition_Name();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition <em>Container Element Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container Element Definition</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition
   * @generated
   */
  EClass getContainerElementDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition#getProperties()
   * @see #getContainerElementDefinition()
   * @generated
   */
  EReference getContainerElementDefinition_Properties();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition#getContent()
   * @see #getContainerElementDefinition()
   * @generated
   */
  EReference getContainerElementDefinition_Content();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition#getChildren()
   * @see #getContainerElementDefinition()
   * @generated
   */
  EReference getContainerElementDefinition_Children();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition#getEndnamespace <em>Endnamespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Endnamespace</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition#getEndnamespace()
   * @see #getContainerElementDefinition()
   * @generated
   */
  EAttribute getContainerElementDefinition_Endnamespace();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition#getEndname <em>Endname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Endname</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition#getEndname()
   * @see #getContainerElementDefinition()
   * @generated
   */
  EAttribute getContainerElementDefinition_Endname();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.EmptyElementDefinition <em>Empty Element Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty Element Definition</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.EmptyElementDefinition
   * @generated
   */
  EClass getEmptyElementDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.EmptyElementDefinition#getProps <em>Props</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Props</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.EmptyElementDefinition#getProps()
   * @see #getEmptyElementDefinition()
   * @generated
   */
  EReference getEmptyElementDefinition_Props();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.PCData <em>PC Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PC Data</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.PCData
   * @generated
   */
  EClass getPCData();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.PCData#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.PCData#getContent()
   * @see #getPCData()
   * @generated
   */
  EAttribute getPCData_Content();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.AttributePropertyDefinition <em>Attribute Property Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Property Definition</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.AttributePropertyDefinition
   * @generated
   */
  EClass getAttributePropertyDefinition();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.AttributePropertyDefinition#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namespace</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.AttributePropertyDefinition#getNamespace()
   * @see #getAttributePropertyDefinition()
   * @generated
   */
  EAttribute getAttributePropertyDefinition_Namespace();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.AttributePropertyDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.AttributePropertyDefinition#getName()
   * @see #getAttributePropertyDefinition()
   * @generated
   */
  EAttribute getAttributePropertyDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.AttributePropertyDefinition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.AttributePropertyDefinition#getValue()
   * @see #getAttributePropertyDefinition()
   * @generated
   */
  EAttribute getAttributePropertyDefinition_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.QualifiedNameWithWildCard <em>Qualified Name With Wild Card</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Name With Wild Card</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.QualifiedNameWithWildCard
   * @generated
   */
  EClass getQualifiedNameWithWildCard();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.QualifiedNameWithWildCard#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.QualifiedNameWithWildCard#getValue()
   * @see #getQualifiedNameWithWildCard()
   * @generated
   */
  EAttribute getQualifiedNameWithWildCard_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FXMLDslFactory getFXMLDslFactory();

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
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLImpl <em>FXML</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLImpl
     * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslPackageImpl#getFXML()
     * @generated
     */
    EClass FXML = eINSTANCE.getFXML();

    /**
     * The meta object literal for the '<em><b>Xml Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FXML__XML_DEC = eINSTANCE.getFXML_XmlDec();

    /**
     * The meta object literal for the '<em><b>Processing Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FXML__PROCESSING_INSTRUCTIONS = eINSTANCE.getFXML_ProcessingInstructions();

    /**
     * The meta object literal for the '<em><b>Root Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FXML__ROOT_ELEMENT = eINSTANCE.getFXML_RootElement();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.XMLDecImpl <em>XML Dec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.XMLDecImpl
     * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslPackageImpl#getXMLDec()
     * @generated
     */
    EClass XML_DEC = eINSTANCE.getXMLDec();

    /**
     * The meta object literal for the '<em><b>Props</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XML_DEC__PROPS = eINSTANCE.getXMLDec_Props();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.ProcessingInstructionImpl <em>Processing Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.ProcessingInstructionImpl
     * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslPackageImpl#getProcessingInstruction()
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
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESSING_INSTRUCTION__IMPORTED_NAMESPACE = eINSTANCE.getProcessingInstruction_ImportedNamespace();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.ElementDefinitionImpl
     * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslPackageImpl#getElementDefinition()
     * @generated
     */
    EClass ELEMENT_DEFINITION = eINSTANCE.getElementDefinition();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_DEFINITION__NAMESPACE = eINSTANCE.getElementDefinition_Namespace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_DEFINITION__NAME = eINSTANCE.getElementDefinition_Name();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.ContainerElementDefinitionImpl <em>Container Element Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.ContainerElementDefinitionImpl
     * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslPackageImpl#getContainerElementDefinition()
     * @generated
     */
    EClass CONTAINER_ELEMENT_DEFINITION = eINSTANCE.getContainerElementDefinition();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER_ELEMENT_DEFINITION__PROPERTIES = eINSTANCE.getContainerElementDefinition_Properties();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER_ELEMENT_DEFINITION__CONTENT = eINSTANCE.getContainerElementDefinition_Content();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER_ELEMENT_DEFINITION__CHILDREN = eINSTANCE.getContainerElementDefinition_Children();

    /**
     * The meta object literal for the '<em><b>Endnamespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_ELEMENT_DEFINITION__ENDNAMESPACE = eINSTANCE.getContainerElementDefinition_Endnamespace();

    /**
     * The meta object literal for the '<em><b>Endname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER_ELEMENT_DEFINITION__ENDNAME = eINSTANCE.getContainerElementDefinition_Endname();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.EmptyElementDefinitionImpl <em>Empty Element Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.EmptyElementDefinitionImpl
     * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslPackageImpl#getEmptyElementDefinition()
     * @generated
     */
    EClass EMPTY_ELEMENT_DEFINITION = eINSTANCE.getEmptyElementDefinition();

    /**
     * The meta object literal for the '<em><b>Props</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMPTY_ELEMENT_DEFINITION__PROPS = eINSTANCE.getEmptyElementDefinition_Props();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.PCDataImpl <em>PC Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.PCDataImpl
     * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslPackageImpl#getPCData()
     * @generated
     */
    EClass PC_DATA = eINSTANCE.getPCData();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PC_DATA__CONTENT = eINSTANCE.getPCData_Content();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.AttributePropertyDefinitionImpl <em>Attribute Property Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.AttributePropertyDefinitionImpl
     * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslPackageImpl#getAttributePropertyDefinition()
     * @generated
     */
    EClass ATTRIBUTE_PROPERTY_DEFINITION = eINSTANCE.getAttributePropertyDefinition();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_PROPERTY_DEFINITION__NAMESPACE = eINSTANCE.getAttributePropertyDefinition_Namespace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_PROPERTY_DEFINITION__NAME = eINSTANCE.getAttributePropertyDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_PROPERTY_DEFINITION__VALUE = eINSTANCE.getAttributePropertyDefinition_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.QualifiedNameWithWildCardImpl <em>Qualified Name With Wild Card</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.QualifiedNameWithWildCardImpl
     * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.FXMLDslPackageImpl#getQualifiedNameWithWildCard()
     * @generated
     */
    EClass QUALIFIED_NAME_WITH_WILD_CARD = eINSTANCE.getQualifiedNameWithWildCard();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIED_NAME_WITH_WILD_CARD__VALUE = eINSTANCE.getQualifiedNameWithWildCard_Value();

  }

} //FXMLDslPackage
