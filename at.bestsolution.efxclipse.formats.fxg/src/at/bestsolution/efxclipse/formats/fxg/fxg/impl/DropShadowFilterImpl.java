/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg.impl;

import at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter;
import at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop Shadow Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.DropShadowFilterImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.DropShadowFilterImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.DropShadowFilterImpl#getBlurX <em>Blur X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.DropShadowFilterImpl#getBlurY <em>Blur Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.DropShadowFilterImpl#getColor <em>Color</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.DropShadowFilterImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.DropShadowFilterImpl#getInner <em>Inner</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.DropShadowFilterImpl#getHideObject <em>Hide Object</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.DropShadowFilterImpl#getKnockout <em>Knockout</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.DropShadowFilterImpl#getQuality <em>Quality</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.DropShadowFilterImpl#getStrength <em>Strength</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DropShadowFilterImpl extends EObjectImpl implements DropShadowFilter {
	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final Double ALPHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected Double alpha = ALPHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected static final Double ANGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected Double angle = ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlurX() <em>Blur X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlurX()
	 * @generated
	 * @ordered
	 */
	protected static final Double BLUR_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlurX() <em>Blur X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlurX()
	 * @generated
	 * @ordered
	 */
	protected Double blurX = BLUR_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlurY() <em>Blur Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlurY()
	 * @generated
	 * @ordered
	 */
	protected static final Double BLUR_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlurY() <em>Blur Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlurY()
	 * @generated
	 * @ordered
	 */
	protected Double blurY = BLUR_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final Double DISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected Double distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInner() <em>Inner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInner()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInner() <em>Inner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInner()
	 * @generated
	 * @ordered
	 */
	protected Boolean inner = INNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHideObject() <em>Hide Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHideObject()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HIDE_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHideObject() <em>Hide Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHideObject()
	 * @generated
	 * @ordered
	 */
	protected Boolean hideObject = HIDE_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getKnockout() <em>Knockout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnockout()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean KNOCKOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKnockout() <em>Knockout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnockout()
	 * @generated
	 * @ordered
	 */
	protected Boolean knockout = KNOCKOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuality() <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected static final Double QUALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuality() <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected Double quality = QUALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrength() <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected static final Double STRENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrength() <em>Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrength()
	 * @generated
	 * @ordered
	 */
	protected Double strength = STRENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropShadowFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FxgPackage.Literals.DROP_SHADOW_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha(Double newAlpha) {
		Double oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.DROP_SHADOW_FILTER__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(Double newAngle) {
		Double oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.DROP_SHADOW_FILTER__ANGLE, oldAngle, angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBlurX() {
		return blurX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlurX(Double newBlurX) {
		Double oldBlurX = blurX;
		blurX = newBlurX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.DROP_SHADOW_FILTER__BLUR_X, oldBlurX, blurX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBlurY() {
		return blurY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlurY(Double newBlurY) {
		Double oldBlurY = blurY;
		blurY = newBlurY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.DROP_SHADOW_FILTER__BLUR_Y, oldBlurY, blurY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.DROP_SHADOW_FILTER__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(Double newDistance) {
		Double oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.DROP_SHADOW_FILTER__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getInner() {
		return inner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInner(Boolean newInner) {
		Boolean oldInner = inner;
		inner = newInner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.DROP_SHADOW_FILTER__INNER, oldInner, inner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHideObject() {
		return hideObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideObject(Boolean newHideObject) {
		Boolean oldHideObject = hideObject;
		hideObject = newHideObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.DROP_SHADOW_FILTER__HIDE_OBJECT, oldHideObject, hideObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getKnockout() {
		return knockout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKnockout(Boolean newKnockout) {
		Boolean oldKnockout = knockout;
		knockout = newKnockout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.DROP_SHADOW_FILTER__KNOCKOUT, oldKnockout, knockout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getQuality() {
		return quality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuality(Double newQuality) {
		Double oldQuality = quality;
		quality = newQuality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.DROP_SHADOW_FILTER__QUALITY, oldQuality, quality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getStrength() {
		return strength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrength(Double newStrength) {
		Double oldStrength = strength;
		strength = newStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.DROP_SHADOW_FILTER__STRENGTH, oldStrength, strength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FxgPackage.DROP_SHADOW_FILTER__ALPHA:
				return getAlpha();
			case FxgPackage.DROP_SHADOW_FILTER__ANGLE:
				return getAngle();
			case FxgPackage.DROP_SHADOW_FILTER__BLUR_X:
				return getBlurX();
			case FxgPackage.DROP_SHADOW_FILTER__BLUR_Y:
				return getBlurY();
			case FxgPackage.DROP_SHADOW_FILTER__COLOR:
				return getColor();
			case FxgPackage.DROP_SHADOW_FILTER__DISTANCE:
				return getDistance();
			case FxgPackage.DROP_SHADOW_FILTER__INNER:
				return getInner();
			case FxgPackage.DROP_SHADOW_FILTER__HIDE_OBJECT:
				return getHideObject();
			case FxgPackage.DROP_SHADOW_FILTER__KNOCKOUT:
				return getKnockout();
			case FxgPackage.DROP_SHADOW_FILTER__QUALITY:
				return getQuality();
			case FxgPackage.DROP_SHADOW_FILTER__STRENGTH:
				return getStrength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FxgPackage.DROP_SHADOW_FILTER__ALPHA:
				setAlpha((Double)newValue);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__ANGLE:
				setAngle((Double)newValue);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__BLUR_X:
				setBlurX((Double)newValue);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__BLUR_Y:
				setBlurY((Double)newValue);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__COLOR:
				setColor((String)newValue);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__DISTANCE:
				setDistance((Double)newValue);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__INNER:
				setInner((Boolean)newValue);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__HIDE_OBJECT:
				setHideObject((Boolean)newValue);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__KNOCKOUT:
				setKnockout((Boolean)newValue);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__QUALITY:
				setQuality((Double)newValue);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__STRENGTH:
				setStrength((Double)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case FxgPackage.DROP_SHADOW_FILTER__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__ANGLE:
				setAngle(ANGLE_EDEFAULT);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__BLUR_X:
				setBlurX(BLUR_X_EDEFAULT);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__BLUR_Y:
				setBlurY(BLUR_Y_EDEFAULT);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__INNER:
				setInner(INNER_EDEFAULT);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__HIDE_OBJECT:
				setHideObject(HIDE_OBJECT_EDEFAULT);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__KNOCKOUT:
				setKnockout(KNOCKOUT_EDEFAULT);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__QUALITY:
				setQuality(QUALITY_EDEFAULT);
				return;
			case FxgPackage.DROP_SHADOW_FILTER__STRENGTH:
				setStrength(STRENGTH_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FxgPackage.DROP_SHADOW_FILTER__ALPHA:
				return ALPHA_EDEFAULT == null ? alpha != null : !ALPHA_EDEFAULT.equals(alpha);
			case FxgPackage.DROP_SHADOW_FILTER__ANGLE:
				return ANGLE_EDEFAULT == null ? angle != null : !ANGLE_EDEFAULT.equals(angle);
			case FxgPackage.DROP_SHADOW_FILTER__BLUR_X:
				return BLUR_X_EDEFAULT == null ? blurX != null : !BLUR_X_EDEFAULT.equals(blurX);
			case FxgPackage.DROP_SHADOW_FILTER__BLUR_Y:
				return BLUR_Y_EDEFAULT == null ? blurY != null : !BLUR_Y_EDEFAULT.equals(blurY);
			case FxgPackage.DROP_SHADOW_FILTER__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case FxgPackage.DROP_SHADOW_FILTER__DISTANCE:
				return DISTANCE_EDEFAULT == null ? distance != null : !DISTANCE_EDEFAULT.equals(distance);
			case FxgPackage.DROP_SHADOW_FILTER__INNER:
				return INNER_EDEFAULT == null ? inner != null : !INNER_EDEFAULT.equals(inner);
			case FxgPackage.DROP_SHADOW_FILTER__HIDE_OBJECT:
				return HIDE_OBJECT_EDEFAULT == null ? hideObject != null : !HIDE_OBJECT_EDEFAULT.equals(hideObject);
			case FxgPackage.DROP_SHADOW_FILTER__KNOCKOUT:
				return KNOCKOUT_EDEFAULT == null ? knockout != null : !KNOCKOUT_EDEFAULT.equals(knockout);
			case FxgPackage.DROP_SHADOW_FILTER__QUALITY:
				return QUALITY_EDEFAULT == null ? quality != null : !QUALITY_EDEFAULT.equals(quality);
			case FxgPackage.DROP_SHADOW_FILTER__STRENGTH:
				return STRENGTH_EDEFAULT == null ? strength != null : !STRENGTH_EDEFAULT.equals(strength);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (alpha: ");
		result.append(alpha);
		result.append(", angle: ");
		result.append(angle);
		result.append(", blurX: ");
		result.append(blurX);
		result.append(", blurY: ");
		result.append(blurY);
		result.append(", color: ");
		result.append(color);
		result.append(", distance: ");
		result.append(distance);
		result.append(", inner: ");
		result.append(inner);
		result.append(", hideObject: ");
		result.append(hideObject);
		result.append(", knockout: ");
		result.append(knockout);
		result.append(", quality: ");
		result.append(quality);
		result.append(", strength: ");
		result.append(strength);
		result.append(')');
		return result.toString();
	}

} //DropShadowFilterImpl
