/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg.impl;

import at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform;
import at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Transform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.ColorTransformImpl#getAlphaMultiplier <em>Alpha Multiplier</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.ColorTransformImpl#getAlphaOffset <em>Alpha Offset</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.ColorTransformImpl#getBlueMultiplier <em>Blue Multiplier</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.ColorTransformImpl#getBlueOffset <em>Blue Offset</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.ColorTransformImpl#getGreenMultiplier <em>Green Multiplier</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.ColorTransformImpl#getGreenOffset <em>Green Offset</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.ColorTransformImpl#getRedMultiplier <em>Red Multiplier</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.ColorTransformImpl#getRedOffset <em>Red Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColorTransformImpl extends EObjectImpl implements ColorTransform {
	/**
	 * The default value of the '{@link #getAlphaMultiplier() <em>Alpha Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphaMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final Double ALPHA_MULTIPLIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlphaMultiplier() <em>Alpha Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphaMultiplier()
	 * @generated
	 * @ordered
	 */
	protected Double alphaMultiplier = ALPHA_MULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlphaOffset() <em>Alpha Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphaOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Double ALPHA_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlphaOffset() <em>Alpha Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphaOffset()
	 * @generated
	 * @ordered
	 */
	protected Double alphaOffset = ALPHA_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlueMultiplier() <em>Blue Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlueMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final Double BLUE_MULTIPLIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlueMultiplier() <em>Blue Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlueMultiplier()
	 * @generated
	 * @ordered
	 */
	protected Double blueMultiplier = BLUE_MULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlueOffset() <em>Blue Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlueOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Double BLUE_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlueOffset() <em>Blue Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlueOffset()
	 * @generated
	 * @ordered
	 */
	protected Double blueOffset = BLUE_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getGreenMultiplier() <em>Green Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreenMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final Double GREEN_MULTIPLIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGreenMultiplier() <em>Green Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreenMultiplier()
	 * @generated
	 * @ordered
	 */
	protected Double greenMultiplier = GREEN_MULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getGreenOffset() <em>Green Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreenOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Double GREEN_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGreenOffset() <em>Green Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreenOffset()
	 * @generated
	 * @ordered
	 */
	protected Double greenOffset = GREEN_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedMultiplier() <em>Red Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final Double RED_MULTIPLIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedMultiplier() <em>Red Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedMultiplier()
	 * @generated
	 * @ordered
	 */
	protected Double redMultiplier = RED_MULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedOffset() <em>Red Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Double RED_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedOffset() <em>Red Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedOffset()
	 * @generated
	 * @ordered
	 */
	protected Double redOffset = RED_OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorTransformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FxgPackage.Literals.COLOR_TRANSFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAlphaMultiplier() {
		return alphaMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphaMultiplier(Double newAlphaMultiplier) {
		Double oldAlphaMultiplier = alphaMultiplier;
		alphaMultiplier = newAlphaMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.COLOR_TRANSFORM__ALPHA_MULTIPLIER, oldAlphaMultiplier, alphaMultiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAlphaOffset() {
		return alphaOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphaOffset(Double newAlphaOffset) {
		Double oldAlphaOffset = alphaOffset;
		alphaOffset = newAlphaOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.COLOR_TRANSFORM__ALPHA_OFFSET, oldAlphaOffset, alphaOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBlueMultiplier() {
		return blueMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlueMultiplier(Double newBlueMultiplier) {
		Double oldBlueMultiplier = blueMultiplier;
		blueMultiplier = newBlueMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.COLOR_TRANSFORM__BLUE_MULTIPLIER, oldBlueMultiplier, blueMultiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBlueOffset() {
		return blueOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlueOffset(Double newBlueOffset) {
		Double oldBlueOffset = blueOffset;
		blueOffset = newBlueOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.COLOR_TRANSFORM__BLUE_OFFSET, oldBlueOffset, blueOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getGreenMultiplier() {
		return greenMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreenMultiplier(Double newGreenMultiplier) {
		Double oldGreenMultiplier = greenMultiplier;
		greenMultiplier = newGreenMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.COLOR_TRANSFORM__GREEN_MULTIPLIER, oldGreenMultiplier, greenMultiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getGreenOffset() {
		return greenOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreenOffset(Double newGreenOffset) {
		Double oldGreenOffset = greenOffset;
		greenOffset = newGreenOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.COLOR_TRANSFORM__GREEN_OFFSET, oldGreenOffset, greenOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRedMultiplier() {
		return redMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedMultiplier(Double newRedMultiplier) {
		Double oldRedMultiplier = redMultiplier;
		redMultiplier = newRedMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.COLOR_TRANSFORM__RED_MULTIPLIER, oldRedMultiplier, redMultiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRedOffset() {
		return redOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedOffset(Double newRedOffset) {
		Double oldRedOffset = redOffset;
		redOffset = newRedOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.COLOR_TRANSFORM__RED_OFFSET, oldRedOffset, redOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FxgPackage.COLOR_TRANSFORM__ALPHA_MULTIPLIER:
				return getAlphaMultiplier();
			case FxgPackage.COLOR_TRANSFORM__ALPHA_OFFSET:
				return getAlphaOffset();
			case FxgPackage.COLOR_TRANSFORM__BLUE_MULTIPLIER:
				return getBlueMultiplier();
			case FxgPackage.COLOR_TRANSFORM__BLUE_OFFSET:
				return getBlueOffset();
			case FxgPackage.COLOR_TRANSFORM__GREEN_MULTIPLIER:
				return getGreenMultiplier();
			case FxgPackage.COLOR_TRANSFORM__GREEN_OFFSET:
				return getGreenOffset();
			case FxgPackage.COLOR_TRANSFORM__RED_MULTIPLIER:
				return getRedMultiplier();
			case FxgPackage.COLOR_TRANSFORM__RED_OFFSET:
				return getRedOffset();
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
			case FxgPackage.COLOR_TRANSFORM__ALPHA_MULTIPLIER:
				setAlphaMultiplier((Double)newValue);
				return;
			case FxgPackage.COLOR_TRANSFORM__ALPHA_OFFSET:
				setAlphaOffset((Double)newValue);
				return;
			case FxgPackage.COLOR_TRANSFORM__BLUE_MULTIPLIER:
				setBlueMultiplier((Double)newValue);
				return;
			case FxgPackage.COLOR_TRANSFORM__BLUE_OFFSET:
				setBlueOffset((Double)newValue);
				return;
			case FxgPackage.COLOR_TRANSFORM__GREEN_MULTIPLIER:
				setGreenMultiplier((Double)newValue);
				return;
			case FxgPackage.COLOR_TRANSFORM__GREEN_OFFSET:
				setGreenOffset((Double)newValue);
				return;
			case FxgPackage.COLOR_TRANSFORM__RED_MULTIPLIER:
				setRedMultiplier((Double)newValue);
				return;
			case FxgPackage.COLOR_TRANSFORM__RED_OFFSET:
				setRedOffset((Double)newValue);
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
			case FxgPackage.COLOR_TRANSFORM__ALPHA_MULTIPLIER:
				setAlphaMultiplier(ALPHA_MULTIPLIER_EDEFAULT);
				return;
			case FxgPackage.COLOR_TRANSFORM__ALPHA_OFFSET:
				setAlphaOffset(ALPHA_OFFSET_EDEFAULT);
				return;
			case FxgPackage.COLOR_TRANSFORM__BLUE_MULTIPLIER:
				setBlueMultiplier(BLUE_MULTIPLIER_EDEFAULT);
				return;
			case FxgPackage.COLOR_TRANSFORM__BLUE_OFFSET:
				setBlueOffset(BLUE_OFFSET_EDEFAULT);
				return;
			case FxgPackage.COLOR_TRANSFORM__GREEN_MULTIPLIER:
				setGreenMultiplier(GREEN_MULTIPLIER_EDEFAULT);
				return;
			case FxgPackage.COLOR_TRANSFORM__GREEN_OFFSET:
				setGreenOffset(GREEN_OFFSET_EDEFAULT);
				return;
			case FxgPackage.COLOR_TRANSFORM__RED_MULTIPLIER:
				setRedMultiplier(RED_MULTIPLIER_EDEFAULT);
				return;
			case FxgPackage.COLOR_TRANSFORM__RED_OFFSET:
				setRedOffset(RED_OFFSET_EDEFAULT);
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
			case FxgPackage.COLOR_TRANSFORM__ALPHA_MULTIPLIER:
				return ALPHA_MULTIPLIER_EDEFAULT == null ? alphaMultiplier != null : !ALPHA_MULTIPLIER_EDEFAULT.equals(alphaMultiplier);
			case FxgPackage.COLOR_TRANSFORM__ALPHA_OFFSET:
				return ALPHA_OFFSET_EDEFAULT == null ? alphaOffset != null : !ALPHA_OFFSET_EDEFAULT.equals(alphaOffset);
			case FxgPackage.COLOR_TRANSFORM__BLUE_MULTIPLIER:
				return BLUE_MULTIPLIER_EDEFAULT == null ? blueMultiplier != null : !BLUE_MULTIPLIER_EDEFAULT.equals(blueMultiplier);
			case FxgPackage.COLOR_TRANSFORM__BLUE_OFFSET:
				return BLUE_OFFSET_EDEFAULT == null ? blueOffset != null : !BLUE_OFFSET_EDEFAULT.equals(blueOffset);
			case FxgPackage.COLOR_TRANSFORM__GREEN_MULTIPLIER:
				return GREEN_MULTIPLIER_EDEFAULT == null ? greenMultiplier != null : !GREEN_MULTIPLIER_EDEFAULT.equals(greenMultiplier);
			case FxgPackage.COLOR_TRANSFORM__GREEN_OFFSET:
				return GREEN_OFFSET_EDEFAULT == null ? greenOffset != null : !GREEN_OFFSET_EDEFAULT.equals(greenOffset);
			case FxgPackage.COLOR_TRANSFORM__RED_MULTIPLIER:
				return RED_MULTIPLIER_EDEFAULT == null ? redMultiplier != null : !RED_MULTIPLIER_EDEFAULT.equals(redMultiplier);
			case FxgPackage.COLOR_TRANSFORM__RED_OFFSET:
				return RED_OFFSET_EDEFAULT == null ? redOffset != null : !RED_OFFSET_EDEFAULT.equals(redOffset);
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
		result.append(" (alphaMultiplier: ");
		result.append(alphaMultiplier);
		result.append(", alphaOffset: ");
		result.append(alphaOffset);
		result.append(", blueMultiplier: ");
		result.append(blueMultiplier);
		result.append(", blueOffset: ");
		result.append(blueOffset);
		result.append(", greenMultiplier: ");
		result.append(greenMultiplier);
		result.append(", greenOffset: ");
		result.append(greenOffset);
		result.append(", redMultiplier: ");
		result.append(redMultiplier);
		result.append(", redOffset: ");
		result.append(redOffset);
		result.append(')');
		return result.toString();
	}

} //ColorTransformImpl
