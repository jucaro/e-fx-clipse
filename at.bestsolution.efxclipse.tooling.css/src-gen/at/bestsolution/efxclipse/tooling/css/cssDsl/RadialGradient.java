/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radial Gradient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient#getCenter <em>Center</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient#getRadius <em>Radius</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient#getFocus <em>Focus</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient#getStops <em>Stops</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getRadialGradient()
 * @model
 * @generated
 */
public interface RadialGradient extends Paint
{
  /**
   * Returns the value of the '<em><b>Center</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Center</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Center</em>' containment reference.
   * @see #setCenter(PointValue)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getRadialGradient_Center()
   * @model containment="true"
   * @generated
   */
  PointValue getCenter();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient#getCenter <em>Center</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Center</em>' containment reference.
   * @see #getCenter()
   * @generated
   */
  void setCenter(PointValue value);

  /**
   * Returns the value of the '<em><b>Radius</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Radius</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Radius</em>' containment reference.
   * @see #setRadius(SizeType)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getRadialGradient_Radius()
   * @model containment="true"
   * @generated
   */
  SizeType getRadius();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient#getRadius <em>Radius</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Radius</em>' containment reference.
   * @see #getRadius()
   * @generated
   */
  void setRadius(SizeType value);

  /**
   * Returns the value of the '<em><b>Focus</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Focus</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Focus</em>' containment reference.
   * @see #setFocus(PointValue)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getRadialGradient_Focus()
   * @model containment="true"
   * @generated
   */
  PointValue getFocus();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient#getFocus <em>Focus</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Focus</em>' containment reference.
   * @see #getFocus()
   * @generated
   */
  void setFocus(PointValue value);

  /**
   * Returns the value of the '<em><b>Stops</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.css.cssDsl.StopValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stops</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stops</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getRadialGradient_Stops()
   * @model containment="true"
   * @generated
   */
  EList<StopValue> getStops();

} // RadialGradient
