/**
 */
package at.bestsolution.efxclipse.tooling.css.cssDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.selector#getSimpleselectors <em>Simpleselectors</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.selector#getCombinator <em>Combinator</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.selector#getSelector <em>Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getselector()
 * @model
 * @generated
 */
public interface selector extends EObject
{
  /**
   * Returns the value of the '<em><b>Simpleselectors</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simpleselectors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simpleselectors</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getselector_Simpleselectors()
   * @model containment="true"
   * @generated
   */
  EList<simple_selector> getSimpleselectors();

  /**
   * Returns the value of the '<em><b>Combinator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Combinator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Combinator</em>' attribute.
   * @see #setCombinator(String)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getselector_Combinator()
   * @model
   * @generated
   */
  String getCombinator();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.selector#getCombinator <em>Combinator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Combinator</em>' attribute.
   * @see #getCombinator()
   * @generated
   */
  void setCombinator(String value);

  /**
   * Returns the value of the '<em><b>Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selector</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selector</em>' containment reference.
   * @see #setSelector(selector)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getselector_Selector()
   * @model containment="true"
   * @generated
   */
  selector getSelector();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.selector#getSelector <em>Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selector</em>' containment reference.
   * @see #getSelector()
   * @generated
   */
  void setSelector(selector value);

} // selector
