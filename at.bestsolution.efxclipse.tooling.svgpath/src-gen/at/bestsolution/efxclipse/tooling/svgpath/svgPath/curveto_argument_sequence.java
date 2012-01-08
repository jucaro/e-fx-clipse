/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>curveto argument sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument_sequence#getCurveto_arguments <em>Curveto arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getcurveto_argument_sequence()
 * @model
 * @generated
 */
public interface curveto_argument_sequence extends EObject
{
  /**
   * Returns the value of the '<em><b>Curveto arguments</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Curveto arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Curveto arguments</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getcurveto_argument_sequence_Curveto_arguments()
   * @model containment="true"
   * @generated
   */
  EList<curveto_argument> getCurveto_arguments();

} // curveto_argument_sequence
