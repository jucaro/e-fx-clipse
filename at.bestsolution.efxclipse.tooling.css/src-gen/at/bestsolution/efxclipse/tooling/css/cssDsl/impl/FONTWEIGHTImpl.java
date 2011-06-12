/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.FONTWEIGHT;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FONTWEIGHT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.FONTWEIGHTImpl#getValueString <em>Value String</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.FONTWEIGHTImpl#getValueInt <em>Value Int</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FONTWEIGHTImpl extends MinimalEObjectImpl.Container implements FONTWEIGHT
{
  /**
   * The default value of the '{@link #getValueString() <em>Value String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueString()
   * @generated
   * @ordered
   */
  protected static final String VALUE_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValueString() <em>Value String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueString()
   * @generated
   * @ordered
   */
  protected String valueString = VALUE_STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getValueInt() <em>Value Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueInt()
   * @generated
   * @ordered
   */
  protected static final String VALUE_INT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValueInt() <em>Value Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueInt()
   * @generated
   * @ordered
   */
  protected String valueInt = VALUE_INT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FONTWEIGHTImpl()
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
    return CssDslPackage.Literals.FONTWEIGHT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValueString()
  {
    return valueString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueString(String newValueString)
  {
    String oldValueString = valueString;
    valueString = newValueString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.FONTWEIGHT__VALUE_STRING, oldValueString, valueString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValueInt()
  {
    return valueInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueInt(String newValueInt)
  {
    String oldValueInt = valueInt;
    valueInt = newValueInt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.FONTWEIGHT__VALUE_INT, oldValueInt, valueInt));
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
      case CssDslPackage.FONTWEIGHT__VALUE_STRING:
        return getValueString();
      case CssDslPackage.FONTWEIGHT__VALUE_INT:
        return getValueInt();
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
      case CssDslPackage.FONTWEIGHT__VALUE_STRING:
        setValueString((String)newValue);
        return;
      case CssDslPackage.FONTWEIGHT__VALUE_INT:
        setValueInt((String)newValue);
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
      case CssDslPackage.FONTWEIGHT__VALUE_STRING:
        setValueString(VALUE_STRING_EDEFAULT);
        return;
      case CssDslPackage.FONTWEIGHT__VALUE_INT:
        setValueInt(VALUE_INT_EDEFAULT);
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
      case CssDslPackage.FONTWEIGHT__VALUE_STRING:
        return VALUE_STRING_EDEFAULT == null ? valueString != null : !VALUE_STRING_EDEFAULT.equals(valueString);
      case CssDslPackage.FONTWEIGHT__VALUE_INT:
        return VALUE_INT_EDEFAULT == null ? valueInt != null : !VALUE_INT_EDEFAULT.equals(valueInt);
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
    result.append(" (valueString: ");
    result.append(valueString);
    result.append(", valueInt: ");
    result.append(valueInt);
    result.append(')');
    return result.toString();
  }

} //FONTWEIGHTImpl
