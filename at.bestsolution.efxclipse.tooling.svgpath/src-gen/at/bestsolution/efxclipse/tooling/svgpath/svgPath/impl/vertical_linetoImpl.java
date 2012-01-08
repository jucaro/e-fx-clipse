/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.vertical_lineto;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.vertical_lineto_argument_sequence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>vertical lineto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.vertical_linetoImpl#getVertical_lineto_argument_sequence <em>Vertical lineto argument sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class vertical_linetoImpl extends drawto_commandImpl implements vertical_lineto
{
  /**
   * The cached value of the '{@link #getVertical_lineto_argument_sequence() <em>Vertical lineto argument sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVertical_lineto_argument_sequence()
   * @generated
   * @ordered
   */
  protected vertical_lineto_argument_sequence vertical_lineto_argument_sequence;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected vertical_linetoImpl()
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
    return SvgPathPackage.Literals.VERTICAL_LINETO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public vertical_lineto_argument_sequence getVertical_lineto_argument_sequence()
  {
    return vertical_lineto_argument_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVertical_lineto_argument_sequence(vertical_lineto_argument_sequence newVertical_lineto_argument_sequence, NotificationChain msgs)
  {
    vertical_lineto_argument_sequence oldVertical_lineto_argument_sequence = vertical_lineto_argument_sequence;
    vertical_lineto_argument_sequence = newVertical_lineto_argument_sequence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.VERTICAL_LINETO__VERTICAL_LINETO_ARGUMENT_SEQUENCE, oldVertical_lineto_argument_sequence, newVertical_lineto_argument_sequence);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVertical_lineto_argument_sequence(vertical_lineto_argument_sequence newVertical_lineto_argument_sequence)
  {
    if (newVertical_lineto_argument_sequence != vertical_lineto_argument_sequence)
    {
      NotificationChain msgs = null;
      if (vertical_lineto_argument_sequence != null)
        msgs = ((InternalEObject)vertical_lineto_argument_sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.VERTICAL_LINETO__VERTICAL_LINETO_ARGUMENT_SEQUENCE, null, msgs);
      if (newVertical_lineto_argument_sequence != null)
        msgs = ((InternalEObject)newVertical_lineto_argument_sequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.VERTICAL_LINETO__VERTICAL_LINETO_ARGUMENT_SEQUENCE, null, msgs);
      msgs = basicSetVertical_lineto_argument_sequence(newVertical_lineto_argument_sequence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.VERTICAL_LINETO__VERTICAL_LINETO_ARGUMENT_SEQUENCE, newVertical_lineto_argument_sequence, newVertical_lineto_argument_sequence));
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
      case SvgPathPackage.VERTICAL_LINETO__VERTICAL_LINETO_ARGUMENT_SEQUENCE:
        return basicSetVertical_lineto_argument_sequence(null, msgs);
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
      case SvgPathPackage.VERTICAL_LINETO__VERTICAL_LINETO_ARGUMENT_SEQUENCE:
        return getVertical_lineto_argument_sequence();
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
      case SvgPathPackage.VERTICAL_LINETO__VERTICAL_LINETO_ARGUMENT_SEQUENCE:
        setVertical_lineto_argument_sequence((vertical_lineto_argument_sequence)newValue);
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
      case SvgPathPackage.VERTICAL_LINETO__VERTICAL_LINETO_ARGUMENT_SEQUENCE:
        setVertical_lineto_argument_sequence((vertical_lineto_argument_sequence)null);
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
      case SvgPathPackage.VERTICAL_LINETO__VERTICAL_LINETO_ARGUMENT_SEQUENCE:
        return vertical_lineto_argument_sequence != null;
    }
    return super.eIsSet(featureID);
  }

} //vertical_linetoImpl
