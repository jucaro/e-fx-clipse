/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.impl;

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.*;

import org.eclipse.emf.ecore.EClass;
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
public class FXGraphFactoryImpl extends EFactoryImpl implements FXGraphFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FXGraphFactory init()
  {
    try
    {
      FXGraphFactory theFXGraphFactory = (FXGraphFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.bestsolution.at/efxclipse/tooling/fxgraph/FXGraph"); 
      if (theFXGraphFactory != null)
      {
        return theFXGraphFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FXGraphFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FXGraphFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FXGraphPackage.MODEL: return createModel();
      case FXGraphPackage.LANGUAGE: return createLanguage();
      case FXGraphPackage.IMPORT: return createImport();
      case FXGraphPackage.ELEMENT: return createElement();
      case FXGraphPackage.DEFINE: return createDefine();
      case FXGraphPackage.SCRIPT: return createScript();
      case FXGraphPackage.STATIC_VALUE_PROPERTY: return createStaticValueProperty();
      case FXGraphPackage.PROPERTY: return createProperty();
      case FXGraphPackage.VALUE_PROPERTY: return createValueProperty();
      case FXGraphPackage.SINGLE_VALUE_PROPERTY: return createSingleValueProperty();
      case FXGraphPackage.MULTI_VALUE_PROPERTY: return createMultiValueProperty();
      case FXGraphPackage.LIST_VALUE_ELEMENT: return createListValueElement();
      case FXGraphPackage.LIST_VALUE_PROPERTY: return createListValueProperty();
      case FXGraphPackage.MAP_VALUE_PROPERTY: return createMapValueProperty();
      case FXGraphPackage.SIMPLE_VALUE_PROPERTY: return createSimpleValueProperty();
      case FXGraphPackage.REFERENCE_VALUE_PROPERTY: return createReferenceValueProperty();
      case FXGraphPackage.INCLUDE_VALUE_PROPERTY: return createIncludeValueProperty();
      case FXGraphPackage.COPY_VALUE_PROPERTY: return createCopyValueProperty();
      case FXGraphPackage.CONTROLLER_HANDLED_VALUE_PROPERTY: return createControllerHandledValueProperty();
      case FXGraphPackage.SCRIPT_HANDLER_HANDLED_VALUE_PROPERTY: return createScriptHandlerHandledValueProperty();
      case FXGraphPackage.SCRIPT_VALUE_EXPRESSION: return createScriptValueExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Language createLanguage()
  {
    LanguageImpl language = new LanguageImpl();
    return language;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Define createDefine()
  {
    DefineImpl define = new DefineImpl();
    return define;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Script createScript()
  {
    ScriptImpl script = new ScriptImpl();
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticValueProperty createStaticValueProperty()
  {
    StaticValuePropertyImpl staticValueProperty = new StaticValuePropertyImpl();
    return staticValueProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueProperty createValueProperty()
  {
    ValuePropertyImpl valueProperty = new ValuePropertyImpl();
    return valueProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleValueProperty createSingleValueProperty()
  {
    SingleValuePropertyImpl singleValueProperty = new SingleValuePropertyImpl();
    return singleValueProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiValueProperty createMultiValueProperty()
  {
    MultiValuePropertyImpl multiValueProperty = new MultiValuePropertyImpl();
    return multiValueProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListValueElement createListValueElement()
  {
    ListValueElementImpl listValueElement = new ListValueElementImpl();
    return listValueElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListValueProperty createListValueProperty()
  {
    ListValuePropertyImpl listValueProperty = new ListValuePropertyImpl();
    return listValueProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapValueProperty createMapValueProperty()
  {
    MapValuePropertyImpl mapValueProperty = new MapValuePropertyImpl();
    return mapValueProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleValueProperty createSimpleValueProperty()
  {
    SimpleValuePropertyImpl simpleValueProperty = new SimpleValuePropertyImpl();
    return simpleValueProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceValueProperty createReferenceValueProperty()
  {
    ReferenceValuePropertyImpl referenceValueProperty = new ReferenceValuePropertyImpl();
    return referenceValueProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludeValueProperty createIncludeValueProperty()
  {
    IncludeValuePropertyImpl includeValueProperty = new IncludeValuePropertyImpl();
    return includeValueProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CopyValueProperty createCopyValueProperty()
  {
    CopyValuePropertyImpl copyValueProperty = new CopyValuePropertyImpl();
    return copyValueProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ControllerHandledValueProperty createControllerHandledValueProperty()
  {
    ControllerHandledValuePropertyImpl controllerHandledValueProperty = new ControllerHandledValuePropertyImpl();
    return controllerHandledValueProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptHandlerHandledValueProperty createScriptHandlerHandledValueProperty()
  {
    ScriptHandlerHandledValuePropertyImpl scriptHandlerHandledValueProperty = new ScriptHandlerHandledValuePropertyImpl();
    return scriptHandlerHandledValueProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScriptValueExpression createScriptValueExpression()
  {
    ScriptValueExpressionImpl scriptValueExpression = new ScriptValueExpressionImpl();
    return scriptValueExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FXGraphPackage getFXGraphPackage()
  {
    return (FXGraphPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FXGraphPackage getPackage()
  {
    return FXGraphPackage.eINSTANCE;
  }

} //FXGraphFactoryImpl
