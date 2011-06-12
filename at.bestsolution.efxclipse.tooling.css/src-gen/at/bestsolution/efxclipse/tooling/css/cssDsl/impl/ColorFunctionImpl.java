/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.Color;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.ColorFunctionImpl#getOrig <em>Orig</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.ColorFunctionImpl#getMod <em>Mod</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.ColorFunctionImpl#getStopNumbers <em>Stop Numbers</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.ColorFunctionImpl#getStopColors <em>Stop Colors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColorFunctionImpl extends ColorImpl implements ColorFunction
{
  /**
   * The cached value of the '{@link #getOrig() <em>Orig</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrig()
   * @generated
   * @ordered
   */
  protected Color orig;

  /**
   * The default value of the '{@link #getMod() <em>Mod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMod()
   * @generated
   * @ordered
   */
  protected static final String MOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMod() <em>Mod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMod()
   * @generated
   * @ordered
   */
  protected String mod = MOD_EDEFAULT;

  /**
   * The cached value of the '{@link #getStopNumbers() <em>Stop Numbers</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStopNumbers()
   * @generated
   * @ordered
   */
  protected EList<String> stopNumbers;

  /**
   * The cached value of the '{@link #getStopColors() <em>Stop Colors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStopColors()
   * @generated
   * @ordered
   */
  protected EList<Color> stopColors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColorFunctionImpl()
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
    return CssDslPackage.Literals.COLOR_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getOrig()
  {
    return orig;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOrig(Color newOrig, NotificationChain msgs)
  {
    Color oldOrig = orig;
    orig = newOrig;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssDslPackage.COLOR_FUNCTION__ORIG, oldOrig, newOrig);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrig(Color newOrig)
  {
    if (newOrig != orig)
    {
      NotificationChain msgs = null;
      if (orig != null)
        msgs = ((InternalEObject)orig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.COLOR_FUNCTION__ORIG, null, msgs);
      if (newOrig != null)
        msgs = ((InternalEObject)newOrig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.COLOR_FUNCTION__ORIG, null, msgs);
      msgs = basicSetOrig(newOrig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.COLOR_FUNCTION__ORIG, newOrig, newOrig));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMod()
  {
    return mod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMod(String newMod)
  {
    String oldMod = mod;
    mod = newMod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.COLOR_FUNCTION__MOD, oldMod, mod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getStopNumbers()
  {
    if (stopNumbers == null)
    {
      stopNumbers = new EDataTypeEList<String>(String.class, this, CssDslPackage.COLOR_FUNCTION__STOP_NUMBERS);
    }
    return stopNumbers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Color> getStopColors()
  {
    if (stopColors == null)
    {
      stopColors = new EObjectContainmentEList<Color>(Color.class, this, CssDslPackage.COLOR_FUNCTION__STOP_COLORS);
    }
    return stopColors;
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
      case CssDslPackage.COLOR_FUNCTION__ORIG:
        return basicSetOrig(null, msgs);
      case CssDslPackage.COLOR_FUNCTION__STOP_COLORS:
        return ((InternalEList<?>)getStopColors()).basicRemove(otherEnd, msgs);
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
      case CssDslPackage.COLOR_FUNCTION__ORIG:
        return getOrig();
      case CssDslPackage.COLOR_FUNCTION__MOD:
        return getMod();
      case CssDslPackage.COLOR_FUNCTION__STOP_NUMBERS:
        return getStopNumbers();
      case CssDslPackage.COLOR_FUNCTION__STOP_COLORS:
        return getStopColors();
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
      case CssDslPackage.COLOR_FUNCTION__ORIG:
        setOrig((Color)newValue);
        return;
      case CssDslPackage.COLOR_FUNCTION__MOD:
        setMod((String)newValue);
        return;
      case CssDslPackage.COLOR_FUNCTION__STOP_NUMBERS:
        getStopNumbers().clear();
        getStopNumbers().addAll((Collection<? extends String>)newValue);
        return;
      case CssDslPackage.COLOR_FUNCTION__STOP_COLORS:
        getStopColors().clear();
        getStopColors().addAll((Collection<? extends Color>)newValue);
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
      case CssDslPackage.COLOR_FUNCTION__ORIG:
        setOrig((Color)null);
        return;
      case CssDslPackage.COLOR_FUNCTION__MOD:
        setMod(MOD_EDEFAULT);
        return;
      case CssDslPackage.COLOR_FUNCTION__STOP_NUMBERS:
        getStopNumbers().clear();
        return;
      case CssDslPackage.COLOR_FUNCTION__STOP_COLORS:
        getStopColors().clear();
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
      case CssDslPackage.COLOR_FUNCTION__ORIG:
        return orig != null;
      case CssDslPackage.COLOR_FUNCTION__MOD:
        return MOD_EDEFAULT == null ? mod != null : !MOD_EDEFAULT.equals(mod);
      case CssDslPackage.COLOR_FUNCTION__STOP_NUMBERS:
        return stopNumbers != null && !stopNumbers.isEmpty();
      case CssDslPackage.COLOR_FUNCTION__STOP_COLORS:
        return stopColors != null && !stopColors.isEmpty();
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
    result.append(" (mod: ");
    result.append(mod);
    result.append(", stopNumbers: ");
    result.append(stopNumbers);
    result.append(')');
    return result.toString();
  }

} //ColorFunctionImpl
