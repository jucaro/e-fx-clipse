/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>exponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.exponent#getSign <em>Sign</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.exponent#getDigit_sequence <em>Digit sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getexponent()
 * @model
 * @generated
 */
public interface exponent extends EObject
{
  /**
   * Returns the value of the '<em><b>Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sign</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sign</em>' attribute.
   * @see #setSign(String)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getexponent_Sign()
   * @model
   * @generated
   */
  String getSign();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.exponent#getSign <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sign</em>' attribute.
   * @see #getSign()
   * @generated
   */
  void setSign(String value);

  /**
   * Returns the value of the '<em><b>Digit sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Digit sequence</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Digit sequence</em>' containment reference.
   * @see #setDigit_sequence(digit_sequence)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getexponent_Digit_sequence()
   * @model containment="true"
   * @generated
   */
  digit_sequence getDigit_sequence();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.exponent#getDigit_sequence <em>Digit sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Digit sequence</em>' containment reference.
   * @see #getDigit_sequence()
   * @generated
   */
  void setDigit_sequence(digit_sequence value);

} // exponent
