/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathFactory;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.closepath;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate_pair;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument_sequence;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.digit_sequence;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.drawto_command;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.drawto_commands;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument_sequence;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.exponent;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.horizontal_lineto;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.horizontal_lineto_argument_sequence;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.lineto;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.lineto_argument_sequence;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_group;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_groups;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.number;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument_sequence;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument_sequence;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_quadratic_bezier_curveto;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_quadratic_bezier_curveto_argument_sequence;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.svg_path;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.vertical_lineto;
import at.bestsolution.efxclipse.tooling.svgpath.svgPath.vertical_lineto_argument_sequence;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SvgPathPackageImpl extends EPackageImpl implements SvgPathPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass svg_pathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moveto_drawto_command_groupsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moveto_drawto_command_groupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass movetoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineto_argument_sequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass drawto_commandsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass drawto_commandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass closepathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linetoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass horizontal_linetoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass horizontal_lineto_argument_sequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vertical_linetoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vertical_lineto_argument_sequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass curvetoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass curveto_argument_sequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass curveto_argumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smooth_curvetoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smooth_curveto_argument_sequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smooth_curveto_argumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quadratic_bezier_curvetoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quadratic_bezier_curveto_argument_sequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quadratic_bezier_curveto_argumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smooth_quadratic_bezier_curvetoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smooth_quadratic_bezier_curveto_argument_sequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elliptical_arcEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elliptical_arc_argument_sequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elliptical_arc_argumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass coordinate_pairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass coordinateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nonnegative_numberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass digit_sequenceEClass = null;

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
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SvgPathPackageImpl()
  {
    super(eNS_URI, SvgPathFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SvgPathPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SvgPathPackage init()
  {
    if (isInited) return (SvgPathPackage)EPackage.Registry.INSTANCE.getEPackage(SvgPathPackage.eNS_URI);

    // Obtain or create and register package
    SvgPathPackageImpl theSvgPathPackage = (SvgPathPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SvgPathPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SvgPathPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSvgPathPackage.createPackageContents();

    // Initialize created meta-data
    theSvgPathPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSvgPathPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SvgPathPackage.eNS_URI, theSvgPathPackage);
    return theSvgPathPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsvg_path()
  {
    return svg_pathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsvg_path_Moveto_drawto_command_groups()
  {
    return (EReference)svg_pathEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmoveto_drawto_command_groups()
  {
    return moveto_drawto_command_groupsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmoveto_drawto_command_groups_Commands()
  {
    return (EReference)moveto_drawto_command_groupsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmoveto_drawto_command_group()
  {
    return moveto_drawto_command_groupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmoveto_drawto_command_group_Moveto()
  {
    return (EReference)moveto_drawto_command_groupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmoveto_drawto_command_group_Drawto_commands()
  {
    return (EReference)moveto_drawto_command_groupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmoveto()
  {
    return movetoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmoveto_Point()
  {
    return (EReference)movetoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getmoveto_Lineto_argument_sequence()
  {
    return (EReference)movetoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlineto_argument_sequence()
  {
    return lineto_argument_sequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlineto_argument_sequence_Pairs()
  {
    return (EReference)lineto_argument_sequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdrawto_commands()
  {
    return drawto_commandsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getdrawto_commands_Drawto_commands()
  {
    return (EReference)drawto_commandsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdrawto_command()
  {
    return drawto_commandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getclosepath()
  {
    return closepathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getlineto()
  {
    return linetoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getlineto_Lineto_argument_sequence()
  {
    return (EReference)linetoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gethorizontal_lineto()
  {
    return horizontal_linetoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gethorizontal_lineto_Horizontal_lineto_argument_sequence()
  {
    return (EReference)horizontal_linetoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gethorizontal_lineto_argument_sequence()
  {
    return horizontal_lineto_argument_sequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference gethorizontal_lineto_argument_sequence_Coordinates()
  {
    return (EReference)horizontal_lineto_argument_sequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvertical_lineto()
  {
    return vertical_linetoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvertical_lineto_Vertical_lineto_argument_sequence()
  {
    return (EReference)vertical_linetoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvertical_lineto_argument_sequence()
  {
    return vertical_lineto_argument_sequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getvertical_lineto_argument_sequence_Coordinates()
  {
    return (EReference)vertical_lineto_argument_sequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcurveto()
  {
    return curvetoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcurveto_Curveto_argument_sequence()
  {
    return (EReference)curvetoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcurveto_argument_sequence()
  {
    return curveto_argument_sequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcurveto_argument_sequence_Curveto_arguments()
  {
    return (EReference)curveto_argument_sequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcurveto_argument()
  {
    return curveto_argumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcurveto_argument_C1()
  {
    return (EReference)curveto_argumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcurveto_argument_C2()
  {
    return (EReference)curveto_argumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcurveto_argument_C3()
  {
    return (EReference)curveto_argumentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsmooth_curveto()
  {
    return smooth_curvetoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsmooth_curveto_Smooth_curveto_argument_sequence()
  {
    return (EReference)smooth_curvetoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsmooth_curveto_argument_sequence()
  {
    return smooth_curveto_argument_sequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsmooth_curveto_argument_sequence_Smooth_curveto_arguments()
  {
    return (EReference)smooth_curveto_argument_sequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsmooth_curveto_argument()
  {
    return smooth_curveto_argumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsmooth_curveto_argument_C1()
  {
    return (EReference)smooth_curveto_argumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsmooth_curveto_argument_C2()
  {
    return (EReference)smooth_curveto_argumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getquadratic_bezier_curveto()
  {
    return quadratic_bezier_curvetoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getquadratic_bezier_curveto_argument_sequence()
  {
    return quadratic_bezier_curveto_argument_sequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getquadratic_bezier_curveto_argument_sequence_Quadratic_bezier_curveto_arguments()
  {
    return (EReference)quadratic_bezier_curveto_argument_sequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getquadratic_bezier_curveto_argument()
  {
    return quadratic_bezier_curveto_argumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getquadratic_bezier_curveto_argument_C1()
  {
    return (EReference)quadratic_bezier_curveto_argumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getquadratic_bezier_curveto_argument_C2()
  {
    return (EReference)quadratic_bezier_curveto_argumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsmooth_quadratic_bezier_curveto()
  {
    return smooth_quadratic_bezier_curvetoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsmooth_quadratic_bezier_curveto_Smooth_quadratic_bezier_curveto_argument_sequence()
  {
    return (EReference)smooth_quadratic_bezier_curvetoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsmooth_quadratic_bezier_curveto_argument_sequence()
  {
    return smooth_quadratic_bezier_curveto_argument_sequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsmooth_quadratic_bezier_curveto_argument_sequence_Coordinate_pairs()
  {
    return (EReference)smooth_quadratic_bezier_curveto_argument_sequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getelliptical_arc()
  {
    return elliptical_arcEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getelliptical_arc_Elliptical_arc_argument_sequence()
  {
    return (EReference)elliptical_arcEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getelliptical_arc_argument_sequence()
  {
    return elliptical_arc_argument_sequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getelliptical_arc_argument_sequence_Elliptical_arc_arguments()
  {
    return (EReference)elliptical_arc_argument_sequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getelliptical_arc_argument()
  {
    return elliptical_arc_argumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getelliptical_arc_argument_Rx()
  {
    return (EReference)elliptical_arc_argumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getelliptical_arc_argument_Ry()
  {
    return (EReference)elliptical_arc_argumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getelliptical_arc_argument_Rotation()
  {
    return (EReference)elliptical_arc_argumentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getelliptical_arc_argument_Largearcflag()
  {
    return (EAttribute)elliptical_arc_argumentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getelliptical_arc_argument_Sweepflag()
  {
    return (EAttribute)elliptical_arc_argumentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getelliptical_arc_argument_Coordinate_pair()
  {
    return (EReference)elliptical_arc_argumentEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcoordinate_pair()
  {
    return coordinate_pairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcoordinate_pair_C1()
  {
    return (EReference)coordinate_pairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getcoordinate_pair_C2()
  {
    return (EReference)coordinate_pairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getcoordinate()
  {
    return coordinateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnumber()
  {
    return numberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getnumber_Sign()
  {
    return (EAttribute)numberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getnumber_Nonnegative_number()
  {
    return (EReference)numberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnonnegative_number()
  {
    return nonnegative_numberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getnonnegative_number_Intseq()
  {
    return (EReference)nonnegative_numberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getnonnegative_number_Floatseq()
  {
    return (EReference)nonnegative_numberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getnonnegative_number_Exponent()
  {
    return (EReference)nonnegative_numberEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getexponent()
  {
    return exponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getexponent_Sign()
  {
    return (EAttribute)exponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getexponent_Digit_sequence()
  {
    return (EReference)exponentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdigit_sequence()
  {
    return digit_sequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdigit_sequence_Digits()
  {
    return (EAttribute)digit_sequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SvgPathFactory getSvgPathFactory()
  {
    return (SvgPathFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    svg_pathEClass = createEClass(SVG_PATH);
    createEReference(svg_pathEClass, SVG_PATH__MOVETO_DRAWTO_COMMAND_GROUPS);

    moveto_drawto_command_groupsEClass = createEClass(MOVETO_DRAWTO_COMMAND_GROUPS);
    createEReference(moveto_drawto_command_groupsEClass, MOVETO_DRAWTO_COMMAND_GROUPS__COMMANDS);

    moveto_drawto_command_groupEClass = createEClass(MOVETO_DRAWTO_COMMAND_GROUP);
    createEReference(moveto_drawto_command_groupEClass, MOVETO_DRAWTO_COMMAND_GROUP__MOVETO);
    createEReference(moveto_drawto_command_groupEClass, MOVETO_DRAWTO_COMMAND_GROUP__DRAWTO_COMMANDS);

    movetoEClass = createEClass(MOVETO);
    createEReference(movetoEClass, MOVETO__POINT);
    createEReference(movetoEClass, MOVETO__LINETO_ARGUMENT_SEQUENCE);

    lineto_argument_sequenceEClass = createEClass(LINETO_ARGUMENT_SEQUENCE);
    createEReference(lineto_argument_sequenceEClass, LINETO_ARGUMENT_SEQUENCE__PAIRS);

    drawto_commandsEClass = createEClass(DRAWTO_COMMANDS);
    createEReference(drawto_commandsEClass, DRAWTO_COMMANDS__DRAWTO_COMMANDS);

    drawto_commandEClass = createEClass(DRAWTO_COMMAND);

    closepathEClass = createEClass(CLOSEPATH);

    linetoEClass = createEClass(LINETO);
    createEReference(linetoEClass, LINETO__LINETO_ARGUMENT_SEQUENCE);

    horizontal_linetoEClass = createEClass(HORIZONTAL_LINETO);
    createEReference(horizontal_linetoEClass, HORIZONTAL_LINETO__HORIZONTAL_LINETO_ARGUMENT_SEQUENCE);

    horizontal_lineto_argument_sequenceEClass = createEClass(HORIZONTAL_LINETO_ARGUMENT_SEQUENCE);
    createEReference(horizontal_lineto_argument_sequenceEClass, HORIZONTAL_LINETO_ARGUMENT_SEQUENCE__COORDINATES);

    vertical_linetoEClass = createEClass(VERTICAL_LINETO);
    createEReference(vertical_linetoEClass, VERTICAL_LINETO__VERTICAL_LINETO_ARGUMENT_SEQUENCE);

    vertical_lineto_argument_sequenceEClass = createEClass(VERTICAL_LINETO_ARGUMENT_SEQUENCE);
    createEReference(vertical_lineto_argument_sequenceEClass, VERTICAL_LINETO_ARGUMENT_SEQUENCE__COORDINATES);

    curvetoEClass = createEClass(CURVETO);
    createEReference(curvetoEClass, CURVETO__CURVETO_ARGUMENT_SEQUENCE);

    curveto_argument_sequenceEClass = createEClass(CURVETO_ARGUMENT_SEQUENCE);
    createEReference(curveto_argument_sequenceEClass, CURVETO_ARGUMENT_SEQUENCE__CURVETO_ARGUMENTS);

    curveto_argumentEClass = createEClass(CURVETO_ARGUMENT);
    createEReference(curveto_argumentEClass, CURVETO_ARGUMENT__C1);
    createEReference(curveto_argumentEClass, CURVETO_ARGUMENT__C2);
    createEReference(curveto_argumentEClass, CURVETO_ARGUMENT__C3);

    smooth_curvetoEClass = createEClass(SMOOTH_CURVETO);
    createEReference(smooth_curvetoEClass, SMOOTH_CURVETO__SMOOTH_CURVETO_ARGUMENT_SEQUENCE);

    smooth_curveto_argument_sequenceEClass = createEClass(SMOOTH_CURVETO_ARGUMENT_SEQUENCE);
    createEReference(smooth_curveto_argument_sequenceEClass, SMOOTH_CURVETO_ARGUMENT_SEQUENCE__SMOOTH_CURVETO_ARGUMENTS);

    smooth_curveto_argumentEClass = createEClass(SMOOTH_CURVETO_ARGUMENT);
    createEReference(smooth_curveto_argumentEClass, SMOOTH_CURVETO_ARGUMENT__C1);
    createEReference(smooth_curveto_argumentEClass, SMOOTH_CURVETO_ARGUMENT__C2);

    quadratic_bezier_curvetoEClass = createEClass(QUADRATIC_BEZIER_CURVETO);

    quadratic_bezier_curveto_argument_sequenceEClass = createEClass(QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE);
    createEReference(quadratic_bezier_curveto_argument_sequenceEClass, QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE__QUADRATIC_BEZIER_CURVETO_ARGUMENTS);

    quadratic_bezier_curveto_argumentEClass = createEClass(QUADRATIC_BEZIER_CURVETO_ARGUMENT);
    createEReference(quadratic_bezier_curveto_argumentEClass, QUADRATIC_BEZIER_CURVETO_ARGUMENT__C1);
    createEReference(quadratic_bezier_curveto_argumentEClass, QUADRATIC_BEZIER_CURVETO_ARGUMENT__C2);

    smooth_quadratic_bezier_curvetoEClass = createEClass(SMOOTH_QUADRATIC_BEZIER_CURVETO);
    createEReference(smooth_quadratic_bezier_curvetoEClass, SMOOTH_QUADRATIC_BEZIER_CURVETO__SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE);

    smooth_quadratic_bezier_curveto_argument_sequenceEClass = createEClass(SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE);
    createEReference(smooth_quadratic_bezier_curveto_argument_sequenceEClass, SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE__COORDINATE_PAIRS);

    elliptical_arcEClass = createEClass(ELLIPTICAL_ARC);
    createEReference(elliptical_arcEClass, ELLIPTICAL_ARC__ELLIPTICAL_ARC_ARGUMENT_SEQUENCE);

    elliptical_arc_argument_sequenceEClass = createEClass(ELLIPTICAL_ARC_ARGUMENT_SEQUENCE);
    createEReference(elliptical_arc_argument_sequenceEClass, ELLIPTICAL_ARC_ARGUMENT_SEQUENCE__ELLIPTICAL_ARC_ARGUMENTS);

    elliptical_arc_argumentEClass = createEClass(ELLIPTICAL_ARC_ARGUMENT);
    createEReference(elliptical_arc_argumentEClass, ELLIPTICAL_ARC_ARGUMENT__RX);
    createEReference(elliptical_arc_argumentEClass, ELLIPTICAL_ARC_ARGUMENT__RY);
    createEReference(elliptical_arc_argumentEClass, ELLIPTICAL_ARC_ARGUMENT__ROTATION);
    createEAttribute(elliptical_arc_argumentEClass, ELLIPTICAL_ARC_ARGUMENT__LARGEARCFLAG);
    createEAttribute(elliptical_arc_argumentEClass, ELLIPTICAL_ARC_ARGUMENT__SWEEPFLAG);
    createEReference(elliptical_arc_argumentEClass, ELLIPTICAL_ARC_ARGUMENT__COORDINATE_PAIR);

    coordinate_pairEClass = createEClass(COORDINATE_PAIR);
    createEReference(coordinate_pairEClass, COORDINATE_PAIR__C1);
    createEReference(coordinate_pairEClass, COORDINATE_PAIR__C2);

    coordinateEClass = createEClass(COORDINATE);

    numberEClass = createEClass(NUMBER);
    createEAttribute(numberEClass, NUMBER__SIGN);
    createEReference(numberEClass, NUMBER__NONNEGATIVE_NUMBER);

    nonnegative_numberEClass = createEClass(NONNEGATIVE_NUMBER);
    createEReference(nonnegative_numberEClass, NONNEGATIVE_NUMBER__INTSEQ);
    createEReference(nonnegative_numberEClass, NONNEGATIVE_NUMBER__FLOATSEQ);
    createEReference(nonnegative_numberEClass, NONNEGATIVE_NUMBER__EXPONENT);

    exponentEClass = createEClass(EXPONENT);
    createEAttribute(exponentEClass, EXPONENT__SIGN);
    createEReference(exponentEClass, EXPONENT__DIGIT_SEQUENCE);

    digit_sequenceEClass = createEClass(DIGIT_SEQUENCE);
    createEAttribute(digit_sequenceEClass, DIGIT_SEQUENCE__DIGITS);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    closepathEClass.getESuperTypes().add(this.getdrawto_command());
    linetoEClass.getESuperTypes().add(this.getdrawto_command());
    horizontal_linetoEClass.getESuperTypes().add(this.getdrawto_command());
    vertical_linetoEClass.getESuperTypes().add(this.getdrawto_command());
    curvetoEClass.getESuperTypes().add(this.getdrawto_command());
    smooth_curvetoEClass.getESuperTypes().add(this.getdrawto_command());
    quadratic_bezier_curvetoEClass.getESuperTypes().add(this.getdrawto_command());
    quadratic_bezier_curveto_argument_sequenceEClass.getESuperTypes().add(this.getquadratic_bezier_curveto());
    smooth_quadratic_bezier_curvetoEClass.getESuperTypes().add(this.getdrawto_command());
    elliptical_arcEClass.getESuperTypes().add(this.getdrawto_command());
    numberEClass.getESuperTypes().add(this.getcoordinate());

    // Initialize classes and features; add operations and parameters
    initEClass(svg_pathEClass, svg_path.class, "svg_path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsvg_path_Moveto_drawto_command_groups(), this.getmoveto_drawto_command_groups(), null, "moveto_drawto_command_groups", null, 0, 1, svg_path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moveto_drawto_command_groupsEClass, moveto_drawto_command_groups.class, "moveto_drawto_command_groups", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getmoveto_drawto_command_groups_Commands(), this.getmoveto_drawto_command_group(), null, "commands", null, 0, -1, moveto_drawto_command_groups.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moveto_drawto_command_groupEClass, moveto_drawto_command_group.class, "moveto_drawto_command_group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getmoveto_drawto_command_group_Moveto(), this.getmoveto(), null, "moveto", null, 0, 1, moveto_drawto_command_group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmoveto_drawto_command_group_Drawto_commands(), this.getdrawto_commands(), null, "drawto_commands", null, 0, 1, moveto_drawto_command_group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(movetoEClass, moveto.class, "moveto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getmoveto_Point(), this.getcoordinate_pair(), null, "point", null, 0, 1, moveto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getmoveto_Lineto_argument_sequence(), this.getlineto_argument_sequence(), null, "lineto_argument_sequence", null, 0, 1, moveto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lineto_argument_sequenceEClass, lineto_argument_sequence.class, "lineto_argument_sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlineto_argument_sequence_Pairs(), this.getcoordinate_pair(), null, "pairs", null, 0, -1, lineto_argument_sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(drawto_commandsEClass, drawto_commands.class, "drawto_commands", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getdrawto_commands_Drawto_commands(), this.getdrawto_command(), null, "drawto_commands", null, 0, -1, drawto_commands.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(drawto_commandEClass, drawto_command.class, "drawto_command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(closepathEClass, closepath.class, "closepath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(linetoEClass, lineto.class, "lineto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getlineto_Lineto_argument_sequence(), this.getlineto_argument_sequence(), null, "lineto_argument_sequence", null, 0, 1, lineto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(horizontal_linetoEClass, horizontal_lineto.class, "horizontal_lineto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gethorizontal_lineto_Horizontal_lineto_argument_sequence(), this.gethorizontal_lineto_argument_sequence(), null, "horizontal_lineto_argument_sequence", null, 0, 1, horizontal_lineto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(horizontal_lineto_argument_sequenceEClass, horizontal_lineto_argument_sequence.class, "horizontal_lineto_argument_sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(gethorizontal_lineto_argument_sequence_Coordinates(), this.getcoordinate(), null, "coordinates", null, 0, -1, horizontal_lineto_argument_sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vertical_linetoEClass, vertical_lineto.class, "vertical_lineto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvertical_lineto_Vertical_lineto_argument_sequence(), this.getvertical_lineto_argument_sequence(), null, "vertical_lineto_argument_sequence", null, 0, 1, vertical_lineto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vertical_lineto_argument_sequenceEClass, vertical_lineto_argument_sequence.class, "vertical_lineto_argument_sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getvertical_lineto_argument_sequence_Coordinates(), this.getcoordinate(), null, "coordinates", null, 0, -1, vertical_lineto_argument_sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(curvetoEClass, curveto.class, "curveto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcurveto_Curveto_argument_sequence(), this.getcurveto_argument_sequence(), null, "curveto_argument_sequence", null, 0, 1, curveto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(curveto_argument_sequenceEClass, curveto_argument_sequence.class, "curveto_argument_sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcurveto_argument_sequence_Curveto_arguments(), this.getcurveto_argument(), null, "curveto_arguments", null, 0, -1, curveto_argument_sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(curveto_argumentEClass, curveto_argument.class, "curveto_argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcurveto_argument_C1(), this.getcoordinate_pair(), null, "c1", null, 0, 1, curveto_argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcurveto_argument_C2(), this.getcoordinate_pair(), null, "c2", null, 0, 1, curveto_argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcurveto_argument_C3(), this.getcoordinate_pair(), null, "c3", null, 0, 1, curveto_argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smooth_curvetoEClass, smooth_curveto.class, "smooth_curveto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsmooth_curveto_Smooth_curveto_argument_sequence(), this.getsmooth_curveto_argument_sequence(), null, "smooth_curveto_argument_sequence", null, 0, 1, smooth_curveto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smooth_curveto_argument_sequenceEClass, smooth_curveto_argument_sequence.class, "smooth_curveto_argument_sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsmooth_curveto_argument_sequence_Smooth_curveto_arguments(), this.getsmooth_curveto_argument(), null, "smooth_curveto_arguments", null, 0, -1, smooth_curveto_argument_sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smooth_curveto_argumentEClass, smooth_curveto_argument.class, "smooth_curveto_argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsmooth_curveto_argument_C1(), this.getcoordinate_pair(), null, "c1", null, 0, 1, smooth_curveto_argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsmooth_curveto_argument_C2(), this.getcoordinate_pair(), null, "c2", null, 0, 1, smooth_curveto_argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quadratic_bezier_curvetoEClass, quadratic_bezier_curveto.class, "quadratic_bezier_curveto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(quadratic_bezier_curveto_argument_sequenceEClass, quadratic_bezier_curveto_argument_sequence.class, "quadratic_bezier_curveto_argument_sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getquadratic_bezier_curveto_argument_sequence_Quadratic_bezier_curveto_arguments(), this.getquadratic_bezier_curveto_argument(), null, "quadratic_bezier_curveto_arguments", null, 0, -1, quadratic_bezier_curveto_argument_sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quadratic_bezier_curveto_argumentEClass, quadratic_bezier_curveto_argument.class, "quadratic_bezier_curveto_argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getquadratic_bezier_curveto_argument_C1(), this.getcoordinate_pair(), null, "c1", null, 0, 1, quadratic_bezier_curveto_argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getquadratic_bezier_curveto_argument_C2(), this.getcoordinate_pair(), null, "c2", null, 0, 1, quadratic_bezier_curveto_argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smooth_quadratic_bezier_curvetoEClass, smooth_quadratic_bezier_curveto.class, "smooth_quadratic_bezier_curveto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsmooth_quadratic_bezier_curveto_Smooth_quadratic_bezier_curveto_argument_sequence(), this.getsmooth_quadratic_bezier_curveto_argument_sequence(), null, "smooth_quadratic_bezier_curveto_argument_sequence", null, 0, 1, smooth_quadratic_bezier_curveto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smooth_quadratic_bezier_curveto_argument_sequenceEClass, smooth_quadratic_bezier_curveto_argument_sequence.class, "smooth_quadratic_bezier_curveto_argument_sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsmooth_quadratic_bezier_curveto_argument_sequence_Coordinate_pairs(), this.getcoordinate_pair(), null, "coordinate_pairs", null, 0, -1, smooth_quadratic_bezier_curveto_argument_sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elliptical_arcEClass, elliptical_arc.class, "elliptical_arc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getelliptical_arc_Elliptical_arc_argument_sequence(), this.getelliptical_arc_argument_sequence(), null, "elliptical_arc_argument_sequence", null, 0, 1, elliptical_arc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elliptical_arc_argument_sequenceEClass, elliptical_arc_argument_sequence.class, "elliptical_arc_argument_sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getelliptical_arc_argument_sequence_Elliptical_arc_arguments(), this.getelliptical_arc_argument(), null, "elliptical_arc_arguments", null, 0, -1, elliptical_arc_argument_sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elliptical_arc_argumentEClass, elliptical_arc_argument.class, "elliptical_arc_argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getelliptical_arc_argument_Rx(), this.getnonnegative_number(), null, "rx", null, 0, 1, elliptical_arc_argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getelliptical_arc_argument_Ry(), this.getnonnegative_number(), null, "ry", null, 0, 1, elliptical_arc_argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getelliptical_arc_argument_Rotation(), this.getnumber(), null, "rotation", null, 0, 1, elliptical_arc_argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getelliptical_arc_argument_Largearcflag(), ecorePackage.getEString(), "largearcflag", null, 0, 1, elliptical_arc_argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getelliptical_arc_argument_Sweepflag(), ecorePackage.getEString(), "sweepflag", null, 0, 1, elliptical_arc_argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getelliptical_arc_argument_Coordinate_pair(), this.getcoordinate_pair(), null, "coordinate_pair", null, 0, 1, elliptical_arc_argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(coordinate_pairEClass, coordinate_pair.class, "coordinate_pair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getcoordinate_pair_C1(), this.getcoordinate(), null, "c1", null, 0, 1, coordinate_pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getcoordinate_pair_C2(), this.getcoordinate(), null, "c2", null, 0, 1, coordinate_pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(coordinateEClass, coordinate.class, "coordinate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numberEClass, number.class, "number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getnumber_Sign(), ecorePackage.getEString(), "sign", null, 0, 1, number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getnumber_Nonnegative_number(), this.getnonnegative_number(), null, "nonnegative_number", null, 0, 1, number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nonnegative_numberEClass, nonnegative_number.class, "nonnegative_number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getnonnegative_number_Intseq(), this.getdigit_sequence(), null, "intseq", null, 0, 1, nonnegative_number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getnonnegative_number_Floatseq(), this.getdigit_sequence(), null, "floatseq", null, 0, 1, nonnegative_number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getnonnegative_number_Exponent(), this.getexponent(), null, "exponent", null, 0, 1, nonnegative_number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exponentEClass, exponent.class, "exponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getexponent_Sign(), ecorePackage.getEString(), "sign", null, 0, 1, exponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getexponent_Digit_sequence(), this.getdigit_sequence(), null, "digit_sequence", null, 0, 1, exponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(digit_sequenceEClass, digit_sequence.class, "digit_sequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getdigit_sequence_Digits(), ecorePackage.getEString(), "digits", null, 0, -1, digit_sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SvgPathPackageImpl
