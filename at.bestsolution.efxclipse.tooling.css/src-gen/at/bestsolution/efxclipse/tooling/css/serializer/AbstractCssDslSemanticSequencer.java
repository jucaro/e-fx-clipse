package at.bestsolution.efxclipse.tooling.css.serializer;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.URLType;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.expr;
import at.bestsolution.efxclipse.tooling.css.cssDsl.function;
import at.bestsolution.efxclipse.tooling.css.cssDsl.media;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset;
import at.bestsolution.efxclipse.tooling.css.cssDsl.selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet;
import at.bestsolution.efxclipse.tooling.css.cssDsl.term;
import at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup;
import at.bestsolution.efxclipse.tooling.css.services.CssDslGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractCssDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected CssDslGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CssDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CssDslPackage.URL_TYPE:
				if(context == grammarAccess.getURLTypeRule()) {
					sequence_URLType_URLType(context, (URLType) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.CSS_GENERIC_DECLARATION:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_generic_declarationRule()) {
					sequence_css_generic_declaration_css_generic_declaration(context, (css_generic_declaration) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.EXPR:
				if(context == grammarAccess.getExprRule()) {
					sequence_expr_expr(context, (expr) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule()) {
					sequence_function_function(context, (function) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.MEDIA:
				if(context == grammarAccess.getMediaRule()) {
					sequence_media_media(context, (media) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.RULESET:
				if(context == grammarAccess.getRulesetRule()) {
					sequence_ruleset_ruleset(context, (ruleset) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.SELECTOR:
				if(context == grammarAccess.getSelectorRule()) {
					sequence_selector_selector(context, (selector) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.SIMPLE_SELECTOR:
				if(context == grammarAccess.getSimple_selectorRule()) {
					sequence_simple_selector_simple_selector(context, (simple_selector) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.STYLESHEET:
				if(context == grammarAccess.getStylesheetRule()) {
					sequence_stylesheet_stylesheet(context, (stylesheet) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.TERM:
				if(context == grammarAccess.getTermRule()) {
					sequence_term_term(context, (term) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.TERM_GROUP:
				if(context == grammarAccess.getTermGroupRule()) {
					sequence_termGroup_termGroup(context, (termGroup) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     url=STRING
	 *
	 * Features:
	 *    url[1, 1]
	 */
	protected void sequence_URLType_URLType(EObject context, URLType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.URL_TYPE__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.URL_TYPE__URL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getURLTypeAccess().getUrlSTRINGTerminalRuleCall_2_0(), semanticObject.getUrl());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (property=css_property expression=expr)
	 *
	 * Features:
	 *    property[1, 1]
	 *    expression[1, 1]
	 */
	protected void sequence_css_generic_declaration_css_generic_declaration(EObject context, css_generic_declaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.CSS_GENERIC_DECLARATION__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.CSS_GENERIC_DECLARATION__PROPERTY));
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.CSS_GENERIC_DECLARATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.CSS_GENERIC_DECLARATION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCss_generic_declarationAccess().getPropertyCss_propertyParserRuleCall_0_0(), semanticObject.getProperty());
		feeder.accept(grammarAccess.getCss_generic_declarationAccess().getExpressionExprParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (termGroups+=termGroup termGroups+=termGroup*)
	 *
	 * Features:
	 *    termGroups[1, *]
	 */
	protected void sequence_expr_expr(EObject context, expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENT expression=expr)
	 *
	 * Features:
	 *    name[1, 1]
	 *    expression[1, 1]
	 */
	protected void sequence_function_function(EObject context, function semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.FUNCTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.FUNCTION__NAME));
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.FUNCTION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.FUNCTION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionAccess().getNameIDENTTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFunctionAccess().getExpressionExprParserRuleCall_4_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (medialist=media_list rulesets+=ruleset*)
	 *
	 * Features:
	 *    medialist[1, 1]
	 *    rulesets[0, *]
	 */
	protected void sequence_media_media(EObject context, media semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (selectors+=selector selectors+=selector* declarations+=css_declaration*)
	 *
	 * Features:
	 *    selectors[1, *]
	 *    declarations[0, *]
	 */
	protected void sequence_ruleset_ruleset(EObject context, ruleset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (simpleselectors+=simple_selector ((combinator=combinator selector=selector) | (combinator=combinator? selector=selector)?)?)
	 *
	 * Features:
	 *    simpleselectors[1, 1]
	 *    combinator[1, 2]
	 *    selector[1, 2]
	 */
	protected void sequence_selector_selector(EObject context, selector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (element=element_name (id+=css_id | class+=css_class | attrib+=css_attrib | pseudoclasses+=css_pseudo)*) | 
	 *         (id+=css_id | class+=css_class | attrib+=css_attrib | pseudoclasses+=css_pseudo)+
	 *     )
	 *
	 * Features:
	 *    element[1, 1]
	 *         MANDATORY_IF_SET id
	 *         MANDATORY_IF_SET class
	 *         MANDATORY_IF_SET attrib
	 *         MANDATORY_IF_SET pseudoclasses
	 *         EXCLUDE_IF_SET id
	 *         EXCLUDE_IF_SET class
	 *         EXCLUDE_IF_SET attrib
	 *         EXCLUDE_IF_SET pseudoclasses
	 *    id[0, *]
	 *    class[0, *]
	 *    attrib[0, *]
	 *    pseudoclasses[0, *]
	 */
	protected void sequence_simple_selector_simple_selector(EObject context, simple_selector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ruleset+=ruleset | media+=media)*
	 *
	 * Features:
	 *    ruleset[0, *]
	 *    media[0, *]
	 */
	protected void sequence_stylesheet_stylesheet(EObject context, stylesheet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     terms+=term+
	 *
	 * Features:
	 *    terms[1, *]
	 */
	protected void sequence_termGroup_termGroup(EObject context, termGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         number=numberTerm | 
	 *         stringValue=STRING | 
	 *         identifier=css_property | 
	 *         url=URLType | 
	 *         function=function | 
	 *         hexColor=HexColor
	 *     )
	 *
	 * Features:
	 *    number[0, 1]
	 *         EXCLUDE_IF_SET stringValue
	 *         EXCLUDE_IF_SET identifier
	 *         EXCLUDE_IF_SET url
	 *         EXCLUDE_IF_SET function
	 *         EXCLUDE_IF_SET hexColor
	 *    stringValue[0, 1]
	 *         EXCLUDE_IF_SET number
	 *         EXCLUDE_IF_SET identifier
	 *         EXCLUDE_IF_SET url
	 *         EXCLUDE_IF_SET function
	 *         EXCLUDE_IF_SET hexColor
	 *    identifier[0, 1]
	 *         EXCLUDE_IF_SET number
	 *         EXCLUDE_IF_SET stringValue
	 *         EXCLUDE_IF_SET url
	 *         EXCLUDE_IF_SET function
	 *         EXCLUDE_IF_SET hexColor
	 *    url[0, 1]
	 *         EXCLUDE_IF_SET number
	 *         EXCLUDE_IF_SET stringValue
	 *         EXCLUDE_IF_SET identifier
	 *         EXCLUDE_IF_SET function
	 *         EXCLUDE_IF_SET hexColor
	 *    function[0, 1]
	 *         EXCLUDE_IF_SET number
	 *         EXCLUDE_IF_SET stringValue
	 *         EXCLUDE_IF_SET identifier
	 *         EXCLUDE_IF_SET url
	 *         EXCLUDE_IF_SET hexColor
	 *    hexColor[0, 1]
	 *         EXCLUDE_IF_SET number
	 *         EXCLUDE_IF_SET stringValue
	 *         EXCLUDE_IF_SET identifier
	 *         EXCLUDE_IF_SET url
	 *         EXCLUDE_IF_SET function
	 */
	protected void sequence_term_term(EObject context, term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
