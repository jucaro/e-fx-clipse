/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>css generic declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration#getProperty <em>Property</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration#getExpression <em>Expression</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration#getPrio <em>Prio</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getcss_generic_declaration()
 * @model
 * @generated
 */
public interface css_generic_declaration extends css_declaration
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' attribute.
   * @see #setProperty(String)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getcss_generic_declaration_Property()
   * @model
   * @generated
   */
  String getProperty();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration#getProperty <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' attribute.
   * @see #getProperty()
   * @generated
   */
  void setProperty(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(expr)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getcss_generic_declaration_Expression()
   * @model containment="true"
   * @generated
   */
  expr getExpression();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(expr value);

  /**
   * Returns the value of the '<em><b>Prio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prio</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prio</em>' attribute.
   * @see #setPrio(String)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getcss_generic_declaration_Prio()
   * @model
   * @generated
   */
  String getPrio();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration#getPrio <em>Prio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prio</em>' attribute.
   * @see #getPrio()
   * @generated
   */
  void setPrio(String value);

} // css_generic_declaration
