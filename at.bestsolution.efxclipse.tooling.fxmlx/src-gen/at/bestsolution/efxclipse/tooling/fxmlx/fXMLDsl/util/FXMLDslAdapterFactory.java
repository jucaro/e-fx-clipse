/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.util;

import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage
 * @generated
 */
public class FXMLDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FXMLDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FXMLDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FXMLDslPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected FXMLDslSwitch<Adapter> modelSwitch =
    new FXMLDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseFXML(FXML object)
      {
        return createFXMLAdapter();
      }
      @Override
      public Adapter caseXMLDec(XMLDec object)
      {
        return createXMLDecAdapter();
      }
      @Override
      public Adapter caseProcessingInstruction(ProcessingInstruction object)
      {
        return createProcessingInstructionAdapter();
      }
      @Override
      public Adapter caseElementDefinition(ElementDefinition object)
      {
        return createElementDefinitionAdapter();
      }
      @Override
      public Adapter caseContainerElementDefinition(ContainerElementDefinition object)
      {
        return createContainerElementDefinitionAdapter();
      }
      @Override
      public Adapter caseEmptyElementDefinition(EmptyElementDefinition object)
      {
        return createEmptyElementDefinitionAdapter();
      }
      @Override
      public Adapter caseAttributePropertyDefinition(AttributePropertyDefinition object)
      {
        return createAttributePropertyDefinitionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML <em>FXML</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML
   * @generated
   */
  public Adapter createFXMLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.XMLDec <em>XML Dec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.XMLDec
   * @generated
   */
  public Adapter createXMLDecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction <em>Processing Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction
   * @generated
   */
  public Adapter createProcessingInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ElementDefinition <em>Element Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ElementDefinition
   * @generated
   */
  public Adapter createElementDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition <em>Container Element Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition
   * @generated
   */
  public Adapter createContainerElementDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.EmptyElementDefinition <em>Empty Element Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.EmptyElementDefinition
   * @generated
   */
  public Adapter createEmptyElementDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.AttributePropertyDefinition <em>Attribute Property Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.AttributePropertyDefinition
   * @generated
   */
  public Adapter createAttributePropertyDefinitionAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //FXMLDslAdapterFactory
