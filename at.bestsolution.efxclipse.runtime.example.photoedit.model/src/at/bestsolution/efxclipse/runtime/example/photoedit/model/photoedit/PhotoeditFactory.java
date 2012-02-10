/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage
 * @generated
 */
public interface PhotoeditFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PhotoeditFactory eINSTANCE = at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Photo Edit App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Photo Edit App</em>'.
	 * @generated
	 */
	PhotoEditApp createPhotoEditApp();

	/**
	 * Returns a new object of class '<em>Album</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Album</em>'.
	 * @generated
	 */
	Album createAlbum();

	/**
	 * Returns a new object of class '<em>Photo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Photo</em>'.
	 * @generated
	 */
	Photo createPhoto();

	/**
	 * Returns a new object of class '<em>Photo Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Photo Area</em>'.
	 * @generated
	 */
	PhotoArea createPhotoArea();

	/**
	 * Returns a new object of class '<em>Binary Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Source</em>'.
	 * @generated
	 */
	BinarySource createBinarySource();

	/**
	 * Returns a new object of class '<em>Binary Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Object</em>'.
	 * @generated
	 */
	BinaryObject createBinaryObject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PhotoeditPackage getPhotoeditPackage();

} //PhotoeditFactory
