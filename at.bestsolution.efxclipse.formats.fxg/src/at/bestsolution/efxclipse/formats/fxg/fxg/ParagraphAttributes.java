/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragraph Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTextAlign <em>Text Align</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTextAlignLast <em>Text Align Last</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTextIndent <em>Text Indent</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getParagraphStartIndent <em>Paragraph Start Indent</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getParagraphEndIndent <em>Paragraph End Indent</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getParagraphSpaceBefore <em>Paragraph Space Before</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getParagraphSpaceAfter <em>Paragraph Space After</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getJustificationRule <em>Justification Rule</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getJustificationStyle <em>Justification Style</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTextJustify <em>Text Justify</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getLeadingModel <em>Leading Model</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTabStops <em>Tab Stops</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getParagraphAttributes()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ParagraphAttributes extends EObject {
	/**
	 * Returns the value of the '<em><b>Text Align</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.fxg.fxg.TextAlign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Align</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TextAlign
	 * @see #setTextAlign(TextAlign)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getParagraphAttributes_TextAlign()
	 * @model
	 * @generated
	 */
	TextAlign getTextAlign();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTextAlign <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Align</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TextAlign
	 * @see #getTextAlign()
	 * @generated
	 */
	void setTextAlign(TextAlign value);

	/**
	 * Returns the value of the '<em><b>Text Align Last</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.fxg.fxg.TextAlign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Align Last</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Align Last</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TextAlign
	 * @see #setTextAlignLast(TextAlign)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getParagraphAttributes_TextAlignLast()
	 * @model
	 * @generated
	 */
	TextAlign getTextAlignLast();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTextAlignLast <em>Text Align Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Align Last</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TextAlign
	 * @see #getTextAlignLast()
	 * @generated
	 */
	void setTextAlignLast(TextAlign value);

	/**
	 * Returns the value of the '<em><b>Text Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Indent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Indent</em>' attribute.
	 * @see #setTextIndent(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getParagraphAttributes_TextIndent()
	 * @model
	 * @generated
	 */
	Double getTextIndent();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTextIndent <em>Text Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Indent</em>' attribute.
	 * @see #getTextIndent()
	 * @generated
	 */
	void setTextIndent(Double value);

	/**
	 * Returns the value of the '<em><b>Paragraph Start Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraph Start Indent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph Start Indent</em>' attribute.
	 * @see #setParagraphStartIndent(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getParagraphAttributes_ParagraphStartIndent()
	 * @model
	 * @generated
	 */
	String getParagraphStartIndent();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getParagraphStartIndent <em>Paragraph Start Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph Start Indent</em>' attribute.
	 * @see #getParagraphStartIndent()
	 * @generated
	 */
	void setParagraphStartIndent(String value);

	/**
	 * Returns the value of the '<em><b>Paragraph End Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraph End Indent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph End Indent</em>' attribute.
	 * @see #setParagraphEndIndent(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getParagraphAttributes_ParagraphEndIndent()
	 * @model
	 * @generated
	 */
	String getParagraphEndIndent();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getParagraphEndIndent <em>Paragraph End Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph End Indent</em>' attribute.
	 * @see #getParagraphEndIndent()
	 * @generated
	 */
	void setParagraphEndIndent(String value);

	/**
	 * Returns the value of the '<em><b>Paragraph Space Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraph Space Before</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph Space Before</em>' attribute.
	 * @see #setParagraphSpaceBefore(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getParagraphAttributes_ParagraphSpaceBefore()
	 * @model
	 * @generated
	 */
	String getParagraphSpaceBefore();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getParagraphSpaceBefore <em>Paragraph Space Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph Space Before</em>' attribute.
	 * @see #getParagraphSpaceBefore()
	 * @generated
	 */
	void setParagraphSpaceBefore(String value);

	/**
	 * Returns the value of the '<em><b>Paragraph Space After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraph Space After</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph Space After</em>' attribute.
	 * @see #setParagraphSpaceAfter(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getParagraphAttributes_ParagraphSpaceAfter()
	 * @model
	 * @generated
	 */
	String getParagraphSpaceAfter();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getParagraphSpaceAfter <em>Paragraph Space After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph Space After</em>' attribute.
	 * @see #getParagraphSpaceAfter()
	 * @generated
	 */
	void setParagraphSpaceAfter(String value);

	/**
	 * Returns the value of the '<em><b>Justification Rule</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.fxg.fxg.JustificationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justification Rule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justification Rule</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.JustificationRule
	 * @see #setJustificationRule(JustificationRule)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getParagraphAttributes_JustificationRule()
	 * @model
	 * @generated
	 */
	JustificationRule getJustificationRule();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getJustificationRule <em>Justification Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification Rule</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.JustificationRule
	 * @see #getJustificationRule()
	 * @generated
	 */
	void setJustificationRule(JustificationRule value);

	/**
	 * Returns the value of the '<em><b>Justification Style</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.fxg.fxg.JustificationStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justification Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justification Style</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.JustificationStyle
	 * @see #setJustificationStyle(JustificationStyle)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getParagraphAttributes_JustificationStyle()
	 * @model
	 * @generated
	 */
	JustificationStyle getJustificationStyle();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getJustificationStyle <em>Justification Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification Style</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.JustificationStyle
	 * @see #getJustificationStyle()
	 * @generated
	 */
	void setJustificationStyle(JustificationStyle value);

	/**
	 * Returns the value of the '<em><b>Text Justify</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.fxg.fxg.TextJustify}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Justify</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Justify</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TextJustify
	 * @see #setTextJustify(TextJustify)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getParagraphAttributes_TextJustify()
	 * @model
	 * @generated
	 */
	TextJustify getTextJustify();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTextJustify <em>Text Justify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Justify</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.TextJustify
	 * @see #getTextJustify()
	 * @generated
	 */
	void setTextJustify(TextJustify value);

	/**
	 * Returns the value of the '<em><b>Leading Model</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.fxg.fxg.LeadingModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leading Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leading Model</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LeadingModel
	 * @see #setLeadingModel(LeadingModel)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getParagraphAttributes_LeadingModel()
	 * @model
	 * @generated
	 */
	LeadingModel getLeadingModel();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getLeadingModel <em>Leading Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leading Model</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LeadingModel
	 * @see #getLeadingModel()
	 * @generated
	 */
	void setLeadingModel(LeadingModel value);

	/**
	 * Returns the value of the '<em><b>Tab Stops</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Stops</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Stops</em>' attribute.
	 * @see #setTabStops(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getParagraphAttributes_TabStops()
	 * @model
	 * @generated
	 */
	String getTabStops();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes#getTabStops <em>Tab Stops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab Stops</em>' attribute.
	 * @see #getTabStops()
	 * @generated
	 */
	void setTabStops(String value);

} // ParagraphAttributes
