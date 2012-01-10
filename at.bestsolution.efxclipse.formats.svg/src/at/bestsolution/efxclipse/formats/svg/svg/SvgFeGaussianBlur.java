/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.svg.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fe Gaussian Blur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeGaussianBlur#getClass_ <em>Class</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeGaussianBlur#getStyle <em>Style</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeGaussianBlur#getStdDeviation <em>Std Deviation</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeGaussianBlur()
 * @model
 * @generated
 */
public interface SvgFeGaussianBlur extends SvgElement, CoreAttributes, PresentationAttributes, FilterPrimitiveAttributes {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeGaussianBlur_Class()
	 * @model
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeGaussianBlur#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeGaussianBlur_Style()
	 * @model
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeGaussianBlur#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Std Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Std Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Std Deviation</em>' attribute.
	 * @see #setStdDeviation(String)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeGaussianBlur_StdDeviation()
	 * @model dataType="at.bestsolution.efxclipse.formats.svg.svg.NumberOptionalNumber"
	 * @generated
	 */
	String getStdDeviation();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeGaussianBlur#getStdDeviation <em>Std Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Std Deviation</em>' attribute.
	 * @see #getStdDeviation()
	 * @generated
	 */
	void setStdDeviation(String value);

} // SvgFeGaussianBlur
