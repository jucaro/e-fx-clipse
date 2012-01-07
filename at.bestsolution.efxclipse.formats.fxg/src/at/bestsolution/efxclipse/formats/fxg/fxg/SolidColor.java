/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solid Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColor#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColor#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getSolidColor()
 * @model
 * @generated
 */
public interface SolidColor extends Fill {
	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getSolidColor_Alpha()
	 * @model dataType="at.bestsolution.efxclipse.formats.fxg.fxg.Alpha"
	 * @generated
	 */
	Double getAlpha();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColor#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(Double value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getSolidColor_Color()
	 * @model dataType="at.bestsolution.efxclipse.formats.fxg.fxg.Color"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColor#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

} // SolidColor
