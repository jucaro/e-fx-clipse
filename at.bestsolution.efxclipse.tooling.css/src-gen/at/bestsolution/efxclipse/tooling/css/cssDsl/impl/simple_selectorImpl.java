/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>simple selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.simple_selectorImpl#getElement <em>Element</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.simple_selectorImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.simple_selectorImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.simple_selectorImpl#getAttrib <em>Attrib</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.simple_selectorImpl#getPseudoclasses <em>Pseudoclasses</em>}</li>
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
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected EList<String> id;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected EList<String> class_;

  /**
   * The cached value of the '{@link #getAttrib() <em>Attrib</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrib()
   * @generated
   * @ordered
   */
  protected EList<String> attrib;

  /**
   * The cached value of the '{@link #getPseudoclasses() <em>Pseudoclasses</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPseudoclasses()
   * @generated
   * @ordered
   */
  protected EList<String> pseudoclasses;

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
  public EList<String> getId()
  {
    if (id == null)
    {
      id = new EDataTypeEList<String>(String.class, this, CssDslPackage.SIMPLE_SELECTOR__ID);
    }
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getClass_()
  {
    if (class_ == null)
    {
      class_ = new EDataTypeEList<String>(String.class, this, CssDslPackage.SIMPLE_SELECTOR__CLASS);
    }
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAttrib()
  {
    if (attrib == null)
    {
      attrib = new EDataTypeEList<String>(String.class, this, CssDslPackage.SIMPLE_SELECTOR__ATTRIB);
    }
    return attrib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPseudoclasses()
  {
    if (pseudoclasses == null)
    {
      pseudoclasses = new EDataTypeEList<String>(String.class, this, CssDslPackage.SIMPLE_SELECTOR__PSEUDOCLASSES);
    }
    return pseudoclasses;
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
      case CssDslPackage.SIMPLE_SELECTOR__ID:
        return getId();
      case CssDslPackage.SIMPLE_SELECTOR__CLASS:
        return getClass_();
      case CssDslPackage.SIMPLE_SELECTOR__ATTRIB:
        return getAttrib();
      case CssDslPackage.SIMPLE_SELECTOR__PSEUDOCLASSES:
        return getPseudoclasses();
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
      case CssDslPackage.SIMPLE_SELECTOR__ID:
        getId().clear();
        getId().addAll((Collection<? extends String>)newValue);
        return;
      case CssDslPackage.SIMPLE_SELECTOR__CLASS:
        getClass_().clear();
        getClass_().addAll((Collection<? extends String>)newValue);
        return;
      case CssDslPackage.SIMPLE_SELECTOR__ATTRIB:
        getAttrib().clear();
        getAttrib().addAll((Collection<? extends String>)newValue);
        return;
      case CssDslPackage.SIMPLE_SELECTOR__PSEUDOCLASSES:
        getPseudoclasses().clear();
        getPseudoclasses().addAll((Collection<? extends String>)newValue);
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
      case CssDslPackage.SIMPLE_SELECTOR__ID:
        getId().clear();
        return;
      case CssDslPackage.SIMPLE_SELECTOR__CLASS:
        getClass_().clear();
        return;
      case CssDslPackage.SIMPLE_SELECTOR__ATTRIB:
        getAttrib().clear();
        return;
      case CssDslPackage.SIMPLE_SELECTOR__PSEUDOCLASSES:
        getPseudoclasses().clear();
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
      case CssDslPackage.SIMPLE_SELECTOR__ID:
        return id != null && !id.isEmpty();
      case CssDslPackage.SIMPLE_SELECTOR__CLASS:
        return class_ != null && !class_.isEmpty();
      case CssDslPackage.SIMPLE_SELECTOR__ATTRIB:
        return attrib != null && !attrib.isEmpty();
      case CssDslPackage.SIMPLE_SELECTOR__PSEUDOCLASSES:
        return pseudoclasses != null && !pseudoclasses.isEmpty();
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
    result.append(", id: ");
    result.append(id);
    result.append(", class: ");
    result.append(class_);
    result.append(", attrib: ");
    result.append(attrib);
    result.append(", pseudoclasses: ");
    result.append(pseudoclasses);
    result.append(')');
    return result.toString();
  }

} //simple_selectorImpl
