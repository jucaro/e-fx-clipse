/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>nonnegative number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number#getIntseq <em>Intseq</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number#getFloatseq <em>Floatseq</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number#getExponent <em>Exponent</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getnonnegative_number()
 * @model
 * @generated
 */
public interface nonnegative_number extends EObject
{
  /**
   * Returns the value of the '<em><b>Intseq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intseq</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intseq</em>' containment reference.
   * @see #setIntseq(digit_sequence)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getnonnegative_number_Intseq()
   * @model containment="true"
   * @generated
   */
  digit_sequence getIntseq();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number#getIntseq <em>Intseq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intseq</em>' containment reference.
   * @see #getIntseq()
   * @generated
   */
  void setIntseq(digit_sequence value);

  /**
   * Returns the value of the '<em><b>Floatseq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Floatseq</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Floatseq</em>' containment reference.
   * @see #setFloatseq(digit_sequence)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getnonnegative_number_Floatseq()
   * @model containment="true"
   * @generated
   */
  digit_sequence getFloatseq();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number#getFloatseq <em>Floatseq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Floatseq</em>' containment reference.
   * @see #getFloatseq()
   * @generated
   */
  void setFloatseq(digit_sequence value);

  /**
   * Returns the value of the '<em><b>Exponent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exponent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exponent</em>' containment reference.
   * @see #setExponent(exponent)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getnonnegative_number_Exponent()
   * @model containment="true"
   * @generated
   */
  exponent getExponent();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.nonnegative_number#getExponent <em>Exponent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exponent</em>' containment reference.
   * @see #getExponent()
   * @generated
   */
  void setExponent(exponent value);

} // nonnegative_number
