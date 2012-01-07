/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg.impl;

import at.bestsolution.efxclipse.formats.fxg.fxg.BlendMode;
import at.bestsolution.efxclipse.formats.fxg.fxg.FXGElement;
import at.bestsolution.efxclipse.formats.fxg.fxg.Filter;
import at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage;
import at.bestsolution.efxclipse.formats.fxg.fxg.Group;
import at.bestsolution.efxclipse.formats.fxg.fxg.Transform;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl#getScaleX <em>Scale X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl#getScaleY <em>Scale Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl#getX <em>X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl#getY <em>Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl#getBlendMode <em>Blend Mode</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl#getTransformX <em>Transform X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl#getTransformY <em>Transform Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl#getMaskType <em>Mask Type</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl#getScaleGridLeft <em>Scale Grid Left</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl#getScaleGridRight <em>Scale Grid Right</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl#getScaleGridTop <em>Scale Grid Top</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl#getScaleGridBottom <em>Scale Grid Bottom</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl#getFilters <em>Filters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupImpl extends ContainerElementImpl<FXGElement> implements Group {
	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final String ROTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected String rotation = ROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleX() <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleX()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleX() <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleX()
	 * @generated
	 * @ordered
	 */
	protected String scaleX = SCALE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleY() <em>Scale Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleY()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleY() <em>Scale Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleY()
	 * @generated
	 * @ordered
	 */
	protected String scaleY = SCALE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final String X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected String x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final String Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected String y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlendMode() <em>Blend Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlendMode()
	 * @generated
	 * @ordered
	 */
	protected static final BlendMode BLEND_MODE_EDEFAULT = BlendMode.NOT_SET;

	/**
	 * The cached value of the '{@link #getBlendMode() <em>Blend Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlendMode()
	 * @generated
	 * @ordered
	 */
	protected BlendMode blendMode = BLEND_MODE_EDEFAULT;

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransformX() <em>Transform X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformX()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORM_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformX() <em>Transform X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformX()
	 * @generated
	 * @ordered
	 */
	protected String transformX = TRANSFORM_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransformY() <em>Transform Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformY()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSFORM_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformY() <em>Transform Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformY()
	 * @generated
	 * @ordered
	 */
	protected String transformY = TRANSFORM_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskType() <em>Mask Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskType()
	 * @generated
	 * @ordered
	 */
	protected static final String MASK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaskType() <em>Mask Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskType()
	 * @generated
	 * @ordered
	 */
	protected String maskType = MASK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected String visible = VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleGridLeft() <em>Scale Grid Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleGridLeft()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_GRID_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleGridLeft() <em>Scale Grid Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleGridLeft()
	 * @generated
	 * @ordered
	 */
	protected String scaleGridLeft = SCALE_GRID_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleGridRight() <em>Scale Grid Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleGridRight()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_GRID_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleGridRight() <em>Scale Grid Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleGridRight()
	 * @generated
	 * @ordered
	 */
	protected String scaleGridRight = SCALE_GRID_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleGridTop() <em>Scale Grid Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleGridTop()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_GRID_TOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleGridTop() <em>Scale Grid Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleGridTop()
	 * @generated
	 * @ordered
	 */
	protected String scaleGridTop = SCALE_GRID_TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleGridBottom() <em>Scale Grid Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleGridBottom()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_GRID_BOTTOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScaleGridBottom() <em>Scale Grid Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleGridBottom()
	 * @generated
	 * @ordered
	 */
	protected String scaleGridBottom = SCALE_GRID_BOTTOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransform() <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransform()
	 * @generated
	 * @ordered
	 */
	protected Transform transform;

	/**
	 * The cached value of the '{@link #getFilters() <em>Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<Filter> filters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FxgPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(String newRotation) {
		String oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GROUP__ROTATION, oldRotation, rotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScaleX() {
		return scaleX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleX(String newScaleX) {
		String oldScaleX = scaleX;
		scaleX = newScaleX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GROUP__SCALE_X, oldScaleX, scaleX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScaleY() {
		return scaleY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleY(String newScaleY) {
		String oldScaleY = scaleY;
		scaleY = newScaleY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GROUP__SCALE_Y, oldScaleY, scaleY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(String newX) {
		String oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GROUP__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(String newY) {
		String oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GROUP__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlendMode getBlendMode() {
		return blendMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlendMode(BlendMode newBlendMode) {
		BlendMode oldBlendMode = blendMode;
		blendMode = newBlendMode == null ? BLEND_MODE_EDEFAULT : newBlendMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GROUP__BLEND_MODE, oldBlendMode, blendMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GROUP__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GROUP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransformX() {
		return transformX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformX(String newTransformX) {
		String oldTransformX = transformX;
		transformX = newTransformX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GROUP__TRANSFORM_X, oldTransformX, transformX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransformY() {
		return transformY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformY(String newTransformY) {
		String oldTransformY = transformY;
		transformY = newTransformY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GROUP__TRANSFORM_Y, oldTransformY, transformY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaskType() {
		return maskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaskType(String newMaskType) {
		String oldMaskType = maskType;
		maskType = newMaskType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GROUP__MASK_TYPE, oldMaskType, maskType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(String newVisible) {
		String oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GROUP__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScaleGridLeft() {
		return scaleGridLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleGridLeft(String newScaleGridLeft) {
		String oldScaleGridLeft = scaleGridLeft;
		scaleGridLeft = newScaleGridLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GROUP__SCALE_GRID_LEFT, oldScaleGridLeft, scaleGridLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScaleGridRight() {
		return scaleGridRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleGridRight(String newScaleGridRight) {
		String oldScaleGridRight = scaleGridRight;
		scaleGridRight = newScaleGridRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GROUP__SCALE_GRID_RIGHT, oldScaleGridRight, scaleGridRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScaleGridTop() {
		return scaleGridTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleGridTop(String newScaleGridTop) {
		String oldScaleGridTop = scaleGridTop;
		scaleGridTop = newScaleGridTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GROUP__SCALE_GRID_TOP, oldScaleGridTop, scaleGridTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScaleGridBottom() {
		return scaleGridBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleGridBottom(String newScaleGridBottom) {
		String oldScaleGridBottom = scaleGridBottom;
		scaleGridBottom = newScaleGridBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GROUP__SCALE_GRID_BOTTOM, oldScaleGridBottom, scaleGridBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transform getTransform() {
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransform(Transform newTransform, NotificationChain msgs) {
		Transform oldTransform = transform;
		transform = newTransform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FxgPackage.GROUP__TRANSFORM, oldTransform, newTransform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransform(Transform newTransform) {
		if (newTransform != transform) {
			NotificationChain msgs = null;
			if (transform != null)
				msgs = ((InternalEObject)transform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FxgPackage.GROUP__TRANSFORM, null, msgs);
			if (newTransform != null)
				msgs = ((InternalEObject)newTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FxgPackage.GROUP__TRANSFORM, null, msgs);
			msgs = basicSetTransform(newTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GROUP__TRANSFORM, newTransform, newTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<Filter>(Filter.class, this, FxgPackage.GROUP__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FxgPackage.GROUP__TRANSFORM:
				return basicSetTransform(null, msgs);
			case FxgPackage.GROUP__FILTERS:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
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
			case FxgPackage.GROUP__ROTATION:
				return getRotation();
			case FxgPackage.GROUP__SCALE_X:
				return getScaleX();
			case FxgPackage.GROUP__SCALE_Y:
				return getScaleY();
			case FxgPackage.GROUP__X:
				return getX();
			case FxgPackage.GROUP__Y:
				return getY();
			case FxgPackage.GROUP__BLEND_MODE:
				return getBlendMode();
			case FxgPackage.GROUP__ALPHA:
				return getAlpha();
			case FxgPackage.GROUP__ID:
				return getId();
			case FxgPackage.GROUP__TRANSFORM_X:
				return getTransformX();
			case FxgPackage.GROUP__TRANSFORM_Y:
				return getTransformY();
			case FxgPackage.GROUP__MASK_TYPE:
				return getMaskType();
			case FxgPackage.GROUP__VISIBLE:
				return getVisible();
			case FxgPackage.GROUP__SCALE_GRID_LEFT:
				return getScaleGridLeft();
			case FxgPackage.GROUP__SCALE_GRID_RIGHT:
				return getScaleGridRight();
			case FxgPackage.GROUP__SCALE_GRID_TOP:
				return getScaleGridTop();
			case FxgPackage.GROUP__SCALE_GRID_BOTTOM:
				return getScaleGridBottom();
			case FxgPackage.GROUP__TRANSFORM:
				return getTransform();
			case FxgPackage.GROUP__FILTERS:
				return getFilters();
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
			case FxgPackage.GROUP__ROTATION:
				setRotation((String)newValue);
				return;
			case FxgPackage.GROUP__SCALE_X:
				setScaleX((String)newValue);
				return;
			case FxgPackage.GROUP__SCALE_Y:
				setScaleY((String)newValue);
				return;
			case FxgPackage.GROUP__X:
				setX((String)newValue);
				return;
			case FxgPackage.GROUP__Y:
				setY((String)newValue);
				return;
			case FxgPackage.GROUP__BLEND_MODE:
				setBlendMode((BlendMode)newValue);
				return;
			case FxgPackage.GROUP__ALPHA:
				setAlpha((Double)newValue);
				return;
			case FxgPackage.GROUP__ID:
				setId((String)newValue);
				return;
			case FxgPackage.GROUP__TRANSFORM_X:
				setTransformX((String)newValue);
				return;
			case FxgPackage.GROUP__TRANSFORM_Y:
				setTransformY((String)newValue);
				return;
			case FxgPackage.GROUP__MASK_TYPE:
				setMaskType((String)newValue);
				return;
			case FxgPackage.GROUP__VISIBLE:
				setVisible((String)newValue);
				return;
			case FxgPackage.GROUP__SCALE_GRID_LEFT:
				setScaleGridLeft((String)newValue);
				return;
			case FxgPackage.GROUP__SCALE_GRID_RIGHT:
				setScaleGridRight((String)newValue);
				return;
			case FxgPackage.GROUP__SCALE_GRID_TOP:
				setScaleGridTop((String)newValue);
				return;
			case FxgPackage.GROUP__SCALE_GRID_BOTTOM:
				setScaleGridBottom((String)newValue);
				return;
			case FxgPackage.GROUP__TRANSFORM:
				setTransform((Transform)newValue);
				return;
			case FxgPackage.GROUP__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends Filter>)newValue);
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
			case FxgPackage.GROUP__ROTATION:
				setRotation(ROTATION_EDEFAULT);
				return;
			case FxgPackage.GROUP__SCALE_X:
				setScaleX(SCALE_X_EDEFAULT);
				return;
			case FxgPackage.GROUP__SCALE_Y:
				setScaleY(SCALE_Y_EDEFAULT);
				return;
			case FxgPackage.GROUP__X:
				setX(X_EDEFAULT);
				return;
			case FxgPackage.GROUP__Y:
				setY(Y_EDEFAULT);
				return;
			case FxgPackage.GROUP__BLEND_MODE:
				setBlendMode(BLEND_MODE_EDEFAULT);
				return;
			case FxgPackage.GROUP__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case FxgPackage.GROUP__ID:
				setId(ID_EDEFAULT);
				return;
			case FxgPackage.GROUP__TRANSFORM_X:
				setTransformX(TRANSFORM_X_EDEFAULT);
				return;
			case FxgPackage.GROUP__TRANSFORM_Y:
				setTransformY(TRANSFORM_Y_EDEFAULT);
				return;
			case FxgPackage.GROUP__MASK_TYPE:
				setMaskType(MASK_TYPE_EDEFAULT);
				return;
			case FxgPackage.GROUP__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case FxgPackage.GROUP__SCALE_GRID_LEFT:
				setScaleGridLeft(SCALE_GRID_LEFT_EDEFAULT);
				return;
			case FxgPackage.GROUP__SCALE_GRID_RIGHT:
				setScaleGridRight(SCALE_GRID_RIGHT_EDEFAULT);
				return;
			case FxgPackage.GROUP__SCALE_GRID_TOP:
				setScaleGridTop(SCALE_GRID_TOP_EDEFAULT);
				return;
			case FxgPackage.GROUP__SCALE_GRID_BOTTOM:
				setScaleGridBottom(SCALE_GRID_BOTTOM_EDEFAULT);
				return;
			case FxgPackage.GROUP__TRANSFORM:
				setTransform((Transform)null);
				return;
			case FxgPackage.GROUP__FILTERS:
				getFilters().clear();
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
			case FxgPackage.GROUP__ROTATION:
				return ROTATION_EDEFAULT == null ? rotation != null : !ROTATION_EDEFAULT.equals(rotation);
			case FxgPackage.GROUP__SCALE_X:
				return SCALE_X_EDEFAULT == null ? scaleX != null : !SCALE_X_EDEFAULT.equals(scaleX);
			case FxgPackage.GROUP__SCALE_Y:
				return SCALE_Y_EDEFAULT == null ? scaleY != null : !SCALE_Y_EDEFAULT.equals(scaleY);
			case FxgPackage.GROUP__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case FxgPackage.GROUP__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case FxgPackage.GROUP__BLEND_MODE:
				return blendMode != BLEND_MODE_EDEFAULT;
			case FxgPackage.GROUP__ALPHA:
				return ALPHA_EDEFAULT == null ? alpha != null : !ALPHA_EDEFAULT.equals(alpha);
			case FxgPackage.GROUP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FxgPackage.GROUP__TRANSFORM_X:
				return TRANSFORM_X_EDEFAULT == null ? transformX != null : !TRANSFORM_X_EDEFAULT.equals(transformX);
			case FxgPackage.GROUP__TRANSFORM_Y:
				return TRANSFORM_Y_EDEFAULT == null ? transformY != null : !TRANSFORM_Y_EDEFAULT.equals(transformY);
			case FxgPackage.GROUP__MASK_TYPE:
				return MASK_TYPE_EDEFAULT == null ? maskType != null : !MASK_TYPE_EDEFAULT.equals(maskType);
			case FxgPackage.GROUP__VISIBLE:
				return VISIBLE_EDEFAULT == null ? visible != null : !VISIBLE_EDEFAULT.equals(visible);
			case FxgPackage.GROUP__SCALE_GRID_LEFT:
				return SCALE_GRID_LEFT_EDEFAULT == null ? scaleGridLeft != null : !SCALE_GRID_LEFT_EDEFAULT.equals(scaleGridLeft);
			case FxgPackage.GROUP__SCALE_GRID_RIGHT:
				return SCALE_GRID_RIGHT_EDEFAULT == null ? scaleGridRight != null : !SCALE_GRID_RIGHT_EDEFAULT.equals(scaleGridRight);
			case FxgPackage.GROUP__SCALE_GRID_TOP:
				return SCALE_GRID_TOP_EDEFAULT == null ? scaleGridTop != null : !SCALE_GRID_TOP_EDEFAULT.equals(scaleGridTop);
			case FxgPackage.GROUP__SCALE_GRID_BOTTOM:
				return SCALE_GRID_BOTTOM_EDEFAULT == null ? scaleGridBottom != null : !SCALE_GRID_BOTTOM_EDEFAULT.equals(scaleGridBottom);
			case FxgPackage.GROUP__TRANSFORM:
				return transform != null;
			case FxgPackage.GROUP__FILTERS:
				return filters != null && !filters.isEmpty();
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
		result.append(" (rotation: ");
		result.append(rotation);
		result.append(", scaleX: ");
		result.append(scaleX);
		result.append(", scaleY: ");
		result.append(scaleY);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", blendMode: ");
		result.append(blendMode);
		result.append(", alpha: ");
		result.append(alpha);
		result.append(", id: ");
		result.append(id);
		result.append(", transformX: ");
		result.append(transformX);
		result.append(", transformY: ");
		result.append(transformY);
		result.append(", maskType: ");
		result.append(maskType);
		result.append(", visible: ");
		result.append(visible);
		result.append(", scaleGridLeft: ");
		result.append(scaleGridLeft);
		result.append(", scaleGridRight: ");
		result.append(scaleGridRight);
		result.append(", scaleGridTop: ");
		result.append(scaleGridTop);
		result.append(", scaleGridBottom: ");
		result.append(scaleGridBottom);
		result.append(')');
		return result.toString();
	}

} //GroupImpl
