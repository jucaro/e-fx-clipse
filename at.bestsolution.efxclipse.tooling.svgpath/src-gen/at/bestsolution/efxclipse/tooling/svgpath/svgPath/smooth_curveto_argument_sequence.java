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
 * A representation of the model object '<em><b>smooth curveto argument sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument_sequence#getSmooth_curveto_arguments <em>Smooth curveto arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getsmooth_curveto_argument_sequence()
 * @model
 * @generated
 */
public interface smooth_curveto_argument_sequence extends EObject
{
  /**
   * Returns the value of the '<em><b>Smooth curveto arguments</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.smooth_curveto_argument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Smooth curveto arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Smooth curveto arguments</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getsmooth_curveto_argument_sequence_Smooth_curveto_arguments()
   * @model containment="true"
   * @generated
   */
  EList<smooth_curveto_argument> getSmooth_curveto_arguments();

} // smooth_curveto_argument_sequence
