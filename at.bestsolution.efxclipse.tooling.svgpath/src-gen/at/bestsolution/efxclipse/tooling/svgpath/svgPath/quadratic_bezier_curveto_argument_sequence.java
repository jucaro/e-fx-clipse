/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>quadratic bezier curveto argument sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument_sequence#getQuadratic_bezier_curveto_arguments <em>Quadratic bezier curveto arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getquadratic_bezier_curveto_argument_sequence()
 * @model
 * @generated
 */
public interface quadratic_bezier_curveto_argument_sequence extends quadratic_bezier_curveto
{
  /**
   * Returns the value of the '<em><b>Quadratic bezier curveto arguments</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.quadratic_bezier_curveto_argument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Quadratic bezier curveto arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Quadratic bezier curveto arguments</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getquadratic_bezier_curveto_argument_sequence_Quadratic_bezier_curveto_arguments()
   * @model containment="true"
   * @generated
   */
  EList<quadratic_bezier_curveto_argument> getQuadratic_bezier_curveto_arguments();

} // quadratic_bezier_curveto_argument_sequence
