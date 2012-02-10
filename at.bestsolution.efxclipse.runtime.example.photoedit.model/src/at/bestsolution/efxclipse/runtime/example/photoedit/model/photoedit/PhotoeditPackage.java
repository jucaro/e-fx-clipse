/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditFactory
 * @model kind="package"
 * @generated
 */
public interface PhotoeditPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "photoedit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://efxclipse.org/examples/photoedit/v1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "photoedit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PhotoeditPackage eINSTANCE = at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoEditAppImpl <em>Photo Edit App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoEditAppImpl
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditPackageImpl#getPhotoEditApp()
	 * @generated
	 */
	int PHOTO_EDIT_APP = 0;

	/**
	 * The feature id for the '<em><b>Albums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_EDIT_APP__ALBUMS = 0;

	/**
	 * The number of structural features of the '<em>Photo Edit App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_EDIT_APP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.AlbumImpl <em>Album</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.AlbumImpl
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditPackageImpl#getAlbum()
	 * @generated
	 */
	int ALBUM = 1;

	/**
	 * The feature id for the '<em><b>Media</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__MEDIA = 0;

	/**
	 * The number of structural features of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.MediaImpl <em>Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.MediaImpl
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditPackageImpl#getMedia()
	 * @generated
	 */
	int MEDIA = 2;

	/**
	 * The number of structural features of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoImpl <em>Photo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoImpl
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditPackageImpl#getPhoto()
	 * @generated
	 */
	int PHOTO = 3;

	/**
	 * The feature id for the '<em><b>Areas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__AREAS = MEDIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__TITLE = MEDIA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__DESCRIPTION = MEDIA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__SOURCE = MEDIA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Photo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FEATURE_COUNT = MEDIA_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoAreaImpl <em>Photo Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoAreaImpl
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditPackageImpl#getPhotoArea()
	 * @generated
	 */
	int PHOTO_AREA = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_AREA__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_AREA__Y = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_AREA__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_AREA__HEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Photo Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_AREA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.SourceImpl
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 5;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.BinarySourceImpl <em>Binary Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.BinarySourceImpl
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditPackageImpl#getBinarySource()
	 * @generated
	 */
	int BINARY_SOURCE = 6;

	/**
	 * The feature id for the '<em><b>Preview Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SOURCE__PREVIEW_OBJECT = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SOURCE__OBJECT = SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SOURCE_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.BinaryObjectImpl <em>Binary Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.BinaryObjectImpl
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditPackageImpl#getBinaryObject()
	 * @generated
	 */
	int BINARY_OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OBJECT__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Binary Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '<em>Input Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.InputStream
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditPackageImpl#getInputStream()
	 * @generated
	 */
	int INPUT_STREAM = 8;


	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoEditApp <em>Photo Edit App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photo Edit App</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoEditApp
	 * @generated
	 */
	EClass getPhotoEditApp();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoEditApp#getAlbums <em>Albums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Albums</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoEditApp#getAlbums()
	 * @see #getPhotoEditApp()
	 * @generated
	 */
	EReference getPhotoEditApp_Albums();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Album <em>Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Album</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Album
	 * @generated
	 */
	EClass getAlbum();

	/**
	 * Returns the meta object for the reference list '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Album#getMedia <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Media</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Album#getMedia()
	 * @see #getAlbum()
	 * @generated
	 */
	EReference getAlbum_Media();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Media
	 * @generated
	 */
	EClass getMedia();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo <em>Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photo</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo
	 * @generated
	 */
	EClass getPhoto();

	/**
	 * Returns the meta object for the reference list '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo#getAreas <em>Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Areas</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo#getAreas()
	 * @see #getPhoto()
	 * @generated
	 */
	EReference getPhoto_Areas();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo#getTitle()
	 * @see #getPhoto()
	 * @generated
	 */
	EAttribute getPhoto_Title();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo#getDescription()
	 * @see #getPhoto()
	 * @generated
	 */
	EAttribute getPhoto_Description();

	/**
	 * Returns the meta object for the reference '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo#getSource()
	 * @see #getPhoto()
	 * @generated
	 */
	EReference getPhoto_Source();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoArea <em>Photo Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photo Area</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoArea
	 * @generated
	 */
	EClass getPhotoArea();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoArea#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoArea#getX()
	 * @see #getPhotoArea()
	 * @generated
	 */
	EAttribute getPhotoArea_X();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoArea#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoArea#getY()
	 * @see #getPhotoArea()
	 * @generated
	 */
	EAttribute getPhotoArea_Y();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoArea#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoArea#getWidth()
	 * @see #getPhotoArea()
	 * @generated
	 */
	EAttribute getPhotoArea_Width();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoArea#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoArea#getHeight()
	 * @see #getPhotoArea()
	 * @generated
	 */
	EAttribute getPhotoArea_Height();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinarySource <em>Binary Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Source</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinarySource
	 * @generated
	 */
	EClass getBinarySource();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinarySource#getPreviewObject <em>Preview Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preview Object</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinarySource#getPreviewObject()
	 * @see #getBinarySource()
	 * @generated
	 */
	EReference getBinarySource_PreviewObject();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinarySource#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinarySource#getObject()
	 * @see #getBinarySource()
	 * @generated
	 */
	EReference getBinarySource_Object();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinaryObject <em>Binary Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Object</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinaryObject
	 * @generated
	 */
	EClass getBinaryObject();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinaryObject#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.BinaryObject#getContent()
	 * @see #getBinaryObject()
	 * @generated
	 */
	EAttribute getBinaryObject_Content();

	/**
	 * Returns the meta object for data type '{@link java.io.InputStream <em>Input Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input Stream</em>'.
	 * @see java.io.InputStream
	 * @model instanceClass="java.io.InputStream"
	 * @generated
	 */
	EDataType getInputStream();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PhotoeditFactory getPhotoeditFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoEditAppImpl <em>Photo Edit App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoEditAppImpl
		 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditPackageImpl#getPhotoEditApp()
		 * @generated
		 */
		EClass PHOTO_EDIT_APP = eINSTANCE.getPhotoEditApp();

		/**
		 * The meta object literal for the '<em><b>Albums</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHOTO_EDIT_APP__ALBUMS = eINSTANCE.getPhotoEditApp_Albums();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.AlbumImpl <em>Album</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.AlbumImpl
		 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditPackageImpl#getAlbum()
		 * @generated
		 */
		EClass ALBUM = eINSTANCE.getAlbum();

		/**
		 * The meta object literal for the '<em><b>Media</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALBUM__MEDIA = eINSTANCE.getAlbum_Media();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.MediaImpl <em>Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.MediaImpl
		 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditPackageImpl#getMedia()
		 * @generated
		 */
		EClass MEDIA = eINSTANCE.getMedia();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoImpl <em>Photo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoImpl
		 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditPackageImpl#getPhoto()
		 * @generated
		 */
		EClass PHOTO = eINSTANCE.getPhoto();

		/**
		 * The meta object literal for the '<em><b>Areas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHOTO__AREAS = eINSTANCE.getPhoto_Areas();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO__TITLE = eINSTANCE.getPhoto_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO__DESCRIPTION = eINSTANCE.getPhoto_Description();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHOTO__SOURCE = eINSTANCE.getPhoto_Source();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoAreaImpl <em>Photo Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoAreaImpl
		 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditPackageImpl#getPhotoArea()
		 * @generated
		 */
		EClass PHOTO_AREA = eINSTANCE.getPhotoArea();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO_AREA__X = eINSTANCE.getPhotoArea_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO_AREA__Y = eINSTANCE.getPhotoArea_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO_AREA__WIDTH = eINSTANCE.getPhotoArea_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO_AREA__HEIGHT = eINSTANCE.getPhotoArea_Height();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.SourceImpl
		 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.BinarySourceImpl <em>Binary Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.BinarySourceImpl
		 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditPackageImpl#getBinarySource()
		 * @generated
		 */
		EClass BINARY_SOURCE = eINSTANCE.getBinarySource();

		/**
		 * The meta object literal for the '<em><b>Preview Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_SOURCE__PREVIEW_OBJECT = eINSTANCE.getBinarySource_PreviewObject();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_SOURCE__OBJECT = eINSTANCE.getBinarySource_Object();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.BinaryObjectImpl <em>Binary Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.BinaryObjectImpl
		 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditPackageImpl#getBinaryObject()
		 * @generated
		 */
		EClass BINARY_OBJECT = eINSTANCE.getBinaryObject();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_OBJECT__CONTENT = eINSTANCE.getBinaryObject_Content();

		/**
		 * The meta object literal for the '<em>Input Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.InputStream
		 * @see at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.impl.PhotoeditPackageImpl#getInputStream()
		 * @generated
		 */
		EDataType INPUT_STREAM = eINSTANCE.getInputStream();

	}

} //PhotoeditPackage
