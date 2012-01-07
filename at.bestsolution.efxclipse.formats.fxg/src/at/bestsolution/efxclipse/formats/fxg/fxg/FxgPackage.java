/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgFactory
 * @model kind="package"
 * @generated
 */
public interface FxgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fxg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ns.adobe.com/fxg/2008";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fxg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FxgPackage eINSTANCE = at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.FXGElement <em>FXG Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FXGElement
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getFXGElement()
	 * @generated
	 */
	int FXG_ELEMENT = 50;

	/**
	 * The number of structural features of the '<em>FXG Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FXG_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.ContainerElementImpl <em>Container Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.ContainerElementImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getContainerElement()
	 * @generated
	 */
	int CONTAINER_ELEMENT = 51;

	/**
	 * The feature id for the '<em><b>children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT__CHILDREN = FXG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ELEMENT_FEATURE_COUNT = FXG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GraphicImpl <em>Graphic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.GraphicImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getGraphic()
	 * @generated
	 */
	int GRAPHIC = 0;

	/**
	 * The feature id for the '<em><b>children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC__CHILDREN = CONTAINER_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Scale Grid Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC__SCALE_GRID_LEFT = CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scale Grid Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC__SCALE_GRID_RIGHT = CONTAINER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scale Grid Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC__SCALE_GRID_TOP = CONTAINER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale Grid Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC__SCALE_GRID_BOTTOM = CONTAINER_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>View Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC__VIEW_WIDTH = CONTAINER_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>View Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC__VIEW_HEIGHT = CONTAINER_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC__VERSION = CONTAINER_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC__MASK = CONTAINER_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Graphic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHIC_FEATURE_COUNT = CONTAINER_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.LibraryImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 1;

	/**
	 * The feature id for the '<em><b>children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__CHILDREN = CONTAINER_ELEMENT__CHILDREN;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.PrivateImpl <em>Private</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.PrivateImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getPrivate()
	 * @generated
	 */
	int PRIVATE = 2;

	/**
	 * The number of structural features of the '<em>Private</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_FEATURE_COUNT = FXG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.DefinitionImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__CHILDREN = CONTAINER_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__NAME = CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = CONTAINER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 4;

	/**
	 * The feature id for the '<em><b>children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CHILDREN = CONTAINER_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ROTATION = CONTAINER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SCALE_X = CONTAINER_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SCALE_Y = CONTAINER_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__X = CONTAINER_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__Y = CONTAINER_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Blend Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__BLEND_MODE = CONTAINER_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ALPHA = CONTAINER_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = CONTAINER_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Transform X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TRANSFORM_X = CONTAINER_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Transform Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TRANSFORM_Y = CONTAINER_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Mask Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MASK_TYPE = CONTAINER_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__VISIBLE = CONTAINER_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Scale Grid Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SCALE_GRID_LEFT = CONTAINER_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Scale Grid Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SCALE_GRID_RIGHT = CONTAINER_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Scale Grid Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SCALE_GRID_TOP = CONTAINER_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Scale Grid Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SCALE_GRID_BOTTOM = CONTAINER_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TRANSFORM = CONTAINER_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__FILTERS = CONTAINER_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = CONTAINER_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.TransformImpl <em>Transform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.TransformImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getTransform()
	 * @generated
	 */
	int TRANSFORM = 5;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM__MATRIX = FXG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color Transform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM__COLOR_TRANSFORM = FXG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_FEATURE_COUNT = FXG_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.PlaceObjectImpl <em>Place Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.PlaceObjectImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getPlaceObject()
	 * @generated
	 */
	int PLACE_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OBJECT__ID = FXG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OBJECT__TRANSFORM = FXG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OBJECT__FILTERS = FXG_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OBJECT__MASK = FXG_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Place Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OBJECT_FEATURE_COUNT = FXG_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.MatrixImpl <em>Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.MatrixImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getMatrix()
	 * @generated
	 */
	int MATRIX = 7;

	/**
	 * The feature id for the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__A = FXG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__B = FXG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__C = FXG_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__D = FXG_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__TX = FXG_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__TY = FXG_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_FEATURE_COUNT = FXG_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.PathImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 8;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__DATA = FXG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__X = FXG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__Y = FXG_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__ROTATION = FXG_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__SCALE_X = FXG_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__SCALE_Y = FXG_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Blend Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__BLEND_MODE = FXG_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__VISIBLE = FXG_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__ALPHA = FXG_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Winding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__WINDING = FXG_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__FILL = FXG_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__STROKE = FXG_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__FILTERS = FXG_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__TRANSFORM = FXG_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__MASK = FXG_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = FXG_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Shape <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Shape
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 9;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = FXG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RectImpl <em>Rect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.RectImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getRect()
	 * @generated
	 */
	int RECT = 10;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__WIDTH = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__HEIGHT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Radius X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__RADIUS_X = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Radius Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__RADIUS_Y = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Top Left Radius X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__TOP_LEFT_RADIUS_X = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Top Left Radius Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__TOP_LEFT_RADIUS_Y = SHAPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Top Right Radius X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__TOP_RIGHT_RADIUS_X = SHAPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Top Right Radius Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__TOP_RIGHT_RADIUS_Y = SHAPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bottom Left Radius X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__BOTTOM_LEFT_RADIUS_X = SHAPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Bottom Left Radius Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__BOTTOM_LEFT_RADIUS_Y = SHAPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Bottom Right Radius X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__BOTTOM_RIGHT_RADIUS_X = SHAPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Bottom Right Radius Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__BOTTOM_RIGHT_RADIUS_Y = SHAPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__X = SHAPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__Y = SHAPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__ROTATION = SHAPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__SCALE_X = SHAPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__SCALE_Y = SHAPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Blend Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__BLEND_MODE = SHAPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__VISIBLE = SHAPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__ALPHA = SHAPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__TRANSFORM = SHAPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__FILTERS = SHAPE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__FILL = SHAPE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__STROKE = SHAPE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT__MASK = SHAPE_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Rect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECT_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 25;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.EllipseImpl <em>Ellipse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.EllipseImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getEllipse()
	 * @generated
	 */
	int ELLIPSE = 11;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__ALPHA = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__WIDTH = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__HEIGHT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__X = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__Y = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__ROTATION = SHAPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__SCALE_X = SHAPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__SCALE_Y = SHAPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Blend Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__BLEND_MODE = SHAPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__VISIBLE = SHAPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__TRANSFORM = SHAPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FILTERS = SHAPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__FILL = SHAPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__STROKE = SHAPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE__MASK = SHAPE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Ellipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 12;

	/**
	 * The feature id for the '<em><b>XFrom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__XFROM = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YFrom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__YFROM = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XTo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__XTO = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>YTo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__YTO = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__X = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__Y = SHAPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ROTATION = SHAPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__SCALE_X = SHAPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__SCALE_Y = SHAPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Blend Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__BLEND_MODE = SHAPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ALPHA = SHAPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ID = SHAPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Mask Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__MASK_TYPE = SHAPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__VISIBLE = SHAPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__TRANSFORM = SHAPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__FILTERS = SHAPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__FILL = SHAPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__STROKE = SHAPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__MASK = SHAPE_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 19;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl <em>Rich Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getRichText()
	 * @generated
	 */
	int RICH_TEXT = 13;

	/**
	 * The feature id for the '<em><b>Text Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__TEXT_ALIGN = FXG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Align Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__TEXT_ALIGN_LAST = FXG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__TEXT_INDENT = FXG_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Paragraph Start Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__PARAGRAPH_START_INDENT = FXG_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Paragraph End Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__PARAGRAPH_END_INDENT = FXG_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Paragraph Space Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__PARAGRAPH_SPACE_BEFORE = FXG_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Paragraph Space After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__PARAGRAPH_SPACE_AFTER = FXG_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Justification Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__JUSTIFICATION_RULE = FXG_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Justification Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__JUSTIFICATION_STYLE = FXG_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Text Justify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__TEXT_JUSTIFY = FXG_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Leading Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__LEADING_MODEL = FXG_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Tab Stops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__TAB_STOPS = FXG_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Block Progression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__BLOCK_PROGRESSION = FXG_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Padding Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__PADDING_LEFT = FXG_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Padding Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__PADDING_RIGHT = FXG_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Padding Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__PADDING_TOP = FXG_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Padding Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__PADDING_BOTTOM = FXG_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Column Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__COLUMN_GAP = FXG_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Column Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__COLUMN_COUNT = FXG_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Column Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__COLUMN_WIDTH = FXG_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>First Baseline Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__FIRST_BASELINE_OFFSET = FXG_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Vertical Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__VERTICAL_ALIGN = FXG_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Line Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__LINE_BREAK = FXG_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__FONT_FAMILY = FXG_ELEMENT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__FONT_SIZE = FXG_ELEMENT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__FONT_STYLE = FXG_ELEMENT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__FONT_WEIGHT = FXG_ELEMENT_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Line Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__LINE_HEIGHT = FXG_ELEMENT_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Text Decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__TEXT_DECORATION = FXG_ELEMENT_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Line Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__LINE_THROUGH = FXG_ELEMENT_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__COLOR = FXG_ELEMENT_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Text Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__TEXT_ALPHA = FXG_ELEMENT_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>White Space Collapse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__WHITE_SPACE_COLLAPSE = FXG_ELEMENT_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Kerning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__KERNING = FXG_ELEMENT_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Background Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__BACKGROUND_ALPHA = FXG_ELEMENT_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__BACKGROUND_COLOR = FXG_ELEMENT_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Baseline Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__BASELINE_SHIFT = FXG_ELEMENT_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Break Opportunity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__BREAK_OPPORTUNITY = FXG_ELEMENT_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Digit Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__DIGIT_CASE = FXG_ELEMENT_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Digit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__DIGIT_WIDTH = FXG_ELEMENT_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__DOMINANT_BASELINE = FXG_ELEMENT_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Alignment Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__ALIGNMENT_BASELINE = FXG_ELEMENT_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Ligature Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__LIGATURE_LEVEL = FXG_ELEMENT_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__LOCALE = FXG_ELEMENT_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Typographic Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__TYPOGRAPHIC_CASE = FXG_ELEMENT_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Text Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__TEXT_ROTATION = FXG_ELEMENT_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Tracking Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__TRACKING_LEFT = FXG_ELEMENT_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Tracking Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__TRACKING_RIGHT = FXG_ELEMENT_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__ROTATION = FXG_ELEMENT_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__SCALE_X = FXG_ELEMENT_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__SCALE_Y = FXG_ELEMENT_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__X = FXG_ELEMENT_FEATURE_COUNT + 51;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__Y = FXG_ELEMENT_FEATURE_COUNT + 52;

	/**
	 * The feature id for the '<em><b>Blend Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__BLEND_MODE = FXG_ELEMENT_FEATURE_COUNT + 53;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__ALPHA = FXG_ELEMENT_FEATURE_COUNT + 54;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__ID = FXG_ELEMENT_FEATURE_COUNT + 55;

	/**
	 * The feature id for the '<em><b>Mask Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__MASK_TYPE = FXG_ELEMENT_FEATURE_COUNT + 56;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__VISIBLE = FXG_ELEMENT_FEATURE_COUNT + 57;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__WIDTH = FXG_ELEMENT_FEATURE_COUNT + 58;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__HEIGHT = FXG_ELEMENT_FEATURE_COUNT + 59;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__CONTENT = FXG_ELEMENT_FEATURE_COUNT + 60;

	/**
	 * The feature id for the '<em><b>tempcontent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT__TEMPCONTENT = FXG_ELEMENT_FEATURE_COUNT + 61;

	/**
	 * The number of structural features of the '<em>Rich Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_FEATURE_COUNT = FXG_ELEMENT_FEATURE_COUNT + 62;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContent <em>Rich Text Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContent
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getRichTextContent()
	 * @generated
	 */
	int RICH_TEXT_CONTENT = 14;

	/**
	 * The number of structural features of the '<em>Rich Text Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextContentContainerImpl <em>Rich Text Content Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextContentContainerImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getRichTextContentContainer()
	 * @generated
	 */
	int RICH_TEXT_CONTENT_CONTAINER = 15;

	/**
	 * The feature id for the '<em><b>children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_CONTENT_CONTAINER__CHILDREN = RICH_TEXT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rich Text Content Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_TEXT_CONTENT_CONTAINER_FEATURE_COUNT = RICH_TEXT_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes <em>Paragraph Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getParagraphAttributes()
	 * @generated
	 */
	int PARAGRAPH_ATTRIBUTES = 16;

	/**
	 * The feature id for the '<em><b>Text Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_ATTRIBUTES__TEXT_ALIGN = 0;

	/**
	 * The feature id for the '<em><b>Text Align Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_ATTRIBUTES__TEXT_ALIGN_LAST = 1;

	/**
	 * The feature id for the '<em><b>Text Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_ATTRIBUTES__TEXT_INDENT = 2;

	/**
	 * The feature id for the '<em><b>Paragraph Start Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_ATTRIBUTES__PARAGRAPH_START_INDENT = 3;

	/**
	 * The feature id for the '<em><b>Paragraph End Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_ATTRIBUTES__PARAGRAPH_END_INDENT = 4;

	/**
	 * The feature id for the '<em><b>Paragraph Space Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_ATTRIBUTES__PARAGRAPH_SPACE_BEFORE = 5;

	/**
	 * The feature id for the '<em><b>Paragraph Space After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_ATTRIBUTES__PARAGRAPH_SPACE_AFTER = 6;

	/**
	 * The feature id for the '<em><b>Justification Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_ATTRIBUTES__JUSTIFICATION_RULE = 7;

	/**
	 * The feature id for the '<em><b>Justification Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_ATTRIBUTES__JUSTIFICATION_STYLE = 8;

	/**
	 * The feature id for the '<em><b>Text Justify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_ATTRIBUTES__TEXT_JUSTIFY = 9;

	/**
	 * The feature id for the '<em><b>Leading Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_ATTRIBUTES__LEADING_MODEL = 10;

	/**
	 * The feature id for the '<em><b>Tab Stops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_ATTRIBUTES__TAB_STOPS = 11;

	/**
	 * The number of structural features of the '<em>Paragraph Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_ATTRIBUTES_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes <em>Container Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getContainerAttributes()
	 * @generated
	 */
	int CONTAINER_ATTRIBUTES = 17;

	/**
	 * The feature id for the '<em><b>Block Progression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ATTRIBUTES__BLOCK_PROGRESSION = 0;

	/**
	 * The feature id for the '<em><b>Padding Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ATTRIBUTES__PADDING_LEFT = 1;

	/**
	 * The feature id for the '<em><b>Padding Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ATTRIBUTES__PADDING_RIGHT = 2;

	/**
	 * The feature id for the '<em><b>Padding Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ATTRIBUTES__PADDING_TOP = 3;

	/**
	 * The feature id for the '<em><b>Padding Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ATTRIBUTES__PADDING_BOTTOM = 4;

	/**
	 * The feature id for the '<em><b>Column Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ATTRIBUTES__COLUMN_GAP = 5;

	/**
	 * The feature id for the '<em><b>Column Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ATTRIBUTES__COLUMN_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Column Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ATTRIBUTES__COLUMN_WIDTH = 7;

	/**
	 * The feature id for the '<em><b>First Baseline Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ATTRIBUTES__FIRST_BASELINE_OFFSET = 8;

	/**
	 * The feature id for the '<em><b>Vertical Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ATTRIBUTES__VERTICAL_ALIGN = 9;

	/**
	 * The feature id for the '<em><b>Line Break</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ATTRIBUTES__LINE_BREAK = 10;

	/**
	 * The number of structural features of the '<em>Container Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ATTRIBUTES_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes <em>Character Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getCharacterAttributes()
	 * @generated
	 */
	int CHARACTER_ATTRIBUTES = 18;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__FONT_FAMILY = 0;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__FONT_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__FONT_STYLE = 2;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__FONT_WEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Line Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__LINE_HEIGHT = 4;

	/**
	 * The feature id for the '<em><b>Text Decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__TEXT_DECORATION = 5;

	/**
	 * The feature id for the '<em><b>Line Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__LINE_THROUGH = 6;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__COLOR = 7;

	/**
	 * The feature id for the '<em><b>Text Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__TEXT_ALPHA = 8;

	/**
	 * The feature id for the '<em><b>White Space Collapse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__WHITE_SPACE_COLLAPSE = 9;

	/**
	 * The feature id for the '<em><b>Kerning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__KERNING = 10;

	/**
	 * The feature id for the '<em><b>Background Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__BACKGROUND_ALPHA = 11;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__BACKGROUND_COLOR = 12;

	/**
	 * The feature id for the '<em><b>Baseline Shift</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__BASELINE_SHIFT = 13;

	/**
	 * The feature id for the '<em><b>Break Opportunity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__BREAK_OPPORTUNITY = 14;

	/**
	 * The feature id for the '<em><b>Digit Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__DIGIT_CASE = 15;

	/**
	 * The feature id for the '<em><b>Digit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__DIGIT_WIDTH = 16;

	/**
	 * The feature id for the '<em><b>Dominant Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__DOMINANT_BASELINE = 17;

	/**
	 * The feature id for the '<em><b>Alignment Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__ALIGNMENT_BASELINE = 18;

	/**
	 * The feature id for the '<em><b>Ligature Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__LIGATURE_LEVEL = 19;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__LOCALE = 20;

	/**
	 * The feature id for the '<em><b>Typographic Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__TYPOGRAPHIC_CASE = 21;

	/**
	 * The feature id for the '<em><b>Text Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__TEXT_ROTATION = 22;

	/**
	 * The feature id for the '<em><b>Tracking Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__TRACKING_LEFT = 23;

	/**
	 * The feature id for the '<em><b>Tracking Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES__TRACKING_RIGHT = 24;

	/**
	 * The number of structural features of the '<em>Character Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_ATTRIBUTES_FEATURE_COUNT = 25;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.rawtextImpl <em>rawtext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.rawtextImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getrawtext()
	 * @generated
	 */
	int RAWTEXT = 19;

	/**
	 * The feature id for the '<em><b>text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAWTEXT__TEXT = RICH_TEXT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>rawtext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAWTEXT_FEATURE_COUNT = RICH_TEXT_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.divImpl <em>div</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.divImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getdiv()
	 * @generated
	 */
	int DIV = 20;

	/**
	 * The feature id for the '<em><b>children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV__CHILDREN = RICH_TEXT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>div</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_FEATURE_COUNT = RICH_TEXT_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.pImpl <em>p</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.pImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getp()
	 * @generated
	 */
	int P = 21;

	/**
	 * The feature id for the '<em><b>children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__CHILDREN = RICH_TEXT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__TEXT_ALIGN = RICH_TEXT_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text Align Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__TEXT_ALIGN_LAST = RICH_TEXT_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__TEXT_INDENT = RICH_TEXT_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Paragraph Start Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__PARAGRAPH_START_INDENT = RICH_TEXT_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Paragraph End Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__PARAGRAPH_END_INDENT = RICH_TEXT_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Paragraph Space Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__PARAGRAPH_SPACE_BEFORE = RICH_TEXT_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Paragraph Space After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__PARAGRAPH_SPACE_AFTER = RICH_TEXT_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Justification Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__JUSTIFICATION_RULE = RICH_TEXT_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Justification Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__JUSTIFICATION_STYLE = RICH_TEXT_CONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Text Justify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__TEXT_JUSTIFY = RICH_TEXT_CONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Leading Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__LEADING_MODEL = RICH_TEXT_CONTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Tab Stops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P__TAB_STOPS = RICH_TEXT_CONTENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>p</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int P_FEATURE_COUNT = RICH_TEXT_CONTENT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.tcyImpl <em>tcy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.tcyImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#gettcy()
	 * @generated
	 */
	int TCY = 22;

	/**
	 * The feature id for the '<em><b>children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCY__CHILDREN = RICH_TEXT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>tcy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCY_FEATURE_COUNT = RICH_TEXT_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.aImpl <em>a</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.aImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#geta()
	 * @generated
	 */
	int A = 23;

	/**
	 * The feature id for the '<em><b>children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A__CHILDREN = RICH_TEXT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>a</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int A_FEATURE_COUNT = RICH_TEXT_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.imgImpl <em>img</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.imgImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getimg()
	 * @generated
	 */
	int IMG = 24;

	/**
	 * The number of structural features of the '<em>img</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_FEATURE_COUNT = RICH_TEXT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.spanImpl <em>span</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.spanImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getspan()
	 * @generated
	 */
	int SPAN = 25;

	/**
	 * The feature id for the '<em><b>children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__CHILDREN = RICH_TEXT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_FEATURE_COUNT = RICH_TEXT_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.brImpl <em>br</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.brImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getbr()
	 * @generated
	 */
	int BR = 26;

	/**
	 * The number of structural features of the '<em>br</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_FEATURE_COUNT = RICH_TEXT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.tabImpl <em>tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.tabImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#gettab()
	 * @generated
	 */
	int TAB = 27;

	/**
	 * The number of structural features of the '<em>tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FEATURE_COUNT = RICH_TEXT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.linkNormalFormatImpl <em>link Normal Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.linkNormalFormatImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getlinkNormalFormat()
	 * @generated
	 */
	int LINK_NORMAL_FORMAT = 28;

	/**
	 * The number of structural features of the '<em>link Normal Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_NORMAL_FORMAT_FEATURE_COUNT = RICH_TEXT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.linkHoverFormatImpl <em>link Hover Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.linkHoverFormatImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getlinkHoverFormat()
	 * @generated
	 */
	int LINK_HOVER_FORMAT = 29;

	/**
	 * The number of structural features of the '<em>link Hover Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HOVER_FORMAT_FEATURE_COUNT = RICH_TEXT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.linkActiveFormatImpl <em>link Active Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.linkActiveFormatImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getlinkActiveFormat()
	 * @generated
	 */
	int LINK_ACTIVE_FORMAT = 30;

	/**
	 * The number of structural features of the '<em>link Active Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ACTIVE_FORMAT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapImageImpl <em>Bitmap Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapImageImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getBitmapImage()
	 * @generated
	 */
	int BITMAP_IMAGE = 31;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_IMAGE__X = FXG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_IMAGE__Y = FXG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_IMAGE__WIDTH = FXG_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_IMAGE__HEIGHT = FXG_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_IMAGE__ROTATION = FXG_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_IMAGE__SCALE_X = FXG_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_IMAGE__SCALE_Y = FXG_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fill Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_IMAGE__FILL_MODE = FXG_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_IMAGE__SOURCE = FXG_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_IMAGE__VISIBLE = FXG_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_IMAGE__ALPHA = FXG_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Blend Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_IMAGE__BLEND_MODE = FXG_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Bitmap Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_IMAGE_FEATURE_COUNT = FXG_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Fill <em>Fill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Fill
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getFill()
	 * @generated
	 */
	int FILL = 32;

	/**
	 * The number of structural features of the '<em>Fill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILL_FEATURE_COUNT = FXG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.SolidColorImpl <em>Solid Color</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.SolidColorImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getSolidColor()
	 * @generated
	 */
	int SOLID_COLOR = 33;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_COLOR__ALPHA = FILL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_COLOR__COLOR = FILL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Solid Color</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_COLOR_FEATURE_COUNT = FILL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LinearGradientImpl <em>Linear Gradient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.LinearGradientImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getLinearGradient()
	 * @generated
	 */
	int LINEAR_GRADIENT = 34;

	/**
	 * The feature id for the '<em><b>children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__CHILDREN = FILL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__X = FILL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__Y = FILL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__SCALE_X = FILL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__ROTATION = FILL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Spread Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__SPREAD_METHOD = FILL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interpolation Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__INTERPOLATION_METHOD = FILL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT__MATRIX = FILL_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Linear Gradient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_FEATURE_COUNT = FILL_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientImpl <em>Radial Gradient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getRadialGradient()
	 * @generated
	 */
	int RADIAL_GRADIENT = 35;

	/**
	 * The feature id for the '<em><b>children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT__CHILDREN = FILL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT__X = FILL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT__Y = FILL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT__SCALE_X = FILL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT__SCALE_Y = FILL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT__ROTATION = FILL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Spread Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT__SPREAD_METHOD = FILL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Interpolation Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT__INTERPOLATION_METHOD = FILL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Focal Point Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT__FOCAL_POINT_RATIO = FILL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT__MATRIX = FILL_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Radial Gradient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_FEATURE_COUNT = FILL_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapFillImpl <em>Bitmap Fill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapFillImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getBitmapFill()
	 * @generated
	 */
	int BITMAP_FILL = 36;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_FILL__X = FILL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_FILL__Y = FILL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_FILL__SCALE_X = FILL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_FILL__SCALE_Y = FILL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_FILL__ROTATION = FILL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_FILL__SOURCE = FILL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fill Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_FILL__FILL_MODE = FILL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_FILL__MATRIX = FILL_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Bitmap Fill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_FILL_FEATURE_COUNT = FILL_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Stroke <em>Stroke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Stroke
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getStroke()
	 * @generated
	 */
	int STROKE = 37;

	/**
	 * The number of structural features of the '<em>Stroke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STROKE_FEATURE_COUNT = FXG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.SolidColorStrokeImpl <em>Solid Color Stroke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.SolidColorStrokeImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getSolidColorStroke()
	 * @generated
	 */
	int SOLID_COLOR_STROKE = 38;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_COLOR_STROKE__ALPHA = STROKE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Caps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_COLOR_STROKE__CAPS = STROKE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_COLOR_STROKE__COLOR = STROKE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Joints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_COLOR_STROKE__JOINTS = STROKE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_COLOR_STROKE__MITER_LIMIT = STROKE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pixel Hinting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_COLOR_STROKE__PIXEL_HINTING = STROKE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scale Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_COLOR_STROKE__SCALE_MODE = STROKE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_COLOR_STROKE__WEIGHT = STROKE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Solid Color Stroke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_COLOR_STROKE_FEATURE_COUNT = STROKE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LinearGradientStrokeImpl <em>Linear Gradient Stroke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.LinearGradientStrokeImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getLinearGradientStroke()
	 * @generated
	 */
	int LINEAR_GRADIENT_STROKE = 39;

	/**
	 * The feature id for the '<em><b>children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_STROKE__CHILDREN = STROKE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_STROKE__X = STROKE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_STROKE__Y = STROKE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_STROKE__SCALE_X = STROKE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_STROKE__ROTATION = STROKE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Spread Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_STROKE__SPREAD_METHOD = STROKE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interpolation Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_STROKE__INTERPOLATION_METHOD = STROKE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Scale Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_STROKE__SCALE_MODE = STROKE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Caps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_STROKE__CAPS = STROKE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Joints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_STROKE__JOINTS = STROKE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_STROKE__MITER_LIMIT = STROKE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_STROKE__WEIGHT = STROKE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pixel Hinting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_STROKE__PIXEL_HINTING = STROKE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_STROKE__MATRIX = STROKE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Linear Gradient Stroke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_GRADIENT_STROKE_FEATURE_COUNT = STROKE_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl <em>Radial Gradient Stroke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getRadialGradientStroke()
	 * @generated
	 */
	int RADIAL_GRADIENT_STROKE = 40;

	/**
	 * The feature id for the '<em><b>children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_STROKE__CHILDREN = STROKE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_STROKE__X = STROKE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_STROKE__Y = STROKE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_STROKE__SCALE_X = STROKE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_STROKE__SCALE_Y = STROKE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_STROKE__ROTATION = STROKE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Spread Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_STROKE__SPREAD_METHOD = STROKE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Interpolation Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_STROKE__INTERPOLATION_METHOD = STROKE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Focal Point Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_STROKE__FOCAL_POINT_RATIO = STROKE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Scale Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_STROKE__SCALE_MODE = STROKE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Caps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_STROKE__CAPS = STROKE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Joints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_STROKE__JOINTS = STROKE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_STROKE__MITER_LIMIT = STROKE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_STROKE__WEIGHT = STROKE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Pixel Hinting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_STROKE__PIXEL_HINTING = STROKE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_STROKE__MATRIX = STROKE_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Radial Gradient Stroke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIAL_GRADIENT_STROKE_FEATURE_COUNT = STROKE_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GradientEntryImpl <em>Gradient Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.GradientEntryImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getGradientEntry()
	 * @generated
	 */
	int GRADIENT_ENTRY = 41;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_ENTRY__COLOR = FXG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_ENTRY__ALPHA = FXG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_ENTRY__RATIO = FXG_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gradient Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_ENTRY_FEATURE_COUNT = FXG_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.ColorTransformImpl <em>Color Transform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.ColorTransformImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getColorTransform()
	 * @generated
	 */
	int COLOR_TRANSFORM = 42;

	/**
	 * The feature id for the '<em><b>Alpha Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_TRANSFORM__ALPHA_MULTIPLIER = FXG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alpha Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_TRANSFORM__ALPHA_OFFSET = FXG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blue Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_TRANSFORM__BLUE_MULTIPLIER = FXG_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Blue Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_TRANSFORM__BLUE_OFFSET = FXG_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Green Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_TRANSFORM__GREEN_MULTIPLIER = FXG_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Green Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_TRANSFORM__GREEN_OFFSET = FXG_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Red Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_TRANSFORM__RED_MULTIPLIER = FXG_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Red Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_TRANSFORM__RED_OFFSET = FXG_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Color Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_TRANSFORM_FEATURE_COUNT = FXG_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Filter <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Filter
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 43;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = FXG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BlurFilterImpl <em>Blur Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.BlurFilterImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getBlurFilter()
	 * @generated
	 */
	int BLUR_FILTER = 44;

	/**
	 * The feature id for the '<em><b>Blur X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUR_FILTER__BLUR_X = FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blur Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUR_FILTER__BLUR_Y = FILTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUR_FILTER__QUALITY = FILTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Blur Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUR_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.DropShadowFilterImpl <em>Drop Shadow Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.DropShadowFilterImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getDropShadowFilter()
	 * @generated
	 */
	int DROP_SHADOW_FILTER = 45;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SHADOW_FILTER__ALPHA = FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SHADOW_FILTER__ANGLE = FILTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blur X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SHADOW_FILTER__BLUR_X = FILTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Blur Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SHADOW_FILTER__BLUR_Y = FILTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SHADOW_FILTER__COLOR = FILTER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SHADOW_FILTER__DISTANCE = FILTER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SHADOW_FILTER__INNER = FILTER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Hide Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SHADOW_FILTER__HIDE_OBJECT = FILTER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Knockout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SHADOW_FILTER__KNOCKOUT = FILTER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SHADOW_FILTER__QUALITY = FILTER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SHADOW_FILTER__STRENGTH = FILTER_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Drop Shadow Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_SHADOW_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BevelFilterImpl <em>Bevel Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.BevelFilterImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getBevelFilter()
	 * @generated
	 */
	int BEVEL_FILTER = 46;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEVEL_FILTER__ANGLE = FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blur X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEVEL_FILTER__BLUR_X = FILTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blur Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEVEL_FILTER__BLUR_Y = FILTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Highlight Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEVEL_FILTER__HIGHLIGHT_ALPHA = FILTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Highlight Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEVEL_FILTER__HIGHLIGHT_COLOR = FILTER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEVEL_FILTER__DISTANCE = FILTER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Knockout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEVEL_FILTER__KNOCKOUT = FILTER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEVEL_FILTER__QUALITY = FILTER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Shadow Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEVEL_FILTER__SHADOW_ALPHA = FILTER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Shadow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEVEL_FILTER__SHADOW_COLOR = FILTER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEVEL_FILTER__STRENGTH = FILTER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEVEL_FILTER__TYPE = FILTER_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Bevel Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEVEL_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GradientGlowFilterImpl <em>Gradient Glow Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.GradientGlowFilterImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getGradientGlowFilter()
	 * @generated
	 */
	int GRADIENT_GLOW_FILTER = 47;

	/**
	 * The feature id for the '<em><b>children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_GLOW_FILTER__CHILDREN = FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_GLOW_FILTER__ANGLE = FILTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blur X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_GLOW_FILTER__BLUR_X = FILTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Blur Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_GLOW_FILTER__BLUR_Y = FILTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_GLOW_FILTER__DISTANCE = FILTER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_GLOW_FILTER__INNER = FILTER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Knockout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_GLOW_FILTER__KNOCKOUT = FILTER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_GLOW_FILTER__QUALITY = FILTER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_GLOW_FILTER__STRENGTH = FILTER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Gradient Glow Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_GLOW_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GradientBevelFilterImpl <em>Gradient Bevel Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.GradientBevelFilterImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getGradientBevelFilter()
	 * @generated
	 */
	int GRADIENT_BEVEL_FILTER = 48;

	/**
	 * The feature id for the '<em><b>children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BEVEL_FILTER__CHILDREN = FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BEVEL_FILTER__ANGLE = FILTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blur X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BEVEL_FILTER__BLUR_X = FILTER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Blur Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BEVEL_FILTER__BLUR_Y = FILTER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BEVEL_FILTER__DISTANCE = FILTER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Knockout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BEVEL_FILTER__KNOCKOUT = FILTER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Quality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BEVEL_FILTER__QUALITY = FILTER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BEVEL_FILTER__STRENGTH = FILTER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BEVEL_FILTER__TYPE = FILTER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Gradient Bevel Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADIENT_BEVEL_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.ColorMatrixFilterImpl <em>Color Matrix Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.ColorMatrixFilterImpl
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getColorMatrixFilter()
	 * @generated
	 */
	int COLOR_MATRIX_FILTER = 49;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_MATRIX_FILTER__MATRIX = FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Color Matrix Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_MATRIX_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BlendMode <em>Blend Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BlendMode
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getBlendMode()
	 * @generated
	 */
	int BLEND_MODE = 52;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Winding <em>Winding</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Winding
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getWinding()
	 * @generated
	 */
	int WINDING = 53;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.MaskType <em>Mask Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.MaskType
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getMaskType()
	 * @generated
	 */
	int MASK_TYPE = 54;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.FontStyle <em>Font Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FontStyle
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getFontStyle()
	 * @generated
	 */
	int FONT_STYLE = 55;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.FontWeight <em>Font Weight</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FontWeight
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getFontWeight()
	 * @generated
	 */
	int FONT_WEIGHT = 56;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.TextDecoration <em>Text Decoration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TextDecoration
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getTextDecoration()
	 * @generated
	 */
	int TEXT_DECORATION = 57;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.WhitespaceCollapse <em>Whitespace Collapse</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.WhitespaceCollapse
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getWhitespaceCollapse()
	 * @generated
	 */
	int WHITESPACE_COLLAPSE = 58;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Kerning <em>Kerning</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Kerning
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getKerning()
	 * @generated
	 */
	int KERNING = 59;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SpreadMethod <em>Spread Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.SpreadMethod
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getSpreadMethod()
	 * @generated
	 */
	int SPREAD_METHOD = 60;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.InterpolationMethod <em>Interpolation Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.InterpolationMethod
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getInterpolationMethod()
	 * @generated
	 */
	int INTERPOLATION_METHOD = 61;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Cap <em>Cap</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Cap
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getCap()
	 * @generated
	 */
	int CAP = 62;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Joint <em>Joint</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Joint
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getJoint()
	 * @generated
	 */
	int JOINT = 63;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ScaleMode <em>Scale Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ScaleMode
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getScaleMode()
	 * @generated
	 */
	int SCALE_MODE = 64;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilterType <em>Bevel Filter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilterType
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getBevelFilterType()
	 * @generated
	 */
	int BEVEL_FILTER_TYPE = 65;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.FillMode <em>Fill Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FillMode
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getFillMode()
	 * @generated
	 */
	int FILL_MODE = 66;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.TextAlign <em>Text Align</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TextAlign
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getTextAlign()
	 * @generated
	 */
	int TEXT_ALIGN = 67;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.JustificationRule <em>Justification Rule</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.JustificationRule
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getJustificationRule()
	 * @generated
	 */
	int JUSTIFICATION_RULE = 68;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.JustificationStyle <em>Justification Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.JustificationStyle
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getJustificationStyle()
	 * @generated
	 */
	int JUSTIFICATION_STYLE = 69;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.TextJustify <em>Text Justify</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TextJustify
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getTextJustify()
	 * @generated
	 */
	int TEXT_JUSTIFY = 70;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LeadingModel <em>Leading Model</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LeadingModel
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getLeadingModel()
	 * @generated
	 */
	int LEADING_MODEL = 71;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BlockProgression <em>Block Progression</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BlockProgression
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getBlockProgression()
	 * @generated
	 */
	int BLOCK_PROGRESSION = 72;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.VerticalAlign <em>Vertical Align</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.VerticalAlign
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getVerticalAlign()
	 * @generated
	 */
	int VERTICAL_ALIGN = 73;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LineBreak <em>Line Break</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LineBreak
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getLineBreak()
	 * @generated
	 */
	int LINE_BREAK = 74;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BreakOpportunity <em>Break Opportunity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BreakOpportunity
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getBreakOpportunity()
	 * @generated
	 */
	int BREAK_OPPORTUNITY = 75;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DigitCase <em>Digit Case</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DigitCase
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getDigitCase()
	 * @generated
	 */
	int DIGIT_CASE = 76;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DigitWidth <em>Digit Width</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DigitWidth
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getDigitWidth()
	 * @generated
	 */
	int DIGIT_WIDTH = 77;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DominantBaseline <em>Dominant Baseline</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DominantBaseline
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getDominantBaseline()
	 * @generated
	 */
	int DOMINANT_BASELINE = 78;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.AlignmentBaseline <em>Alignment Baseline</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.AlignmentBaseline
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getAlignmentBaseline()
	 * @generated
	 */
	int ALIGNMENT_BASELINE = 79;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LigatureLevel <em>Ligature Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LigatureLevel
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getLigatureLevel()
	 * @generated
	 */
	int LIGATURE_LEVEL = 80;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.TypographicCase <em>Typographic Case</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TypographicCase
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getTypographicCase()
	 * @generated
	 */
	int TYPOGRAPHIC_CASE = 81;

	/**
	 * The meta object id for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.TextRotation <em>Text Rotation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TextRotation
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getTextRotation()
	 * @generated
	 */
	int TEXT_ROTATION = 82;

	/**
	 * The meta object id for the '<em>Path Data</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getPathData()
	 * @generated
	 */
	int PATH_DATA = 83;

	/**
	 * The meta object id for the '<em>Angle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getAngle()
	 * @generated
	 */
	int ANGLE = 84;

	/**
	 * The meta object id for the '<em>Length</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 85;

	/**
	 * The meta object id for the '<em>Percent</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getPercent()
	 * @generated
	 */
	int PERCENT = 86;

	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 87;

	/**
	 * The meta object id for the '<em>Alpha</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getAlpha()
	 * @generated
	 */
	int ALPHA = 88;


	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Graphic <em>Graphic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphic</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Graphic
	 * @generated
	 */
	EClass getGraphic();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Graphic#getScaleGridLeft <em>Scale Grid Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Grid Left</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Graphic#getScaleGridLeft()
	 * @see #getGraphic()
	 * @generated
	 */
	EAttribute getGraphic_ScaleGridLeft();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Graphic#getScaleGridRight <em>Scale Grid Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Grid Right</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Graphic#getScaleGridRight()
	 * @see #getGraphic()
	 * @generated
	 */
	EAttribute getGraphic_ScaleGridRight();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Graphic#getScaleGridTop <em>Scale Grid Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Grid Top</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Graphic#getScaleGridTop()
	 * @see #getGraphic()
	 * @generated
	 */
	EAttribute getGraphic_ScaleGridTop();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Graphic#getScaleGridBottom <em>Scale Grid Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Grid Bottom</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Graphic#getScaleGridBottom()
	 * @see #getGraphic()
	 * @generated
	 */
	EAttribute getGraphic_ScaleGridBottom();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Graphic#getViewWidth <em>View Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Width</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Graphic#getViewWidth()
	 * @see #getGraphic()
	 * @generated
	 */
	EAttribute getGraphic_ViewWidth();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Graphic#getViewHeight <em>View Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Height</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Graphic#getViewHeight()
	 * @see #getGraphic()
	 * @generated
	 */
	EAttribute getGraphic_ViewHeight();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Graphic#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Graphic#getVersion()
	 * @see #getGraphic()
	 * @generated
	 */
	EAttribute getGraphic_Version();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Graphic#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mask</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Graphic#getMask()
	 * @see #getGraphic()
	 * @generated
	 */
	EReference getGraphic_Mask();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Private <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Private
	 * @generated
	 */
	EClass getPrivate();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Definition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Definition#getName()
	 * @see #getDefinition()
	 * @generated
	 */
	EAttribute getDefinition_Name();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group#getRotation()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group#getScaleX <em>Scale X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group#getScaleX()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_ScaleX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group#getScaleY <em>Scale Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group#getScaleY()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_ScaleY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group#getX()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_X();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group#getY()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Y();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group#getBlendMode <em>Blend Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blend Mode</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group#getBlendMode()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_BlendMode();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group#getAlpha()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group#getId()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Id();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group#getTransformX <em>Transform X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group#getTransformX()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_TransformX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group#getTransformY <em>Transform Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transform Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group#getTransformY()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_TransformY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group#getMaskType <em>Mask Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask Type</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group#getMaskType()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_MaskType();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group#getVisible()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Visible();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group#getScaleGridLeft <em>Scale Grid Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Grid Left</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group#getScaleGridLeft()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_ScaleGridLeft();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group#getScaleGridRight <em>Scale Grid Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Grid Right</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group#getScaleGridRight()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_ScaleGridRight();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group#getScaleGridTop <em>Scale Grid Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Grid Top</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group#getScaleGridTop()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_ScaleGridTop();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group#getScaleGridBottom <em>Scale Grid Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Grid Bottom</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group#getScaleGridBottom()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_ScaleGridBottom();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group#getTransform()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Transform();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group#getFilters()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Filters();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Transform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Transform
	 * @generated
	 */
	EClass getTransform();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Transform#getMatrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Matrix</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Transform#getMatrix()
	 * @see #getTransform()
	 * @generated
	 */
	EReference getTransform_Matrix();

	/**
	 * Returns the meta object for the reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Transform#getColorTransform <em>Color Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Color Transform</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Transform#getColorTransform()
	 * @see #getTransform()
	 * @generated
	 */
	EReference getTransform_ColorTransform();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject <em>Place Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Object</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject
	 * @generated
	 */
	EClass getPlaceObject();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject#getId()
	 * @see #getPlaceObject()
	 * @generated
	 */
	EAttribute getPlaceObject_Id();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject#getTransform()
	 * @see #getPlaceObject()
	 * @generated
	 */
	EReference getPlaceObject_Transform();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject#getFilters()
	 * @see #getPlaceObject()
	 * @generated
	 */
	EReference getPlaceObject_Filters();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mask</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject#getMask()
	 * @see #getPlaceObject()
	 * @generated
	 */
	EReference getPlaceObject_Mask();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Matrix
	 * @generated
	 */
	EClass getMatrix();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Matrix#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>A</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Matrix#getA()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_A();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Matrix#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Matrix#getB()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_B();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Matrix#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>C</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Matrix#getC()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_C();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Matrix#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>D</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Matrix#getD()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_D();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Matrix#getTx <em>Tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Matrix#getTx()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Tx();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Matrix#getTy <em>Ty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ty</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Matrix#getTy()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Ty();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Path#getData()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Data();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Path#getX()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_X();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Path#getY()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Y();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Path#getRotation()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getScaleX <em>Scale X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Path#getScaleX()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_ScaleX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getScaleY <em>Scale Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Path#getScaleY()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_ScaleY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getBlendMode <em>Blend Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blend Mode</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Path#getBlendMode()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_BlendMode();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Path#getVisible()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Visible();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Path#getAlpha()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getWinding <em>Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Winding</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Path#getWinding()
	 * @see #getPath()
	 * @generated
	 */
	EAttribute getPath_Winding();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fill</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Path#getFill()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Fill();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stroke</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Path#getStroke()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Stroke();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Path#getFilters()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Filters();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Path#getTransform()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Transform();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mask</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Path#getMask()
	 * @see #getPath()
	 * @generated
	 */
	EReference getPath_Mask();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect <em>Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rect</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect
	 * @generated
	 */
	EClass getRect();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getWidth()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_Width();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getHeight()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_Height();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getRadiusX <em>Radius X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getRadiusX()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_RadiusX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getRadiusY <em>Radius Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getRadiusY()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_RadiusY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTopLeftRadiusX <em>Top Left Radius X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Left Radius X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTopLeftRadiusX()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_TopLeftRadiusX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTopLeftRadiusY <em>Top Left Radius Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Left Radius Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTopLeftRadiusY()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_TopLeftRadiusY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTopRightRadiusX <em>Top Right Radius X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Right Radius X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTopRightRadiusX()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_TopRightRadiusX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTopRightRadiusY <em>Top Right Radius Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Right Radius Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTopRightRadiusY()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_TopRightRadiusY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBottomLeftRadiusX <em>Bottom Left Radius X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom Left Radius X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBottomLeftRadiusX()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_BottomLeftRadiusX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBottomLeftRadiusY <em>Bottom Left Radius Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom Left Radius Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBottomLeftRadiusY()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_BottomLeftRadiusY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBottomRightRadiusX <em>Bottom Right Radius X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom Right Radius X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBottomRightRadiusX()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_BottomRightRadiusX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBottomRightRadiusY <em>Bottom Right Radius Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom Right Radius Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBottomRightRadiusY()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_BottomRightRadiusY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getX()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_X();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getY()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_Y();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getRotation()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getScaleX <em>Scale X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getScaleX()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_ScaleX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getScaleY <em>Scale Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getScaleY()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_ScaleY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBlendMode <em>Blend Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blend Mode</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBlendMode()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_BlendMode();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getVisible()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_Visible();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getAlpha()
	 * @see #getRect()
	 * @generated
	 */
	EAttribute getRect_Alpha();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTransform()
	 * @see #getRect()
	 * @generated
	 */
	EReference getRect_Transform();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getFilters()
	 * @see #getRect()
	 * @generated
	 */
	EReference getRect_Filters();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fill</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getFill()
	 * @see #getRect()
	 * @generated
	 */
	EReference getRect_Fill();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stroke</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getStroke()
	 * @see #getRect()
	 * @generated
	 */
	EReference getRect_Stroke();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mask</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getMask()
	 * @see #getRect()
	 * @generated
	 */
	EReference getRect_Mask();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ellipse</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse
	 * @generated
	 */
	EClass getEllipse();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getAlpha()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getWidth()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_Width();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getHeight()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_Height();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getX()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_X();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getY()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_Y();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getRotation()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getScaleX <em>Scale X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getScaleX()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_ScaleX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getScaleY <em>Scale Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getScaleY()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_ScaleY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getBlendMode <em>Blend Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blend Mode</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getBlendMode()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_BlendMode();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getVisible()
	 * @see #getEllipse()
	 * @generated
	 */
	EAttribute getEllipse_Visible();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getTransform()
	 * @see #getEllipse()
	 * @generated
	 */
	EReference getEllipse_Transform();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getFilters()
	 * @see #getEllipse()
	 * @generated
	 */
	EReference getEllipse_Filters();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fill</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getFill()
	 * @see #getEllipse()
	 * @generated
	 */
	EReference getEllipse_Fill();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stroke</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getStroke()
	 * @see #getEllipse()
	 * @generated
	 */
	EReference getEllipse_Stroke();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mask</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse#getMask()
	 * @see #getEllipse()
	 * @generated
	 */
	EReference getEllipse_Mask();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line#getXFrom <em>XFrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XFrom</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line#getXFrom()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_XFrom();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line#getYFrom <em>YFrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YFrom</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line#getYFrom()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_YFrom();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line#getXTo <em>XTo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XTo</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line#getXTo()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_XTo();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line#getYTo <em>YTo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YTo</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line#getYTo()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_YTo();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line#getX()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_X();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line#getY()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Y();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line#getRotation()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line#getScaleX <em>Scale X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line#getScaleX()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_ScaleX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line#getScaleY <em>Scale Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line#getScaleY()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_ScaleY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line#getBlendMode <em>Blend Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blend Mode</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line#getBlendMode()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_BlendMode();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line#getAlpha()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line#getId()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Id();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line#getMaskType <em>Mask Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask Type</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line#getMaskType()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_MaskType();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line#getVisible()
	 * @see #getLine()
	 * @generated
	 */
	EAttribute getLine_Visible();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line#getTransform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transform</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line#getTransform()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Transform();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line#getFilters()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Filters();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fill</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line#getFill()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Fill();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stroke</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line#getStroke()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Stroke();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mask</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line#getMask()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Mask();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText <em>Rich Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich Text</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichText
	 * @generated
	 */
	EClass getRichText();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getRotation()
	 * @see #getRichText()
	 * @generated
	 */
	EAttribute getRichText_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getScaleX <em>Scale X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getScaleX()
	 * @see #getRichText()
	 * @generated
	 */
	EAttribute getRichText_ScaleX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getScaleY <em>Scale Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getScaleY()
	 * @see #getRichText()
	 * @generated
	 */
	EAttribute getRichText_ScaleY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getX()
	 * @see #getRichText()
	 * @generated
	 */
	EAttribute getRichText_X();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getY()
	 * @see #getRichText()
	 * @generated
	 */
	EAttribute getRichText_Y();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getBlendMode <em>Blend Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blend Mode</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getBlendMode()
	 * @see #getRichText()
	 * @generated
	 */
	EAttribute getRichText_BlendMode();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getAlpha()
	 * @see #getRichText()
	 * @generated
	 */
	EAttribute getRichText_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getId()
	 * @see #getRichText()
	 * @generated
	 */
	EAttribute getRichText_Id();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getMaskType <em>Mask Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask Type</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getMaskType()
	 * @see #getRichText()
	 * @generated
	 */
	EAttribute getRichText_MaskType();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getVisible()
	 * @see #getRichText()
	 * @generated
	 */
	EAttribute getRichText_Visible();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getWidth()
	 * @see #getRichText()
	 * @generated
	 */
	EAttribute getRichText_Width();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getHeight()
	 * @see #getRichText()
	 * @generated
	 */
	EAttribute getRichText_Height();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getContent()
	 * @see #getRichText()
	 * @generated
	 */
	EReference getRichText_Content();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#get_tempcontent <em>tempcontent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>tempcontent</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichText#get_tempcontent()
	 * @see #getRichText()
	 * @generated
	 */
	EAttribute getRichText__tempcontent();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContent <em>Rich Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich Text Content</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContent
	 * @generated
	 */
	EClass getRichTextContent();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContentContainer <em>Rich Text Content Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich Text Content Container</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContentContainer
	 * @generated
	 */
	EClass getRichTextContentContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContentContainer#get_children <em>children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>children</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContentContainer#get_children()
	 * @see #getRichTextContentContainer()
	 * @generated
	 */
	EReference getRichTextContentContainer__children();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes <em>Paragraph Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph Attributes</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes
	 * @generated
	 */
	EClass getParagraphAttributes();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTextAlign <em>Text Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Align</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTextAlign()
	 * @see #getParagraphAttributes()
	 * @generated
	 */
	EAttribute getParagraphAttributes_TextAlign();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTextAlignLast <em>Text Align Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Align Last</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTextAlignLast()
	 * @see #getParagraphAttributes()
	 * @generated
	 */
	EAttribute getParagraphAttributes_TextAlignLast();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTextIndent <em>Text Indent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Indent</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTextIndent()
	 * @see #getParagraphAttributes()
	 * @generated
	 */
	EAttribute getParagraphAttributes_TextIndent();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getParagraphStartIndent <em>Paragraph Start Indent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paragraph Start Indent</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getParagraphStartIndent()
	 * @see #getParagraphAttributes()
	 * @generated
	 */
	EAttribute getParagraphAttributes_ParagraphStartIndent();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getParagraphEndIndent <em>Paragraph End Indent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paragraph End Indent</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getParagraphEndIndent()
	 * @see #getParagraphAttributes()
	 * @generated
	 */
	EAttribute getParagraphAttributes_ParagraphEndIndent();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getParagraphSpaceBefore <em>Paragraph Space Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paragraph Space Before</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getParagraphSpaceBefore()
	 * @see #getParagraphAttributes()
	 * @generated
	 */
	EAttribute getParagraphAttributes_ParagraphSpaceBefore();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getParagraphSpaceAfter <em>Paragraph Space After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paragraph Space After</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getParagraphSpaceAfter()
	 * @see #getParagraphAttributes()
	 * @generated
	 */
	EAttribute getParagraphAttributes_ParagraphSpaceAfter();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getJustificationRule <em>Justification Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justification Rule</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getJustificationRule()
	 * @see #getParagraphAttributes()
	 * @generated
	 */
	EAttribute getParagraphAttributes_JustificationRule();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getJustificationStyle <em>Justification Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justification Style</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getJustificationStyle()
	 * @see #getParagraphAttributes()
	 * @generated
	 */
	EAttribute getParagraphAttributes_JustificationStyle();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTextJustify <em>Text Justify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Justify</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTextJustify()
	 * @see #getParagraphAttributes()
	 * @generated
	 */
	EAttribute getParagraphAttributes_TextJustify();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getLeadingModel <em>Leading Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leading Model</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getLeadingModel()
	 * @see #getParagraphAttributes()
	 * @generated
	 */
	EAttribute getParagraphAttributes_LeadingModel();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTabStops <em>Tab Stops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tab Stops</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTabStops()
	 * @see #getParagraphAttributes()
	 * @generated
	 */
	EAttribute getParagraphAttributes_TabStops();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes <em>Container Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Attributes</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes
	 * @generated
	 */
	EClass getContainerAttributes();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getBlockProgression <em>Block Progression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Progression</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getBlockProgression()
	 * @see #getContainerAttributes()
	 * @generated
	 */
	EAttribute getContainerAttributes_BlockProgression();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getPaddingLeft <em>Padding Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Padding Left</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getPaddingLeft()
	 * @see #getContainerAttributes()
	 * @generated
	 */
	EAttribute getContainerAttributes_PaddingLeft();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getPaddingRight <em>Padding Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Padding Right</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getPaddingRight()
	 * @see #getContainerAttributes()
	 * @generated
	 */
	EAttribute getContainerAttributes_PaddingRight();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getPaddingTop <em>Padding Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Padding Top</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getPaddingTop()
	 * @see #getContainerAttributes()
	 * @generated
	 */
	EAttribute getContainerAttributes_PaddingTop();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getPaddingBottom <em>Padding Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Padding Bottom</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getPaddingBottom()
	 * @see #getContainerAttributes()
	 * @generated
	 */
	EAttribute getContainerAttributes_PaddingBottom();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getColumnGap <em>Column Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Gap</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getColumnGap()
	 * @see #getContainerAttributes()
	 * @generated
	 */
	EAttribute getContainerAttributes_ColumnGap();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getColumnCount <em>Column Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Count</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getColumnCount()
	 * @see #getContainerAttributes()
	 * @generated
	 */
	EAttribute getContainerAttributes_ColumnCount();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getColumnWidth <em>Column Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Width</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getColumnWidth()
	 * @see #getContainerAttributes()
	 * @generated
	 */
	EAttribute getContainerAttributes_ColumnWidth();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getFirstBaselineOffset <em>First Baseline Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Baseline Offset</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getFirstBaselineOffset()
	 * @see #getContainerAttributes()
	 * @generated
	 */
	EAttribute getContainerAttributes_FirstBaselineOffset();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getVerticalAlign <em>Vertical Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Align</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getVerticalAlign()
	 * @see #getContainerAttributes()
	 * @generated
	 */
	EAttribute getContainerAttributes_VerticalAlign();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getLineBreak <em>Line Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Break</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getLineBreak()
	 * @see #getContainerAttributes()
	 * @generated
	 */
	EAttribute getContainerAttributes_LineBreak();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes <em>Character Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Attributes</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes
	 * @generated
	 */
	EClass getCharacterAttributes();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getFontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getFontFamily()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_FontFamily();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getFontSize()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getFontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getFontStyle()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_FontStyle();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getFontWeight <em>Font Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Weight</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getFontWeight()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_FontWeight();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getLineHeight <em>Line Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Height</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getLineHeight()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_LineHeight();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getTextDecoration <em>Text Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Decoration</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getTextDecoration()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_TextDecoration();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getLineThrough <em>Line Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Through</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getLineThrough()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_LineThrough();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getColor()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_Color();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getTextAlpha <em>Text Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Alpha</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getTextAlpha()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_TextAlpha();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getWhiteSpaceCollapse <em>White Space Collapse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>White Space Collapse</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getWhiteSpaceCollapse()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_WhiteSpaceCollapse();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getKerning <em>Kerning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kerning</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getKerning()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_Kerning();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getBackgroundAlpha <em>Background Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Alpha</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getBackgroundAlpha()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_BackgroundAlpha();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getBackgroundColor()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getBaselineShift <em>Baseline Shift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baseline Shift</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getBaselineShift()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_BaselineShift();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getBreakOpportunity <em>Break Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Break Opportunity</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getBreakOpportunity()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_BreakOpportunity();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getDigitCase <em>Digit Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digit Case</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getDigitCase()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_DigitCase();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getDigitWidth <em>Digit Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digit Width</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getDigitWidth()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_DigitWidth();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getDominantBaseline <em>Dominant Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dominant Baseline</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getDominantBaseline()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_DominantBaseline();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getAlignmentBaseline <em>Alignment Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment Baseline</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getAlignmentBaseline()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_AlignmentBaseline();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getLigatureLevel <em>Ligature Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ligature Level</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getLigatureLevel()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_LigatureLevel();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getLocale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locale</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getLocale()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_Locale();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getTypographicCase <em>Typographic Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typographic Case</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getTypographicCase()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_TypographicCase();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getTextRotation <em>Text Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Rotation</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getTextRotation()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_TextRotation();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getTrackingLeft <em>Tracking Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracking Left</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getTrackingLeft()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_TrackingLeft();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getTrackingRight <em>Tracking Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracking Right</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes#getTrackingRight()
	 * @see #getCharacterAttributes()
	 * @generated
	 */
	EAttribute getCharacterAttributes_TrackingRight();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.rawtext <em>rawtext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>rawtext</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.rawtext
	 * @generated
	 */
	EClass getrawtext();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.rawtext#get_text <em>text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>text</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.rawtext#get_text()
	 * @see #getrawtext()
	 * @generated
	 */
	EAttribute getrawtext__text();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.div <em>div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>div</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.div
	 * @generated
	 */
	EClass getdiv();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.p <em>p</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>p</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.p
	 * @generated
	 */
	EClass getp();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.tcy <em>tcy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tcy</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.tcy
	 * @generated
	 */
	EClass gettcy();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.a <em>a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>a</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.a
	 * @generated
	 */
	EClass geta();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.img <em>img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>img</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.img
	 * @generated
	 */
	EClass getimg();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.span <em>span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>span</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.span
	 * @generated
	 */
	EClass getspan();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.br <em>br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>br</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.br
	 * @generated
	 */
	EClass getbr();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.tab <em>tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tab</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.tab
	 * @generated
	 */
	EClass gettab();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.linkNormalFormat <em>link Normal Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>link Normal Format</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.linkNormalFormat
	 * @generated
	 */
	EClass getlinkNormalFormat();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.linkHoverFormat <em>link Hover Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>link Hover Format</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.linkHoverFormat
	 * @generated
	 */
	EClass getlinkHoverFormat();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.linkActiveFormat <em>link Active Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>link Active Format</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.linkActiveFormat
	 * @generated
	 */
	EClass getlinkActiveFormat();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage <em>Bitmap Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bitmap Image</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage
	 * @generated
	 */
	EClass getBitmapImage();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getX()
	 * @see #getBitmapImage()
	 * @generated
	 */
	EAttribute getBitmapImage_X();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getY()
	 * @see #getBitmapImage()
	 * @generated
	 */
	EAttribute getBitmapImage_Y();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getWidth()
	 * @see #getBitmapImage()
	 * @generated
	 */
	EAttribute getBitmapImage_Width();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getHeight()
	 * @see #getBitmapImage()
	 * @generated
	 */
	EAttribute getBitmapImage_Height();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getRotation()
	 * @see #getBitmapImage()
	 * @generated
	 */
	EAttribute getBitmapImage_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getScaleX <em>Scale X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getScaleX()
	 * @see #getBitmapImage()
	 * @generated
	 */
	EAttribute getBitmapImage_ScaleX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getScaleY <em>Scale Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getScaleY()
	 * @see #getBitmapImage()
	 * @generated
	 */
	EAttribute getBitmapImage_ScaleY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getFillMode <em>Fill Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Mode</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getFillMode()
	 * @see #getBitmapImage()
	 * @generated
	 */
	EAttribute getBitmapImage_FillMode();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getSource()
	 * @see #getBitmapImage()
	 * @generated
	 */
	EAttribute getBitmapImage_Source();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getVisible()
	 * @see #getBitmapImage()
	 * @generated
	 */
	EAttribute getBitmapImage_Visible();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getAlpha()
	 * @see #getBitmapImage()
	 * @generated
	 */
	EAttribute getBitmapImage_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getBlendMode <em>Blend Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blend Mode</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage#getBlendMode()
	 * @see #getBitmapImage()
	 * @generated
	 */
	EAttribute getBitmapImage_BlendMode();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Fill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fill</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Fill
	 * @generated
	 */
	EClass getFill();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColor <em>Solid Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solid Color</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.SolidColor
	 * @generated
	 */
	EClass getSolidColor();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColor#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.SolidColor#getAlpha()
	 * @see #getSolidColor()
	 * @generated
	 */
	EAttribute getSolidColor_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColor#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.SolidColor#getColor()
	 * @see #getSolidColor()
	 * @generated
	 */
	EAttribute getSolidColor_Color();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient <em>Linear Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Gradient</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient
	 * @generated
	 */
	EClass getLinearGradient();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient#getX()
	 * @see #getLinearGradient()
	 * @generated
	 */
	EAttribute getLinearGradient_X();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient#getY()
	 * @see #getLinearGradient()
	 * @generated
	 */
	EAttribute getLinearGradient_Y();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient#getScaleX <em>Scale X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient#getScaleX()
	 * @see #getLinearGradient()
	 * @generated
	 */
	EAttribute getLinearGradient_ScaleX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient#getRotation()
	 * @see #getLinearGradient()
	 * @generated
	 */
	EAttribute getLinearGradient_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient#getSpreadMethod <em>Spread Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spread Method</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient#getSpreadMethod()
	 * @see #getLinearGradient()
	 * @generated
	 */
	EAttribute getLinearGradient_SpreadMethod();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient#getInterpolationMethod <em>Interpolation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolation Method</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient#getInterpolationMethod()
	 * @see #getLinearGradient()
	 * @generated
	 */
	EAttribute getLinearGradient_InterpolationMethod();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient#getMatrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Matrix</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient#getMatrix()
	 * @see #getLinearGradient()
	 * @generated
	 */
	EReference getLinearGradient_Matrix();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient <em>Radial Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radial Gradient</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient
	 * @generated
	 */
	EClass getRadialGradient();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient#getX()
	 * @see #getRadialGradient()
	 * @generated
	 */
	EAttribute getRadialGradient_X();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient#getY()
	 * @see #getRadialGradient()
	 * @generated
	 */
	EAttribute getRadialGradient_Y();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient#getScaleX <em>Scale X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient#getScaleX()
	 * @see #getRadialGradient()
	 * @generated
	 */
	EAttribute getRadialGradient_ScaleX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient#getScaleY <em>Scale Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient#getScaleY()
	 * @see #getRadialGradient()
	 * @generated
	 */
	EAttribute getRadialGradient_ScaleY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient#getRotation()
	 * @see #getRadialGradient()
	 * @generated
	 */
	EAttribute getRadialGradient_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient#getSpreadMethod <em>Spread Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spread Method</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient#getSpreadMethod()
	 * @see #getRadialGradient()
	 * @generated
	 */
	EAttribute getRadialGradient_SpreadMethod();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient#getInterpolationMethod <em>Interpolation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolation Method</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient#getInterpolationMethod()
	 * @see #getRadialGradient()
	 * @generated
	 */
	EAttribute getRadialGradient_InterpolationMethod();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient#getFocalPointRatio <em>Focal Point Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Focal Point Ratio</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient#getFocalPointRatio()
	 * @see #getRadialGradient()
	 * @generated
	 */
	EAttribute getRadialGradient_FocalPointRatio();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient#getMatrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Matrix</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient#getMatrix()
	 * @see #getRadialGradient()
	 * @generated
	 */
	EReference getRadialGradient_Matrix();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill <em>Bitmap Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bitmap Fill</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill
	 * @generated
	 */
	EClass getBitmapFill();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill#getX()
	 * @see #getBitmapFill()
	 * @generated
	 */
	EAttribute getBitmapFill_X();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill#getY()
	 * @see #getBitmapFill()
	 * @generated
	 */
	EAttribute getBitmapFill_Y();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill#getScaleX <em>Scale X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill#getScaleX()
	 * @see #getBitmapFill()
	 * @generated
	 */
	EAttribute getBitmapFill_ScaleX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill#getScaleY <em>Scale Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill#getScaleY()
	 * @see #getBitmapFill()
	 * @generated
	 */
	EAttribute getBitmapFill_ScaleY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill#getRotation()
	 * @see #getBitmapFill()
	 * @generated
	 */
	EAttribute getBitmapFill_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill#getSource()
	 * @see #getBitmapFill()
	 * @generated
	 */
	EAttribute getBitmapFill_Source();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill#getFillMode <em>Fill Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Mode</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill#getFillMode()
	 * @see #getBitmapFill()
	 * @generated
	 */
	EAttribute getBitmapFill_FillMode();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill#getMatrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Matrix</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill#getMatrix()
	 * @see #getBitmapFill()
	 * @generated
	 */
	EReference getBitmapFill_Matrix();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Stroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stroke</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Stroke
	 * @generated
	 */
	EClass getStroke();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke <em>Solid Color Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solid Color Stroke</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke
	 * @generated
	 */
	EClass getSolidColorStroke();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getAlpha()
	 * @see #getSolidColorStroke()
	 * @generated
	 */
	EAttribute getSolidColorStroke_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getCaps <em>Caps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caps</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getCaps()
	 * @see #getSolidColorStroke()
	 * @generated
	 */
	EAttribute getSolidColorStroke_Caps();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getColor()
	 * @see #getSolidColorStroke()
	 * @generated
	 */
	EAttribute getSolidColorStroke_Color();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getJoints <em>Joints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Joints</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getJoints()
	 * @see #getSolidColorStroke()
	 * @generated
	 */
	EAttribute getSolidColorStroke_Joints();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getMiterLimit <em>Miter Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Miter Limit</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getMiterLimit()
	 * @see #getSolidColorStroke()
	 * @generated
	 */
	EAttribute getSolidColorStroke_MiterLimit();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getPixelHinting <em>Pixel Hinting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pixel Hinting</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getPixelHinting()
	 * @see #getSolidColorStroke()
	 * @generated
	 */
	EAttribute getSolidColorStroke_PixelHinting();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getScaleMode <em>Scale Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Mode</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getScaleMode()
	 * @see #getSolidColorStroke()
	 * @generated
	 */
	EAttribute getSolidColorStroke_ScaleMode();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getWeight()
	 * @see #getSolidColorStroke()
	 * @generated
	 */
	EAttribute getSolidColorStroke_Weight();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke <em>Linear Gradient Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Gradient Stroke</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke
	 * @generated
	 */
	EClass getLinearGradientStroke();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getX()
	 * @see #getLinearGradientStroke()
	 * @generated
	 */
	EAttribute getLinearGradientStroke_X();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getY()
	 * @see #getLinearGradientStroke()
	 * @generated
	 */
	EAttribute getLinearGradientStroke_Y();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getScaleX <em>Scale X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getScaleX()
	 * @see #getLinearGradientStroke()
	 * @generated
	 */
	EAttribute getLinearGradientStroke_ScaleX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getRotation()
	 * @see #getLinearGradientStroke()
	 * @generated
	 */
	EAttribute getLinearGradientStroke_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getSpreadMethod <em>Spread Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spread Method</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getSpreadMethod()
	 * @see #getLinearGradientStroke()
	 * @generated
	 */
	EAttribute getLinearGradientStroke_SpreadMethod();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getInterpolationMethod <em>Interpolation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolation Method</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getInterpolationMethod()
	 * @see #getLinearGradientStroke()
	 * @generated
	 */
	EAttribute getLinearGradientStroke_InterpolationMethod();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getScaleMode <em>Scale Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Mode</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getScaleMode()
	 * @see #getLinearGradientStroke()
	 * @generated
	 */
	EAttribute getLinearGradientStroke_ScaleMode();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getCaps <em>Caps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caps</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getCaps()
	 * @see #getLinearGradientStroke()
	 * @generated
	 */
	EAttribute getLinearGradientStroke_Caps();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getJoints <em>Joints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Joints</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getJoints()
	 * @see #getLinearGradientStroke()
	 * @generated
	 */
	EAttribute getLinearGradientStroke_Joints();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getMiterLimit <em>Miter Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Miter Limit</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getMiterLimit()
	 * @see #getLinearGradientStroke()
	 * @generated
	 */
	EAttribute getLinearGradientStroke_MiterLimit();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getWeight()
	 * @see #getLinearGradientStroke()
	 * @generated
	 */
	EAttribute getLinearGradientStroke_Weight();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getPixelHinting <em>Pixel Hinting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pixel Hinting</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getPixelHinting()
	 * @see #getLinearGradientStroke()
	 * @generated
	 */
	EAttribute getLinearGradientStroke_PixelHinting();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getMatrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Matrix</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke#getMatrix()
	 * @see #getLinearGradientStroke()
	 * @generated
	 */
	EReference getLinearGradientStroke_Matrix();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke <em>Radial Gradient Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radial Gradient Stroke</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke
	 * @generated
	 */
	EClass getRadialGradientStroke();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getX()
	 * @see #getRadialGradientStroke()
	 * @generated
	 */
	EAttribute getRadialGradientStroke_X();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getY()
	 * @see #getRadialGradientStroke()
	 * @generated
	 */
	EAttribute getRadialGradientStroke_Y();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getScaleX <em>Scale X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getScaleX()
	 * @see #getRadialGradientStroke()
	 * @generated
	 */
	EAttribute getRadialGradientStroke_ScaleX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getScaleY <em>Scale Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getScaleY()
	 * @see #getRadialGradientStroke()
	 * @generated
	 */
	EAttribute getRadialGradientStroke_ScaleY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getRotation()
	 * @see #getRadialGradientStroke()
	 * @generated
	 */
	EAttribute getRadialGradientStroke_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getSpreadMethod <em>Spread Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spread Method</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getSpreadMethod()
	 * @see #getRadialGradientStroke()
	 * @generated
	 */
	EAttribute getRadialGradientStroke_SpreadMethod();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getInterpolationMethod <em>Interpolation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolation Method</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getInterpolationMethod()
	 * @see #getRadialGradientStroke()
	 * @generated
	 */
	EAttribute getRadialGradientStroke_InterpolationMethod();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getFocalPointRatio <em>Focal Point Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Focal Point Ratio</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getFocalPointRatio()
	 * @see #getRadialGradientStroke()
	 * @generated
	 */
	EAttribute getRadialGradientStroke_FocalPointRatio();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getScaleMode <em>Scale Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Mode</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getScaleMode()
	 * @see #getRadialGradientStroke()
	 * @generated
	 */
	EAttribute getRadialGradientStroke_ScaleMode();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getCaps <em>Caps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caps</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getCaps()
	 * @see #getRadialGradientStroke()
	 * @generated
	 */
	EAttribute getRadialGradientStroke_Caps();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getJoints <em>Joints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Joints</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getJoints()
	 * @see #getRadialGradientStroke()
	 * @generated
	 */
	EAttribute getRadialGradientStroke_Joints();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getMiterLimit <em>Miter Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Miter Limit</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getMiterLimit()
	 * @see #getRadialGradientStroke()
	 * @generated
	 */
	EAttribute getRadialGradientStroke_MiterLimit();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getWeight()
	 * @see #getRadialGradientStroke()
	 * @generated
	 */
	EAttribute getRadialGradientStroke_Weight();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getPixelHinting <em>Pixel Hinting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pixel Hinting</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getPixelHinting()
	 * @see #getRadialGradientStroke()
	 * @generated
	 */
	EAttribute getRadialGradientStroke_PixelHinting();

	/**
	 * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getMatrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Matrix</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke#getMatrix()
	 * @see #getRadialGradientStroke()
	 * @generated
	 */
	EReference getRadialGradientStroke_Matrix();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientEntry <em>Gradient Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gradient Entry</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientEntry
	 * @generated
	 */
	EClass getGradientEntry();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientEntry#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientEntry#getColor()
	 * @see #getGradientEntry()
	 * @generated
	 */
	EAttribute getGradientEntry_Color();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientEntry#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientEntry#getAlpha()
	 * @see #getGradientEntry()
	 * @generated
	 */
	EAttribute getGradientEntry_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientEntry#getRatio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ratio</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientEntry#getRatio()
	 * @see #getGradientEntry()
	 * @generated
	 */
	EAttribute getGradientEntry_Ratio();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform <em>Color Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Transform</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform
	 * @generated
	 */
	EClass getColorTransform();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform#getAlphaMultiplier <em>Alpha Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha Multiplier</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform#getAlphaMultiplier()
	 * @see #getColorTransform()
	 * @generated
	 */
	EAttribute getColorTransform_AlphaMultiplier();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform#getAlphaOffset <em>Alpha Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha Offset</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform#getAlphaOffset()
	 * @see #getColorTransform()
	 * @generated
	 */
	EAttribute getColorTransform_AlphaOffset();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform#getBlueMultiplier <em>Blue Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue Multiplier</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform#getBlueMultiplier()
	 * @see #getColorTransform()
	 * @generated
	 */
	EAttribute getColorTransform_BlueMultiplier();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform#getBlueOffset <em>Blue Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue Offset</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform#getBlueOffset()
	 * @see #getColorTransform()
	 * @generated
	 */
	EAttribute getColorTransform_BlueOffset();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform#getGreenMultiplier <em>Green Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green Multiplier</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform#getGreenMultiplier()
	 * @see #getColorTransform()
	 * @generated
	 */
	EAttribute getColorTransform_GreenMultiplier();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform#getGreenOffset <em>Green Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green Offset</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform#getGreenOffset()
	 * @see #getColorTransform()
	 * @generated
	 */
	EAttribute getColorTransform_GreenOffset();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform#getRedMultiplier <em>Red Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red Multiplier</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform#getRedMultiplier()
	 * @see #getColorTransform()
	 * @generated
	 */
	EAttribute getColorTransform_RedMultiplier();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform#getRedOffset <em>Red Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red Offset</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform#getRedOffset()
	 * @see #getColorTransform()
	 * @generated
	 */
	EAttribute getColorTransform_RedOffset();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BlurFilter <em>Blur Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blur Filter</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BlurFilter
	 * @generated
	 */
	EClass getBlurFilter();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BlurFilter#getBlurX <em>Blur X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blur X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BlurFilter#getBlurX()
	 * @see #getBlurFilter()
	 * @generated
	 */
	EAttribute getBlurFilter_BlurX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BlurFilter#getBlurY <em>Blur Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blur Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BlurFilter#getBlurY()
	 * @see #getBlurFilter()
	 * @generated
	 */
	EAttribute getBlurFilter_BlurY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BlurFilter#getQuality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BlurFilter#getQuality()
	 * @see #getBlurFilter()
	 * @generated
	 */
	EAttribute getBlurFilter_Quality();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter <em>Drop Shadow Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Shadow Filter</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter
	 * @generated
	 */
	EClass getDropShadowFilter();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getAlpha()
	 * @see #getDropShadowFilter()
	 * @generated
	 */
	EAttribute getDropShadowFilter_Alpha();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getAngle()
	 * @see #getDropShadowFilter()
	 * @generated
	 */
	EAttribute getDropShadowFilter_Angle();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getBlurX <em>Blur X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blur X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getBlurX()
	 * @see #getDropShadowFilter()
	 * @generated
	 */
	EAttribute getDropShadowFilter_BlurX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getBlurY <em>Blur Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blur Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getBlurY()
	 * @see #getDropShadowFilter()
	 * @generated
	 */
	EAttribute getDropShadowFilter_BlurY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getColor()
	 * @see #getDropShadowFilter()
	 * @generated
	 */
	EAttribute getDropShadowFilter_Color();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getDistance()
	 * @see #getDropShadowFilter()
	 * @generated
	 */
	EAttribute getDropShadowFilter_Distance();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getInner <em>Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getInner()
	 * @see #getDropShadowFilter()
	 * @generated
	 */
	EAttribute getDropShadowFilter_Inner();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getHideObject <em>Hide Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide Object</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getHideObject()
	 * @see #getDropShadowFilter()
	 * @generated
	 */
	EAttribute getDropShadowFilter_HideObject();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getKnockout <em>Knockout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Knockout</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getKnockout()
	 * @see #getDropShadowFilter()
	 * @generated
	 */
	EAttribute getDropShadowFilter_Knockout();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getQuality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getQuality()
	 * @see #getDropShadowFilter()
	 * @generated
	 */
	EAttribute getDropShadowFilter_Quality();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getStrength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strength</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter#getStrength()
	 * @see #getDropShadowFilter()
	 * @generated
	 */
	EAttribute getDropShadowFilter_Strength();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter <em>Bevel Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bevel Filter</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter
	 * @generated
	 */
	EClass getBevelFilter();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getAngle()
	 * @see #getBevelFilter()
	 * @generated
	 */
	EAttribute getBevelFilter_Angle();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getBlurX <em>Blur X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blur X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getBlurX()
	 * @see #getBevelFilter()
	 * @generated
	 */
	EAttribute getBevelFilter_BlurX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getBlurY <em>Blur Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blur Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getBlurY()
	 * @see #getBevelFilter()
	 * @generated
	 */
	EAttribute getBevelFilter_BlurY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getHighlightAlpha <em>Highlight Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Highlight Alpha</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getHighlightAlpha()
	 * @see #getBevelFilter()
	 * @generated
	 */
	EAttribute getBevelFilter_HighlightAlpha();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getHighlightColor <em>Highlight Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Highlight Color</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getHighlightColor()
	 * @see #getBevelFilter()
	 * @generated
	 */
	EAttribute getBevelFilter_HighlightColor();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getDistance()
	 * @see #getBevelFilter()
	 * @generated
	 */
	EAttribute getBevelFilter_Distance();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getKnockout <em>Knockout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Knockout</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getKnockout()
	 * @see #getBevelFilter()
	 * @generated
	 */
	EAttribute getBevelFilter_Knockout();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getQuality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getQuality()
	 * @see #getBevelFilter()
	 * @generated
	 */
	EAttribute getBevelFilter_Quality();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getShadowAlpha <em>Shadow Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Alpha</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getShadowAlpha()
	 * @see #getBevelFilter()
	 * @generated
	 */
	EAttribute getBevelFilter_ShadowAlpha();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getShadowColor <em>Shadow Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Color</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getShadowColor()
	 * @see #getBevelFilter()
	 * @generated
	 */
	EAttribute getBevelFilter_ShadowColor();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getStrength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strength</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getStrength()
	 * @see #getBevelFilter()
	 * @generated
	 */
	EAttribute getBevelFilter_Strength();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter#getType()
	 * @see #getBevelFilter()
	 * @generated
	 */
	EAttribute getBevelFilter_Type();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter <em>Gradient Glow Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gradient Glow Filter</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter
	 * @generated
	 */
	EClass getGradientGlowFilter();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter#getAngle()
	 * @see #getGradientGlowFilter()
	 * @generated
	 */
	EAttribute getGradientGlowFilter_Angle();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter#getBlurX <em>Blur X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blur X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter#getBlurX()
	 * @see #getGradientGlowFilter()
	 * @generated
	 */
	EAttribute getGradientGlowFilter_BlurX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter#getBlurY <em>Blur Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blur Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter#getBlurY()
	 * @see #getGradientGlowFilter()
	 * @generated
	 */
	EAttribute getGradientGlowFilter_BlurY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter#getDistance()
	 * @see #getGradientGlowFilter()
	 * @generated
	 */
	EAttribute getGradientGlowFilter_Distance();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter#getInner <em>Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter#getInner()
	 * @see #getGradientGlowFilter()
	 * @generated
	 */
	EAttribute getGradientGlowFilter_Inner();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter#getKnockout <em>Knockout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Knockout</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter#getKnockout()
	 * @see #getGradientGlowFilter()
	 * @generated
	 */
	EAttribute getGradientGlowFilter_Knockout();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter#getQuality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter#getQuality()
	 * @see #getGradientGlowFilter()
	 * @generated
	 */
	EAttribute getGradientGlowFilter_Quality();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter#getStrength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strength</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter#getStrength()
	 * @see #getGradientGlowFilter()
	 * @generated
	 */
	EAttribute getGradientGlowFilter_Strength();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter <em>Gradient Bevel Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gradient Bevel Filter</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter
	 * @generated
	 */
	EClass getGradientBevelFilter();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter#getAngle()
	 * @see #getGradientBevelFilter()
	 * @generated
	 */
	EAttribute getGradientBevelFilter_Angle();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter#getBlurX <em>Blur X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blur X</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter#getBlurX()
	 * @see #getGradientBevelFilter()
	 * @generated
	 */
	EAttribute getGradientBevelFilter_BlurX();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter#getBlurY <em>Blur Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blur Y</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter#getBlurY()
	 * @see #getGradientBevelFilter()
	 * @generated
	 */
	EAttribute getGradientBevelFilter_BlurY();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter#getDistance()
	 * @see #getGradientBevelFilter()
	 * @generated
	 */
	EAttribute getGradientBevelFilter_Distance();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter#getKnockout <em>Knockout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Knockout</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter#getKnockout()
	 * @see #getGradientBevelFilter()
	 * @generated
	 */
	EAttribute getGradientBevelFilter_Knockout();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter#getQuality <em>Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quality</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter#getQuality()
	 * @see #getGradientBevelFilter()
	 * @generated
	 */
	EAttribute getGradientBevelFilter_Quality();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter#getStrength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strength</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter#getStrength()
	 * @see #getGradientBevelFilter()
	 * @generated
	 */
	EAttribute getGradientBevelFilter_Strength();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter#getType()
	 * @see #getGradientBevelFilter()
	 * @generated
	 */
	EAttribute getGradientBevelFilter_Type();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ColorMatrixFilter <em>Color Matrix Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Matrix Filter</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ColorMatrixFilter
	 * @generated
	 */
	EClass getColorMatrixFilter();

	/**
	 * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ColorMatrixFilter#getMatrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matrix</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ColorMatrixFilter#getMatrix()
	 * @see #getColorMatrixFilter()
	 * @generated
	 */
	EAttribute getColorMatrixFilter_Matrix();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.FXGElement <em>FXG Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FXG Element</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FXGElement
	 * @generated
	 */
	EClass getFXGElement();

	/**
	 * Returns the meta object for class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerElement <em>Container Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Element</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ContainerElement
	 * @generated
	 */
	EClass getContainerElement();

	/**
	 * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerElement#get_children <em>children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>children</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ContainerElement#get_children()
	 * @see #getContainerElement()
	 * @generated
	 */
	EReference getContainerElement__children();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BlendMode <em>Blend Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Blend Mode</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BlendMode
	 * @generated
	 */
	EEnum getBlendMode();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Winding <em>Winding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Winding</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Winding
	 * @generated
	 */
	EEnum getWinding();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.MaskType <em>Mask Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mask Type</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.MaskType
	 * @generated
	 */
	EEnum getMaskType();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.FontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Style</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FontStyle
	 * @generated
	 */
	EEnum getFontStyle();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.FontWeight <em>Font Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Weight</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FontWeight
	 * @generated
	 */
	EEnum getFontWeight();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.TextDecoration <em>Text Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Decoration</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TextDecoration
	 * @generated
	 */
	EEnum getTextDecoration();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.WhitespaceCollapse <em>Whitespace Collapse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Whitespace Collapse</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.WhitespaceCollapse
	 * @generated
	 */
	EEnum getWhitespaceCollapse();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Kerning <em>Kerning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kerning</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Kerning
	 * @generated
	 */
	EEnum getKerning();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SpreadMethod <em>Spread Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Spread Method</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.SpreadMethod
	 * @generated
	 */
	EEnum getSpreadMethod();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.InterpolationMethod <em>Interpolation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interpolation Method</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.InterpolationMethod
	 * @generated
	 */
	EEnum getInterpolationMethod();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Cap <em>Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cap</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Cap
	 * @generated
	 */
	EEnum getCap();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Joint <em>Joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Joint</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Joint
	 * @generated
	 */
	EEnum getJoint();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ScaleMode <em>Scale Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scale Mode</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ScaleMode
	 * @generated
	 */
	EEnum getScaleMode();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilterType <em>Bevel Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bevel Filter Type</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilterType
	 * @generated
	 */
	EEnum getBevelFilterType();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.FillMode <em>Fill Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fill Mode</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FillMode
	 * @generated
	 */
	EEnum getFillMode();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.TextAlign <em>Text Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Align</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TextAlign
	 * @generated
	 */
	EEnum getTextAlign();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.JustificationRule <em>Justification Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Justification Rule</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.JustificationRule
	 * @generated
	 */
	EEnum getJustificationRule();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.JustificationStyle <em>Justification Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Justification Style</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.JustificationStyle
	 * @generated
	 */
	EEnum getJustificationStyle();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.TextJustify <em>Text Justify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Justify</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TextJustify
	 * @generated
	 */
	EEnum getTextJustify();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LeadingModel <em>Leading Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Leading Model</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LeadingModel
	 * @generated
	 */
	EEnum getLeadingModel();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BlockProgression <em>Block Progression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Block Progression</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BlockProgression
	 * @generated
	 */
	EEnum getBlockProgression();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.VerticalAlign <em>Vertical Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vertical Align</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.VerticalAlign
	 * @generated
	 */
	EEnum getVerticalAlign();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LineBreak <em>Line Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Line Break</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LineBreak
	 * @generated
	 */
	EEnum getLineBreak();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BreakOpportunity <em>Break Opportunity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Break Opportunity</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BreakOpportunity
	 * @generated
	 */
	EEnum getBreakOpportunity();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DigitCase <em>Digit Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Digit Case</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DigitCase
	 * @generated
	 */
	EEnum getDigitCase();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DigitWidth <em>Digit Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Digit Width</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DigitWidth
	 * @generated
	 */
	EEnum getDigitWidth();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DominantBaseline <em>Dominant Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dominant Baseline</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DominantBaseline
	 * @generated
	 */
	EEnum getDominantBaseline();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.AlignmentBaseline <em>Alignment Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alignment Baseline</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.AlignmentBaseline
	 * @generated
	 */
	EEnum getAlignmentBaseline();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LigatureLevel <em>Ligature Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ligature Level</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LigatureLevel
	 * @generated
	 */
	EEnum getLigatureLevel();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.TypographicCase <em>Typographic Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Typographic Case</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TypographicCase
	 * @generated
	 */
	EEnum getTypographicCase();

	/**
	 * Returns the meta object for enum '{@link at.bestsolution.efxclipse.formats.fxg.fxg.TextRotation <em>Text Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Rotation</em>'.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TextRotation
	 * @generated
	 */
	EEnum getTextRotation();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Path Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Path Data</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getPathData();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getAngle();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Length</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getLength();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Percent</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getPercent();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getColor();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Alpha</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getAlpha();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FxgFactory getFxgFactory();

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
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GraphicImpl <em>Graphic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.GraphicImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getGraphic()
		 * @generated
		 */
		EClass GRAPHIC = eINSTANCE.getGraphic();

		/**
		 * The meta object literal for the '<em><b>Scale Grid Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC__SCALE_GRID_LEFT = eINSTANCE.getGraphic_ScaleGridLeft();

		/**
		 * The meta object literal for the '<em><b>Scale Grid Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC__SCALE_GRID_RIGHT = eINSTANCE.getGraphic_ScaleGridRight();

		/**
		 * The meta object literal for the '<em><b>Scale Grid Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC__SCALE_GRID_TOP = eINSTANCE.getGraphic_ScaleGridTop();

		/**
		 * The meta object literal for the '<em><b>Scale Grid Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC__SCALE_GRID_BOTTOM = eINSTANCE.getGraphic_ScaleGridBottom();

		/**
		 * The meta object literal for the '<em><b>View Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC__VIEW_WIDTH = eINSTANCE.getGraphic_ViewWidth();

		/**
		 * The meta object literal for the '<em><b>View Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC__VIEW_HEIGHT = eINSTANCE.getGraphic_ViewHeight();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHIC__VERSION = eINSTANCE.getGraphic_Version();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHIC__MASK = eINSTANCE.getGraphic_Mask();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.LibraryImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.PrivateImpl <em>Private</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.PrivateImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getPrivate()
		 * @generated
		 */
		EClass PRIVATE = eINSTANCE.getPrivate();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.DefinitionImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITION__NAME = eINSTANCE.getDefinition_Name();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.GroupImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__ROTATION = eINSTANCE.getGroup_Rotation();

		/**
		 * The meta object literal for the '<em><b>Scale X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__SCALE_X = eINSTANCE.getGroup_ScaleX();

		/**
		 * The meta object literal for the '<em><b>Scale Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__SCALE_Y = eINSTANCE.getGroup_ScaleY();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__X = eINSTANCE.getGroup_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__Y = eINSTANCE.getGroup_Y();

		/**
		 * The meta object literal for the '<em><b>Blend Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__BLEND_MODE = eINSTANCE.getGroup_BlendMode();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__ALPHA = eINSTANCE.getGroup_Alpha();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__ID = eINSTANCE.getGroup_Id();

		/**
		 * The meta object literal for the '<em><b>Transform X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__TRANSFORM_X = eINSTANCE.getGroup_TransformX();

		/**
		 * The meta object literal for the '<em><b>Transform Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__TRANSFORM_Y = eINSTANCE.getGroup_TransformY();

		/**
		 * The meta object literal for the '<em><b>Mask Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__MASK_TYPE = eINSTANCE.getGroup_MaskType();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__VISIBLE = eINSTANCE.getGroup_Visible();

		/**
		 * The meta object literal for the '<em><b>Scale Grid Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__SCALE_GRID_LEFT = eINSTANCE.getGroup_ScaleGridLeft();

		/**
		 * The meta object literal for the '<em><b>Scale Grid Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__SCALE_GRID_RIGHT = eINSTANCE.getGroup_ScaleGridRight();

		/**
		 * The meta object literal for the '<em><b>Scale Grid Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__SCALE_GRID_TOP = eINSTANCE.getGroup_ScaleGridTop();

		/**
		 * The meta object literal for the '<em><b>Scale Grid Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__SCALE_GRID_BOTTOM = eINSTANCE.getGroup_ScaleGridBottom();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__TRANSFORM = eINSTANCE.getGroup_Transform();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__FILTERS = eINSTANCE.getGroup_Filters();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.TransformImpl <em>Transform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.TransformImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getTransform()
		 * @generated
		 */
		EClass TRANSFORM = eINSTANCE.getTransform();

		/**
		 * The meta object literal for the '<em><b>Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORM__MATRIX = eINSTANCE.getTransform_Matrix();

		/**
		 * The meta object literal for the '<em><b>Color Transform</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORM__COLOR_TRANSFORM = eINSTANCE.getTransform_ColorTransform();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.PlaceObjectImpl <em>Place Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.PlaceObjectImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getPlaceObject()
		 * @generated
		 */
		EClass PLACE_OBJECT = eINSTANCE.getPlaceObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE_OBJECT__ID = eINSTANCE.getPlaceObject_Id();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_OBJECT__TRANSFORM = eINSTANCE.getPlaceObject_Transform();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_OBJECT__FILTERS = eINSTANCE.getPlaceObject_Filters();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_OBJECT__MASK = eINSTANCE.getPlaceObject_Mask();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.MatrixImpl <em>Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.MatrixImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getMatrix()
		 * @generated
		 */
		EClass MATRIX = eINSTANCE.getMatrix();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__A = eINSTANCE.getMatrix_A();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__B = eINSTANCE.getMatrix_B();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__C = eINSTANCE.getMatrix_C();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__D = eINSTANCE.getMatrix_D();

		/**
		 * The meta object literal for the '<em><b>Tx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__TX = eINSTANCE.getMatrix_Tx();

		/**
		 * The meta object literal for the '<em><b>Ty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__TY = eINSTANCE.getMatrix_Ty();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.PathImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__DATA = eINSTANCE.getPath_Data();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__X = eINSTANCE.getPath_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__Y = eINSTANCE.getPath_Y();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__ROTATION = eINSTANCE.getPath_Rotation();

		/**
		 * The meta object literal for the '<em><b>Scale X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__SCALE_X = eINSTANCE.getPath_ScaleX();

		/**
		 * The meta object literal for the '<em><b>Scale Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__SCALE_Y = eINSTANCE.getPath_ScaleY();

		/**
		 * The meta object literal for the '<em><b>Blend Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__BLEND_MODE = eINSTANCE.getPath_BlendMode();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__VISIBLE = eINSTANCE.getPath_Visible();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__ALPHA = eINSTANCE.getPath_Alpha();

		/**
		 * The meta object literal for the '<em><b>Winding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH__WINDING = eINSTANCE.getPath_Winding();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__FILL = eINSTANCE.getPath_Fill();

		/**
		 * The meta object literal for the '<em><b>Stroke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__STROKE = eINSTANCE.getPath_Stroke();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__FILTERS = eINSTANCE.getPath_Filters();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__TRANSFORM = eINSTANCE.getPath_Transform();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH__MASK = eINSTANCE.getPath_Mask();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Shape <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Shape
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RectImpl <em>Rect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.RectImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getRect()
		 * @generated
		 */
		EClass RECT = eINSTANCE.getRect();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__WIDTH = eINSTANCE.getRect_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__HEIGHT = eINSTANCE.getRect_Height();

		/**
		 * The meta object literal for the '<em><b>Radius X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__RADIUS_X = eINSTANCE.getRect_RadiusX();

		/**
		 * The meta object literal for the '<em><b>Radius Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__RADIUS_Y = eINSTANCE.getRect_RadiusY();

		/**
		 * The meta object literal for the '<em><b>Top Left Radius X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__TOP_LEFT_RADIUS_X = eINSTANCE.getRect_TopLeftRadiusX();

		/**
		 * The meta object literal for the '<em><b>Top Left Radius Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__TOP_LEFT_RADIUS_Y = eINSTANCE.getRect_TopLeftRadiusY();

		/**
		 * The meta object literal for the '<em><b>Top Right Radius X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__TOP_RIGHT_RADIUS_X = eINSTANCE.getRect_TopRightRadiusX();

		/**
		 * The meta object literal for the '<em><b>Top Right Radius Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__TOP_RIGHT_RADIUS_Y = eINSTANCE.getRect_TopRightRadiusY();

		/**
		 * The meta object literal for the '<em><b>Bottom Left Radius X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__BOTTOM_LEFT_RADIUS_X = eINSTANCE.getRect_BottomLeftRadiusX();

		/**
		 * The meta object literal for the '<em><b>Bottom Left Radius Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__BOTTOM_LEFT_RADIUS_Y = eINSTANCE.getRect_BottomLeftRadiusY();

		/**
		 * The meta object literal for the '<em><b>Bottom Right Radius X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__BOTTOM_RIGHT_RADIUS_X = eINSTANCE.getRect_BottomRightRadiusX();

		/**
		 * The meta object literal for the '<em><b>Bottom Right Radius Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__BOTTOM_RIGHT_RADIUS_Y = eINSTANCE.getRect_BottomRightRadiusY();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__X = eINSTANCE.getRect_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__Y = eINSTANCE.getRect_Y();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__ROTATION = eINSTANCE.getRect_Rotation();

		/**
		 * The meta object literal for the '<em><b>Scale X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__SCALE_X = eINSTANCE.getRect_ScaleX();

		/**
		 * The meta object literal for the '<em><b>Scale Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__SCALE_Y = eINSTANCE.getRect_ScaleY();

		/**
		 * The meta object literal for the '<em><b>Blend Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__BLEND_MODE = eINSTANCE.getRect_BlendMode();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__VISIBLE = eINSTANCE.getRect_Visible();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECT__ALPHA = eINSTANCE.getRect_Alpha();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECT__TRANSFORM = eINSTANCE.getRect_Transform();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECT__FILTERS = eINSTANCE.getRect_Filters();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECT__FILL = eINSTANCE.getRect_Fill();

		/**
		 * The meta object literal for the '<em><b>Stroke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECT__STROKE = eINSTANCE.getRect_Stroke();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECT__MASK = eINSTANCE.getRect_Mask();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.EllipseImpl <em>Ellipse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.EllipseImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getEllipse()
		 * @generated
		 */
		EClass ELLIPSE = eINSTANCE.getEllipse();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__ALPHA = eINSTANCE.getEllipse_Alpha();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__WIDTH = eINSTANCE.getEllipse_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__HEIGHT = eINSTANCE.getEllipse_Height();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__X = eINSTANCE.getEllipse_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__Y = eINSTANCE.getEllipse_Y();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__ROTATION = eINSTANCE.getEllipse_Rotation();

		/**
		 * The meta object literal for the '<em><b>Scale X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__SCALE_X = eINSTANCE.getEllipse_ScaleX();

		/**
		 * The meta object literal for the '<em><b>Scale Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__SCALE_Y = eINSTANCE.getEllipse_ScaleY();

		/**
		 * The meta object literal for the '<em><b>Blend Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__BLEND_MODE = eINSTANCE.getEllipse_BlendMode();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE__VISIBLE = eINSTANCE.getEllipse_Visible();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELLIPSE__TRANSFORM = eINSTANCE.getEllipse_Transform();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELLIPSE__FILTERS = eINSTANCE.getEllipse_Filters();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELLIPSE__FILL = eINSTANCE.getEllipse_Fill();

		/**
		 * The meta object literal for the '<em><b>Stroke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELLIPSE__STROKE = eINSTANCE.getEllipse_Stroke();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELLIPSE__MASK = eINSTANCE.getEllipse_Mask();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.LineImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>XFrom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__XFROM = eINSTANCE.getLine_XFrom();

		/**
		 * The meta object literal for the '<em><b>YFrom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__YFROM = eINSTANCE.getLine_YFrom();

		/**
		 * The meta object literal for the '<em><b>XTo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__XTO = eINSTANCE.getLine_XTo();

		/**
		 * The meta object literal for the '<em><b>YTo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__YTO = eINSTANCE.getLine_YTo();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__X = eINSTANCE.getLine_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__Y = eINSTANCE.getLine_Y();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__ROTATION = eINSTANCE.getLine_Rotation();

		/**
		 * The meta object literal for the '<em><b>Scale X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__SCALE_X = eINSTANCE.getLine_ScaleX();

		/**
		 * The meta object literal for the '<em><b>Scale Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__SCALE_Y = eINSTANCE.getLine_ScaleY();

		/**
		 * The meta object literal for the '<em><b>Blend Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__BLEND_MODE = eINSTANCE.getLine_BlendMode();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__ALPHA = eINSTANCE.getLine_Alpha();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__ID = eINSTANCE.getLine_Id();

		/**
		 * The meta object literal for the '<em><b>Mask Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__MASK_TYPE = eINSTANCE.getLine_MaskType();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE__VISIBLE = eINSTANCE.getLine_Visible();

		/**
		 * The meta object literal for the '<em><b>Transform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__TRANSFORM = eINSTANCE.getLine_Transform();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__FILTERS = eINSTANCE.getLine_Filters();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__FILL = eINSTANCE.getLine_Fill();

		/**
		 * The meta object literal for the '<em><b>Stroke</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__STROKE = eINSTANCE.getLine_Stroke();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__MASK = eINSTANCE.getLine_Mask();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl <em>Rich Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getRichText()
		 * @generated
		 */
		EClass RICH_TEXT = eINSTANCE.getRichText();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RICH_TEXT__ROTATION = eINSTANCE.getRichText_Rotation();

		/**
		 * The meta object literal for the '<em><b>Scale X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RICH_TEXT__SCALE_X = eINSTANCE.getRichText_ScaleX();

		/**
		 * The meta object literal for the '<em><b>Scale Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RICH_TEXT__SCALE_Y = eINSTANCE.getRichText_ScaleY();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RICH_TEXT__X = eINSTANCE.getRichText_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RICH_TEXT__Y = eINSTANCE.getRichText_Y();

		/**
		 * The meta object literal for the '<em><b>Blend Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RICH_TEXT__BLEND_MODE = eINSTANCE.getRichText_BlendMode();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RICH_TEXT__ALPHA = eINSTANCE.getRichText_Alpha();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RICH_TEXT__ID = eINSTANCE.getRichText_Id();

		/**
		 * The meta object literal for the '<em><b>Mask Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RICH_TEXT__MASK_TYPE = eINSTANCE.getRichText_MaskType();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RICH_TEXT__VISIBLE = eINSTANCE.getRichText_Visible();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RICH_TEXT__WIDTH = eINSTANCE.getRichText_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RICH_TEXT__HEIGHT = eINSTANCE.getRichText_Height();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_TEXT__CONTENT = eINSTANCE.getRichText_Content();

		/**
		 * The meta object literal for the '<em><b>tempcontent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RICH_TEXT__TEMPCONTENT = eINSTANCE.getRichText__tempcontent();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContent <em>Rich Text Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContent
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getRichTextContent()
		 * @generated
		 */
		EClass RICH_TEXT_CONTENT = eINSTANCE.getRichTextContent();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextContentContainerImpl <em>Rich Text Content Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextContentContainerImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getRichTextContentContainer()
		 * @generated
		 */
		EClass RICH_TEXT_CONTENT_CONTAINER = eINSTANCE.getRichTextContentContainer();

		/**
		 * The meta object literal for the '<em><b>children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_TEXT_CONTENT_CONTAINER__CHILDREN = eINSTANCE.getRichTextContentContainer__children();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes <em>Paragraph Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getParagraphAttributes()
		 * @generated
		 */
		EClass PARAGRAPH_ATTRIBUTES = eINSTANCE.getParagraphAttributes();

		/**
		 * The meta object literal for the '<em><b>Text Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH_ATTRIBUTES__TEXT_ALIGN = eINSTANCE.getParagraphAttributes_TextAlign();

		/**
		 * The meta object literal for the '<em><b>Text Align Last</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH_ATTRIBUTES__TEXT_ALIGN_LAST = eINSTANCE.getParagraphAttributes_TextAlignLast();

		/**
		 * The meta object literal for the '<em><b>Text Indent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH_ATTRIBUTES__TEXT_INDENT = eINSTANCE.getParagraphAttributes_TextIndent();

		/**
		 * The meta object literal for the '<em><b>Paragraph Start Indent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH_ATTRIBUTES__PARAGRAPH_START_INDENT = eINSTANCE.getParagraphAttributes_ParagraphStartIndent();

		/**
		 * The meta object literal for the '<em><b>Paragraph End Indent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH_ATTRIBUTES__PARAGRAPH_END_INDENT = eINSTANCE.getParagraphAttributes_ParagraphEndIndent();

		/**
		 * The meta object literal for the '<em><b>Paragraph Space Before</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH_ATTRIBUTES__PARAGRAPH_SPACE_BEFORE = eINSTANCE.getParagraphAttributes_ParagraphSpaceBefore();

		/**
		 * The meta object literal for the '<em><b>Paragraph Space After</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH_ATTRIBUTES__PARAGRAPH_SPACE_AFTER = eINSTANCE.getParagraphAttributes_ParagraphSpaceAfter();

		/**
		 * The meta object literal for the '<em><b>Justification Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH_ATTRIBUTES__JUSTIFICATION_RULE = eINSTANCE.getParagraphAttributes_JustificationRule();

		/**
		 * The meta object literal for the '<em><b>Justification Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH_ATTRIBUTES__JUSTIFICATION_STYLE = eINSTANCE.getParagraphAttributes_JustificationStyle();

		/**
		 * The meta object literal for the '<em><b>Text Justify</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH_ATTRIBUTES__TEXT_JUSTIFY = eINSTANCE.getParagraphAttributes_TextJustify();

		/**
		 * The meta object literal for the '<em><b>Leading Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH_ATTRIBUTES__LEADING_MODEL = eINSTANCE.getParagraphAttributes_LeadingModel();

		/**
		 * The meta object literal for the '<em><b>Tab Stops</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH_ATTRIBUTES__TAB_STOPS = eINSTANCE.getParagraphAttributes_TabStops();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes <em>Container Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getContainerAttributes()
		 * @generated
		 */
		EClass CONTAINER_ATTRIBUTES = eINSTANCE.getContainerAttributes();

		/**
		 * The meta object literal for the '<em><b>Block Progression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ATTRIBUTES__BLOCK_PROGRESSION = eINSTANCE.getContainerAttributes_BlockProgression();

		/**
		 * The meta object literal for the '<em><b>Padding Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ATTRIBUTES__PADDING_LEFT = eINSTANCE.getContainerAttributes_PaddingLeft();

		/**
		 * The meta object literal for the '<em><b>Padding Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ATTRIBUTES__PADDING_RIGHT = eINSTANCE.getContainerAttributes_PaddingRight();

		/**
		 * The meta object literal for the '<em><b>Padding Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ATTRIBUTES__PADDING_TOP = eINSTANCE.getContainerAttributes_PaddingTop();

		/**
		 * The meta object literal for the '<em><b>Padding Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ATTRIBUTES__PADDING_BOTTOM = eINSTANCE.getContainerAttributes_PaddingBottom();

		/**
		 * The meta object literal for the '<em><b>Column Gap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ATTRIBUTES__COLUMN_GAP = eINSTANCE.getContainerAttributes_ColumnGap();

		/**
		 * The meta object literal for the '<em><b>Column Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ATTRIBUTES__COLUMN_COUNT = eINSTANCE.getContainerAttributes_ColumnCount();

		/**
		 * The meta object literal for the '<em><b>Column Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ATTRIBUTES__COLUMN_WIDTH = eINSTANCE.getContainerAttributes_ColumnWidth();

		/**
		 * The meta object literal for the '<em><b>First Baseline Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ATTRIBUTES__FIRST_BASELINE_OFFSET = eINSTANCE.getContainerAttributes_FirstBaselineOffset();

		/**
		 * The meta object literal for the '<em><b>Vertical Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ATTRIBUTES__VERTICAL_ALIGN = eINSTANCE.getContainerAttributes_VerticalAlign();

		/**
		 * The meta object literal for the '<em><b>Line Break</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_ATTRIBUTES__LINE_BREAK = eINSTANCE.getContainerAttributes_LineBreak();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes <em>Character Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getCharacterAttributes()
		 * @generated
		 */
		EClass CHARACTER_ATTRIBUTES = eINSTANCE.getCharacterAttributes();

		/**
		 * The meta object literal for the '<em><b>Font Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__FONT_FAMILY = eINSTANCE.getCharacterAttributes_FontFamily();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__FONT_SIZE = eINSTANCE.getCharacterAttributes_FontSize();

		/**
		 * The meta object literal for the '<em><b>Font Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__FONT_STYLE = eINSTANCE.getCharacterAttributes_FontStyle();

		/**
		 * The meta object literal for the '<em><b>Font Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__FONT_WEIGHT = eINSTANCE.getCharacterAttributes_FontWeight();

		/**
		 * The meta object literal for the '<em><b>Line Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__LINE_HEIGHT = eINSTANCE.getCharacterAttributes_LineHeight();

		/**
		 * The meta object literal for the '<em><b>Text Decoration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__TEXT_DECORATION = eINSTANCE.getCharacterAttributes_TextDecoration();

		/**
		 * The meta object literal for the '<em><b>Line Through</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__LINE_THROUGH = eINSTANCE.getCharacterAttributes_LineThrough();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__COLOR = eINSTANCE.getCharacterAttributes_Color();

		/**
		 * The meta object literal for the '<em><b>Text Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__TEXT_ALPHA = eINSTANCE.getCharacterAttributes_TextAlpha();

		/**
		 * The meta object literal for the '<em><b>White Space Collapse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__WHITE_SPACE_COLLAPSE = eINSTANCE.getCharacterAttributes_WhiteSpaceCollapse();

		/**
		 * The meta object literal for the '<em><b>Kerning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__KERNING = eINSTANCE.getCharacterAttributes_Kerning();

		/**
		 * The meta object literal for the '<em><b>Background Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__BACKGROUND_ALPHA = eINSTANCE.getCharacterAttributes_BackgroundAlpha();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__BACKGROUND_COLOR = eINSTANCE.getCharacterAttributes_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Baseline Shift</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__BASELINE_SHIFT = eINSTANCE.getCharacterAttributes_BaselineShift();

		/**
		 * The meta object literal for the '<em><b>Break Opportunity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__BREAK_OPPORTUNITY = eINSTANCE.getCharacterAttributes_BreakOpportunity();

		/**
		 * The meta object literal for the '<em><b>Digit Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__DIGIT_CASE = eINSTANCE.getCharacterAttributes_DigitCase();

		/**
		 * The meta object literal for the '<em><b>Digit Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__DIGIT_WIDTH = eINSTANCE.getCharacterAttributes_DigitWidth();

		/**
		 * The meta object literal for the '<em><b>Dominant Baseline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__DOMINANT_BASELINE = eINSTANCE.getCharacterAttributes_DominantBaseline();

		/**
		 * The meta object literal for the '<em><b>Alignment Baseline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__ALIGNMENT_BASELINE = eINSTANCE.getCharacterAttributes_AlignmentBaseline();

		/**
		 * The meta object literal for the '<em><b>Ligature Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__LIGATURE_LEVEL = eINSTANCE.getCharacterAttributes_LigatureLevel();

		/**
		 * The meta object literal for the '<em><b>Locale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__LOCALE = eINSTANCE.getCharacterAttributes_Locale();

		/**
		 * The meta object literal for the '<em><b>Typographic Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__TYPOGRAPHIC_CASE = eINSTANCE.getCharacterAttributes_TypographicCase();

		/**
		 * The meta object literal for the '<em><b>Text Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__TEXT_ROTATION = eINSTANCE.getCharacterAttributes_TextRotation();

		/**
		 * The meta object literal for the '<em><b>Tracking Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__TRACKING_LEFT = eINSTANCE.getCharacterAttributes_TrackingLeft();

		/**
		 * The meta object literal for the '<em><b>Tracking Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_ATTRIBUTES__TRACKING_RIGHT = eINSTANCE.getCharacterAttributes_TrackingRight();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.rawtextImpl <em>rawtext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.rawtextImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getrawtext()
		 * @generated
		 */
		EClass RAWTEXT = eINSTANCE.getrawtext();

		/**
		 * The meta object literal for the '<em><b>text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAWTEXT__TEXT = eINSTANCE.getrawtext__text();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.divImpl <em>div</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.divImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getdiv()
		 * @generated
		 */
		EClass DIV = eINSTANCE.getdiv();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.pImpl <em>p</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.pImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getp()
		 * @generated
		 */
		EClass P = eINSTANCE.getp();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.tcyImpl <em>tcy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.tcyImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#gettcy()
		 * @generated
		 */
		EClass TCY = eINSTANCE.gettcy();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.aImpl <em>a</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.aImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#geta()
		 * @generated
		 */
		EClass A = eINSTANCE.geta();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.imgImpl <em>img</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.imgImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getimg()
		 * @generated
		 */
		EClass IMG = eINSTANCE.getimg();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.spanImpl <em>span</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.spanImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getspan()
		 * @generated
		 */
		EClass SPAN = eINSTANCE.getspan();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.brImpl <em>br</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.brImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getbr()
		 * @generated
		 */
		EClass BR = eINSTANCE.getbr();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.tabImpl <em>tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.tabImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#gettab()
		 * @generated
		 */
		EClass TAB = eINSTANCE.gettab();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.linkNormalFormatImpl <em>link Normal Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.linkNormalFormatImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getlinkNormalFormat()
		 * @generated
		 */
		EClass LINK_NORMAL_FORMAT = eINSTANCE.getlinkNormalFormat();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.linkHoverFormatImpl <em>link Hover Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.linkHoverFormatImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getlinkHoverFormat()
		 * @generated
		 */
		EClass LINK_HOVER_FORMAT = eINSTANCE.getlinkHoverFormat();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.linkActiveFormatImpl <em>link Active Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.linkActiveFormatImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getlinkActiveFormat()
		 * @generated
		 */
		EClass LINK_ACTIVE_FORMAT = eINSTANCE.getlinkActiveFormat();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapImageImpl <em>Bitmap Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapImageImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getBitmapImage()
		 * @generated
		 */
		EClass BITMAP_IMAGE = eINSTANCE.getBitmapImage();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_IMAGE__X = eINSTANCE.getBitmapImage_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_IMAGE__Y = eINSTANCE.getBitmapImage_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_IMAGE__WIDTH = eINSTANCE.getBitmapImage_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_IMAGE__HEIGHT = eINSTANCE.getBitmapImage_Height();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_IMAGE__ROTATION = eINSTANCE.getBitmapImage_Rotation();

		/**
		 * The meta object literal for the '<em><b>Scale X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_IMAGE__SCALE_X = eINSTANCE.getBitmapImage_ScaleX();

		/**
		 * The meta object literal for the '<em><b>Scale Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_IMAGE__SCALE_Y = eINSTANCE.getBitmapImage_ScaleY();

		/**
		 * The meta object literal for the '<em><b>Fill Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_IMAGE__FILL_MODE = eINSTANCE.getBitmapImage_FillMode();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_IMAGE__SOURCE = eINSTANCE.getBitmapImage_Source();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_IMAGE__VISIBLE = eINSTANCE.getBitmapImage_Visible();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_IMAGE__ALPHA = eINSTANCE.getBitmapImage_Alpha();

		/**
		 * The meta object literal for the '<em><b>Blend Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_IMAGE__BLEND_MODE = eINSTANCE.getBitmapImage_BlendMode();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Fill <em>Fill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Fill
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getFill()
		 * @generated
		 */
		EClass FILL = eINSTANCE.getFill();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.SolidColorImpl <em>Solid Color</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.SolidColorImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getSolidColor()
		 * @generated
		 */
		EClass SOLID_COLOR = eINSTANCE.getSolidColor();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLID_COLOR__ALPHA = eINSTANCE.getSolidColor_Alpha();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLID_COLOR__COLOR = eINSTANCE.getSolidColor_Color();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LinearGradientImpl <em>Linear Gradient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.LinearGradientImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getLinearGradient()
		 * @generated
		 */
		EClass LINEAR_GRADIENT = eINSTANCE.getLinearGradient();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT__X = eINSTANCE.getLinearGradient_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT__Y = eINSTANCE.getLinearGradient_Y();

		/**
		 * The meta object literal for the '<em><b>Scale X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT__SCALE_X = eINSTANCE.getLinearGradient_ScaleX();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT__ROTATION = eINSTANCE.getLinearGradient_Rotation();

		/**
		 * The meta object literal for the '<em><b>Spread Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT__SPREAD_METHOD = eINSTANCE.getLinearGradient_SpreadMethod();

		/**
		 * The meta object literal for the '<em><b>Interpolation Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT__INTERPOLATION_METHOD = eINSTANCE.getLinearGradient_InterpolationMethod();

		/**
		 * The meta object literal for the '<em><b>Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINEAR_GRADIENT__MATRIX = eINSTANCE.getLinearGradient_Matrix();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientImpl <em>Radial Gradient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getRadialGradient()
		 * @generated
		 */
		EClass RADIAL_GRADIENT = eINSTANCE.getRadialGradient();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT__X = eINSTANCE.getRadialGradient_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT__Y = eINSTANCE.getRadialGradient_Y();

		/**
		 * The meta object literal for the '<em><b>Scale X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT__SCALE_X = eINSTANCE.getRadialGradient_ScaleX();

		/**
		 * The meta object literal for the '<em><b>Scale Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT__SCALE_Y = eINSTANCE.getRadialGradient_ScaleY();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT__ROTATION = eINSTANCE.getRadialGradient_Rotation();

		/**
		 * The meta object literal for the '<em><b>Spread Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT__SPREAD_METHOD = eINSTANCE.getRadialGradient_SpreadMethod();

		/**
		 * The meta object literal for the '<em><b>Interpolation Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT__INTERPOLATION_METHOD = eINSTANCE.getRadialGradient_InterpolationMethod();

		/**
		 * The meta object literal for the '<em><b>Focal Point Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT__FOCAL_POINT_RATIO = eINSTANCE.getRadialGradient_FocalPointRatio();

		/**
		 * The meta object literal for the '<em><b>Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADIAL_GRADIENT__MATRIX = eINSTANCE.getRadialGradient_Matrix();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapFillImpl <em>Bitmap Fill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.BitmapFillImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getBitmapFill()
		 * @generated
		 */
		EClass BITMAP_FILL = eINSTANCE.getBitmapFill();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_FILL__X = eINSTANCE.getBitmapFill_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_FILL__Y = eINSTANCE.getBitmapFill_Y();

		/**
		 * The meta object literal for the '<em><b>Scale X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_FILL__SCALE_X = eINSTANCE.getBitmapFill_ScaleX();

		/**
		 * The meta object literal for the '<em><b>Scale Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_FILL__SCALE_Y = eINSTANCE.getBitmapFill_ScaleY();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_FILL__ROTATION = eINSTANCE.getBitmapFill_Rotation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_FILL__SOURCE = eINSTANCE.getBitmapFill_Source();

		/**
		 * The meta object literal for the '<em><b>Fill Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP_FILL__FILL_MODE = eINSTANCE.getBitmapFill_FillMode();

		/**
		 * The meta object literal for the '<em><b>Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BITMAP_FILL__MATRIX = eINSTANCE.getBitmapFill_Matrix();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Stroke <em>Stroke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Stroke
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getStroke()
		 * @generated
		 */
		EClass STROKE = eINSTANCE.getStroke();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.SolidColorStrokeImpl <em>Solid Color Stroke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.SolidColorStrokeImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getSolidColorStroke()
		 * @generated
		 */
		EClass SOLID_COLOR_STROKE = eINSTANCE.getSolidColorStroke();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLID_COLOR_STROKE__ALPHA = eINSTANCE.getSolidColorStroke_Alpha();

		/**
		 * The meta object literal for the '<em><b>Caps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLID_COLOR_STROKE__CAPS = eINSTANCE.getSolidColorStroke_Caps();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLID_COLOR_STROKE__COLOR = eINSTANCE.getSolidColorStroke_Color();

		/**
		 * The meta object literal for the '<em><b>Joints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLID_COLOR_STROKE__JOINTS = eINSTANCE.getSolidColorStroke_Joints();

		/**
		 * The meta object literal for the '<em><b>Miter Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLID_COLOR_STROKE__MITER_LIMIT = eINSTANCE.getSolidColorStroke_MiterLimit();

		/**
		 * The meta object literal for the '<em><b>Pixel Hinting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLID_COLOR_STROKE__PIXEL_HINTING = eINSTANCE.getSolidColorStroke_PixelHinting();

		/**
		 * The meta object literal for the '<em><b>Scale Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLID_COLOR_STROKE__SCALE_MODE = eINSTANCE.getSolidColorStroke_ScaleMode();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLID_COLOR_STROKE__WEIGHT = eINSTANCE.getSolidColorStroke_Weight();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.LinearGradientStrokeImpl <em>Linear Gradient Stroke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.LinearGradientStrokeImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getLinearGradientStroke()
		 * @generated
		 */
		EClass LINEAR_GRADIENT_STROKE = eINSTANCE.getLinearGradientStroke();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_STROKE__X = eINSTANCE.getLinearGradientStroke_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_STROKE__Y = eINSTANCE.getLinearGradientStroke_Y();

		/**
		 * The meta object literal for the '<em><b>Scale X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_STROKE__SCALE_X = eINSTANCE.getLinearGradientStroke_ScaleX();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_STROKE__ROTATION = eINSTANCE.getLinearGradientStroke_Rotation();

		/**
		 * The meta object literal for the '<em><b>Spread Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_STROKE__SPREAD_METHOD = eINSTANCE.getLinearGradientStroke_SpreadMethod();

		/**
		 * The meta object literal for the '<em><b>Interpolation Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_STROKE__INTERPOLATION_METHOD = eINSTANCE.getLinearGradientStroke_InterpolationMethod();

		/**
		 * The meta object literal for the '<em><b>Scale Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_STROKE__SCALE_MODE = eINSTANCE.getLinearGradientStroke_ScaleMode();

		/**
		 * The meta object literal for the '<em><b>Caps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_STROKE__CAPS = eINSTANCE.getLinearGradientStroke_Caps();

		/**
		 * The meta object literal for the '<em><b>Joints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_STROKE__JOINTS = eINSTANCE.getLinearGradientStroke_Joints();

		/**
		 * The meta object literal for the '<em><b>Miter Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_STROKE__MITER_LIMIT = eINSTANCE.getLinearGradientStroke_MiterLimit();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_STROKE__WEIGHT = eINSTANCE.getLinearGradientStroke_Weight();

		/**
		 * The meta object literal for the '<em><b>Pixel Hinting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_GRADIENT_STROKE__PIXEL_HINTING = eINSTANCE.getLinearGradientStroke_PixelHinting();

		/**
		 * The meta object literal for the '<em><b>Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINEAR_GRADIENT_STROKE__MATRIX = eINSTANCE.getLinearGradientStroke_Matrix();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl <em>Radial Gradient Stroke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.RadialGradientStrokeImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getRadialGradientStroke()
		 * @generated
		 */
		EClass RADIAL_GRADIENT_STROKE = eINSTANCE.getRadialGradientStroke();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_STROKE__X = eINSTANCE.getRadialGradientStroke_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_STROKE__Y = eINSTANCE.getRadialGradientStroke_Y();

		/**
		 * The meta object literal for the '<em><b>Scale X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_STROKE__SCALE_X = eINSTANCE.getRadialGradientStroke_ScaleX();

		/**
		 * The meta object literal for the '<em><b>Scale Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_STROKE__SCALE_Y = eINSTANCE.getRadialGradientStroke_ScaleY();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_STROKE__ROTATION = eINSTANCE.getRadialGradientStroke_Rotation();

		/**
		 * The meta object literal for the '<em><b>Spread Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_STROKE__SPREAD_METHOD = eINSTANCE.getRadialGradientStroke_SpreadMethod();

		/**
		 * The meta object literal for the '<em><b>Interpolation Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_STROKE__INTERPOLATION_METHOD = eINSTANCE.getRadialGradientStroke_InterpolationMethod();

		/**
		 * The meta object literal for the '<em><b>Focal Point Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_STROKE__FOCAL_POINT_RATIO = eINSTANCE.getRadialGradientStroke_FocalPointRatio();

		/**
		 * The meta object literal for the '<em><b>Scale Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_STROKE__SCALE_MODE = eINSTANCE.getRadialGradientStroke_ScaleMode();

		/**
		 * The meta object literal for the '<em><b>Caps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_STROKE__CAPS = eINSTANCE.getRadialGradientStroke_Caps();

		/**
		 * The meta object literal for the '<em><b>Joints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_STROKE__JOINTS = eINSTANCE.getRadialGradientStroke_Joints();

		/**
		 * The meta object literal for the '<em><b>Miter Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_STROKE__MITER_LIMIT = eINSTANCE.getRadialGradientStroke_MiterLimit();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_STROKE__WEIGHT = eINSTANCE.getRadialGradientStroke_Weight();

		/**
		 * The meta object literal for the '<em><b>Pixel Hinting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIAL_GRADIENT_STROKE__PIXEL_HINTING = eINSTANCE.getRadialGradientStroke_PixelHinting();

		/**
		 * The meta object literal for the '<em><b>Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RADIAL_GRADIENT_STROKE__MATRIX = eINSTANCE.getRadialGradientStroke_Matrix();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GradientEntryImpl <em>Gradient Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.GradientEntryImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getGradientEntry()
		 * @generated
		 */
		EClass GRADIENT_ENTRY = eINSTANCE.getGradientEntry();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_ENTRY__COLOR = eINSTANCE.getGradientEntry_Color();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_ENTRY__ALPHA = eINSTANCE.getGradientEntry_Alpha();

		/**
		 * The meta object literal for the '<em><b>Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_ENTRY__RATIO = eINSTANCE.getGradientEntry_Ratio();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.ColorTransformImpl <em>Color Transform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.ColorTransformImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getColorTransform()
		 * @generated
		 */
		EClass COLOR_TRANSFORM = eINSTANCE.getColorTransform();

		/**
		 * The meta object literal for the '<em><b>Alpha Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_TRANSFORM__ALPHA_MULTIPLIER = eINSTANCE.getColorTransform_AlphaMultiplier();

		/**
		 * The meta object literal for the '<em><b>Alpha Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_TRANSFORM__ALPHA_OFFSET = eINSTANCE.getColorTransform_AlphaOffset();

		/**
		 * The meta object literal for the '<em><b>Blue Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_TRANSFORM__BLUE_MULTIPLIER = eINSTANCE.getColorTransform_BlueMultiplier();

		/**
		 * The meta object literal for the '<em><b>Blue Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_TRANSFORM__BLUE_OFFSET = eINSTANCE.getColorTransform_BlueOffset();

		/**
		 * The meta object literal for the '<em><b>Green Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_TRANSFORM__GREEN_MULTIPLIER = eINSTANCE.getColorTransform_GreenMultiplier();

		/**
		 * The meta object literal for the '<em><b>Green Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_TRANSFORM__GREEN_OFFSET = eINSTANCE.getColorTransform_GreenOffset();

		/**
		 * The meta object literal for the '<em><b>Red Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_TRANSFORM__RED_MULTIPLIER = eINSTANCE.getColorTransform_RedMultiplier();

		/**
		 * The meta object literal for the '<em><b>Red Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_TRANSFORM__RED_OFFSET = eINSTANCE.getColorTransform_RedOffset();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Filter <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Filter
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BlurFilterImpl <em>Blur Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.BlurFilterImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getBlurFilter()
		 * @generated
		 */
		EClass BLUR_FILTER = eINSTANCE.getBlurFilter();

		/**
		 * The meta object literal for the '<em><b>Blur X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUR_FILTER__BLUR_X = eINSTANCE.getBlurFilter_BlurX();

		/**
		 * The meta object literal for the '<em><b>Blur Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUR_FILTER__BLUR_Y = eINSTANCE.getBlurFilter_BlurY();

		/**
		 * The meta object literal for the '<em><b>Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUR_FILTER__QUALITY = eINSTANCE.getBlurFilter_Quality();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.DropShadowFilterImpl <em>Drop Shadow Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.DropShadowFilterImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getDropShadowFilter()
		 * @generated
		 */
		EClass DROP_SHADOW_FILTER = eINSTANCE.getDropShadowFilter();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_SHADOW_FILTER__ALPHA = eINSTANCE.getDropShadowFilter_Alpha();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_SHADOW_FILTER__ANGLE = eINSTANCE.getDropShadowFilter_Angle();

		/**
		 * The meta object literal for the '<em><b>Blur X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_SHADOW_FILTER__BLUR_X = eINSTANCE.getDropShadowFilter_BlurX();

		/**
		 * The meta object literal for the '<em><b>Blur Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_SHADOW_FILTER__BLUR_Y = eINSTANCE.getDropShadowFilter_BlurY();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_SHADOW_FILTER__COLOR = eINSTANCE.getDropShadowFilter_Color();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_SHADOW_FILTER__DISTANCE = eINSTANCE.getDropShadowFilter_Distance();

		/**
		 * The meta object literal for the '<em><b>Inner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_SHADOW_FILTER__INNER = eINSTANCE.getDropShadowFilter_Inner();

		/**
		 * The meta object literal for the '<em><b>Hide Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_SHADOW_FILTER__HIDE_OBJECT = eINSTANCE.getDropShadowFilter_HideObject();

		/**
		 * The meta object literal for the '<em><b>Knockout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_SHADOW_FILTER__KNOCKOUT = eINSTANCE.getDropShadowFilter_Knockout();

		/**
		 * The meta object literal for the '<em><b>Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_SHADOW_FILTER__QUALITY = eINSTANCE.getDropShadowFilter_Quality();

		/**
		 * The meta object literal for the '<em><b>Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_SHADOW_FILTER__STRENGTH = eINSTANCE.getDropShadowFilter_Strength();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.BevelFilterImpl <em>Bevel Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.BevelFilterImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getBevelFilter()
		 * @generated
		 */
		EClass BEVEL_FILTER = eINSTANCE.getBevelFilter();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEVEL_FILTER__ANGLE = eINSTANCE.getBevelFilter_Angle();

		/**
		 * The meta object literal for the '<em><b>Blur X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEVEL_FILTER__BLUR_X = eINSTANCE.getBevelFilter_BlurX();

		/**
		 * The meta object literal for the '<em><b>Blur Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEVEL_FILTER__BLUR_Y = eINSTANCE.getBevelFilter_BlurY();

		/**
		 * The meta object literal for the '<em><b>Highlight Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEVEL_FILTER__HIGHLIGHT_ALPHA = eINSTANCE.getBevelFilter_HighlightAlpha();

		/**
		 * The meta object literal for the '<em><b>Highlight Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEVEL_FILTER__HIGHLIGHT_COLOR = eINSTANCE.getBevelFilter_HighlightColor();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEVEL_FILTER__DISTANCE = eINSTANCE.getBevelFilter_Distance();

		/**
		 * The meta object literal for the '<em><b>Knockout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEVEL_FILTER__KNOCKOUT = eINSTANCE.getBevelFilter_Knockout();

		/**
		 * The meta object literal for the '<em><b>Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEVEL_FILTER__QUALITY = eINSTANCE.getBevelFilter_Quality();

		/**
		 * The meta object literal for the '<em><b>Shadow Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEVEL_FILTER__SHADOW_ALPHA = eINSTANCE.getBevelFilter_ShadowAlpha();

		/**
		 * The meta object literal for the '<em><b>Shadow Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEVEL_FILTER__SHADOW_COLOR = eINSTANCE.getBevelFilter_ShadowColor();

		/**
		 * The meta object literal for the '<em><b>Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEVEL_FILTER__STRENGTH = eINSTANCE.getBevelFilter_Strength();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEVEL_FILTER__TYPE = eINSTANCE.getBevelFilter_Type();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GradientGlowFilterImpl <em>Gradient Glow Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.GradientGlowFilterImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getGradientGlowFilter()
		 * @generated
		 */
		EClass GRADIENT_GLOW_FILTER = eINSTANCE.getGradientGlowFilter();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_GLOW_FILTER__ANGLE = eINSTANCE.getGradientGlowFilter_Angle();

		/**
		 * The meta object literal for the '<em><b>Blur X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_GLOW_FILTER__BLUR_X = eINSTANCE.getGradientGlowFilter_BlurX();

		/**
		 * The meta object literal for the '<em><b>Blur Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_GLOW_FILTER__BLUR_Y = eINSTANCE.getGradientGlowFilter_BlurY();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_GLOW_FILTER__DISTANCE = eINSTANCE.getGradientGlowFilter_Distance();

		/**
		 * The meta object literal for the '<em><b>Inner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_GLOW_FILTER__INNER = eINSTANCE.getGradientGlowFilter_Inner();

		/**
		 * The meta object literal for the '<em><b>Knockout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_GLOW_FILTER__KNOCKOUT = eINSTANCE.getGradientGlowFilter_Knockout();

		/**
		 * The meta object literal for the '<em><b>Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_GLOW_FILTER__QUALITY = eINSTANCE.getGradientGlowFilter_Quality();

		/**
		 * The meta object literal for the '<em><b>Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_GLOW_FILTER__STRENGTH = eINSTANCE.getGradientGlowFilter_Strength();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.GradientBevelFilterImpl <em>Gradient Bevel Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.GradientBevelFilterImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getGradientBevelFilter()
		 * @generated
		 */
		EClass GRADIENT_BEVEL_FILTER = eINSTANCE.getGradientBevelFilter();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_BEVEL_FILTER__ANGLE = eINSTANCE.getGradientBevelFilter_Angle();

		/**
		 * The meta object literal for the '<em><b>Blur X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_BEVEL_FILTER__BLUR_X = eINSTANCE.getGradientBevelFilter_BlurX();

		/**
		 * The meta object literal for the '<em><b>Blur Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_BEVEL_FILTER__BLUR_Y = eINSTANCE.getGradientBevelFilter_BlurY();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_BEVEL_FILTER__DISTANCE = eINSTANCE.getGradientBevelFilter_Distance();

		/**
		 * The meta object literal for the '<em><b>Knockout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_BEVEL_FILTER__KNOCKOUT = eINSTANCE.getGradientBevelFilter_Knockout();

		/**
		 * The meta object literal for the '<em><b>Quality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_BEVEL_FILTER__QUALITY = eINSTANCE.getGradientBevelFilter_Quality();

		/**
		 * The meta object literal for the '<em><b>Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_BEVEL_FILTER__STRENGTH = eINSTANCE.getGradientBevelFilter_Strength();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADIENT_BEVEL_FILTER__TYPE = eINSTANCE.getGradientBevelFilter_Type();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.ColorMatrixFilterImpl <em>Color Matrix Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.ColorMatrixFilterImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getColorMatrixFilter()
		 * @generated
		 */
		EClass COLOR_MATRIX_FILTER = eINSTANCE.getColorMatrixFilter();

		/**
		 * The meta object literal for the '<em><b>Matrix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_MATRIX_FILTER__MATRIX = eINSTANCE.getColorMatrixFilter_Matrix();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.FXGElement <em>FXG Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FXGElement
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getFXGElement()
		 * @generated
		 */
		EClass FXG_ELEMENT = eINSTANCE.getFXGElement();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.ContainerElementImpl <em>Container Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.ContainerElementImpl
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getContainerElement()
		 * @generated
		 */
		EClass CONTAINER_ELEMENT = eINSTANCE.getContainerElement();

		/**
		 * The meta object literal for the '<em><b>children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ELEMENT__CHILDREN = eINSTANCE.getContainerElement__children();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BlendMode <em>Blend Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BlendMode
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getBlendMode()
		 * @generated
		 */
		EEnum BLEND_MODE = eINSTANCE.getBlendMode();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Winding <em>Winding</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Winding
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getWinding()
		 * @generated
		 */
		EEnum WINDING = eINSTANCE.getWinding();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.MaskType <em>Mask Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.MaskType
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getMaskType()
		 * @generated
		 */
		EEnum MASK_TYPE = eINSTANCE.getMaskType();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.FontStyle <em>Font Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FontStyle
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getFontStyle()
		 * @generated
		 */
		EEnum FONT_STYLE = eINSTANCE.getFontStyle();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.FontWeight <em>Font Weight</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FontWeight
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getFontWeight()
		 * @generated
		 */
		EEnum FONT_WEIGHT = eINSTANCE.getFontWeight();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.TextDecoration <em>Text Decoration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TextDecoration
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getTextDecoration()
		 * @generated
		 */
		EEnum TEXT_DECORATION = eINSTANCE.getTextDecoration();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.WhitespaceCollapse <em>Whitespace Collapse</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.WhitespaceCollapse
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getWhitespaceCollapse()
		 * @generated
		 */
		EEnum WHITESPACE_COLLAPSE = eINSTANCE.getWhitespaceCollapse();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Kerning <em>Kerning</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Kerning
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getKerning()
		 * @generated
		 */
		EEnum KERNING = eINSTANCE.getKerning();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SpreadMethod <em>Spread Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.SpreadMethod
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getSpreadMethod()
		 * @generated
		 */
		EEnum SPREAD_METHOD = eINSTANCE.getSpreadMethod();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.InterpolationMethod <em>Interpolation Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.InterpolationMethod
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getInterpolationMethod()
		 * @generated
		 */
		EEnum INTERPOLATION_METHOD = eINSTANCE.getInterpolationMethod();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Cap <em>Cap</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Cap
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getCap()
		 * @generated
		 */
		EEnum CAP = eINSTANCE.getCap();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Joint <em>Joint</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Joint
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getJoint()
		 * @generated
		 */
		EEnum JOINT = eINSTANCE.getJoint();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ScaleMode <em>Scale Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ScaleMode
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getScaleMode()
		 * @generated
		 */
		EEnum SCALE_MODE = eINSTANCE.getScaleMode();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilterType <em>Bevel Filter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilterType
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getBevelFilterType()
		 * @generated
		 */
		EEnum BEVEL_FILTER_TYPE = eINSTANCE.getBevelFilterType();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.FillMode <em>Fill Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FillMode
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getFillMode()
		 * @generated
		 */
		EEnum FILL_MODE = eINSTANCE.getFillMode();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.TextAlign <em>Text Align</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TextAlign
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getTextAlign()
		 * @generated
		 */
		EEnum TEXT_ALIGN = eINSTANCE.getTextAlign();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.JustificationRule <em>Justification Rule</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.JustificationRule
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getJustificationRule()
		 * @generated
		 */
		EEnum JUSTIFICATION_RULE = eINSTANCE.getJustificationRule();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.JustificationStyle <em>Justification Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.JustificationStyle
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getJustificationStyle()
		 * @generated
		 */
		EEnum JUSTIFICATION_STYLE = eINSTANCE.getJustificationStyle();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.TextJustify <em>Text Justify</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TextJustify
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getTextJustify()
		 * @generated
		 */
		EEnum TEXT_JUSTIFY = eINSTANCE.getTextJustify();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LeadingModel <em>Leading Model</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LeadingModel
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getLeadingModel()
		 * @generated
		 */
		EEnum LEADING_MODEL = eINSTANCE.getLeadingModel();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BlockProgression <em>Block Progression</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BlockProgression
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getBlockProgression()
		 * @generated
		 */
		EEnum BLOCK_PROGRESSION = eINSTANCE.getBlockProgression();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.VerticalAlign <em>Vertical Align</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.VerticalAlign
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getVerticalAlign()
		 * @generated
		 */
		EEnum VERTICAL_ALIGN = eINSTANCE.getVerticalAlign();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LineBreak <em>Line Break</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LineBreak
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getLineBreak()
		 * @generated
		 */
		EEnum LINE_BREAK = eINSTANCE.getLineBreak();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BreakOpportunity <em>Break Opportunity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BreakOpportunity
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getBreakOpportunity()
		 * @generated
		 */
		EEnum BREAK_OPPORTUNITY = eINSTANCE.getBreakOpportunity();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DigitCase <em>Digit Case</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DigitCase
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getDigitCase()
		 * @generated
		 */
		EEnum DIGIT_CASE = eINSTANCE.getDigitCase();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DigitWidth <em>Digit Width</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DigitWidth
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getDigitWidth()
		 * @generated
		 */
		EEnum DIGIT_WIDTH = eINSTANCE.getDigitWidth();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DominantBaseline <em>Dominant Baseline</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DominantBaseline
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getDominantBaseline()
		 * @generated
		 */
		EEnum DOMINANT_BASELINE = eINSTANCE.getDominantBaseline();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.AlignmentBaseline <em>Alignment Baseline</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.AlignmentBaseline
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getAlignmentBaseline()
		 * @generated
		 */
		EEnum ALIGNMENT_BASELINE = eINSTANCE.getAlignmentBaseline();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LigatureLevel <em>Ligature Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LigatureLevel
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getLigatureLevel()
		 * @generated
		 */
		EEnum LIGATURE_LEVEL = eINSTANCE.getLigatureLevel();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.TypographicCase <em>Typographic Case</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TypographicCase
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getTypographicCase()
		 * @generated
		 */
		EEnum TYPOGRAPHIC_CASE = eINSTANCE.getTypographicCase();

		/**
		 * The meta object literal for the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.TextRotation <em>Text Rotation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TextRotation
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getTextRotation()
		 * @generated
		 */
		EEnum TEXT_ROTATION = eINSTANCE.getTextRotation();

		/**
		 * The meta object literal for the '<em>Path Data</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getPathData()
		 * @generated
		 */
		EDataType PATH_DATA = eINSTANCE.getPathData();

		/**
		 * The meta object literal for the '<em>Angle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getAngle()
		 * @generated
		 */
		EDataType ANGLE = eINSTANCE.getAngle();

		/**
		 * The meta object literal for the '<em>Length</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getLength()
		 * @generated
		 */
		EDataType LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '<em>Percent</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getPercent()
		 * @generated
		 */
		EDataType PERCENT = eINSTANCE.getPercent();

		/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em>Alpha</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see at.bestsolution.efxclipse.formats.fxg.fxg.impl.FxgPackageImpl#getAlpha()
		 * @generated
		 */
		EDataType ALPHA = eINSTANCE.getAlpha();

	}

} //FxgPackage
