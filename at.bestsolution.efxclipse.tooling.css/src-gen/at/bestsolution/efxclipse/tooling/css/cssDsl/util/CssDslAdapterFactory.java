/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.util;

import at.bestsolution.efxclipse.tooling.css.cssDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage
 * @generated
 */
public class CssDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CssDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CssDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CssDslPackage.eINSTANCE;
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
  protected CssDslSwitch<Adapter> modelSwitch =
    new CssDslSwitch<Adapter>()
    {
      @Override
      public Adapter casestylesheet(stylesheet object)
      {
        return createstylesheetAdapter();
      }
      @Override
      public Adapter casemedia(media object)
      {
        return createmediaAdapter();
      }
      @Override
      public Adapter caseruleset(ruleset object)
      {
        return createrulesetAdapter();
      }
      @Override
      public Adapter caseselector(selector object)
      {
        return createselectorAdapter();
      }
      @Override
      public Adapter casesimple_selector(simple_selector object)
      {
        return createsimple_selectorAdapter();
      }
      @Override
      public Adapter casecss_declaration(css_declaration object)
      {
        return createcss_declarationAdapter();
      }
      @Override
      public Adapter casecss_generic_declaration(css_generic_declaration object)
      {
        return createcss_generic_declarationAdapter();
      }
      @Override
      public Adapter caseexpr(expr object)
      {
        return createexprAdapter();
      }
      @Override
      public Adapter casetermGroup(termGroup object)
      {
        return createtermGroupAdapter();
      }
      @Override
      public Adapter caseterm(term object)
      {
        return createtermAdapter();
      }
      @Override
      public Adapter casefunction(function object)
      {
        return createfunctionAdapter();
      }
      @Override
      public Adapter caseURLType(URLType object)
      {
        return createURLTypeAdapter();
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
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet <em>stylesheet</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet
   * @generated
   */
  public Adapter createstylesheetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.media <em>media</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.media
   * @generated
   */
  public Adapter createmediaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset <em>ruleset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset
   * @generated
   */
  public Adapter createrulesetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.selector <em>selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.selector
   * @generated
   */
  public Adapter createselectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector <em>simple selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector
   * @generated
   */
  public Adapter createsimple_selectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration <em>css declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.css_declaration
   * @generated
   */
  public Adapter createcss_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration <em>css generic declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration
   * @generated
   */
  public Adapter createcss_generic_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.expr <em>expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.expr
   * @generated
   */
  public Adapter createexprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup <em>term Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup
   * @generated
   */
  public Adapter createtermGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.term <em>term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.term
   * @generated
   */
  public Adapter createtermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.function <em>function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.function
   * @generated
   */
  public Adapter createfunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.URLType <em>URL Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.URLType
   * @generated
   */
  public Adapter createURLTypeAdapter()
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

} //CssDslAdapterFactory
