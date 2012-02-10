/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit;

import java.io.InputStream;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage#getSource()
 * @model abstract="true"
 * @generated
 */
public interface Source extends BaseObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.InputStream"
	 * @generated
	 */
	InputStream getPreviewObjectStream();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.InputStream"
	 * @generated
	 */
	InputStream getObjectStream();

} // Source
