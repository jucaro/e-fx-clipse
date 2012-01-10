/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.svg.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Profile Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgColorProfileElement#getLocal <em>Local</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgColorProfileElement#getName <em>Name</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgColorProfileElement#getRendering_intent <em>Rendering intent</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgColorProfileElement()
 * @model
 * @generated
 */
public interface SvgColorProfileElement extends SvgElement, CoreAttributes, PresentationAttributes, XLinkAttributes {
	/**
	 * Returns the value of the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' attribute.
	 * @see #setLocal(String)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgColorProfileElement_Local()
	 * @model
	 * @generated
	 */
	String getLocal();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgColorProfileElement#getLocal <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' attribute.
	 * @see #getLocal()
	 * @generated
	 */
	void setLocal(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgColorProfileElement_Name()
	 * @model dataType="at.bestsolution.efxclipse.formats.svg.svg.Name"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgColorProfileElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rendering intent</b></em>' attribute.
	 * The default value is <code>"Rendering_intent.auto"</code>.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.svg.svg.Rendering_intent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rendering intent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rendering intent</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.Rendering_intent
	 * @see #setRendering_intent(Rendering_intent)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgColorProfileElement_Rendering_intent()
	 * @model default="Rendering_intent.auto"
	 * @generated
	 */
	Rendering_intent getRendering_intent();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgColorProfileElement#getRendering_intent <em>Rendering intent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendering intent</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.Rendering_intent
	 * @see #getRendering_intent()
	 * @generated
	 */
	void setRendering_intent(Rendering_intent value);

} // SvgColorProfileElement
