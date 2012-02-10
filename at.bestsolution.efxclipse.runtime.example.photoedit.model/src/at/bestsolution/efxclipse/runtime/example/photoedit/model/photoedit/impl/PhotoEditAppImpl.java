/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl;

import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Album;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoEditApp;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Photo Edit App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoEditAppImpl#getAlbums <em>Albums</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhotoEditAppImpl extends EObjectImpl implements PhotoEditApp {
	/**
	 * The cached value of the '{@link #getAlbums() <em>Albums</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlbums()
	 * @generated
	 * @ordered
	 */
	protected EList<Album> albums;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhotoEditAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotoeditPackage.Literals.PHOTO_EDIT_APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Album> getAlbums() {
		if (albums == null) {
			albums = new EObjectContainmentEList<Album>(Album.class, this, PhotoeditPackage.PHOTO_EDIT_APP__ALBUMS);
		}
		return albums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotoeditPackage.PHOTO_EDIT_APP__ALBUMS:
				return ((InternalEList<?>)getAlbums()).basicRemove(otherEnd, msgs);
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
			case PhotoeditPackage.PHOTO_EDIT_APP__ALBUMS:
				return getAlbums();
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
			case PhotoeditPackage.PHOTO_EDIT_APP__ALBUMS:
				getAlbums().clear();
				getAlbums().addAll((Collection<? extends Album>)newValue);
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
			case PhotoeditPackage.PHOTO_EDIT_APP__ALBUMS:
				getAlbums().clear();
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
			case PhotoeditPackage.PHOTO_EDIT_APP__ALBUMS:
				return albums != null && !albums.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhotoEditAppImpl
