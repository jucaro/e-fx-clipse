/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction#getOrig <em>Orig</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction#getMod <em>Mod</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction#getStopNumbers <em>Stop Numbers</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction#getStopColors <em>Stop Colors</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getColorFunction()
 * @model
 * @generated
 */
public interface ColorFunction extends Color
{
  /**
   * Returns the value of the '<em><b>Orig</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orig</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orig</em>' containment reference.
   * @see #setOrig(Color)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getColorFunction_Orig()
   * @model containment="true"
   * @generated
   */
  Color getOrig();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction#getOrig <em>Orig</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orig</em>' containment reference.
   * @see #getOrig()
   * @generated
   */
  void setOrig(Color value);

  /**
   * Returns the value of the '<em><b>Mod</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mod</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mod</em>' attribute.
   * @see #setMod(String)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getColorFunction_Mod()
   * @model
   * @generated
   */
  String getMod();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction#getMod <em>Mod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mod</em>' attribute.
   * @see #getMod()
   * @generated
   */
  void setMod(String value);

  /**
   * Returns the value of the '<em><b>Stop Numbers</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stop Numbers</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stop Numbers</em>' attribute list.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getColorFunction_StopNumbers()
   * @model unique="false"
   * @generated
   */
  EList<String> getStopNumbers();

  /**
   * Returns the value of the '<em><b>Stop Colors</b></em>' containment reference list.
   * The list contents are of type {@link at.bestsolution.efxclipse.tooling.css.cssDsl.Color}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stop Colors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stop Colors</em>' containment reference list.
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getColorFunction_StopColors()
   * @model containment="true"
   * @generated
   */
  EList<Color> getStopColors();

} // ColorFunction
