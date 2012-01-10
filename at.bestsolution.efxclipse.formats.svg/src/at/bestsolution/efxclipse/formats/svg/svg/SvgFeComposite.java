/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.svg.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fe Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeComposite#getClass_ <em>Class</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeComposite#getStyle <em>Style</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeComposite#getIn2 <em>In2</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeComposite#getOperator <em>Operator</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeComposite#getK1 <em>K1</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeComposite#getK2 <em>K2</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeComposite#getK3 <em>K3</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeComposite#getK4 <em>K4</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeComposite()
 * @model
 * @generated
 */
public interface SvgFeComposite extends SvgElement, CoreAttributes, PresentationAttributes, FilterPrimitiveAttributes, ContentElement<SvgElement> {
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
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeComposite_Class()
	 * @model
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeComposite#getClass_ <em>Class</em>}' attribute.
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
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeComposite_Style()
	 * @model
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeComposite#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>In2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In2</em>' attribute.
	 * @see #setIn2(String)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeComposite_In2()
	 * @model
	 * @generated
	 */
	String getIn2();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeComposite#getIn2 <em>In2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In2</em>' attribute.
	 * @see #getIn2()
	 * @generated
	 */
	void setIn2(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"CompositeOperator.over"</code>.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.svg.svg.CompositeOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.CompositeOperator
	 * @see #setOperator(CompositeOperator)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeComposite_Operator()
	 * @model default="CompositeOperator.over"
	 * @generated
	 */
	CompositeOperator getOperator();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeComposite#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.CompositeOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(CompositeOperator value);

	/**
	 * Returns the value of the '<em><b>K1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>K1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K1</em>' attribute.
	 * @see #setK1(Double)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeComposite_K1()
	 * @model dataType="at.bestsolution.efxclipse.formats.svg.svg.Number"
	 * @generated
	 */
	Double getK1();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeComposite#getK1 <em>K1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K1</em>' attribute.
	 * @see #getK1()
	 * @generated
	 */
	void setK1(Double value);

	/**
	 * Returns the value of the '<em><b>K2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>K2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K2</em>' attribute.
	 * @see #setK2(Double)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeComposite_K2()
	 * @model dataType="at.bestsolution.efxclipse.formats.svg.svg.Number"
	 * @generated
	 */
	Double getK2();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeComposite#getK2 <em>K2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K2</em>' attribute.
	 * @see #getK2()
	 * @generated
	 */
	void setK2(Double value);

	/**
	 * Returns the value of the '<em><b>K3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>K3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K3</em>' attribute.
	 * @see #setK3(Double)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeComposite_K3()
	 * @model dataType="at.bestsolution.efxclipse.formats.svg.svg.Number"
	 * @generated
	 */
	Double getK3();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeComposite#getK3 <em>K3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K3</em>' attribute.
	 * @see #getK3()
	 * @generated
	 */
	void setK3(Double value);

	/**
	 * Returns the value of the '<em><b>K4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>K4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>K4</em>' attribute.
	 * @see #setK4(Double)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeComposite_K4()
	 * @model dataType="at.bestsolution.efxclipse.formats.svg.svg.Number"
	 * @generated
	 */
	Double getK4();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeComposite#getK4 <em>K4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>K4</em>' attribute.
	 * @see #getK4()
	 * @generated
	 */
	void setK4(Double value);

} // SvgFeComposite
