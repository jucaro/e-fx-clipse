/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument_sequence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>elliptical arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arcImpl#getElliptical_arc_argument_sequence <em>Elliptical arc argument sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class elliptical_arcImpl extends drawto_commandImpl implements elliptical_arc
{
  /**
   * The cached value of the '{@link #getElliptical_arc_argument_sequence() <em>Elliptical arc argument sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElliptical_arc_argument_sequence()
   * @generated
   * @ordered
   */
  protected elliptical_arc_argument_sequence elliptical_arc_argument_sequence;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected elliptical_arcImpl()
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
    return SvgPathPackage.Literals.ELLIPTICAL_ARC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public elliptical_arc_argument_sequence getElliptical_arc_argument_sequence()
  {
    return elliptical_arc_argument_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElliptical_arc_argument_sequence(elliptical_arc_argument_sequence newElliptical_arc_argument_sequence, NotificationChain msgs)
  {
    elliptical_arc_argument_sequence oldElliptical_arc_argument_sequence = elliptical_arc_argument_sequence;
    elliptical_arc_argument_sequence = newElliptical_arc_argument_sequence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.ELLIPTICAL_ARC__ELLIPTICAL_ARC_ARGUMENT_SEQUENCE, oldElliptical_arc_argument_sequence, newElliptical_arc_argument_sequence);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElliptical_arc_argument_sequence(elliptical_arc_argument_sequence newElliptical_arc_argument_sequence)
  {
    if (newElliptical_arc_argument_sequence != elliptical_arc_argument_sequence)
    {
      NotificationChain msgs = null;
      if (elliptical_arc_argument_sequence != null)
        msgs = ((InternalEObject)elliptical_arc_argument_sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.ELLIPTICAL_ARC__ELLIPTICAL_ARC_ARGUMENT_SEQUENCE, null, msgs);
      if (newElliptical_arc_argument_sequence != null)
        msgs = ((InternalEObject)newElliptical_arc_argument_sequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.ELLIPTICAL_ARC__ELLIPTICAL_ARC_ARGUMENT_SEQUENCE, null, msgs);
      msgs = basicSetElliptical_arc_argument_sequence(newElliptical_arc_argument_sequence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.ELLIPTICAL_ARC__ELLIPTICAL_ARC_ARGUMENT_SEQUENCE, newElliptical_arc_argument_sequence, newElliptical_arc_argument_sequence));
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
      case SvgPathPackage.ELLIPTICAL_ARC__ELLIPTICAL_ARC_ARGUMENT_SEQUENCE:
        return basicSetElliptical_arc_argument_sequence(null, msgs);
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
      case SvgPathPackage.ELLIPTICAL_ARC__ELLIPTICAL_ARC_ARGUMENT_SEQUENCE:
        return getElliptical_arc_argument_sequence();
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
      case SvgPathPackage.ELLIPTICAL_ARC__ELLIPTICAL_ARC_ARGUMENT_SEQUENCE:
        setElliptical_arc_argument_sequence((elliptical_arc_argument_sequence)newValue);
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
      case SvgPathPackage.ELLIPTICAL_ARC__ELLIPTICAL_ARC_ARGUMENT_SEQUENCE:
        setElliptical_arc_argument_sequence((elliptical_arc_argument_sequence)null);
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
      case SvgPathPackage.ELLIPTICAL_ARC__ELLIPTICAL_ARC_ARGUMENT_SEQUENCE:
        return elliptical_arc_argument_sequence != null;
    }
    return super.eIsSet(featureID);
  }

} //elliptical_arcImpl
