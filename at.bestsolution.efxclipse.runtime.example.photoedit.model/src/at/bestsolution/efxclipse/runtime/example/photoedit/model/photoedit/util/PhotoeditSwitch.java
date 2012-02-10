/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.util;

import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage
 * @generated
 */
public class PhotoeditSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PhotoeditPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotoeditSwitch() {
		if (modelPackage == null) {
			modelPackage = PhotoeditPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PhotoeditPackage.BASE_OBJECT: {
				BaseObject baseObject = (BaseObject)theEObject;
				T result = caseBaseObject(baseObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotoeditPackage.PHOTO_EDIT_APP: {
				PhotoEditApp photoEditApp = (PhotoEditApp)theEObject;
				T result = casePhotoEditApp(photoEditApp);
				if (result == null) result = caseBaseObject(photoEditApp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotoeditPackage.ALBUM: {
				Album album = (Album)theEObject;
				T result = caseAlbum(album);
				if (result == null) result = caseBaseObject(album);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotoeditPackage.MEDIA: {
				Media media = (Media)theEObject;
				T result = caseMedia(media);
				if (result == null) result = caseBaseObject(media);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotoeditPackage.PHOTO: {
				Photo photo = (Photo)theEObject;
				T result = casePhoto(photo);
				if (result == null) result = caseMedia(photo);
				if (result == null) result = caseBaseObject(photo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotoeditPackage.PHOTO_AREA: {
				PhotoArea photoArea = (PhotoArea)theEObject;
				T result = casePhotoArea(photoArea);
				if (result == null) result = caseBaseObject(photoArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotoeditPackage.SOURCE: {
				Source source = (Source)theEObject;
				T result = caseSource(source);
				if (result == null) result = caseBaseObject(source);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotoeditPackage.BINARY_SOURCE: {
				BinarySource binarySource = (BinarySource)theEObject;
				T result = caseBinarySource(binarySource);
				if (result == null) result = caseSource(binarySource);
				if (result == null) result = caseBaseObject(binarySource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotoeditPackage.URL_SOURCE: {
				URLSource urlSource = (URLSource)theEObject;
				T result = caseURLSource(urlSource);
				if (result == null) result = caseSource(urlSource);
				if (result == null) result = caseBaseObject(urlSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PhotoeditPackage.BINARY_OBJECT: {
				BinaryObject binaryObject = (BinaryObject)theEObject;
				T result = caseBinaryObject(binaryObject);
				if (result == null) result = caseBaseObject(binaryObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseObject(BaseObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Photo Edit App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Photo Edit App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhotoEditApp(PhotoEditApp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Album</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Album</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlbum(Album object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedia(Media object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Photo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Photo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhoto(Photo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Photo Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Photo Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhotoArea(PhotoArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinarySource(BinarySource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryObject(BinaryObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URL Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURLSource(URLSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PhotoeditSwitch
