package at.bestsolution.efxclipse.tooling.css.serializer;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.URLType;
import at.bestsolution.efxclipse.tooling.css.cssDsl.charset;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.expr;
import at.bestsolution.efxclipse.tooling.css.cssDsl.function;
import at.bestsolution.efxclipse.tooling.css.cssDsl.importExpression;
import at.bestsolution.efxclipse.tooling.css.cssDsl.media;
import at.bestsolution.efxclipse.tooling.css.cssDsl.page;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset;
import at.bestsolution.efxclipse.tooling.css.cssDsl.selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet;
import at.bestsolution.efxclipse.tooling.css.cssDsl.sub_selector;
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
					sequence_URLType(context, (URLType) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getImportExpressionRule()) {
					sequence_importExpression(context, (URLType) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.CHARSET:
				if(context == grammarAccess.getCharsetRule()) {
					sequence_charset(context, (charset) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.CSS_GENERIC_DECLARATION:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_generic_declarationRule()) {
					sequence_css_generic_declaration(context, (css_generic_declaration) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.EXPR:
				if(context == grammarAccess.getExprRule()) {
					sequence_expr(context, (expr) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule()) {
					sequence_function(context, (function) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.IMPORT_EXPRESSION:
				if(context == grammarAccess.getImportExpressionRule()) {
					sequence_importExpression(context, (importExpression) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.MEDIA:
				if(context == grammarAccess.getMediaRule()) {
					sequence_media(context, (media) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.PAGE:
				if(context == grammarAccess.getPageRule()) {
					sequence_page(context, (page) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.RULESET:
				if(context == grammarAccess.getRulesetRule()) {
					sequence_ruleset(context, (ruleset) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.SELECTOR:
				if(context == grammarAccess.getSelectorRule()) {
					sequence_selector(context, (selector) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.SIMPLE_SELECTOR:
				if(context == grammarAccess.getSimple_selectorRule()) {
					sequence_simple_selector(context, (simple_selector) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.STYLESHEET:
				if(context == grammarAccess.getStylesheetRule()) {
					sequence_stylesheet(context, (stylesheet) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.SUB_SELECTOR:
				if(context == grammarAccess.getSub_selectorRule()) {
					sequence_sub_selector(context, (sub_selector) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.TERM:
				if(context == grammarAccess.getTermRule()) {
					sequence_term(context, (term) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.TERM_GROUP:
				if(context == grammarAccess.getTermGroupRule()) {
					sequence_termGroup(context, (termGroup) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     url=STRING
	 */
	protected void sequence_URLType(EObject context, URLType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     charset=STRING
	 */
	protected void sequence_charset(EObject context, charset semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.CHARSET__CHARSET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.CHARSET__CHARSET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCharsetAccess().getCharsetSTRINGTerminalRuleCall_1_0(), semanticObject.getCharset());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (property=css_property expression=expr)
	 */
	protected void sequence_css_generic_declaration(EObject context, css_generic_declaration semanticObject) {
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
	 */
	protected void sequence_expr(EObject context, expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDENT expression=expr)
	 */
	protected void sequence_function(EObject context, function semanticObject) {
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
	 *     (url=STRING mediaList=media_list?)
	 */
	protected void sequence_importExpression(EObject context, URLType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_importExpression(EObject context, importExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.IMPORT_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.IMPORT_EXPRESSION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (medialist=media_list rulesets+=ruleset*)
	 */
	protected void sequence_media(EObject context, media semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pseudoPage=pseudo_page? declarations+=css_generic_declaration? declarations+=css_generic_declaration*)
	 */
	protected void sequence_page(EObject context, page semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (selectors+=selector selectors+=selector* declarations+=css_declaration*)
	 */
	protected void sequence_ruleset(EObject context, ruleset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (simpleselectors+=simple_selector ((combinator=combinator selector=selector) | (combinator=combinator? selector=selector)?)?)
	 */
	protected void sequence_selector(EObject context, selector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((element=element_name subSelectors+=sub_selector*) | subSelectors+=sub_selector+)
	 */
	protected void sequence_simple_selector(EObject context, simple_selector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (charset=charset? imports+=importExpression* (ruleset+=ruleset | media+=media | page+=page)*)
	 */
	protected void sequence_stylesheet(EObject context, stylesheet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=css_id | class=css_class | attrib=css_attrib | pseudoclass=css_pseudo)
	 */
	protected void sequence_sub_selector(EObject context, sub_selector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     terms+=term+
	 */
	protected void sequence_termGroup(EObject context, termGroup semanticObject) {
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
	 */
	protected void sequence_term(EObject context, term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
