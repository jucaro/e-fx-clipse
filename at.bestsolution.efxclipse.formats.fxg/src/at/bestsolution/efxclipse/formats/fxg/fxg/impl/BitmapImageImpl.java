/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg.impl;

import at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage;
import at.bestsolution.efxclipse.formats.fxg.fxg.BlendMode;
import at.bestsolution.efxclipse.formats.fxg.fxg.FillMode;
import at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bitmap Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapImageImpl#getX <em>X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapImageImpl#getY <em>Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapImageImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapImageImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapImageImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapImageImpl#getScaleX <em>Scale X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapImageImpl#getScaleY <em>Scale Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapImageImpl#getFillMode <em>Fill Mode</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapImageImpl#getSource <em>Source</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapImageImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapImageImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapImageImpl#getBlendMode <em>Blend Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BitmapImageImpl extends EObjectImpl implements BitmapImage {
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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Double WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Double HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Double height = HEIGHT_EDEFAULT;

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
	 * The default value of the '{@link #getFillMode() <em>Fill Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillMode()
	 * @generated
	 * @ordered
	 */
	protected static final FillMode FILL_MODE_EDEFAULT = FillMode.SCALE;

	/**
	 * The cached value of the '{@link #getFillMode() <em>Fill Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillMode()
	 * @generated
	 * @ordered
	 */
	protected FillMode fillMode = FILL_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitmapImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FxgPackage.Literals.BITMAP_IMAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.BITMAP_IMAGE__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.BITMAP_IMAGE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Double newWidth) {
		Double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.BITMAP_IMAGE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Double newHeight) {
		Double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.BITMAP_IMAGE__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.BITMAP_IMAGE__ROTATION, oldRotation, rotation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.BITMAP_IMAGE__SCALE_X, oldScaleX, scaleX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.BITMAP_IMAGE__SCALE_Y, oldScaleY, scaleY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillMode getFillMode() {
		return fillMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillMode(FillMode newFillMode) {
		FillMode oldFillMode = fillMode;
		fillMode = newFillMode == null ? FILL_MODE_EDEFAULT : newFillMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.BITMAP_IMAGE__FILL_MODE, oldFillMode, fillMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.BITMAP_IMAGE__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.BITMAP_IMAGE__VISIBLE, oldVisible, visible));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.BITMAP_IMAGE__ALPHA, oldAlpha, alpha));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.BITMAP_IMAGE__BLEND_MODE, oldBlendMode, blendMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FxgPackage.BITMAP_IMAGE__X:
				return getX();
			case FxgPackage.BITMAP_IMAGE__Y:
				return getY();
			case FxgPackage.BITMAP_IMAGE__WIDTH:
				return getWidth();
			case FxgPackage.BITMAP_IMAGE__HEIGHT:
				return getHeight();
			case FxgPackage.BITMAP_IMAGE__ROTATION:
				return getRotation();
			case FxgPackage.BITMAP_IMAGE__SCALE_X:
				return getScaleX();
			case FxgPackage.BITMAP_IMAGE__SCALE_Y:
				return getScaleY();
			case FxgPackage.BITMAP_IMAGE__FILL_MODE:
				return getFillMode();
			case FxgPackage.BITMAP_IMAGE__SOURCE:
				return getSource();
			case FxgPackage.BITMAP_IMAGE__VISIBLE:
				return getVisible();
			case FxgPackage.BITMAP_IMAGE__ALPHA:
				return getAlpha();
			case FxgPackage.BITMAP_IMAGE__BLEND_MODE:
				return getBlendMode();
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
			case FxgPackage.BITMAP_IMAGE__X:
				setX((Double)newValue);
				return;
			case FxgPackage.BITMAP_IMAGE__Y:
				setY((Double)newValue);
				return;
			case FxgPackage.BITMAP_IMAGE__WIDTH:
				setWidth((Double)newValue);
				return;
			case FxgPackage.BITMAP_IMAGE__HEIGHT:
				setHeight((Double)newValue);
				return;
			case FxgPackage.BITMAP_IMAGE__ROTATION:
				setRotation((Double)newValue);
				return;
			case FxgPackage.BITMAP_IMAGE__SCALE_X:
				setScaleX((Double)newValue);
				return;
			case FxgPackage.BITMAP_IMAGE__SCALE_Y:
				setScaleY((Double)newValue);
				return;
			case FxgPackage.BITMAP_IMAGE__FILL_MODE:
				setFillMode((FillMode)newValue);
				return;
			case FxgPackage.BITMAP_IMAGE__SOURCE:
				setSource((String)newValue);
				return;
			case FxgPackage.BITMAP_IMAGE__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case FxgPackage.BITMAP_IMAGE__ALPHA:
				setAlpha((Double)newValue);
				return;
			case FxgPackage.BITMAP_IMAGE__BLEND_MODE:
				setBlendMode((BlendMode)newValue);
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
			case FxgPackage.BITMAP_IMAGE__X:
				setX(X_EDEFAULT);
				return;
			case FxgPackage.BITMAP_IMAGE__Y:
				setY(Y_EDEFAULT);
				return;
			case FxgPackage.BITMAP_IMAGE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case FxgPackage.BITMAP_IMAGE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case FxgPackage.BITMAP_IMAGE__ROTATION:
				setRotation(ROTATION_EDEFAULT);
				return;
			case FxgPackage.BITMAP_IMAGE__SCALE_X:
				setScaleX(SCALE_X_EDEFAULT);
				return;
			case FxgPackage.BITMAP_IMAGE__SCALE_Y:
				setScaleY(SCALE_Y_EDEFAULT);
				return;
			case FxgPackage.BITMAP_IMAGE__FILL_MODE:
				setFillMode(FILL_MODE_EDEFAULT);
				return;
			case FxgPackage.BITMAP_IMAGE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case FxgPackage.BITMAP_IMAGE__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case FxgPackage.BITMAP_IMAGE__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case FxgPackage.BITMAP_IMAGE__BLEND_MODE:
				setBlendMode(BLEND_MODE_EDEFAULT);
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
			case FxgPackage.BITMAP_IMAGE__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case FxgPackage.BITMAP_IMAGE__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case FxgPackage.BITMAP_IMAGE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case FxgPackage.BITMAP_IMAGE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case FxgPackage.BITMAP_IMAGE__ROTATION:
				return ROTATION_EDEFAULT == null ? rotation != null : !ROTATION_EDEFAULT.equals(rotation);
			case FxgPackage.BITMAP_IMAGE__SCALE_X:
				return SCALE_X_EDEFAULT == null ? scaleX != null : !SCALE_X_EDEFAULT.equals(scaleX);
			case FxgPackage.BITMAP_IMAGE__SCALE_Y:
				return SCALE_Y_EDEFAULT == null ? scaleY != null : !SCALE_Y_EDEFAULT.equals(scaleY);
			case FxgPackage.BITMAP_IMAGE__FILL_MODE:
				return fillMode != FILL_MODE_EDEFAULT;
			case FxgPackage.BITMAP_IMAGE__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case FxgPackage.BITMAP_IMAGE__VISIBLE:
				return VISIBLE_EDEFAULT == null ? visible != null : !VISIBLE_EDEFAULT.equals(visible);
			case FxgPackage.BITMAP_IMAGE__ALPHA:
				return ALPHA_EDEFAULT == null ? alpha != null : !ALPHA_EDEFAULT.equals(alpha);
			case FxgPackage.BITMAP_IMAGE__BLEND_MODE:
				return blendMode != BLEND_MODE_EDEFAULT;
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", rotation: ");
		result.append(rotation);
		result.append(", scaleX: ");
		result.append(scaleX);
		result.append(", scaleY: ");
		result.append(scaleY);
		result.append(", fillMode: ");
		result.append(fillMode);
		result.append(", source: ");
		result.append(source);
		result.append(", visible: ");
		result.append(visible);
		result.append(", alpha: ");
		result.append(alpha);
		result.append(", blendMode: ");
		result.append(blendMode);
		result.append(')');
		return result.toString();
	}

} //BitmapImageImpl
