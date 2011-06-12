/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient;
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
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RadialGradientImpl#getCx <em>Cx</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RadialGradientImpl#getCy <em>Cy</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RadialGradientImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RadialGradientImpl#getFx <em>Fx</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RadialGradientImpl#getFy <em>Fy</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.RadialGradientImpl#getStops <em>Stops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadialGradientImpl extends PaintImpl implements RadialGradient
{
  /**
   * The default value of the '{@link #getCx() <em>Cx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCx()
   * @generated
   * @ordered
   */
  protected static final String CX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCx() <em>Cx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCx()
   * @generated
   * @ordered
   */
  protected String cx = CX_EDEFAULT;

  /**
   * The default value of the '{@link #getCy() <em>Cy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCy()
   * @generated
   * @ordered
   */
  protected static final String CY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCy() <em>Cy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCy()
   * @generated
   * @ordered
   */
  protected String cy = CY_EDEFAULT;

  /**
   * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadius()
   * @generated
   * @ordered
   */
  protected static final String RADIUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadius()
   * @generated
   * @ordered
   */
  protected String radius = RADIUS_EDEFAULT;

  /**
   * The default value of the '{@link #getFx() <em>Fx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFx()
   * @generated
   * @ordered
   */
  protected static final String FX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFx() <em>Fx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFx()
   * @generated
   * @ordered
   */
  protected String fx = FX_EDEFAULT;

  /**
   * The default value of the '{@link #getFy() <em>Fy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFy()
   * @generated
   * @ordered
   */
  protected static final String FY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFy() <em>Fy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFy()
   * @generated
   * @ordered
   */
  protected String fy = FY_EDEFAULT;

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
  public String getCx()
  {
    return cx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCx(String newCx)
  {
    String oldCx = cx;
    cx = newCx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.RADIAL_GRADIENT__CX, oldCx, cx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCy()
  {
    return cy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCy(String newCy)
  {
    String oldCy = cy;
    cy = newCy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.RADIAL_GRADIENT__CY, oldCy, cy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRadius()
  {
    return radius;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRadius(String newRadius)
  {
    String oldRadius = radius;
    radius = newRadius;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.RADIAL_GRADIENT__RADIUS, oldRadius, radius));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFx()
  {
    return fx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFx(String newFx)
  {
    String oldFx = fx;
    fx = newFx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.RADIAL_GRADIENT__FX, oldFx, fx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFy()
  {
    return fy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFy(String newFy)
  {
    String oldFy = fy;
    fy = newFy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.RADIAL_GRADIENT__FY, oldFy, fy));
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
      case CssDslPackage.RADIAL_GRADIENT__CX:
        return getCx();
      case CssDslPackage.RADIAL_GRADIENT__CY:
        return getCy();
      case CssDslPackage.RADIAL_GRADIENT__RADIUS:
        return getRadius();
      case CssDslPackage.RADIAL_GRADIENT__FX:
        return getFx();
      case CssDslPackage.RADIAL_GRADIENT__FY:
        return getFy();
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
      case CssDslPackage.RADIAL_GRADIENT__CX:
        setCx((String)newValue);
        return;
      case CssDslPackage.RADIAL_GRADIENT__CY:
        setCy((String)newValue);
        return;
      case CssDslPackage.RADIAL_GRADIENT__RADIUS:
        setRadius((String)newValue);
        return;
      case CssDslPackage.RADIAL_GRADIENT__FX:
        setFx((String)newValue);
        return;
      case CssDslPackage.RADIAL_GRADIENT__FY:
        setFy((String)newValue);
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
      case CssDslPackage.RADIAL_GRADIENT__CX:
        setCx(CX_EDEFAULT);
        return;
      case CssDslPackage.RADIAL_GRADIENT__CY:
        setCy(CY_EDEFAULT);
        return;
      case CssDslPackage.RADIAL_GRADIENT__RADIUS:
        setRadius(RADIUS_EDEFAULT);
        return;
      case CssDslPackage.RADIAL_GRADIENT__FX:
        setFx(FX_EDEFAULT);
        return;
      case CssDslPackage.RADIAL_GRADIENT__FY:
        setFy(FY_EDEFAULT);
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
      case CssDslPackage.RADIAL_GRADIENT__CX:
        return CX_EDEFAULT == null ? cx != null : !CX_EDEFAULT.equals(cx);
      case CssDslPackage.RADIAL_GRADIENT__CY:
        return CY_EDEFAULT == null ? cy != null : !CY_EDEFAULT.equals(cy);
      case CssDslPackage.RADIAL_GRADIENT__RADIUS:
        return RADIUS_EDEFAULT == null ? radius != null : !RADIUS_EDEFAULT.equals(radius);
      case CssDslPackage.RADIAL_GRADIENT__FX:
        return FX_EDEFAULT == null ? fx != null : !FX_EDEFAULT.equals(fx);
      case CssDslPackage.RADIAL_GRADIENT__FY:
        return FY_EDEFAULT == null ? fy != null : !FY_EDEFAULT.equals(fy);
      case CssDslPackage.RADIAL_GRADIENT__STOPS:
        return stops != null && !stops.isEmpty();
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
    result.append(" (cx: ");
    result.append(cx);
    result.append(", cy: ");
    result.append(cy);
    result.append(", radius: ");
    result.append(radius);
    result.append(", fx: ");
    result.append(fx);
    result.append(", fy: ");
    result.append(fy);
    result.append(')');
    return result.toString();
  }

} //RadialGradientImpl
