/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Gradient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient#getX1 <em>X1</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient#getY1 <em>Y1</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient#getX2 <em>X2</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient#getY2 <em>Y2</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient#getStops <em>Stops</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getLinearGradient()
 * @model
 * @generated
 */
public interface LinearGradient extends Paint
{
  /**
   * Returns the value of the '<em><b>X1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X1</em>' attribute.
   * @see #setX1(String)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getLinearGradient_X1()
   * @model
   * @generated
   */
  String getX1();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient#getX1 <em>X1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X1</em>' attribute.
   * @see #getX1()
   * @generated
   */
  void setX1(String value);

  /**
   * Returns the value of the '<em><b>Y1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y1</em>' attribute.
   * @see #setY1(String)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getLinearGradient_Y1()
   * @model
   * @generated
   */
  String getY1();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient#getY1 <em>Y1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y1</em>' attribute.
   * @see #getY1()
   * @generated
   */
  void setY1(String value);

  /**
   * Returns the value of the '<em><b>X2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X2</em>' attribute.
   * @see #setX2(String)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getLinearGradient_X2()
   * @model
   * @generated
   */
  String getX2();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient#getX2 <em>X2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X2</em>' attribute.
   * @see #getX2()
   * @generated
   */
  void setX2(String value);

  /**
   * Returns the value of the '<em><b>Y2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y2</em>' attribute.
   * @see #setY2(String)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getLinearGradient_Y2()
   * @model
   * @generated
   */
  String getY2();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient#getY2 <em>Y2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y2</em>' attribute.
   * @see #getY2()
   * @generated
   */
  void setY2(String value);

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
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getLinearGradient_Stops()
   * @model containment="true"
   * @generated
   */
  EList<StopValue> getStops();

} // LinearGradient
