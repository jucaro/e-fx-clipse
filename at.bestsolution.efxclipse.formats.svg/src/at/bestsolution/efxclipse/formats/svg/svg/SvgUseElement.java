/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.svg.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgUseElement#getClass_ <em>Class</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgUseElement#getStyle <em>Style</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgUseElement#getExternalResourcesRequired <em>External Resources Required</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgUseElement#getTransform <em>Transform</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgUseElement#getWidth <em>Width</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgUseElement#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgUseElement()
 * @model
 * @generated
 */
public interface SvgUseElement extends SvgElement, GraphicsElement, GraphicsReferencingElement, StructuralElement, ConditionalProcessingAttributes, CoreAttributes, GraphicalEventAttributes, PresentationAttributes, XLinkAttributes, ContentElement<SvgElement> {
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
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgUseElement_Class()
	 * @model
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgUseElement#getClass_ <em>Class</em>}' attribute.
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
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgUseElement_Style()
	 * @model
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgUseElement#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>External Resources Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Resources Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Resources Required</em>' attribute.
	 * @see #setExternalResourcesRequired(String)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgUseElement_ExternalResourcesRequired()
	 * @model
	 * @generated
	 */
	String getExternalResourcesRequired();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgUseElement#getExternalResourcesRequired <em>External Resources Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Resources Required</em>' attribute.
	 * @see #getExternalResourcesRequired()
	 * @generated
	 */
	void setExternalResourcesRequired(String value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' attribute.
	 * @see #setTransform(String)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgUseElement_Transform()
	 * @model dataType="at.bestsolution.efxclipse.formats.svg.svg.Transform"
	 * @generated
	 */
	String getTransform();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgUseElement#getTransform <em>Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' attribute.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgUseElement_Width()
	 * @model dataType="at.bestsolution.efxclipse.formats.svg.svg.Length"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgUseElement#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgUseElement_Height()
	 * @model dataType="at.bestsolution.efxclipse.formats.svg.svg.Length"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgUseElement#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

} // SvgUseElement
