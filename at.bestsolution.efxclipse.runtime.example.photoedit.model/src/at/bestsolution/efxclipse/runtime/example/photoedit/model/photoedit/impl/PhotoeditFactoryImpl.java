/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl;

import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.*;

import java.io.InputStream;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhotoeditFactoryImpl extends EFactoryImpl implements PhotoeditFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhotoeditFactory init() {
		try {
			PhotoeditFactory thePhotoeditFactory = (PhotoeditFactory)EPackage.Registry.INSTANCE.getEFactory("http://efxclipse.org/examples/photoedit/v1.0"); 
			if (thePhotoeditFactory != null) {
				return thePhotoeditFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PhotoeditFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotoeditFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PhotoeditPackage.PHOTO_EDIT_APP: return (EObject)createPhotoEditApp();
			case PhotoeditPackage.ALBUM: return (EObject)createAlbum();
			case PhotoeditPackage.PHOTO: return (EObject)createPhoto();
			case PhotoeditPackage.PHOTO_AREA: return (EObject)createPhotoArea();
			case PhotoeditPackage.BINARY_SOURCE: return (EObject)createBinarySource();
			case PhotoeditPackage.URL_SOURCE: return (EObject)createURLSource();
			case PhotoeditPackage.BINARY_OBJECT: return (EObject)createBinaryObject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PhotoeditPackage.INPUT_STREAM:
				return createInputStreamFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PhotoeditPackage.INPUT_STREAM:
				return convertInputStreamToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotoEditApp createPhotoEditApp() {
		PhotoEditAppImpl photoEditApp = new PhotoEditAppImpl();
		return photoEditApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Album createAlbum() {
		AlbumImpl album = new AlbumImpl();
		return album;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Photo createPhoto() {
		PhotoImpl photo = new PhotoImpl();
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotoArea createPhotoArea() {
		PhotoAreaImpl photoArea = new PhotoAreaImpl();
		return photoArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinarySource createBinarySource() {
		BinarySourceImpl binarySource = new BinarySourceImpl();
		return binarySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryObject createBinaryObject() {
		BinaryObjectImpl binaryObject = new BinaryObjectImpl();
		return binaryObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLSource createURLSource() {
		URLSourceImpl urlSource = new URLSourceImpl();
		return urlSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputStream createInputStreamFromString(EDataType eDataType, String initialValue) {
		return (InputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotoeditPackage getPhotoeditPackage() {
		return (PhotoeditPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PhotoeditPackage getPackage() {
		return PhotoeditPackage.eINSTANCE;
	}

} //PhotoeditFactoryImpl
