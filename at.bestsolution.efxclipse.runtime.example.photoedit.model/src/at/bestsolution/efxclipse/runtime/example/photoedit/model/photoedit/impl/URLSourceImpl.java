/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.URLSource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URL Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.URLSourceImpl#getPreviewObjectURL <em>Preview Object URL</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.URLSourceImpl#getObjectURL <em>Object URL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class URLSourceImpl extends SourceImpl implements URLSource {
	/**
	 * The default value of the '{@link #getPreviewObjectURL() <em>Preview Object URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviewObjectURL()
	 * @generated
	 * @ordered
	 */
	protected static final String PREVIEW_OBJECT_URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getObjectURL() <em>Object URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectURL()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URLSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotoeditPackage.Literals.URL_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreviewObjectURL() {
		return (String)eDynamicGet(PhotoeditPackage.URL_SOURCE__PREVIEW_OBJECT_URL, PhotoeditPackage.Literals.URL_SOURCE__PREVIEW_OBJECT_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviewObjectURL(String newPreviewObjectURL) {
		eDynamicSet(PhotoeditPackage.URL_SOURCE__PREVIEW_OBJECT_URL, PhotoeditPackage.Literals.URL_SOURCE__PREVIEW_OBJECT_URL, newPreviewObjectURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectURL() {
		return (String)eDynamicGet(PhotoeditPackage.URL_SOURCE__OBJECT_URL, PhotoeditPackage.Literals.URL_SOURCE__OBJECT_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectURL(String newObjectURL) {
		eDynamicSet(PhotoeditPackage.URL_SOURCE__OBJECT_URL, PhotoeditPackage.Literals.URL_SOURCE__OBJECT_URL, newObjectURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotoeditPackage.URL_SOURCE__PREVIEW_OBJECT_URL:
				return getPreviewObjectURL();
			case PhotoeditPackage.URL_SOURCE__OBJECT_URL:
				return getObjectURL();
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
			case PhotoeditPackage.URL_SOURCE__PREVIEW_OBJECT_URL:
				setPreviewObjectURL((String)newValue);
				return;
			case PhotoeditPackage.URL_SOURCE__OBJECT_URL:
				setObjectURL((String)newValue);
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
			case PhotoeditPackage.URL_SOURCE__PREVIEW_OBJECT_URL:
				setPreviewObjectURL(PREVIEW_OBJECT_URL_EDEFAULT);
				return;
			case PhotoeditPackage.URL_SOURCE__OBJECT_URL:
				setObjectURL(OBJECT_URL_EDEFAULT);
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
			case PhotoeditPackage.URL_SOURCE__PREVIEW_OBJECT_URL:
				return PREVIEW_OBJECT_URL_EDEFAULT == null ? getPreviewObjectURL() != null : !PREVIEW_OBJECT_URL_EDEFAULT.equals(getPreviewObjectURL());
			case PhotoeditPackage.URL_SOURCE__OBJECT_URL:
				return OBJECT_URL_EDEFAULT == null ? getObjectURL() != null : !OBJECT_URL_EDEFAULT.equals(getObjectURL());
		}
		return super.eIsSet(featureID);
	}

	@Override
	public InputStream getObjectStream() {
		try {
			return new URL(getObjectURL()).openStream();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public InputStream getPreviewObjectStream() {
		try {
			return new URL(getPreviewObjectURL()).openStream();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

} //URLSourceImpl
