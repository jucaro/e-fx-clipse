/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.BgSize;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bg Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BgSizeImpl#getXsize <em>Xsize</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BgSizeImpl#getYsize <em>Ysize</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BgSizeImpl#getPredefined <em>Predefined</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BgSizeImpl extends MinimalEObjectImpl.Container implements BgSize
{
  /**
   * The default value of the '{@link #getXsize() <em>Xsize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXsize()
   * @generated
   * @ordered
   */
  protected static final String XSIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getXsize() <em>Xsize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXsize()
   * @generated
   * @ordered
   */
  protected String xsize = XSIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getYsize() <em>Ysize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYsize()
   * @generated
   * @ordered
   */
  protected static final String YSIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getYsize() <em>Ysize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYsize()
   * @generated
   * @ordered
   */
  protected String ysize = YSIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getPredefined() <em>Predefined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredefined()
   * @generated
   * @ordered
   */
  protected static final String PREDEFINED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPredefined() <em>Predefined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredefined()
   * @generated
   * @ordered
   */
  protected String predefined = PREDEFINED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BgSizeImpl()
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
    return CssDslPackage.Literals.BG_SIZE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getXsize()
  {
    return xsize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXsize(String newXsize)
  {
    String oldXsize = xsize;
    xsize = newXsize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.BG_SIZE__XSIZE, oldXsize, xsize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getYsize()
  {
    return ysize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYsize(String newYsize)
  {
    String oldYsize = ysize;
    ysize = newYsize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.BG_SIZE__YSIZE, oldYsize, ysize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPredefined()
  {
    return predefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPredefined(String newPredefined)
  {
    String oldPredefined = predefined;
    predefined = newPredefined;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.BG_SIZE__PREDEFINED, oldPredefined, predefined));
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
      case CssDslPackage.BG_SIZE__XSIZE:
        return getXsize();
      case CssDslPackage.BG_SIZE__YSIZE:
        return getYsize();
      case CssDslPackage.BG_SIZE__PREDEFINED:
        return getPredefined();
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
      case CssDslPackage.BG_SIZE__XSIZE:
        setXsize((String)newValue);
        return;
      case CssDslPackage.BG_SIZE__YSIZE:
        setYsize((String)newValue);
        return;
      case CssDslPackage.BG_SIZE__PREDEFINED:
        setPredefined((String)newValue);
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
      case CssDslPackage.BG_SIZE__XSIZE:
        setXsize(XSIZE_EDEFAULT);
        return;
      case CssDslPackage.BG_SIZE__YSIZE:
        setYsize(YSIZE_EDEFAULT);
        return;
      case CssDslPackage.BG_SIZE__PREDEFINED:
        setPredefined(PREDEFINED_EDEFAULT);
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
      case CssDslPackage.BG_SIZE__XSIZE:
        return XSIZE_EDEFAULT == null ? xsize != null : !XSIZE_EDEFAULT.equals(xsize);
      case CssDslPackage.BG_SIZE__YSIZE:
        return YSIZE_EDEFAULT == null ? ysize != null : !YSIZE_EDEFAULT.equals(ysize);
      case CssDslPackage.BG_SIZE__PREDEFINED:
        return PREDEFINED_EDEFAULT == null ? predefined != null : !PREDEFINED_EDEFAULT.equals(predefined);
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
    result.append(" (xsize: ");
    result.append(xsize);
    result.append(", ysize: ");
    result.append(ysize);
    result.append(", predefined: ");
    result.append(predefined);
    result.append(')');
    return result.toString();
  }

} //BgSizeImpl
