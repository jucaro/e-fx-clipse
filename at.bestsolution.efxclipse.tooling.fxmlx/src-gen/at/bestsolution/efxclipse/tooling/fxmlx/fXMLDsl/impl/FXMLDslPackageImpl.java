/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl;

import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.AttributePropertyDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ElementDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.EmptyElementDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslFactory;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.PCData;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.XMLDec;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FXMLDslPackageImpl extends EPackageImpl implements FXMLDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fxmlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xmlDecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass processingInstructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerElementDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emptyElementDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pcDataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributePropertyDefinitionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FXMLDslPackageImpl()
  {
    super(eNS_URI, FXMLDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link FXMLDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FXMLDslPackage init()
  {
    if (isInited) return (FXMLDslPackage)EPackage.Registry.INSTANCE.getEPackage(FXMLDslPackage.eNS_URI);

    // Obtain or create and register package
    FXMLDslPackageImpl theFXMLDslPackage = (FXMLDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FXMLDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FXMLDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theFXMLDslPackage.createPackageContents();

    // Initialize created meta-data
    theFXMLDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFXMLDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FXMLDslPackage.eNS_URI, theFXMLDslPackage);
    return theFXMLDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFXML()
  {
    return fxmlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFXML_XmlDec()
  {
    return (EReference)fxmlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFXML_ProcessingInstructions()
  {
    return (EReference)fxmlEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFXML_RootElement()
  {
    return (EReference)fxmlEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXMLDec()
  {
    return xmlDecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXMLDec_Props()
  {
    return (EReference)xmlDecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProcessingInstruction()
  {
    return processingInstructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcessingInstruction_Type()
  {
    return (EAttribute)processingInstructionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProcessingInstruction_ImportedNamespace()
  {
    return (EAttribute)processingInstructionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementDefinition()
  {
    return elementDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementDefinition_Namespace()
  {
    return (EAttribute)elementDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementDefinition_Name()
  {
    return (EAttribute)elementDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainerElementDefinition()
  {
    return containerElementDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerElementDefinition_Properties()
  {
    return (EReference)containerElementDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerElementDefinition_Content()
  {
    return (EReference)containerElementDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerElementDefinition_Children()
  {
    return (EReference)containerElementDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainerElementDefinition_Endnamespace()
  {
    return (EAttribute)containerElementDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainerElementDefinition_Endname()
  {
    return (EAttribute)containerElementDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmptyElementDefinition()
  {
    return emptyElementDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmptyElementDefinition_Props()
  {
    return (EReference)emptyElementDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPCData()
  {
    return pcDataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPCData_Content()
  {
    return (EAttribute)pcDataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributePropertyDefinition()
  {
    return attributePropertyDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributePropertyDefinition_Namespace()
  {
    return (EAttribute)attributePropertyDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributePropertyDefinition_Name()
  {
    return (EAttribute)attributePropertyDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributePropertyDefinition_Value()
  {
    return (EAttribute)attributePropertyDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FXMLDslFactory getFXMLDslFactory()
  {
    return (FXMLDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    fxmlEClass = createEClass(FXML);
    createEReference(fxmlEClass, FXML__XML_DEC);
    createEReference(fxmlEClass, FXML__PROCESSING_INSTRUCTIONS);
    createEReference(fxmlEClass, FXML__ROOT_ELEMENT);

    xmlDecEClass = createEClass(XML_DEC);
    createEReference(xmlDecEClass, XML_DEC__PROPS);

    processingInstructionEClass = createEClass(PROCESSING_INSTRUCTION);
    createEAttribute(processingInstructionEClass, PROCESSING_INSTRUCTION__TYPE);
    createEAttribute(processingInstructionEClass, PROCESSING_INSTRUCTION__IMPORTED_NAMESPACE);

    elementDefinitionEClass = createEClass(ELEMENT_DEFINITION);
    createEAttribute(elementDefinitionEClass, ELEMENT_DEFINITION__NAMESPACE);
    createEAttribute(elementDefinitionEClass, ELEMENT_DEFINITION__NAME);

    containerElementDefinitionEClass = createEClass(CONTAINER_ELEMENT_DEFINITION);
    createEReference(containerElementDefinitionEClass, CONTAINER_ELEMENT_DEFINITION__PROPERTIES);
    createEReference(containerElementDefinitionEClass, CONTAINER_ELEMENT_DEFINITION__CONTENT);
    createEReference(containerElementDefinitionEClass, CONTAINER_ELEMENT_DEFINITION__CHILDREN);
    createEAttribute(containerElementDefinitionEClass, CONTAINER_ELEMENT_DEFINITION__ENDNAMESPACE);
    createEAttribute(containerElementDefinitionEClass, CONTAINER_ELEMENT_DEFINITION__ENDNAME);

    emptyElementDefinitionEClass = createEClass(EMPTY_ELEMENT_DEFINITION);
    createEReference(emptyElementDefinitionEClass, EMPTY_ELEMENT_DEFINITION__PROPS);

    pcDataEClass = createEClass(PC_DATA);
    createEAttribute(pcDataEClass, PC_DATA__CONTENT);

    attributePropertyDefinitionEClass = createEClass(ATTRIBUTE_PROPERTY_DEFINITION);
    createEAttribute(attributePropertyDefinitionEClass, ATTRIBUTE_PROPERTY_DEFINITION__NAMESPACE);
    createEAttribute(attributePropertyDefinitionEClass, ATTRIBUTE_PROPERTY_DEFINITION__NAME);
    createEAttribute(attributePropertyDefinitionEClass, ATTRIBUTE_PROPERTY_DEFINITION__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    containerElementDefinitionEClass.getESuperTypes().add(this.getElementDefinition());
    emptyElementDefinitionEClass.getESuperTypes().add(this.getElementDefinition());

    // Initialize classes and features; add operations and parameters
    initEClass(fxmlEClass, at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML.class, "FXML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFXML_XmlDec(), this.getXMLDec(), null, "xmlDec", null, 0, 1, at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFXML_ProcessingInstructions(), this.getProcessingInstruction(), null, "processingInstructions", null, 0, -1, at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFXML_RootElement(), this.getElementDefinition(), null, "rootElement", null, 0, 1, at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xmlDecEClass, XMLDec.class, "XMLDec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXMLDec_Props(), this.getAttributePropertyDefinition(), null, "props", null, 0, -1, XMLDec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(processingInstructionEClass, ProcessingInstruction.class, "ProcessingInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProcessingInstruction_Type(), ecorePackage.getEString(), "type", null, 0, 1, ProcessingInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProcessingInstruction_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, ProcessingInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementDefinitionEClass, ElementDefinition.class, "ElementDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementDefinition_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getElementDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(containerElementDefinitionEClass, ContainerElementDefinition.class, "ContainerElementDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContainerElementDefinition_Properties(), this.getAttributePropertyDefinition(), null, "properties", null, 0, -1, ContainerElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainerElementDefinition_Content(), this.getPCData(), null, "content", null, 0, 1, ContainerElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainerElementDefinition_Children(), this.getElementDefinition(), null, "children", null, 0, -1, ContainerElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainerElementDefinition_Endnamespace(), ecorePackage.getEString(), "endnamespace", null, 0, 1, ContainerElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainerElementDefinition_Endname(), ecorePackage.getEString(), "endname", null, 0, 1, ContainerElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(emptyElementDefinitionEClass, EmptyElementDefinition.class, "EmptyElementDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEmptyElementDefinition_Props(), this.getAttributePropertyDefinition(), null, "props", null, 0, -1, EmptyElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pcDataEClass, PCData.class, "PCData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPCData_Content(), ecorePackage.getEString(), "content", null, 0, 1, PCData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributePropertyDefinitionEClass, AttributePropertyDefinition.class, "AttributePropertyDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttributePropertyDefinition_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, AttributePropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttributePropertyDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, AttributePropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttributePropertyDefinition_Value(), ecorePackage.getEString(), "value", null, 0, 1, AttributePropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FXMLDslPackageImpl
