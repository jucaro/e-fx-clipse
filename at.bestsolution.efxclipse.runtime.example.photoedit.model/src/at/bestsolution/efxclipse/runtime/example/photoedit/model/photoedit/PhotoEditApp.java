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
 * A representation of the model object '<em><b>Photo Edit App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoEditApp#getAlbums <em>Albums</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage#getPhotoEditApp()
 * @model
 * @generated
 */
public interface PhotoEditApp extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Albums</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Album}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Albums</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Albums</em>' containment reference list.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage#getPhotoEditApp_Albums()
	 * @model containment="true"
	 * @generated
	 */
	EList<Album> getAlbums();

} // PhotoEditApp
