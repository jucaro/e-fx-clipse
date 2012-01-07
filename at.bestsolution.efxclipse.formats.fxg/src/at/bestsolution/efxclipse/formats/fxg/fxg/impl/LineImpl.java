/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg.impl;

import at.bestsolution.efxclipse.formats.fxg.fxg.BlendMode;
import at.bestsolution.efxclipse.formats.fxg.fxg.Fill;
import at.bestsolution.efxclipse.formats.fxg.fxg.Filter;
import at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage;
import at.bestsolution.efxclipse.formats.fxg.fxg.Group;
import at.bestsolution.efxclipse.formats.fxg.fxg.Line;
import at.bestsolution.efxclipse.formats.fxg.fxg.MaskType;
import at.bestsolution.efxclipse.formats.fxg.fxg.Stroke;
import at.bestsolution.efxclipse.formats.fxg.fxg.Transform;

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
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl#getXFrom <em>XFrom</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl#getYFrom <em>YFrom</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl#getXTo <em>XTo</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl#getYTo <em>YTo</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl#getX <em>X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl#getY <em>Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl#getScaleX <em>Scale X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl#getScaleY <em>Scale Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl#getBlendMode <em>Blend Mode</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl#getMaskType <em>Mask Type</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl#getTransform <em>Transform</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl#getFilters <em>Filters</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl#getStroke <em>Stroke</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineImpl extends EObjectImpl implements Line {
	/**
	 * The default value of the '{@link #getXFrom() <em>XFrom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Double XFROM_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getXFrom() <em>XFrom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXFrom()
	 * @generated
	 * @ordered
	 */
	protected Double xFrom = XFROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getYFrom() <em>YFrom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Double YFROM_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getYFrom() <em>YFrom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYFrom()
	 * @generated
	 * @ordered
	 */
	protected Double yFrom = YFROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getXTo() <em>XTo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXTo()
	 * @generated
	 * @ordered
	 */
	protected static final Double XTO_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getXTo() <em>XTo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXTo()
	 * @generated
	 * @ordered
	 */
	protected Double xTo = XTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getYTo() <em>YTo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYTo()
	 * @generated
	 * @ordered
	 */
	protected static final Double YTO_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getYTo() <em>YTo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYTo()
	 * @generated
	 * @ordered
	 */
	protected Double yTo = YTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final Double X_EDEFAULT = new Double(0.0);

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
	protected static final Double Y_EDEFAULT = new Double(0.0);

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
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final Double ROTATION_EDEFAULT = new Double(0.0);

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
	 * The default value of the '{@link #getScaleX() <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleX()
	 * @generated
	 * @ordered
	 */
	protected static final Double SCALE_X_EDEFAULT = new Double(1.0);

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
	protected static final Double SCALE_Y_EDEFAULT = new Double(1.0);

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
	 * The default value of the '{@link #getMaskType() <em>Mask Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskType()
	 * @generated
	 * @ordered
	 */
	protected static final MaskType MASK_TYPE_EDEFAULT = MaskType.CLIP;

	/**
	 * The cached value of the '{@link #getMaskType() <em>Mask Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskType()
	 * @generated
	 * @ordered
	 */
	protected MaskType maskType = MASK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VISIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected Boolean visible = VISIBLE_EDEFAULT;

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
	 * The cached value of the '{@link #getFill() <em>Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected Fill fill;

	/**
	 * The cached value of the '{@link #getStroke() <em>Stroke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected Stroke stroke;

	/**
	 * The cached value of the '{@link #getMask() <em>Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected Group mask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FxgPackage.Literals.LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getXFrom() {
		return xFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXFrom(Double newXFrom) {
		Double oldXFrom = xFrom;
		xFrom = newXFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__XFROM, oldXFrom, xFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getYFrom() {
		return yFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYFrom(Double newYFrom) {
		Double oldYFrom = yFrom;
		yFrom = newYFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__YFROM, oldYFrom, yFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getXTo() {
		return xTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXTo(Double newXTo) {
		Double oldXTo = xTo;
		xTo = newXTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__XTO, oldXTo, xTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getYTo() {
		return yTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYTo(Double newYTo) {
		Double oldYTo = yTo;
		yTo = newYTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__YTO, oldYTo, yTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__Y, oldY, y));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__ROTATION, oldRotation, rotation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__SCALE_X, oldScaleX, scaleX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__SCALE_Y, oldScaleY, scaleY));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__BLEND_MODE, oldBlendMode, blendMode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__ALPHA, oldAlpha, alpha));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaskType getMaskType() {
		return maskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaskType(MaskType newMaskType) {
		MaskType oldMaskType = maskType;
		maskType = newMaskType == null ? MASK_TYPE_EDEFAULT : newMaskType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__MASK_TYPE, oldMaskType, maskType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(Boolean newVisible) {
		Boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__VISIBLE, oldVisible, visible));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__TRANSFORM, oldTransform, newTransform);
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
				msgs = ((InternalEObject)transform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FxgPackage.LINE__TRANSFORM, null, msgs);
			if (newTransform != null)
				msgs = ((InternalEObject)newTransform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FxgPackage.LINE__TRANSFORM, null, msgs);
			msgs = basicSetTransform(newTransform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__TRANSFORM, newTransform, newTransform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Filter> getFilters() {
		if (filters == null) {
			filters = new EObjectContainmentEList<Filter>(Filter.class, this, FxgPackage.LINE__FILTERS);
		}
		return filters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fill getFill() {
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFill(Fill newFill, NotificationChain msgs) {
		Fill oldFill = fill;
		fill = newFill;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__FILL, oldFill, newFill);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill(Fill newFill) {
		if (newFill != fill) {
			NotificationChain msgs = null;
			if (fill != null)
				msgs = ((InternalEObject)fill).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FxgPackage.LINE__FILL, null, msgs);
			if (newFill != null)
				msgs = ((InternalEObject)newFill).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FxgPackage.LINE__FILL, null, msgs);
			msgs = basicSetFill(newFill, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__FILL, newFill, newFill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stroke getStroke() {
		return stroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStroke(Stroke newStroke, NotificationChain msgs) {
		Stroke oldStroke = stroke;
		stroke = newStroke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__STROKE, oldStroke, newStroke);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke(Stroke newStroke) {
		if (newStroke != stroke) {
			NotificationChain msgs = null;
			if (stroke != null)
				msgs = ((InternalEObject)stroke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FxgPackage.LINE__STROKE, null, msgs);
			if (newStroke != null)
				msgs = ((InternalEObject)newStroke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FxgPackage.LINE__STROKE, null, msgs);
			msgs = basicSetStroke(newStroke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__STROKE, newStroke, newStroke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getMask() {
		return mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMask(Group newMask, NotificationChain msgs) {
		Group oldMask = mask;
		mask = newMask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__MASK, oldMask, newMask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMask(Group newMask) {
		if (newMask != mask) {
			NotificationChain msgs = null;
			if (mask != null)
				msgs = ((InternalEObject)mask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FxgPackage.LINE__MASK, null, msgs);
			if (newMask != null)
				msgs = ((InternalEObject)newMask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FxgPackage.LINE__MASK, null, msgs);
			msgs = basicSetMask(newMask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.LINE__MASK, newMask, newMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FxgPackage.LINE__TRANSFORM:
				return basicSetTransform(null, msgs);
			case FxgPackage.LINE__FILTERS:
				return ((InternalEList<?>)getFilters()).basicRemove(otherEnd, msgs);
			case FxgPackage.LINE__FILL:
				return basicSetFill(null, msgs);
			case FxgPackage.LINE__STROKE:
				return basicSetStroke(null, msgs);
			case FxgPackage.LINE__MASK:
				return basicSetMask(null, msgs);
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
			case FxgPackage.LINE__XFROM:
				return getXFrom();
			case FxgPackage.LINE__YFROM:
				return getYFrom();
			case FxgPackage.LINE__XTO:
				return getXTo();
			case FxgPackage.LINE__YTO:
				return getYTo();
			case FxgPackage.LINE__X:
				return getX();
			case FxgPackage.LINE__Y:
				return getY();
			case FxgPackage.LINE__ROTATION:
				return getRotation();
			case FxgPackage.LINE__SCALE_X:
				return getScaleX();
			case FxgPackage.LINE__SCALE_Y:
				return getScaleY();
			case FxgPackage.LINE__BLEND_MODE:
				return getBlendMode();
			case FxgPackage.LINE__ALPHA:
				return getAlpha();
			case FxgPackage.LINE__ID:
				return getId();
			case FxgPackage.LINE__MASK_TYPE:
				return getMaskType();
			case FxgPackage.LINE__VISIBLE:
				return getVisible();
			case FxgPackage.LINE__TRANSFORM:
				return getTransform();
			case FxgPackage.LINE__FILTERS:
				return getFilters();
			case FxgPackage.LINE__FILL:
				return getFill();
			case FxgPackage.LINE__STROKE:
				return getStroke();
			case FxgPackage.LINE__MASK:
				return getMask();
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
			case FxgPackage.LINE__XFROM:
				setXFrom((Double)newValue);
				return;
			case FxgPackage.LINE__YFROM:
				setYFrom((Double)newValue);
				return;
			case FxgPackage.LINE__XTO:
				setXTo((Double)newValue);
				return;
			case FxgPackage.LINE__YTO:
				setYTo((Double)newValue);
				return;
			case FxgPackage.LINE__X:
				setX((Double)newValue);
				return;
			case FxgPackage.LINE__Y:
				setY((Double)newValue);
				return;
			case FxgPackage.LINE__ROTATION:
				setRotation((Double)newValue);
				return;
			case FxgPackage.LINE__SCALE_X:
				setScaleX((Double)newValue);
				return;
			case FxgPackage.LINE__SCALE_Y:
				setScaleY((Double)newValue);
				return;
			case FxgPackage.LINE__BLEND_MODE:
				setBlendMode((BlendMode)newValue);
				return;
			case FxgPackage.LINE__ALPHA:
				setAlpha((Double)newValue);
				return;
			case FxgPackage.LINE__ID:
				setId((String)newValue);
				return;
			case FxgPackage.LINE__MASK_TYPE:
				setMaskType((MaskType)newValue);
				return;
			case FxgPackage.LINE__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case FxgPackage.LINE__TRANSFORM:
				setTransform((Transform)newValue);
				return;
			case FxgPackage.LINE__FILTERS:
				getFilters().clear();
				getFilters().addAll((Collection<? extends Filter>)newValue);
				return;
			case FxgPackage.LINE__FILL:
				setFill((Fill)newValue);
				return;
			case FxgPackage.LINE__STROKE:
				setStroke((Stroke)newValue);
				return;
			case FxgPackage.LINE__MASK:
				setMask((Group)newValue);
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
			case FxgPackage.LINE__XFROM:
				setXFrom(XFROM_EDEFAULT);
				return;
			case FxgPackage.LINE__YFROM:
				setYFrom(YFROM_EDEFAULT);
				return;
			case FxgPackage.LINE__XTO:
				setXTo(XTO_EDEFAULT);
				return;
			case FxgPackage.LINE__YTO:
				setYTo(YTO_EDEFAULT);
				return;
			case FxgPackage.LINE__X:
				setX(X_EDEFAULT);
				return;
			case FxgPackage.LINE__Y:
				setY(Y_EDEFAULT);
				return;
			case FxgPackage.LINE__ROTATION:
				setRotation(ROTATION_EDEFAULT);
				return;
			case FxgPackage.LINE__SCALE_X:
				setScaleX(SCALE_X_EDEFAULT);
				return;
			case FxgPackage.LINE__SCALE_Y:
				setScaleY(SCALE_Y_EDEFAULT);
				return;
			case FxgPackage.LINE__BLEND_MODE:
				setBlendMode(BLEND_MODE_EDEFAULT);
				return;
			case FxgPackage.LINE__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case FxgPackage.LINE__ID:
				setId(ID_EDEFAULT);
				return;
			case FxgPackage.LINE__MASK_TYPE:
				setMaskType(MASK_TYPE_EDEFAULT);
				return;
			case FxgPackage.LINE__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case FxgPackage.LINE__TRANSFORM:
				setTransform((Transform)null);
				return;
			case FxgPackage.LINE__FILTERS:
				getFilters().clear();
				return;
			case FxgPackage.LINE__FILL:
				setFill((Fill)null);
				return;
			case FxgPackage.LINE__STROKE:
				setStroke((Stroke)null);
				return;
			case FxgPackage.LINE__MASK:
				setMask((Group)null);
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
			case FxgPackage.LINE__XFROM:
				return XFROM_EDEFAULT == null ? xFrom != null : !XFROM_EDEFAULT.equals(xFrom);
			case FxgPackage.LINE__YFROM:
				return YFROM_EDEFAULT == null ? yFrom != null : !YFROM_EDEFAULT.equals(yFrom);
			case FxgPackage.LINE__XTO:
				return XTO_EDEFAULT == null ? xTo != null : !XTO_EDEFAULT.equals(xTo);
			case FxgPackage.LINE__YTO:
				return YTO_EDEFAULT == null ? yTo != null : !YTO_EDEFAULT.equals(yTo);
			case FxgPackage.LINE__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case FxgPackage.LINE__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case FxgPackage.LINE__ROTATION:
				return ROTATION_EDEFAULT == null ? rotation != null : !ROTATION_EDEFAULT.equals(rotation);
			case FxgPackage.LINE__SCALE_X:
				return SCALE_X_EDEFAULT == null ? scaleX != null : !SCALE_X_EDEFAULT.equals(scaleX);
			case FxgPackage.LINE__SCALE_Y:
				return SCALE_Y_EDEFAULT == null ? scaleY != null : !SCALE_Y_EDEFAULT.equals(scaleY);
			case FxgPackage.LINE__BLEND_MODE:
				return blendMode != BLEND_MODE_EDEFAULT;
			case FxgPackage.LINE__ALPHA:
				return ALPHA_EDEFAULT == null ? alpha != null : !ALPHA_EDEFAULT.equals(alpha);
			case FxgPackage.LINE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FxgPackage.LINE__MASK_TYPE:
				return maskType != MASK_TYPE_EDEFAULT;
			case FxgPackage.LINE__VISIBLE:
				return VISIBLE_EDEFAULT == null ? visible != null : !VISIBLE_EDEFAULT.equals(visible);
			case FxgPackage.LINE__TRANSFORM:
				return transform != null;
			case FxgPackage.LINE__FILTERS:
				return filters != null && !filters.isEmpty();
			case FxgPackage.LINE__FILL:
				return fill != null;
			case FxgPackage.LINE__STROKE:
				return stroke != null;
			case FxgPackage.LINE__MASK:
				return mask != null;
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
		result.append(" (xFrom: ");
		result.append(xFrom);
		result.append(", yFrom: ");
		result.append(yFrom);
		result.append(", xTo: ");
		result.append(xTo);
		result.append(", yTo: ");
		result.append(yTo);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", rotation: ");
		result.append(rotation);
		result.append(", scaleX: ");
		result.append(scaleX);
		result.append(", scaleY: ");
		result.append(scaleY);
		result.append(", blendMode: ");
		result.append(blendMode);
		result.append(", alpha: ");
		result.append(alpha);
		result.append(", id: ");
		result.append(id);
		result.append(", maskType: ");
		result.append(maskType);
		result.append(", visible: ");
		result.append(visible);
		result.append(')');
		return result.toString();
	}

} //LineImpl
