/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg.impl;

import at.bestsolution.efxclipse.formats.fxg.fxg.AlignmentBaseline;
import at.bestsolution.efxclipse.formats.fxg.fxg.BlendMode;
import at.bestsolution.efxclipse.formats.fxg.fxg.BlockProgression;
import at.bestsolution.efxclipse.formats.fxg.fxg.BreakOpportunity;
import at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes;
import at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes;
import at.bestsolution.efxclipse.formats.fxg.fxg.DigitCase;
import at.bestsolution.efxclipse.formats.fxg.fxg.DigitWidth;
import at.bestsolution.efxclipse.formats.fxg.fxg.DominantBaseline;
import at.bestsolution.efxclipse.formats.fxg.fxg.FontStyle;
import at.bestsolution.efxclipse.formats.fxg.fxg.FontWeight;
import at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage;
import at.bestsolution.efxclipse.formats.fxg.fxg.JustificationRule;
import at.bestsolution.efxclipse.formats.fxg.fxg.JustificationStyle;
import at.bestsolution.efxclipse.formats.fxg.fxg.Kerning;
import at.bestsolution.efxclipse.formats.fxg.fxg.LeadingModel;
import at.bestsolution.efxclipse.formats.fxg.fxg.LigatureLevel;
import at.bestsolution.efxclipse.formats.fxg.fxg.LineBreak;
import at.bestsolution.efxclipse.formats.fxg.fxg.MaskType;
import at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes;
import at.bestsolution.efxclipse.formats.fxg.fxg.RichText;
import at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContent;
import at.bestsolution.efxclipse.formats.fxg.fxg.TextAlign;
import at.bestsolution.efxclipse.formats.fxg.fxg.TextDecoration;
import at.bestsolution.efxclipse.formats.fxg.fxg.TextJustify;
import at.bestsolution.efxclipse.formats.fxg.fxg.TextRotation;
import at.bestsolution.efxclipse.formats.fxg.fxg.TypographicCase;
import at.bestsolution.efxclipse.formats.fxg.fxg.VerticalAlign;
import at.bestsolution.efxclipse.formats.fxg.fxg.WhitespaceCollapse;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rich Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getTextAlign <em>Text Align</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getTextAlignLast <em>Text Align Last</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getTextIndent <em>Text Indent</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getParagraphStartIndent <em>Paragraph Start Indent</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getParagraphEndIndent <em>Paragraph End Indent</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getParagraphSpaceBefore <em>Paragraph Space Before</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getParagraphSpaceAfter <em>Paragraph Space After</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getJustificationRule <em>Justification Rule</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getJustificationStyle <em>Justification Style</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getTextJustify <em>Text Justify</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getLeadingModel <em>Leading Model</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getTabStops <em>Tab Stops</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getBlockProgression <em>Block Progression</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getPaddingLeft <em>Padding Left</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getPaddingRight <em>Padding Right</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getPaddingTop <em>Padding Top</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getPaddingBottom <em>Padding Bottom</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getColumnGap <em>Column Gap</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getColumnCount <em>Column Count</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getColumnWidth <em>Column Width</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getFirstBaselineOffset <em>First Baseline Offset</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getVerticalAlign <em>Vertical Align</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getLineBreak <em>Line Break</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getLineHeight <em>Line Height</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getTextDecoration <em>Text Decoration</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getLineThrough <em>Line Through</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getColor <em>Color</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getTextAlpha <em>Text Alpha</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getWhiteSpaceCollapse <em>White Space Collapse</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getKerning <em>Kerning</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getBackgroundAlpha <em>Background Alpha</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getBaselineShift <em>Baseline Shift</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getBreakOpportunity <em>Break Opportunity</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getDigitCase <em>Digit Case</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getDigitWidth <em>Digit Width</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getDominantBaseline <em>Dominant Baseline</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getAlignmentBaseline <em>Alignment Baseline</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getLigatureLevel <em>Ligature Level</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getLocale <em>Locale</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getTypographicCase <em>Typographic Case</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getTextRotation <em>Text Rotation</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getTrackingLeft <em>Tracking Left</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getTrackingRight <em>Tracking Right</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getScaleX <em>Scale X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getScaleY <em>Scale Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getX <em>X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getY <em>Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getBlendMode <em>Blend Mode</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getMaskType <em>Mask Type</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#getContent <em>Content</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.RichTextImpl#get_tempcontent <em>tempcontent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RichTextImpl extends EObjectImpl implements RichText {
	/**
	 * The default value of the '{@link #getTextAlign() <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlign()
	 * @generated
	 * @ordered
	 */
	protected static final TextAlign TEXT_ALIGN_EDEFAULT = TextAlign.START;

	/**
	 * The cached value of the '{@link #getTextAlign() <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlign()
	 * @generated
	 * @ordered
	 */
	protected TextAlign textAlign = TEXT_ALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextAlignLast() <em>Text Align Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlignLast()
	 * @generated
	 * @ordered
	 */
	protected static final TextAlign TEXT_ALIGN_LAST_EDEFAULT = TextAlign.START;

	/**
	 * The cached value of the '{@link #getTextAlignLast() <em>Text Align Last</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlignLast()
	 * @generated
	 * @ordered
	 */
	protected TextAlign textAlignLast = TEXT_ALIGN_LAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextIndent() <em>Text Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextIndent()
	 * @generated
	 * @ordered
	 */
	protected static final Double TEXT_INDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextIndent() <em>Text Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextIndent()
	 * @generated
	 * @ordered
	 */
	protected Double textIndent = TEXT_INDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getParagraphStartIndent() <em>Paragraph Start Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphStartIndent()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAGRAPH_START_INDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParagraphStartIndent() <em>Paragraph Start Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphStartIndent()
	 * @generated
	 * @ordered
	 */
	protected String paragraphStartIndent = PARAGRAPH_START_INDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getParagraphEndIndent() <em>Paragraph End Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphEndIndent()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAGRAPH_END_INDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParagraphEndIndent() <em>Paragraph End Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphEndIndent()
	 * @generated
	 * @ordered
	 */
	protected String paragraphEndIndent = PARAGRAPH_END_INDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getParagraphSpaceBefore() <em>Paragraph Space Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphSpaceBefore()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAGRAPH_SPACE_BEFORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParagraphSpaceBefore() <em>Paragraph Space Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphSpaceBefore()
	 * @generated
	 * @ordered
	 */
	protected String paragraphSpaceBefore = PARAGRAPH_SPACE_BEFORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParagraphSpaceAfter() <em>Paragraph Space After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphSpaceAfter()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAGRAPH_SPACE_AFTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParagraphSpaceAfter() <em>Paragraph Space After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphSpaceAfter()
	 * @generated
	 * @ordered
	 */
	protected String paragraphSpaceAfter = PARAGRAPH_SPACE_AFTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getJustificationRule() <em>Justification Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustificationRule()
	 * @generated
	 * @ordered
	 */
	protected static final JustificationRule JUSTIFICATION_RULE_EDEFAULT = JustificationRule.AUTO;

	/**
	 * The cached value of the '{@link #getJustificationRule() <em>Justification Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustificationRule()
	 * @generated
	 * @ordered
	 */
	protected JustificationRule justificationRule = JUSTIFICATION_RULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJustificationStyle() <em>Justification Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustificationStyle()
	 * @generated
	 * @ordered
	 */
	protected static final JustificationStyle JUSTIFICATION_STYLE_EDEFAULT = JustificationStyle.AUTO;

	/**
	 * The cached value of the '{@link #getJustificationStyle() <em>Justification Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustificationStyle()
	 * @generated
	 * @ordered
	 */
	protected JustificationStyle justificationStyle = JUSTIFICATION_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextJustify() <em>Text Justify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextJustify()
	 * @generated
	 * @ordered
	 */
	protected static final TextJustify TEXT_JUSTIFY_EDEFAULT = TextJustify.INTER_WORD;

	/**
	 * The cached value of the '{@link #getTextJustify() <em>Text Justify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextJustify()
	 * @generated
	 * @ordered
	 */
	protected TextJustify textJustify = TEXT_JUSTIFY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeadingModel() <em>Leading Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeadingModel()
	 * @generated
	 * @ordered
	 */
	protected static final LeadingModel LEADING_MODEL_EDEFAULT = LeadingModel.AUTO;

	/**
	 * The cached value of the '{@link #getLeadingModel() <em>Leading Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeadingModel()
	 * @generated
	 * @ordered
	 */
	protected LeadingModel leadingModel = LEADING_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTabStops() <em>Tab Stops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabStops()
	 * @generated
	 * @ordered
	 */
	protected static final String TAB_STOPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTabStops() <em>Tab Stops</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabStops()
	 * @generated
	 * @ordered
	 */
	protected String tabStops = TAB_STOPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockProgression() <em>Block Progression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockProgression()
	 * @generated
	 * @ordered
	 */
	protected static final BlockProgression BLOCK_PROGRESSION_EDEFAULT = BlockProgression.TB;

	/**
	 * The cached value of the '{@link #getBlockProgression() <em>Block Progression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockProgression()
	 * @generated
	 * @ordered
	 */
	protected BlockProgression blockProgression = BLOCK_PROGRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaddingLeft() <em>Padding Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingLeft()
	 * @generated
	 * @ordered
	 */
	protected static final Double PADDING_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaddingLeft() <em>Padding Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingLeft()
	 * @generated
	 * @ordered
	 */
	protected Double paddingLeft = PADDING_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaddingRight() <em>Padding Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingRight()
	 * @generated
	 * @ordered
	 */
	protected static final Double PADDING_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaddingRight() <em>Padding Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingRight()
	 * @generated
	 * @ordered
	 */
	protected Double paddingRight = PADDING_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaddingTop() <em>Padding Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingTop()
	 * @generated
	 * @ordered
	 */
	protected static final Double PADDING_TOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaddingTop() <em>Padding Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingTop()
	 * @generated
	 * @ordered
	 */
	protected Double paddingTop = PADDING_TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaddingBottom() <em>Padding Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingBottom()
	 * @generated
	 * @ordered
	 */
	protected static final Double PADDING_BOTTOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaddingBottom() <em>Padding Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaddingBottom()
	 * @generated
	 * @ordered
	 */
	protected Double paddingBottom = PADDING_BOTTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnGap() <em>Column Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnGap()
	 * @generated
	 * @ordered
	 */
	protected static final Double COLUMN_GAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnGap() <em>Column Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnGap()
	 * @generated
	 * @ordered
	 */
	protected Double columnGap = COLUMN_GAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnCount() <em>Column Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnCount()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnCount() <em>Column Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnCount()
	 * @generated
	 * @ordered
	 */
	protected String columnCount = COLUMN_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnWidth() <em>Column Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnWidth() <em>Column Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnWidth()
	 * @generated
	 * @ordered
	 */
	protected String columnWidth = COLUMN_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstBaselineOffset() <em>First Baseline Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstBaselineOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_BASELINE_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstBaselineOffset() <em>First Baseline Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstBaselineOffset()
	 * @generated
	 * @ordered
	 */
	protected String firstBaselineOffset = FIRST_BASELINE_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalAlign() <em>Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlign()
	 * @generated
	 * @ordered
	 */
	protected static final VerticalAlign VERTICAL_ALIGN_EDEFAULT = VerticalAlign.TOP;

	/**
	 * The cached value of the '{@link #getVerticalAlign() <em>Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlign()
	 * @generated
	 * @ordered
	 */
	protected VerticalAlign verticalAlign = VERTICAL_ALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineBreak() <em>Line Break</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineBreak()
	 * @generated
	 * @ordered
	 */
	protected static final LineBreak LINE_BREAK_EDEFAULT = LineBreak.TO_FIT;

	/**
	 * The cached value of the '{@link #getLineBreak() <em>Line Break</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineBreak()
	 * @generated
	 * @ordered
	 */
	protected LineBreak lineBreak = LINE_BREAK_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontFamily() <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontFamily() <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamily()
	 * @generated
	 * @ordered
	 */
	protected String fontFamily = FONT_FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final Double FONT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected Double fontSize = FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontStyle() <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyle()
	 * @generated
	 * @ordered
	 */
	protected static final FontStyle FONT_STYLE_EDEFAULT = FontStyle.NORMAL;

	/**
	 * The cached value of the '{@link #getFontStyle() <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyle()
	 * @generated
	 * @ordered
	 */
	protected FontStyle fontStyle = FONT_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontWeight() <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontWeight()
	 * @generated
	 * @ordered
	 */
	protected static final FontWeight FONT_WEIGHT_EDEFAULT = FontWeight.NORMAL;

	/**
	 * The cached value of the '{@link #getFontWeight() <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontWeight()
	 * @generated
	 * @ordered
	 */
	protected FontWeight fontWeight = FONT_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineHeight() <em>Line Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineHeight() <em>Line Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineHeight()
	 * @generated
	 * @ordered
	 */
	protected String lineHeight = LINE_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextDecoration() <em>Text Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextDecoration()
	 * @generated
	 * @ordered
	 */
	protected static final TextDecoration TEXT_DECORATION_EDEFAULT = TextDecoration.NONE;

	/**
	 * The cached value of the '{@link #getTextDecoration() <em>Text Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextDecoration()
	 * @generated
	 * @ordered
	 */
	protected TextDecoration textDecoration = TEXT_DECORATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineThrough() <em>Line Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineThrough()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LINE_THROUGH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineThrough() <em>Line Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineThrough()
	 * @generated
	 * @ordered
	 */
	protected Boolean lineThrough = LINE_THROUGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextAlpha() <em>Text Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final Double TEXT_ALPHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextAlpha() <em>Text Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlpha()
	 * @generated
	 * @ordered
	 */
	protected Double textAlpha = TEXT_ALPHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getWhiteSpaceCollapse() <em>White Space Collapse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhiteSpaceCollapse()
	 * @generated
	 * @ordered
	 */
	protected static final WhitespaceCollapse WHITE_SPACE_COLLAPSE_EDEFAULT = WhitespaceCollapse.PRESERVE;

	/**
	 * The cached value of the '{@link #getWhiteSpaceCollapse() <em>White Space Collapse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhiteSpaceCollapse()
	 * @generated
	 * @ordered
	 */
	protected WhitespaceCollapse whiteSpaceCollapse = WHITE_SPACE_COLLAPSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKerning() <em>Kerning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKerning()
	 * @generated
	 * @ordered
	 */
	protected static final Kerning KERNING_EDEFAULT = Kerning.ON;

	/**
	 * The cached value of the '{@link #getKerning() <em>Kerning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKerning()
	 * @generated
	 * @ordered
	 */
	protected Kerning kerning = KERNING_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundAlpha() <em>Background Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final Double BACKGROUND_ALPHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundAlpha() <em>Background Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundAlpha()
	 * @generated
	 * @ordered
	 */
	protected Double backgroundAlpha = BACKGROUND_ALPHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected String backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaselineShift() <em>Baseline Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaselineShift()
	 * @generated
	 * @ordered
	 */
	protected static final String BASELINE_SHIFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaselineShift() <em>Baseline Shift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaselineShift()
	 * @generated
	 * @ordered
	 */
	protected String baselineShift = BASELINE_SHIFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBreakOpportunity() <em>Break Opportunity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakOpportunity()
	 * @generated
	 * @ordered
	 */
	protected static final BreakOpportunity BREAK_OPPORTUNITY_EDEFAULT = BreakOpportunity.AUTO;

	/**
	 * The cached value of the '{@link #getBreakOpportunity() <em>Break Opportunity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreakOpportunity()
	 * @generated
	 * @ordered
	 */
	protected BreakOpportunity breakOpportunity = BREAK_OPPORTUNITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDigitCase() <em>Digit Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitCase()
	 * @generated
	 * @ordered
	 */
	protected static final DigitCase DIGIT_CASE_EDEFAULT = DigitCase.DEFAULT;

	/**
	 * The cached value of the '{@link #getDigitCase() <em>Digit Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitCase()
	 * @generated
	 * @ordered
	 */
	protected DigitCase digitCase = DIGIT_CASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDigitWidth() <em>Digit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitWidth()
	 * @generated
	 * @ordered
	 */
	protected static final DigitWidth DIGIT_WIDTH_EDEFAULT = DigitWidth.DEFAULT;

	/**
	 * The cached value of the '{@link #getDigitWidth() <em>Digit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitWidth()
	 * @generated
	 * @ordered
	 */
	protected DigitWidth digitWidth = DIGIT_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDominantBaseline() <em>Dominant Baseline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDominantBaseline()
	 * @generated
	 * @ordered
	 */
	protected static final DominantBaseline DOMINANT_BASELINE_EDEFAULT = DominantBaseline.AUTO;

	/**
	 * The cached value of the '{@link #getDominantBaseline() <em>Dominant Baseline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDominantBaseline()
	 * @generated
	 * @ordered
	 */
	protected DominantBaseline dominantBaseline = DOMINANT_BASELINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlignmentBaseline() <em>Alignment Baseline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignmentBaseline()
	 * @generated
	 * @ordered
	 */
	protected static final AlignmentBaseline ALIGNMENT_BASELINE_EDEFAULT = AlignmentBaseline.AUTO;

	/**
	 * The cached value of the '{@link #getAlignmentBaseline() <em>Alignment Baseline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignmentBaseline()
	 * @generated
	 * @ordered
	 */
	protected AlignmentBaseline alignmentBaseline = ALIGNMENT_BASELINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLigatureLevel() <em>Ligature Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLigatureLevel()
	 * @generated
	 * @ordered
	 */
	protected static final LigatureLevel LIGATURE_LEVEL_EDEFAULT = LigatureLevel.MINIMUM;

	/**
	 * The cached value of the '{@link #getLigatureLevel() <em>Ligature Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLigatureLevel()
	 * @generated
	 * @ordered
	 */
	protected LigatureLevel ligatureLevel = LIGATURE_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocale() <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocale()
	 * @generated
	 * @ordered
	 */
	protected String locale = LOCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypographicCase() <em>Typographic Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypographicCase()
	 * @generated
	 * @ordered
	 */
	protected static final TypographicCase TYPOGRAPHIC_CASE_EDEFAULT = TypographicCase.DEFAULT;

	/**
	 * The cached value of the '{@link #getTypographicCase() <em>Typographic Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypographicCase()
	 * @generated
	 * @ordered
	 */
	protected TypographicCase typographicCase = TYPOGRAPHIC_CASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextRotation() <em>Text Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextRotation()
	 * @generated
	 * @ordered
	 */
	protected static final TextRotation TEXT_ROTATION_EDEFAULT = TextRotation.AUTO;

	/**
	 * The cached value of the '{@link #getTextRotation() <em>Text Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextRotation()
	 * @generated
	 * @ordered
	 */
	protected TextRotation textRotation = TEXT_ROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrackingLeft() <em>Tracking Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingLeft()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACKING_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrackingLeft() <em>Tracking Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingLeft()
	 * @generated
	 * @ordered
	 */
	protected String trackingLeft = TRACKING_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrackingRight() <em>Tracking Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingRight()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACKING_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrackingRight() <em>Tracking Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackingRight()
	 * @generated
	 * @ordered
	 */
	protected String trackingRight = TRACKING_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final Double ROTATION_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected Double rotation = ROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleX() <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleX()
	 * @generated
	 * @ordered
	 */
	protected static final Double SCALE_X_EDEFAULT = new Double(1.0);

	/**
	 * The cached value of the '{@link #getScaleX() <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleX()
	 * @generated
	 * @ordered
	 */
	protected Double scaleX = SCALE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleY() <em>Scale Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleY()
	 * @generated
	 * @ordered
	 */
	protected static final Double SCALE_Y_EDEFAULT = new Double(1.0);

	/**
	 * The cached value of the '{@link #getScaleY() <em>Scale Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleY()
	 * @generated
	 * @ordered
	 */
	protected Double scaleY = SCALE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final Double X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected Double x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final Double Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected Double y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlendMode() <em>Blend Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlendMode()
	 * @generated
	 * @ordered
	 */
	protected static final BlendMode BLEND_MODE_EDEFAULT = BlendMode.ADD;

	/**
	 * The cached value of the '{@link #getBlendMode() <em>Blend Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlendMode()
	 * @generated
	 * @ordered
	 */
	protected BlendMode blendMode = BLEND_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final Double ALPHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected Double alpha = ALPHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaskType() <em>Mask Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskType()
	 * @generated
	 * @ordered
	 */
	protected static final MaskType MASK_TYPE_EDEFAULT = MaskType.CLIP;

	/**
	 * The cached value of the '{@link #getMaskType() <em>Mask Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaskType()
	 * @generated
	 * @ordered
	 */
	protected MaskType maskType = MASK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VISIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisible()
	 * @generated
	 * @ordered
	 */
	protected Boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Double WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Double HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected Double height = HEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<RichTextContent> content;

	/**
	 * The default value of the '{@link #get_tempcontent() <em>tempcontent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_tempcontent()
	 * @generated
	 * @ordered
	 */
	protected static final String _TEMPCONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #get_tempcontent() <em>tempcontent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_tempcontent()
	 * @generated
	 * @ordered
	 */
	protected String _tempcontent = _TEMPCONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RichTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FxgPackage.Literals.RICH_TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAlign getTextAlign() {
		return textAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAlign(TextAlign newTextAlign) {
		TextAlign oldTextAlign = textAlign;
		textAlign = newTextAlign == null ? TEXT_ALIGN_EDEFAULT : newTextAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__TEXT_ALIGN, oldTextAlign, textAlign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAlign getTextAlignLast() {
		return textAlignLast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAlignLast(TextAlign newTextAlignLast) {
		TextAlign oldTextAlignLast = textAlignLast;
		textAlignLast = newTextAlignLast == null ? TEXT_ALIGN_LAST_EDEFAULT : newTextAlignLast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__TEXT_ALIGN_LAST, oldTextAlignLast, textAlignLast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTextIndent() {
		return textIndent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextIndent(Double newTextIndent) {
		Double oldTextIndent = textIndent;
		textIndent = newTextIndent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__TEXT_INDENT, oldTextIndent, textIndent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParagraphStartIndent() {
		return paragraphStartIndent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraphStartIndent(String newParagraphStartIndent) {
		String oldParagraphStartIndent = paragraphStartIndent;
		paragraphStartIndent = newParagraphStartIndent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__PARAGRAPH_START_INDENT, oldParagraphStartIndent, paragraphStartIndent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParagraphEndIndent() {
		return paragraphEndIndent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraphEndIndent(String newParagraphEndIndent) {
		String oldParagraphEndIndent = paragraphEndIndent;
		paragraphEndIndent = newParagraphEndIndent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__PARAGRAPH_END_INDENT, oldParagraphEndIndent, paragraphEndIndent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParagraphSpaceBefore() {
		return paragraphSpaceBefore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraphSpaceBefore(String newParagraphSpaceBefore) {
		String oldParagraphSpaceBefore = paragraphSpaceBefore;
		paragraphSpaceBefore = newParagraphSpaceBefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__PARAGRAPH_SPACE_BEFORE, oldParagraphSpaceBefore, paragraphSpaceBefore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParagraphSpaceAfter() {
		return paragraphSpaceAfter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParagraphSpaceAfter(String newParagraphSpaceAfter) {
		String oldParagraphSpaceAfter = paragraphSpaceAfter;
		paragraphSpaceAfter = newParagraphSpaceAfter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__PARAGRAPH_SPACE_AFTER, oldParagraphSpaceAfter, paragraphSpaceAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JustificationRule getJustificationRule() {
		return justificationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustificationRule(JustificationRule newJustificationRule) {
		JustificationRule oldJustificationRule = justificationRule;
		justificationRule = newJustificationRule == null ? JUSTIFICATION_RULE_EDEFAULT : newJustificationRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__JUSTIFICATION_RULE, oldJustificationRule, justificationRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JustificationStyle getJustificationStyle() {
		return justificationStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustificationStyle(JustificationStyle newJustificationStyle) {
		JustificationStyle oldJustificationStyle = justificationStyle;
		justificationStyle = newJustificationStyle == null ? JUSTIFICATION_STYLE_EDEFAULT : newJustificationStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__JUSTIFICATION_STYLE, oldJustificationStyle, justificationStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextJustify getTextJustify() {
		return textJustify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextJustify(TextJustify newTextJustify) {
		TextJustify oldTextJustify = textJustify;
		textJustify = newTextJustify == null ? TEXT_JUSTIFY_EDEFAULT : newTextJustify;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__TEXT_JUSTIFY, oldTextJustify, textJustify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeadingModel getLeadingModel() {
		return leadingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeadingModel(LeadingModel newLeadingModel) {
		LeadingModel oldLeadingModel = leadingModel;
		leadingModel = newLeadingModel == null ? LEADING_MODEL_EDEFAULT : newLeadingModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__LEADING_MODEL, oldLeadingModel, leadingModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTabStops() {
		return tabStops;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabStops(String newTabStops) {
		String oldTabStops = tabStops;
		tabStops = newTabStops;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__TAB_STOPS, oldTabStops, tabStops));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockProgression getBlockProgression() {
		return blockProgression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockProgression(BlockProgression newBlockProgression) {
		BlockProgression oldBlockProgression = blockProgression;
		blockProgression = newBlockProgression == null ? BLOCK_PROGRESSION_EDEFAULT : newBlockProgression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__BLOCK_PROGRESSION, oldBlockProgression, blockProgression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPaddingLeft() {
		return paddingLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingLeft(Double newPaddingLeft) {
		Double oldPaddingLeft = paddingLeft;
		paddingLeft = newPaddingLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__PADDING_LEFT, oldPaddingLeft, paddingLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPaddingRight() {
		return paddingRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingRight(Double newPaddingRight) {
		Double oldPaddingRight = paddingRight;
		paddingRight = newPaddingRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__PADDING_RIGHT, oldPaddingRight, paddingRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPaddingTop() {
		return paddingTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingTop(Double newPaddingTop) {
		Double oldPaddingTop = paddingTop;
		paddingTop = newPaddingTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__PADDING_TOP, oldPaddingTop, paddingTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPaddingBottom() {
		return paddingBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaddingBottom(Double newPaddingBottom) {
		Double oldPaddingBottom = paddingBottom;
		paddingBottom = newPaddingBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__PADDING_BOTTOM, oldPaddingBottom, paddingBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getColumnGap() {
		return columnGap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnGap(Double newColumnGap) {
		Double oldColumnGap = columnGap;
		columnGap = newColumnGap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__COLUMN_GAP, oldColumnGap, columnGap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnCount() {
		return columnCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnCount(String newColumnCount) {
		String oldColumnCount = columnCount;
		columnCount = newColumnCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__COLUMN_COUNT, oldColumnCount, columnCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnWidth() {
		return columnWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnWidth(String newColumnWidth) {
		String oldColumnWidth = columnWidth;
		columnWidth = newColumnWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__COLUMN_WIDTH, oldColumnWidth, columnWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstBaselineOffset() {
		return firstBaselineOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstBaselineOffset(String newFirstBaselineOffset) {
		String oldFirstBaselineOffset = firstBaselineOffset;
		firstBaselineOffset = newFirstBaselineOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__FIRST_BASELINE_OFFSET, oldFirstBaselineOffset, firstBaselineOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalAlign getVerticalAlign() {
		return verticalAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalAlign(VerticalAlign newVerticalAlign) {
		VerticalAlign oldVerticalAlign = verticalAlign;
		verticalAlign = newVerticalAlign == null ? VERTICAL_ALIGN_EDEFAULT : newVerticalAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__VERTICAL_ALIGN, oldVerticalAlign, verticalAlign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineBreak getLineBreak() {
		return lineBreak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineBreak(LineBreak newLineBreak) {
		LineBreak oldLineBreak = lineBreak;
		lineBreak = newLineBreak == null ? LINE_BREAK_EDEFAULT : newLineBreak;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__LINE_BREAK, oldLineBreak, lineBreak));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontFamily() {
		return fontFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFamily(String newFontFamily) {
		String oldFontFamily = fontFamily;
		fontFamily = newFontFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__FONT_FAMILY, oldFontFamily, fontFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(Double newFontSize) {
		Double oldFontSize = fontSize;
		fontSize = newFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__FONT_SIZE, oldFontSize, fontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyle getFontStyle() {
		return fontStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStyle(FontStyle newFontStyle) {
		FontStyle oldFontStyle = fontStyle;
		fontStyle = newFontStyle == null ? FONT_STYLE_EDEFAULT : newFontStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__FONT_STYLE, oldFontStyle, fontStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontWeight getFontWeight() {
		return fontWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontWeight(FontWeight newFontWeight) {
		FontWeight oldFontWeight = fontWeight;
		fontWeight = newFontWeight == null ? FONT_WEIGHT_EDEFAULT : newFontWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__FONT_WEIGHT, oldFontWeight, fontWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineHeight() {
		return lineHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineHeight(String newLineHeight) {
		String oldLineHeight = lineHeight;
		lineHeight = newLineHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__LINE_HEIGHT, oldLineHeight, lineHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextDecoration getTextDecoration() {
		return textDecoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextDecoration(TextDecoration newTextDecoration) {
		TextDecoration oldTextDecoration = textDecoration;
		textDecoration = newTextDecoration == null ? TEXT_DECORATION_EDEFAULT : newTextDecoration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__TEXT_DECORATION, oldTextDecoration, textDecoration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getLineThrough() {
		return lineThrough;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineThrough(Boolean newLineThrough) {
		Boolean oldLineThrough = lineThrough;
		lineThrough = newLineThrough;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__LINE_THROUGH, oldLineThrough, lineThrough));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTextAlpha() {
		return textAlpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAlpha(Double newTextAlpha) {
		Double oldTextAlpha = textAlpha;
		textAlpha = newTextAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__TEXT_ALPHA, oldTextAlpha, textAlpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhitespaceCollapse getWhiteSpaceCollapse() {
		return whiteSpaceCollapse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhiteSpaceCollapse(WhitespaceCollapse newWhiteSpaceCollapse) {
		WhitespaceCollapse oldWhiteSpaceCollapse = whiteSpaceCollapse;
		whiteSpaceCollapse = newWhiteSpaceCollapse == null ? WHITE_SPACE_COLLAPSE_EDEFAULT : newWhiteSpaceCollapse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__WHITE_SPACE_COLLAPSE, oldWhiteSpaceCollapse, whiteSpaceCollapse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kerning getKerning() {
		return kerning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKerning(Kerning newKerning) {
		Kerning oldKerning = kerning;
		kerning = newKerning == null ? KERNING_EDEFAULT : newKerning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__KERNING, oldKerning, kerning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBackgroundAlpha() {
		return backgroundAlpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundAlpha(Double newBackgroundAlpha) {
		Double oldBackgroundAlpha = backgroundAlpha;
		backgroundAlpha = newBackgroundAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__BACKGROUND_ALPHA, oldBackgroundAlpha, backgroundAlpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(String newBackgroundColor) {
		String oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaselineShift() {
		return baselineShift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaselineShift(String newBaselineShift) {
		String oldBaselineShift = baselineShift;
		baselineShift = newBaselineShift;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__BASELINE_SHIFT, oldBaselineShift, baselineShift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakOpportunity getBreakOpportunity() {
		return breakOpportunity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBreakOpportunity(BreakOpportunity newBreakOpportunity) {
		BreakOpportunity oldBreakOpportunity = breakOpportunity;
		breakOpportunity = newBreakOpportunity == null ? BREAK_OPPORTUNITY_EDEFAULT : newBreakOpportunity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__BREAK_OPPORTUNITY, oldBreakOpportunity, breakOpportunity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitCase getDigitCase() {
		return digitCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDigitCase(DigitCase newDigitCase) {
		DigitCase oldDigitCase = digitCase;
		digitCase = newDigitCase == null ? DIGIT_CASE_EDEFAULT : newDigitCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__DIGIT_CASE, oldDigitCase, digitCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitWidth getDigitWidth() {
		return digitWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDigitWidth(DigitWidth newDigitWidth) {
		DigitWidth oldDigitWidth = digitWidth;
		digitWidth = newDigitWidth == null ? DIGIT_WIDTH_EDEFAULT : newDigitWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__DIGIT_WIDTH, oldDigitWidth, digitWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DominantBaseline getDominantBaseline() {
		return dominantBaseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDominantBaseline(DominantBaseline newDominantBaseline) {
		DominantBaseline oldDominantBaseline = dominantBaseline;
		dominantBaseline = newDominantBaseline == null ? DOMINANT_BASELINE_EDEFAULT : newDominantBaseline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__DOMINANT_BASELINE, oldDominantBaseline, dominantBaseline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentBaseline getAlignmentBaseline() {
		return alignmentBaseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignmentBaseline(AlignmentBaseline newAlignmentBaseline) {
		AlignmentBaseline oldAlignmentBaseline = alignmentBaseline;
		alignmentBaseline = newAlignmentBaseline == null ? ALIGNMENT_BASELINE_EDEFAULT : newAlignmentBaseline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__ALIGNMENT_BASELINE, oldAlignmentBaseline, alignmentBaseline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LigatureLevel getLigatureLevel() {
		return ligatureLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLigatureLevel(LigatureLevel newLigatureLevel) {
		LigatureLevel oldLigatureLevel = ligatureLevel;
		ligatureLevel = newLigatureLevel == null ? LIGATURE_LEVEL_EDEFAULT : newLigatureLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__LIGATURE_LEVEL, oldLigatureLevel, ligatureLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocale() {
		return locale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocale(String newLocale) {
		String oldLocale = locale;
		locale = newLocale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__LOCALE, oldLocale, locale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypographicCase getTypographicCase() {
		return typographicCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypographicCase(TypographicCase newTypographicCase) {
		TypographicCase oldTypographicCase = typographicCase;
		typographicCase = newTypographicCase == null ? TYPOGRAPHIC_CASE_EDEFAULT : newTypographicCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__TYPOGRAPHIC_CASE, oldTypographicCase, typographicCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextRotation getTextRotation() {
		return textRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextRotation(TextRotation newTextRotation) {
		TextRotation oldTextRotation = textRotation;
		textRotation = newTextRotation == null ? TEXT_ROTATION_EDEFAULT : newTextRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__TEXT_ROTATION, oldTextRotation, textRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrackingLeft() {
		return trackingLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackingLeft(String newTrackingLeft) {
		String oldTrackingLeft = trackingLeft;
		trackingLeft = newTrackingLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__TRACKING_LEFT, oldTrackingLeft, trackingLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrackingRight() {
		return trackingRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackingRight(String newTrackingRight) {
		String oldTrackingRight = trackingRight;
		trackingRight = newTrackingRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__TRACKING_RIGHT, oldTrackingRight, trackingRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(Double newRotation) {
		Double oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__ROTATION, oldRotation, rotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getScaleX() {
		return scaleX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleX(Double newScaleX) {
		Double oldScaleX = scaleX;
		scaleX = newScaleX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__SCALE_X, oldScaleX, scaleX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getScaleY() {
		return scaleY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleY(Double newScaleY) {
		Double oldScaleY = scaleY;
		scaleY = newScaleY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__SCALE_Y, oldScaleY, scaleY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(Double newX) {
		Double oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(Double newY) {
		Double oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlendMode getBlendMode() {
		return blendMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlendMode(BlendMode newBlendMode) {
		BlendMode oldBlendMode = blendMode;
		blendMode = newBlendMode == null ? BLEND_MODE_EDEFAULT : newBlendMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__BLEND_MODE, oldBlendMode, blendMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha(Double newAlpha) {
		Double oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaskType getMaskType() {
		return maskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaskType(MaskType newMaskType) {
		MaskType oldMaskType = maskType;
		maskType = newMaskType == null ? MASK_TYPE_EDEFAULT : newMaskType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__MASK_TYPE, oldMaskType, maskType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(Boolean newVisible) {
		Boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Double newWidth) {
		Double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(Double newHeight) {
		Double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RichTextContent> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<RichTextContent>(RichTextContent.class, this, FxgPackage.RICH_TEXT__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String get_tempcontent() {
		return _tempcontent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_tempcontent(String new_tempcontent) {
		String old_tempcontent = _tempcontent;
		_tempcontent = new_tempcontent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.RICH_TEXT__TEMPCONTENT, old_tempcontent, _tempcontent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FxgPackage.RICH_TEXT__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FxgPackage.RICH_TEXT__TEXT_ALIGN:
				return getTextAlign();
			case FxgPackage.RICH_TEXT__TEXT_ALIGN_LAST:
				return getTextAlignLast();
			case FxgPackage.RICH_TEXT__TEXT_INDENT:
				return getTextIndent();
			case FxgPackage.RICH_TEXT__PARAGRAPH_START_INDENT:
				return getParagraphStartIndent();
			case FxgPackage.RICH_TEXT__PARAGRAPH_END_INDENT:
				return getParagraphEndIndent();
			case FxgPackage.RICH_TEXT__PARAGRAPH_SPACE_BEFORE:
				return getParagraphSpaceBefore();
			case FxgPackage.RICH_TEXT__PARAGRAPH_SPACE_AFTER:
				return getParagraphSpaceAfter();
			case FxgPackage.RICH_TEXT__JUSTIFICATION_RULE:
				return getJustificationRule();
			case FxgPackage.RICH_TEXT__JUSTIFICATION_STYLE:
				return getJustificationStyle();
			case FxgPackage.RICH_TEXT__TEXT_JUSTIFY:
				return getTextJustify();
			case FxgPackage.RICH_TEXT__LEADING_MODEL:
				return getLeadingModel();
			case FxgPackage.RICH_TEXT__TAB_STOPS:
				return getTabStops();
			case FxgPackage.RICH_TEXT__BLOCK_PROGRESSION:
				return getBlockProgression();
			case FxgPackage.RICH_TEXT__PADDING_LEFT:
				return getPaddingLeft();
			case FxgPackage.RICH_TEXT__PADDING_RIGHT:
				return getPaddingRight();
			case FxgPackage.RICH_TEXT__PADDING_TOP:
				return getPaddingTop();
			case FxgPackage.RICH_TEXT__PADDING_BOTTOM:
				return getPaddingBottom();
			case FxgPackage.RICH_TEXT__COLUMN_GAP:
				return getColumnGap();
			case FxgPackage.RICH_TEXT__COLUMN_COUNT:
				return getColumnCount();
			case FxgPackage.RICH_TEXT__COLUMN_WIDTH:
				return getColumnWidth();
			case FxgPackage.RICH_TEXT__FIRST_BASELINE_OFFSET:
				return getFirstBaselineOffset();
			case FxgPackage.RICH_TEXT__VERTICAL_ALIGN:
				return getVerticalAlign();
			case FxgPackage.RICH_TEXT__LINE_BREAK:
				return getLineBreak();
			case FxgPackage.RICH_TEXT__FONT_FAMILY:
				return getFontFamily();
			case FxgPackage.RICH_TEXT__FONT_SIZE:
				return getFontSize();
			case FxgPackage.RICH_TEXT__FONT_STYLE:
				return getFontStyle();
			case FxgPackage.RICH_TEXT__FONT_WEIGHT:
				return getFontWeight();
			case FxgPackage.RICH_TEXT__LINE_HEIGHT:
				return getLineHeight();
			case FxgPackage.RICH_TEXT__TEXT_DECORATION:
				return getTextDecoration();
			case FxgPackage.RICH_TEXT__LINE_THROUGH:
				return getLineThrough();
			case FxgPackage.RICH_TEXT__COLOR:
				return getColor();
			case FxgPackage.RICH_TEXT__TEXT_ALPHA:
				return getTextAlpha();
			case FxgPackage.RICH_TEXT__WHITE_SPACE_COLLAPSE:
				return getWhiteSpaceCollapse();
			case FxgPackage.RICH_TEXT__KERNING:
				return getKerning();
			case FxgPackage.RICH_TEXT__BACKGROUND_ALPHA:
				return getBackgroundAlpha();
			case FxgPackage.RICH_TEXT__BACKGROUND_COLOR:
				return getBackgroundColor();
			case FxgPackage.RICH_TEXT__BASELINE_SHIFT:
				return getBaselineShift();
			case FxgPackage.RICH_TEXT__BREAK_OPPORTUNITY:
				return getBreakOpportunity();
			case FxgPackage.RICH_TEXT__DIGIT_CASE:
				return getDigitCase();
			case FxgPackage.RICH_TEXT__DIGIT_WIDTH:
				return getDigitWidth();
			case FxgPackage.RICH_TEXT__DOMINANT_BASELINE:
				return getDominantBaseline();
			case FxgPackage.RICH_TEXT__ALIGNMENT_BASELINE:
				return getAlignmentBaseline();
			case FxgPackage.RICH_TEXT__LIGATURE_LEVEL:
				return getLigatureLevel();
			case FxgPackage.RICH_TEXT__LOCALE:
				return getLocale();
			case FxgPackage.RICH_TEXT__TYPOGRAPHIC_CASE:
				return getTypographicCase();
			case FxgPackage.RICH_TEXT__TEXT_ROTATION:
				return getTextRotation();
			case FxgPackage.RICH_TEXT__TRACKING_LEFT:
				return getTrackingLeft();
			case FxgPackage.RICH_TEXT__TRACKING_RIGHT:
				return getTrackingRight();
			case FxgPackage.RICH_TEXT__ROTATION:
				return getRotation();
			case FxgPackage.RICH_TEXT__SCALE_X:
				return getScaleX();
			case FxgPackage.RICH_TEXT__SCALE_Y:
				return getScaleY();
			case FxgPackage.RICH_TEXT__X:
				return getX();
			case FxgPackage.RICH_TEXT__Y:
				return getY();
			case FxgPackage.RICH_TEXT__BLEND_MODE:
				return getBlendMode();
			case FxgPackage.RICH_TEXT__ALPHA:
				return getAlpha();
			case FxgPackage.RICH_TEXT__ID:
				return getId();
			case FxgPackage.RICH_TEXT__MASK_TYPE:
				return getMaskType();
			case FxgPackage.RICH_TEXT__VISIBLE:
				return getVisible();
			case FxgPackage.RICH_TEXT__WIDTH:
				return getWidth();
			case FxgPackage.RICH_TEXT__HEIGHT:
				return getHeight();
			case FxgPackage.RICH_TEXT__CONTENT:
				return getContent();
			case FxgPackage.RICH_TEXT__TEMPCONTENT:
				return get_tempcontent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FxgPackage.RICH_TEXT__TEXT_ALIGN:
				setTextAlign((TextAlign)newValue);
				return;
			case FxgPackage.RICH_TEXT__TEXT_ALIGN_LAST:
				setTextAlignLast((TextAlign)newValue);
				return;
			case FxgPackage.RICH_TEXT__TEXT_INDENT:
				setTextIndent((Double)newValue);
				return;
			case FxgPackage.RICH_TEXT__PARAGRAPH_START_INDENT:
				setParagraphStartIndent((String)newValue);
				return;
			case FxgPackage.RICH_TEXT__PARAGRAPH_END_INDENT:
				setParagraphEndIndent((String)newValue);
				return;
			case FxgPackage.RICH_TEXT__PARAGRAPH_SPACE_BEFORE:
				setParagraphSpaceBefore((String)newValue);
				return;
			case FxgPackage.RICH_TEXT__PARAGRAPH_SPACE_AFTER:
				setParagraphSpaceAfter((String)newValue);
				return;
			case FxgPackage.RICH_TEXT__JUSTIFICATION_RULE:
				setJustificationRule((JustificationRule)newValue);
				return;
			case FxgPackage.RICH_TEXT__JUSTIFICATION_STYLE:
				setJustificationStyle((JustificationStyle)newValue);
				return;
			case FxgPackage.RICH_TEXT__TEXT_JUSTIFY:
				setTextJustify((TextJustify)newValue);
				return;
			case FxgPackage.RICH_TEXT__LEADING_MODEL:
				setLeadingModel((LeadingModel)newValue);
				return;
			case FxgPackage.RICH_TEXT__TAB_STOPS:
				setTabStops((String)newValue);
				return;
			case FxgPackage.RICH_TEXT__BLOCK_PROGRESSION:
				setBlockProgression((BlockProgression)newValue);
				return;
			case FxgPackage.RICH_TEXT__PADDING_LEFT:
				setPaddingLeft((Double)newValue);
				return;
			case FxgPackage.RICH_TEXT__PADDING_RIGHT:
				setPaddingRight((Double)newValue);
				return;
			case FxgPackage.RICH_TEXT__PADDING_TOP:
				setPaddingTop((Double)newValue);
				return;
			case FxgPackage.RICH_TEXT__PADDING_BOTTOM:
				setPaddingBottom((Double)newValue);
				return;
			case FxgPackage.RICH_TEXT__COLUMN_GAP:
				setColumnGap((Double)newValue);
				return;
			case FxgPackage.RICH_TEXT__COLUMN_COUNT:
				setColumnCount((String)newValue);
				return;
			case FxgPackage.RICH_TEXT__COLUMN_WIDTH:
				setColumnWidth((String)newValue);
				return;
			case FxgPackage.RICH_TEXT__FIRST_BASELINE_OFFSET:
				setFirstBaselineOffset((String)newValue);
				return;
			case FxgPackage.RICH_TEXT__VERTICAL_ALIGN:
				setVerticalAlign((VerticalAlign)newValue);
				return;
			case FxgPackage.RICH_TEXT__LINE_BREAK:
				setLineBreak((LineBreak)newValue);
				return;
			case FxgPackage.RICH_TEXT__FONT_FAMILY:
				setFontFamily((String)newValue);
				return;
			case FxgPackage.RICH_TEXT__FONT_SIZE:
				setFontSize((Double)newValue);
				return;
			case FxgPackage.RICH_TEXT__FONT_STYLE:
				setFontStyle((FontStyle)newValue);
				return;
			case FxgPackage.RICH_TEXT__FONT_WEIGHT:
				setFontWeight((FontWeight)newValue);
				return;
			case FxgPackage.RICH_TEXT__LINE_HEIGHT:
				setLineHeight((String)newValue);
				return;
			case FxgPackage.RICH_TEXT__TEXT_DECORATION:
				setTextDecoration((TextDecoration)newValue);
				return;
			case FxgPackage.RICH_TEXT__LINE_THROUGH:
				setLineThrough((Boolean)newValue);
				return;
			case FxgPackage.RICH_TEXT__COLOR:
				setColor((String)newValue);
				return;
			case FxgPackage.RICH_TEXT__TEXT_ALPHA:
				setTextAlpha((Double)newValue);
				return;
			case FxgPackage.RICH_TEXT__WHITE_SPACE_COLLAPSE:
				setWhiteSpaceCollapse((WhitespaceCollapse)newValue);
				return;
			case FxgPackage.RICH_TEXT__KERNING:
				setKerning((Kerning)newValue);
				return;
			case FxgPackage.RICH_TEXT__BACKGROUND_ALPHA:
				setBackgroundAlpha((Double)newValue);
				return;
			case FxgPackage.RICH_TEXT__BACKGROUND_COLOR:
				setBackgroundColor((String)newValue);
				return;
			case FxgPackage.RICH_TEXT__BASELINE_SHIFT:
				setBaselineShift((String)newValue);
				return;
			case FxgPackage.RICH_TEXT__BREAK_OPPORTUNITY:
				setBreakOpportunity((BreakOpportunity)newValue);
				return;
			case FxgPackage.RICH_TEXT__DIGIT_CASE:
				setDigitCase((DigitCase)newValue);
				return;
			case FxgPackage.RICH_TEXT__DIGIT_WIDTH:
				setDigitWidth((DigitWidth)newValue);
				return;
			case FxgPackage.RICH_TEXT__DOMINANT_BASELINE:
				setDominantBaseline((DominantBaseline)newValue);
				return;
			case FxgPackage.RICH_TEXT__ALIGNMENT_BASELINE:
				setAlignmentBaseline((AlignmentBaseline)newValue);
				return;
			case FxgPackage.RICH_TEXT__LIGATURE_LEVEL:
				setLigatureLevel((LigatureLevel)newValue);
				return;
			case FxgPackage.RICH_TEXT__LOCALE:
				setLocale((String)newValue);
				return;
			case FxgPackage.RICH_TEXT__TYPOGRAPHIC_CASE:
				setTypographicCase((TypographicCase)newValue);
				return;
			case FxgPackage.RICH_TEXT__TEXT_ROTATION:
				setTextRotation((TextRotation)newValue);
				return;
			case FxgPackage.RICH_TEXT__TRACKING_LEFT:
				setTrackingLeft((String)newValue);
				return;
			case FxgPackage.RICH_TEXT__TRACKING_RIGHT:
				setTrackingRight((String)newValue);
				return;
			case FxgPackage.RICH_TEXT__ROTATION:
				setRotation((Double)newValue);
				return;
			case FxgPackage.RICH_TEXT__SCALE_X:
				setScaleX((Double)newValue);
				return;
			case FxgPackage.RICH_TEXT__SCALE_Y:
				setScaleY((Double)newValue);
				return;
			case FxgPackage.RICH_TEXT__X:
				setX((Double)newValue);
				return;
			case FxgPackage.RICH_TEXT__Y:
				setY((Double)newValue);
				return;
			case FxgPackage.RICH_TEXT__BLEND_MODE:
				setBlendMode((BlendMode)newValue);
				return;
			case FxgPackage.RICH_TEXT__ALPHA:
				setAlpha((Double)newValue);
				return;
			case FxgPackage.RICH_TEXT__ID:
				setId((String)newValue);
				return;
			case FxgPackage.RICH_TEXT__MASK_TYPE:
				setMaskType((MaskType)newValue);
				return;
			case FxgPackage.RICH_TEXT__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case FxgPackage.RICH_TEXT__WIDTH:
				setWidth((Double)newValue);
				return;
			case FxgPackage.RICH_TEXT__HEIGHT:
				setHeight((Double)newValue);
				return;
			case FxgPackage.RICH_TEXT__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends RichTextContent>)newValue);
				return;
			case FxgPackage.RICH_TEXT__TEMPCONTENT:
				set_tempcontent((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FxgPackage.RICH_TEXT__TEXT_ALIGN:
				setTextAlign(TEXT_ALIGN_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__TEXT_ALIGN_LAST:
				setTextAlignLast(TEXT_ALIGN_LAST_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__TEXT_INDENT:
				setTextIndent(TEXT_INDENT_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__PARAGRAPH_START_INDENT:
				setParagraphStartIndent(PARAGRAPH_START_INDENT_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__PARAGRAPH_END_INDENT:
				setParagraphEndIndent(PARAGRAPH_END_INDENT_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__PARAGRAPH_SPACE_BEFORE:
				setParagraphSpaceBefore(PARAGRAPH_SPACE_BEFORE_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__PARAGRAPH_SPACE_AFTER:
				setParagraphSpaceAfter(PARAGRAPH_SPACE_AFTER_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__JUSTIFICATION_RULE:
				setJustificationRule(JUSTIFICATION_RULE_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__JUSTIFICATION_STYLE:
				setJustificationStyle(JUSTIFICATION_STYLE_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__TEXT_JUSTIFY:
				setTextJustify(TEXT_JUSTIFY_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__LEADING_MODEL:
				setLeadingModel(LEADING_MODEL_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__TAB_STOPS:
				setTabStops(TAB_STOPS_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__BLOCK_PROGRESSION:
				setBlockProgression(BLOCK_PROGRESSION_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__PADDING_LEFT:
				setPaddingLeft(PADDING_LEFT_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__PADDING_RIGHT:
				setPaddingRight(PADDING_RIGHT_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__PADDING_TOP:
				setPaddingTop(PADDING_TOP_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__PADDING_BOTTOM:
				setPaddingBottom(PADDING_BOTTOM_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__COLUMN_GAP:
				setColumnGap(COLUMN_GAP_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__COLUMN_COUNT:
				setColumnCount(COLUMN_COUNT_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__COLUMN_WIDTH:
				setColumnWidth(COLUMN_WIDTH_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__FIRST_BASELINE_OFFSET:
				setFirstBaselineOffset(FIRST_BASELINE_OFFSET_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__VERTICAL_ALIGN:
				setVerticalAlign(VERTICAL_ALIGN_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__LINE_BREAK:
				setLineBreak(LINE_BREAK_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__FONT_FAMILY:
				setFontFamily(FONT_FAMILY_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__FONT_STYLE:
				setFontStyle(FONT_STYLE_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__FONT_WEIGHT:
				setFontWeight(FONT_WEIGHT_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__LINE_HEIGHT:
				setLineHeight(LINE_HEIGHT_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__TEXT_DECORATION:
				setTextDecoration(TEXT_DECORATION_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__LINE_THROUGH:
				setLineThrough(LINE_THROUGH_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__TEXT_ALPHA:
				setTextAlpha(TEXT_ALPHA_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__WHITE_SPACE_COLLAPSE:
				setWhiteSpaceCollapse(WHITE_SPACE_COLLAPSE_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__KERNING:
				setKerning(KERNING_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__BACKGROUND_ALPHA:
				setBackgroundAlpha(BACKGROUND_ALPHA_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__BASELINE_SHIFT:
				setBaselineShift(BASELINE_SHIFT_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__BREAK_OPPORTUNITY:
				setBreakOpportunity(BREAK_OPPORTUNITY_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__DIGIT_CASE:
				setDigitCase(DIGIT_CASE_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__DIGIT_WIDTH:
				setDigitWidth(DIGIT_WIDTH_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__DOMINANT_BASELINE:
				setDominantBaseline(DOMINANT_BASELINE_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__ALIGNMENT_BASELINE:
				setAlignmentBaseline(ALIGNMENT_BASELINE_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__LIGATURE_LEVEL:
				setLigatureLevel(LIGATURE_LEVEL_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__LOCALE:
				setLocale(LOCALE_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__TYPOGRAPHIC_CASE:
				setTypographicCase(TYPOGRAPHIC_CASE_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__TEXT_ROTATION:
				setTextRotation(TEXT_ROTATION_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__TRACKING_LEFT:
				setTrackingLeft(TRACKING_LEFT_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__TRACKING_RIGHT:
				setTrackingRight(TRACKING_RIGHT_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__ROTATION:
				setRotation(ROTATION_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__SCALE_X:
				setScaleX(SCALE_X_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__SCALE_Y:
				setScaleY(SCALE_Y_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__X:
				setX(X_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__Y:
				setY(Y_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__BLEND_MODE:
				setBlendMode(BLEND_MODE_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__ID:
				setId(ID_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__MASK_TYPE:
				setMaskType(MASK_TYPE_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case FxgPackage.RICH_TEXT__CONTENT:
				getContent().clear();
				return;
			case FxgPackage.RICH_TEXT__TEMPCONTENT:
				set_tempcontent(_TEMPCONTENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FxgPackage.RICH_TEXT__TEXT_ALIGN:
				return textAlign != TEXT_ALIGN_EDEFAULT;
			case FxgPackage.RICH_TEXT__TEXT_ALIGN_LAST:
				return textAlignLast != TEXT_ALIGN_LAST_EDEFAULT;
			case FxgPackage.RICH_TEXT__TEXT_INDENT:
				return TEXT_INDENT_EDEFAULT == null ? textIndent != null : !TEXT_INDENT_EDEFAULT.equals(textIndent);
			case FxgPackage.RICH_TEXT__PARAGRAPH_START_INDENT:
				return PARAGRAPH_START_INDENT_EDEFAULT == null ? paragraphStartIndent != null : !PARAGRAPH_START_INDENT_EDEFAULT.equals(paragraphStartIndent);
			case FxgPackage.RICH_TEXT__PARAGRAPH_END_INDENT:
				return PARAGRAPH_END_INDENT_EDEFAULT == null ? paragraphEndIndent != null : !PARAGRAPH_END_INDENT_EDEFAULT.equals(paragraphEndIndent);
			case FxgPackage.RICH_TEXT__PARAGRAPH_SPACE_BEFORE:
				return PARAGRAPH_SPACE_BEFORE_EDEFAULT == null ? paragraphSpaceBefore != null : !PARAGRAPH_SPACE_BEFORE_EDEFAULT.equals(paragraphSpaceBefore);
			case FxgPackage.RICH_TEXT__PARAGRAPH_SPACE_AFTER:
				return PARAGRAPH_SPACE_AFTER_EDEFAULT == null ? paragraphSpaceAfter != null : !PARAGRAPH_SPACE_AFTER_EDEFAULT.equals(paragraphSpaceAfter);
			case FxgPackage.RICH_TEXT__JUSTIFICATION_RULE:
				return justificationRule != JUSTIFICATION_RULE_EDEFAULT;
			case FxgPackage.RICH_TEXT__JUSTIFICATION_STYLE:
				return justificationStyle != JUSTIFICATION_STYLE_EDEFAULT;
			case FxgPackage.RICH_TEXT__TEXT_JUSTIFY:
				return textJustify != TEXT_JUSTIFY_EDEFAULT;
			case FxgPackage.RICH_TEXT__LEADING_MODEL:
				return leadingModel != LEADING_MODEL_EDEFAULT;
			case FxgPackage.RICH_TEXT__TAB_STOPS:
				return TAB_STOPS_EDEFAULT == null ? tabStops != null : !TAB_STOPS_EDEFAULT.equals(tabStops);
			case FxgPackage.RICH_TEXT__BLOCK_PROGRESSION:
				return blockProgression != BLOCK_PROGRESSION_EDEFAULT;
			case FxgPackage.RICH_TEXT__PADDING_LEFT:
				return PADDING_LEFT_EDEFAULT == null ? paddingLeft != null : !PADDING_LEFT_EDEFAULT.equals(paddingLeft);
			case FxgPackage.RICH_TEXT__PADDING_RIGHT:
				return PADDING_RIGHT_EDEFAULT == null ? paddingRight != null : !PADDING_RIGHT_EDEFAULT.equals(paddingRight);
			case FxgPackage.RICH_TEXT__PADDING_TOP:
				return PADDING_TOP_EDEFAULT == null ? paddingTop != null : !PADDING_TOP_EDEFAULT.equals(paddingTop);
			case FxgPackage.RICH_TEXT__PADDING_BOTTOM:
				return PADDING_BOTTOM_EDEFAULT == null ? paddingBottom != null : !PADDING_BOTTOM_EDEFAULT.equals(paddingBottom);
			case FxgPackage.RICH_TEXT__COLUMN_GAP:
				return COLUMN_GAP_EDEFAULT == null ? columnGap != null : !COLUMN_GAP_EDEFAULT.equals(columnGap);
			case FxgPackage.RICH_TEXT__COLUMN_COUNT:
				return COLUMN_COUNT_EDEFAULT == null ? columnCount != null : !COLUMN_COUNT_EDEFAULT.equals(columnCount);
			case FxgPackage.RICH_TEXT__COLUMN_WIDTH:
				return COLUMN_WIDTH_EDEFAULT == null ? columnWidth != null : !COLUMN_WIDTH_EDEFAULT.equals(columnWidth);
			case FxgPackage.RICH_TEXT__FIRST_BASELINE_OFFSET:
				return FIRST_BASELINE_OFFSET_EDEFAULT == null ? firstBaselineOffset != null : !FIRST_BASELINE_OFFSET_EDEFAULT.equals(firstBaselineOffset);
			case FxgPackage.RICH_TEXT__VERTICAL_ALIGN:
				return verticalAlign != VERTICAL_ALIGN_EDEFAULT;
			case FxgPackage.RICH_TEXT__LINE_BREAK:
				return lineBreak != LINE_BREAK_EDEFAULT;
			case FxgPackage.RICH_TEXT__FONT_FAMILY:
				return FONT_FAMILY_EDEFAULT == null ? fontFamily != null : !FONT_FAMILY_EDEFAULT.equals(fontFamily);
			case FxgPackage.RICH_TEXT__FONT_SIZE:
				return FONT_SIZE_EDEFAULT == null ? fontSize != null : !FONT_SIZE_EDEFAULT.equals(fontSize);
			case FxgPackage.RICH_TEXT__FONT_STYLE:
				return fontStyle != FONT_STYLE_EDEFAULT;
			case FxgPackage.RICH_TEXT__FONT_WEIGHT:
				return fontWeight != FONT_WEIGHT_EDEFAULT;
			case FxgPackage.RICH_TEXT__LINE_HEIGHT:
				return LINE_HEIGHT_EDEFAULT == null ? lineHeight != null : !LINE_HEIGHT_EDEFAULT.equals(lineHeight);
			case FxgPackage.RICH_TEXT__TEXT_DECORATION:
				return textDecoration != TEXT_DECORATION_EDEFAULT;
			case FxgPackage.RICH_TEXT__LINE_THROUGH:
				return LINE_THROUGH_EDEFAULT == null ? lineThrough != null : !LINE_THROUGH_EDEFAULT.equals(lineThrough);
			case FxgPackage.RICH_TEXT__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case FxgPackage.RICH_TEXT__TEXT_ALPHA:
				return TEXT_ALPHA_EDEFAULT == null ? textAlpha != null : !TEXT_ALPHA_EDEFAULT.equals(textAlpha);
			case FxgPackage.RICH_TEXT__WHITE_SPACE_COLLAPSE:
				return whiteSpaceCollapse != WHITE_SPACE_COLLAPSE_EDEFAULT;
			case FxgPackage.RICH_TEXT__KERNING:
				return kerning != KERNING_EDEFAULT;
			case FxgPackage.RICH_TEXT__BACKGROUND_ALPHA:
				return BACKGROUND_ALPHA_EDEFAULT == null ? backgroundAlpha != null : !BACKGROUND_ALPHA_EDEFAULT.equals(backgroundAlpha);
			case FxgPackage.RICH_TEXT__BACKGROUND_COLOR:
				return BACKGROUND_COLOR_EDEFAULT == null ? backgroundColor != null : !BACKGROUND_COLOR_EDEFAULT.equals(backgroundColor);
			case FxgPackage.RICH_TEXT__BASELINE_SHIFT:
				return BASELINE_SHIFT_EDEFAULT == null ? baselineShift != null : !BASELINE_SHIFT_EDEFAULT.equals(baselineShift);
			case FxgPackage.RICH_TEXT__BREAK_OPPORTUNITY:
				return breakOpportunity != BREAK_OPPORTUNITY_EDEFAULT;
			case FxgPackage.RICH_TEXT__DIGIT_CASE:
				return digitCase != DIGIT_CASE_EDEFAULT;
			case FxgPackage.RICH_TEXT__DIGIT_WIDTH:
				return digitWidth != DIGIT_WIDTH_EDEFAULT;
			case FxgPackage.RICH_TEXT__DOMINANT_BASELINE:
				return dominantBaseline != DOMINANT_BASELINE_EDEFAULT;
			case FxgPackage.RICH_TEXT__ALIGNMENT_BASELINE:
				return alignmentBaseline != ALIGNMENT_BASELINE_EDEFAULT;
			case FxgPackage.RICH_TEXT__LIGATURE_LEVEL:
				return ligatureLevel != LIGATURE_LEVEL_EDEFAULT;
			case FxgPackage.RICH_TEXT__LOCALE:
				return LOCALE_EDEFAULT == null ? locale != null : !LOCALE_EDEFAULT.equals(locale);
			case FxgPackage.RICH_TEXT__TYPOGRAPHIC_CASE:
				return typographicCase != TYPOGRAPHIC_CASE_EDEFAULT;
			case FxgPackage.RICH_TEXT__TEXT_ROTATION:
				return textRotation != TEXT_ROTATION_EDEFAULT;
			case FxgPackage.RICH_TEXT__TRACKING_LEFT:
				return TRACKING_LEFT_EDEFAULT == null ? trackingLeft != null : !TRACKING_LEFT_EDEFAULT.equals(trackingLeft);
			case FxgPackage.RICH_TEXT__TRACKING_RIGHT:
				return TRACKING_RIGHT_EDEFAULT == null ? trackingRight != null : !TRACKING_RIGHT_EDEFAULT.equals(trackingRight);
			case FxgPackage.RICH_TEXT__ROTATION:
				return ROTATION_EDEFAULT == null ? rotation != null : !ROTATION_EDEFAULT.equals(rotation);
			case FxgPackage.RICH_TEXT__SCALE_X:
				return SCALE_X_EDEFAULT == null ? scaleX != null : !SCALE_X_EDEFAULT.equals(scaleX);
			case FxgPackage.RICH_TEXT__SCALE_Y:
				return SCALE_Y_EDEFAULT == null ? scaleY != null : !SCALE_Y_EDEFAULT.equals(scaleY);
			case FxgPackage.RICH_TEXT__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case FxgPackage.RICH_TEXT__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case FxgPackage.RICH_TEXT__BLEND_MODE:
				return blendMode != BLEND_MODE_EDEFAULT;
			case FxgPackage.RICH_TEXT__ALPHA:
				return ALPHA_EDEFAULT == null ? alpha != null : !ALPHA_EDEFAULT.equals(alpha);
			case FxgPackage.RICH_TEXT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FxgPackage.RICH_TEXT__MASK_TYPE:
				return maskType != MASK_TYPE_EDEFAULT;
			case FxgPackage.RICH_TEXT__VISIBLE:
				return VISIBLE_EDEFAULT == null ? visible != null : !VISIBLE_EDEFAULT.equals(visible);
			case FxgPackage.RICH_TEXT__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case FxgPackage.RICH_TEXT__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case FxgPackage.RICH_TEXT__CONTENT:
				return content != null && !content.isEmpty();
			case FxgPackage.RICH_TEXT__TEMPCONTENT:
				return _TEMPCONTENT_EDEFAULT == null ? _tempcontent != null : !_TEMPCONTENT_EDEFAULT.equals(_tempcontent);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ParagraphAttributes.class) {
			switch (derivedFeatureID) {
				case FxgPackage.RICH_TEXT__TEXT_ALIGN: return FxgPackage.PARAGRAPH_ATTRIBUTES__TEXT_ALIGN;
				case FxgPackage.RICH_TEXT__TEXT_ALIGN_LAST: return FxgPackage.PARAGRAPH_ATTRIBUTES__TEXT_ALIGN_LAST;
				case FxgPackage.RICH_TEXT__TEXT_INDENT: return FxgPackage.PARAGRAPH_ATTRIBUTES__TEXT_INDENT;
				case FxgPackage.RICH_TEXT__PARAGRAPH_START_INDENT: return FxgPackage.PARAGRAPH_ATTRIBUTES__PARAGRAPH_START_INDENT;
				case FxgPackage.RICH_TEXT__PARAGRAPH_END_INDENT: return FxgPackage.PARAGRAPH_ATTRIBUTES__PARAGRAPH_END_INDENT;
				case FxgPackage.RICH_TEXT__PARAGRAPH_SPACE_BEFORE: return FxgPackage.PARAGRAPH_ATTRIBUTES__PARAGRAPH_SPACE_BEFORE;
				case FxgPackage.RICH_TEXT__PARAGRAPH_SPACE_AFTER: return FxgPackage.PARAGRAPH_ATTRIBUTES__PARAGRAPH_SPACE_AFTER;
				case FxgPackage.RICH_TEXT__JUSTIFICATION_RULE: return FxgPackage.PARAGRAPH_ATTRIBUTES__JUSTIFICATION_RULE;
				case FxgPackage.RICH_TEXT__JUSTIFICATION_STYLE: return FxgPackage.PARAGRAPH_ATTRIBUTES__JUSTIFICATION_STYLE;
				case FxgPackage.RICH_TEXT__TEXT_JUSTIFY: return FxgPackage.PARAGRAPH_ATTRIBUTES__TEXT_JUSTIFY;
				case FxgPackage.RICH_TEXT__LEADING_MODEL: return FxgPackage.PARAGRAPH_ATTRIBUTES__LEADING_MODEL;
				case FxgPackage.RICH_TEXT__TAB_STOPS: return FxgPackage.PARAGRAPH_ATTRIBUTES__TAB_STOPS;
				default: return -1;
			}
		}
		if (baseClass == ContainerAttributes.class) {
			switch (derivedFeatureID) {
				case FxgPackage.RICH_TEXT__BLOCK_PROGRESSION: return FxgPackage.CONTAINER_ATTRIBUTES__BLOCK_PROGRESSION;
				case FxgPackage.RICH_TEXT__PADDING_LEFT: return FxgPackage.CONTAINER_ATTRIBUTES__PADDING_LEFT;
				case FxgPackage.RICH_TEXT__PADDING_RIGHT: return FxgPackage.CONTAINER_ATTRIBUTES__PADDING_RIGHT;
				case FxgPackage.RICH_TEXT__PADDING_TOP: return FxgPackage.CONTAINER_ATTRIBUTES__PADDING_TOP;
				case FxgPackage.RICH_TEXT__PADDING_BOTTOM: return FxgPackage.CONTAINER_ATTRIBUTES__PADDING_BOTTOM;
				case FxgPackage.RICH_TEXT__COLUMN_GAP: return FxgPackage.CONTAINER_ATTRIBUTES__COLUMN_GAP;
				case FxgPackage.RICH_TEXT__COLUMN_COUNT: return FxgPackage.CONTAINER_ATTRIBUTES__COLUMN_COUNT;
				case FxgPackage.RICH_TEXT__COLUMN_WIDTH: return FxgPackage.CONTAINER_ATTRIBUTES__COLUMN_WIDTH;
				case FxgPackage.RICH_TEXT__FIRST_BASELINE_OFFSET: return FxgPackage.CONTAINER_ATTRIBUTES__FIRST_BASELINE_OFFSET;
				case FxgPackage.RICH_TEXT__VERTICAL_ALIGN: return FxgPackage.CONTAINER_ATTRIBUTES__VERTICAL_ALIGN;
				case FxgPackage.RICH_TEXT__LINE_BREAK: return FxgPackage.CONTAINER_ATTRIBUTES__LINE_BREAK;
				default: return -1;
			}
		}
		if (baseClass == CharacterAttributes.class) {
			switch (derivedFeatureID) {
				case FxgPackage.RICH_TEXT__FONT_FAMILY: return FxgPackage.CHARACTER_ATTRIBUTES__FONT_FAMILY;
				case FxgPackage.RICH_TEXT__FONT_SIZE: return FxgPackage.CHARACTER_ATTRIBUTES__FONT_SIZE;
				case FxgPackage.RICH_TEXT__FONT_STYLE: return FxgPackage.CHARACTER_ATTRIBUTES__FONT_STYLE;
				case FxgPackage.RICH_TEXT__FONT_WEIGHT: return FxgPackage.CHARACTER_ATTRIBUTES__FONT_WEIGHT;
				case FxgPackage.RICH_TEXT__LINE_HEIGHT: return FxgPackage.CHARACTER_ATTRIBUTES__LINE_HEIGHT;
				case FxgPackage.RICH_TEXT__TEXT_DECORATION: return FxgPackage.CHARACTER_ATTRIBUTES__TEXT_DECORATION;
				case FxgPackage.RICH_TEXT__LINE_THROUGH: return FxgPackage.CHARACTER_ATTRIBUTES__LINE_THROUGH;
				case FxgPackage.RICH_TEXT__COLOR: return FxgPackage.CHARACTER_ATTRIBUTES__COLOR;
				case FxgPackage.RICH_TEXT__TEXT_ALPHA: return FxgPackage.CHARACTER_ATTRIBUTES__TEXT_ALPHA;
				case FxgPackage.RICH_TEXT__WHITE_SPACE_COLLAPSE: return FxgPackage.CHARACTER_ATTRIBUTES__WHITE_SPACE_COLLAPSE;
				case FxgPackage.RICH_TEXT__KERNING: return FxgPackage.CHARACTER_ATTRIBUTES__KERNING;
				case FxgPackage.RICH_TEXT__BACKGROUND_ALPHA: return FxgPackage.CHARACTER_ATTRIBUTES__BACKGROUND_ALPHA;
				case FxgPackage.RICH_TEXT__BACKGROUND_COLOR: return FxgPackage.CHARACTER_ATTRIBUTES__BACKGROUND_COLOR;
				case FxgPackage.RICH_TEXT__BASELINE_SHIFT: return FxgPackage.CHARACTER_ATTRIBUTES__BASELINE_SHIFT;
				case FxgPackage.RICH_TEXT__BREAK_OPPORTUNITY: return FxgPackage.CHARACTER_ATTRIBUTES__BREAK_OPPORTUNITY;
				case FxgPackage.RICH_TEXT__DIGIT_CASE: return FxgPackage.CHARACTER_ATTRIBUTES__DIGIT_CASE;
				case FxgPackage.RICH_TEXT__DIGIT_WIDTH: return FxgPackage.CHARACTER_ATTRIBUTES__DIGIT_WIDTH;
				case FxgPackage.RICH_TEXT__DOMINANT_BASELINE: return FxgPackage.CHARACTER_ATTRIBUTES__DOMINANT_BASELINE;
				case FxgPackage.RICH_TEXT__ALIGNMENT_BASELINE: return FxgPackage.CHARACTER_ATTRIBUTES__ALIGNMENT_BASELINE;
				case FxgPackage.RICH_TEXT__LIGATURE_LEVEL: return FxgPackage.CHARACTER_ATTRIBUTES__LIGATURE_LEVEL;
				case FxgPackage.RICH_TEXT__LOCALE: return FxgPackage.CHARACTER_ATTRIBUTES__LOCALE;
				case FxgPackage.RICH_TEXT__TYPOGRAPHIC_CASE: return FxgPackage.CHARACTER_ATTRIBUTES__TYPOGRAPHIC_CASE;
				case FxgPackage.RICH_TEXT__TEXT_ROTATION: return FxgPackage.CHARACTER_ATTRIBUTES__TEXT_ROTATION;
				case FxgPackage.RICH_TEXT__TRACKING_LEFT: return FxgPackage.CHARACTER_ATTRIBUTES__TRACKING_LEFT;
				case FxgPackage.RICH_TEXT__TRACKING_RIGHT: return FxgPackage.CHARACTER_ATTRIBUTES__TRACKING_RIGHT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ParagraphAttributes.class) {
			switch (baseFeatureID) {
				case FxgPackage.PARAGRAPH_ATTRIBUTES__TEXT_ALIGN: return FxgPackage.RICH_TEXT__TEXT_ALIGN;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__TEXT_ALIGN_LAST: return FxgPackage.RICH_TEXT__TEXT_ALIGN_LAST;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__TEXT_INDENT: return FxgPackage.RICH_TEXT__TEXT_INDENT;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__PARAGRAPH_START_INDENT: return FxgPackage.RICH_TEXT__PARAGRAPH_START_INDENT;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__PARAGRAPH_END_INDENT: return FxgPackage.RICH_TEXT__PARAGRAPH_END_INDENT;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__PARAGRAPH_SPACE_BEFORE: return FxgPackage.RICH_TEXT__PARAGRAPH_SPACE_BEFORE;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__PARAGRAPH_SPACE_AFTER: return FxgPackage.RICH_TEXT__PARAGRAPH_SPACE_AFTER;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__JUSTIFICATION_RULE: return FxgPackage.RICH_TEXT__JUSTIFICATION_RULE;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__JUSTIFICATION_STYLE: return FxgPackage.RICH_TEXT__JUSTIFICATION_STYLE;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__TEXT_JUSTIFY: return FxgPackage.RICH_TEXT__TEXT_JUSTIFY;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__LEADING_MODEL: return FxgPackage.RICH_TEXT__LEADING_MODEL;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__TAB_STOPS: return FxgPackage.RICH_TEXT__TAB_STOPS;
				default: return -1;
			}
		}
		if (baseClass == ContainerAttributes.class) {
			switch (baseFeatureID) {
				case FxgPackage.CONTAINER_ATTRIBUTES__BLOCK_PROGRESSION: return FxgPackage.RICH_TEXT__BLOCK_PROGRESSION;
				case FxgPackage.CONTAINER_ATTRIBUTES__PADDING_LEFT: return FxgPackage.RICH_TEXT__PADDING_LEFT;
				case FxgPackage.CONTAINER_ATTRIBUTES__PADDING_RIGHT: return FxgPackage.RICH_TEXT__PADDING_RIGHT;
				case FxgPackage.CONTAINER_ATTRIBUTES__PADDING_TOP: return FxgPackage.RICH_TEXT__PADDING_TOP;
				case FxgPackage.CONTAINER_ATTRIBUTES__PADDING_BOTTOM: return FxgPackage.RICH_TEXT__PADDING_BOTTOM;
				case FxgPackage.CONTAINER_ATTRIBUTES__COLUMN_GAP: return FxgPackage.RICH_TEXT__COLUMN_GAP;
				case FxgPackage.CONTAINER_ATTRIBUTES__COLUMN_COUNT: return FxgPackage.RICH_TEXT__COLUMN_COUNT;
				case FxgPackage.CONTAINER_ATTRIBUTES__COLUMN_WIDTH: return FxgPackage.RICH_TEXT__COLUMN_WIDTH;
				case FxgPackage.CONTAINER_ATTRIBUTES__FIRST_BASELINE_OFFSET: return FxgPackage.RICH_TEXT__FIRST_BASELINE_OFFSET;
				case FxgPackage.CONTAINER_ATTRIBUTES__VERTICAL_ALIGN: return FxgPackage.RICH_TEXT__VERTICAL_ALIGN;
				case FxgPackage.CONTAINER_ATTRIBUTES__LINE_BREAK: return FxgPackage.RICH_TEXT__LINE_BREAK;
				default: return -1;
			}
		}
		if (baseClass == CharacterAttributes.class) {
			switch (baseFeatureID) {
				case FxgPackage.CHARACTER_ATTRIBUTES__FONT_FAMILY: return FxgPackage.RICH_TEXT__FONT_FAMILY;
				case FxgPackage.CHARACTER_ATTRIBUTES__FONT_SIZE: return FxgPackage.RICH_TEXT__FONT_SIZE;
				case FxgPackage.CHARACTER_ATTRIBUTES__FONT_STYLE: return FxgPackage.RICH_TEXT__FONT_STYLE;
				case FxgPackage.CHARACTER_ATTRIBUTES__FONT_WEIGHT: return FxgPackage.RICH_TEXT__FONT_WEIGHT;
				case FxgPackage.CHARACTER_ATTRIBUTES__LINE_HEIGHT: return FxgPackage.RICH_TEXT__LINE_HEIGHT;
				case FxgPackage.CHARACTER_ATTRIBUTES__TEXT_DECORATION: return FxgPackage.RICH_TEXT__TEXT_DECORATION;
				case FxgPackage.CHARACTER_ATTRIBUTES__LINE_THROUGH: return FxgPackage.RICH_TEXT__LINE_THROUGH;
				case FxgPackage.CHARACTER_ATTRIBUTES__COLOR: return FxgPackage.RICH_TEXT__COLOR;
				case FxgPackage.CHARACTER_ATTRIBUTES__TEXT_ALPHA: return FxgPackage.RICH_TEXT__TEXT_ALPHA;
				case FxgPackage.CHARACTER_ATTRIBUTES__WHITE_SPACE_COLLAPSE: return FxgPackage.RICH_TEXT__WHITE_SPACE_COLLAPSE;
				case FxgPackage.CHARACTER_ATTRIBUTES__KERNING: return FxgPackage.RICH_TEXT__KERNING;
				case FxgPackage.CHARACTER_ATTRIBUTES__BACKGROUND_ALPHA: return FxgPackage.RICH_TEXT__BACKGROUND_ALPHA;
				case FxgPackage.CHARACTER_ATTRIBUTES__BACKGROUND_COLOR: return FxgPackage.RICH_TEXT__BACKGROUND_COLOR;
				case FxgPackage.CHARACTER_ATTRIBUTES__BASELINE_SHIFT: return FxgPackage.RICH_TEXT__BASELINE_SHIFT;
				case FxgPackage.CHARACTER_ATTRIBUTES__BREAK_OPPORTUNITY: return FxgPackage.RICH_TEXT__BREAK_OPPORTUNITY;
				case FxgPackage.CHARACTER_ATTRIBUTES__DIGIT_CASE: return FxgPackage.RICH_TEXT__DIGIT_CASE;
				case FxgPackage.CHARACTER_ATTRIBUTES__DIGIT_WIDTH: return FxgPackage.RICH_TEXT__DIGIT_WIDTH;
				case FxgPackage.CHARACTER_ATTRIBUTES__DOMINANT_BASELINE: return FxgPackage.RICH_TEXT__DOMINANT_BASELINE;
				case FxgPackage.CHARACTER_ATTRIBUTES__ALIGNMENT_BASELINE: return FxgPackage.RICH_TEXT__ALIGNMENT_BASELINE;
				case FxgPackage.CHARACTER_ATTRIBUTES__LIGATURE_LEVEL: return FxgPackage.RICH_TEXT__LIGATURE_LEVEL;
				case FxgPackage.CHARACTER_ATTRIBUTES__LOCALE: return FxgPackage.RICH_TEXT__LOCALE;
				case FxgPackage.CHARACTER_ATTRIBUTES__TYPOGRAPHIC_CASE: return FxgPackage.RICH_TEXT__TYPOGRAPHIC_CASE;
				case FxgPackage.CHARACTER_ATTRIBUTES__TEXT_ROTATION: return FxgPackage.RICH_TEXT__TEXT_ROTATION;
				case FxgPackage.CHARACTER_ATTRIBUTES__TRACKING_LEFT: return FxgPackage.RICH_TEXT__TRACKING_LEFT;
				case FxgPackage.CHARACTER_ATTRIBUTES__TRACKING_RIGHT: return FxgPackage.RICH_TEXT__TRACKING_RIGHT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (textAlign: ");
		result.append(textAlign);
		result.append(", textAlignLast: ");
		result.append(textAlignLast);
		result.append(", textIndent: ");
		result.append(textIndent);
		result.append(", paragraphStartIndent: ");
		result.append(paragraphStartIndent);
		result.append(", paragraphEndIndent: ");
		result.append(paragraphEndIndent);
		result.append(", paragraphSpaceBefore: ");
		result.append(paragraphSpaceBefore);
		result.append(", paragraphSpaceAfter: ");
		result.append(paragraphSpaceAfter);
		result.append(", justificationRule: ");
		result.append(justificationRule);
		result.append(", justificationStyle: ");
		result.append(justificationStyle);
		result.append(", textJustify: ");
		result.append(textJustify);
		result.append(", leadingModel: ");
		result.append(leadingModel);
		result.append(", tabStops: ");
		result.append(tabStops);
		result.append(", blockProgression: ");
		result.append(blockProgression);
		result.append(", paddingLeft: ");
		result.append(paddingLeft);
		result.append(", paddingRight: ");
		result.append(paddingRight);
		result.append(", paddingTop: ");
		result.append(paddingTop);
		result.append(", paddingBottom: ");
		result.append(paddingBottom);
		result.append(", columnGap: ");
		result.append(columnGap);
		result.append(", columnCount: ");
		result.append(columnCount);
		result.append(", columnWidth: ");
		result.append(columnWidth);
		result.append(", firstBaselineOffset: ");
		result.append(firstBaselineOffset);
		result.append(", verticalAlign: ");
		result.append(verticalAlign);
		result.append(", lineBreak: ");
		result.append(lineBreak);
		result.append(", fontFamily: ");
		result.append(fontFamily);
		result.append(", fontSize: ");
		result.append(fontSize);
		result.append(", fontStyle: ");
		result.append(fontStyle);
		result.append(", fontWeight: ");
		result.append(fontWeight);
		result.append(", lineHeight: ");
		result.append(lineHeight);
		result.append(", textDecoration: ");
		result.append(textDecoration);
		result.append(", lineThrough: ");
		result.append(lineThrough);
		result.append(", color: ");
		result.append(color);
		result.append(", textAlpha: ");
		result.append(textAlpha);
		result.append(", whiteSpaceCollapse: ");
		result.append(whiteSpaceCollapse);
		result.append(", kerning: ");
		result.append(kerning);
		result.append(", backgroundAlpha: ");
		result.append(backgroundAlpha);
		result.append(", backgroundColor: ");
		result.append(backgroundColor);
		result.append(", baselineShift: ");
		result.append(baselineShift);
		result.append(", breakOpportunity: ");
		result.append(breakOpportunity);
		result.append(", digitCase: ");
		result.append(digitCase);
		result.append(", digitWidth: ");
		result.append(digitWidth);
		result.append(", dominantBaseline: ");
		result.append(dominantBaseline);
		result.append(", alignmentBaseline: ");
		result.append(alignmentBaseline);
		result.append(", ligatureLevel: ");
		result.append(ligatureLevel);
		result.append(", locale: ");
		result.append(locale);
		result.append(", typographicCase: ");
		result.append(typographicCase);
		result.append(", textRotation: ");
		result.append(textRotation);
		result.append(", trackingLeft: ");
		result.append(trackingLeft);
		result.append(", trackingRight: ");
		result.append(trackingRight);
		result.append(", rotation: ");
		result.append(rotation);
		result.append(", scaleX: ");
		result.append(scaleX);
		result.append(", scaleY: ");
		result.append(scaleY);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", blendMode: ");
		result.append(blendMode);
		result.append(", alpha: ");
		result.append(alpha);
		result.append(", id: ");
		result.append(id);
		result.append(", maskType: ");
		result.append(maskType);
		result.append(", visible: ");
		result.append(visible);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", _tempcontent: ");
		result.append(_tempcontent);
		result.append(')');
		return result.toString();
	}

} //RichTextImpl
