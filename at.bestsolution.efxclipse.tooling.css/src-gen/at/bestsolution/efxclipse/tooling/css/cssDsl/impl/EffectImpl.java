/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.Color;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.Effect;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.EffectImpl#getBlur <em>Blur</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.EffectImpl#getColor <em>Color</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.EffectImpl#getBlurRadius <em>Blur Radius</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.EffectImpl#getOffsetX <em>Offset X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.EffectImpl#getOffsetY <em>Offset Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EffectImpl extends MinimalEObjectImpl.Container implements Effect
{
  /**
   * The default value of the '{@link #getBlur() <em>Blur</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlur()
   * @generated
   * @ordered
   */
  protected static final String BLUR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBlur() <em>Blur</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlur()
   * @generated
   * @ordered
   */
  protected String blur = BLUR_EDEFAULT;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected Color color;

  /**
   * The default value of the '{@link #getBlurRadius() <em>Blur Radius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlurRadius()
   * @generated
   * @ordered
   */
  protected static final String BLUR_RADIUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBlurRadius() <em>Blur Radius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlurRadius()
   * @generated
   * @ordered
   */
  protected String blurRadius = BLUR_RADIUS_EDEFAULT;

  /**
   * The default value of the '{@link #getOffsetX() <em>Offset X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffsetX()
   * @generated
   * @ordered
   */
  protected static final String OFFSET_X_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOffsetX() <em>Offset X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffsetX()
   * @generated
   * @ordered
   */
  protected String offsetX = OFFSET_X_EDEFAULT;

  /**
   * The default value of the '{@link #getOffsetY() <em>Offset Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffsetY()
   * @generated
   * @ordered
   */
  protected static final String OFFSET_Y_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOffsetY() <em>Offset Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffsetY()
   * @generated
   * @ordered
   */
  protected String offsetY = OFFSET_Y_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EffectImpl()
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
    return CssDslPackage.Literals.EFFECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBlur()
  {
    return blur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlur(String newBlur)
  {
    String oldBlur = blur;
    blur = newBlur;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.EFFECT__BLUR, oldBlur, blur));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColor(Color newColor, NotificationChain msgs)
  {
    Color oldColor = color;
    color = newColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CssDslPackage.EFFECT__COLOR, oldColor, newColor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(Color newColor)
  {
    if (newColor != color)
    {
      NotificationChain msgs = null;
      if (color != null)
        msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.EFFECT__COLOR, null, msgs);
      if (newColor != null)
        msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CssDslPackage.EFFECT__COLOR, null, msgs);
      msgs = basicSetColor(newColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.EFFECT__COLOR, newColor, newColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBlurRadius()
  {
    return blurRadius;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlurRadius(String newBlurRadius)
  {
    String oldBlurRadius = blurRadius;
    blurRadius = newBlurRadius;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.EFFECT__BLUR_RADIUS, oldBlurRadius, blurRadius));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOffsetX()
  {
    return offsetX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOffsetX(String newOffsetX)
  {
    String oldOffsetX = offsetX;
    offsetX = newOffsetX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.EFFECT__OFFSET_X, oldOffsetX, offsetX));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOffsetY()
  {
    return offsetY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOffsetY(String newOffsetY)
  {
    String oldOffsetY = offsetY;
    offsetY = newOffsetY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CssDslPackage.EFFECT__OFFSET_Y, oldOffsetY, offsetY));
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
      case CssDslPackage.EFFECT__COLOR:
        return basicSetColor(null, msgs);
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
      case CssDslPackage.EFFECT__BLUR:
        return getBlur();
      case CssDslPackage.EFFECT__COLOR:
        return getColor();
      case CssDslPackage.EFFECT__BLUR_RADIUS:
        return getBlurRadius();
      case CssDslPackage.EFFECT__OFFSET_X:
        return getOffsetX();
      case CssDslPackage.EFFECT__OFFSET_Y:
        return getOffsetY();
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
      case CssDslPackage.EFFECT__BLUR:
        setBlur((String)newValue);
        return;
      case CssDslPackage.EFFECT__COLOR:
        setColor((Color)newValue);
        return;
      case CssDslPackage.EFFECT__BLUR_RADIUS:
        setBlurRadius((String)newValue);
        return;
      case CssDslPackage.EFFECT__OFFSET_X:
        setOffsetX((String)newValue);
        return;
      case CssDslPackage.EFFECT__OFFSET_Y:
        setOffsetY((String)newValue);
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
      case CssDslPackage.EFFECT__BLUR:
        setBlur(BLUR_EDEFAULT);
        return;
      case CssDslPackage.EFFECT__COLOR:
        setColor((Color)null);
        return;
      case CssDslPackage.EFFECT__BLUR_RADIUS:
        setBlurRadius(BLUR_RADIUS_EDEFAULT);
        return;
      case CssDslPackage.EFFECT__OFFSET_X:
        setOffsetX(OFFSET_X_EDEFAULT);
        return;
      case CssDslPackage.EFFECT__OFFSET_Y:
        setOffsetY(OFFSET_Y_EDEFAULT);
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
      case CssDslPackage.EFFECT__BLUR:
        return BLUR_EDEFAULT == null ? blur != null : !BLUR_EDEFAULT.equals(blur);
      case CssDslPackage.EFFECT__COLOR:
        return color != null;
      case CssDslPackage.EFFECT__BLUR_RADIUS:
        return BLUR_RADIUS_EDEFAULT == null ? blurRadius != null : !BLUR_RADIUS_EDEFAULT.equals(blurRadius);
      case CssDslPackage.EFFECT__OFFSET_X:
        return OFFSET_X_EDEFAULT == null ? offsetX != null : !OFFSET_X_EDEFAULT.equals(offsetX);
      case CssDslPackage.EFFECT__OFFSET_Y:
        return OFFSET_Y_EDEFAULT == null ? offsetY != null : !OFFSET_Y_EDEFAULT.equals(offsetY);
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
    result.append(" (blur: ");
    result.append(blur);
    result.append(", blurRadius: ");
    result.append(blurRadius);
    result.append(", offsetX: ");
    result.append(offsetX);
    result.append(", offsetY: ");
    result.append(offsetY);
    result.append(')');
    return result.toString();
  }

} //EffectImpl
