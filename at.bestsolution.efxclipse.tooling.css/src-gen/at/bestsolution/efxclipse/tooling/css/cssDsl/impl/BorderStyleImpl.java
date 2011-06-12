/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.BorderStyle;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Border Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BorderStyleImpl#getDashStyle <em>Dash Style</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BorderStyleImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BorderStyleImpl#getMiterAbs <em>Miter Abs</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BorderStyleImpl#getMiterPredefined <em>Miter Predefined</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BorderStyleImpl#getLineCap <em>Line Cap</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BorderStyleImpl extends MinimalEObjectImpl.Container implements BorderStyle
{
  /**
   * The default value of the '{@link #getDashStyle() <em>Dash Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDashStyle()
   * @generated
   * @ordered
   */
  protected static final String DASH_STYLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDashStyle() <em>Dash Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDashStyle()
   * @generated
   * @ordered
   */
  protected String dashStyle = DASH_STYLE_EDEFAULT;

  /**
   * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected static final String LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected String location = LOCATION_EDEFAULT;

  /**
   * The default value of the '{@link #getMiterAbs() <em>Miter Abs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMiterAbs()
   * @generated
   * @ordered
   */
  protected static final String MITER_ABS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMiterAbs() <em>Miter Abs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMiterAbs()
   * @generated
   * @ordered
   */
  protected String miterAbs = MITER_ABS_EDEFAULT;

  /**
   * The default value of the '{@link #getMiterPredefined() <em>Miter Predefined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMiterPredefined()
   * @generated
   * @ordered
   */
  protected static final String MITER_PREDEFINED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMiterPredefined() <em>Miter Predefined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMiterPredefined()
   * @generated
   * @ordered
   */
  protected String miterPredefined = MITER_PREDEFINED_EDEFAULT;

  /**
   * The default value of the '{@link #getLineCap() <em>Line Cap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineCap()
   * @generated
   * @ordered
   */
  protected static final String LINE_CAP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLineCap() <em>Line Cap</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineCap()
   * @generated
   * @ordered
   */
  protected String lineCap = LINE_CAP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BorderStyleImpl()
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
    return CssDslPackage.Literals.BORDER_STYLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDashStyle()
  {
    return dashStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDashStyle(String newDashStyle)
  {
    String oldDashStyle = dashStyle;
    dashStyle = newDashStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.BORDER_STYLE__DASH_STYLE, oldDashStyle, dashStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation(String newLocation)
  {
    String oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.BORDER_STYLE__LOCATION, oldLocation, location));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMiterAbs()
  {
    return miterAbs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMiterAbs(String newMiterAbs)
  {
    String oldMiterAbs = miterAbs;
    miterAbs = newMiterAbs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.BORDER_STYLE__MITER_ABS, oldMiterAbs, miterAbs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMiterPredefined()
  {
    return miterPredefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMiterPredefined(String newMiterPredefined)
  {
    String oldMiterPredefined = miterPredefined;
    miterPredefined = newMiterPredefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.BORDER_STYLE__MITER_PREDEFINED, oldMiterPredefined, miterPredefined));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLineCap()
  {
    return lineCap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLineCap(String newLineCap)
  {
    String oldLineCap = lineCap;
    lineCap = newLineCap;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.BORDER_STYLE__LINE_CAP, oldLineCap, lineCap));
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
      case CssDslPackage.BORDER_STYLE__DASH_STYLE:
        return getDashStyle();
      case CssDslPackage.BORDER_STYLE__LOCATION:
        return getLocation();
      case CssDslPackage.BORDER_STYLE__MITER_ABS:
        return getMiterAbs();
      case CssDslPackage.BORDER_STYLE__MITER_PREDEFINED:
        return getMiterPredefined();
      case CssDslPackage.BORDER_STYLE__LINE_CAP:
        return getLineCap();
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
      case CssDslPackage.BORDER_STYLE__DASH_STYLE:
        setDashStyle((String)newValue);
        return;
      case CssDslPackage.BORDER_STYLE__LOCATION:
        setLocation((String)newValue);
        return;
      case CssDslPackage.BORDER_STYLE__MITER_ABS:
        setMiterAbs((String)newValue);
        return;
      case CssDslPackage.BORDER_STYLE__MITER_PREDEFINED:
        setMiterPredefined((String)newValue);
        return;
      case CssDslPackage.BORDER_STYLE__LINE_CAP:
        setLineCap((String)newValue);
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
      case CssDslPackage.BORDER_STYLE__DASH_STYLE:
        setDashStyle(DASH_STYLE_EDEFAULT);
        return;
      case CssDslPackage.BORDER_STYLE__LOCATION:
        setLocation(LOCATION_EDEFAULT);
        return;
      case CssDslPackage.BORDER_STYLE__MITER_ABS:
        setMiterAbs(MITER_ABS_EDEFAULT);
        return;
      case CssDslPackage.BORDER_STYLE__MITER_PREDEFINED:
        setMiterPredefined(MITER_PREDEFINED_EDEFAULT);
        return;
      case CssDslPackage.BORDER_STYLE__LINE_CAP:
        setLineCap(LINE_CAP_EDEFAULT);
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
      case CssDslPackage.BORDER_STYLE__DASH_STYLE:
        return DASH_STYLE_EDEFAULT == null ? dashStyle != null : !DASH_STYLE_EDEFAULT.equals(dashStyle);
      case CssDslPackage.BORDER_STYLE__LOCATION:
        return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
      case CssDslPackage.BORDER_STYLE__MITER_ABS:
        return MITER_ABS_EDEFAULT == null ? miterAbs != null : !MITER_ABS_EDEFAULT.equals(miterAbs);
      case CssDslPackage.BORDER_STYLE__MITER_PREDEFINED:
        return MITER_PREDEFINED_EDEFAULT == null ? miterPredefined != null : !MITER_PREDEFINED_EDEFAULT.equals(miterPredefined);
      case CssDslPackage.BORDER_STYLE__LINE_CAP:
        return LINE_CAP_EDEFAULT == null ? lineCap != null : !LINE_CAP_EDEFAULT.equals(lineCap);
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
    result.append(" (dashStyle: ");
    result.append(dashStyle);
    result.append(", location: ");
    result.append(location);
    result.append(", miterAbs: ");
    result.append(miterAbs);
    result.append(", miterPredefined: ");
    result.append(miterPredefined);
    result.append(", lineCap: ");
    result.append(lineCap);
    result.append(')');
    return result.toString();
  }

} //BorderStyleImpl
