/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.number;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.numberImpl#getSign <em>Sign</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.numberImpl#getNonnegative_number <em>Nonnegative number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class numberImpl extends coordinateImpl implements number
{
  /**
   * The default value of the '{@link #getSign() <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSign()
   * @generated
   * @ordered
   */
  protected static final String SIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSign() <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSign()
   * @generated
   * @ordered
   */
  protected String sign = SIGN_EDEFAULT;

  /**
   * The cached value of the '{@link #getNonnegative_number() <em>Nonnegative number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNonnegative_number()
   * @generated
   * @ordered
   */
  protected nonnegative_number nonnegative_number;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected numberImpl()
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
    return SvgPathPackage.Literals.NUMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSign()
  {
    return sign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSign(String newSign)
  {
    String oldSign = sign;
    sign = newSign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.NUMBER__SIGN, oldSign, sign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nonnegative_number getNonnegative_number()
  {
    return nonnegative_number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNonnegative_number(nonnegative_number newNonnegative_number, NotificationChain msgs)
  {
    nonnegative_number oldNonnegative_number = nonnegative_number;
    nonnegative_number = newNonnegative_number;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.NUMBER__NONNEGATIVE_NUMBER, oldNonnegative_number, newNonnegative_number);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNonnegative_number(nonnegative_number newNonnegative_number)
  {
    if (newNonnegative_number != nonnegative_number)
    {
      NotificationChain msgs = null;
      if (nonnegative_number != null)
        msgs = ((InternalEObject)nonnegative_number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.NUMBER__NONNEGATIVE_NUMBER, null, msgs);
      if (newNonnegative_number != null)
        msgs = ((InternalEObject)newNonnegative_number).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.NUMBER__NONNEGATIVE_NUMBER, null, msgs);
      msgs = basicSetNonnegative_number(newNonnegative_number, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.NUMBER__NONNEGATIVE_NUMBER, newNonnegative_number, newNonnegative_number));
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
      case SvgPathPackage.NUMBER__NONNEGATIVE_NUMBER:
        return basicSetNonnegative_number(null, msgs);
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
      case SvgPathPackage.NUMBER__SIGN:
        return getSign();
      case SvgPathPackage.NUMBER__NONNEGATIVE_NUMBER:
        return getNonnegative_number();
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
      case SvgPathPackage.NUMBER__SIGN:
        setSign((String)newValue);
        return;
      case SvgPathPackage.NUMBER__NONNEGATIVE_NUMBER:
        setNonnegative_number((nonnegative_number)newValue);
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
      case SvgPathPackage.NUMBER__SIGN:
        setSign(SIGN_EDEFAULT);
        return;
      case SvgPathPackage.NUMBER__NONNEGATIVE_NUMBER:
        setNonnegative_number((nonnegative_number)null);
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
      case SvgPathPackage.NUMBER__SIGN:
        return SIGN_EDEFAULT == null ? sign != null : !SIGN_EDEFAULT.equals(sign);
      case SvgPathPackage.NUMBER__NONNEGATIVE_NUMBER:
        return nonnegative_number != null;
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
    result.append(" (sign: ");
    result.append(sign);
    result.append(')');
    return result.toString();
  }

} //numberImpl
