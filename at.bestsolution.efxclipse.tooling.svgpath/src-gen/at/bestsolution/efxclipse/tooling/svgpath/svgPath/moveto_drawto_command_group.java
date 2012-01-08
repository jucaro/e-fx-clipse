/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>moveto drawto command group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_group#getMoveto <em>Moveto</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_group#getDrawto_commands <em>Drawto commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getmoveto_drawto_command_group()
 * @model
 * @generated
 */
public interface moveto_drawto_command_group extends EObject
{
  /**
   * Returns the value of the '<em><b>Moveto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Moveto</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Moveto</em>' containment reference.
   * @see #setMoveto(moveto)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getmoveto_drawto_command_group_Moveto()
   * @model containment="true"
   * @generated
   */
  moveto getMoveto();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_group#getMoveto <em>Moveto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Moveto</em>' containment reference.
   * @see #getMoveto()
   * @generated
   */
  void setMoveto(moveto value);

  /**
   * Returns the value of the '<em><b>Drawto commands</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Drawto commands</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Drawto commands</em>' containment reference.
   * @see #setDrawto_commands(drawto_commands)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getmoveto_drawto_command_group_Drawto_commands()
   * @model containment="true"
   * @generated
   */
  drawto_commands getDrawto_commands();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto_drawto_command_group#getDrawto_commands <em>Drawto commands</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Drawto commands</em>' containment reference.
   * @see #getDrawto_commands()
   * @generated
   */
  void setDrawto_commands(drawto_commands value);

} // moveto_drawto_command_group
