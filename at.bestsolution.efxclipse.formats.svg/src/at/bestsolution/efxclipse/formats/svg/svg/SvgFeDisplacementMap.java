/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.svg.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fe Displacement Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeDisplacementMap#getClass_ <em>Class</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeDisplacementMap#getStyle <em>Style</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeDisplacementMap#getIn2 <em>In2</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeDisplacementMap#getScale <em>Scale</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeDisplacementMap#getXChannelSelector <em>XChannel Selector</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeDisplacementMap#getYChannelSelector <em>YChannel Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeDisplacementMap()
 * @model
 * @generated
 */
public interface SvgFeDisplacementMap extends SvgElement, CoreAttributes, PresentationAttributes, FilterPrimitiveAttributes, ContentElement<SvgElement> {
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
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeDisplacementMap_Class()
	 * @model
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeDisplacementMap#getClass_ <em>Class</em>}' attribute.
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
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeDisplacementMap_Style()
	 * @model
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeDisplacementMap#getStyle <em>Style</em>}' attribute.
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
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeDisplacementMap_In2()
	 * @model
	 * @generated
	 */
	String getIn2();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeDisplacementMap#getIn2 <em>In2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In2</em>' attribute.
	 * @see #getIn2()
	 * @generated
	 */
	void setIn2(String value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(Double)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeDisplacementMap_Scale()
	 * @model dataType="at.bestsolution.efxclipse.formats.svg.svg.Number"
	 * @generated
	 */
	Double getScale();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeDisplacementMap#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(Double value);

	/**
	 * Returns the value of the '<em><b>XChannel Selector</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.svg.svg.ChannelSelector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XChannel Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XChannel Selector</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.ChannelSelector
	 * @see #setXChannelSelector(ChannelSelector)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeDisplacementMap_XChannelSelector()
	 * @model
	 * @generated
	 */
	ChannelSelector getXChannelSelector();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeDisplacementMap#getXChannelSelector <em>XChannel Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XChannel Selector</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.ChannelSelector
	 * @see #getXChannelSelector()
	 * @generated
	 */
	void setXChannelSelector(ChannelSelector value);

	/**
	 * Returns the value of the '<em><b>YChannel Selector</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.svg.svg.ChannelSelector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YChannel Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YChannel Selector</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.ChannelSelector
	 * @see #setYChannelSelector(ChannelSelector)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeDisplacementMap_YChannelSelector()
	 * @model
	 * @generated
	 */
	ChannelSelector getYChannelSelector();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeDisplacementMap#getYChannelSelector <em>YChannel Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YChannel Selector</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.ChannelSelector
	 * @see #getYChannelSelector()
	 * @generated
	 */
	void setYChannelSelector(ChannelSelector value);

} // SvgFeDisplacementMap
