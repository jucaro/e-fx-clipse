/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>lineto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.lineto#getLineto_argument_sequence <em>Lineto argument sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getlineto()
 * @model
 * @generated
 */
public interface lineto extends drawto_command
{
  /**
   * Returns the value of the '<em><b>Lineto argument sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lineto argument sequence</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lineto argument sequence</em>' containment reference.
   * @see #setLineto_argument_sequence(lineto_argument_sequence)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getlineto_Lineto_argument_sequence()
   * @model containment="true"
   * @generated
   */
  lineto_argument_sequence getLineto_argument_sequence();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.lineto#getLineto_argument_sequence <em>Lineto argument sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lineto argument sequence</em>' containment reference.
   * @see #getLineto_argument_sequence()
   * @generated
   */
  void setLineto_argument_sequence(lineto_argument_sequence value);

} // lineto
