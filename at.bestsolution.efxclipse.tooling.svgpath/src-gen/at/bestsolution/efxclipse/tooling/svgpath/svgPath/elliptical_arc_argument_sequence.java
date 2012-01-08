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
 * A representation of the model object '<em><b>elliptical arc argument sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument_sequence#getElliptical_arc_arguments <em>Elliptical arc arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getelliptical_arc_argument_sequence()
 * @model
 * @generated
 */
public interface elliptical_arc_argument_sequence extends EObject
{
  /**
   * Returns the value of the '<em><b>Elliptical arc arguments</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elliptical arc arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elliptical arc arguments</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getelliptical_arc_argument_sequence_Elliptical_arc_arguments()
   * @model containment="true"
   * @generated
   */
  EList<elliptical_arc_argument> getElliptical_arc_arguments();

} // elliptical_arc_argument_sequence
