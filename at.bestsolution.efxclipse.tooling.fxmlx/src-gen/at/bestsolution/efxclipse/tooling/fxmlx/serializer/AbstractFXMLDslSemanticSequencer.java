package at.bestsolution.efxclipse.tooling.fxmlx.serializer;

import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.AttributePropertyDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.EmptyElementDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.PCData;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.QualifiedNameWithWildCard;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.XMLDec;
import at.bestsolution.efxclipse.tooling.fxmlx.services.FXMLDslGrammarAccess;
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
public class AbstractFXMLDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected FXMLDslGrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == FXMLDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FXMLDslPackage.ATTRIBUTE_PROPERTY_DEFINITION:
				if(context == grammarAccess.getAttributePropertyDefinitionRule()) {
					sequence_AttributePropertyDefinition(context, (AttributePropertyDefinition) semanticObject); 
					return; 
				}
				else break;
			case FXMLDslPackage.CONTAINER_ELEMENT_DEFINITION:
				if(context == grammarAccess.getContainerElementDefinitionRule() ||
				   context == grammarAccess.getElementDefinitionRule()) {
					sequence_ContainerElementDefinition(context, (ContainerElementDefinition) semanticObject); 
					return; 
				}
				else break;
			case FXMLDslPackage.EMPTY_ELEMENT_DEFINITION:
				if(context == grammarAccess.getElementDefinitionRule() ||
				   context == grammarAccess.getEmptyElementDefinitionRule()) {
					sequence_EmptyElementDefinition(context, (EmptyElementDefinition) semanticObject); 
					return; 
				}
				else break;
			case FXMLDslPackage.FXML:
				if(context == grammarAccess.getFXMLRule()) {
					sequence_FXML(context, (FXML) semanticObject); 
					return; 
				}
				else break;
			case FXMLDslPackage.PC_DATA:
				if(context == grammarAccess.getPCDataRule()) {
					sequence_PCData(context, (PCData) semanticObject); 
					return; 
				}
				else break;
			case FXMLDslPackage.PROCESSING_INSTRUCTION:
				if(context == grammarAccess.getProcessingInstructionRule()) {
					sequence_ProcessingInstruction(context, (ProcessingInstruction) semanticObject); 
					return; 
				}
				else break;
			case FXMLDslPackage.QUALIFIED_NAME_WITH_WILD_CARD:
				if(context == grammarAccess.getQualifiedNameWithWildCardRule()) {
					sequence_QualifiedNameWithWildCard(context, (QualifiedNameWithWildCard) semanticObject); 
					return; 
				}
				else break;
			case FXMLDslPackage.XML_DEC:
				if(context == grammarAccess.getXMLDecRule()) {
					sequence_XMLDec(context, (XMLDec) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (namespace=ID? name=QualifiedName value=STRING)
	 */
	protected void sequence_AttributePropertyDefinition(EObject context, AttributePropertyDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         namespace=ID? 
	 *         name=QualifiedName 
	 *         properties+=AttributePropertyDefinition* 
	 *         content=PCData? 
	 *         children+=ElementDefinition* 
	 *         endnamespace=ID? 
	 *         endname=QualifiedName
	 *     )
	 */
	protected void sequence_ContainerElementDefinition(EObject context, ContainerElementDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (namespace=ID? name=QualifiedName props+=AttributePropertyDefinition*)
	 */
	protected void sequence_EmptyElementDefinition(EObject context, EmptyElementDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (xmlDec=XMLDec processingInstructions+=ProcessingInstruction* rootElement=ElementDefinition)
	 */
	protected void sequence_FXML(EObject context, FXML semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     content=Content
	 */
	protected void sequence_PCData(EObject context, PCData semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FXMLDslPackage.Literals.PC_DATA__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FXMLDslPackage.Literals.PC_DATA__CONTENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPCDataAccess().getContentContentParserRuleCall_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=ID importedNamespace=QualifiedNameWithWildCard)
	 */
	protected void sequence_ProcessingInstruction(EObject context, ProcessingInstruction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FXMLDslPackage.Literals.PROCESSING_INSTRUCTION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FXMLDslPackage.Literals.PROCESSING_INSTRUCTION__TYPE));
			if(transientValues.isValueTransient(semanticObject, FXMLDslPackage.Literals.PROCESSING_INSTRUCTION__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FXMLDslPackage.Literals.PROCESSING_INSTRUCTION__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProcessingInstructionAccess().getTypeIDTerminalRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getProcessingInstructionAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_2_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=QualifiedName
	 */
	protected void sequence_QualifiedNameWithWildCard(EObject context, QualifiedNameWithWildCard semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FXMLDslPackage.Literals.QUALIFIED_NAME_WITH_WILD_CARD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FXMLDslPackage.Literals.QUALIFIED_NAME_WITH_WILD_CARD__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQualifiedNameWithWildCardAccess().getValueQualifiedNameParserRuleCall_0_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     props+=AttributePropertyDefinition+
	 */
	protected void sequence_XMLDec(EObject context, XMLDec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
