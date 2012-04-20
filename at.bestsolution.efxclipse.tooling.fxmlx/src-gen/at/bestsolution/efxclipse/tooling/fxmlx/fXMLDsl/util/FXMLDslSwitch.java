/**
 */
package at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.util;

import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage
 * @generated
 */
public class FXMLDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FXMLDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FXMLDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FXMLDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case FXMLDslPackage.FXML:
      {
        FXML fxml = (FXML)theEObject;
        T result = caseFXML(fxml);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXMLDslPackage.XML_DEC:
      {
        XMLDec xmlDec = (XMLDec)theEObject;
        T result = caseXMLDec(xmlDec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXMLDslPackage.PROCESSING_INSTRUCTION:
      {
        ProcessingInstruction processingInstruction = (ProcessingInstruction)theEObject;
        T result = caseProcessingInstruction(processingInstruction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXMLDslPackage.ELEMENT_DEFINITION:
      {
        ElementDefinition elementDefinition = (ElementDefinition)theEObject;
        T result = caseElementDefinition(elementDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION:
      {
        ContainerElementDefinition containerElementDefinition = (ContainerElementDefinition)theEObject;
        T result = caseContainerElementDefinition(containerElementDefinition);
        if (result == null) result = caseElementDefinition(containerElementDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXMLDslPackage.EMPTY_ELEMENT_DEFINITION:
      {
        EmptyElementDefinition emptyElementDefinition = (EmptyElementDefinition)theEObject;
        T result = caseEmptyElementDefinition(emptyElementDefinition);
        if (result == null) result = caseElementDefinition(emptyElementDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXMLDslPackage.PC_DATA:
      {
        PCData pcData = (PCData)theEObject;
        T result = casePCData(pcData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXMLDslPackage.ATTRIBUTE_PROPERTY_DEFINITION:
      {
        AttributePropertyDefinition attributePropertyDefinition = (AttributePropertyDefinition)theEObject;
        T result = caseAttributePropertyDefinition(attributePropertyDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXMLDslPackage.QUALIFIED_NAME_WITH_WILD_CARD:
      {
        QualifiedNameWithWildCard qualifiedNameWithWildCard = (QualifiedNameWithWildCard)theEObject;
        T result = caseQualifiedNameWithWildCard(qualifiedNameWithWildCard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FXML</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FXML</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFXML(FXML object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XML Dec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XML Dec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXMLDec(XMLDec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Processing Instruction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Processing Instruction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProcessingInstruction(ProcessingInstruction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementDefinition(ElementDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container Element Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container Element Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainerElementDefinition(ContainerElementDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty Element Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty Element Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmptyElementDefinition(EmptyElementDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PC Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PC Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePCData(PCData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Property Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Property Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributePropertyDefinition(AttributePropertyDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualified Name With Wild Card</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualified Name With Wild Card</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualifiedNameWithWildCard(QualifiedNameWithWildCard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //FXMLDslSwitch
