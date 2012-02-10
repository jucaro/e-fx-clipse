/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinarySource#getPreviewObject <em>Preview Object</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinarySource#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage#getBinarySource()
 * @model
 * @generated
 */
public interface BinarySource extends Source {
	/**
	 * Returns the value of the '<em><b>Preview Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preview Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preview Object</em>' containment reference.
	 * @see #setPreviewObject(BinaryObject)
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage#getBinarySource_PreviewObject()
	 * @model containment="true"
	 * @generated
	 */
	BinaryObject getPreviewObject();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinarySource#getPreviewObject <em>Preview Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preview Object</em>' containment reference.
	 * @see #getPreviewObject()
	 * @generated
	 */
	void setPreviewObject(BinaryObject value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(BinaryObject)
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage#getBinarySource_Object()
	 * @model containment="true"
	 * @generated
	 */
	BinaryObject getObject();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinarySource#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(BinaryObject value);

} // BinarySource
