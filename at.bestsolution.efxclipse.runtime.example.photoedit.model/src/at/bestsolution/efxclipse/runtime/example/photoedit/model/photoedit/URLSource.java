/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.URLSource#getPreviewObjectURL <em>Preview Object URL</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.URLSource#getObjectURL <em>Object URL</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage#getURLSource()
 * @model
 * @generated
 */
public interface URLSource extends Source {
	/**
	 * Returns the value of the '<em><b>Preview Object URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preview Object URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preview Object URL</em>' attribute.
	 * @see #setPreviewObjectURL(String)
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage#getURLSource_PreviewObjectURL()
	 * @model
	 * @generated
	 */
	String getPreviewObjectURL();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.URLSource#getPreviewObjectURL <em>Preview Object URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preview Object URL</em>' attribute.
	 * @see #getPreviewObjectURL()
	 * @generated
	 */
	void setPreviewObjectURL(String value);

	/**
	 * Returns the value of the '<em><b>Object URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object URL</em>' attribute.
	 * @see #setObjectURL(String)
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage#getURLSource_ObjectURL()
	 * @model
	 * @generated
	 */
	String getObjectURL();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.URLSource#getObjectURL <em>Object URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object URL</em>' attribute.
	 * @see #getObjectURL()
	 * @generated
	 */
	void setObjectURL(String value);

} // URLSource
