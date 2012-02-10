/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.util;

import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage
 * @generated
 */
public class PhotoeditAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PhotoeditPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotoeditAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PhotoeditPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhotoeditSwitch<Adapter> modelSwitch =
		new PhotoeditSwitch<Adapter>() {
			@Override
			public Adapter casePhotoEditApp(PhotoEditApp object) {
				return createPhotoEditAppAdapter();
			}
			@Override
			public Adapter caseAlbum(Album object) {
				return createAlbumAdapter();
			}
			@Override
			public Adapter caseMedia(Media object) {
				return createMediaAdapter();
			}
			@Override
			public Adapter casePhoto(Photo object) {
				return createPhotoAdapter();
			}
			@Override
			public Adapter casePhotoArea(PhotoArea object) {
				return createPhotoAreaAdapter();
			}
			@Override
			public Adapter caseSource(Source object) {
				return createSourceAdapter();
			}
			@Override
			public Adapter caseBinarySource(BinarySource object) {
				return createBinarySourceAdapter();
			}
			@Override
			public Adapter caseBinaryObject(BinaryObject object) {
				return createBinaryObjectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoEditApp <em>Photo Edit App</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoEditApp
	 * @generated
	 */
	public Adapter createPhotoEditAppAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Album <em>Album</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Album
	 * @generated
	 */
	public Adapter createAlbumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Media
	 * @generated
	 */
	public Adapter createMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo <em>Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo
	 * @generated
	 */
	public Adapter createPhotoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoArea <em>Photo Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoArea
	 * @generated
	 */
	public Adapter createPhotoAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Source
	 * @generated
	 */
	public Adapter createSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinarySource <em>Binary Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinarySource
	 * @generated
	 */
	public Adapter createBinarySourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinaryObject <em>Binary Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinaryObject
	 * @generated
	 */
	public Adapter createBinaryObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PhotoeditAdapterFactory
