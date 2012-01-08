/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument_sequence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>curveto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.curvetoImpl#getCurveto_argument_sequence <em>Curveto argument sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class curvetoImpl extends drawto_commandImpl implements curveto
{
  /**
   * The cached value of the '{@link #getCurveto_argument_sequence() <em>Curveto argument sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurveto_argument_sequence()
   * @generated
   * @ordered
   */
  protected curveto_argument_sequence curveto_argument_sequence;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected curvetoImpl()
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
    return SvgPathPackage.Literals.CURVETO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public curveto_argument_sequence getCurveto_argument_sequence()
  {
    return curveto_argument_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCurveto_argument_sequence(curveto_argument_sequence newCurveto_argument_sequence, NotificationChain msgs)
  {
    curveto_argument_sequence oldCurveto_argument_sequence = curveto_argument_sequence;
    curveto_argument_sequence = newCurveto_argument_sequence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.CURVETO__CURVETO_ARGUMENT_SEQUENCE, oldCurveto_argument_sequence, newCurveto_argument_sequence);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCurveto_argument_sequence(curveto_argument_sequence newCurveto_argument_sequence)
  {
    if (newCurveto_argument_sequence != curveto_argument_sequence)
    {
      NotificationChain msgs = null;
      if (curveto_argument_sequence != null)
        msgs = ((InternalEObject)curveto_argument_sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.CURVETO__CURVETO_ARGUMENT_SEQUENCE, null, msgs);
      if (newCurveto_argument_sequence != null)
        msgs = ((InternalEObject)newCurveto_argument_sequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.CURVETO__CURVETO_ARGUMENT_SEQUENCE, null, msgs);
      msgs = basicSetCurveto_argument_sequence(newCurveto_argument_sequence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.CURVETO__CURVETO_ARGUMENT_SEQUENCE, newCurveto_argument_sequence, newCurveto_argument_sequence));
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
      case SvgPathPackage.CURVETO__CURVETO_ARGUMENT_SEQUENCE:
        return basicSetCurveto_argument_sequence(null, msgs);
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
      case SvgPathPackage.CURVETO__CURVETO_ARGUMENT_SEQUENCE:
        return getCurveto_argument_sequence();
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
      case SvgPathPackage.CURVETO__CURVETO_ARGUMENT_SEQUENCE:
        setCurveto_argument_sequence((curveto_argument_sequence)newValue);
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
      case SvgPathPackage.CURVETO__CURVETO_ARGUMENT_SEQUENCE:
        setCurveto_argument_sequence((curveto_argument_sequence)null);
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
      case SvgPathPackage.CURVETO__CURVETO_ARGUMENT_SEQUENCE:
        return curveto_argument_sequence != null;
    }
    return super.eIsSet(featureID);
  }

} //curvetoImpl
