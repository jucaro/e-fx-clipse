/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoArea;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Photo Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoAreaImpl#getX <em>X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoAreaImpl#getY <em>Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoAreaImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoAreaImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoAreaImpl#getColor <em>Color</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoAreaImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhotoAreaImpl extends BaseObjectImpl implements PhotoArea {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final double X_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final double Y_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhotoAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotoeditPackage.Literals.PHOTO_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX() {
		return (Double)eDynamicGet(PhotoeditPackage.PHOTO_AREA__X, PhotoeditPackage.Literals.PHOTO_AREA__X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(double newX) {
		eDynamicSet(PhotoeditPackage.PHOTO_AREA__X, PhotoeditPackage.Literals.PHOTO_AREA__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY() {
		return (Double)eDynamicGet(PhotoeditPackage.PHOTO_AREA__Y, PhotoeditPackage.Literals.PHOTO_AREA__Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(double newY) {
		eDynamicSet(PhotoeditPackage.PHOTO_AREA__Y, PhotoeditPackage.Literals.PHOTO_AREA__Y, newY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return (Double)eDynamicGet(PhotoeditPackage.PHOTO_AREA__WIDTH, PhotoeditPackage.Literals.PHOTO_AREA__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		eDynamicSet(PhotoeditPackage.PHOTO_AREA__WIDTH, PhotoeditPackage.Literals.PHOTO_AREA__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return (Double)eDynamicGet(PhotoeditPackage.PHOTO_AREA__HEIGHT, PhotoeditPackage.Literals.PHOTO_AREA__HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		eDynamicSet(PhotoeditPackage.PHOTO_AREA__HEIGHT, PhotoeditPackage.Literals.PHOTO_AREA__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return (String)eDynamicGet(PhotoeditPackage.PHOTO_AREA__COLOR, PhotoeditPackage.Literals.PHOTO_AREA__COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		eDynamicSet(PhotoeditPackage.PHOTO_AREA__COLOR, PhotoeditPackage.Literals.PHOTO_AREA__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(PhotoeditPackage.PHOTO_AREA__DESCRIPTION, PhotoeditPackage.Literals.PHOTO_AREA__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(PhotoeditPackage.PHOTO_AREA__DESCRIPTION, PhotoeditPackage.Literals.PHOTO_AREA__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean contains(double X, double Y) {
		double w = this.getWidth();
		double h = this.getHeight();
		
		if( w < 0 || h < 0 ) {
			// At least one of the dimensions is negative...
		    return false;
		}
		// Note: if either dimension is zero, tests below must return false...
		double x = this.getX();
		double y = this.getY();
		if (X < x || Y < y) {
		    return false;
		}
		w += x;
		h += y;
		//    overflow || intersect
		return ((w < x || w > X) &&
			(h < y || h > Y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotoeditPackage.PHOTO_AREA__X:
				return getX();
			case PhotoeditPackage.PHOTO_AREA__Y:
				return getY();
			case PhotoeditPackage.PHOTO_AREA__WIDTH:
				return getWidth();
			case PhotoeditPackage.PHOTO_AREA__HEIGHT:
				return getHeight();
			case PhotoeditPackage.PHOTO_AREA__COLOR:
				return getColor();
			case PhotoeditPackage.PHOTO_AREA__DESCRIPTION:
				return getDescription();
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
			case PhotoeditPackage.PHOTO_AREA__X:
				setX((Double)newValue);
				return;
			case PhotoeditPackage.PHOTO_AREA__Y:
				setY((Double)newValue);
				return;
			case PhotoeditPackage.PHOTO_AREA__WIDTH:
				setWidth((Double)newValue);
				return;
			case PhotoeditPackage.PHOTO_AREA__HEIGHT:
				setHeight((Double)newValue);
				return;
			case PhotoeditPackage.PHOTO_AREA__COLOR:
				setColor((String)newValue);
				return;
			case PhotoeditPackage.PHOTO_AREA__DESCRIPTION:
				setDescription((String)newValue);
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
			case PhotoeditPackage.PHOTO_AREA__X:
				setX(X_EDEFAULT);
				return;
			case PhotoeditPackage.PHOTO_AREA__Y:
				setY(Y_EDEFAULT);
				return;
			case PhotoeditPackage.PHOTO_AREA__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case PhotoeditPackage.PHOTO_AREA__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case PhotoeditPackage.PHOTO_AREA__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case PhotoeditPackage.PHOTO_AREA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case PhotoeditPackage.PHOTO_AREA__X:
				return getX() != X_EDEFAULT;
			case PhotoeditPackage.PHOTO_AREA__Y:
				return getY() != Y_EDEFAULT;
			case PhotoeditPackage.PHOTO_AREA__WIDTH:
				return getWidth() != WIDTH_EDEFAULT;
			case PhotoeditPackage.PHOTO_AREA__HEIGHT:
				return getHeight() != HEIGHT_EDEFAULT;
			case PhotoeditPackage.PHOTO_AREA__COLOR:
				return COLOR_EDEFAULT == null ? getColor() != null : !COLOR_EDEFAULT.equals(getColor());
			case PhotoeditPackage.PHOTO_AREA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
		}
		return super.eIsSet(featureID);
	}

} //PhotoAreaImpl
