/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl;

import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoArea;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Source;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Photo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoImpl#getAreas <em>Areas</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhotoImpl extends MediaImpl implements Photo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhotoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotoeditPackage.Literals.PHOTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PhotoArea> getAreas() {
		return (EList<PhotoArea>)eDynamicGet(PhotoeditPackage.PHOTO__AREAS, PhotoeditPackage.Literals.PHOTO__AREAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getSource() {
		return (Source)eDynamicGet(PhotoeditPackage.PHOTO__SOURCE, PhotoeditPackage.Literals.PHOTO__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Source newSource, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSource, PhotoeditPackage.PHOTO__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Source newSource) {
		eDynamicSet(PhotoeditPackage.PHOTO__SOURCE, PhotoeditPackage.Literals.PHOTO__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotoeditPackage.PHOTO__AREAS:
				return ((InternalEList<?>)getAreas()).basicRemove(otherEnd, msgs);
			case PhotoeditPackage.PHOTO__SOURCE:
				return basicSetSource(null, msgs);
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
			case PhotoeditPackage.PHOTO__AREAS:
				return getAreas();
			case PhotoeditPackage.PHOTO__SOURCE:
				return getSource();
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
			case PhotoeditPackage.PHOTO__AREAS:
				getAreas().clear();
				getAreas().addAll((Collection<? extends PhotoArea>)newValue);
				return;
			case PhotoeditPackage.PHOTO__SOURCE:
				setSource((Source)newValue);
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
			case PhotoeditPackage.PHOTO__AREAS:
				getAreas().clear();
				return;
			case PhotoeditPackage.PHOTO__SOURCE:
				setSource((Source)null);
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
			case PhotoeditPackage.PHOTO__AREAS:
				return !getAreas().isEmpty();
			case PhotoeditPackage.PHOTO__SOURCE:
				return getSource() != null;
		}
		return super.eIsSet(featureID);
	}

} //PhotoImpl
