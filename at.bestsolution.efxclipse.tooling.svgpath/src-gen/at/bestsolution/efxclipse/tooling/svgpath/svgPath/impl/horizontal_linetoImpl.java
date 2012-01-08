/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.horizontal_lineto;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.horizontal_lineto_argument_sequence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>horizontal lineto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.horizontal_linetoImpl#getHorizontal_lineto_argument_sequence <em>Horizontal lineto argument sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class horizontal_linetoImpl extends drawto_commandImpl implements horizontal_lineto
{
  /**
   * The cached value of the '{@link #getHorizontal_lineto_argument_sequence() <em>Horizontal lineto argument sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHorizontal_lineto_argument_sequence()
   * @generated
   * @ordered
   */
  protected horizontal_lineto_argument_sequence horizontal_lineto_argument_sequence;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected horizontal_linetoImpl()
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
    return SvgPathPackage.Literals.HORIZONTAL_LINETO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public horizontal_lineto_argument_sequence getHorizontal_lineto_argument_sequence()
  {
    return horizontal_lineto_argument_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHorizontal_lineto_argument_sequence(horizontal_lineto_argument_sequence newHorizontal_lineto_argument_sequence, NotificationChain msgs)
  {
    horizontal_lineto_argument_sequence oldHorizontal_lineto_argument_sequence = horizontal_lineto_argument_sequence;
    horizontal_lineto_argument_sequence = newHorizontal_lineto_argument_sequence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.HORIZONTAL_LINETO__HORIZONTAL_LINETO_ARGUMENT_SEQUENCE, oldHorizontal_lineto_argument_sequence, newHorizontal_lineto_argument_sequence);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHorizontal_lineto_argument_sequence(horizontal_lineto_argument_sequence newHorizontal_lineto_argument_sequence)
  {
    if (newHorizontal_lineto_argument_sequence != horizontal_lineto_argument_sequence)
    {
      NotificationChain msgs = null;
      if (horizontal_lineto_argument_sequence != null)
        msgs = ((InternalEObject)horizontal_lineto_argument_sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.HORIZONTAL_LINETO__HORIZONTAL_LINETO_ARGUMENT_SEQUENCE, null, msgs);
      if (newHorizontal_lineto_argument_sequence != null)
        msgs = ((InternalEObject)newHorizontal_lineto_argument_sequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.HORIZONTAL_LINETO__HORIZONTAL_LINETO_ARGUMENT_SEQUENCE, null, msgs);
      msgs = basicSetHorizontal_lineto_argument_sequence(newHorizontal_lineto_argument_sequence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.HORIZONTAL_LINETO__HORIZONTAL_LINETO_ARGUMENT_SEQUENCE, newHorizontal_lineto_argument_sequence, newHorizontal_lineto_argument_sequence));
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
      case SvgPathPackage.HORIZONTAL_LINETO__HORIZONTAL_LINETO_ARGUMENT_SEQUENCE:
        return basicSetHorizontal_lineto_argument_sequence(null, msgs);
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
      case SvgPathPackage.HORIZONTAL_LINETO__HORIZONTAL_LINETO_ARGUMENT_SEQUENCE:
        return getHorizontal_lineto_argument_sequence();
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
      case SvgPathPackage.HORIZONTAL_LINETO__HORIZONTAL_LINETO_ARGUMENT_SEQUENCE:
        setHorizontal_lineto_argument_sequence((horizontal_lineto_argument_sequence)newValue);
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
      case SvgPathPackage.HORIZONTAL_LINETO__HORIZONTAL_LINETO_ARGUMENT_SEQUENCE:
        setHorizontal_lineto_argument_sequence((horizontal_lineto_argument_sequence)null);
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
      case SvgPathPackage.HORIZONTAL_LINETO__HORIZONTAL_LINETO_ARGUMENT_SEQUENCE:
        return horizontal_lineto_argument_sequence != null;
    }
    return super.eIsSet(featureID);
  }

} //horizontal_linetoImpl
