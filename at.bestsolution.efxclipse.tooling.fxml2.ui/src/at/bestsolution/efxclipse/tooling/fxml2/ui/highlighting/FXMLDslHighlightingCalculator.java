/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.fxml2.ui.highlighting;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import at.bestsolution.efxclipse.tooling.fxml2.fXML.ClassDefinition;
import at.bestsolution.efxclipse.tooling.fxml2.fXML.ProcessingInstruction;
import at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyAttributeDefinition;
import at.bestsolution.efxclipse.tooling.fxml2.fXML.PropertyDefinition;

public class FXMLDslHighlightingCalculator implements ISemanticHighlightingCalculator {
	
	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if( resource == null ) {
			return;
		}
		
		TreeIterator<EObject> it = EcoreUtil.getAllContents(resource, true);
		
		while( it.hasNext() ) {
			EObject o = it.next();
			
			if( o instanceof ClassDefinition ) {
				ClassDefinition def = (ClassDefinition) o;
				ICompositeNode n = NodeModelUtils.getNode(o);
				
				acceptor.addPosition(n.getOffset(),def.getName().length()+1,FXMLDslHighlightingConfiguration.ELEMENT);
				
				if( def.getEndname() != null ) {
					acceptor.addPosition(n.getOffset() + n.getLength() - def.getEndname().length()-3,def.getEndname().length()+3,FXMLDslHighlightingConfiguration.ELEMENT);
				}
			} else if( o instanceof ProcessingInstruction ) {
				ICompositeNode n = NodeModelUtils.getNode(o);
				acceptor.addPosition(n.getOffset(), n.getLength(), FXMLDslHighlightingConfiguration.PROCESSINGINSTR);
			} else if( o instanceof PropertyDefinition ) {
				PropertyDefinition def = (PropertyDefinition) o;
				ICompositeNode n = NodeModelUtils.getNode(o);
				
				acceptor.addPosition(n.getOffset(), def.getName().length()+2, FXMLDslHighlightingConfiguration.ELEMENT);
				
				if( def.getEndname() != null ) {
					acceptor.addPosition(n.getOffset() + n.getLength() - def.getEndname().length()-3,def.getEndname().length()+3,FXMLDslHighlightingConfiguration.ELEMENT);
				}
			} else if( o instanceof PropertyAttributeDefinition ) {
				PropertyAttributeDefinition def = (PropertyAttributeDefinition) o;
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