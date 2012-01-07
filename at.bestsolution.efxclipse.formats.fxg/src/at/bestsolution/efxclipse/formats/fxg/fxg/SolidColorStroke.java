/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solid Color Stroke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getCaps <em>Caps</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getColor <em>Color</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getJoints <em>Joints</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getMiterLimit <em>Miter Limit</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getPixelHinting <em>Pixel Hinting</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getScaleMode <em>Scale Mode</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getWeight <em>Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getSolidColorStroke()
 * @model
 * @generated
 */
public interface SolidColorStroke extends Stroke {
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
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getSolidColorStroke_Alpha()
	 * @model dataType="at.bestsolution.efxclipse.formats.fxg.fxg.Alpha"
	 * @generated
	 */
	Double getAlpha();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(Double value);

	/**
	 * Returns the value of the '<em><b>Caps</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.fxg.fxg.Cap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caps</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Cap
	 * @see #setCaps(Cap)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getSolidColorStroke_Caps()
	 * @model
	 * @generated
	 */
	Cap getCaps();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getCaps <em>Caps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caps</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Cap
	 * @see #getCaps()
	 * @generated
	 */
	void setCaps(Cap value);

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
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getSolidColorStroke_Color()
	 * @model dataType="at.bestsolution.efxclipse.formats.fxg.fxg.Color"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Joints</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.fxg.fxg.Joint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joints</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Joint
	 * @see #setJoints(Joint)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getSolidColorStroke_Joints()
	 * @model
	 * @generated
	 */
	Joint getJoints();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getJoints <em>Joints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Joints</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Joint
	 * @see #getJoints()
	 * @generated
	 */
	void setJoints(Joint value);

	/**
	 * Returns the value of the '<em><b>Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Miter Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Miter Limit</em>' attribute.
	 * @see #setMiterLimit(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getSolidColorStroke_MiterLimit()
	 * @model
	 * @generated
	 */
	Double getMiterLimit();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getMiterLimit <em>Miter Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Miter Limit</em>' attribute.
	 * @see #getMiterLimit()
	 * @generated
	 */
	void setMiterLimit(Double value);

	/**
	 * Returns the value of the '<em><b>Pixel Hinting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pixel Hinting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pixel Hinting</em>' attribute.
	 * @see #setPixelHinting(Boolean)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getSolidColorStroke_PixelHinting()
	 * @model
	 * @generated
	 */
	Boolean getPixelHinting();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getPixelHinting <em>Pixel Hinting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pixel Hinting</em>' attribute.
	 * @see #getPixelHinting()
	 * @generated
	 */
	void setPixelHinting(Boolean value);

	/**
	 * Returns the value of the '<em><b>Scale Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.fxg.fxg.ScaleMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Mode</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ScaleMode
	 * @see #setScaleMode(ScaleMode)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getSolidColorStroke_ScaleMode()
	 * @model
	 * @generated
	 */
	ScaleMode getScaleMode();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getScaleMode <em>Scale Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Mode</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ScaleMode
	 * @see #getScaleMode()
	 * @generated
	 */
	void setScaleMode(ScaleMode value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getSolidColorStroke_Weight()
	 * @model
	 * @generated
	 */
	Double getWeight();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(Double value);

} // SolidColorStroke
