/**
 * <copyright>
 * </copyright>
 *

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
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Root Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ROOT_NODE = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ImportImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

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
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.PropertyValueImpl <em>Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.PropertyValueImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getPropertyValue()
   * @generated
   */
  int PROPERTY_VALUE = 5;

  /**
   * The number of structural features of the '<em>Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ElementImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__TYPE = PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Factory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__FACTORY = PROPERTY_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = PROPERTY_VALUE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Defines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__DEFINES = PROPERTY_VALUE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__PROPERTIES = PROPERTY_VALUE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.DefineImpl <em>Define</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.DefineImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getDefine()
   * @generated
   */
  int DEFINE = 3;

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
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.PropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__VALUE = 1;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ListPropertyImpl <em>List Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ListPropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getListProperty()
   * @generated
   */
  int LIST_PROPERTY = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PROPERTY__VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PROPERTY_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ValuePropertyImpl <em>Value Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ValuePropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getValueProperty()
   * @generated
   */
  int VALUE_PROPERTY = 7;

  /**
   * The feature id for the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_PROPERTY__STRING_VALUE = PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Negative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_PROPERTY__NEGATIVE = PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Real Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_PROPERTY__REAL_VALUE = PROPERTY_VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_PROPERTY__INT_VALUE = PROPERTY_VALUE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Value Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_PROPERTY_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ReferencePropertyImpl <em>Reference Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ReferencePropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getReferenceProperty()
   * @generated
   */
  int REFERENCE_PROPERTY = 8;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_PROPERTY__REFERENCE = PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reference Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_PROPERTY_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.IncludePropertyImpl <em>Include Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.IncludePropertyImpl
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getIncludeProperty()
   * @generated
   */
  int INCLUDE_PROPERTY = 9;

  /**
   * The feature id for the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_PROPERTY__SOURCE = PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Include Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_PROPERTY_FEATURE_COUNT = PROPERTY_VALUE_FEATURE_COUNT + 1;


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
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model#getRootNode <em>Root Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root Node</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model#getRootNode()
   * @see #getModel()
   * @generated
   */
  EReference getModel_RootNode();

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
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getValue()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Value();

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
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getDefines <em>Defines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Defines</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element#getDefines()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Defines();

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
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property
   * @generated
   */
  EClass getProperty();

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
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.PropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.PropertyValue
   * @generated
   */
  EClass getPropertyValue();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListProperty <em>List Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListProperty
   * @generated
   */
  EClass getListProperty();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListProperty#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListProperty#getValue()
   * @see #getListProperty()
   * @generated
   */
  EReference getListProperty_Value();

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
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ValueProperty#getStringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ValueProperty#getStringValue()
   * @see #getValueProperty()
   * @generated
   */
  EAttribute getValueProperty_StringValue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ValueProperty#isNegative <em>Negative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Negative</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ValueProperty#isNegative()
   * @see #getValueProperty()
   * @generated
   */
  EAttribute getValueProperty_Negative();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ValueProperty#getRealValue <em>Real Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Real Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ValueProperty#getRealValue()
   * @see #getValueProperty()
   * @generated
   */
  EAttribute getValueProperty_RealValue();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ValueProperty#getIntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Value</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ValueProperty#getIntValue()
   * @see #getValueProperty()
   * @generated
   */
  EAttribute getValueProperty_IntValue();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ReferenceProperty <em>Reference Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ReferenceProperty
   * @generated
   */
  EClass getReferenceProperty();

  /**
   * Returns the meta object for the reference '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ReferenceProperty#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ReferenceProperty#getReference()
   * @see #getReferenceProperty()
   * @generated
   */
  EReference getReferenceProperty_Reference();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.IncludeProperty <em>Include Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include Property</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.IncludeProperty
   * @generated
   */
  EClass getIncludeProperty();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.IncludeProperty#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Source</em>'.
   * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.IncludeProperty#getSource()
   * @see #getIncludeProperty()
   * @generated
   */
  EAttribute getIncludeProperty_Source();

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
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Root Node</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ROOT_NODE = eINSTANCE.getModel_RootNode();

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
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__VALUE = eINSTANCE.getElement_Value();

    /**
     * The meta object literal for the '<em><b>Factory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__FACTORY = eINSTANCE.getElement_Factory();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

    /**
     * The meta object literal for the '<em><b>Defines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__DEFINES = eINSTANCE.getElement_Defines();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__PROPERTIES = eINSTANCE.getElement_Properties();

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
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.PropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

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
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.PropertyValueImpl <em>Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.PropertyValueImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getPropertyValue()
     * @generated
     */
    EClass PROPERTY_VALUE = eINSTANCE.getPropertyValue();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ListPropertyImpl <em>List Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ListPropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getListProperty()
     * @generated
     */
    EClass LIST_PROPERTY = eINSTANCE.getListProperty();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_PROPERTY__VALUE = eINSTANCE.getListProperty_Value();

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
     * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_PROPERTY__STRING_VALUE = eINSTANCE.getValueProperty_StringValue();

    /**
     * The meta object literal for the '<em><b>Negative</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_PROPERTY__NEGATIVE = eINSTANCE.getValueProperty_Negative();

    /**
     * The meta object literal for the '<em><b>Real Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_PROPERTY__REAL_VALUE = eINSTANCE.getValueProperty_RealValue();

    /**
     * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_PROPERTY__INT_VALUE = eINSTANCE.getValueProperty_IntValue();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ReferencePropertyImpl <em>Reference Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.ReferencePropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getReferenceProperty()
     * @generated
     */
    EClass REFERENCE_PROPERTY = eINSTANCE.getReferenceProperty();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_PROPERTY__REFERENCE = eINSTANCE.getReferenceProperty_Reference();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.IncludePropertyImpl <em>Include Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.IncludePropertyImpl
     * @see at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl.FXGraphPackageImpl#getIncludeProperty()
     * @generated
     */
    EClass INCLUDE_PROPERTY = eINSTANCE.getIncludeProperty();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE_PROPERTY__SOURCE = eINSTANCE.getIncludeProperty_Source();

  }

} //FXGraphPackage
