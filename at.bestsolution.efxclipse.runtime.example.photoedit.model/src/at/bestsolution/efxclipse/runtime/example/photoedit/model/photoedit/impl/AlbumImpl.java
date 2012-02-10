/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl;

import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Album;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Media;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.AlbumImpl#getMedia <em>Media</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlbumImpl extends EObjectImpl implements Album {
	/**
	 * The cached value of the '{@link #getMedia() <em>Media</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedia()
	 * @generated
	 * @ordered
	 */
	protected EList<Media> media;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlbumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhotoeditPackage.Literals.ALBUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Media> getMedia() {
		if (media == null) {
			media = new EObjectResolvingEList<Media>(Media.class, this, PhotoeditPackage.ALBUM__MEDIA);
		}
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhotoeditPackage.ALBUM__MEDIA:
				return getMedia();
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
			case PhotoeditPackage.ALBUM__MEDIA:
				getMedia().clear();
				getMedia().addAll((Collection<? extends Media>)newValue);
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
			case PhotoeditPackage.ALBUM__MEDIA:
				getMedia().clear();
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
			case PhotoeditPackage.ALBUM__MEDIA:
				return media != null && !media.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AlbumImpl
