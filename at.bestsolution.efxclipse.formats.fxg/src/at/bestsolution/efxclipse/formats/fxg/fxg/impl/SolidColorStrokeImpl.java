/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg.impl;

import at.bestsolution.efxclipse.formats.fxg.fxg.Cap;
import at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage;
import at.bestsolution.efxclipse.formats.fxg.fxg.Joint;
import at.bestsolution.efxclipse.formats.fxg.fxg.ScaleMode;
import at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solid Color Stroke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.SolidColorStrokeImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.SolidColorStrokeImpl#getCaps <em>Caps</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.SolidColorStrokeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.SolidColorStrokeImpl#getJoints <em>Joints</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.SolidColorStrokeImpl#getMiterLimit <em>Miter Limit</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.SolidColorStrokeImpl#getPixelHinting <em>Pixel Hinting</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.SolidColorStrokeImpl#getScaleMode <em>Scale Mode</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.SolidColorStrokeImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SolidColorStrokeImpl extends EObjectImpl implements SolidColorStroke {
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
	 * The default value of the '{@link #getCaps() <em>Caps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaps()
	 * @generated
	 * @ordered
	 */
	protected static final Cap CAPS_EDEFAULT = Cap.ROUND;

	/**
	 * The cached value of the '{@link #getCaps() <em>Caps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaps()
	 * @generated
	 * @ordered
	 */
	protected Cap caps = CAPS_EDEFAULT;

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
	 * The default value of the '{@link #getJoints() <em>Joints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoints()
	 * @generated
	 * @ordered
	 */
	protected static final Joint JOINTS_EDEFAULT = Joint.ROUND;

	/**
	 * The cached value of the '{@link #getJoints() <em>Joints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoints()
	 * @generated
	 * @ordered
	 */
	protected Joint joints = JOINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiterLimit() <em>Miter Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiterLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Double MITER_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiterLimit() <em>Miter Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiterLimit()
	 * @generated
	 * @ordered
	 */
	protected Double miterLimit = MITER_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPixelHinting() <em>Pixel Hinting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixelHinting()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PIXEL_HINTING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPixelHinting() <em>Pixel Hinting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixelHinting()
	 * @generated
	 * @ordered
	 */
	protected Boolean pixelHinting = PIXEL_HINTING_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleMode() <em>Scale Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleMode()
	 * @generated
	 * @ordered
	 */
	protected static final ScaleMode SCALE_MODE_EDEFAULT = ScaleMode.NORMAL;

	/**
	 * The cached value of the '{@link #getScaleMode() <em>Scale Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleMode()
	 * @generated
	 * @ordered
	 */
	protected ScaleMode scaleMode = SCALE_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Double WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected Double weight = WEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolidColorStrokeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FxgPackage.Literals.SOLID_COLOR_STROKE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.SOLID_COLOR_STROKE__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cap getCaps() {
		return caps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaps(Cap newCaps) {
		Cap oldCaps = caps;
		caps = newCaps == null ? CAPS_EDEFAULT : newCaps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.SOLID_COLOR_STROKE__CAPS, oldCaps, caps));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.SOLID_COLOR_STROKE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Joint getJoints() {
		return joints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoints(Joint newJoints) {
		Joint oldJoints = joints;
		joints = newJoints == null ? JOINTS_EDEFAULT : newJoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.SOLID_COLOR_STROKE__JOINTS, oldJoints, joints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMiterLimit() {
		return miterLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiterLimit(Double newMiterLimit) {
		Double oldMiterLimit = miterLimit;
		miterLimit = newMiterLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.SOLID_COLOR_STROKE__MITER_LIMIT, oldMiterLimit, miterLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPixelHinting() {
		return pixelHinting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPixelHinting(Boolean newPixelHinting) {
		Boolean oldPixelHinting = pixelHinting;
		pixelHinting = newPixelHinting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.SOLID_COLOR_STROKE__PIXEL_HINTING, oldPixelHinting, pixelHinting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaleMode getScaleMode() {
		return scaleMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleMode(ScaleMode newScaleMode) {
		ScaleMode oldScaleMode = scaleMode;
		scaleMode = newScaleMode == null ? SCALE_MODE_EDEFAULT : newScaleMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.SOLID_COLOR_STROKE__SCALE_MODE, oldScaleMode, scaleMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(Double newWeight) {
		Double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.SOLID_COLOR_STROKE__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FxgPackage.SOLID_COLOR_STROKE__ALPHA:
				return getAlpha();
			case FxgPackage.SOLID_COLOR_STROKE__CAPS:
				return getCaps();
			case FxgPackage.SOLID_COLOR_STROKE__COLOR:
				return getColor();
			case FxgPackage.SOLID_COLOR_STROKE__JOINTS:
				return getJoints();
			case FxgPackage.SOLID_COLOR_STROKE__MITER_LIMIT:
				return getMiterLimit();
			case FxgPackage.SOLID_COLOR_STROKE__PIXEL_HINTING:
				return getPixelHinting();
			case FxgPackage.SOLID_COLOR_STROKE__SCALE_MODE:
				return getScaleMode();
			case FxgPackage.SOLID_COLOR_STROKE__WEIGHT:
				return getWeight();
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
			case FxgPackage.SOLID_COLOR_STROKE__ALPHA:
				setAlpha((Double)newValue);
				return;
			case FxgPackage.SOLID_COLOR_STROKE__CAPS:
				setCaps((Cap)newValue);
				return;
			case FxgPackage.SOLID_COLOR_STROKE__COLOR:
				setColor((String)newValue);
				return;
			case FxgPackage.SOLID_COLOR_STROKE__JOINTS:
				setJoints((Joint)newValue);
				return;
			case FxgPackage.SOLID_COLOR_STROKE__MITER_LIMIT:
				setMiterLimit((Double)newValue);
				return;
			case FxgPackage.SOLID_COLOR_STROKE__PIXEL_HINTING:
				setPixelHinting((Boolean)newValue);
				return;
			case FxgPackage.SOLID_COLOR_STROKE__SCALE_MODE:
				setScaleMode((ScaleMode)newValue);
				return;
			case FxgPackage.SOLID_COLOR_STROKE__WEIGHT:
				setWeight((Double)newValue);
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
			case FxgPackage.SOLID_COLOR_STROKE__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case FxgPackage.SOLID_COLOR_STROKE__CAPS:
				setCaps(CAPS_EDEFAULT);
				return;
			case FxgPackage.SOLID_COLOR_STROKE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case FxgPackage.SOLID_COLOR_STROKE__JOINTS:
				setJoints(JOINTS_EDEFAULT);
				return;
			case FxgPackage.SOLID_COLOR_STROKE__MITER_LIMIT:
				setMiterLimit(MITER_LIMIT_EDEFAULT);
				return;
			case FxgPackage.SOLID_COLOR_STROKE__PIXEL_HINTING:
				setPixelHinting(PIXEL_HINTING_EDEFAULT);
				return;
			case FxgPackage.SOLID_COLOR_STROKE__SCALE_MODE:
				setScaleMode(SCALE_MODE_EDEFAULT);
				return;
			case FxgPackage.SOLID_COLOR_STROKE__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
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
			case FxgPackage.SOLID_COLOR_STROKE__ALPHA:
				return ALPHA_EDEFAULT == null ? alpha != null : !ALPHA_EDEFAULT.equals(alpha);
			case FxgPackage.SOLID_COLOR_STROKE__CAPS:
				return caps != CAPS_EDEFAULT;
			case FxgPackage.SOLID_COLOR_STROKE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case FxgPackage.SOLID_COLOR_STROKE__JOINTS:
				return joints != JOINTS_EDEFAULT;
			case FxgPackage.SOLID_COLOR_STROKE__MITER_LIMIT:
				return MITER_LIMIT_EDEFAULT == null ? miterLimit != null : !MITER_LIMIT_EDEFAULT.equals(miterLimit);
			case FxgPackage.SOLID_COLOR_STROKE__PIXEL_HINTING:
				return PIXEL_HINTING_EDEFAULT == null ? pixelHinting != null : !PIXEL_HINTING_EDEFAULT.equals(pixelHinting);
			case FxgPackage.SOLID_COLOR_STROKE__SCALE_MODE:
				return scaleMode != SCALE_MODE_EDEFAULT;
			case FxgPackage.SOLID_COLOR_STROKE__WEIGHT:
				return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
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
		result.append(", caps: ");
		result.append(caps);
		result.append(", color: ");
		result.append(color);
		result.append(", joints: ");
		result.append(joints);
		result.append(", miterLimit: ");
		result.append(miterLimit);
		result.append(", pixelHinting: ");
		result.append(pixelHinting);
		result.append(", scaleMode: ");
		result.append(scaleMode);
		result.append(", weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //SolidColorStrokeImpl
