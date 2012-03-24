/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl;

import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Album;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BaseObject;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinaryObject;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinarySource;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Media;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoArea;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoEditApp;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditFactory;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Source;

import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.URLSource;
import java.io.InputStream;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhotoeditPackageImpl extends EPackageImpl implements PhotoeditPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass photoEditAppEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass albumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass photoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass photoAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binarySourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inputStreamEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PhotoeditPackageImpl() {
		super(eNS_URI, PhotoeditFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PhotoeditPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PhotoeditPackage init() {
		if (isInited) return (PhotoeditPackage)EPackage.Registry.INSTANCE.getEPackage(PhotoeditPackage.eNS_URI);

		// Obtain or create and register package
		PhotoeditPackageImpl thePhotoeditPackage = (PhotoeditPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PhotoeditPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PhotoeditPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePhotoeditPackage.createPackageContents();

		// Initialize created meta-data
		thePhotoeditPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePhotoeditPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PhotoeditPackage.eNS_URI, thePhotoeditPackage);
		return thePhotoeditPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseObject() {
		return baseObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseObject_Uuid() {
		return (EAttribute)baseObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhotoEditApp() {
		return photoEditAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhotoEditApp_Albums() {
		return (EReference)photoEditAppEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlbum() {
		return albumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlbum_Media() {
		return (EReference)albumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlbum_Title() {
		return (EAttribute)albumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlbum_Description() {
		return (EAttribute)albumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlbum_CoverImage() {
		return (EReference)albumEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedia() {
		return mediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Title() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Description() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhoto() {
		return photoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhoto_Areas() {
		return (EReference)photoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhoto_Source() {
		return (EReference)photoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhotoArea() {
		return photoAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhotoArea_X() {
		return (EAttribute)photoAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhotoArea_Y() {
		return (EAttribute)photoAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhotoArea_Width() {
		return (EAttribute)photoAreaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhotoArea_Height() {
		return (EAttribute)photoAreaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhotoArea_Color() {
		return (EAttribute)photoAreaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhotoArea_Description() {
		return (EAttribute)photoAreaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinarySource() {
		return binarySourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinarySource_PreviewObject() {
		return (EReference)binarySourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinarySource_Object() {
		return (EReference)binarySourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryObject() {
		return binaryObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryObject_Content() {
		return (EAttribute)binaryObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURLSource() {
		return urlSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLSource_PreviewObjectURL() {
		return (EAttribute)urlSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLSource_ObjectURL() {
		return (EAttribute)urlSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInputStream() {
		return inputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotoeditFactory getPhotoeditFactory() {
		return (PhotoeditFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		baseObjectEClass = createEClass(BASE_OBJECT);
		createEAttribute(baseObjectEClass, BASE_OBJECT__UUID);

		photoEditAppEClass = createEClass(PHOTO_EDIT_APP);
		createEReference(photoEditAppEClass, PHOTO_EDIT_APP__ALBUMS);

		albumEClass = createEClass(ALBUM);
		createEReference(albumEClass, ALBUM__MEDIA);
		createEAttribute(albumEClass, ALBUM__TITLE);
		createEAttribute(albumEClass, ALBUM__DESCRIPTION);
		createEReference(albumEClass, ALBUM__COVER_IMAGE);

		mediaEClass = createEClass(MEDIA);
		createEAttribute(mediaEClass, MEDIA__TITLE);
		createEAttribute(mediaEClass, MEDIA__DESCRIPTION);

		photoEClass = createEClass(PHOTO);
		createEReference(photoEClass, PHOTO__AREAS);
		createEReference(photoEClass, PHOTO__SOURCE);

		photoAreaEClass = createEClass(PHOTO_AREA);
		createEAttribute(photoAreaEClass, PHOTO_AREA__X);
		createEAttribute(photoAreaEClass, PHOTO_AREA__Y);
		createEAttribute(photoAreaEClass, PHOTO_AREA__WIDTH);
		createEAttribute(photoAreaEClass, PHOTO_AREA__HEIGHT);
		createEAttribute(photoAreaEClass, PHOTO_AREA__COLOR);
		createEAttribute(photoAreaEClass, PHOTO_AREA__DESCRIPTION);

		sourceEClass = createEClass(SOURCE);

		binarySourceEClass = createEClass(BINARY_SOURCE);
		createEReference(binarySourceEClass, BINARY_SOURCE__PREVIEW_OBJECT);
		createEReference(binarySourceEClass, BINARY_SOURCE__OBJECT);

		urlSourceEClass = createEClass(URL_SOURCE);
		createEAttribute(urlSourceEClass, URL_SOURCE__PREVIEW_OBJECT_URL);
		createEAttribute(urlSourceEClass, URL_SOURCE__OBJECT_URL);

		binaryObjectEClass = createEClass(BINARY_OBJECT);
		createEAttribute(binaryObjectEClass, BINARY_OBJECT__CONTENT);

		// Create data types
		inputStreamEDataType = createEDataType(INPUT_STREAM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		photoEditAppEClass.getESuperTypes().add(this.getBaseObject());
		albumEClass.getESuperTypes().add(this.getBaseObject());
		mediaEClass.getESuperTypes().add(this.getBaseObject());
		photoEClass.getESuperTypes().add(this.getMedia());
		photoAreaEClass.getESuperTypes().add(this.getBaseObject());
		sourceEClass.getESuperTypes().add(this.getBaseObject());
		binarySourceEClass.getESuperTypes().add(this.getSource());
		urlSourceEClass.getESuperTypes().add(this.getSource());
		binaryObjectEClass.getESuperTypes().add(this.getBaseObject());

		// Initialize classes and features; add operations and parameters
		initEClass(baseObjectEClass, BaseObject.class, "BaseObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseObject_Uuid(), ecorePackage.getEString(), "uuid", null, 0, 1, BaseObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(photoEditAppEClass, PhotoEditApp.class, "PhotoEditApp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhotoEditApp_Albums(), this.getAlbum(), null, "albums", null, 0, -1, PhotoEditApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(albumEClass, Album.class, "Album", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlbum_Media(), this.getMedia(), null, "media", null, 0, -1, Album.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlbum_Title(), ecorePackage.getEString(), "title", null, 0, 1, Album.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlbum_Description(), ecorePackage.getEString(), "description", null, 0, 1, Album.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlbum_CoverImage(), this.getPhoto(), null, "coverImage", null, 0, 1, Album.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaEClass, Media.class, "Media", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedia_Title(), ecorePackage.getEString(), "title", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Description(), ecorePackage.getEString(), "description", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(photoEClass, Photo.class, "Photo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhoto_Areas(), this.getPhotoArea(), null, "areas", null, 0, -1, Photo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhoto_Source(), this.getSource(), null, "source", null, 0, 1, Photo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(photoAreaEClass, PhotoArea.class, "PhotoArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhotoArea_X(), ecorePackage.getEDouble(), "x", null, 0, 1, PhotoArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhotoArea_Y(), ecorePackage.getEDouble(), "y", null, 0, 1, PhotoArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhotoArea_Width(), ecorePackage.getEDouble(), "width", null, 0, 1, PhotoArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhotoArea_Height(), ecorePackage.getEDouble(), "height", null, 0, 1, PhotoArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhotoArea_Color(), ecorePackage.getEString(), "color", null, 0, 1, PhotoArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhotoArea_Description(), ecorePackage.getEString(), "description", null, 0, 1, PhotoArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(photoAreaEClass, ecorePackage.getEBoolean(), "contains", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sourceEClass, Source.class, "Source", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(sourceEClass, this.getInputStream(), "getPreviewObjectStream", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(sourceEClass, this.getInputStream(), "getObjectStream", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(binarySourceEClass, BinarySource.class, "BinarySource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinarySource_PreviewObject(), this.getBinaryObject(), null, "previewObject", null, 0, 1, BinarySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinarySource_Object(), this.getBinaryObject(), null, "object", null, 0, 1, BinarySource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urlSourceEClass, URLSource.class, "URLSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURLSource_PreviewObjectURL(), ecorePackage.getEString(), "previewObjectURL", null, 0, 1, URLSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getURLSource_ObjectURL(), ecorePackage.getEString(), "objectURL", null, 0, 1, URLSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryObjectEClass, BinaryObject.class, "BinaryObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryObject_Content(), ecorePackage.getEByteArray(), "content", null, 0, 1, BinaryObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(inputStreamEDataType, InputStream.class, "InputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PhotoeditPackageImpl
