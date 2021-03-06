/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Photo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo#getAreas <em>Areas</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage#getPhoto()
 * @model
 * @generated
 */
public interface Photo extends Media {
	/**
	 * Returns the value of the '<em><b>Areas</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoArea}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Areas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Areas</em>' containment reference list.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage#getPhoto_Areas()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhotoArea> getAreas();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Source)
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage#getPhoto_Source()
	 * @model containment="true"
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

} // Photo
