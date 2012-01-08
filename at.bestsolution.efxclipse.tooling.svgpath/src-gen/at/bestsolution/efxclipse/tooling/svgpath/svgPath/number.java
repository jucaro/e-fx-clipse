/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.number#getSign <em>Sign</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.number#getNonnegative_number <em>Nonnegative number</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getnumber()
 * @model
 * @generated
 */
public interface number extends coordinate
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
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getnumber_Sign()
   * @model
   * @generated
   */
  String getSign();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.number#getSign <em>Sign</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sign</em>' attribute.
   * @see #getSign()
   * @generated
   */
  void setSign(String value);

  /**
   * Returns the value of the '<em><b>Nonnegative number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nonnegative number</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nonnegative number</em>' containment reference.
   * @see #setNonnegative_number(nonnegative_number)
   * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage#getnumber_Nonnegative_number()
   * @model containment="true"
   * @generated
   */
  nonnegative_number getNonnegative_number();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.svgpath.svgPath.number#getNonnegative_number <em>Nonnegative number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nonnegative number</em>' containment reference.
   * @see #getNonnegative_number()
   * @generated
   */
  void setNonnegative_number(nonnegative_number value);

} // number
