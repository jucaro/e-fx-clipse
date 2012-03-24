/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl;

import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinaryObject;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinarySource;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.BinarySourceImpl#getPreviewObject <em>Preview Object</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.BinarySourceImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinarySourceImpl extends SourceImpl implements BinarySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinarySourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotoeditPackage.Literals.BINARY_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryObject getPreviewObject() {
		return (BinaryObject)eDynamicGet(PhotoeditPackage.BINARY_SOURCE__PREVIEW_OBJECT, PhotoeditPackage.Literals.BINARY_SOURCE__PREVIEW_OBJECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviewObject(BinaryObject newPreviewObject, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPreviewObject, PhotoeditPackage.BINARY_SOURCE__PREVIEW_OBJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviewObject(BinaryObject newPreviewObject) {
		eDynamicSet(PhotoeditPackage.BINARY_SOURCE__PREVIEW_OBJECT, PhotoeditPackage.Literals.BINARY_SOURCE__PREVIEW_OBJECT, newPreviewObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryObject getObject() {
		return (BinaryObject)eDynamicGet(PhotoeditPackage.BINARY_SOURCE__OBJECT, PhotoeditPackage.Literals.BINARY_SOURCE__OBJECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(BinaryObject newObject, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newObject, PhotoeditPackage.BINARY_SOURCE__OBJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(BinaryObject newObject) {
		eDynamicSet(PhotoeditPackage.BINARY_SOURCE__OBJECT, PhotoeditPackage.Literals.BINARY_SOURCE__OBJECT, newObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotoeditPackage.BINARY_SOURCE__PREVIEW_OBJECT:
				return basicSetPreviewObject(null, msgs);
			case PhotoeditPackage.BINARY_SOURCE__OBJECT:
				return basicSetObject(null, msgs);
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
			case PhotoeditPackage.BINARY_SOURCE__PREVIEW_OBJECT:
				return getPreviewObject();
			case PhotoeditPackage.BINARY_SOURCE__OBJECT:
				return getObject();
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
			case PhotoeditPackage.BINARY_SOURCE__PREVIEW_OBJECT:
				setPreviewObject((BinaryObject)newValue);
				return;
			case PhotoeditPackage.BINARY_SOURCE__OBJECT:
				setObject((BinaryObject)newValue);
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
			case PhotoeditPackage.BINARY_SOURCE__PREVIEW_OBJECT:
				setPreviewObject((BinaryObject)null);
				return;
			case PhotoeditPackage.BINARY_SOURCE__OBJECT:
				setObject((BinaryObject)null);
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
			case PhotoeditPackage.BINARY_SOURCE__PREVIEW_OBJECT:
				return getPreviewObject() != null;
			case PhotoeditPackage.BINARY_SOURCE__OBJECT:
				return getObject() != null;
		}
		return super.eIsSet(featureID);
	}

} //BinarySourceImpl
