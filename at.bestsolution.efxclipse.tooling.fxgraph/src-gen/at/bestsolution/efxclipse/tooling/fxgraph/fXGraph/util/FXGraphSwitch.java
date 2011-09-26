/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.util;

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.*;

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
 * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphPackage
 * @generated
 */
public class FXGraphSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FXGraphPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FXGraphSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FXGraphPackage.eINSTANCE;
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
      case FXGraphPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXGraphPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXGraphPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = caseSingleValueProperty(element);
        if (result == null) result = caseListValueElement(element);
        if (result == null) result = caseValueProperty(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXGraphPackage.DEFINE:
      {
        Define define = (Define)theEObject;
        T result = caseDefine(define);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXGraphPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXGraphPackage.VALUE_PROPERTY:
      {
        ValueProperty valueProperty = (ValueProperty)theEObject;
        T result = caseValueProperty(valueProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXGraphPackage.SINGLE_VALUE_PROPERTY:
      {
        SingleValueProperty singleValueProperty = (SingleValueProperty)theEObject;
        T result = caseSingleValueProperty(singleValueProperty);
        if (result == null) result = caseValueProperty(singleValueProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXGraphPackage.MULTI_VALUE_PROPERTY:
      {
        MultiValueProperty multiValueProperty = (MultiValueProperty)theEObject;
        T result = caseMultiValueProperty(multiValueProperty);
        if (result == null) result = caseValueProperty(multiValueProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXGraphPackage.LIST_VALUE_ELEMENT:
      {
        ListValueElement listValueElement = (ListValueElement)theEObject;
        T result = caseListValueElement(listValueElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXGraphPackage.LIST_VALUE_PROPERTY:
      {
        ListValueProperty listValueProperty = (ListValueProperty)theEObject;
        T result = caseListValueProperty(listValueProperty);
        if (result == null) result = caseMultiValueProperty(listValueProperty);
        if (result == null) result = caseValueProperty(listValueProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXGraphPackage.MAP_VALUE_PROPERTY:
      {
        MapValueProperty mapValueProperty = (MapValueProperty)theEObject;
        T result = caseMapValueProperty(mapValueProperty);
        if (result == null) result = caseMultiValueProperty(mapValueProperty);
        if (result == null) result = caseValueProperty(mapValueProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY:
      {
        SimpleValueProperty simpleValueProperty = (SimpleValueProperty)theEObject;
        T result = caseSimpleValueProperty(simpleValueProperty);
        if (result == null) result = caseSingleValueProperty(simpleValueProperty);
        if (result == null) result = caseValueProperty(simpleValueProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXGraphPackage.REFERENCE_VALUE_PROPERTY:
      {
        ReferenceValueProperty referenceValueProperty = (ReferenceValueProperty)theEObject;
        T result = caseReferenceValueProperty(referenceValueProperty);
        if (result == null) result = caseSingleValueProperty(referenceValueProperty);
        if (result == null) result = caseListValueElement(referenceValueProperty);
        if (result == null) result = caseValueProperty(referenceValueProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY:
      {
        IncludeValueProperty includeValueProperty = (IncludeValueProperty)theEObject;
        T result = caseIncludeValueProperty(includeValueProperty);
        if (result == null) result = caseSingleValueProperty(includeValueProperty);
        if (result == null) result = caseListValueElement(includeValueProperty);
        if (result == null) result = caseValueProperty(includeValueProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Define</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Define</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefine(Define object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueProperty(ValueProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Value Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Value Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleValueProperty(SingleValueProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Value Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Value Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiValueProperty(MultiValueProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Value Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Value Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListValueElement(ListValueElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Value Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Value Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListValueProperty(ListValueProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Map Value Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Map Value Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapValueProperty(MapValueProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Value Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Value Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleValueProperty(SimpleValueProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference Value Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference Value Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceValueProperty(ReferenceValueProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Include Value Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Include Value Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIncludeValueProperty(IncludeValueProperty object)
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

} //FXGraphSwitch
