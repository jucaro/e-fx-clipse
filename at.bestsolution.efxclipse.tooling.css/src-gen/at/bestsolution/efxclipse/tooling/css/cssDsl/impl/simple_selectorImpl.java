/**
 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.sub_selector;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>simple selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.simple_selectorImpl#getElement <em>Element</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.simple_selectorImpl#getUniversal <em>Universal</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.simple_selectorImpl#getSubSelectors <em>Sub Selectors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class simple_selectorImpl extends MinimalEObjectImpl.Container implements simple_selector
{
  /**
   * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected static final String ELEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected String element = ELEMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getUniversal() <em>Universal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUniversal()
   * @generated
   * @ordered
   */
  protected static final String UNIVERSAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUniversal() <em>Universal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUniversal()
   * @generated
   * @ordered
   */
  protected String universal = UNIVERSAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubSelectors() <em>Sub Selectors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubSelectors()
   * @generated
   * @ordered
   */
  protected EList<sub_selector> subSelectors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected simple_selectorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CssDslPackage.Literals.SIMPLE_SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(String newElement)
  {
    String oldElement = element;
    element = newElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.SIMPLE_SELECTOR__ELEMENT, oldElement, element));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUniversal()
  {
    return universal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUniversal(String newUniversal)
  {
    String oldUniversal = universal;
    universal = newUniversal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.SIMPLE_SELECTOR__UNIVERSAL, oldUniversal, universal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<sub_selector> getSubSelectors()
  {
    if (subSelectors == null)
    {
      subSelectors = new EObjectContainmentEList<sub_selector>(sub_selector.class, this, CssDslPackage.SIMPLE_SELECTOR__SUB_SELECTORS);
    }
    return subSelectors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CssDslPackage.SIMPLE_SELECTOR__SUB_SELECTORS:
        return ((InternalEList<?>)getSubSelectors()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CssDslPackage.SIMPLE_SELECTOR__ELEMENT:
        return getElement();
      case CssDslPackage.SIMPLE_SELECTOR__UNIVERSAL:
        return getUniversal();
      case CssDslPackage.SIMPLE_SELECTOR__SUB_SELECTORS:
        return getSubSelectors();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CssDslPackage.SIMPLE_SELECTOR__ELEMENT:
        setElement((String)newValue);
        return;
      case CssDslPackage.SIMPLE_SELECTOR__UNIVERSAL:
        setUniversal((String)newValue);
        return;
      case CssDslPackage.SIMPLE_SELECTOR__SUB_SELECTORS:
        getSubSelectors().clear();
        getSubSelectors().addAll((Collection<? extends sub_selector>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CssDslPackage.SIMPLE_SELECTOR__ELEMENT:
        setElement(ELEMENT_EDEFAULT);
        return;
      case CssDslPackage.SIMPLE_SELECTOR__UNIVERSAL:
        setUniversal(UNIVERSAL_EDEFAULT);
        return;
      case CssDslPackage.SIMPLE_SELECTOR__SUB_SELECTORS:
        getSubSelectors().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CssDslPackage.SIMPLE_SELECTOR__ELEMENT:
        return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
      case CssDslPackage.SIMPLE_SELECTOR__UNIVERSAL:
        return UNIVERSAL_EDEFAULT == null ? universal != null : !UNIVERSAL_EDEFAULT.equals(universal);
      case CssDslPackage.SIMPLE_SELECTOR__SUB_SELECTORS:
        return subSelectors != null && !subSelectors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (element: ");
    result.append(element);
    result.append(", universal: ");
    result.append(universal);
    result.append(')');
    return result.toString();
  }

} //simple_selectorImpl
