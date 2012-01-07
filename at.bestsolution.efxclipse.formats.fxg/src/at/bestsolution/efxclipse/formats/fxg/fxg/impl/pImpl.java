/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg.impl;

import at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage;
import at.bestsolution.efxclipse.formats.fxg.fxg.JustificationRule;
import at.bestsolution.efxclipse.formats.fxg.fxg.JustificationStyle;
import at.bestsolution.efxclipse.formats.fxg.fxg.LeadingModel;
import at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes;
import at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContent;
import at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContentContainer;
import at.bestsolution.efxclipse.formats.fxg.fxg.TextAlign;
import at.bestsolution.efxclipse.formats.fxg.fxg.TextJustify;
import at.bestsolution.efxclipse.formats.fxg.fxg.p;

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
 * An implementation of the model object '<em><b>p</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.pImpl#get_children <em>children</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.pImpl#getTextAlign <em>Text Align</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.pImpl#getTextAlignLast <em>Text Align Last</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.pImpl#getTextIndent <em>Text Indent</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.pImpl#getParagraphStartIndent <em>Paragraph Start Indent</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.pImpl#getParagraphEndIndent <em>Paragraph End Indent</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.pImpl#getParagraphSpaceBefore <em>Paragraph Space Before</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.pImpl#getParagraphSpaceAfter <em>Paragraph Space After</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.pImpl#getJustificationRule <em>Justification Rule</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.pImpl#getJustificationStyle <em>Justification Style</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.pImpl#getTextJustify <em>Text Justify</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.pImpl#getLeadingModel <em>Leading Model</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.pImpl#getTabStops <em>Tab Stops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class pImpl extends EObjectImpl implements p {
	/**
	 * The cached value of the '{@link #get_children() <em>children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_children()
	 * @generated
	 * @ordered
	 */
	protected EList<RichTextContent> _children;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected pImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FxgPackage.Literals.P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RichTextContent> get_children() {
		if (_children == null) {
			_children = new EObjectContainmentEList<RichTextContent>(RichTextContent.class, this, FxgPackage.P__CHILDREN);
		}
		return _children;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.P__TEXT_ALIGN, oldTextAlign, textAlign));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.P__TEXT_ALIGN_LAST, oldTextAlignLast, textAlignLast));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.P__TEXT_INDENT, oldTextIndent, textIndent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.P__PARAGRAPH_START_INDENT, oldParagraphStartIndent, paragraphStartIndent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.P__PARAGRAPH_END_INDENT, oldParagraphEndIndent, paragraphEndIndent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.P__PARAGRAPH_SPACE_BEFORE, oldParagraphSpaceBefore, paragraphSpaceBefore));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.P__PARAGRAPH_SPACE_AFTER, oldParagraphSpaceAfter, paragraphSpaceAfter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.P__JUSTIFICATION_RULE, oldJustificationRule, justificationRule));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.P__JUSTIFICATION_STYLE, oldJustificationStyle, justificationStyle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.P__TEXT_JUSTIFY, oldTextJustify, textJustify));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.P__LEADING_MODEL, oldLeadingModel, leadingModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.P__TAB_STOPS, oldTabStops, tabStops));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FxgPackage.P__CHILDREN:
				return ((InternalEList<?>)get_children()).basicRemove(otherEnd, msgs);
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
			case FxgPackage.P__CHILDREN:
				return get_children();
			case FxgPackage.P__TEXT_ALIGN:
				return getTextAlign();
			case FxgPackage.P__TEXT_ALIGN_LAST:
				return getTextAlignLast();
			case FxgPackage.P__TEXT_INDENT:
				return getTextIndent();
			case FxgPackage.P__PARAGRAPH_START_INDENT:
				return getParagraphStartIndent();
			case FxgPackage.P__PARAGRAPH_END_INDENT:
				return getParagraphEndIndent();
			case FxgPackage.P__PARAGRAPH_SPACE_BEFORE:
				return getParagraphSpaceBefore();
			case FxgPackage.P__PARAGRAPH_SPACE_AFTER:
				return getParagraphSpaceAfter();
			case FxgPackage.P__JUSTIFICATION_RULE:
				return getJustificationRule();
			case FxgPackage.P__JUSTIFICATION_STYLE:
				return getJustificationStyle();
			case FxgPackage.P__TEXT_JUSTIFY:
				return getTextJustify();
			case FxgPackage.P__LEADING_MODEL:
				return getLeadingModel();
			case FxgPackage.P__TAB_STOPS:
				return getTabStops();
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
			case FxgPackage.P__CHILDREN:
				get_children().clear();
				get_children().addAll((Collection<? extends RichTextContent>)newValue);
				return;
			case FxgPackage.P__TEXT_ALIGN:
				setTextAlign((TextAlign)newValue);
				return;
			case FxgPackage.P__TEXT_ALIGN_LAST:
				setTextAlignLast((TextAlign)newValue);
				return;
			case FxgPackage.P__TEXT_INDENT:
				setTextIndent((Double)newValue);
				return;
			case FxgPackage.P__PARAGRAPH_START_INDENT:
				setParagraphStartIndent((String)newValue);
				return;
			case FxgPackage.P__PARAGRAPH_END_INDENT:
				setParagraphEndIndent((String)newValue);
				return;
			case FxgPackage.P__PARAGRAPH_SPACE_BEFORE:
				setParagraphSpaceBefore((String)newValue);
				return;
			case FxgPackage.P__PARAGRAPH_SPACE_AFTER:
				setParagraphSpaceAfter((String)newValue);
				return;
			case FxgPackage.P__JUSTIFICATION_RULE:
				setJustificationRule((JustificationRule)newValue);
				return;
			case FxgPackage.P__JUSTIFICATION_STYLE:
				setJustificationStyle((JustificationStyle)newValue);
				return;
			case FxgPackage.P__TEXT_JUSTIFY:
				setTextJustify((TextJustify)newValue);
				return;
			case FxgPackage.P__LEADING_MODEL:
				setLeadingModel((LeadingModel)newValue);
				return;
			case FxgPackage.P__TAB_STOPS:
				setTabStops((String)newValue);
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
			case FxgPackage.P__CHILDREN:
				get_children().clear();
				return;
			case FxgPackage.P__TEXT_ALIGN:
				setTextAlign(TEXT_ALIGN_EDEFAULT);
				return;
			case FxgPackage.P__TEXT_ALIGN_LAST:
				setTextAlignLast(TEXT_ALIGN_LAST_EDEFAULT);
				return;
			case FxgPackage.P__TEXT_INDENT:
				setTextIndent(TEXT_INDENT_EDEFAULT);
				return;
			case FxgPackage.P__PARAGRAPH_START_INDENT:
				setParagraphStartIndent(PARAGRAPH_START_INDENT_EDEFAULT);
				return;
			case FxgPackage.P__PARAGRAPH_END_INDENT:
				setParagraphEndIndent(PARAGRAPH_END_INDENT_EDEFAULT);
				return;
			case FxgPackage.P__PARAGRAPH_SPACE_BEFORE:
				setParagraphSpaceBefore(PARAGRAPH_SPACE_BEFORE_EDEFAULT);
				return;
			case FxgPackage.P__PARAGRAPH_SPACE_AFTER:
				setParagraphSpaceAfter(PARAGRAPH_SPACE_AFTER_EDEFAULT);
				return;
			case FxgPackage.P__JUSTIFICATION_RULE:
				setJustificationRule(JUSTIFICATION_RULE_EDEFAULT);
				return;
			case FxgPackage.P__JUSTIFICATION_STYLE:
				setJustificationStyle(JUSTIFICATION_STYLE_EDEFAULT);
				return;
			case FxgPackage.P__TEXT_JUSTIFY:
				setTextJustify(TEXT_JUSTIFY_EDEFAULT);
				return;
			case FxgPackage.P__LEADING_MODEL:
				setLeadingModel(LEADING_MODEL_EDEFAULT);
				return;
			case FxgPackage.P__TAB_STOPS:
				setTabStops(TAB_STOPS_EDEFAULT);
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
			case FxgPackage.P__CHILDREN:
				return _children != null && !_children.isEmpty();
			case FxgPackage.P__TEXT_ALIGN:
				return textAlign != TEXT_ALIGN_EDEFAULT;
			case FxgPackage.P__TEXT_ALIGN_LAST:
				return textAlignLast != TEXT_ALIGN_LAST_EDEFAULT;
			case FxgPackage.P__TEXT_INDENT:
				return TEXT_INDENT_EDEFAULT == null ? textIndent != null : !TEXT_INDENT_EDEFAULT.equals(textIndent);
			case FxgPackage.P__PARAGRAPH_START_INDENT:
				return PARAGRAPH_START_INDENT_EDEFAULT == null ? paragraphStartIndent != null : !PARAGRAPH_START_INDENT_EDEFAULT.equals(paragraphStartIndent);
			case FxgPackage.P__PARAGRAPH_END_INDENT:
				return PARAGRAPH_END_INDENT_EDEFAULT == null ? paragraphEndIndent != null : !PARAGRAPH_END_INDENT_EDEFAULT.equals(paragraphEndIndent);
			case FxgPackage.P__PARAGRAPH_SPACE_BEFORE:
				return PARAGRAPH_SPACE_BEFORE_EDEFAULT == null ? paragraphSpaceBefore != null : !PARAGRAPH_SPACE_BEFORE_EDEFAULT.equals(paragraphSpaceBefore);
			case FxgPackage.P__PARAGRAPH_SPACE_AFTER:
				return PARAGRAPH_SPACE_AFTER_EDEFAULT == null ? paragraphSpaceAfter != null : !PARAGRAPH_SPACE_AFTER_EDEFAULT.equals(paragraphSpaceAfter);
			case FxgPackage.P__JUSTIFICATION_RULE:
				return justificationRule != JUSTIFICATION_RULE_EDEFAULT;
			case FxgPackage.P__JUSTIFICATION_STYLE:
				return justificationStyle != JUSTIFICATION_STYLE_EDEFAULT;
			case FxgPackage.P__TEXT_JUSTIFY:
				return textJustify != TEXT_JUSTIFY_EDEFAULT;
			case FxgPackage.P__LEADING_MODEL:
				return leadingModel != LEADING_MODEL_EDEFAULT;
			case FxgPackage.P__TAB_STOPS:
				return TAB_STOPS_EDEFAULT == null ? tabStops != null : !TAB_STOPS_EDEFAULT.equals(tabStops);
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
		if (baseClass == RichTextContentContainer.class) {
			switch (derivedFeatureID) {
				case FxgPackage.P__CHILDREN: return FxgPackage.RICH_TEXT_CONTENT_CONTAINER__CHILDREN;
				default: return -1;
			}
		}
		if (baseClass == ParagraphAttributes.class) {
			switch (derivedFeatureID) {
				case FxgPackage.P__TEXT_ALIGN: return FxgPackage.PARAGRAPH_ATTRIBUTES__TEXT_ALIGN;
				case FxgPackage.P__TEXT_ALIGN_LAST: return FxgPackage.PARAGRAPH_ATTRIBUTES__TEXT_ALIGN_LAST;
				case FxgPackage.P__TEXT_INDENT: return FxgPackage.PARAGRAPH_ATTRIBUTES__TEXT_INDENT;
				case FxgPackage.P__PARAGRAPH_START_INDENT: return FxgPackage.PARAGRAPH_ATTRIBUTES__PARAGRAPH_START_INDENT;
				case FxgPackage.P__PARAGRAPH_END_INDENT: return FxgPackage.PARAGRAPH_ATTRIBUTES__PARAGRAPH_END_INDENT;
				case FxgPackage.P__PARAGRAPH_SPACE_BEFORE: return FxgPackage.PARAGRAPH_ATTRIBUTES__PARAGRAPH_SPACE_BEFORE;
				case FxgPackage.P__PARAGRAPH_SPACE_AFTER: return FxgPackage.PARAGRAPH_ATTRIBUTES__PARAGRAPH_SPACE_AFTER;
				case FxgPackage.P__JUSTIFICATION_RULE: return FxgPackage.PARAGRAPH_ATTRIBUTES__JUSTIFICATION_RULE;
				case FxgPackage.P__JUSTIFICATION_STYLE: return FxgPackage.PARAGRAPH_ATTRIBUTES__JUSTIFICATION_STYLE;
				case FxgPackage.P__TEXT_JUSTIFY: return FxgPackage.PARAGRAPH_ATTRIBUTES__TEXT_JUSTIFY;
				case FxgPackage.P__LEADING_MODEL: return FxgPackage.PARAGRAPH_ATTRIBUTES__LEADING_MODEL;
				case FxgPackage.P__TAB_STOPS: return FxgPackage.PARAGRAPH_ATTRIBUTES__TAB_STOPS;
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
		if (baseClass == RichTextContentContainer.class) {
			switch (baseFeatureID) {
				case FxgPackage.RICH_TEXT_CONTENT_CONTAINER__CHILDREN: return FxgPackage.P__CHILDREN;
				default: return -1;
			}
		}
		if (baseClass == ParagraphAttributes.class) {
			switch (baseFeatureID) {
				case FxgPackage.PARAGRAPH_ATTRIBUTES__TEXT_ALIGN: return FxgPackage.P__TEXT_ALIGN;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__TEXT_ALIGN_LAST: return FxgPackage.P__TEXT_ALIGN_LAST;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__TEXT_INDENT: return FxgPackage.P__TEXT_INDENT;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__PARAGRAPH_START_INDENT: return FxgPackage.P__PARAGRAPH_START_INDENT;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__PARAGRAPH_END_INDENT: return FxgPackage.P__PARAGRAPH_END_INDENT;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__PARAGRAPH_SPACE_BEFORE: return FxgPackage.P__PARAGRAPH_SPACE_BEFORE;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__PARAGRAPH_SPACE_AFTER: return FxgPackage.P__PARAGRAPH_SPACE_AFTER;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__JUSTIFICATION_RULE: return FxgPackage.P__JUSTIFICATION_RULE;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__JUSTIFICATION_STYLE: return FxgPackage.P__JUSTIFICATION_STYLE;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__TEXT_JUSTIFY: return FxgPackage.P__TEXT_JUSTIFY;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__LEADING_MODEL: return FxgPackage.P__LEADING_MODEL;
				case FxgPackage.PARAGRAPH_ATTRIBUTES__TAB_STOPS: return FxgPackage.P__TAB_STOPS;
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
		result.append(')');
		return result.toString();
	}

} //pImpl
