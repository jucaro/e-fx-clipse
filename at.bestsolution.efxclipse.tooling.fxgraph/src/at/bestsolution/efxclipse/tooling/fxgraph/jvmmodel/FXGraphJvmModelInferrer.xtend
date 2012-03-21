package at.bestsolution.efxclipse.tooling.fxgraph.jvmmodel

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. 
 * Other Xtend models link against the JVM model rather than the source model. The JVM
 * model elements should be associated with their source element by means of the
 * {@link IJvmModelAssociator}.</p>     
 */
class FXGraphJvmModelInferrer implements IJvmModelInferrer {

//	@Inject 
//	IJvmModelAssociator jvmModelAssociator
//
//   	def dispatch infer(EObject e, IAcceptor<JvmDeclaredType> acceptor, boolean prelinkingPhase) {
//   		
//   	}

	override infer(EObject e, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
		// throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
}
