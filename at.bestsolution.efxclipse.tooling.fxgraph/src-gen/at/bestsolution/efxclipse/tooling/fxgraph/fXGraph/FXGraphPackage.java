/**
 */
package at.bestsolution.efxclipse.tooling.fxgraph.fXGraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FXGraphFactory
 * @model kind="package"
 * @generated
 */
public interface FXGraphPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fXGraph";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bestsolution.at/efxclipse/tooling/fxgraph/FXGraph";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fXGraph";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FXGraphPackage eINSTANCE = at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl.init();

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ModelImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Component Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COMPONENT_DEF = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.PackageDeclarationImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getPackageDeclaration()
   * @generated
   */
  int PACKAGE_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Package Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ImportImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ComponentDefinitionImpl <em>Component Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ComponentDefinitionImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getComponentDefinition()
   * @generated
   */
  int COMPONENT_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Controller</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__CONTROLLER = 1;

  /**
   * The feature id for the '<em><b>Preview Css Files</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__PREVIEW_CSS_FILES = 2;

  /**
   * The feature id for the '<em><b>Preview Resource Bundle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__PREVIEW_RESOURCE_BUNDLE = 3;

  /**
   * The feature id for the '<em><b>Preview Classpath Entries</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__PREVIEW_CLASSPATH_ENTRIES = 4;

  /**
   * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__SCRIPTS = 5;

  /**
   * The feature id for the '<em><b>Defines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__DEFINES = 6;

  /**
   * The feature id for the '<em><b>Root Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION__ROOT_NODE = 7;

  /**
   * The number of structural features of the '<em>Component Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_DEFINITION_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ValuePropertyImpl <em>Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ValuePropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getValueProperty()
   * @generated
   */
  int VALUE_PROPERTY = 9;

  /**
   * The number of structural features of the '<em>Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_PROPERTY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.SingleValuePropertyImpl <em>Single Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.SingleValuePropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getSingleValueProperty()
   * @generated
   */
  int SINGLE_VALUE_PROPERTY = 10;

  /**
   * The number of structural features of the '<em>Single Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_VALUE_PROPERTY_FEATURE_COUNT = VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ElementImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__TYPE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__VALUE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__PROPERTIES = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Static Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__STATIC_PROPERTIES = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Default Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__DEFAULT_CHILDREN = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Factory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__FACTORY = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__VALUES = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.DefineImpl <em>Define</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.DefineImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getDefine()
   * @generated
   */
  int DEFINE = 5;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE__ELEMENT = 0;

  /**
   * The number of structural features of the '<em>Define</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ScriptImpl <em>Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ScriptImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getScript()
   * @generated
   */
  int SCRIPT = 6;

  /**
   * The feature id for the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__LANGUAGE = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Sourcecode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__SOURCECODE = 2;

  /**
   * The number of structural features of the '<em>Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.StaticValuePropertyImpl <em>Static Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.StaticValuePropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getStaticValueProperty()
   * @generated
   */
  int STATIC_VALUE_PROPERTY = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_VALUE_PROPERTY__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_VALUE_PROPERTY__NAME = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_VALUE_PROPERTY__VALUE = 2;

  /**
   * The number of structural features of the '<em>Static Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_VALUE_PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.PropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 8;

  /**
   * The feature id for the '<em><b>Preview</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__PREVIEW = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__VALUE = 2;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.MultiValuePropertyImpl <em>Multi Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.MultiValuePropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getMultiValueProperty()
   * @generated
   */
  int MULTI_VALUE_PROPERTY = 11;

  /**
   * The number of structural features of the '<em>Multi Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_VALUE_PROPERTY_FEATURE_COUNT = VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ListValueElementImpl <em>List Value Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ListValueElementImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getListValueElement()
   * @generated
   */
  int LIST_VALUE_ELEMENT = 12;

  /**
   * The number of structural features of the '<em>List Value Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VALUE_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ListValuePropertyImpl <em>List Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ListValuePropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getListValueProperty()
   * @generated
   */
  int LIST_VALUE_PROPERTY = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VALUE_PROPERTY__VALUE = MULTI_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_VALUE_PROPERTY_FEATURE_COUNT = MULTI_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.MapValuePropertyImpl <em>Map Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.MapValuePropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getMapValueProperty()
   * @generated
   */
  int MAP_VALUE_PROPERTY = 14;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_VALUE_PROPERTY__PROPERTIES = MULTI_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Map Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_VALUE_PROPERTY_FEATURE_COUNT = MULTI_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.SimpleValuePropertyImpl <em>Simple Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.SimpleValuePropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getSimpleValueProperty()
   * @generated
   */
  int SIMPLE_VALUE_PROPERTY = 15;

  /**
   * The feature id for the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_VALUE_PROPERTY__STRING_VALUE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_VALUE_PROPERTY__BOOLEAN_VALUE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Negative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_VALUE_PROPERTY__NEGATIVE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_VALUE_PROPERTY__INT_VALUE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Real Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_VALUE_PROPERTY__REAL_VALUE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Simple Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_VALUE_PROPERTY_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ReferenceValuePropertyImpl <em>Reference Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ReferenceValuePropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getReferenceValueProperty()
   * @generated
   */
  int REFERENCE_VALUE_PROPERTY = 16;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_VALUE_PROPERTY__REFERENCE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reference Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_VALUE_PROPERTY_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.IncludeValuePropertyImpl <em>Include Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.IncludeValuePropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getIncludeValueProperty()
   * @generated
   */
  int INCLUDE_VALUE_PROPERTY = 17;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_VALUE_PROPERTY__SOURCE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Include Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_VALUE_PROPERTY_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.CopyValuePropertyImpl <em>Copy Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.CopyValuePropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getCopyValueProperty()
   * @generated
   */
  int COPY_VALUE_PROPERTY = 18;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COPY_VALUE_PROPERTY__REFERENCE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Copy Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COPY_VALUE_PROPERTY_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ControllerHandledValuePropertyImpl <em>Controller Handled Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ControllerHandledValuePropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getControllerHandledValueProperty()
   * @generated
   */
  int CONTROLLER_HANDLED_VALUE_PROPERTY = 19;

  /**
   * The feature id for the '<em><b>Methodname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER_HANDLED_VALUE_PROPERTY__METHODNAME = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Controller Handled Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROLLER_HANDLED_VALUE_PROPERTY_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ScriptHandlerHandledValuePropertyImpl <em>Script Handler Handled Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ScriptHandlerHandledValuePropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getScriptHandlerHandledValueProperty()
   * @generated
   */
  int SCRIPT_HANDLER_HANDLED_VALUE_PROPERTY = 20;

  /**
   * The feature id for the '<em><b>Functionname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_HANDLER_HANDLED_VALUE_PROPERTY__FUNCTIONNAME = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Script Handler Handled Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_HANDLER_HANDLED_VALUE_PROPERTY_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ScriptValueExpressionImpl <em>Script Value Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ScriptValueExpressionImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getScriptValueExpression()
   * @generated
   */
  int SCRIPT_VALUE_EXPRESSION = 21;

  /**
   * The feature id for the '<em><b>Sourcecode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_VALUE_EXPRESSION__SOURCECODE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Script Value Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_VALUE_EXPRESSION_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ScriptValueReferenceImpl <em>Script Value Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ScriptValueReferenceImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getScriptValueReference()
   * @generated
   */
  int SCRIPT_VALUE_REFERENCE = 22;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_VALUE_REFERENCE__REFERENCE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Script Value Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_VALUE_REFERENCE_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.LocationValuePropertyImpl <em>Location Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.LocationValuePropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getLocationValueProperty()
   * @generated
   */
  int LOCATION_VALUE_PROPERTY = 23;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_VALUE_PROPERTY__VALUE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Location Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCATION_VALUE_PROPERTY_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ResourceValuePropertyImpl <em>Resource Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ResourceValuePropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getResourceValueProperty()
   * @generated
   */
  int RESOURCE_VALUE_PROPERTY = 24;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_VALUE_PROPERTY__VALUE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Resource Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_VALUE_PROPERTY_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.BindValuePropertyImpl <em>Bind Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.BindValuePropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getBindValueProperty()
   * @generated
   */
  int BIND_VALUE_PROPERTY = 25;

  /**
   * The feature id for the '<em><b>Element Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_VALUE_PROPERTY__ELEMENT_REFERENCE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_VALUE_PROPERTY__ATTRIBUTE = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bind Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIND_VALUE_PROPERTY_FEATURE_COUNT = SINGLE_VALUE_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.StringValueImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 26;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model#getPackage()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Package();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model#getComponentDef <em>Component Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Component Def</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model#getComponentDef()
   * @see #getModel()
   * @generated
   */
  EReference getModel_ComponentDef();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.PackageDeclaration <em>Package Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Declaration</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.PackageDeclaration
   * @generated
   */
  EClass getPackageDeclaration();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.PackageDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.PackageDeclaration#getName()
   * @see #getPackageDeclaration()
   * @generated
   */
  EAttribute getPackageDeclaration_Name();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition <em>Component Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Definition</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition
   * @generated
   */
  EClass getComponentDefinition();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getName()
   * @see #getComponentDefinition()
   * @generated
   */
  EAttribute getComponentDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getController <em>Controller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Controller</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getController()
   * @see #getComponentDefinition()
   * @generated
   */
  EReference getComponentDefinition_Controller();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getPreviewCssFiles <em>Preview Css Files</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Preview Css Files</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getPreviewCssFiles()
   * @see #getComponentDefinition()
   * @generated
   */
  EAttribute getComponentDefinition_PreviewCssFiles();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getPreviewResourceBundle <em>Preview Resource Bundle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Preview Resource Bundle</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getPreviewResourceBundle()
   * @see #getComponentDefinition()
   * @generated
   */
  EAttribute getComponentDefinition_PreviewResourceBundle();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getPreviewClasspathEntries <em>Preview Classpath Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Preview Classpath Entries</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getPreviewClasspathEntries()
   * @see #getComponentDefinition()
   * @generated
   */
  EAttribute getComponentDefinition_PreviewClasspathEntries();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getScripts <em>Scripts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scripts</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getScripts()
   * @see #getComponentDefinition()
   * @generated
   */
  EReference getComponentDefinition_Scripts();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getDefines <em>Defines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Defines</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getDefines()
   * @see #getComponentDefinition()
   * @generated
   */
  EReference getComponentDefinition_Defines();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getRootNode <em>Root Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root Node</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition#getRootNode()
   * @see #getComponentDefinition()
   * @generated
   */
  EReference getComponentDefinition_RootNode();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getType()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Type();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getValue()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Value();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getProperties()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getStaticProperties <em>Static Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Static Properties</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getStaticProperties()
   * @see #getElement()
   * @generated
   */
  EReference getElement_StaticProperties();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getDefaultChildren <em>Default Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Default Children</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getDefaultChildren()
   * @see #getElement()
   * @generated
   */
  EReference getElement_DefaultChildren();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getFactory <em>Factory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Factory</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getFactory()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Factory();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getValues()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Values();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Define <em>Define</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Define</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Define
   * @generated
   */
  EClass getDefine();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Define#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Define#getElement()
   * @see #getDefine()
   * @generated
   */
  EReference getDefine_Element();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Script
   * @generated
   */
  EClass getScript();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Script#getLanguage <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Language</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Script#getLanguage()
   * @see #getScript()
   * @generated
   */
  EAttribute getScript_Language();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Script#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Script#getSource()
   * @see #getScript()
   * @generated
   */
  EAttribute getScript_Source();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Script#getSourcecode <em>Sourcecode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sourcecode</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Script#getSourcecode()
   * @see #getScript()
   * @generated
   */
  EAttribute getScript_Sourcecode();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticValueProperty <em>Static Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Value Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticValueProperty
   * @generated
   */
  EClass getStaticValueProperty();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticValueProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticValueProperty#getType()
   * @see #getStaticValueProperty()
   * @generated
   */
  EReference getStaticValueProperty_Type();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticValueProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticValueProperty#getName()
   * @see #getStaticValueProperty()
   * @generated
   */
  EAttribute getStaticValueProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticValueProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticValueProperty#getValue()
   * @see #getStaticValueProperty()
   * @generated
   */
  EReference getStaticValueProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property#isPreview <em>Preview</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Preview</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property#isPreview()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Preview();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property#getValue()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ValueProperty <em>Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ValueProperty
   * @generated
   */
  EClass getValueProperty();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SingleValueProperty <em>Single Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Value Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SingleValueProperty
   * @generated
   */
  EClass getSingleValueProperty();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.MultiValueProperty <em>Multi Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Value Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.MultiValueProperty
   * @generated
   */
  EClass getMultiValueProperty();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueElement <em>List Value Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Value Element</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueElement
   * @generated
   */
  EClass getListValueElement();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueProperty <em>List Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Value Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueProperty
   * @generated
   */
  EClass getListValueProperty();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueProperty#getValue()
   * @see #getListValueProperty()
   * @generated
   */
  EReference getListValueProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.MapValueProperty <em>Map Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Value Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.MapValueProperty
   * @generated
   */
  EClass getMapValueProperty();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.MapValueProperty#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.MapValueProperty#getProperties()
   * @see #getMapValueProperty()
   * @generated
   */
  EReference getMapValueProperty_Properties();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty <em>Simple Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Value Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty
   * @generated
   */
  EClass getSimpleValueProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty#getStringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty#getStringValue()
   * @see #getSimpleValueProperty()
   * @generated
   */
  EAttribute getSimpleValueProperty_StringValue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty#getBooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolean Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty#getBooleanValue()
   * @see #getSimpleValueProperty()
   * @generated
   */
  EAttribute getSimpleValueProperty_BooleanValue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty#isNegative <em>Negative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Negative</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty#isNegative()
   * @see #getSimpleValueProperty()
   * @generated
   */
  EAttribute getSimpleValueProperty_Negative();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty#getIntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty#getIntValue()
   * @see #getSimpleValueProperty()
   * @generated
   */
  EAttribute getSimpleValueProperty_IntValue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty#getRealValue <em>Real Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Real Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty#getRealValue()
   * @see #getSimpleValueProperty()
   * @generated
   */
  EAttribute getSimpleValueProperty_RealValue();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ReferenceValueProperty <em>Reference Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Value Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ReferenceValueProperty
   * @generated
   */
  EClass getReferenceValueProperty();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ReferenceValueProperty#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ReferenceValueProperty#getReference()
   * @see #getReferenceValueProperty()
   * @generated
   */
  EReference getReferenceValueProperty_Reference();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.IncludeValueProperty <em>Include Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include Value Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.IncludeValueProperty
   * @generated
   */
  EClass getIncludeValueProperty();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.IncludeValueProperty#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.IncludeValueProperty#getSource()
   * @see #getIncludeValueProperty()
   * @generated
   */
  EReference getIncludeValueProperty_Source();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.CopyValueProperty <em>Copy Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Copy Value Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.CopyValueProperty
   * @generated
   */
  EClass getCopyValueProperty();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.CopyValueProperty#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.CopyValueProperty#getReference()
   * @see #getCopyValueProperty()
   * @generated
   */
  EReference getCopyValueProperty_Reference();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ControllerHandledValueProperty <em>Controller Handled Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Controller Handled Value Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ControllerHandledValueProperty
   * @generated
   */
  EClass getControllerHandledValueProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ControllerHandledValueProperty#getMethodname <em>Methodname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Methodname</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ControllerHandledValueProperty#getMethodname()
   * @see #getControllerHandledValueProperty()
   * @generated
   */
  EAttribute getControllerHandledValueProperty_Methodname();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptHandlerHandledValueProperty <em>Script Handler Handled Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script Handler Handled Value Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptHandlerHandledValueProperty
   * @generated
   */
  EClass getScriptHandlerHandledValueProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptHandlerHandledValueProperty#getFunctionname <em>Functionname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Functionname</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptHandlerHandledValueProperty#getFunctionname()
   * @see #getScriptHandlerHandledValueProperty()
   * @generated
   */
  EAttribute getScriptHandlerHandledValueProperty_Functionname();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptValueExpression <em>Script Value Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script Value Expression</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptValueExpression
   * @generated
   */
  EClass getScriptValueExpression();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptValueExpression#getSourcecode <em>Sourcecode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sourcecode</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptValueExpression#getSourcecode()
   * @see #getScriptValueExpression()
   * @generated
   */
  EAttribute getScriptValueExpression_Sourcecode();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptValueReference <em>Script Value Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script Value Reference</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptValueReference
   * @generated
   */
  EClass getScriptValueReference();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptValueReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptValueReference#getReference()
   * @see #getScriptValueReference()
   * @generated
   */
  EAttribute getScriptValueReference_Reference();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.LocationValueProperty <em>Location Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Location Value Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.LocationValueProperty
   * @generated
   */
  EClass getLocationValueProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.LocationValueProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.LocationValueProperty#getValue()
   * @see #getLocationValueProperty()
   * @generated
   */
  EAttribute getLocationValueProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ResourceValueProperty <em>Resource Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Value Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ResourceValueProperty
   * @generated
   */
  EClass getResourceValueProperty();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ResourceValueProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ResourceValueProperty#getValue()
   * @see #getResourceValueProperty()
   * @generated
   */
  EReference getResourceValueProperty_Value();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.BindValueProperty <em>Bind Value Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bind Value Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.BindValueProperty
   * @generated
   */
  EClass getBindValueProperty();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.BindValueProperty#getElementReference <em>Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element Reference</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.BindValueProperty#getElementReference()
   * @see #getBindValueProperty()
   * @generated
   */
  EReference getBindValueProperty_ElementReference();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.BindValueProperty#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.BindValueProperty#getAttribute()
   * @see #getBindValueProperty()
   * @generated
   */
  EAttribute getBindValueProperty_Attribute();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FXGraphFactory getFXGraphFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ModelImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PACKAGE = eINSTANCE.getModel_Package();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Component Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__COMPONENT_DEF = eINSTANCE.getModel_ComponentDef();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.PackageDeclarationImpl <em>Package Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.PackageDeclarationImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getPackageDeclaration()
     * @generated
     */
    EClass PACKAGE_DECLARATION = eINSTANCE.getPackageDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_DECLARATION__NAME = eINSTANCE.getPackageDeclaration_Name();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ImportImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ComponentDefinitionImpl <em>Component Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ComponentDefinitionImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getComponentDefinition()
     * @generated
     */
    EClass COMPONENT_DEFINITION = eINSTANCE.getComponentDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_DEFINITION__NAME = eINSTANCE.getComponentDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Controller</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_DEFINITION__CONTROLLER = eINSTANCE.getComponentDefinition_Controller();

    /**
     * The meta object literal for the '<em><b>Preview Css Files</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_DEFINITION__PREVIEW_CSS_FILES = eINSTANCE.getComponentDefinition_PreviewCssFiles();

    /**
     * The meta object literal for the '<em><b>Preview Resource Bundle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_DEFINITION__PREVIEW_RESOURCE_BUNDLE = eINSTANCE.getComponentDefinition_PreviewResourceBundle();

    /**
     * The meta object literal for the '<em><b>Preview Classpath Entries</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT_DEFINITION__PREVIEW_CLASSPATH_ENTRIES = eINSTANCE.getComponentDefinition_PreviewClasspathEntries();

    /**
     * The meta object literal for the '<em><b>Scripts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_DEFINITION__SCRIPTS = eINSTANCE.getComponentDefinition_Scripts();

    /**
     * The meta object literal for the '<em><b>Defines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_DEFINITION__DEFINES = eINSTANCE.getComponentDefinition_Defines();

    /**
     * The meta object literal for the '<em><b>Root Node</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT_DEFINITION__ROOT_NODE = eINSTANCE.getComponentDefinition_RootNode();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ElementImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__TYPE = eINSTANCE.getElement_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__VALUE = eINSTANCE.getElement_Value();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__PROPERTIES = eINSTANCE.getElement_Properties();

    /**
     * The meta object literal for the '<em><b>Static Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__STATIC_PROPERTIES = eINSTANCE.getElement_StaticProperties();

    /**
     * The meta object literal for the '<em><b>Default Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__DEFAULT_CHILDREN = eINSTANCE.getElement_DefaultChildren();

    /**
     * The meta object literal for the '<em><b>Factory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__FACTORY = eINSTANCE.getElement_Factory();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__VALUES = eINSTANCE.getElement_Values();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.DefineImpl <em>Define</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.DefineImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getDefine()
     * @generated
     */
    EClass DEFINE = eINSTANCE.getDefine();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINE__ELEMENT = eINSTANCE.getDefine_Element();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ScriptImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getScript()
     * @generated
     */
    EClass SCRIPT = eINSTANCE.getScript();

    /**
     * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT__LANGUAGE = eINSTANCE.getScript_Language();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT__SOURCE = eINSTANCE.getScript_Source();

    /**
     * The meta object literal for the '<em><b>Sourcecode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT__SOURCECODE = eINSTANCE.getScript_Sourcecode();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.StaticValuePropertyImpl <em>Static Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.StaticValuePropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getStaticValueProperty()
     * @generated
     */
    EClass STATIC_VALUE_PROPERTY = eINSTANCE.getStaticValueProperty();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_VALUE_PROPERTY__TYPE = eINSTANCE.getStaticValueProperty_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_VALUE_PROPERTY__NAME = eINSTANCE.getStaticValueProperty_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_VALUE_PROPERTY__VALUE = eINSTANCE.getStaticValueProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.PropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Preview</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__PREVIEW = eINSTANCE.getProperty_Preview();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__VALUE = eINSTANCE.getProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ValuePropertyImpl <em>Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ValuePropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getValueProperty()
     * @generated
     */
    EClass VALUE_PROPERTY = eINSTANCE.getValueProperty();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.SingleValuePropertyImpl <em>Single Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.SingleValuePropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getSingleValueProperty()
     * @generated
     */
    EClass SINGLE_VALUE_PROPERTY = eINSTANCE.getSingleValueProperty();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.MultiValuePropertyImpl <em>Multi Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.MultiValuePropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getMultiValueProperty()
     * @generated
     */
    EClass MULTI_VALUE_PROPERTY = eINSTANCE.getMultiValueProperty();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ListValueElementImpl <em>List Value Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ListValueElementImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getListValueElement()
     * @generated
     */
    EClass LIST_VALUE_ELEMENT = eINSTANCE.getListValueElement();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ListValuePropertyImpl <em>List Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ListValuePropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getListValueProperty()
     * @generated
     */
    EClass LIST_VALUE_PROPERTY = eINSTANCE.getListValueProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_VALUE_PROPERTY__VALUE = eINSTANCE.getListValueProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.MapValuePropertyImpl <em>Map Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.MapValuePropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getMapValueProperty()
     * @generated
     */
    EClass MAP_VALUE_PROPERTY = eINSTANCE.getMapValueProperty();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_VALUE_PROPERTY__PROPERTIES = eINSTANCE.getMapValueProperty_Properties();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.SimpleValuePropertyImpl <em>Simple Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.SimpleValuePropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getSimpleValueProperty()
     * @generated
     */
    EClass SIMPLE_VALUE_PROPERTY = eINSTANCE.getSimpleValueProperty();

    /**
     * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_VALUE_PROPERTY__STRING_VALUE = eINSTANCE.getSimpleValueProperty_StringValue();

    /**
     * The meta object literal for the '<em><b>Boolean Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_VALUE_PROPERTY__BOOLEAN_VALUE = eINSTANCE.getSimpleValueProperty_BooleanValue();

    /**
     * The meta object literal for the '<em><b>Negative</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_VALUE_PROPERTY__NEGATIVE = eINSTANCE.getSimpleValueProperty_Negative();

    /**
     * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_VALUE_PROPERTY__INT_VALUE = eINSTANCE.getSimpleValueProperty_IntValue();

    /**
     * The meta object literal for the '<em><b>Real Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_VALUE_PROPERTY__REAL_VALUE = eINSTANCE.getSimpleValueProperty_RealValue();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ReferenceValuePropertyImpl <em>Reference Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ReferenceValuePropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getReferenceValueProperty()
     * @generated
     */
    EClass REFERENCE_VALUE_PROPERTY = eINSTANCE.getReferenceValueProperty();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_VALUE_PROPERTY__REFERENCE = eINSTANCE.getReferenceValueProperty_Reference();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.IncludeValuePropertyImpl <em>Include Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.IncludeValuePropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getIncludeValueProperty()
     * @generated
     */
    EClass INCLUDE_VALUE_PROPERTY = eINSTANCE.getIncludeValueProperty();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCLUDE_VALUE_PROPERTY__SOURCE = eINSTANCE.getIncludeValueProperty_Source();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.CopyValuePropertyImpl <em>Copy Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.CopyValuePropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getCopyValueProperty()
     * @generated
     */
    EClass COPY_VALUE_PROPERTY = eINSTANCE.getCopyValueProperty();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COPY_VALUE_PROPERTY__REFERENCE = eINSTANCE.getCopyValueProperty_Reference();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ControllerHandledValuePropertyImpl <em>Controller Handled Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ControllerHandledValuePropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getControllerHandledValueProperty()
     * @generated
     */
    EClass CONTROLLER_HANDLED_VALUE_PROPERTY = eINSTANCE.getControllerHandledValueProperty();

    /**
     * The meta object literal for the '<em><b>Methodname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROLLER_HANDLED_VALUE_PROPERTY__METHODNAME = eINSTANCE.getControllerHandledValueProperty_Methodname();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ScriptHandlerHandledValuePropertyImpl <em>Script Handler Handled Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ScriptHandlerHandledValuePropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getScriptHandlerHandledValueProperty()
     * @generated
     */
    EClass SCRIPT_HANDLER_HANDLED_VALUE_PROPERTY = eINSTANCE.getScriptHandlerHandledValueProperty();

    /**
     * The meta object literal for the '<em><b>Functionname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT_HANDLER_HANDLED_VALUE_PROPERTY__FUNCTIONNAME = eINSTANCE.getScriptHandlerHandledValueProperty_Functionname();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ScriptValueExpressionImpl <em>Script Value Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ScriptValueExpressionImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getScriptValueExpression()
     * @generated
     */
    EClass SCRIPT_VALUE_EXPRESSION = eINSTANCE.getScriptValueExpression();

    /**
     * The meta object literal for the '<em><b>Sourcecode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT_VALUE_EXPRESSION__SOURCECODE = eINSTANCE.getScriptValueExpression_Sourcecode();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ScriptValueReferenceImpl <em>Script Value Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ScriptValueReferenceImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getScriptValueReference()
     * @generated
     */
    EClass SCRIPT_VALUE_REFERENCE = eINSTANCE.getScriptValueReference();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT_VALUE_REFERENCE__REFERENCE = eINSTANCE.getScriptValueReference_Reference();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.LocationValuePropertyImpl <em>Location Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.LocationValuePropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getLocationValueProperty()
     * @generated
     */
    EClass LOCATION_VALUE_PROPERTY = eINSTANCE.getLocationValueProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCATION_VALUE_PROPERTY__VALUE = eINSTANCE.getLocationValueProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ResourceValuePropertyImpl <em>Resource Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ResourceValuePropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getResourceValueProperty()
     * @generated
     */
    EClass RESOURCE_VALUE_PROPERTY = eINSTANCE.getResourceValueProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_VALUE_PROPERTY__VALUE = eINSTANCE.getResourceValueProperty_Value();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.BindValuePropertyImpl <em>Bind Value Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.BindValuePropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getBindValueProperty()
     * @generated
     */
    EClass BIND_VALUE_PROPERTY = eINSTANCE.getBindValueProperty();

    /**
     * The meta object literal for the '<em><b>Element Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIND_VALUE_PROPERTY__ELEMENT_REFERENCE = eINSTANCE.getBindValueProperty_ElementReference();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BIND_VALUE_PROPERTY__ATTRIBUTE = eINSTANCE.getBindValueProperty_Attribute();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.StringValueImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

  }

} //FXGraphPackage
