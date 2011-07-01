package at.bestsolution.efxclipse.tooling.css.serializer;

import at.bestsolution.efxclipse.tooling.css.services.CssDslGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractCssDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CssDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_function_HyphenMinusKeyword_0_q;
	protected AbstractElementAlias match_function_WSTerminalRuleCall_5_a;
	protected AbstractElementAlias match_selector_WSTerminalRuleCall_1_1_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CssDslGrammarAccess) access;
		match_function_HyphenMinusKeyword_0_q = new TokenAlias(true, false, grammarAccess.getFunctionAccess().getHyphenMinusKeyword_0());
		match_function_WSTerminalRuleCall_5_a = new TokenAlias(true, true, grammarAccess.getFunctionAccess().getWSTerminalRuleCall_5());
		match_selector_WSTerminalRuleCall_1_1_0_p = new TokenAlias(false, true, grammarAccess.getSelectorAccess().getWSTerminalRuleCall_1_1_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIDENTRule())
			return getIDENTToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOperatorRule())
			return getoperatorToken(ruleCall, node);
		return "";
	}
	
	protected String getCOMMAToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	protected String getIDENTToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "_";
	}
	protected String getWSToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	protected String getoperatorToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "/";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (!transition.isSyntacticallyAmbiguous())
			return;
		if(match_function_HyphenMinusKeyword_0_q.equals(transition.getAmbiguousSyntax()))
			emit_function_HyphenMinusKeyword_0_q(semanticObject, transition, fromNode, toNode);
		else if(match_function_WSTerminalRuleCall_5_a.equals(transition.getAmbiguousSyntax()))
			emit_function_WSTerminalRuleCall_5_a(semanticObject, transition, fromNode, toNode);
		else if(match_selector_WSTerminalRuleCall_1_1_0_p.equals(transition.getAmbiguousSyntax()))
			emit_selector_WSTerminalRuleCall_1_1_0_p(semanticObject, transition, fromNode, toNode);
		else acceptNodes(transition, fromNode, toNode);
	}

	/**
	 * Syntax:
	 *     '-'?
	 */
	protected void emit_function_HyphenMinusKeyword_0_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_function_WSTerminalRuleCall_5_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
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
