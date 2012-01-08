/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument_sequence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>smooth curveto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_curvetoImpl#getSmooth_curveto_argument_sequence <em>Smooth curveto argument sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class smooth_curvetoImpl extends drawto_commandImpl implements smooth_curveto
{
  /**
   * The cached value of the '{@link #getSmooth_curveto_argument_sequence() <em>Smooth curveto argument sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSmooth_curveto_argument_sequence()
   * @generated
   * @ordered
   */
  protected smooth_curveto_argument_sequence smooth_curveto_argument_sequence;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected smooth_curvetoImpl()
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
    return SvgPathPackage.Literals.SMOOTH_CURVETO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public smooth_curveto_argument_sequence getSmooth_curveto_argument_sequence()
  {
    return smooth_curveto_argument_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSmooth_curveto_argument_sequence(smooth_curveto_argument_sequence newSmooth_curveto_argument_sequence, NotificationChain msgs)
  {
    smooth_curveto_argument_sequence oldSmooth_curveto_argument_sequence = smooth_curveto_argument_sequence;
    smooth_curveto_argument_sequence = newSmooth_curveto_argument_sequence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.SMOOTH_CURVETO__SMOOTH_CURVETO_ARGUMENT_SEQUENCE, oldSmooth_curveto_argument_sequence, newSmooth_curveto_argument_sequence);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSmooth_curveto_argument_sequence(smooth_curveto_argument_sequence newSmooth_curveto_argument_sequence)
  {
    if (newSmooth_curveto_argument_sequence != smooth_curveto_argument_sequence)
    {
      NotificationChain msgs = null;
      if (smooth_curveto_argument_sequence != null)
        msgs = ((InternalEObject)smooth_curveto_argument_sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.SMOOTH_CURVETO__SMOOTH_CURVETO_ARGUMENT_SEQUENCE, null, msgs);
      if (newSmooth_curveto_argument_sequence != null)
        msgs = ((InternalEObject)newSmooth_curveto_argument_sequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.SMOOTH_CURVETO__SMOOTH_CURVETO_ARGUMENT_SEQUENCE, null, msgs);
      msgs = basicSetSmooth_curveto_argument_sequence(newSmooth_curveto_argument_sequence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.SMOOTH_CURVETO__SMOOTH_CURVETO_ARGUMENT_SEQUENCE, newSmooth_curveto_argument_sequence, newSmooth_curveto_argument_sequence));
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
      case SvgPathPackage.SMOOTH_CURVETO__SMOOTH_CURVETO_ARGUMENT_SEQUENCE:
        return basicSetSmooth_curveto_argument_sequence(null, msgs);
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
      case SvgPathPackage.SMOOTH_CURVETO__SMOOTH_CURVETO_ARGUMENT_SEQUENCE:
        return getSmooth_curveto_argument_sequence();
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
      case SvgPathPackage.SMOOTH_CURVETO__SMOOTH_CURVETO_ARGUMENT_SEQUENCE:
        setSmooth_curveto_argument_sequence((smooth_curveto_argument_sequence)newValue);
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
      case SvgPathPackage.SMOOTH_CURVETO__SMOOTH_CURVETO_ARGUMENT_SEQUENCE:
        setSmooth_curveto_argument_sequence((smooth_curveto_argument_sequence)null);
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
      case SvgPathPackage.SMOOTH_CURVETO__SMOOTH_CURVETO_ARGUMENT_SEQUENCE:
        return smooth_curveto_argument_sequence != null;
    }
    return super.eIsSet(featureID);
  }

} //smooth_curvetoImpl
