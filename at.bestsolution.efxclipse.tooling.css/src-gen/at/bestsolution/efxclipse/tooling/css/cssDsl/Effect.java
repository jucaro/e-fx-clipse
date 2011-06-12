/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getBlur <em>Blur</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getColor <em>Color</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getBlurRadius <em>Blur Radius</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getOffsetX <em>Offset X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getOffsetY <em>Offset Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getEffect()
 * @model
 * @generated
 */
public interface Effect extends EObject
{
  /**
   * Returns the value of the '<em><b>Blur</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blur</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blur</em>' attribute.
   * @see #setBlur(String)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getEffect_Blur()
   * @model
   * @generated
   */
  String getBlur();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getBlur <em>Blur</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Blur</em>' attribute.
   * @see #getBlur()
   * @generated
   */
  void setBlur(String value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' containment reference.
   * @see #setColor(Color)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getEffect_Color()
   * @model containment="true"
   * @generated
   */
  Color getColor();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getColor <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' containment reference.
   * @see #getColor()
   * @generated
   */
  void setColor(Color value);

  /**
   * Returns the value of the '<em><b>Blur Radius</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blur Radius</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blur Radius</em>' attribute.
   * @see #setBlurRadius(String)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getEffect_BlurRadius()
   * @model
   * @generated
   */
  String getBlurRadius();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getBlurRadius <em>Blur Radius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Blur Radius</em>' attribute.
   * @see #getBlurRadius()
   * @generated
   */
  void setBlurRadius(String value);

  /**
   * Returns the value of the '<em><b>Offset X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Offset X</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Offset X</em>' attribute.
   * @see #setOffsetX(String)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getEffect_OffsetX()
   * @model
   * @generated
   */
  String getOffsetX();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getOffsetX <em>Offset X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Offset X</em>' attribute.
   * @see #getOffsetX()
   * @generated
   */
  void setOffsetX(String value);

  /**
   * Returns the value of the '<em><b>Offset Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Offset Y</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Offset Y</em>' attribute.
   * @see #setOffsetY(String)
   * @see at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage#getEffect_OffsetY()
   * @model
   * @generated
   */
  String getOffsetY();

  /**
   * Sets the value of the '{@link at.bestsolution.efxclipse.tooling.css.cssDsl.Effect#getOffsetY <em>Offset Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Offset Y</em>' attribute.
   * @see #getOffsetY()
   * @generated
   */
  void setOffsetY(String value);

} // Effect
