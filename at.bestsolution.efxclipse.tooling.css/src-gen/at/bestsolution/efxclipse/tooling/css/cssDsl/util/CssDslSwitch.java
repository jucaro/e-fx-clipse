/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.util;

import at.bestsolution.efxclipse.tooling.css.cssDsl.*;

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
 * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage
 * @generated
 */
public class CssDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CssDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CssDslPackage.eINSTANCE;
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
      case CssDslPackage.STYLESHEET:
      {
        stylesheet stylesheet = (stylesheet)theEObject;
        T result = casestylesheet(stylesheet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.MEDIA:
      {
        media media = (media)theEObject;
        T result = casemedia(media);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.RULESET:
      {
        ruleset ruleset = (ruleset)theEObject;
        T result = caseruleset(ruleset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.SELECTOR:
      {
        selector selector = (selector)theEObject;
        T result = caseselector(selector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.SIMPLE_SELECTOR:
      {
        simple_selector simple_selector = (simple_selector)theEObject;
        T result = casesimple_selector(simple_selector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.CSS_DECLARATION:
      {
        css_declaration css_declaration = (css_declaration)theEObject;
        T result = casecss_declaration(css_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.CSS_GENERIC_DECLARATION:
      {
        css_generic_declaration css_generic_declaration = (css_generic_declaration)theEObject;
        T result = casecss_generic_declaration(css_generic_declaration);
        if (result == null) result = casecss_declaration(css_generic_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.EXPR:
      {
        expr expr = (expr)theEObject;
        T result = caseexpr(expr);
        if (result == null) result = casefunction(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.TERM_GROUP:
      {
        termGroup termGroup = (termGroup)theEObject;
        T result = casetermGroup(termGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.TERM:
      {
        term term = (term)theEObject;
        T result = caseterm(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.FUNCTION:
      {
        function function = (function)theEObject;
        T result = casefunction(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CssDslPackage.URL_TYPE:
      {
        URLType urlType = (URLType)theEObject;
        T result = caseURLType(urlType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>stylesheet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>stylesheet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestylesheet(stylesheet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>media</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>media</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemedia(media object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ruleset</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ruleset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseruleset(ruleset object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseselector(selector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>simple selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>simple selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesimple_selector(simple_selector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>css declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>css declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecss_declaration(css_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>css generic declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>css generic declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecss_generic_declaration(css_generic_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpr(expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>term Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>term Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetermGroup(termGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseterm(term object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunction(function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>URL Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>URL Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseURLType(URLType object)
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

} //CssDslSwitch
