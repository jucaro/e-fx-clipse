/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.*;

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
public class SvgPathFactoryImpl extends EFactoryImpl implements SvgPathFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SvgPathFactory init()
  {
    try
    {
      SvgPathFactory theSvgPathFactory = (SvgPathFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.bestsolution.at/efxclipse/tooling/svgpath/SvgPath"); 
      if (theSvgPathFactory != null)
      {
        return theSvgPathFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SvgPathFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SvgPathFactoryImpl()
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
      case SvgPathPackage.SVG_PATH: return createsvg_path();
      case SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUPS: return createmoveto_drawto_command_groups();
      case SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP: return createmoveto_drawto_command_group();
      case SvgPathPackage.MOVETO: return createmoveto();
      case SvgPathPackage.LINETO_ARGUMENT_SEQUENCE: return createlineto_argument_sequence();
      case SvgPathPackage.DRAWTO_COMMANDS: return createdrawto_commands();
      case SvgPathPackage.DRAWTO_COMMAND: return createdrawto_command();
      case SvgPathPackage.CLOSEPATH: return createclosepath();
      case SvgPathPackage.LINETO: return createlineto();
      case SvgPathPackage.HORIZONTAL_LINETO: return createhorizontal_lineto();
      case SvgPathPackage.HORIZONTAL_LINETO_ARGUMENT_SEQUENCE: return createhorizontal_lineto_argument_sequence();
      case SvgPathPackage.VERTICAL_LINETO: return createvertical_lineto();
      case SvgPathPackage.VERTICAL_LINETO_ARGUMENT_SEQUENCE: return createvertical_lineto_argument_sequence();
      case SvgPathPackage.CURVETO: return createcurveto();
      case SvgPathPackage.CURVETO_ARGUMENT_SEQUENCE: return createcurveto_argument_sequence();
      case SvgPathPackage.CURVETO_ARGUMENT: return createcurveto_argument();
      case SvgPathPackage.SMOOTH_CURVETO: return createsmooth_curveto();
      case SvgPathPackage.SMOOTH_CURVETO_ARGUMENT_SEQUENCE: return createsmooth_curveto_argument_sequence();
      case SvgPathPackage.SMOOTH_CURVETO_ARGUMENT: return createsmooth_curveto_argument();
      case SvgPathPackage.QUADRATIC_BEZIER_CURVETO: return createquadratic_bezier_curveto();
      case SvgPathPackage.QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE: return createquadratic_bezier_curveto_argument_sequence();
      case SvgPathPackage.QUADRATIC_BEZIER_CURVETO_ARGUMENT: return createquadratic_bezier_curveto_argument();
      case SvgPathPackage.SMOOTH_QUADRATIC_BEZIER_CURVETO: return createsmooth_quadratic_bezier_curveto();
      case SvgPathPackage.SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE: return createsmooth_quadratic_bezier_curveto_argument_sequence();
      case SvgPathPackage.ELLIPTICAL_ARC: return createelliptical_arc();
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT_SEQUENCE: return createelliptical_arc_argument_sequence();
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT: return createelliptical_arc_argument();
      case SvgPathPackage.COORDINATE_PAIR: return createcoordinate_pair();
      case SvgPathPackage.COORDINATE: return createcoordinate();
      case SvgPathPackage.NUMBER: return createnumber();
      case SvgPathPackage.NONNEGATIVE_NUMBER: return createnonnegative_number();
      case SvgPathPackage.EXPONENT: return createexponent();
      case SvgPathPackage.DIGIT_SEQUENCE: return createdigit_sequence();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public svg_path createsvg_path()
  {
    svg_pathImpl svg_path = new svg_pathImpl();
    return svg_path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public moveto_drawto_command_groups createmoveto_drawto_command_groups()
  {
    moveto_drawto_command_groupsImpl moveto_drawto_command_groups = new moveto_drawto_command_groupsImpl();
    return moveto_drawto_command_groups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public moveto_drawto_command_group createmoveto_drawto_command_group()
  {
    moveto_drawto_command_groupImpl moveto_drawto_command_group = new moveto_drawto_command_groupImpl();
    return moveto_drawto_command_group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public moveto createmoveto()
  {
    movetoImpl moveto = new movetoImpl();
    return moveto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public lineto_argument_sequence createlineto_argument_sequence()
  {
    lineto_argument_sequenceImpl lineto_argument_sequence = new lineto_argument_sequenceImpl();
    return lineto_argument_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public drawto_commands createdrawto_commands()
  {
    drawto_commandsImpl drawto_commands = new drawto_commandsImpl();
    return drawto_commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public drawto_command createdrawto_command()
  {
    drawto_commandImpl drawto_command = new drawto_commandImpl();
    return drawto_command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public closepath createclosepath()
  {
    closepathImpl closepath = new closepathImpl();
    return closepath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public lineto createlineto()
  {
    linetoImpl lineto = new linetoImpl();
    return lineto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public horizontal_lineto createhorizontal_lineto()
  {
    horizontal_linetoImpl horizontal_lineto = new horizontal_linetoImpl();
    return horizontal_lineto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public horizontal_lineto_argument_sequence createhorizontal_lineto_argument_sequence()
  {
    horizontal_lineto_argument_sequenceImpl horizontal_lineto_argument_sequence = new horizontal_lineto_argument_sequenceImpl();
    return horizontal_lineto_argument_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public vertical_lineto createvertical_lineto()
  {
    vertical_linetoImpl vertical_lineto = new vertical_linetoImpl();
    return vertical_lineto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public vertical_lineto_argument_sequence createvertical_lineto_argument_sequence()
  {
    vertical_lineto_argument_sequenceImpl vertical_lineto_argument_sequence = new vertical_lineto_argument_sequenceImpl();
    return vertical_lineto_argument_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public curveto createcurveto()
  {
    curvetoImpl curveto = new curvetoImpl();
    return curveto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public curveto_argument_sequence createcurveto_argument_sequence()
  {
    curveto_argument_sequenceImpl curveto_argument_sequence = new curveto_argument_sequenceImpl();
    return curveto_argument_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public curveto_argument createcurveto_argument()
  {
    curveto_argumentImpl curveto_argument = new curveto_argumentImpl();
    return curveto_argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public smooth_curveto createsmooth_curveto()
  {
    smooth_curvetoImpl smooth_curveto = new smooth_curvetoImpl();
    return smooth_curveto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public smooth_curveto_argument_sequence createsmooth_curveto_argument_sequence()
  {
    smooth_curveto_argument_sequenceImpl smooth_curveto_argument_sequence = new smooth_curveto_argument_sequenceImpl();
    return smooth_curveto_argument_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public smooth_curveto_argument createsmooth_curveto_argument()
  {
    smooth_curveto_argumentImpl smooth_curveto_argument = new smooth_curveto_argumentImpl();
    return smooth_curveto_argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public quadratic_bezier_curveto createquadratic_bezier_curveto()
  {
    quadratic_bezier_curvetoImpl quadratic_bezier_curveto = new quadratic_bezier_curvetoImpl();
    return quadratic_bezier_curveto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public quadratic_bezier_curveto_argument_sequence createquadratic_bezier_curveto_argument_sequence()
  {
    quadratic_bezier_curveto_argument_sequenceImpl quadratic_bezier_curveto_argument_sequence = new quadratic_bezier_curveto_argument_sequenceImpl();
    return quadratic_bezier_curveto_argument_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public quadratic_bezier_curveto_argument createquadratic_bezier_curveto_argument()
  {
    quadratic_bezier_curveto_argumentImpl quadratic_bezier_curveto_argument = new quadratic_bezier_curveto_argumentImpl();
    return quadratic_bezier_curveto_argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public smooth_quadratic_bezier_curveto createsmooth_quadratic_bezier_curveto()
  {
    smooth_quadratic_bezier_curvetoImpl smooth_quadratic_bezier_curveto = new smooth_quadratic_bezier_curvetoImpl();
    return smooth_quadratic_bezier_curveto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public smooth_quadratic_bezier_curveto_argument_sequence createsmooth_quadratic_bezier_curveto_argument_sequence()
  {
    smooth_quadratic_bezier_curveto_argument_sequenceImpl smooth_quadratic_bezier_curveto_argument_sequence = new smooth_quadratic_bezier_curveto_argument_sequenceImpl();
    return smooth_quadratic_bezier_curveto_argument_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public elliptical_arc createelliptical_arc()
  {
    elliptical_arcImpl elliptical_arc = new elliptical_arcImpl();
    return elliptical_arc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public elliptical_arc_argument_sequence createelliptical_arc_argument_sequence()
  {
    elliptical_arc_argument_sequenceImpl elliptical_arc_argument_sequence = new elliptical_arc_argument_sequenceImpl();
    return elliptical_arc_argument_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public elliptical_arc_argument createelliptical_arc_argument()
  {
    elliptical_arc_argumentImpl elliptical_arc_argument = new elliptical_arc_argumentImpl();
    return elliptical_arc_argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public coordinate_pair createcoordinate_pair()
  {
    coordinate_pairImpl coordinate_pair = new coordinate_pairImpl();
    return coordinate_pair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public coordinate createcoordinate()
  {
    coordinateImpl coordinate = new coordinateImpl();
    return coordinate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public number createnumber()
  {
    numberImpl number = new numberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nonnegative_number createnonnegative_number()
  {
    nonnegative_numberImpl nonnegative_number = new nonnegative_numberImpl();
    return nonnegative_number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exponent createexponent()
  {
    exponentImpl exponent = new exponentImpl();
    return exponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public digit_sequence createdigit_sequence()
  {
    digit_sequenceImpl digit_sequence = new digit_sequenceImpl();
    return digit_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SvgPathPackage getSvgPathPackage()
  {
    return (SvgPathPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SvgPathPackage getPackage()
  {
    return SvgPathPackage.eINSTANCE;
  }

} //SvgPathFactoryImpl
