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
 * A representation of the model object '<em><b>drawto commands</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.drawto_commands#getDrawto_commands <em>Drawto commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getdrawto_commands()
 * @model
 * @generated
 */
public interface drawto_commands extends EObject
{
  /**
   * Returns the value of the '<em><b>Drawto commands</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.drawto_command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Drawto commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Drawto commands</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getdrawto_commands_Drawto_commands()
   * @model containment="true"
   * @generated
   */
  EList<drawto_command> getDrawto_commands();

} // drawto_commands
