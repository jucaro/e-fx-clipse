/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate_pair;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.number;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>elliptical arc argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arc_argumentImpl#getRx <em>Rx</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arc_argumentImpl#getRy <em>Ry</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arc_argumentImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arc_argumentImpl#getLargearcflag <em>Largearcflag</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arc_argumentImpl#getSweepflag <em>Sweepflag</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arc_argumentImpl#getCoordinate_pair <em>Coordinate pair</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class elliptical_arc_argumentImpl extends MinimalEObjectImpl.Container implements elliptical_arc_argument
{
  /**
   * The cached value of the '{@link #getRx() <em>Rx</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRx()
   * @generated
   * @ordered
   */
  protected nonnegative_number rx;

  /**
   * The cached value of the '{@link #getRy() <em>Ry</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRy()
   * @generated
   * @ordered
   */
  protected nonnegative_number ry;

  /**
   * The cached value of the '{@link #getRotation() <em>Rotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRotation()
   * @generated
   * @ordered
   */
  protected number rotation;

  /**
   * The default value of the '{@link #getLargearcflag() <em>Largearcflag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLargearcflag()
   * @generated
   * @ordered
   */
  protected static final String LARGEARCFLAG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLargearcflag() <em>Largearcflag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLargearcflag()
   * @generated
   * @ordered
   */
  protected String largearcflag = LARGEARCFLAG_EDEFAULT;

  /**
   * The default value of the '{@link #getSweepflag() <em>Sweepflag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSweepflag()
   * @generated
   * @ordered
   */
  protected static final String SWEEPFLAG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSweepflag() <em>Sweepflag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSweepflag()
   * @generated
   * @ordered
   */
  protected String sweepflag = SWEEPFLAG_EDEFAULT;

  /**
   * The cached value of the '{@link #getCoordinate_pair() <em>Coordinate pair</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoordinate_pair()
   * @generated
   * @ordered
   */
  protected coordinate_pair coordinate_pair;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected elliptical_arc_argumentImpl()
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
    return SvgPathPackage.Literals.ELLIPTICAL_ARC_ARGUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nonnegative_number getRx()
  {
    return rx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRx(nonnegative_number newRx, NotificationChain msgs)
  {
    nonnegative_number oldRx = rx;
    rx = newRx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__RX, oldRx, newRx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRx(nonnegative_number newRx)
  {
    if (newRx != rx)
    {
      NotificationChain msgs = null;
      if (rx != null)
        msgs = ((InternalEObject)rx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__RX, null, msgs);
      if (newRx != null)
        msgs = ((InternalEObject)newRx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__RX, null, msgs);
      msgs = basicSetRx(newRx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__RX, newRx, newRx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nonnegative_number getRy()
  {
    return ry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRy(nonnegative_number newRy, NotificationChain msgs)
  {
    nonnegative_number oldRy = ry;
    ry = newRy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__RY, oldRy, newRy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRy(nonnegative_number newRy)
  {
    if (newRy != ry)
    {
      NotificationChain msgs = null;
      if (ry != null)
        msgs = ((InternalEObject)ry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__RY, null, msgs);
      if (newRy != null)
        msgs = ((InternalEObject)newRy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__RY, null, msgs);
      msgs = basicSetRy(newRy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__RY, newRy, newRy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public number getRotation()
  {
    return rotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRotation(number newRotation, NotificationChain msgs)
  {
    number oldRotation = rotation;
    rotation = newRotation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__ROTATION, oldRotation, newRotation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRotation(number newRotation)
  {
    if (newRotation != rotation)
    {
      NotificationChain msgs = null;
      if (rotation != null)
        msgs = ((InternalEObject)rotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__ROTATION, null, msgs);
      if (newRotation != null)
        msgs = ((InternalEObject)newRotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__ROTATION, null, msgs);
      msgs = basicSetRotation(newRotation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__ROTATION, newRotation, newRotation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLargearcflag()
  {
    return largearcflag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLargearcflag(String newLargearcflag)
  {
    String oldLargearcflag = largearcflag;
    largearcflag = newLargearcflag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__LARGEARCFLAG, oldLargearcflag, largearcflag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSweepflag()
  {
    return sweepflag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSweepflag(String newSweepflag)
  {
    String oldSweepflag = sweepflag;
    sweepflag = newSweepflag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__SWEEPFLAG, oldSweepflag, sweepflag));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public coordinate_pair getCoordinate_pair()
  {
    return coordinate_pair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCoordinate_pair(coordinate_pair newCoordinate_pair, NotificationChain msgs)
  {
    coordinate_pair oldCoordinate_pair = coordinate_pair;
    coordinate_pair = newCoordinate_pair;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__COORDINATE_PAIR, oldCoordinate_pair, newCoordinate_pair);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCoordinate_pair(coordinate_pair newCoordinate_pair)
  {
    if (newCoordinate_pair != coordinate_pair)
    {
      NotificationChain msgs = null;
      if (coordinate_pair != null)
        msgs = ((InternalEObject)coordinate_pair).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__COORDINATE_PAIR, null, msgs);
      if (newCoordinate_pair != null)
        msgs = ((InternalEObject)newCoordinate_pair).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__COORDINATE_PAIR, null, msgs);
      msgs = basicSetCoordinate_pair(newCoordinate_pair, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__COORDINATE_PAIR, newCoordinate_pair, newCoordinate_pair));
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
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__RX:
        return basicSetRx(null, msgs);
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__RY:
        return basicSetRy(null, msgs);
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__ROTATION:
        return basicSetRotation(null, msgs);
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__COORDINATE_PAIR:
        return basicSetCoordinate_pair(null, msgs);
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
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__RX:
        return getRx();
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__RY:
        return getRy();
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__ROTATION:
        return getRotation();
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__LARGEARCFLAG:
        return getLargearcflag();
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__SWEEPFLAG:
        return getSweepflag();
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__COORDINATE_PAIR:
        return getCoordinate_pair();
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
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__RX:
        setRx((nonnegative_number)newValue);
        return;
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__RY:
        setRy((nonnegative_number)newValue);
        return;
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__ROTATION:
        setRotation((number)newValue);
        return;
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__LARGEARCFLAG:
        setLargearcflag((String)newValue);
        return;
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__SWEEPFLAG:
        setSweepflag((String)newValue);
        return;
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__COORDINATE_PAIR:
        setCoordinate_pair((coordinate_pair)newValue);
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
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__RX:
        setRx((nonnegative_number)null);
        return;
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__RY:
        setRy((nonnegative_number)null);
        return;
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__ROTATION:
        setRotation((number)null);
        return;
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__LARGEARCFLAG:
        setLargearcflag(LARGEARCFLAG_EDEFAULT);
        return;
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__SWEEPFLAG:
        setSweepflag(SWEEPFLAG_EDEFAULT);
        return;
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__COORDINATE_PAIR:
        setCoordinate_pair((coordinate_pair)null);
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
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__RX:
        return rx != null;
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__RY:
        return ry != null;
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__ROTATION:
        return rotation != null;
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__LARGEARCFLAG:
        return LARGEARCFLAG_EDEFAULT == null ? largearcflag != null : !LARGEARCFLAG_EDEFAULT.equals(largearcflag);
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__SWEEPFLAG:
        return SWEEPFLAG_EDEFAULT == null ? sweepflag != null : !SWEEPFLAG_EDEFAULT.equals(sweepflag);
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT__COORDINATE_PAIR:
        return coordinate_pair != null;
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
    result.append(" (largearcflag: ");
    result.append(largearcflag);
    result.append(", sweepflag: ");
    result.append(sweepflag);
    result.append(')');
    return result.toString();
  }

} //elliptical_arc_argumentImpl
