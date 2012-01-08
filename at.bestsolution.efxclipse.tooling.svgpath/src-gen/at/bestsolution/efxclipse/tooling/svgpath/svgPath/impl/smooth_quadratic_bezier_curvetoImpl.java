/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_quadratic_bezier_curveto;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_quadratic_bezier_curveto_argument_sequence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>smooth quadratic bezier curveto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_quadratic_bezier_curvetoImpl#getSmooth_quadratic_bezier_curveto_argument_sequence <em>Smooth quadratic bezier curveto argument sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class smooth_quadratic_bezier_curvetoImpl extends drawto_commandImpl implements smooth_quadratic_bezier_curveto
{
  /**
   * The cached value of the '{@link #getSmooth_quadratic_bezier_curveto_argument_sequence() <em>Smooth quadratic bezier curveto argument sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSmooth_quadratic_bezier_curveto_argument_sequence()
   * @generated
   * @ordered
   */
  protected smooth_quadratic_bezier_curveto_argument_sequence smooth_quadratic_bezier_curveto_argument_sequence;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected smooth_quadratic_bezier_curvetoImpl()
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
    return SvgPathPackage.Literals.SMOOTH_QUADRATIC_BEZIER_CURVETO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public smooth_quadratic_bezier_curveto_argument_sequence getSmooth_quadratic_bezier_curveto_argument_sequence()
  {
    return smooth_quadratic_bezier_curveto_argument_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSmooth_quadratic_bezier_curveto_argument_sequence(smooth_quadratic_bezier_curveto_argument_sequence newSmooth_quadratic_bezier_curveto_argument_sequence, NotificationChain msgs)
  {
    smooth_quadratic_bezier_curveto_argument_sequence oldSmooth_quadratic_bezier_curveto_argument_sequence = smooth_quadratic_bezier_curveto_argument_sequence;
    smooth_quadratic_bezier_curveto_argument_sequence = newSmooth_quadratic_bezier_curveto_argument_sequence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.SMOOTH_QUADRATIC_BEZIER_CURVETO__SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE, oldSmooth_quadratic_bezier_curveto_argument_sequence, newSmooth_quadratic_bezier_curveto_argument_sequence);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSmooth_quadratic_bezier_curveto_argument_sequence(smooth_quadratic_bezier_curveto_argument_sequence newSmooth_quadratic_bezier_curveto_argument_sequence)
  {
    if (newSmooth_quadratic_bezier_curveto_argument_sequence != smooth_quadratic_bezier_curveto_argument_sequence)
    {
      NotificationChain msgs = null;
      if (smooth_quadratic_bezier_curveto_argument_sequence != null)
        msgs = ((InternalEObject)smooth_quadratic_bezier_curveto_argument_sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.SMOOTH_QUADRATIC_BEZIER_CURVETO__SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE, null, msgs);
      if (newSmooth_quadratic_bezier_curveto_argument_sequence != null)
        msgs = ((InternalEObject)newSmooth_quadratic_bezier_curveto_argument_sequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.SMOOTH_QUADRATIC_BEZIER_CURVETO__SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE, null, msgs);
      msgs = basicSetSmooth_quadratic_bezier_curveto_argument_sequence(newSmooth_quadratic_bezier_curveto_argument_sequence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.SMOOTH_QUADRATIC_BEZIER_CURVETO__SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE, newSmooth_quadratic_bezier_curveto_argument_sequence, newSmooth_quadratic_bezier_curveto_argument_sequence));
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
      case SvgPathPackage.SMOOTH_QUADRATIC_BEZIER_CURVETO__SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE:
        return basicSetSmooth_quadratic_bezier_curveto_argument_sequence(null, msgs);
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
      case SvgPathPackage.SMOOTH_QUADRATIC_BEZIER_CURVETO__SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE:
        return getSmooth_quadratic_bezier_curveto_argument_sequence();
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
      case SvgPathPackage.SMOOTH_QUADRATIC_BEZIER_CURVETO__SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE:
        setSmooth_quadratic_bezier_curveto_argument_sequence((smooth_quadratic_bezier_curveto_argument_sequence)newValue);
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
      case SvgPathPackage.SMOOTH_QUADRATIC_BEZIER_CURVETO__SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE:
        setSmooth_quadratic_bezier_curveto_argument_sequence((smooth_quadratic_bezier_curveto_argument_sequence)null);
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
      case SvgPathPackage.SMOOTH_QUADRATIC_BEZIER_CURVETO__SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE:
        return smooth_quadratic_bezier_curveto_argument_sequence != null;
    }
    return super.eIsSet(featureID);
  }

} //smooth_quadratic_bezier_curvetoImpl
