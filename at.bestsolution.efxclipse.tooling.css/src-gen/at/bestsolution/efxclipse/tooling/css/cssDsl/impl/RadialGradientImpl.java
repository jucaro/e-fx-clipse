/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.PointValue;
import at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient;
import at.bestsolution.efxclipse.tooling.css.cssDsl.SizeType;
import at.bestsolution.efxclipse.tooling.css.cssDsl.StopValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radial Gradient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RadialGradientImpl#getCenter <em>Center</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RadialGradientImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RadialGradientImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RadialGradientImpl#getStops <em>Stops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadialGradientImpl extends PaintImpl implements RadialGradient
{
  /**
   * The cached value of the '{@link #getCenter() <em>Center</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCenter()
   * @generated
   * @ordered
   */
  protected PointValue center;

  /**
   * The cached value of the '{@link #getRadius() <em>Radius</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadius()
   * @generated
   * @ordered
   */
  protected SizeType radius;

  /**
   * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFocus()
   * @generated
   * @ordered
   */
  protected PointValue focus;

  /**
   * The cached value of the '{@link #getStops() <em>Stops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStops()
   * @generated
   * @ordered
   */
  protected EList<StopValue> stops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RadialGradientImpl()
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
    return CssDslPackage.Literals.RADIAL_GRADIENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointValue getCenter()
  {
    return center;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCenter(PointValue newCenter, NotificationChain msgs)
  {
    PointValue oldCenter = center;
    center = newCenter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssDslPackage.RADIAL_GRADIENT__CENTER, oldCenter, newCenter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCenter(PointValue newCenter)
  {
    if (newCenter != center)
    {
      NotificationChain msgs = null;
      if (center != null)
        msgs = ((InternalEObject)center).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.RADIAL_GRADIENT__CENTER, null, msgs);
      if (newCenter != null)
        msgs = ((InternalEObject)newCenter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.RADIAL_GRADIENT__CENTER, null, msgs);
      msgs = basicSetCenter(newCenter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.RADIAL_GRADIENT__CENTER, newCenter, newCenter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeType getRadius()
  {
    return radius;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRadius(SizeType newRadius, NotificationChain msgs)
  {
    SizeType oldRadius = radius;
    radius = newRadius;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssDslPackage.RADIAL_GRADIENT__RADIUS, oldRadius, newRadius);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRadius(SizeType newRadius)
  {
    if (newRadius != radius)
    {
      NotificationChain msgs = null;
      if (radius != null)
        msgs = ((InternalEObject)radius).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.RADIAL_GRADIENT__RADIUS, null, msgs);
      if (newRadius != null)
        msgs = ((InternalEObject)newRadius).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.RADIAL_GRADIENT__RADIUS, null, msgs);
      msgs = basicSetRadius(newRadius, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.RADIAL_GRADIENT__RADIUS, newRadius, newRadius));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointValue getFocus()
  {
    return focus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFocus(PointValue newFocus, NotificationChain msgs)
  {
    PointValue oldFocus = focus;
    focus = newFocus;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssDslPackage.RADIAL_GRADIENT__FOCUS, oldFocus, newFocus);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFocus(PointValue newFocus)
  {
    if (newFocus != focus)
    {
      NotificationChain msgs = null;
      if (focus != null)
        msgs = ((InternalEObject)focus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.RADIAL_GRADIENT__FOCUS, null, msgs);
      if (newFocus != null)
        msgs = ((InternalEObject)newFocus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.RADIAL_GRADIENT__FOCUS, null, msgs);
      msgs = basicSetFocus(newFocus, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.RADIAL_GRADIENT__FOCUS, newFocus, newFocus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StopValue> getStops()
  {
    if (stops == null)
    {
      stops = new EObjectContainmentEList<StopValue>(StopValue.class, this, CssDslPackage.RADIAL_GRADIENT__STOPS);
    }
    return stops;
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
      case CssDslPackage.RADIAL_GRADIENT__CENTER:
        return basicSetCenter(null, msgs);
      case CssDslPackage.RADIAL_GRADIENT__RADIUS:
        return basicSetRadius(null, msgs);
      case CssDslPackage.RADIAL_GRADIENT__FOCUS:
        return basicSetFocus(null, msgs);
      case CssDslPackage.RADIAL_GRADIENT__STOPS:
        return ((InternalEList<?>)getStops()).basicRemove(otherEnd, msgs);
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
      case CssDslPackage.RADIAL_GRADIENT__CENTER:
        return getCenter();
      case CssDslPackage.RADIAL_GRADIENT__RADIUS:
        return getRadius();
      case CssDslPackage.RADIAL_GRADIENT__FOCUS:
        return getFocus();
      case CssDslPackage.RADIAL_GRADIENT__STOPS:
        return getStops();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CssDslPackage.RADIAL_GRADIENT__CENTER:
        setCenter((PointValue)newValue);
        return;
      case CssDslPackage.RADIAL_GRADIENT__RADIUS:
        setRadius((SizeType)newValue);
        return;
      case CssDslPackage.RADIAL_GRADIENT__FOCUS:
        setFocus((PointValue)newValue);
        return;
      case CssDslPackage.RADIAL_GRADIENT__STOPS:
        getStops().clear();
        getStops().addAll((Collection<? extends StopValue>)newValue);
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
      case CssDslPackage.RADIAL_GRADIENT__CENTER:
        setCenter((PointValue)null);
        return;
      case CssDslPackage.RADIAL_GRADIENT__RADIUS:
        setRadius((SizeType)null);
        return;
      case CssDslPackage.RADIAL_GRADIENT__FOCUS:
        setFocus((PointValue)null);
        return;
      case CssDslPackage.RADIAL_GRADIENT__STOPS:
        getStops().clear();
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
      case CssDslPackage.RADIAL_GRADIENT__CENTER:
        return center != null;
      case CssDslPackage.RADIAL_GRADIENT__RADIUS:
        return radius != null;
      case CssDslPackage.RADIAL_GRADIENT__FOCUS:
        return focus != null;
      case CssDslPackage.RADIAL_GRADIENT__STOPS:
        return stops != null && !stops.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RadialGradientImpl
