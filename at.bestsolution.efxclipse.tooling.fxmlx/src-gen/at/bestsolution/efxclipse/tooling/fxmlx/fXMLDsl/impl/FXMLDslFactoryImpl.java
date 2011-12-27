/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl;

import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FXMLDslFactoryImpl extends EFactoryImpl implements FXMLDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FXMLDslFactory init()
  {
    try
    {
      FXMLDslFactory theFXMLDslFactory = (FXMLDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.bestsolution.at/efxclipse/tooling/fxmlx/FXMLDsl"); 
      if (theFXMLDslFactory != null)
      {
        return theFXMLDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FXMLDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FXMLDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FXMLDslPackage.FXML: return createFXML();
      case FXMLDslPackage.XML_DEC: return createXMLDec();
      case FXMLDslPackage.PROCESSING_INSTRUCTION: return createProcessingInstruction();
      case FXMLDslPackage.ELEMENT_DEFINITION: return createElementDefinition();
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION: return createContainerElementDefinition();
      case FXMLDslPackage.EMPTY_ELEMENT_DEFINITION: return createEmptyElementDefinition();
      case FXMLDslPackage.PC_DATA: return createPCData();
      case FXMLDslPackage.ATTRIBUTE_PROPERTY_DEFINITION: return createAttributePropertyDefinition();
      case FXMLDslPackage.QUALIFIED_NAME_WITH_WILD_CARD: return createQualifiedNameWithWildCard();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FXML createFXML()
  {
    FXMLImpl fxml = new FXMLImpl();
    return fxml;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLDec createXMLDec()
  {
    XMLDecImpl xmlDec = new XMLDecImpl();
    return xmlDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessingInstruction createProcessingInstruction()
  {
    ProcessingInstructionImpl processingInstruction = new ProcessingInstructionImpl();
    return processingInstruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementDefinition createElementDefinition()
  {
    ElementDefinitionImpl elementDefinition = new ElementDefinitionImpl();
    return elementDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerElementDefinition createContainerElementDefinition()
  {
    ContainerElementDefinitionImpl containerElementDefinition = new ContainerElementDefinitionImpl();
    return containerElementDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptyElementDefinition createEmptyElementDefinition()
  {
    EmptyElementDefinitionImpl emptyElementDefinition = new EmptyElementDefinitionImpl();
    return emptyElementDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PCData createPCData()
  {
    PCDataImpl pcData = new PCDataImpl();
    return pcData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributePropertyDefinition createAttributePropertyDefinition()
  {
    AttributePropertyDefinitionImpl attributePropertyDefinition = new AttributePropertyDefinitionImpl();
    return attributePropertyDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedNameWithWildCard createQualifiedNameWithWildCard()
  {
    QualifiedNameWithWildCardImpl qualifiedNameWithWildCard = new QualifiedNameWithWildCardImpl();
    return qualifiedNameWithWildCard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FXMLDslPackage getFXMLDslPackage()
  {
    return (FXMLDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FXMLDslPackage getPackage()
  {
    return FXMLDslPackage.eINSTANCE;
  }

} //FXMLDslFactoryImpl
