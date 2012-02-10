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
	 * The cached value of the '{@link #getPreviewObject() <em>Preview Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviewObject()
	 * @generated
	 * @ordered
	 */
	protected BinaryObject previewObject;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected BinaryObject object;

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
		return previewObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviewObject(BinaryObject newPreviewObject, NotificationChain msgs) {
		BinaryObject oldPreviewObject = previewObject;
		previewObject = newPreviewObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhotoeditPackage.BINARY_SOURCE__PREVIEW_OBJECT, oldPreviewObject, newPreviewObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviewObject(BinaryObject newPreviewObject) {
		if (newPreviewObject != previewObject) {
			NotificationChain msgs = null;
			if (previewObject != null)
				msgs = ((InternalEObject)previewObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhotoeditPackage.BINARY_SOURCE__PREVIEW_OBJECT, null, msgs);
			if (newPreviewObject != null)
				msgs = ((InternalEObject)newPreviewObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhotoeditPackage.BINARY_SOURCE__PREVIEW_OBJECT, null, msgs);
			msgs = basicSetPreviewObject(newPreviewObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoeditPackage.BINARY_SOURCE__PREVIEW_OBJECT, newPreviewObject, newPreviewObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryObject getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(BinaryObject newObject, NotificationChain msgs) {
		BinaryObject oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhotoeditPackage.BINARY_SOURCE__OBJECT, oldObject, newObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(BinaryObject newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhotoeditPackage.BINARY_SOURCE__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhotoeditPackage.BINARY_SOURCE__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhotoeditPackage.BINARY_SOURCE__OBJECT, newObject, newObject));
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
				return previewObject != null;
			case PhotoeditPackage.BINARY_SOURCE__OBJECT:
				return object != null;
		}
		return super.eIsSet(featureID);
	}

} //BinarySourceImpl
