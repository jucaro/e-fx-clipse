/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.digit_sequence;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.exponent;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>nonnegative number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.nonnegative_numberImpl#getIntseq <em>Intseq</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.nonnegative_numberImpl#getFloatseq <em>Floatseq</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.nonnegative_numberImpl#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class nonnegative_numberImpl extends MinimalEObjectImpl.Container implements nonnegative_number
{
  /**
   * The cached value of the '{@link #getIntseq() <em>Intseq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntseq()
   * @generated
   * @ordered
   */
  protected digit_sequence intseq;

  /**
   * The cached value of the '{@link #getFloatseq() <em>Floatseq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloatseq()
   * @generated
   * @ordered
   */
  protected digit_sequence floatseq;

  /**
   * The cached value of the '{@link #getExponent() <em>Exponent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExponent()
   * @generated
   * @ordered
   */
  protected exponent exponent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected nonnegative_numberImpl()
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
    return SvgPathPackage.Literals.NONNEGATIVE_NUMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public digit_sequence getIntseq()
  {
    return intseq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIntseq(digit_sequence newIntseq, NotificationChain msgs)
  {
    digit_sequence oldIntseq = intseq;
    intseq = newIntseq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.NONNEGATIVE_NUMBER__INTSEQ, oldIntseq, newIntseq);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntseq(digit_sequence newIntseq)
  {
    if (newIntseq != intseq)
    {
      NotificationChain msgs = null;
      if (intseq != null)
        msgs = ((InternalEObject)intseq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.NONNEGATIVE_NUMBER__INTSEQ, null, msgs);
      if (newIntseq != null)
        msgs = ((InternalEObject)newIntseq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.NONNEGATIVE_NUMBER__INTSEQ, null, msgs);
      msgs = basicSetIntseq(newIntseq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.NONNEGATIVE_NUMBER__INTSEQ, newIntseq, newIntseq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public digit_sequence getFloatseq()
  {
    return floatseq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFloatseq(digit_sequence newFloatseq, NotificationChain msgs)
  {
    digit_sequence oldFloatseq = floatseq;
    floatseq = newFloatseq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.NONNEGATIVE_NUMBER__FLOATSEQ, oldFloatseq, newFloatseq);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFloatseq(digit_sequence newFloatseq)
  {
    if (newFloatseq != floatseq)
    {
      NotificationChain msgs = null;
      if (floatseq != null)
        msgs = ((InternalEObject)floatseq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.NONNEGATIVE_NUMBER__FLOATSEQ, null, msgs);
      if (newFloatseq != null)
        msgs = ((InternalEObject)newFloatseq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.NONNEGATIVE_NUMBER__FLOATSEQ, null, msgs);
      msgs = basicSetFloatseq(newFloatseq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.NONNEGATIVE_NUMBER__FLOATSEQ, newFloatseq, newFloatseq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exponent getExponent()
  {
    return exponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExponent(exponent newExponent, NotificationChain msgs)
  {
    exponent oldExponent = exponent;
    exponent = newExponent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.NONNEGATIVE_NUMBER__EXPONENT, oldExponent, newExponent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExponent(exponent newExponent)
  {
    if (newExponent != exponent)
    {
      NotificationChain msgs = null;
      if (exponent != null)
        msgs = ((InternalEObject)exponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.NONNEGATIVE_NUMBER__EXPONENT, null, msgs);
      if (newExponent != null)
        msgs = ((InternalEObject)newExponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.NONNEGATIVE_NUMBER__EXPONENT, null, msgs);
      msgs = basicSetExponent(newExponent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.NONNEGATIVE_NUMBER__EXPONENT, newExponent, newExponent));
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
      case SvgPathPackage.NONNEGATIVE_NUMBER__INTSEQ:
        return basicSetIntseq(null, msgs);
      case SvgPathPackage.NONNEGATIVE_NUMBER__FLOATSEQ:
        return basicSetFloatseq(null, msgs);
      case SvgPathPackage.NONNEGATIVE_NUMBER__EXPONENT:
        return basicSetExponent(null, msgs);
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
      case SvgPathPackage.NONNEGATIVE_NUMBER__INTSEQ:
        return getIntseq();
      case SvgPathPackage.NONNEGATIVE_NUMBER__FLOATSEQ:
        return getFloatseq();
      case SvgPathPackage.NONNEGATIVE_NUMBER__EXPONENT:
        return getExponent();
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
      case SvgPathPackage.NONNEGATIVE_NUMBER__INTSEQ:
        setIntseq((digit_sequence)newValue);
        return;
      case SvgPathPackage.NONNEGATIVE_NUMBER__FLOATSEQ:
        setFloatseq((digit_sequence)newValue);
        return;
      case SvgPathPackage.NONNEGATIVE_NUMBER__EXPONENT:
        setExponent((exponent)newValue);
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
      case SvgPathPackage.NONNEGATIVE_NUMBER__INTSEQ:
        setIntseq((digit_sequence)null);
        return;
      case SvgPathPackage.NONNEGATIVE_NUMBER__FLOATSEQ:
        setFloatseq((digit_sequence)null);
        return;
      case SvgPathPackage.NONNEGATIVE_NUMBER__EXPONENT:
        setExponent((exponent)null);
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
      case SvgPathPackage.NONNEGATIVE_NUMBER__INTSEQ:
        return intseq != null;
      case SvgPathPackage.NONNEGATIVE_NUMBER__FLOATSEQ:
        return floatseq != null;
      case SvgPathPackage.NONNEGATIVE_NUMBER__EXPONENT:
        return exponent != null;
    }
    return super.eIsSet(featureID);
  }

} //nonnegative_numberImpl
