/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg.impl;

import at.bestsolution.efxclipse.formats.fxg.fxg.Cap;
import at.bestsolution.efxclipse.formats.fxg.fxg.ContainerElement;
import at.bestsolution.efxclipse.formats.fxg.fxg.FXGElement;
import at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage;
import at.bestsolution.efxclipse.formats.fxg.fxg.GradientEntry;
import at.bestsolution.efxclipse.formats.fxg.fxg.InterpolationMethod;
import at.bestsolution.efxclipse.formats.fxg.fxg.Joint;
import at.bestsolution.efxclipse.formats.fxg.fxg.Matrix;
import at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke;
import at.bestsolution.efxclipse.formats.fxg.fxg.ScaleMode;
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
 * An implementation of the model object '<em><b>Radial Gradient Stroke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl#get_children <em>children</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl#getX <em>X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl#getY <em>Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl#getScaleX <em>Scale X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl#getScaleY <em>Scale Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl#getSpreadMethod <em>Spread Method</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl#getInterpolationMethod <em>Interpolation Method</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl#getFocalPointRatio <em>Focal Point Ratio</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl#getScaleMode <em>Scale Mode</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl#getCaps <em>Caps</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl#getJoints <em>Joints</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl#getMiterLimit <em>Miter Limit</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl#getPixelHinting <em>Pixel Hinting</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl#getMatrix <em>Matrix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RadialGradientStrokeImpl extends EObjectImpl implements RadialGradientStroke {
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
	protected static final SpreadMethod SPREAD_METHOD_EDEFAULT = SpreadMethod.NOT_SET;

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
	protected static final InterpolationMethod INTERPOLATION_METHOD_EDEFAULT = InterpolationMethod.NOT_SET;

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
	protected RadialGradientStrokeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FxgPackage.Literals.RADIAL_GRADIENT_STROKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GradientEntry> get_children() {
		if (_children == null) {
			_children = new EObjectContainmentEList<GradientEntry>(FXGElement.class, this, FxgPackage.RADIAL_GRADIENT_STROKE__CHILDREN);
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT_STROKE__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT_STROKE__Y, oldY, y));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT_STROKE__SCALE_X, oldScaleX, scaleX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT_STROKE__SCALE_Y, oldScaleY, scaleY));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT_STROKE__ROTATION, oldRotation, rotation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT_STROKE__SPREAD_METHOD, oldSpreadMethod, spreadMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT_STROKE__INTERPOLATION_METHOD, oldInterpolationMethod, interpolationMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT_STROKE__FOCAL_POINT_RATIO, oldFocalPointRatio, focalPointRatio));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT_STROKE__SCALE_MODE, oldScaleMode, scaleMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT_STROKE__CAPS, oldCaps, caps));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT_STROKE__JOINTS, oldJoints, joints));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT_STROKE__MITER_LIMIT, oldMiterLimit, miterLimit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT_STROKE__WEIGHT, oldWeight, weight));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT_STROKE__PIXEL_HINTING, oldPixelHinting, pixelHinting));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT_STROKE__MATRIX, oldMatrix, newMatrix);
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
				msgs = ((InternalEObject)matrix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FxgPackage.RADIAL_GRADIENT_STROKE__MATRIX, null, msgs);
			if (newMatrix != null)
				msgs = ((InternalEObject)newMatrix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FxgPackage.RADIAL_GRADIENT_STROKE__MATRIX, null, msgs);
			msgs = basicSetMatrix(newMatrix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RADIAL_GRADIENT_STROKE__MATRIX, newMatrix, newMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FxgPackage.RADIAL_GRADIENT_STROKE__CHILDREN:
				return ((InternalEList<?>)get_children()).basicRemove(otherEnd, msgs);
			case FxgPackage.RADIAL_GRADIENT_STROKE__MATRIX:
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
			case FxgPackage.RADIAL_GRADIENT_STROKE__CHILDREN:
				return get_children();
			case FxgPackage.RADIAL_GRADIENT_STROKE__X:
				return getX();
			case FxgPackage.RADIAL_GRADIENT_STROKE__Y:
				return getY();
			case FxgPackage.RADIAL_GRADIENT_STROKE__SCALE_X:
				return getScaleX();
			case FxgPackage.RADIAL_GRADIENT_STROKE__SCALE_Y:
				return getScaleY();
			case FxgPackage.RADIAL_GRADIENT_STROKE__ROTATION:
				return getRotation();
			case FxgPackage.RADIAL_GRADIENT_STROKE__SPREAD_METHOD:
				return getSpreadMethod();
			case FxgPackage.RADIAL_GRADIENT_STROKE__INTERPOLATION_METHOD:
				return getInterpolationMethod();
			case FxgPackage.RADIAL_GRADIENT_STROKE__FOCAL_POINT_RATIO:
				return getFocalPointRatio();
			case FxgPackage.RADIAL_GRADIENT_STROKE__SCALE_MODE:
				return getScaleMode();
			case FxgPackage.RADIAL_GRADIENT_STROKE__CAPS:
				return getCaps();
			case FxgPackage.RADIAL_GRADIENT_STROKE__JOINTS:
				return getJoints();
			case FxgPackage.RADIAL_GRADIENT_STROKE__MITER_LIMIT:
				return getMiterLimit();
			case FxgPackage.RADIAL_GRADIENT_STROKE__WEIGHT:
				return getWeight();
			case FxgPackage.RADIAL_GRADIENT_STROKE__PIXEL_HINTING:
				return getPixelHinting();
			case FxgPackage.RADIAL_GRADIENT_STROKE__MATRIX:
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
			case FxgPackage.RADIAL_GRADIENT_STROKE__CHILDREN:
				get_children().clear();
				get_children().addAll((Collection<? extends GradientEntry>)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__X:
				setX((Double)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__Y:
				setY((Double)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__SCALE_X:
				setScaleX((Double)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__SCALE_Y:
				setScaleY((Double)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__ROTATION:
				setRotation((Double)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__SPREAD_METHOD:
				setSpreadMethod((SpreadMethod)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__INTERPOLATION_METHOD:
				setInterpolationMethod((InterpolationMethod)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__FOCAL_POINT_RATIO:
				setFocalPointRatio((Double)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__SCALE_MODE:
				setScaleMode((ScaleMode)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__CAPS:
				setCaps((Cap)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__JOINTS:
				setJoints((Joint)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__MITER_LIMIT:
				setMiterLimit((Double)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__WEIGHT:
				setWeight((Double)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__PIXEL_HINTING:
				setPixelHinting((Boolean)newValue);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__MATRIX:
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
			case FxgPackage.RADIAL_GRADIENT_STROKE__CHILDREN:
				get_children().clear();
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__X:
				setX(X_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__Y:
				setY(Y_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__SCALE_X:
				setScaleX(SCALE_X_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__SCALE_Y:
				setScaleY(SCALE_Y_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__ROTATION:
				setRotation(ROTATION_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__SPREAD_METHOD:
				setSpreadMethod(SPREAD_METHOD_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__INTERPOLATION_METHOD:
				setInterpolationMethod(INTERPOLATION_METHOD_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__FOCAL_POINT_RATIO:
				setFocalPointRatio(FOCAL_POINT_RATIO_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__SCALE_MODE:
				setScaleMode(SCALE_MODE_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__CAPS:
				setCaps(CAPS_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__JOINTS:
				setJoints(JOINTS_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__MITER_LIMIT:
				setMiterLimit(MITER_LIMIT_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__PIXEL_HINTING:
				setPixelHinting(PIXEL_HINTING_EDEFAULT);
				return;
			case FxgPackage.RADIAL_GRADIENT_STROKE__MATRIX:
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
			case FxgPackage.RADIAL_GRADIENT_STROKE__CHILDREN:
				return _children != null && !_children.isEmpty();
			case FxgPackage.RADIAL_GRADIENT_STROKE__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case FxgPackage.RADIAL_GRADIENT_STROKE__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case FxgPackage.RADIAL_GRADIENT_STROKE__SCALE_X:
				return SCALE_X_EDEFAULT == null ? scaleX != null : !SCALE_X_EDEFAULT.equals(scaleX);
			case FxgPackage.RADIAL_GRADIENT_STROKE__SCALE_Y:
				return SCALE_Y_EDEFAULT == null ? scaleY != null : !SCALE_Y_EDEFAULT.equals(scaleY);
			case FxgPackage.RADIAL_GRADIENT_STROKE__ROTATION:
				return ROTATION_EDEFAULT == null ? rotation != null : !ROTATION_EDEFAULT.equals(rotation);
			case FxgPackage.RADIAL_GRADIENT_STROKE__SPREAD_METHOD:
				return spreadMethod != SPREAD_METHOD_EDEFAULT;
			case FxgPackage.RADIAL_GRADIENT_STROKE__INTERPOLATION_METHOD:
				return interpolationMethod != INTERPOLATION_METHOD_EDEFAULT;
			case FxgPackage.RADIAL_GRADIENT_STROKE__FOCAL_POINT_RATIO:
				return FOCAL_POINT_RATIO_EDEFAULT == null ? focalPointRatio != null : !FOCAL_POINT_RATIO_EDEFAULT.equals(focalPointRatio);
			case FxgPackage.RADIAL_GRADIENT_STROKE__SCALE_MODE:
				return scaleMode != SCALE_MODE_EDEFAULT;
			case FxgPackage.RADIAL_GRADIENT_STROKE__CAPS:
				return caps != CAPS_EDEFAULT;
			case FxgPackage.RADIAL_GRADIENT_STROKE__JOINTS:
				return joints != JOINTS_EDEFAULT;
			case FxgPackage.RADIAL_GRADIENT_STROKE__MITER_LIMIT:
				return MITER_LIMIT_EDEFAULT == null ? miterLimit != null : !MITER_LIMIT_EDEFAULT.equals(miterLimit);
			case FxgPackage.RADIAL_GRADIENT_STROKE__WEIGHT:
				return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
			case FxgPackage.RADIAL_GRADIENT_STROKE__PIXEL_HINTING:
				return PIXEL_HINTING_EDEFAULT == null ? pixelHinting != null : !PIXEL_HINTING_EDEFAULT.equals(pixelHinting);
			case FxgPackage.RADIAL_GRADIENT_STROKE__MATRIX:
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
				case FxgPackage.RADIAL_GRADIENT_STROKE__CHILDREN: return FxgPackage.CONTAINER_ELEMENT__CHILDREN;
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
				case FxgPackage.CONTAINER_ELEMENT__CHILDREN: return FxgPackage.RADIAL_GRADIENT_STROKE__CHILDREN;
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
		result.append(", scaleMode: ");
		result.append(scaleMode);
		result.append(", caps: ");
		result.append(caps);
		result.append(", joints: ");
		result.append(joints);
		result.append(", miterLimit: ");
		result.append(miterLimit);
		result.append(", weight: ");
		result.append(weight);
		result.append(", pixelHinting: ");
		result.append(pixelHinting);
		result.append(')');
		return result.toString();
	}

} //RadialGradientStrokeImpl
