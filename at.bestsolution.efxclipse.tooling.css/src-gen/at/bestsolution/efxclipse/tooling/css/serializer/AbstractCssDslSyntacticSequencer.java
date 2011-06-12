package at.bestsolution.efxclipse.tooling.css.serializer;

import at.bestsolution.efxclipse.tooling.css.services.CssDslGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractCssDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CssDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_css_generic_declaration_WSTerminalRuleCall_2_a;
	protected AbstractElementAlias match_media_WSTerminalRuleCall_1_a;
	protected AbstractElementAlias match_media_WSTerminalRuleCall_4_a;
	protected AbstractElementAlias match_media_WSTerminalRuleCall_4_p;
	protected AbstractElementAlias match_ruleset_WSTerminalRuleCall_3_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p;
	protected AbstractElementAlias match_ruleset_WSTerminalRuleCall_3_p;
	protected AbstractElementAlias match_ruleset_WSTerminalRuleCall_4_2_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p;
	protected AbstractElementAlias match_selector_WSTerminalRuleCall_1_1_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CssDslGrammarAccess) access;
		match_css_generic_declaration_WSTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getCss_generic_declarationAccess().getWSTerminalRuleCall_2());
		match_media_WSTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getMediaAccess().getWSTerminalRuleCall_1());
		match_media_WSTerminalRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getMediaAccess().getWSTerminalRuleCall_4());
		match_media_WSTerminalRuleCall_4_p = new TokenAlias(false, true, grammarAccess.getMediaAccess().getWSTerminalRuleCall_4());
		match_ruleset_WSTerminalRuleCall_3_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getRulesetAccess().getWSTerminalRuleCall_3()), new TokenAlias(false, false, grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_5()), new TokenAlias(false, true, grammarAccess.getRulesetAccess().getWSTerminalRuleCall_6()));
		match_ruleset_WSTerminalRuleCall_3_p = new TokenAlias(false, true, grammarAccess.getRulesetAccess().getWSTerminalRuleCall_3());
		match_ruleset_WSTerminalRuleCall_4_2_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getRulesetAccess().getWSTerminalRuleCall_4_2()), new TokenAlias(false, false, grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_5()), new TokenAlias(false, true, grammarAccess.getRulesetAccess().getWSTerminalRuleCall_6()));
		match_selector_WSTerminalRuleCall_1_1_0_p = new TokenAlias(false, true, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCombinatorRule())
			return getcombinatorToken(ruleCall, node);
		return "";
	}
	
	protected String getCOMMAToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	protected String getWSToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	protected String getcombinatorToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (!transition.isSyntacticallyAmbiguous())
			return;
		if(match_css_generic_declaration_WSTerminalRuleCall_2_a.equals(transition.getAmbiguousSyntax()))
			emit_css_generic_declaration_WSTerminalRuleCall_2_a(semanticObject, transition, fromNode, toNode);
		else if(match_media_WSTerminalRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_media_WSTerminalRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_media_WSTerminalRuleCall_4_a.equals(transition.getAmbiguousSyntax()))
			emit_media_WSTerminalRuleCall_4_a(semanticObject, transition, fromNode, toNode);
		else if(match_media_WSTerminalRuleCall_4_p.equals(transition.getAmbiguousSyntax()))
			emit_media_WSTerminalRuleCall_4_p(semanticObject, transition, fromNode, toNode);
		else if(match_ruleset_WSTerminalRuleCall_3_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p.equals(transition.getAmbiguousSyntax()))
			emit_ruleset_WSTerminalRuleCall_3_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p(semanticObject, transition, fromNode, toNode);
		else if(match_ruleset_WSTerminalRuleCall_3_p.equals(transition.getAmbiguousSyntax()))
			emit_ruleset_WSTerminalRuleCall_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_ruleset_WSTerminalRuleCall_4_2_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p.equals(transition.getAmbiguousSyntax()))
			emit_ruleset_WSTerminalRuleCall_4_2_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p(semanticObject, transition, fromNode, toNode);
		else if(match_selector_WSTerminalRuleCall_1_1_0_p.equals(transition.getAmbiguousSyntax()))
			emit_selector_WSTerminalRuleCall_1_1_0_p(semanticObject, transition, fromNode, toNode);
		else acceptNodes(transition, fromNode, toNode);
	}

	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_css_generic_declaration_WSTerminalRuleCall_2_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_media_WSTerminalRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_media_WSTerminalRuleCall_4_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_media_WSTerminalRuleCall_4_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* '}' WS+
	 */
	protected void emit_ruleset_WSTerminalRuleCall_3_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_ruleset_WSTerminalRuleCall_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* '}' WS+
	 */
	protected void emit_ruleset_WSTerminalRuleCall_4_2_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_selector_WSTerminalRuleCall_1_1_0_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
}
