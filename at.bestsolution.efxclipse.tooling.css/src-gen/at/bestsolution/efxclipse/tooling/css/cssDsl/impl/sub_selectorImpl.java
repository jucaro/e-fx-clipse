/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.sub_selector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sub selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.sub_selectorImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.sub_selectorImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.sub_selectorImpl#getAttrib <em>Attrib</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.sub_selectorImpl#getPseudoclass <em>Pseudoclass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class sub_selectorImpl extends MinimalEObjectImpl.Container implements sub_selector
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected static final String CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected String class_ = CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #getAttrib() <em>Attrib</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrib()
   * @generated
   * @ordered
   */
  protected static final String ATTRIB_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttrib() <em>Attrib</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttrib()
   * @generated
   * @ordered
   */
  protected String attrib = ATTRIB_EDEFAULT;

  /**
   * The default value of the '{@link #getPseudoclass() <em>Pseudoclass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPseudoclass()
   * @generated
   * @ordered
   */
  protected static final String PSEUDOCLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPseudoclass() <em>Pseudoclass</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPseudoclass()
   * @generated
   * @ordered
   */
  protected String pseudoclass = PSEUDOCLASS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected sub_selectorImpl()
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
    return CssDslPackage.Literals.SUB_SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.SUB_SELECTOR__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClass_()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(String newClass)
  {
    String oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.SUB_SELECTOR__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttrib()
  {
    return attrib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttrib(String newAttrib)
  {
    String oldAttrib = attrib;
    attrib = newAttrib;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.SUB_SELECTOR__ATTRIB, oldAttrib, attrib));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPseudoclass()
  {
    return pseudoclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPseudoclass(String newPseudoclass)
  {
    String oldPseudoclass = pseudoclass;
    pseudoclass = newPseudoclass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.SUB_SELECTOR__PSEUDOCLASS, oldPseudoclass, pseudoclass));
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
      case CssDslPackage.SUB_SELECTOR__ID:
        return getId();
      case CssDslPackage.SUB_SELECTOR__CLASS:
        return getClass_();
      case CssDslPackage.SUB_SELECTOR__ATTRIB:
        return getAttrib();
      case CssDslPackage.SUB_SELECTOR__PSEUDOCLASS:
        return getPseudoclass();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CssDslPackage.SUB_SELECTOR__ID:
        setId((String)newValue);
        return;
      case CssDslPackage.SUB_SELECTOR__CLASS:
        setClass((String)newValue);
        return;
      case CssDslPackage.SUB_SELECTOR__ATTRIB:
        setAttrib((String)newValue);
        return;
      case CssDslPackage.SUB_SELECTOR__PSEUDOCLASS:
        setPseudoclass((String)newValue);
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
      case CssDslPackage.SUB_SELECTOR__ID:
        setId(ID_EDEFAULT);
        return;
      case CssDslPackage.SUB_SELECTOR__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case CssDslPackage.SUB_SELECTOR__ATTRIB:
        setAttrib(ATTRIB_EDEFAULT);
        return;
      case CssDslPackage.SUB_SELECTOR__PSEUDOCLASS:
        setPseudoclass(PSEUDOCLASS_EDEFAULT);
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
      case CssDslPackage.SUB_SELECTOR__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case CssDslPackage.SUB_SELECTOR__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
      case CssDslPackage.SUB_SELECTOR__ATTRIB:
        return ATTRIB_EDEFAULT == null ? attrib != null : !ATTRIB_EDEFAULT.equals(attrib);
      case CssDslPackage.SUB_SELECTOR__PSEUDOCLASS:
        return PSEUDOCLASS_EDEFAULT == null ? pseudoclass != null : !PSEUDOCLASS_EDEFAULT.equals(pseudoclass);
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
    result.append(" (id: ");
    result.append(id);
    result.append(", class: ");
    result.append(class_);
    result.append(", attrib: ");
    result.append(attrib);
    result.append(", pseudoclass: ");
    result.append(pseudoclass);
    result.append(')');
    return result.toString();
  }

} //sub_selectorImpl
