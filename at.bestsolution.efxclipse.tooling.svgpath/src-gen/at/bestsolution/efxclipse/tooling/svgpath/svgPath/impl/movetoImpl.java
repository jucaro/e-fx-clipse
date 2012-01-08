/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate_pair;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.lineto_argument_sequence;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>moveto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.movetoImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.movetoImpl#getLineto_argument_sequence <em>Lineto argument sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class movetoImpl extends MinimalEObjectImpl.Container implements moveto
{
  /**
   * The cached value of the '{@link #getPoint() <em>Point</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPoint()
   * @generated
   * @ordered
   */
  protected coordinate_pair point;

  /**
   * The cached value of the '{@link #getLineto_argument_sequence() <em>Lineto argument sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineto_argument_sequence()
   * @generated
   * @ordered
   */
  protected lineto_argument_sequence lineto_argument_sequence;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected movetoImpl()
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
    return SvgPathPackage.Literals.MOVETO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public coordinate_pair getPoint()
  {
    return point;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPoint(coordinate_pair newPoint, NotificationChain msgs)
  {
    coordinate_pair oldPoint = point;
    point = newPoint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.MOVETO__POINT, oldPoint, newPoint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPoint(coordinate_pair newPoint)
  {
    if (newPoint != point)
    {
      NotificationChain msgs = null;
      if (point != null)
        msgs = ((InternalEObject)point).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.MOVETO__POINT, null, msgs);
      if (newPoint != null)
        msgs = ((InternalEObject)newPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.MOVETO__POINT, null, msgs);
      msgs = basicSetPoint(newPoint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.MOVETO__POINT, newPoint, newPoint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public lineto_argument_sequence getLineto_argument_sequence()
  {
    return lineto_argument_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLineto_argument_sequence(lineto_argument_sequence newLineto_argument_sequence, NotificationChain msgs)
  {
    lineto_argument_sequence oldLineto_argument_sequence = lineto_argument_sequence;
    lineto_argument_sequence = newLineto_argument_sequence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.MOVETO__LINETO_ARGUMENT_SEQUENCE, oldLineto_argument_sequence, newLineto_argument_sequence);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLineto_argument_sequence(lineto_argument_sequence newLineto_argument_sequence)
  {
    if (newLineto_argument_sequence != lineto_argument_sequence)
    {
      NotificationChain msgs = null;
      if (lineto_argument_sequence != null)
        msgs = ((InternalEObject)lineto_argument_sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.MOVETO__LINETO_ARGUMENT_SEQUENCE, null, msgs);
      if (newLineto_argument_sequence != null)
        msgs = ((InternalEObject)newLineto_argument_sequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.MOVETO__LINETO_ARGUMENT_SEQUENCE, null, msgs);
      msgs = basicSetLineto_argument_sequence(newLineto_argument_sequence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.MOVETO__LINETO_ARGUMENT_SEQUENCE, newLineto_argument_sequence, newLineto_argument_sequence));
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
      case SvgPathPackage.MOVETO__POINT:
        return basicSetPoint(null, msgs);
      case SvgPathPackage.MOVETO__LINETO_ARGUMENT_SEQUENCE:
        return basicSetLineto_argument_sequence(null, msgs);
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
      case SvgPathPackage.MOVETO__POINT:
        return getPoint();
      case SvgPathPackage.MOVETO__LINETO_ARGUMENT_SEQUENCE:
        return getLineto_argument_sequence();
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
      case SvgPathPackage.MOVETO__POINT:
        setPoint((coordinate_pair)newValue);
        return;
      case SvgPathPackage.MOVETO__LINETO_ARGUMENT_SEQUENCE:
        setLineto_argument_sequence((lineto_argument_sequence)newValue);
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
      case SvgPathPackage.MOVETO__POINT:
        setPoint((coordinate_pair)null);
        return;
      case SvgPathPackage.MOVETO__LINETO_ARGUMENT_SEQUENCE:
        setLineto_argument_sequence((lineto_argument_sequence)null);
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
      case SvgPathPackage.MOVETO__POINT:
        return point != null;
      case SvgPathPackage.MOVETO__LINETO_ARGUMENT_SEQUENCE:
        return lineto_argument_sequence != null;
    }
    return super.eIsSet(featureID);
  }

} //movetoImpl
