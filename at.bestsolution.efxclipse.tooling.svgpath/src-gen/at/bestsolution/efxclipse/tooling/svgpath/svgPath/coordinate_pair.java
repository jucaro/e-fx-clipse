/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>coordinate pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate_pair#getC1 <em>C1</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate_pair#getC2 <em>C2</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getcoordinate_pair()
 * @model
 * @generated
 */
public interface coordinate_pair extends EObject
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
   * @see #setC1(coordinate)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getcoordinate_pair_C1()
   * @model containment="true"
   * @generated
   */
  coordinate getC1();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate_pair#getC1 <em>C1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C1</em>' containment reference.
   * @see #getC1()
   * @generated
   */
  void setC1(coordinate value);

  /**
   * Returns the value of the '<em><b>C2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C2</em>' containment reference.
   * @see #setC2(coordinate)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getcoordinate_pair_C2()
   * @model containment="true"
   * @generated
   */
  coordinate getC2();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.coordinate_pair#getC2 <em>C2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C2</em>' containment reference.
   * @see #getC2()
   * @generated
   */
  void setC2(coordinate value);

} // coordinate_pair
