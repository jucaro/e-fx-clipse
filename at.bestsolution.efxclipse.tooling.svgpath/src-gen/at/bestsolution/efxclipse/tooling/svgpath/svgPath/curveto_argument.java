/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>curveto argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument#getC1 <em>C1</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument#getC2 <em>C2</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument#getC3 <em>C3</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getcurveto_argument()
 * @model
 * @generated
 */
public interface curveto_argument extends EObject
{
  /**
   * Returns the value of the '<em><b>C1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C1</em>' containment reference.
   * @see #setC1(coordinate_pair)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getcurveto_argument_C1()
   * @model containment="true"
   * @generated
   */
  coordinate_pair getC1();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument#getC1 <em>C1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C1</em>' containment reference.
   * @see #getC1()
   * @generated
   */
  void setC1(coordinate_pair value);

  /**
   * Returns the value of the '<em><b>C2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C2</em>' containment reference.
   * @see #setC2(coordinate_pair)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getcurveto_argument_C2()
   * @model containment="true"
   * @generated
   */
  coordinate_pair getC2();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument#getC2 <em>C2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C2</em>' containment reference.
   * @see #getC2()
   * @generated
   */
  void setC2(coordinate_pair value);

  /**
   * Returns the value of the '<em><b>C3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C3</em>' containment reference.
   * @see #setC3(coordinate_pair)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getcurveto_argument_C3()
   * @model containment="true"
   * @generated
   */
  coordinate_pair getC3();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.curveto_argument#getC3 <em>C3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C3</em>' containment reference.
   * @see #getC3()
   * @generated
   */
  void setC3(coordinate_pair value);

} // curveto_argument
