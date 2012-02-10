/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinaryObject#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage#getBinaryObject()
 * @model
 * @generated
 */
public interface BinaryObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(byte[])
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage#getBinaryObject_Content()
	 * @model
	 * @generated
	 */
	byte[] getContent();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinaryObject#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(byte[] value);

} // BinaryObject
