/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rich Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getRotation <em>Rotation</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getScaleX <em>Scale X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getScaleY <em>Scale Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getX <em>X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getY <em>Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getBlendMode <em>Blend Mode</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getMaskType <em>Mask Type</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getVisible <em>Visible</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getWidth <em>Width</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getHeight <em>Height</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getContent <em>Content</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#get_tempcontent <em>tempcontent</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRichText()
 * @model
 * @generated
 */
public interface RichText extends FXGElement, ParagraphAttributes, ContainerAttributes, CharacterAttributes {
	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRichText_Rotation()
	 * @model default="0" dataType="at.bestsolution.efxclipse.formats.fxg.fxg.Angle"
	 * @generated
	 */
	Double getRotation();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(Double value);

	/**
	 * Returns the value of the '<em><b>Scale X</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale X</em>' attribute.
	 * @see #setScaleX(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRichText_ScaleX()
	 * @model default="1"
	 * @generated
	 */
	Double getScaleX();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getScaleX <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale X</em>' attribute.
	 * @see #getScaleX()
	 * @generated
	 */
	void setScaleX(Double value);

	/**
	 * Returns the value of the '<em><b>Scale Y</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Y</em>' attribute.
	 * @see #setScaleY(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRichText_ScaleY()
	 * @model default="1"
	 * @generated
	 */
	Double getScaleY();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getScaleY <em>Scale Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Y</em>' attribute.
	 * @see #getScaleY()
	 * @generated
	 */
	void setScaleY(Double value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRichText_X()
	 * @model
	 * @generated
	 */
	Double getX();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(Double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRichText_Y()
	 * @model
	 * @generated
	 */
	Double getY();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(Double value);

	/**
	 * Returns the value of the '<em><b>Blend Mode</b></em>' attribute.
	 * The default value is <code>"BlendMode.LAYER"</code>.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.fxg.fxg.BlendMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blend Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blend Mode</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BlendMode
	 * @see #setBlendMode(BlendMode)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRichText_BlendMode()
	 * @model default="BlendMode.LAYER"
	 * @generated
	 */
	BlendMode getBlendMode();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getBlendMode <em>Blend Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blend Mode</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BlendMode
	 * @see #getBlendMode()
	 * @generated
	 */
	void setBlendMode(BlendMode value);

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
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRichText_Alpha()
	 * @model
	 * @generated
	 */
	Double getAlpha();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(Double value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRichText_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Mask Type</b></em>' attribute.
	 * The default value is <code>"MaskType.CLIP"</code>.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.fxg.fxg.MaskType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask Type</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.MaskType
	 * @see #setMaskType(MaskType)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRichText_MaskType()
	 * @model default="MaskType.CLIP"
	 * @generated
	 */
	MaskType getMaskType();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getMaskType <em>Mask Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask Type</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.MaskType
	 * @see #getMaskType()
	 * @generated
	 */
	void setMaskType(MaskType value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(Boolean)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRichText_Visible()
	 * @model
	 * @generated
	 */
	Boolean getVisible();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #getVisible()
	 * @generated
	 */
	void setVisible(Boolean value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRichText_Width()
	 * @model
	 * @generated
	 */
	Double getWidth();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRichText_Height()
	 * @model
	 * @generated
	 */
	Double getHeight();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Double value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRichText_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<RichTextContent> getContent();

	/**
	 * Returns the value of the '<em><b>tempcontent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>tempcontent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>tempcontent</em>' attribute.
	 * @see #set_tempcontent(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRichText__tempcontent()
	 * @model
	 * @generated
	 */
	String get_tempcontent();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText#get_tempcontent <em>tempcontent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>tempcontent</em>' attribute.
	 * @see #get_tempcontent()
	 * @generated
	 */
	void set_tempcontent(String value);

} // RichText
