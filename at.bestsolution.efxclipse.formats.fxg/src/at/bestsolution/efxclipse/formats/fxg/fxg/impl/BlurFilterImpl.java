/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg.impl;

import at.bestsolution.efxclipse.formats.fxg.fxg.BlurFilter;
import at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blur Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BlurFilterImpl#getBlurX <em>Blur X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BlurFilterImpl#getBlurY <em>Blur Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BlurFilterImpl#getQuality <em>Quality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlurFilterImpl extends EObjectImpl implements BlurFilter {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlurFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FxgPackage.Literals.BLUR_FILTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.BLUR_FILTER__BLUR_X, oldBlurX, blurX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.BLUR_FILTER__BLUR_Y, oldBlurY, blurY));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.BLUR_FILTER__QUALITY, oldQuality, quality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FxgPackage.BLUR_FILTER__BLUR_X:
				return getBlurX();
			case FxgPackage.BLUR_FILTER__BLUR_Y:
				return getBlurY();
			case FxgPackage.BLUR_FILTER__QUALITY:
				return getQuality();
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
			case FxgPackage.BLUR_FILTER__BLUR_X:
				setBlurX((Double)newValue);
				return;
			case FxgPackage.BLUR_FILTER__BLUR_Y:
				setBlurY((Double)newValue);
				return;
			case FxgPackage.BLUR_FILTER__QUALITY:
				setQuality((Double)newValue);
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
			case FxgPackage.BLUR_FILTER__BLUR_X:
				setBlurX(BLUR_X_EDEFAULT);
				return;
			case FxgPackage.BLUR_FILTER__BLUR_Y:
				setBlurY(BLUR_Y_EDEFAULT);
				return;
			case FxgPackage.BLUR_FILTER__QUALITY:
				setQuality(QUALITY_EDEFAULT);
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
			case FxgPackage.BLUR_FILTER__BLUR_X:
				return BLUR_X_EDEFAULT == null ? blurX != null : !BLUR_X_EDEFAULT.equals(blurX);
			case FxgPackage.BLUR_FILTER__BLUR_Y:
				return BLUR_Y_EDEFAULT == null ? blurY != null : !BLUR_Y_EDEFAULT.equals(blurY);
			case FxgPackage.BLUR_FILTER__QUALITY:
				return QUALITY_EDEFAULT == null ? quality != null : !QUALITY_EDEFAULT.equals(quality);
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
		result.append(" (blurX: ");
		result.append(blurX);
		result.append(", blurY: ");
		result.append(blurY);
		result.append(", quality: ");
		result.append(quality);
		result.append(')');
		return result.toString();
	}

} //BlurFilterImpl
