/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>elliptical arc argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getRx <em>Rx</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getRy <em>Ry</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getRotation <em>Rotation</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getLargearcflag <em>Largearcflag</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getSweepflag <em>Sweepflag</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getCoordinate_pair <em>Coordinate pair</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getelliptical_arc_argument()
 * @model
 * @generated
 */
public interface elliptical_arc_argument extends EObject
{
  /**
   * Returns the value of the '<em><b>Rx</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rx</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rx</em>' containment reference.
   * @see #setRx(nonnegative_number)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getelliptical_arc_argument_Rx()
   * @model containment="true"
   * @generated
   */
  nonnegative_number getRx();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getRx <em>Rx</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rx</em>' containment reference.
   * @see #getRx()
   * @generated
   */
  void setRx(nonnegative_number value);

  /**
   * Returns the value of the '<em><b>Ry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ry</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ry</em>' containment reference.
   * @see #setRy(nonnegative_number)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getelliptical_arc_argument_Ry()
   * @model containment="true"
   * @generated
   */
  nonnegative_number getRy();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getRy <em>Ry</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ry</em>' containment reference.
   * @see #getRy()
   * @generated
   */
  void setRy(nonnegative_number value);

  /**
   * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rotation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rotation</em>' containment reference.
   * @see #setRotation(number)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getelliptical_arc_argument_Rotation()
   * @model containment="true"
   * @generated
   */
  number getRotation();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getRotation <em>Rotation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rotation</em>' containment reference.
   * @see #getRotation()
   * @generated
   */
  void setRotation(number value);

  /**
   * Returns the value of the '<em><b>Largearcflag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Largearcflag</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Largearcflag</em>' attribute.
   * @see #setLargearcflag(String)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getelliptical_arc_argument_Largearcflag()
   * @model
   * @generated
   */
  String getLargearcflag();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getLargearcflag <em>Largearcflag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Largearcflag</em>' attribute.
   * @see #getLargearcflag()
   * @generated
   */
  void setLargearcflag(String value);

  /**
   * Returns the value of the '<em><b>Sweepflag</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sweepflag</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sweepflag</em>' attribute.
   * @see #setSweepflag(String)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getelliptical_arc_argument_Sweepflag()
   * @model
   * @generated
   */
  String getSweepflag();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getSweepflag <em>Sweepflag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sweepflag</em>' attribute.
   * @see #getSweepflag()
   * @generated
   */
  void setSweepflag(String value);

  /**
   * Returns the value of the '<em><b>Coordinate pair</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Coordinate pair</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coordinate pair</em>' containment reference.
   * @see #setCoordinate_pair(coordinate_pair)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getelliptical_arc_argument_Coordinate_pair()
   * @model containment="true"
   * @generated
   */
  coordinate_pair getCoordinate_pair();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.elliptical_arc_argument#getCoordinate_pair <em>Coordinate pair</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Coordinate pair</em>' containment reference.
   * @see #getCoordinate_pair()
   * @generated
   */
  void setCoordinate_pair(coordinate_pair value);

} // elliptical_arc_argument
