/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>svg path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.svg_path#getMoveto_drawto_command_groups <em>Moveto drawto command groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getsvg_path()
 * @model
 * @generated
 */
public interface svg_path extends EObject
{
  /**
   * Returns the value of the '<em><b>Moveto drawto command groups</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Moveto drawto command groups</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Moveto drawto command groups</em>' containment reference.
   * @see #setMoveto_drawto_command_groups(moveto_drawto_command_groups)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getsvg_path_Moveto_drawto_command_groups()
   * @model containment="true"
   * @generated
   */
  moveto_drawto_command_groups getMoveto_drawto_command_groups();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.svg_path#getMoveto_drawto_command_groups <em>Moveto drawto command groups</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Moveto drawto command groups</em>' containment reference.
   * @see #getMoveto_drawto_command_groups()
   * @generated
   */
  void setMoveto_drawto_command_groups(moveto_drawto_command_groups value);

} // svg_path
