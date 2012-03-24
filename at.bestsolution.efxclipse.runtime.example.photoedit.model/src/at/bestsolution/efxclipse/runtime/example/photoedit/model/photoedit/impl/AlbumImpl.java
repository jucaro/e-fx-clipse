/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl;

import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Album;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Media;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.AlbumImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.AlbumImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.AlbumImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.AlbumImpl#getCoverImage <em>Cover Image</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlbumImpl extends BaseObjectImpl implements Album {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;
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
	@SuppressWarnings("unchecked")
	public EList<Media> getMedia() {
		return (EList<Media>)eDynamicGet(PhotoeditPackage.ALBUM__MEDIA, PhotoeditPackage.Literals.ALBUM__MEDIA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return (String)eDynamicGet(PhotoeditPackage.ALBUM__TITLE, PhotoeditPackage.Literals.ALBUM__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		eDynamicSet(PhotoeditPackage.ALBUM__TITLE, PhotoeditPackage.Literals.ALBUM__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(PhotoeditPackage.ALBUM__DESCRIPTION, PhotoeditPackage.Literals.ALBUM__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(PhotoeditPackage.ALBUM__DESCRIPTION, PhotoeditPackage.Literals.ALBUM__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Photo getCoverImage() {
		return (Photo)eDynamicGet(PhotoeditPackage.ALBUM__COVER_IMAGE, PhotoeditPackage.Literals.ALBUM__COVER_IMAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverImage(Photo newCoverImage, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCoverImage, PhotoeditPackage.ALBUM__COVER_IMAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverImage(Photo newCoverImage) {
		eDynamicSet(PhotoeditPackage.ALBUM__COVER_IMAGE, PhotoeditPackage.Literals.ALBUM__COVER_IMAGE, newCoverImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhotoeditPackage.ALBUM__MEDIA:
				return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
			case PhotoeditPackage.ALBUM__COVER_IMAGE:
				return basicSetCoverImage(null, msgs);
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
			case PhotoeditPackage.ALBUM__MEDIA:
				return getMedia();
			case PhotoeditPackage.ALBUM__TITLE:
				return getTitle();
			case PhotoeditPackage.ALBUM__DESCRIPTION:
				return getDescription();
			case PhotoeditPackage.ALBUM__COVER_IMAGE:
				return getCoverImage();
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
			case PhotoeditPackage.ALBUM__TITLE:
				setTitle((String)newValue);
				return;
			case PhotoeditPackage.ALBUM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PhotoeditPackage.ALBUM__COVER_IMAGE:
				setCoverImage((Photo)newValue);
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
			case PhotoeditPackage.ALBUM__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case PhotoeditPackage.ALBUM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PhotoeditPackage.ALBUM__COVER_IMAGE:
				setCoverImage((Photo)null);
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
				return !getMedia().isEmpty();
			case PhotoeditPackage.ALBUM__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case PhotoeditPackage.ALBUM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case PhotoeditPackage.ALBUM__COVER_IMAGE:
				return getCoverImage() != null;
		}
		return super.eIsSet(featureID);
	}

} //AlbumImpl
