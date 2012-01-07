/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg.impl;

import at.bestsolution.efxclipse.formats.fxg.fxg.ContainerElement;
import at.bestsolution.efxclipse.formats.fxg.fxg.FXGElement;
import at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage;
import at.bestsolution.efxclipse.formats.fxg.fxg.GradientEntry;
import at.bestsolution.efxclipse.formats.fxg.fxg.InterpolationMethod;
import at.bestsolution.efxclipse.formats.fxg.fxg.Matrix;
import at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient;
import at.bestsolution.efxclipse.formats.fxg.fxg.SpreadMethod;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radial Gradient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientImpl#get_children <em>children</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientImpl#getX <em>X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientImpl#getY <em>Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientImpl#getScaleX <em>Scale X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientImpl#getScaleY <em>Scale Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientImpl#getSpreadMethod <em>Spread Method</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientImpl#getInterpolationMethod <em>Interpolation Method</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientImpl#getFocalPointRatio <em>Focal Point Ratio</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientImpl#getMatrix <em>Matrix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadialGradientImpl extends EObjectImpl implements RadialGradient {
	/**
	 * The cached value of the '{@link #get_children() <em>children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_children()
	 * @generated
	 * @ordered
	 */
	protected EList<GradientEntry> _children;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final Double X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Double x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final Double Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected Double y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleX() <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleX()
	 * @generated
	 * @ordered
	 */
	protected static final Double SCALE_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleX() <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleX()
	 * @generated
	 * @ordered
	 */
	protected Double scaleX = SCALE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleY() <em>Scale Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleY()
	 * @generated
	 * @ordered
	 */
	protected static final Double SCALE_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleY() <em>Scale Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleY()
	 * @generated
	 * @ordered
	 */
	protected Double scaleY = SCALE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final Double ROTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected Double rotation = ROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpreadMethod() <em>Spread Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadMethod()
	 * @generated
	 * @ordered
	 */
	protected static final SpreadMethod SPREAD_METHOD_EDEFAULT = SpreadMethod.PAD;

	/**
	 * The cached value of the '{@link #getSpreadMethod() <em>Spread Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadMethod()
	 * @generated
	 * @ordered
	 */
	protected SpreadMethod spreadMethod = SPREAD_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterpolationMethod() <em>Interpolation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final InterpolationMethod INTERPOLATION_METHOD_EDEFAULT = InterpolationMethod.RGB;

	/**
	 * The cached value of the '{@link #getInterpolationMethod() <em>Interpolation Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolationMethod()
	 * @generated
	 * @ordered
	 */
	protected InterpolationMethod interpolationMethod = INTERPOLATION_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getFocalPointRatio() <em>Focal Point Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalPointRatio()
	 * @generated
	 * @ordered
	 */
	protected static final Double FOCAL_POINT_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFocalPointRatio() <em>Focal Point Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalPointRatio()
	 * @generated
	 * @ordered
	 */
	protected Double focalPointRatio = FOCAL_POINT_RATIO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatrix() <em>Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrix()
	 * @generated
	 * @ordered
	 */
	protected Matrix matrix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RadialGradientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FxgPackage.Literals.RADIAL_GRADIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GradientEntry> get_children() {
		if (_children == null) {
			_children = new EObjectContainmentEList<GradientEntry>(FXGElement.class, this, FxgPackage.RADIAL_GRADIENT__CHILDREN);
		}
		return _children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(Double newX) {
		Double oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(Double newY) {
		Double oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getScaleX() {
		return scaleX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleX(Double newScaleX) {
		Double oldScaleX = scaleX;
		scaleX = newScaleX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT__SCALE_X, oldScaleX, scaleX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getScaleY() {
		return scaleY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleY(Double newScaleY) {
		Double oldScaleY = scaleY;
		scaleY = newScaleY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT__SCALE_Y, oldScaleY, scaleY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(Double newRotation) {
		Double oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT__ROTATION, oldRotation, rotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadMethod getSpreadMethod() {
		return spreadMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadMethod(SpreadMethod newSpreadMethod) {
		SpreadMethod oldSpreadMethod = spreadMethod;
		spreadMethod = newSpreadMethod == null ? SPREAD_METHOD_EDEFAULT : newSpreadMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT__SPREAD_METHOD, oldSpreadMethod, spreadMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpolationMethod getInterpolationMethod() {
		return interpolationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpolationMethod(InterpolationMethod newInterpolationMethod) {
		InterpolationMethod oldInterpolationMethod = interpolationMethod;
		interpolationMethod = newInterpolationMethod == null ? INTERPOLATION_METHOD_EDEFAULT : newInterpolationMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT__INTERPOLATION_METHOD, oldInterpolationMethod, interpolationMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFocalPointRatio() {
		return focalPointRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocalPointRatio(Double newFocalPointRatio) {
		Double oldFocalPointRatio = focalPointRatio;
		focalPointRatio = newFocalPointRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT__FOCAL_POINT_RATIO, oldFocalPointRatio, focalPointRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix getMatrix() {
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatrix(Matrix newMatrix, NotificationChain msgs) {
		Matrix oldMatrix = matrix;
		matrix = newMatrix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT__MATRIX, oldMatrix, newMatrix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatrix(Matrix newMatrix) {
		if (newMatrix != matrix) {
			NotificationChain msgs = null;
			if (matrix != null)
				msgs = ((InternalEObject)matrix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FxgPackage.RADIAL_GRADIENT__MATRIX, null, msgs);
			if (newMatrix != null)
				msgs = ((InternalEObject)newMatrix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FxgPackage.RADIAL_GRADIENT__MATRIX, null, msgs);
			msgs = basicSetMatrix(newMatrix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT__MATRIX, newMatrix, newMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FxgPackage.RADIAL_GRADIENT__CHILDREN:
				return ((InternalEList<?>)get_children()).basicRemove(otherEnd, msgs);
			case FxgPackage.RADIAL_GRADIENT__MATRIX:
				return basicSetMatrix(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FxgPackage.RADIAL_GRADIENT__CHILDREN:
				return get_children();
			case FxgPackage.RADIAL_GRADIENT__X:
				return getX();
			case FxgPackage.RADIAL_GRADIENT__Y:
				return getY();
			case FxgPackage.RADIAL_GRADIENT__SCALE_X:
				return getScaleX();
			case FxgPackage.RADIAL_GRADIENT__SCALE_Y:
				return getScaleY();
			case FxgPackage.RADIAL_GRADIENT__ROTATION:
				return getRotation();
			case FxgPackage.RADIAL_GRADIENT__SPREAD_METHOD:
				return getSpreadMethod();
			case FxgPackage.RADIAL_GRADIENT__INTERPOLATION_METHOD:
				return getInterpolationMethod();
			case FxgPackage.RADIAL_GRADIENT__FOCAL_POINT_RATIO:
				return getFocalPointRatio();
			case FxgPackage.RADIAL_GRADIENT__MATRIX:
				return getMatrix();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FxgPackage.RADIAL_GRADIENT__CHILDREN:
				get_children().clear();
				get_children().addAll((Collection<? extends GradientEntry>)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT__X:
				setX((Double)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT__Y:
				setY((Double)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT__SCALE_X:
				setScaleX((Double)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT__SCALE_Y:
				setScaleY((Double)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT__ROTATION:
				setRotation((Double)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT__SPREAD_METHOD:
				setSpreadMethod((SpreadMethod)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT__INTERPOLATION_METHOD:
				setInterpolationMethod((InterpolationMethod)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT__FOCAL_POINT_RATIO:
				setFocalPointRatio((Double)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT__MATRIX:
				setMatrix((Matrix)newValue);
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
			case FxgPackage.RADIAL_GRADIENT__CHILDREN:
				get_children().clear();
				return;
			case FxgPackage.RADIAL_GRADIENT__X:
				setX(X_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT__Y:
				setY(Y_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT__SCALE_X:
				setScaleX(SCALE_X_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT__SCALE_Y:
				setScaleY(SCALE_Y_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT__ROTATION:
				setRotation(ROTATION_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT__SPREAD_METHOD:
				setSpreadMethod(SPREAD_METHOD_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT__INTERPOLATION_METHOD:
				setInterpolationMethod(INTERPOLATION_METHOD_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT__FOCAL_POINT_RATIO:
				setFocalPointRatio(FOCAL_POINT_RATIO_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT__MATRIX:
				setMatrix((Matrix)null);
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
			case FxgPackage.RADIAL_GRADIENT__CHILDREN:
				return _children != null && !_children.isEmpty();
			case FxgPackage.RADIAL_GRADIENT__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case FxgPackage.RADIAL_GRADIENT__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case FxgPackage.RADIAL_GRADIENT__SCALE_X:
				return SCALE_X_EDEFAULT == null ? scaleX != null : !SCALE_X_EDEFAULT.equals(scaleX);
			case FxgPackage.RADIAL_GRADIENT__SCALE_Y:
				return SCALE_Y_EDEFAULT == null ? scaleY != null : !SCALE_Y_EDEFAULT.equals(scaleY);
			case FxgPackage.RADIAL_GRADIENT__ROTATION:
				return ROTATION_EDEFAULT == null ? rotation != null : !ROTATION_EDEFAULT.equals(rotation);
			case FxgPackage.RADIAL_GRADIENT__SPREAD_METHOD:
				return spreadMethod != SPREAD_METHOD_EDEFAULT;
			case FxgPackage.RADIAL_GRADIENT__INTERPOLATION_METHOD:
				return interpolationMethod != INTERPOLATION_METHOD_EDEFAULT;
			case FxgPackage.RADIAL_GRADIENT__FOCAL_POINT_RATIO:
				return FOCAL_POINT_RATIO_EDEFAULT == null ? focalPointRatio != null : !FOCAL_POINT_RATIO_EDEFAULT.equals(focalPointRatio);
			case FxgPackage.RADIAL_GRADIENT__MATRIX:
				return matrix != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ContainerElement.class) {
			switch (derivedFeatureID) {
				case FxgPackage.RADIAL_GRADIENT__CHILDREN: return FxgPackage.CONTAINER_ELEMENT__CHILDREN;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ContainerElement.class) {
			switch (baseFeatureID) {
				case FxgPackage.CONTAINER_ELEMENT__CHILDREN: return FxgPackage.RADIAL_GRADIENT__CHILDREN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", scaleX: ");
		result.append(scaleX);
		result.append(", scaleY: ");
		result.append(scaleY);
		result.append(", rotation: ");
		result.append(rotation);
		result.append(", spreadMethod: ");
		result.append(spreadMethod);
		result.append(", interpolationMethod: ");
		result.append(interpolationMethod);
		result.append(", focalPointRatio: ");
		result.append(focalPointRatio);
		result.append(')');
		return result.toString();
	}

} //RadialGradientImpl
