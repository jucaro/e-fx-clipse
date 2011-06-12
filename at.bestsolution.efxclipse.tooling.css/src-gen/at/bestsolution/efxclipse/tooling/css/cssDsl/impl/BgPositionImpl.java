/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.BgPosition;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bg Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BgPositionImpl#getAbsx <em>Absx</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BgPositionImpl#getRelx <em>Relx</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BgPositionImpl#getAbsy <em>Absy</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.BgPositionImpl#getRely <em>Rely</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BgPositionImpl extends MinimalEObjectImpl.Container implements BgPosition
{
  /**
   * The default value of the '{@link #getAbsx() <em>Absx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbsx()
   * @generated
   * @ordered
   */
  protected static final String ABSX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAbsx() <em>Absx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbsx()
   * @generated
   * @ordered
   */
  protected String absx = ABSX_EDEFAULT;

  /**
   * The default value of the '{@link #getRelx() <em>Relx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelx()
   * @generated
   * @ordered
   */
  protected static final String RELX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRelx() <em>Relx</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelx()
   * @generated
   * @ordered
   */
  protected String relx = RELX_EDEFAULT;

  /**
   * The default value of the '{@link #getAbsy() <em>Absy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbsy()
   * @generated
   * @ordered
   */
  protected static final String ABSY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAbsy() <em>Absy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbsy()
   * @generated
   * @ordered
   */
  protected String absy = ABSY_EDEFAULT;

  /**
   * The default value of the '{@link #getRely() <em>Rely</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRely()
   * @generated
   * @ordered
   */
  protected static final String RELY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRely() <em>Rely</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRely()
   * @generated
   * @ordered
   */
  protected String rely = RELY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BgPositionImpl()
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
    return CssDslPackage.Literals.BG_POSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAbsx()
  {
    return absx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbsx(String newAbsx)
  {
    String oldAbsx = absx;
    absx = newAbsx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.BG_POSITION__ABSX, oldAbsx, absx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRelx()
  {
    return relx;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelx(String newRelx)
  {
    String oldRelx = relx;
    relx = newRelx;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.BG_POSITION__RELX, oldRelx, relx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAbsy()
  {
    return absy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbsy(String newAbsy)
  {
    String oldAbsy = absy;
    absy = newAbsy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.BG_POSITION__ABSY, oldAbsy, absy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRely()
  {
    return rely;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRely(String newRely)
  {
    String oldRely = rely;
    rely = newRely;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.BG_POSITION__RELY, oldRely, rely));
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
      case CssDslPackage.BG_POSITION__ABSX:
        return getAbsx();
      case CssDslPackage.BG_POSITION__RELX:
        return getRelx();
      case CssDslPackage.BG_POSITION__ABSY:
        return getAbsy();
      case CssDslPackage.BG_POSITION__RELY:
        return getRely();
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
      case CssDslPackage.BG_POSITION__ABSX:
        setAbsx((String)newValue);
        return;
      case CssDslPackage.BG_POSITION__RELX:
        setRelx((String)newValue);
        return;
      case CssDslPackage.BG_POSITION__ABSY:
        setAbsy((String)newValue);
        return;
      case CssDslPackage.BG_POSITION__RELY:
        setRely((String)newValue);
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
      case CssDslPackage.BG_POSITION__ABSX:
        setAbsx(ABSX_EDEFAULT);
        return;
      case CssDslPackage.BG_POSITION__RELX:
        setRelx(RELX_EDEFAULT);
        return;
      case CssDslPackage.BG_POSITION__ABSY:
        setAbsy(ABSY_EDEFAULT);
        return;
      case CssDslPackage.BG_POSITION__RELY:
        setRely(RELY_EDEFAULT);
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
      case CssDslPackage.BG_POSITION__ABSX:
        return ABSX_EDEFAULT == null ? absx != null : !ABSX_EDEFAULT.equals(absx);
      case CssDslPackage.BG_POSITION__RELX:
        return RELX_EDEFAULT == null ? relx != null : !RELX_EDEFAULT.equals(relx);
      case CssDslPackage.BG_POSITION__ABSY:
        return ABSY_EDEFAULT == null ? absy != null : !ABSY_EDEFAULT.equals(absy);
      case CssDslPackage.BG_POSITION__RELY:
        return RELY_EDEFAULT == null ? rely != null : !RELY_EDEFAULT.equals(rely);
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
    result.append(" (absx: ");
    result.append(absx);
    result.append(", relx: ");
    result.append(relx);
    result.append(", absy: ");
    result.append(absy);
    result.append(", rely: ");
    result.append(rely);
    result.append(')');
    return result.toString();
  }

} //BgPositionImpl
