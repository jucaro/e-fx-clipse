package at.bestsolution.efxclipse.tooling.fxmlx.ui.labeling;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.AttributePropertyDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ElementDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.EmptyElementDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction;


public class FXMLDslHighlightingCalculator implements ISemanticHighlightingCalculator {
	
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if( resource == null ) {
			return;
		}
		
		TreeIterator<EObject> it = EcoreUtil.getAllContents(resource, true);
		
		while( it.hasNext() ) {
			EObject o = it.next();
			
			if( o instanceof ElementDefinition ) {
				if( o instanceof EmptyElementDefinition ) {
					ICompositeNode n = NodeModelUtils.getNode(o);
					EmptyElementDefinition def = (EmptyElementDefinition) o;
					
					if( def.getName() != null ) {
						acceptor.addPosition(n.getOffset(),(def.getNamespace() != null ? def.getNamespace().length() + 1 : 0 ) + def.getName().length()+1,FXMLDslHighlightingConfiguration.ELEMENT);	
						acceptor.addPosition(n.getOffset() + n.getLength() -2,2,FXMLDslHighlightingConfiguration.ELEMENT);
					}
				} else if( o instanceof ContainerElementDefinition ) {
					ContainerElementDefinition def = (ContainerElementDefinition) o;
					ICompositeNode n = NodeModelUtils.getNode(o);
					
					if( def.getName() != null ) {
						acceptor.addPosition(n.getOffset(),(def.getNamespace() != null ? def.getNamespace().length() + 1 : 0 ) + def.getName().length()+1,FXMLDslHighlightingConfiguration.ELEMENT);	
					}
					
					if( def.getEndname() != null ) {
						acceptor.addPosition(n.getOffset() + n.getLength() - (def.getNamespace() != null ? def.getNamespace().length() + 1 : 0 ) - def.getEndname().length()-3, (def.getNamespace() != null ? def.getNamespace().length() + 1 : 0 ) + def.getEndname().length()+3,FXMLDslHighlightingConfiguration.ELEMENT);
					}					
				}
			} else if( o instanceof ProcessingInstruction ) {
				ICompositeNode n = NodeModelUtils.getNode(o);
				acceptor.addPosition(n.getOffset(), n.getLength(), FXMLDslHighlightingConfiguration.PROCESSINGINSTR);
			} else if( o instanceof AttributePropertyDefinition ) {
				AttributePropertyDefinition def = (AttributePropertyDefinition) o;
				ICompositeNode n = NodeModelUtils.getNode(o);
				
				String totalName = def.getNamespace() == null ? def.getName() : def.getNamespace() + ":" + def.getName();
				
				acceptor.addPosition(n.getOffset(), totalName.length() + 1, FXMLDslHighlightingConfiguration.ATTRIBUTENAME);
				
			}
			
//			if( o instanceof css_generic_declaration ) {
//				css_generic_declaration dec = (css_generic_declaration) o;
//				if( dec.getProperty() != null && dec.getProperty().trim().length() > 0 ) {
//					ICompositeNode n = NodeModelUtils.getNode(dec);
//					if( n.hasChildren() ) {
//						acceptor.addPosition(n.getFirstChild().getOffset(), n.getFirstChild().getLength(), CssDslHighlightingConfiguration.DECLARATIONNAME);
//					}	
//				}
//			} else if( o instanceof simple_selector ) {
//				simple_selector sec = (simple_selector) o;
//				ICompositeNode n = NodeModelUtils.getNode(sec);
//				
////				System.err.println(n.getOffset() + " => " + n.getText().trim().length());
//				
//				acceptor.addPosition(n.getOffset(), n.getText().trim().length(), CssDslHighlightingConfiguration.SELECTOR);
//			}
		}
	}
}