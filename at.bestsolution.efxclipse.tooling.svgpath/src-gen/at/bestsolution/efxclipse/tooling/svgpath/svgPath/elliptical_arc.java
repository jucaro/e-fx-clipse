/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>elliptical arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc#getElliptical_arc_argument_sequence <em>Elliptical arc argument sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getelliptical_arc()
 * @model
 * @generated
 */
public interface elliptical_arc extends drawto_command
{
  /**
   * Returns the value of the '<em><b>Elliptical arc argument sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elliptical arc argument sequence</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elliptical arc argument sequence</em>' containment reference.
   * @see #setElliptical_arc_argument_sequence(elliptical_arc_argument_sequence)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getelliptical_arc_Elliptical_arc_argument_sequence()
   * @model containment="true"
   * @generated
   */
  elliptical_arc_argument_sequence getElliptical_arc_argument_sequence();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc#getElliptical_arc_argument_sequence <em>Elliptical arc argument sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elliptical arc argument sequence</em>' containment reference.
   * @see #getElliptical_arc_argument_sequence()
   * @generated
   */
  void setElliptical_arc_argument_sequence(elliptical_arc_argument_sequence value);

} // elliptical_arc
