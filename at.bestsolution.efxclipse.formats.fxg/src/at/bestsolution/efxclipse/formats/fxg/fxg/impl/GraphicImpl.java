/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg.impl;

import at.bestsolution.efxclipse.formats.fxg.fxg.FXGElement;
import at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage;
import at.bestsolution.efxclipse.formats.fxg.fxg.Graphic;
import at.bestsolution.efxclipse.formats.fxg.fxg.Group;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GraphicImpl#getScaleGridLeft <em>Scale Grid Left</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GraphicImpl#getScaleGridRight <em>Scale Grid Right</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GraphicImpl#getScaleGridTop <em>Scale Grid Top</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GraphicImpl#getScaleGridBottom <em>Scale Grid Bottom</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GraphicImpl#getViewWidth <em>View Width</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GraphicImpl#getViewHeight <em>View Height</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GraphicImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GraphicImpl#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GraphicImpl extends ContainerElementImpl<FXGElement> implements Graphic {
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
	 * The default value of the '{@link #getViewWidth() <em>View Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int VIEW_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getViewWidth() <em>View Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewWidth()
	 * @generated
	 * @ordered
	 */
	protected int viewWidth = VIEW_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewHeight() <em>View Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int VIEW_HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getViewHeight() <em>View Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewHeight()
	 * @generated
	 * @ordered
	 */
	protected int viewHeight = VIEW_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

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
	protected GraphicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FxgPackage.Literals.GRAPHIC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GRAPHIC__SCALE_GRID_LEFT, oldScaleGridLeft, scaleGridLeft));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GRAPHIC__SCALE_GRID_RIGHT, oldScaleGridRight, scaleGridRight));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GRAPHIC__SCALE_GRID_TOP, oldScaleGridTop, scaleGridTop));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GRAPHIC__SCALE_GRID_BOTTOM, oldScaleGridBottom, scaleGridBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getViewWidth() {
		return viewWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewWidth(int newViewWidth) {
		int oldViewWidth = viewWidth;
		viewWidth = newViewWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GRAPHIC__VIEW_WIDTH, oldViewWidth, viewWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getViewHeight() {
		return viewHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewHeight(int newViewHeight) {
		int oldViewHeight = viewHeight;
		viewHeight = newViewHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GRAPHIC__VIEW_HEIGHT, oldViewHeight, viewHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GRAPHIC__VERSION, oldVersion, version));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FxgPackage.GRAPHIC__MASK, oldMask, newMask);
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
				msgs = ((InternalEObject)mask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FxgPackage.GRAPHIC__MASK, null, msgs);
			if (newMask != null)
				msgs = ((InternalEObject)newMask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FxgPackage.GRAPHIC__MASK, null, msgs);
			msgs = basicSetMask(newMask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.GRAPHIC__MASK, newMask, newMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FxgPackage.GRAPHIC__MASK:
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
			case FxgPackage.GRAPHIC__SCALE_GRID_LEFT:
				return getScaleGridLeft();
			case FxgPackage.GRAPHIC__SCALE_GRID_RIGHT:
				return getScaleGridRight();
			case FxgPackage.GRAPHIC__SCALE_GRID_TOP:
				return getScaleGridTop();
			case FxgPackage.GRAPHIC__SCALE_GRID_BOTTOM:
				return getScaleGridBottom();
			case FxgPackage.GRAPHIC__VIEW_WIDTH:
				return getViewWidth();
			case FxgPackage.GRAPHIC__VIEW_HEIGHT:
				return getViewHeight();
			case FxgPackage.GRAPHIC__VERSION:
				return getVersion();
			case FxgPackage.GRAPHIC__MASK:
				return getMask();
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
			case FxgPackage.GRAPHIC__SCALE_GRID_LEFT:
				setScaleGridLeft((String)newValue);
				return;
			case FxgPackage.GRAPHIC__SCALE_GRID_RIGHT:
				setScaleGridRight((String)newValue);
				return;
			case FxgPackage.GRAPHIC__SCALE_GRID_TOP:
				setScaleGridTop((String)newValue);
				return;
			case FxgPackage.GRAPHIC__SCALE_GRID_BOTTOM:
				setScaleGridBottom((String)newValue);
				return;
			case FxgPackage.GRAPHIC__VIEW_WIDTH:
				setViewWidth((Integer)newValue);
				return;
			case FxgPackage.GRAPHIC__VIEW_HEIGHT:
				setViewHeight((Integer)newValue);
				return;
			case FxgPackage.GRAPHIC__VERSION:
				setVersion((String)newValue);
				return;
			case FxgPackage.GRAPHIC__MASK:
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
			case FxgPackage.GRAPHIC__SCALE_GRID_LEFT:
				setScaleGridLeft(SCALE_GRID_LEFT_EDEFAULT);
				return;
			case FxgPackage.GRAPHIC__SCALE_GRID_RIGHT:
				setScaleGridRight(SCALE_GRID_RIGHT_EDEFAULT);
				return;
			case FxgPackage.GRAPHIC__SCALE_GRID_TOP:
				setScaleGridTop(SCALE_GRID_TOP_EDEFAULT);
				return;
			case FxgPackage.GRAPHIC__SCALE_GRID_BOTTOM:
				setScaleGridBottom(SCALE_GRID_BOTTOM_EDEFAULT);
				return;
			case FxgPackage.GRAPHIC__VIEW_WIDTH:
				setViewWidth(VIEW_WIDTH_EDEFAULT);
				return;
			case FxgPackage.GRAPHIC__VIEW_HEIGHT:
				setViewHeight(VIEW_HEIGHT_EDEFAULT);
				return;
			case FxgPackage.GRAPHIC__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case FxgPackage.GRAPHIC__MASK:
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
			case FxgPackage.GRAPHIC__SCALE_GRID_LEFT:
				return SCALE_GRID_LEFT_EDEFAULT == null ? scaleGridLeft != null : !SCALE_GRID_LEFT_EDEFAULT.equals(scaleGridLeft);
			case FxgPackage.GRAPHIC__SCALE_GRID_RIGHT:
				return SCALE_GRID_RIGHT_EDEFAULT == null ? scaleGridRight != null : !SCALE_GRID_RIGHT_EDEFAULT.equals(scaleGridRight);
			case FxgPackage.GRAPHIC__SCALE_GRID_TOP:
				return SCALE_GRID_TOP_EDEFAULT == null ? scaleGridTop != null : !SCALE_GRID_TOP_EDEFAULT.equals(scaleGridTop);
			case FxgPackage.GRAPHIC__SCALE_GRID_BOTTOM:
				return SCALE_GRID_BOTTOM_EDEFAULT == null ? scaleGridBottom != null : !SCALE_GRID_BOTTOM_EDEFAULT.equals(scaleGridBottom);
			case FxgPackage.GRAPHIC__VIEW_WIDTH:
				return viewWidth != VIEW_WIDTH_EDEFAULT;
			case FxgPackage.GRAPHIC__VIEW_HEIGHT:
				return viewHeight != VIEW_HEIGHT_EDEFAULT;
			case FxgPackage.GRAPHIC__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case FxgPackage.GRAPHIC__MASK:
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
		result.append(" (scaleGridLeft: ");
		result.append(scaleGridLeft);
		result.append(", scaleGridRight: ");
		result.append(scaleGridRight);
		result.append(", scaleGridTop: ");
		result.append(scaleGridTop);
		result.append(", scaleGridBottom: ");
		result.append(scaleGridBottom);
		result.append(", viewWidth: ");
		result.append(viewWidth);
		result.append(", viewHeight: ");
		result.append(viewHeight);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //GraphicImpl
