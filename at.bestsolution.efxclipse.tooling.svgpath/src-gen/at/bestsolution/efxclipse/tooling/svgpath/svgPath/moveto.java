/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>moveto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto#getPoint <em>Point</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto#getLineto_argument_sequence <em>Lineto argument sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getmoveto()
 * @model
 * @generated
 */
public interface moveto extends EObject
{
  /**
   * Returns the value of the '<em><b>Point</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Point</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Point</em>' containment reference.
   * @see #setPoint(coordinate_pair)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getmoveto_Point()
   * @model containment="true"
   * @generated
   */
  coordinate_pair getPoint();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto#getPoint <em>Point</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Point</em>' containment reference.
   * @see #getPoint()
   * @generated
   */
  void setPoint(coordinate_pair value);

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
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getmoveto_Lineto_argument_sequence()
   * @model containment="true"
   * @generated
   */
  lineto_argument_sequence getLineto_argument_sequence();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.moveto#getLineto_argument_sequence <em>Lineto argument sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lineto argument sequence</em>' containment reference.
   * @see #getLineto_argument_sequence()
   * @generated
   */
  void setLineto_argument_sequence(lineto_argument_sequence value);

} // moveto
