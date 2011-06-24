package at.bestsolution.efxclipse.tooling.css.ui.highlighting;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector;

public class CssDslHighlightingCalculator implements ISemanticHighlightingCalculator {
	
	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
//		System.err.println("Called hightlighting calc");
		if( resource == null ) {
			return;
		}
		
//		Iterator<INode> allNodes = resource.getParseResult().getRootNode().getAsTreeIterable().iterator();
//		while(allNodes.hasNext()) {
//			INode node = allNodes.next();
//			if (node.getGrammarElement() instanceof CrossReference) {
//				highlightNode(node, CssDslHighlightingConfiguration.CROSS_REF, acceptor);
//			}
//		}

		TreeIterator<Object> it = EcoreUtil.getAllContents(resource, true);
		
		while( it.hasNext() ) {
			Object o = it.next();
			
			if( o instanceof css_generic_declaration ) {
				css_generic_declaration dec = (css_generic_declaration) o;
				if( dec.getProperty() != null && dec.getProperty().trim().length() > 0 ) {
					ICompositeNode n = NodeModelUtils.getNode(dec);
					acceptor.addPosition(n.getOffset(), dec.getProperty().length(), CssDslHighlightingConfiguration.DECLARATIONNAME);	
				}
			} else if( o instanceof simple_selector ) {
				simple_selector sec = (simple_selector) o;
				ICompositeNode n = NodeModelUtils.getNode(sec);
				acceptor.addPosition(n.getOffset(), n.getLength(), CssDslHighlightingConfiguration.SELECTOR);
			} else {
//				System.err.println(o);
			}
		}
	}
	
//	private void highlightNode(INode node, String id, IHighlightedPositionAcceptor acceptor) {
//		if (node == null)
//			return;
//		if (node instanceof ILeafNode) {
//			acceptor.addPosition(node.getOffset(), node.getLength(), id);
//		} else {
//			for(ILeafNode leaf: node.getLeafNodes()) {
//				if (!leaf.isHidden()) {
//					acceptor.addPosition(leaf.getOffset(), leaf.getLength(), id);
//				}
//			}
//		}
//	}
}