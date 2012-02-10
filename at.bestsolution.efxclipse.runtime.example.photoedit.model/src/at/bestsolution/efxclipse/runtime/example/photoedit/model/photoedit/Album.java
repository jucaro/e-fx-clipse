/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Album#getMedia <em>Media</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage#getAlbum()
 * @model
 * @generated
 */
public interface Album extends EObject {
	/**
	 * Returns the value of the '<em><b>Media</b></em>' reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Media}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media</em>' reference list.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage#getAlbum_Media()
	 * @model
	 * @generated
	 */
	EList<Media> getMedia();

} // Album
