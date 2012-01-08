/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath;

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
 * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathFactory
 * @model kind="package"
 * @generated
 */
public interface SvgPathPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "svgPath";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bestsolution.at/efxclipse/tooling/svgpath/SvgPath";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "svgPath";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SvgPathPackage eINSTANCE = at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl.init();

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.svg_pathImpl <em>svg path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.svg_pathImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getsvg_path()
   * @generated
   */
  int SVG_PATH = 0;

  /**
   * The feature id for the '<em><b>Moveto drawto command groups</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_PATH__MOVETO_DRAWTO_COMMAND_GROUPS = 0;

  /**
   * The number of structural features of the '<em>svg path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_PATH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.moveto_drawto_command_groupsImpl <em>moveto drawto command groups</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.moveto_drawto_command_groupsImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getmoveto_drawto_command_groups()
   * @generated
   */
  int MOVETO_DRAWTO_COMMAND_GROUPS = 1;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVETO_DRAWTO_COMMAND_GROUPS__COMMANDS = 0;

  /**
   * The number of structural features of the '<em>moveto drawto command groups</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVETO_DRAWTO_COMMAND_GROUPS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.moveto_drawto_command_groupImpl <em>moveto drawto command group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.moveto_drawto_command_groupImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getmoveto_drawto_command_group()
   * @generated
   */
  int MOVETO_DRAWTO_COMMAND_GROUP = 2;

  /**
   * The feature id for the '<em><b>Moveto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVETO_DRAWTO_COMMAND_GROUP__MOVETO = 0;

  /**
   * The feature id for the '<em><b>Drawto commands</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVETO_DRAWTO_COMMAND_GROUP__DRAWTO_COMMANDS = 1;

  /**
   * The number of structural features of the '<em>moveto drawto command group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVETO_DRAWTO_COMMAND_GROUP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.movetoImpl <em>moveto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.movetoImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getmoveto()
   * @generated
   */
  int MOVETO = 3;

  /**
   * The feature id for the '<em><b>Point</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVETO__POINT = 0;

  /**
   * The feature id for the '<em><b>Lineto argument sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVETO__LINETO_ARGUMENT_SEQUENCE = 1;

  /**
   * The number of structural features of the '<em>moveto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVETO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.lineto_argument_sequenceImpl <em>lineto argument sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.lineto_argument_sequenceImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getlineto_argument_sequence()
   * @generated
   */
  int LINETO_ARGUMENT_SEQUENCE = 4;

  /**
   * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINETO_ARGUMENT_SEQUENCE__PAIRS = 0;

  /**
   * The number of structural features of the '<em>lineto argument sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINETO_ARGUMENT_SEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.drawto_commandsImpl <em>drawto commands</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.drawto_commandsImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getdrawto_commands()
   * @generated
   */
  int DRAWTO_COMMANDS = 5;

  /**
   * The feature id for the '<em><b>Drawto commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWTO_COMMANDS__DRAWTO_COMMANDS = 0;

  /**
   * The number of structural features of the '<em>drawto commands</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWTO_COMMANDS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.drawto_commandImpl <em>drawto command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.drawto_commandImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getdrawto_command()
   * @generated
   */
  int DRAWTO_COMMAND = 6;

  /**
   * The number of structural features of the '<em>drawto command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWTO_COMMAND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.closepathImpl <em>closepath</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.closepathImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getclosepath()
   * @generated
   */
  int CLOSEPATH = 7;

  /**
   * The number of structural features of the '<em>closepath</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSEPATH_FEATURE_COUNT = DRAWTO_COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.linetoImpl <em>lineto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.linetoImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getlineto()
   * @generated
   */
  int LINETO = 8;

  /**
   * The feature id for the '<em><b>Lineto argument sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINETO__LINETO_ARGUMENT_SEQUENCE = DRAWTO_COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>lineto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINETO_FEATURE_COUNT = DRAWTO_COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.horizontal_linetoImpl <em>horizontal lineto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.horizontal_linetoImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#gethorizontal_lineto()
   * @generated
   */
  int HORIZONTAL_LINETO = 9;

  /**
   * The feature id for the '<em><b>Horizontal lineto argument sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORIZONTAL_LINETO__HORIZONTAL_LINETO_ARGUMENT_SEQUENCE = DRAWTO_COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>horizontal lineto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORIZONTAL_LINETO_FEATURE_COUNT = DRAWTO_COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.horizontal_lineto_argument_sequenceImpl <em>horizontal lineto argument sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.horizontal_lineto_argument_sequenceImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#gethorizontal_lineto_argument_sequence()
   * @generated
   */
  int HORIZONTAL_LINETO_ARGUMENT_SEQUENCE = 10;

  /**
   * The feature id for the '<em><b>Coordinates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORIZONTAL_LINETO_ARGUMENT_SEQUENCE__COORDINATES = 0;

  /**
   * The number of structural features of the '<em>horizontal lineto argument sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HORIZONTAL_LINETO_ARGUMENT_SEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.vertical_linetoImpl <em>vertical lineto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.vertical_linetoImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getvertical_lineto()
   * @generated
   */
  int VERTICAL_LINETO = 11;

  /**
   * The feature id for the '<em><b>Vertical lineto argument sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTICAL_LINETO__VERTICAL_LINETO_ARGUMENT_SEQUENCE = DRAWTO_COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>vertical lineto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTICAL_LINETO_FEATURE_COUNT = DRAWTO_COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.vertical_lineto_argument_sequenceImpl <em>vertical lineto argument sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.vertical_lineto_argument_sequenceImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getvertical_lineto_argument_sequence()
   * @generated
   */
  int VERTICAL_LINETO_ARGUMENT_SEQUENCE = 12;

  /**
   * The feature id for the '<em><b>Coordinates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTICAL_LINETO_ARGUMENT_SEQUENCE__COORDINATES = 0;

  /**
   * The number of structural features of the '<em>vertical lineto argument sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTICAL_LINETO_ARGUMENT_SEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.curvetoImpl <em>curveto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.curvetoImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getcurveto()
   * @generated
   */
  int CURVETO = 13;

  /**
   * The feature id for the '<em><b>Curveto argument sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURVETO__CURVETO_ARGUMENT_SEQUENCE = DRAWTO_COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>curveto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURVETO_FEATURE_COUNT = DRAWTO_COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.curveto_argument_sequenceImpl <em>curveto argument sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.curveto_argument_sequenceImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getcurveto_argument_sequence()
   * @generated
   */
  int CURVETO_ARGUMENT_SEQUENCE = 14;

  /**
   * The feature id for the '<em><b>Curveto arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURVETO_ARGUMENT_SEQUENCE__CURVETO_ARGUMENTS = 0;

  /**
   * The number of structural features of the '<em>curveto argument sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURVETO_ARGUMENT_SEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.curveto_argumentImpl <em>curveto argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.curveto_argumentImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getcurveto_argument()
   * @generated
   */
  int CURVETO_ARGUMENT = 15;

  /**
   * The feature id for the '<em><b>C1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURVETO_ARGUMENT__C1 = 0;

  /**
   * The feature id for the '<em><b>C2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURVETO_ARGUMENT__C2 = 1;

  /**
   * The feature id for the '<em><b>C3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURVETO_ARGUMENT__C3 = 2;

  /**
   * The number of structural features of the '<em>curveto argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURVETO_ARGUMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_curvetoImpl <em>smooth curveto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_curvetoImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getsmooth_curveto()
   * @generated
   */
  int SMOOTH_CURVETO = 16;

  /**
   * The feature id for the '<em><b>Smooth curveto argument sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMOOTH_CURVETO__SMOOTH_CURVETO_ARGUMENT_SEQUENCE = DRAWTO_COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>smooth curveto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMOOTH_CURVETO_FEATURE_COUNT = DRAWTO_COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_curveto_argument_sequenceImpl <em>smooth curveto argument sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_curveto_argument_sequenceImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getsmooth_curveto_argument_sequence()
   * @generated
   */
  int SMOOTH_CURVETO_ARGUMENT_SEQUENCE = 17;

  /**
   * The feature id for the '<em><b>Smooth curveto arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMOOTH_CURVETO_ARGUMENT_SEQUENCE__SMOOTH_CURVETO_ARGUMENTS = 0;

  /**
   * The number of structural features of the '<em>smooth curveto argument sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMOOTH_CURVETO_ARGUMENT_SEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_curveto_argumentImpl <em>smooth curveto argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_curveto_argumentImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getsmooth_curveto_argument()
   * @generated
   */
  int SMOOTH_CURVETO_ARGUMENT = 18;

  /**
   * The feature id for the '<em><b>C1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMOOTH_CURVETO_ARGUMENT__C1 = 0;

  /**
   * The feature id for the '<em><b>C2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMOOTH_CURVETO_ARGUMENT__C2 = 1;

  /**
   * The number of structural features of the '<em>smooth curveto argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMOOTH_CURVETO_ARGUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.quadratic_bezier_curvetoImpl <em>quadratic bezier curveto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.quadratic_bezier_curvetoImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getquadratic_bezier_curveto()
   * @generated
   */
  int QUADRATIC_BEZIER_CURVETO = 19;

  /**
   * The number of structural features of the '<em>quadratic bezier curveto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUADRATIC_BEZIER_CURVETO_FEATURE_COUNT = DRAWTO_COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.quadratic_bezier_curveto_argument_sequenceImpl <em>quadratic bezier curveto argument sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.quadratic_bezier_curveto_argument_sequenceImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getquadratic_bezier_curveto_argument_sequence()
   * @generated
   */
  int QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE = 20;

  /**
   * The feature id for the '<em><b>Quadratic bezier curveto arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE__QUADRATIC_BEZIER_CURVETO_ARGUMENTS = QUADRATIC_BEZIER_CURVETO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>quadratic bezier curveto argument sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE_FEATURE_COUNT = QUADRATIC_BEZIER_CURVETO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.quadratic_bezier_curveto_argumentImpl <em>quadratic bezier curveto argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.quadratic_bezier_curveto_argumentImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getquadratic_bezier_curveto_argument()
   * @generated
   */
  int QUADRATIC_BEZIER_CURVETO_ARGUMENT = 21;

  /**
   * The feature id for the '<em><b>C1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUADRATIC_BEZIER_CURVETO_ARGUMENT__C1 = 0;

  /**
   * The feature id for the '<em><b>C2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUADRATIC_BEZIER_CURVETO_ARGUMENT__C2 = 1;

  /**
   * The number of structural features of the '<em>quadratic bezier curveto argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUADRATIC_BEZIER_CURVETO_ARGUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_quadratic_bezier_curvetoImpl <em>smooth quadratic bezier curveto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_quadratic_bezier_curvetoImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getsmooth_quadratic_bezier_curveto()
   * @generated
   */
  int SMOOTH_QUADRATIC_BEZIER_CURVETO = 22;

  /**
   * The feature id for the '<em><b>Smooth quadratic bezier curveto argument sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMOOTH_QUADRATIC_BEZIER_CURVETO__SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE = DRAWTO_COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>smooth quadratic bezier curveto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMOOTH_QUADRATIC_BEZIER_CURVETO_FEATURE_COUNT = DRAWTO_COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_quadratic_bezier_curveto_argument_sequenceImpl <em>smooth quadratic bezier curveto argument sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_quadratic_bezier_curveto_argument_sequenceImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getsmooth_quadratic_bezier_curveto_argument_sequence()
   * @generated
   */
  int SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE = 23;

  /**
   * The feature id for the '<em><b>Coordinate pairs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE__COORDINATE_PAIRS = 0;

  /**
   * The number of structural features of the '<em>smooth quadratic bezier curveto argument sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arcImpl <em>elliptical arc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arcImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getelliptical_arc()
   * @generated
   */
  int ELLIPTICAL_ARC = 24;

  /**
   * The feature id for the '<em><b>Elliptical arc argument sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPTICAL_ARC__ELLIPTICAL_ARC_ARGUMENT_SEQUENCE = DRAWTO_COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>elliptical arc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPTICAL_ARC_FEATURE_COUNT = DRAWTO_COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arc_argument_sequenceImpl <em>elliptical arc argument sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arc_argument_sequenceImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getelliptical_arc_argument_sequence()
   * @generated
   */
  int ELLIPTICAL_ARC_ARGUMENT_SEQUENCE = 25;

  /**
   * The feature id for the '<em><b>Elliptical arc arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPTICAL_ARC_ARGUMENT_SEQUENCE__ELLIPTICAL_ARC_ARGUMENTS = 0;

  /**
   * The number of structural features of the '<em>elliptical arc argument sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPTICAL_ARC_ARGUMENT_SEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arc_argumentImpl <em>elliptical arc argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arc_argumentImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getelliptical_arc_argument()
   * @generated
   */
  int ELLIPTICAL_ARC_ARGUMENT = 26;

  /**
   * The feature id for the '<em><b>Rx</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPTICAL_ARC_ARGUMENT__RX = 0;

  /**
   * The feature id for the '<em><b>Ry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPTICAL_ARC_ARGUMENT__RY = 1;

  /**
   * The feature id for the '<em><b>Rotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPTICAL_ARC_ARGUMENT__ROTATION = 2;

  /**
   * The feature id for the '<em><b>Largearcflag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPTICAL_ARC_ARGUMENT__LARGEARCFLAG = 3;

  /**
   * The feature id for the '<em><b>Sweepflag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPTICAL_ARC_ARGUMENT__SWEEPFLAG = 4;

  /**
   * The feature id for the '<em><b>Coordinate pair</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPTICAL_ARC_ARGUMENT__COORDINATE_PAIR = 5;

  /**
   * The number of structural features of the '<em>elliptical arc argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELLIPTICAL_ARC_ARGUMENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.coordinate_pairImpl <em>coordinate pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.coordinate_pairImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getcoordinate_pair()
   * @generated
   */
  int COORDINATE_PAIR = 27;

  /**
   * The feature id for the '<em><b>C1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COORDINATE_PAIR__C1 = 0;

  /**
   * The feature id for the '<em><b>C2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COORDINATE_PAIR__C2 = 1;

  /**
   * The number of structural features of the '<em>coordinate pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COORDINATE_PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.coordinateImpl <em>coordinate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.coordinateImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getcoordinate()
   * @generated
   */
  int COORDINATE = 28;

  /**
   * The number of structural features of the '<em>coordinate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COORDINATE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.numberImpl <em>number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.numberImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getnumber()
   * @generated
   */
  int NUMBER = 29;

  /**
   * The feature id for the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__SIGN = COORDINATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Nonnegative number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__NONNEGATIVE_NUMBER = COORDINATE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FEATURE_COUNT = COORDINATE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.nonnegative_numberImpl <em>nonnegative number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.nonnegative_numberImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getnonnegative_number()
   * @generated
   */
  int NONNEGATIVE_NUMBER = 30;

  /**
   * The feature id for the '<em><b>Intseq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NONNEGATIVE_NUMBER__INTSEQ = 0;

  /**
   * The feature id for the '<em><b>Floatseq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NONNEGATIVE_NUMBER__FLOATSEQ = 1;

  /**
   * The feature id for the '<em><b>Exponent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NONNEGATIVE_NUMBER__EXPONENT = 2;

  /**
   * The number of structural features of the '<em>nonnegative number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NONNEGATIVE_NUMBER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.exponentImpl <em>exponent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.exponentImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getexponent()
   * @generated
   */
  int EXPONENT = 31;

  /**
   * The feature id for the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPONENT__SIGN = 0;

  /**
   * The feature id for the '<em><b>Digit sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPONENT__DIGIT_SEQUENCE = 1;

  /**
   * The number of structural features of the '<em>exponent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPONENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.digit_sequenceImpl <em>digit sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.digit_sequenceImpl
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getdigit_sequence()
   * @generated
   */
  int DIGIT_SEQUENCE = 32;

  /**
   * The feature id for the '<em><b>Digits</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGIT_SEQUENCE__DIGITS = 0;

  /**
   * The number of structural features of the '<em>digit sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGIT_SEQUENCE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.svg_path <em>svg path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>svg path</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.svg_path
   * @generated
   */
  EClass getsvg_path();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.svg_path#getMoveto_drawto_command_groups <em>Moveto drawto command groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Moveto drawto command groups</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.svg_path#getMoveto_drawto_command_groups()
   * @see #getsvg_path()
   * @generated
   */
  EReference getsvg_path_Moveto_drawto_command_groups();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_groups <em>moveto drawto command groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>moveto drawto command groups</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_groups
   * @generated
   */
  EClass getmoveto_drawto_command_groups();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_groups#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_groups#getCommands()
   * @see #getmoveto_drawto_command_groups()
   * @generated
   */
  EReference getmoveto_drawto_command_groups_Commands();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_group <em>moveto drawto command group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>moveto drawto command group</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_group
   * @generated
   */
  EClass getmoveto_drawto_command_group();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_group#getMoveto <em>Moveto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Moveto</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_group#getMoveto()
   * @see #getmoveto_drawto_command_group()
   * @generated
   */
  EReference getmoveto_drawto_command_group_Moveto();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_group#getDrawto_commands <em>Drawto commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Drawto commands</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_group#getDrawto_commands()
   * @see #getmoveto_drawto_command_group()
   * @generated
   */
  EReference getmoveto_drawto_command_group_Drawto_commands();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto <em>moveto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>moveto</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto
   * @generated
   */
  EClass getmoveto();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto#getPoint <em>Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Point</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto#getPoint()
   * @see #getmoveto()
   * @generated
   */
  EReference getmoveto_Point();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto#getLineto_argument_sequence <em>Lineto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lineto argument sequence</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto#getLineto_argument_sequence()
   * @see #getmoveto()
   * @generated
   */
  EReference getmoveto_Lineto_argument_sequence();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.lineto_argument_sequence <em>lineto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>lineto argument sequence</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.lineto_argument_sequence
   * @generated
   */
  EClass getlineto_argument_sequence();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.lineto_argument_sequence#getPairs <em>Pairs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pairs</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.lineto_argument_sequence#getPairs()
   * @see #getlineto_argument_sequence()
   * @generated
   */
  EReference getlineto_argument_sequence_Pairs();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.drawto_commands <em>drawto commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>drawto commands</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.drawto_commands
   * @generated
   */
  EClass getdrawto_commands();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.drawto_commands#getDrawto_commands <em>Drawto commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Drawto commands</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.drawto_commands#getDrawto_commands()
   * @see #getdrawto_commands()
   * @generated
   */
  EReference getdrawto_commands_Drawto_commands();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.drawto_command <em>drawto command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>drawto command</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.drawto_command
   * @generated
   */
  EClass getdrawto_command();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.closepath <em>closepath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>closepath</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.closepath
   * @generated
   */
  EClass getclosepath();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.lineto <em>lineto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>lineto</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.lineto
   * @generated
   */
  EClass getlineto();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.lineto#getLineto_argument_sequence <em>Lineto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lineto argument sequence</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.lineto#getLineto_argument_sequence()
   * @see #getlineto()
   * @generated
   */
  EReference getlineto_Lineto_argument_sequence();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.horizontal_lineto <em>horizontal lineto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>horizontal lineto</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.horizontal_lineto
   * @generated
   */
  EClass gethorizontal_lineto();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.horizontal_lineto#getHorizontal_lineto_argument_sequence <em>Horizontal lineto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Horizontal lineto argument sequence</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.horizontal_lineto#getHorizontal_lineto_argument_sequence()
   * @see #gethorizontal_lineto()
   * @generated
   */
  EReference gethorizontal_lineto_Horizontal_lineto_argument_sequence();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.horizontal_lineto_argument_sequence <em>horizontal lineto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>horizontal lineto argument sequence</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.horizontal_lineto_argument_sequence
   * @generated
   */
  EClass gethorizontal_lineto_argument_sequence();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.horizontal_lineto_argument_sequence#getCoordinates <em>Coordinates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Coordinates</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.horizontal_lineto_argument_sequence#getCoordinates()
   * @see #gethorizontal_lineto_argument_sequence()
   * @generated
   */
  EReference gethorizontal_lineto_argument_sequence_Coordinates();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.vertical_lineto <em>vertical lineto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>vertical lineto</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.vertical_lineto
   * @generated
   */
  EClass getvertical_lineto();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.vertical_lineto#getVertical_lineto_argument_sequence <em>Vertical lineto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vertical lineto argument sequence</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.vertical_lineto#getVertical_lineto_argument_sequence()
   * @see #getvertical_lineto()
   * @generated
   */
  EReference getvertical_lineto_Vertical_lineto_argument_sequence();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.vertical_lineto_argument_sequence <em>vertical lineto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>vertical lineto argument sequence</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.vertical_lineto_argument_sequence
   * @generated
   */
  EClass getvertical_lineto_argument_sequence();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.vertical_lineto_argument_sequence#getCoordinates <em>Coordinates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Coordinates</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.vertical_lineto_argument_sequence#getCoordinates()
   * @see #getvertical_lineto_argument_sequence()
   * @generated
   */
  EReference getvertical_lineto_argument_sequence_Coordinates();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto <em>curveto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>curveto</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto
   * @generated
   */
  EClass getcurveto();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto#getCurveto_argument_sequence <em>Curveto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Curveto argument sequence</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto#getCurveto_argument_sequence()
   * @see #getcurveto()
   * @generated
   */
  EReference getcurveto_Curveto_argument_sequence();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument_sequence <em>curveto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>curveto argument sequence</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument_sequence
   * @generated
   */
  EClass getcurveto_argument_sequence();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument_sequence#getCurveto_arguments <em>Curveto arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Curveto arguments</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument_sequence#getCurveto_arguments()
   * @see #getcurveto_argument_sequence()
   * @generated
   */
  EReference getcurveto_argument_sequence_Curveto_arguments();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument <em>curveto argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>curveto argument</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument
   * @generated
   */
  EClass getcurveto_argument();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument#getC1 <em>C1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C1</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument#getC1()
   * @see #getcurveto_argument()
   * @generated
   */
  EReference getcurveto_argument_C1();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument#getC2 <em>C2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C2</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument#getC2()
   * @see #getcurveto_argument()
   * @generated
   */
  EReference getcurveto_argument_C2();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument#getC3 <em>C3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C3</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument#getC3()
   * @see #getcurveto_argument()
   * @generated
   */
  EReference getcurveto_argument_C3();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto <em>smooth curveto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>smooth curveto</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto
   * @generated
   */
  EClass getsmooth_curveto();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto#getSmooth_curveto_argument_sequence <em>Smooth curveto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Smooth curveto argument sequence</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto#getSmooth_curveto_argument_sequence()
   * @see #getsmooth_curveto()
   * @generated
   */
  EReference getsmooth_curveto_Smooth_curveto_argument_sequence();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument_sequence <em>smooth curveto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>smooth curveto argument sequence</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument_sequence
   * @generated
   */
  EClass getsmooth_curveto_argument_sequence();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument_sequence#getSmooth_curveto_arguments <em>Smooth curveto arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Smooth curveto arguments</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument_sequence#getSmooth_curveto_arguments()
   * @see #getsmooth_curveto_argument_sequence()
   * @generated
   */
  EReference getsmooth_curveto_argument_sequence_Smooth_curveto_arguments();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument <em>smooth curveto argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>smooth curveto argument</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument
   * @generated
   */
  EClass getsmooth_curveto_argument();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument#getC1 <em>C1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C1</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument#getC1()
   * @see #getsmooth_curveto_argument()
   * @generated
   */
  EReference getsmooth_curveto_argument_C1();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument#getC2 <em>C2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C2</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument#getC2()
   * @see #getsmooth_curveto_argument()
   * @generated
   */
  EReference getsmooth_curveto_argument_C2();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto <em>quadratic bezier curveto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>quadratic bezier curveto</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto
   * @generated
   */
  EClass getquadratic_bezier_curveto();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument_sequence <em>quadratic bezier curveto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>quadratic bezier curveto argument sequence</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument_sequence
   * @generated
   */
  EClass getquadratic_bezier_curveto_argument_sequence();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument_sequence#getQuadratic_bezier_curveto_arguments <em>Quadratic bezier curveto arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quadratic bezier curveto arguments</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument_sequence#getQuadratic_bezier_curveto_arguments()
   * @see #getquadratic_bezier_curveto_argument_sequence()
   * @generated
   */
  EReference getquadratic_bezier_curveto_argument_sequence_Quadratic_bezier_curveto_arguments();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument <em>quadratic bezier curveto argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>quadratic bezier curveto argument</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument
   * @generated
   */
  EClass getquadratic_bezier_curveto_argument();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument#getC1 <em>C1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C1</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument#getC1()
   * @see #getquadratic_bezier_curveto_argument()
   * @generated
   */
  EReference getquadratic_bezier_curveto_argument_C1();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument#getC2 <em>C2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C2</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument#getC2()
   * @see #getquadratic_bezier_curveto_argument()
   * @generated
   */
  EReference getquadratic_bezier_curveto_argument_C2();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_quadratic_bezier_curveto <em>smooth quadratic bezier curveto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>smooth quadratic bezier curveto</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_quadratic_bezier_curveto
   * @generated
   */
  EClass getsmooth_quadratic_bezier_curveto();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_quadratic_bezier_curveto#getSmooth_quadratic_bezier_curveto_argument_sequence <em>Smooth quadratic bezier curveto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Smooth quadratic bezier curveto argument sequence</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_quadratic_bezier_curveto#getSmooth_quadratic_bezier_curveto_argument_sequence()
   * @see #getsmooth_quadratic_bezier_curveto()
   * @generated
   */
  EReference getsmooth_quadratic_bezier_curveto_Smooth_quadratic_bezier_curveto_argument_sequence();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_quadratic_bezier_curveto_argument_sequence <em>smooth quadratic bezier curveto argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>smooth quadratic bezier curveto argument sequence</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_quadratic_bezier_curveto_argument_sequence
   * @generated
   */
  EClass getsmooth_quadratic_bezier_curveto_argument_sequence();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_quadratic_bezier_curveto_argument_sequence#getCoordinate_pairs <em>Coordinate pairs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Coordinate pairs</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_quadratic_bezier_curveto_argument_sequence#getCoordinate_pairs()
   * @see #getsmooth_quadratic_bezier_curveto_argument_sequence()
   * @generated
   */
  EReference getsmooth_quadratic_bezier_curveto_argument_sequence_Coordinate_pairs();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc <em>elliptical arc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>elliptical arc</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc
   * @generated
   */
  EClass getelliptical_arc();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc#getElliptical_arc_argument_sequence <em>Elliptical arc argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elliptical arc argument sequence</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc#getElliptical_arc_argument_sequence()
   * @see #getelliptical_arc()
   * @generated
   */
  EReference getelliptical_arc_Elliptical_arc_argument_sequence();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument_sequence <em>elliptical arc argument sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>elliptical arc argument sequence</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument_sequence
   * @generated
   */
  EClass getelliptical_arc_argument_sequence();

  /**
   * Returns the meta object for the containment reference list '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument_sequence#getElliptical_arc_arguments <em>Elliptical arc arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elliptical arc arguments</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument_sequence#getElliptical_arc_arguments()
   * @see #getelliptical_arc_argument_sequence()
   * @generated
   */
  EReference getelliptical_arc_argument_sequence_Elliptical_arc_arguments();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument <em>elliptical arc argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>elliptical arc argument</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument
   * @generated
   */
  EClass getelliptical_arc_argument();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getRx <em>Rx</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rx</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getRx()
   * @see #getelliptical_arc_argument()
   * @generated
   */
  EReference getelliptical_arc_argument_Rx();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getRy <em>Ry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ry</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getRy()
   * @see #getelliptical_arc_argument()
   * @generated
   */
  EReference getelliptical_arc_argument_Ry();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getRotation <em>Rotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rotation</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getRotation()
   * @see #getelliptical_arc_argument()
   * @generated
   */
  EReference getelliptical_arc_argument_Rotation();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getLargearcflag <em>Largearcflag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Largearcflag</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getLargearcflag()
   * @see #getelliptical_arc_argument()
   * @generated
   */
  EAttribute getelliptical_arc_argument_Largearcflag();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getSweepflag <em>Sweepflag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sweepflag</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getSweepflag()
   * @see #getelliptical_arc_argument()
   * @generated
   */
  EAttribute getelliptical_arc_argument_Sweepflag();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getCoordinate_pair <em>Coordinate pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Coordinate pair</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getCoordinate_pair()
   * @see #getelliptical_arc_argument()
   * @generated
   */
  EReference getelliptical_arc_argument_Coordinate_pair();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate_pair <em>coordinate pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>coordinate pair</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate_pair
   * @generated
   */
  EClass getcoordinate_pair();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate_pair#getC1 <em>C1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C1</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate_pair#getC1()
   * @see #getcoordinate_pair()
   * @generated
   */
  EReference getcoordinate_pair_C1();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate_pair#getC2 <em>C2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>C2</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate_pair#getC2()
   * @see #getcoordinate_pair()
   * @generated
   */
  EReference getcoordinate_pair_C2();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate <em>coordinate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>coordinate</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate
   * @generated
   */
  EClass getcoordinate();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.number <em>number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>number</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.number
   * @generated
   */
  EClass getnumber();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.number#getSign <em>Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sign</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.number#getSign()
   * @see #getnumber()
   * @generated
   */
  EAttribute getnumber_Sign();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.number#getNonnegative_number <em>Nonnegative number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nonnegative number</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.number#getNonnegative_number()
   * @see #getnumber()
   * @generated
   */
  EReference getnumber_Nonnegative_number();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number <em>nonnegative number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nonnegative number</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number
   * @generated
   */
  EClass getnonnegative_number();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number#getIntseq <em>Intseq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Intseq</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number#getIntseq()
   * @see #getnonnegative_number()
   * @generated
   */
  EReference getnonnegative_number_Intseq();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number#getFloatseq <em>Floatseq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Floatseq</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number#getFloatseq()
   * @see #getnonnegative_number()
   * @generated
   */
  EReference getnonnegative_number_Floatseq();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number#getExponent <em>Exponent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exponent</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number#getExponent()
   * @see #getnonnegative_number()
   * @generated
   */
  EReference getnonnegative_number_Exponent();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.exponent <em>exponent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>exponent</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.exponent
   * @generated
   */
  EClass getexponent();

  /**
   * Returns the meta object for the attribute '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.exponent#getSign <em>Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sign</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.exponent#getSign()
   * @see #getexponent()
   * @generated
   */
  EAttribute getexponent_Sign();

  /**
   * Returns the meta object for the containment reference '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.exponent#getDigit_sequence <em>Digit sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Digit sequence</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.exponent#getDigit_sequence()
   * @see #getexponent()
   * @generated
   */
  EReference getexponent_Digit_sequence();

  /**
   * Returns the meta object for class '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.digit_sequence <em>digit sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>digit sequence</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.digit_sequence
   * @generated
   */
  EClass getdigit_sequence();

  /**
   * Returns the meta object for the attribute list '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.digit_sequence#getDigits <em>Digits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Digits</em>'.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.digit_sequence#getDigits()
   * @see #getdigit_sequence()
   * @generated
   */
  EAttribute getdigit_sequence_Digits();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SvgPathFactory getSvgPathFactory();

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
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.svg_pathImpl <em>svg path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.svg_pathImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getsvg_path()
     * @generated
     */
    EClass SVG_PATH = eINSTANCE.getsvg_path();

    /**
     * The meta object literal for the '<em><b>Moveto drawto command groups</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SVG_PATH__MOVETO_DRAWTO_COMMAND_GROUPS = eINSTANCE.getsvg_path_Moveto_drawto_command_groups();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.moveto_drawto_command_groupsImpl <em>moveto drawto command groups</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.moveto_drawto_command_groupsImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getmoveto_drawto_command_groups()
     * @generated
     */
    EClass MOVETO_DRAWTO_COMMAND_GROUPS = eINSTANCE.getmoveto_drawto_command_groups();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOVETO_DRAWTO_COMMAND_GROUPS__COMMANDS = eINSTANCE.getmoveto_drawto_command_groups_Commands();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.moveto_drawto_command_groupImpl <em>moveto drawto command group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.moveto_drawto_command_groupImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getmoveto_drawto_command_group()
     * @generated
     */
    EClass MOVETO_DRAWTO_COMMAND_GROUP = eINSTANCE.getmoveto_drawto_command_group();

    /**
     * The meta object literal for the '<em><b>Moveto</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOVETO_DRAWTO_COMMAND_GROUP__MOVETO = eINSTANCE.getmoveto_drawto_command_group_Moveto();

    /**
     * The meta object literal for the '<em><b>Drawto commands</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOVETO_DRAWTO_COMMAND_GROUP__DRAWTO_COMMANDS = eINSTANCE.getmoveto_drawto_command_group_Drawto_commands();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.movetoImpl <em>moveto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.movetoImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getmoveto()
     * @generated
     */
    EClass MOVETO = eINSTANCE.getmoveto();

    /**
     * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOVETO__POINT = eINSTANCE.getmoveto_Point();

    /**
     * The meta object literal for the '<em><b>Lineto argument sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOVETO__LINETO_ARGUMENT_SEQUENCE = eINSTANCE.getmoveto_Lineto_argument_sequence();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.lineto_argument_sequenceImpl <em>lineto argument sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.lineto_argument_sequenceImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getlineto_argument_sequence()
     * @generated
     */
    EClass LINETO_ARGUMENT_SEQUENCE = eINSTANCE.getlineto_argument_sequence();

    /**
     * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINETO_ARGUMENT_SEQUENCE__PAIRS = eINSTANCE.getlineto_argument_sequence_Pairs();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.drawto_commandsImpl <em>drawto commands</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.drawto_commandsImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getdrawto_commands()
     * @generated
     */
    EClass DRAWTO_COMMANDS = eINSTANCE.getdrawto_commands();

    /**
     * The meta object literal for the '<em><b>Drawto commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DRAWTO_COMMANDS__DRAWTO_COMMANDS = eINSTANCE.getdrawto_commands_Drawto_commands();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.drawto_commandImpl <em>drawto command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.drawto_commandImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getdrawto_command()
     * @generated
     */
    EClass DRAWTO_COMMAND = eINSTANCE.getdrawto_command();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.closepathImpl <em>closepath</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.closepathImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getclosepath()
     * @generated
     */
    EClass CLOSEPATH = eINSTANCE.getclosepath();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.linetoImpl <em>lineto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.linetoImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getlineto()
     * @generated
     */
    EClass LINETO = eINSTANCE.getlineto();

    /**
     * The meta object literal for the '<em><b>Lineto argument sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINETO__LINETO_ARGUMENT_SEQUENCE = eINSTANCE.getlineto_Lineto_argument_sequence();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.horizontal_linetoImpl <em>horizontal lineto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.horizontal_linetoImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#gethorizontal_lineto()
     * @generated
     */
    EClass HORIZONTAL_LINETO = eINSTANCE.gethorizontal_lineto();

    /**
     * The meta object literal for the '<em><b>Horizontal lineto argument sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HORIZONTAL_LINETO__HORIZONTAL_LINETO_ARGUMENT_SEQUENCE = eINSTANCE.gethorizontal_lineto_Horizontal_lineto_argument_sequence();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.horizontal_lineto_argument_sequenceImpl <em>horizontal lineto argument sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.horizontal_lineto_argument_sequenceImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#gethorizontal_lineto_argument_sequence()
     * @generated
     */
    EClass HORIZONTAL_LINETO_ARGUMENT_SEQUENCE = eINSTANCE.gethorizontal_lineto_argument_sequence();

    /**
     * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HORIZONTAL_LINETO_ARGUMENT_SEQUENCE__COORDINATES = eINSTANCE.gethorizontal_lineto_argument_sequence_Coordinates();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.vertical_linetoImpl <em>vertical lineto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.vertical_linetoImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getvertical_lineto()
     * @generated
     */
    EClass VERTICAL_LINETO = eINSTANCE.getvertical_lineto();

    /**
     * The meta object literal for the '<em><b>Vertical lineto argument sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERTICAL_LINETO__VERTICAL_LINETO_ARGUMENT_SEQUENCE = eINSTANCE.getvertical_lineto_Vertical_lineto_argument_sequence();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.vertical_lineto_argument_sequenceImpl <em>vertical lineto argument sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.vertical_lineto_argument_sequenceImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getvertical_lineto_argument_sequence()
     * @generated
     */
    EClass VERTICAL_LINETO_ARGUMENT_SEQUENCE = eINSTANCE.getvertical_lineto_argument_sequence();

    /**
     * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERTICAL_LINETO_ARGUMENT_SEQUENCE__COORDINATES = eINSTANCE.getvertical_lineto_argument_sequence_Coordinates();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.curvetoImpl <em>curveto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.curvetoImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getcurveto()
     * @generated
     */
    EClass CURVETO = eINSTANCE.getcurveto();

    /**
     * The meta object literal for the '<em><b>Curveto argument sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CURVETO__CURVETO_ARGUMENT_SEQUENCE = eINSTANCE.getcurveto_Curveto_argument_sequence();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.curveto_argument_sequenceImpl <em>curveto argument sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.curveto_argument_sequenceImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getcurveto_argument_sequence()
     * @generated
     */
    EClass CURVETO_ARGUMENT_SEQUENCE = eINSTANCE.getcurveto_argument_sequence();

    /**
     * The meta object literal for the '<em><b>Curveto arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CURVETO_ARGUMENT_SEQUENCE__CURVETO_ARGUMENTS = eINSTANCE.getcurveto_argument_sequence_Curveto_arguments();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.curveto_argumentImpl <em>curveto argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.curveto_argumentImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getcurveto_argument()
     * @generated
     */
    EClass CURVETO_ARGUMENT = eINSTANCE.getcurveto_argument();

    /**
     * The meta object literal for the '<em><b>C1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CURVETO_ARGUMENT__C1 = eINSTANCE.getcurveto_argument_C1();

    /**
     * The meta object literal for the '<em><b>C2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CURVETO_ARGUMENT__C2 = eINSTANCE.getcurveto_argument_C2();

    /**
     * The meta object literal for the '<em><b>C3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CURVETO_ARGUMENT__C3 = eINSTANCE.getcurveto_argument_C3();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_curvetoImpl <em>smooth curveto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_curvetoImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getsmooth_curveto()
     * @generated
     */
    EClass SMOOTH_CURVETO = eINSTANCE.getsmooth_curveto();

    /**
     * The meta object literal for the '<em><b>Smooth curveto argument sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMOOTH_CURVETO__SMOOTH_CURVETO_ARGUMENT_SEQUENCE = eINSTANCE.getsmooth_curveto_Smooth_curveto_argument_sequence();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_curveto_argument_sequenceImpl <em>smooth curveto argument sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_curveto_argument_sequenceImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getsmooth_curveto_argument_sequence()
     * @generated
     */
    EClass SMOOTH_CURVETO_ARGUMENT_SEQUENCE = eINSTANCE.getsmooth_curveto_argument_sequence();

    /**
     * The meta object literal for the '<em><b>Smooth curveto arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMOOTH_CURVETO_ARGUMENT_SEQUENCE__SMOOTH_CURVETO_ARGUMENTS = eINSTANCE.getsmooth_curveto_argument_sequence_Smooth_curveto_arguments();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_curveto_argumentImpl <em>smooth curveto argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_curveto_argumentImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getsmooth_curveto_argument()
     * @generated
     */
    EClass SMOOTH_CURVETO_ARGUMENT = eINSTANCE.getsmooth_curveto_argument();

    /**
     * The meta object literal for the '<em><b>C1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMOOTH_CURVETO_ARGUMENT__C1 = eINSTANCE.getsmooth_curveto_argument_C1();

    /**
     * The meta object literal for the '<em><b>C2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMOOTH_CURVETO_ARGUMENT__C2 = eINSTANCE.getsmooth_curveto_argument_C2();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.quadratic_bezier_curvetoImpl <em>quadratic bezier curveto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.quadratic_bezier_curvetoImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getquadratic_bezier_curveto()
     * @generated
     */
    EClass QUADRATIC_BEZIER_CURVETO = eINSTANCE.getquadratic_bezier_curveto();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.quadratic_bezier_curveto_argument_sequenceImpl <em>quadratic bezier curveto argument sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.quadratic_bezier_curveto_argument_sequenceImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getquadratic_bezier_curveto_argument_sequence()
     * @generated
     */
    EClass QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE = eINSTANCE.getquadratic_bezier_curveto_argument_sequence();

    /**
     * The meta object literal for the '<em><b>Quadratic bezier curveto arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE__QUADRATIC_BEZIER_CURVETO_ARGUMENTS = eINSTANCE.getquadratic_bezier_curveto_argument_sequence_Quadratic_bezier_curveto_arguments();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.quadratic_bezier_curveto_argumentImpl <em>quadratic bezier curveto argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.quadratic_bezier_curveto_argumentImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getquadratic_bezier_curveto_argument()
     * @generated
     */
    EClass QUADRATIC_BEZIER_CURVETO_ARGUMENT = eINSTANCE.getquadratic_bezier_curveto_argument();

    /**
     * The meta object literal for the '<em><b>C1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUADRATIC_BEZIER_CURVETO_ARGUMENT__C1 = eINSTANCE.getquadratic_bezier_curveto_argument_C1();

    /**
     * The meta object literal for the '<em><b>C2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUADRATIC_BEZIER_CURVETO_ARGUMENT__C2 = eINSTANCE.getquadratic_bezier_curveto_argument_C2();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_quadratic_bezier_curvetoImpl <em>smooth quadratic bezier curveto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_quadratic_bezier_curvetoImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getsmooth_quadratic_bezier_curveto()
     * @generated
     */
    EClass SMOOTH_QUADRATIC_BEZIER_CURVETO = eINSTANCE.getsmooth_quadratic_bezier_curveto();

    /**
     * The meta object literal for the '<em><b>Smooth quadratic bezier curveto argument sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMOOTH_QUADRATIC_BEZIER_CURVETO__SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE = eINSTANCE.getsmooth_quadratic_bezier_curveto_Smooth_quadratic_bezier_curveto_argument_sequence();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_quadratic_bezier_curveto_argument_sequenceImpl <em>smooth quadratic bezier curveto argument sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.smooth_quadratic_bezier_curveto_argument_sequenceImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getsmooth_quadratic_bezier_curveto_argument_sequence()
     * @generated
     */
    EClass SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE = eINSTANCE.getsmooth_quadratic_bezier_curveto_argument_sequence();

    /**
     * The meta object literal for the '<em><b>Coordinate pairs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE__COORDINATE_PAIRS = eINSTANCE.getsmooth_quadratic_bezier_curveto_argument_sequence_Coordinate_pairs();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arcImpl <em>elliptical arc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arcImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getelliptical_arc()
     * @generated
     */
    EClass ELLIPTICAL_ARC = eINSTANCE.getelliptical_arc();

    /**
     * The meta object literal for the '<em><b>Elliptical arc argument sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELLIPTICAL_ARC__ELLIPTICAL_ARC_ARGUMENT_SEQUENCE = eINSTANCE.getelliptical_arc_Elliptical_arc_argument_sequence();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arc_argument_sequenceImpl <em>elliptical arc argument sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arc_argument_sequenceImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getelliptical_arc_argument_sequence()
     * @generated
     */
    EClass ELLIPTICAL_ARC_ARGUMENT_SEQUENCE = eINSTANCE.getelliptical_arc_argument_sequence();

    /**
     * The meta object literal for the '<em><b>Elliptical arc arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELLIPTICAL_ARC_ARGUMENT_SEQUENCE__ELLIPTICAL_ARC_ARGUMENTS = eINSTANCE.getelliptical_arc_argument_sequence_Elliptical_arc_arguments();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arc_argumentImpl <em>elliptical arc argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.elliptical_arc_argumentImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getelliptical_arc_argument()
     * @generated
     */
    EClass ELLIPTICAL_ARC_ARGUMENT = eINSTANCE.getelliptical_arc_argument();

    /**
     * The meta object literal for the '<em><b>Rx</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELLIPTICAL_ARC_ARGUMENT__RX = eINSTANCE.getelliptical_arc_argument_Rx();

    /**
     * The meta object literal for the '<em><b>Ry</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELLIPTICAL_ARC_ARGUMENT__RY = eINSTANCE.getelliptical_arc_argument_Ry();

    /**
     * The meta object literal for the '<em><b>Rotation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELLIPTICAL_ARC_ARGUMENT__ROTATION = eINSTANCE.getelliptical_arc_argument_Rotation();

    /**
     * The meta object literal for the '<em><b>Largearcflag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELLIPTICAL_ARC_ARGUMENT__LARGEARCFLAG = eINSTANCE.getelliptical_arc_argument_Largearcflag();

    /**
     * The meta object literal for the '<em><b>Sweepflag</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELLIPTICAL_ARC_ARGUMENT__SWEEPFLAG = eINSTANCE.getelliptical_arc_argument_Sweepflag();

    /**
     * The meta object literal for the '<em><b>Coordinate pair</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELLIPTICAL_ARC_ARGUMENT__COORDINATE_PAIR = eINSTANCE.getelliptical_arc_argument_Coordinate_pair();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.coordinate_pairImpl <em>coordinate pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.coordinate_pairImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getcoordinate_pair()
     * @generated
     */
    EClass COORDINATE_PAIR = eINSTANCE.getcoordinate_pair();

    /**
     * The meta object literal for the '<em><b>C1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COORDINATE_PAIR__C1 = eINSTANCE.getcoordinate_pair_C1();

    /**
     * The meta object literal for the '<em><b>C2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COORDINATE_PAIR__C2 = eINSTANCE.getcoordinate_pair_C2();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.coordinateImpl <em>coordinate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.coordinateImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getcoordinate()
     * @generated
     */
    EClass COORDINATE = eINSTANCE.getcoordinate();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.numberImpl <em>number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.numberImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getnumber()
     * @generated
     */
    EClass NUMBER = eINSTANCE.getnumber();

    /**
     * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER__SIGN = eINSTANCE.getnumber_Sign();

    /**
     * The meta object literal for the '<em><b>Nonnegative number</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER__NONNEGATIVE_NUMBER = eINSTANCE.getnumber_Nonnegative_number();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.nonnegative_numberImpl <em>nonnegative number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.nonnegative_numberImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getnonnegative_number()
     * @generated
     */
    EClass NONNEGATIVE_NUMBER = eINSTANCE.getnonnegative_number();

    /**
     * The meta object literal for the '<em><b>Intseq</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NONNEGATIVE_NUMBER__INTSEQ = eINSTANCE.getnonnegative_number_Intseq();

    /**
     * The meta object literal for the '<em><b>Floatseq</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NONNEGATIVE_NUMBER__FLOATSEQ = eINSTANCE.getnonnegative_number_Floatseq();

    /**
     * The meta object literal for the '<em><b>Exponent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NONNEGATIVE_NUMBER__EXPONENT = eINSTANCE.getnonnegative_number_Exponent();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.exponentImpl <em>exponent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.exponentImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getexponent()
     * @generated
     */
    EClass EXPONENT = eINSTANCE.getexponent();

    /**
     * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPONENT__SIGN = eINSTANCE.getexponent_Sign();

    /**
     * The meta object literal for the '<em><b>Digit sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPONENT__DIGIT_SEQUENCE = eINSTANCE.getexponent_Digit_sequence();

    /**
     * The meta object literal for the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.digit_sequenceImpl <em>digit sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.digit_sequenceImpl
     * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.impl.SvgPathPackageImpl#getdigit_sequence()
     * @generated
     */
    EClass DIGIT_SEQUENCE = eINSTANCE.getdigit_sequence();

    /**
     * The meta object literal for the '<em><b>Digits</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGIT_SEQUENCE__DIGITS = eINSTANCE.getdigit_sequence_Digits();

  }

} //SvgPathPackage
