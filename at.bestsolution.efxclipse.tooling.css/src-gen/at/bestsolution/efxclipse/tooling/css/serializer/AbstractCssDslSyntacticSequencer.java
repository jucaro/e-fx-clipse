package at.bestsolution.efxclipse.tooling.css.serializer;

import at.bestsolution.efxclipse.tooling.css.services.CssDslGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractCssDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CssDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_charset_CHARSETKeyword_0_1_or_CharsetKeyword_0_0;
	protected AbstractElementAlias match_function_HyphenMinusKeyword_0_q;
	protected AbstractElementAlias match_function_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_function_WSTerminalRuleCall_5_a;
	protected AbstractElementAlias match_importExpression_IMPORTKeyword_0_0_1_or_ImportKeyword_0_0_0;
	protected AbstractElementAlias match_media_MEDIAKeyword_0_1_or_MediaKeyword_0_0;
	protected AbstractElementAlias match_page_PAGEKeyword_1_1_or_PageKeyword_1_0;
	protected AbstractElementAlias match_page_SemicolonKeyword_5_0_a;
	protected AbstractElementAlias match_page_SemicolonKeyword_5_0_p;
	protected AbstractElementAlias match_selector_WSTerminalRuleCall_1_1_0_a;
	protected AbstractElementAlias match_selector_WSTerminalRuleCall_1_1_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CssDslGrammarAccess) access;
		match_charset_CHARSETKeyword_0_1_or_CharsetKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCharsetAccess().getCHARSETKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getCharsetAccess().getCharsetKeyword_0_0()));
		match_function_HyphenMinusKeyword_0_q = new TokenAlias(false, true, grammarAccess.getFunctionAccess().getHyphenMinusKeyword_0());
		match_function_WSTerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getFunctionAccess().getWSTerminalRuleCall_3());
		match_function_WSTerminalRuleCall_5_a = new TokenAlias(true, true, grammarAccess.getFunctionAccess().getWSTerminalRuleCall_5());
		match_importExpression_IMPORTKeyword_0_0_1_or_ImportKeyword_0_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getImportExpressionAccess().getIMPORTKeyword_0_0_1()), new TokenAlias(false, false, grammarAccess.getImportExpressionAccess().getImportKeyword_0_0_0()));
		match_media_MEDIAKeyword_0_1_or_MediaKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMediaAccess().getMEDIAKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getMediaAccess().getMediaKeyword_0_0()));
		match_page_PAGEKeyword_1_1_or_PageKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPageAccess().getPAGEKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getPageAccess().getPageKeyword_1_0()));
		match_page_SemicolonKeyword_5_0_a = new TokenAlias(true, true, grammarAccess.getPageAccess().getSemicolonKeyword_5_0());
		match_page_SemicolonKeyword_5_0_p = new TokenAlias(true, false, grammarAccess.getPageAccess().getSemicolonKeyword_5_0());
		match_selector_WSTerminalRuleCall_1_1_0_a = new TokenAlias(true, true, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0());
		match_selector_WSTerminalRuleCall_1_1_0_p = new TokenAlias(true, false, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOperatorRule())
			return getoperatorToken(semanticObject, ruleCall, node);
		return "";
	}
	
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	protected String getoperatorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "/";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_charset_CHARSETKeyword_0_1_or_CharsetKeyword_0_0.equals(syntax))
				emit_charset_CHARSETKeyword_0_1_or_CharsetKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_function_HyphenMinusKeyword_0_q.equals(syntax))
				emit_function_HyphenMinusKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_function_WSTerminalRuleCall_3_a.equals(syntax))
				emit_function_WSTerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_function_WSTerminalRuleCall_5_a.equals(syntax))
				emit_function_WSTerminalRuleCall_5_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_importExpression_IMPORTKeyword_0_0_1_or_ImportKeyword_0_0_0.equals(syntax))
				emit_importExpression_IMPORTKeyword_0_0_1_or_ImportKeyword_0_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_media_MEDIAKeyword_0_1_or_MediaKeyword_0_0.equals(syntax))
				emit_media_MEDIAKeyword_0_1_or_MediaKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_page_PAGEKeyword_1_1_or_PageKeyword_1_0.equals(syntax))
				emit_page_PAGEKeyword_1_1_or_PageKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_page_SemicolonKeyword_5_0_a.equals(syntax))
				emit_page_SemicolonKeyword_5_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_page_SemicolonKeyword_5_0_p.equals(syntax))
				emit_page_SemicolonKeyword_5_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_selector_WSTerminalRuleCall_1_1_0_a.equals(syntax))
				emit_selector_WSTerminalRuleCall_1_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_selector_WSTerminalRuleCall_1_1_0_p.equals(syntax))
				emit_selector_WSTerminalRuleCall_1_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '@CHARSET' | '@charset'
	 */
	protected void emit_charset_CHARSETKeyword_0_1_or_CharsetKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '-'?
	 */
	protected void emit_function_HyphenMinusKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_function_WSTerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_function_WSTerminalRuleCall_5_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '@IMPORT' | '@import'
	 */
	protected void emit_importExpression_IMPORTKeyword_0_0_1_or_ImportKeyword_0_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '@media' | '@MEDIA'
	 */
	protected void emit_media_MEDIAKeyword_0_1_or_MediaKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '@page' | '@PAGE'
	 */
	protected void emit_page_PAGEKeyword_1_1_or_PageKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'*
	 */
	protected void emit_page_SemicolonKeyword_5_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'+
	 */
	protected void emit_page_SemicolonKeyword_5_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_selector_WSTerminalRuleCall_1_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_selector_WSTerminalRuleCall_1_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
