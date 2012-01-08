/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.util;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage
 * @generated
 */
public class SvgPathAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SvgPathPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SvgPathAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SvgPathPackage.eINSTANCE;
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
  protected SvgPathSwitch<Adapter> modelSwitch =
    new SvgPathSwitch<Adapter>()
    {
      @Override
      public Adapter casesvg_path(svg_path object)
      {
        return createsvg_pathAdapter();
      }
      @Override
      public Adapter casemoveto_drawto_command_groups(moveto_drawto_command_groups object)
      {
        return createmoveto_drawto_command_groupsAdapter();
      }
      @Override
      public Adapter casemoveto_drawto_command_group(moveto_drawto_command_group object)
      {
        return createmoveto_drawto_command_groupAdapter();
      }
      @Override
      public Adapter casemoveto(moveto object)
      {
        return createmovetoAdapter();
      }
      @Override
      public Adapter caselineto_argument_sequence(lineto_argument_sequence object)
      {
        return createlineto_argument_sequenceAdapter();
      }
      @Override
      public Adapter casedrawto_commands(drawto_commands object)
      {
        return createdrawto_commandsAdapter();
      }
      @Override
      public Adapter casedrawto_command(drawto_command object)
      {
        return createdrawto_commandAdapter();
      }
      @Override
      public Adapter caseclosepath(closepath object)
      {
        return createclosepathAdapter();
      }
      @Override
      public Adapter caselineto(lineto object)
      {
        return createlinetoAdapter();
      }
      @Override
      public Adapter casehorizontal_lineto(horizontal_lineto object)
      {
        return createhorizontal_linetoAdapter();
      }
      @Override
      public Adapter casehorizontal_lineto_argument_sequence(horizontal_lineto_argument_sequence object)
      {
        return createhorizontal_lineto_argument_sequenceAdapter();
      }
      @Override
      public Adapter casevertical_lineto(vertical_lineto object)
      {
        return createvertical_linetoAdapter();
      }
      @Override
      public Adapter casevertical_lineto_argument_sequence(vertical_lineto_argument_sequence object)
      {
        return createvertical_lineto_argument_sequenceAdapter();
      }
      @Override
      public Adapter casecurveto(curveto object)
      {
        return createcurvetoAdapter();
      }
      @Override
      public Adapter casecurveto_argument_sequence(curveto_argument_sequence object)
      {
        return createcurveto_argument_sequenceAdapter();
      }
      @Override
      public Adapter casecurveto_argument(curveto_argument object)
      {
        return createcurveto_argumentAdapter();
      }
      @Override
      public Adapter casesmooth_curveto(smooth_curveto object)
      {
        return createsmooth_curvetoAdapter();
      }
      @Override
      public Adapter casesmooth_curveto_argument_sequence(smooth_curveto_argument_sequence object)
      {
        return createsmooth_curveto_argument_sequenceAdapter();
      }
      @Override
      public Adapter casesmooth_curveto_argument(smooth_curveto_argument object)
      {
        return createsmooth_curveto_argumentAdapter();
      }
      @Override
      public Adapter casequadratic_bezier_curveto(quadratic_bezier_curveto object)
      {
        return createquadratic_bezier_curvetoAdapter();
      }
      @Override
      public Adapter casequadratic_bezier_curveto_argument_sequence(quadratic_bezier_curveto_argument_sequence object)
      {
        return createquadratic_bezier_curveto_argument_sequenceAdapter();
      }
      @Override
      public Adapter casequadratic_bezier_curveto_argument(quadratic_bezier_curveto_argument object)
      {
        return createquadratic_bezier_curveto_argumentAdapter();
      }
      @Override
      public Adapter casesmooth_quadratic_bezier_curveto(smooth_quadratic_bezier_curveto object)
      {
        return createsmooth_quadratic_bezier_curvetoAdapter();
      }
      @Override
      public Adapter casesmooth_quadratic_bezier_curveto_argument_sequence(smooth_quadratic_bezier_curveto_argument_sequence object)
      {
        return createsmooth_quadratic_bezier_curveto_argument_sequenceAdapter();
      }
      @Override
      public Adapter caseelliptical_arc(elliptical_arc object)
      {
        return createelliptical_arcAdapter();
      }
      @Override
      public Adapter caseelliptical_arc_argument_sequence(elliptical_arc_argument_sequence object)
      {
        return createelliptical_arc_argument_sequenceAdapter();
      }
      @Override
      public Adapter caseelliptical_arc_argument(elliptical_arc_argument object)
      {
        return createelliptical_arc_argumentAdapter();
      }
      @Override
      public Adapter casecoordinate_pair(coordinate_pair object)
      {
        return createcoordinate_pairAdapter();
      }
      @Override
      public Adapter casecoordinate(coordinate object)
      {
        return createcoordinateAdapter();
      }
      @Override
      public Adapter casenumber(number object)
      {
        return createnumberAdapter();
      }
      @Override
      public Adapter casenonnegative_number(nonnegative_number object)
      {
        return createnonnegative_numberAdapter();
      }
      @Override
      public Adapter caseexponent(exponent object)
      {
        return createexponentAdapter();
      }
      @Override
      public Adapter casedigit_sequence(digit_sequence object)
      {
        return createdigit_sequenceAdapter();
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
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.svg_path <em>svg path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.svg_path
   * @generated
   */
  public Adapter createsvg_pathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_groups <em>moveto drawto command groups</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_groups
   * @generated
   */
  public Adapter createmoveto_drawto_command_groupsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_group <em>moveto drawto command group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_group
   * @generated
   */
  public Adapter createmoveto_drawto_command_groupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto <em>moveto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto
   * @generated
   */
  public Adapter createmovetoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.lineto_argument_sequence <em>lineto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.lineto_argument_sequence
   * @generated
   */
  public Adapter createlineto_argument_sequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.drawto_commands <em>drawto commands</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.drawto_commands
   * @generated
   */
  public Adapter createdrawto_commandsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.drawto_command <em>drawto command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.drawto_command
   * @generated
   */
  public Adapter createdrawto_commandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.closepath <em>closepath</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.closepath
   * @generated
   */
  public Adapter createclosepathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.lineto <em>lineto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.lineto
   * @generated
   */
  public Adapter createlinetoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.horizontal_lineto <em>horizontal lineto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.horizontal_lineto
   * @generated
   */
  public Adapter createhorizontal_linetoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.horizontal_lineto_argument_sequence <em>horizontal lineto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.horizontal_lineto_argument_sequence
   * @generated
   */
  public Adapter createhorizontal_lineto_argument_sequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.vertical_lineto <em>vertical lineto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.vertical_lineto
   * @generated
   */
  public Adapter createvertical_linetoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.vertical_lineto_argument_sequence <em>vertical lineto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.vertical_lineto_argument_sequence
   * @generated
   */
  public Adapter createvertical_lineto_argument_sequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto <em>curveto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto
   * @generated
   */
  public Adapter createcurvetoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument_sequence <em>curveto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument_sequence
   * @generated
   */
  public Adapter createcurveto_argument_sequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument <em>curveto argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument
   * @generated
   */
  public Adapter createcurveto_argumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto <em>smooth curveto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto
   * @generated
   */
  public Adapter createsmooth_curvetoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument_sequence <em>smooth curveto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument_sequence
   * @generated
   */
  public Adapter createsmooth_curveto_argument_sequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument <em>smooth curveto argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument
   * @generated
   */
  public Adapter createsmooth_curveto_argumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto <em>quadratic bezier curveto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto
   * @generated
   */
  public Adapter createquadratic_bezier_curvetoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument_sequence <em>quadratic bezier curveto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument_sequence
   * @generated
   */
  public Adapter createquadratic_bezier_curveto_argument_sequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument <em>quadratic bezier curveto argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument
   * @generated
   */
  public Adapter createquadratic_bezier_curveto_argumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_quadratic_bezier_curveto <em>smooth quadratic bezier curveto</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_quadratic_bezier_curveto
   * @generated
   */
  public Adapter createsmooth_quadratic_bezier_curvetoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_quadratic_bezier_curveto_argument_sequence <em>smooth quadratic bezier curveto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_quadratic_bezier_curveto_argument_sequence
   * @generated
   */
  public Adapter createsmooth_quadratic_bezier_curveto_argument_sequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc <em>elliptical arc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc
   * @generated
   */
  public Adapter createelliptical_arcAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument_sequence <em>elliptical arc argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument_sequence
   * @generated
   */
  public Adapter createelliptical_arc_argument_sequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument <em>elliptical arc argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument
   * @generated
   */
  public Adapter createelliptical_arc_argumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate_pair <em>coordinate pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate_pair
   * @generated
   */
  public Adapter createcoordinate_pairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate <em>coordinate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate
   * @generated
   */
  public Adapter createcoordinateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.number <em>number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.number
   * @generated
   */
  public Adapter createnumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number <em>nonnegative number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number
   * @generated
   */
  public Adapter createnonnegative_numberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.exponent <em>exponent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.exponent
   * @generated
   */
  public Adapter createexponentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.digit_sequence <em>digit sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.digit_sequence
   * @generated
   */
  public Adapter createdigit_sequenceAdapter()
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

} //SvgPathAdapterFactory
