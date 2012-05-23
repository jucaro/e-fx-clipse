package at.bestsolution.efxclipse.tooling.fxml.editors;

import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextHoverExtension;
import org.eclipse.jface.text.ITextHoverExtension2;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.wst.sse.core.internal.provisional.IndexedRegion;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocument;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocumentRegion;
import org.eclipse.wst.sse.core.internal.provisional.text.ITextRegion;
import org.eclipse.wst.sse.ui.internal.contentassist.ContentAssistUtils;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;
import org.eclipse.wst.xml.core.internal.regions.DOMRegionContext;
import org.eclipse.wst.xml.ui.internal.Logger;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import at.bestsolution.efxclipse.tooling.fxml.editors.FXMLCompletionProposalComputer.JavadocHoverWrapper;
import at.bestsolution.efxclipse.tooling.model.FXPlugin;
import at.bestsolution.efxclipse.tooling.model.IFXClass;
import at.bestsolution.efxclipse.tooling.model.IFXEnumProperty;
import at.bestsolution.efxclipse.tooling.model.IFXProperty;

@SuppressWarnings("restriction")
public class FXMLTextHover implements ITextHover, ITextHoverExtension, ITextHoverExtension2 {
	private JavadocHoverWrapper javadocWrapper = new JavadocHoverWrapper();
	private IJavaElement element;
	
	@Override
	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		return "__DUMMY__";
	}
	
	@Override
	public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
		if ((textViewer == null) || (textViewer.getDocument() == null)) {
			return null;
		}
		
		IStructuredDocumentRegion flatNode = ((IStructuredDocument) textViewer.getDocument()).getRegionAtCharacterOffset(offset);
		ITextRegion region = null;

		if (flatNode != null) {
			region = flatNode.getRegionAtCharacterOffset(offset);
		}

		
		if (region != null) {
			// only supply hoverhelp for tag name, attribute name, or
			// attribute value
			String regionType = region.getType();
			if ((regionType == DOMRegionContext.XML_TAG_NAME) || (regionType == DOMRegionContext.XML_TAG_ATTRIBUTE_NAME) || (regionType == DOMRegionContext.XML_TAG_ATTRIBUTE_VALUE)) {
				try {
					// check if we are at whitespace before or after line
					IRegion line = textViewer.getDocument().getLineInformationOfOffset(offset);
					if ((offset > (line.getOffset())) && (offset < (line.getOffset() + line.getLength()))) {
						// check if we are in region's trailing whitespace
						// (whitespace after relevant info)
						if (offset < flatNode.getTextEndOffset(region)) {
							return new Region(flatNode.getStartOffset(region), region.getTextLength());
						}
					}
				}
				catch (BadLocationException e) {
					Logger.logException(e);
				}
			}
		}
		return null;
	}

	
	private IJavaElement computeTagNameHelp(IDOMNode xmlnode, IDOMNode parentNode, IStructuredDocumentRegion flatNode, ITextRegion region) {
		if( Character.isLowerCase(xmlnode.getNodeName().charAt(0)) ) {
			Node parent = xmlnode.getParentNode();
			IType ownerType = Util.findType(parent.getNodeName(), parent.getOwnerDocument());
			if( ownerType != null ) {
				IFXClass fxClass = FXPlugin.getClassmodel().findClass(ownerType.getJavaProject(), ownerType);
				if( fxClass != null ) {
					IFXProperty p = fxClass.getProperty(xmlnode.getNodeName());
					if( p != null ) {
						return p.getJavaElement();
					}
				}
			}
		} else {
			if( xmlnode.getNodeName().contains(".") ) {
				String[] parts = xmlnode.getNodeName().split("\\.");
				IType ownerType = Util.findType(parts[0], xmlnode.getOwnerDocument());
				if( ownerType != null ) {
					IFXClass fxClass = FXPlugin.getClassmodel().findClass(ownerType.getJavaProject(), ownerType);
					if( fxClass != null ) {
						IFXProperty p = fxClass.getStaticProperty(parts[1]);
						if( p != null ) {
							return p.getJavaElement();
						}
					}
				}
			} else {
				IType ownerType = Util.findType(xmlnode.getNodeName(), xmlnode.getOwnerDocument());
				if( ownerType != null ) {
					IFXClass fxClass = FXPlugin.getClassmodel().findClass(ownerType.getJavaProject(), ownerType);
					if( fxClass != null ) {
						try {
							return Util.findProject(xmlnode.getOwnerDocument()).findType(fxClass.getFQN());
						} catch (JavaModelException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}				
			}
		}
		
		return null;
	}
	
	private IJavaElement computeTagAttNameHelp(IDOMNode xmlnode, IDOMNode parentNode, IStructuredDocumentRegion flatNode, ITextRegion region, int offset) {
		NamedNodeMap m = xmlnode.getAttributes();
		IDOMNode attribute = null;
		if( m != null ) {
			for( int i = 0; i < m.getLength(); i++ ) {
				IDOMNode a = (IDOMNode) m.item(i);
				if( a.contains(offset) ) {
					attribute = a;
				}
			}	
		}
		
		if( attribute != null ) {
			Node parent = xmlnode;
			
			if( attribute.getNodeName().contains(".") ) {
				String[] parts = attribute.getNodeName().split("\\.");
				IType ownerType = Util.findType(parts[0], parent.getOwnerDocument());
				if( ownerType != null ) {
					IFXClass fxClass = FXPlugin.getClassmodel().findClass(ownerType.getJavaProject(), ownerType);
					if( fxClass != null ) {
						IFXProperty p = fxClass.getStaticProperty(parts[1]);
						if( p != null ) {
							return p.getJavaElement();
						}
					}
				}
			} else {
				IType ownerType = Util.findType(parent.getNodeName(), parent.getOwnerDocument());
				if( ownerType != null ) {
					IFXClass fxClass = FXPlugin.getClassmodel().findClass(ownerType.getJavaProject(), ownerType);
					if( fxClass != null ) {
						IFXProperty p = fxClass.getProperty(attribute.getNodeName());
						if( p != null ) {
							return p.getJavaElement();
						}
					}
				}
			}
		}
		
		return null;
	}
	
	private IJavaElement computeTagAttValueHelp(IDOMNode xmlnode, IDOMNode parentNode, IStructuredDocumentRegion flatNode, ITextRegion region, int offset) {
		NamedNodeMap m = xmlnode.getAttributes();
		IDOMNode attribute = null;
		for( int i = 0; i < m.getLength(); i++ ) {
			IDOMNode a = (IDOMNode) m.item(i);
			if( a.contains(offset) ) {
				attribute = a;
			}
		}
		
		if( attribute != null ) {
			Node parent = xmlnode;
			IFXProperty p = null;
			
			if( attribute.getNodeName().contains(".") ) {
				String[] parts = attribute.getNodeName().split("\\.");
				IType ownerType = Util.findType(parts[0], parent.getOwnerDocument());
				if( ownerType != null ) {
					IFXClass fxClass = FXPlugin.getClassmodel().findClass(ownerType.getJavaProject(), ownerType);
					if( fxClass != null ) {
						p = fxClass.getStaticProperty(parts[1]);
						
					}
				}
			} else {
				IType ownerType = Util.findType(parent.getNodeName(), parent.getOwnerDocument());
				if( ownerType != null ) {
					IFXClass fxClass = FXPlugin.getClassmodel().findClass(ownerType.getJavaProject(), ownerType);
					if( fxClass != null ) {
						p = fxClass.getProperty(attribute.getNodeName());
						
					}
				}
			}
			
			if( p instanceof IFXEnumProperty ) {
				IType t = ((IFXEnumProperty) p).getEnumType();
				try {
					for (IField f : t.getFields()) {
						if (Flags.isEnum(f.getFlags())) {
							if( f.getElementName().equals(attribute.getNodeValue()) ) {
								return f;
							}
						}
					}
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return null;
	}
	
	
	@Override
	public IInformationControlCreator getHoverControlCreator() {
		if( element != null ) {
			javadocWrapper.setJavaElement(element);
			return javadocWrapper.getHoverControlCreator();
		}
		return null;
	}

	@Override
	public Object getHoverInfo2(ITextViewer textViewer, IRegion hoverRegion) {
		if ((hoverRegion == null) || (textViewer == null) || (textViewer.getDocument() == null)) {
			return null;
		}
		
		element = null;

		int documentOffset = hoverRegion.getOffset();
		
		IndexedRegion treeNode = ContentAssistUtils.getNodeAt(textViewer, documentOffset);
		if (treeNode == null) {
			return null;
		}
		Node node = (Node) treeNode;
		
		while ((node != null) && (node.getNodeType() == Node.TEXT_NODE) && (node.getParentNode() != null)) {
			node = node.getParentNode();
		}
		IDOMNode parentNode = (IDOMNode) node;
		
		IStructuredDocumentRegion flatNode = ((IStructuredDocument) textViewer.getDocument()).getRegionAtCharacterOffset(documentOffset);
		
		if (flatNode != null) {
			ITextRegion region = flatNode.getRegionAtCharacterOffset(documentOffset);
			if (region != null) {
				String regionType = region.getType();
				if (regionType == DOMRegionContext.XML_TAG_NAME) {
					element = computeTagNameHelp((IDOMNode) treeNode, parentNode, flatNode, region);
				}
				else if (regionType == DOMRegionContext.XML_TAG_ATTRIBUTE_NAME) {
					element = computeTagAttNameHelp((IDOMNode) treeNode, parentNode, flatNode, region, documentOffset);
				}
				else if (regionType == DOMRegionContext.XML_TAG_ATTRIBUTE_VALUE) {
					element = computeTagAttValueHelp((IDOMNode) treeNode, parentNode, flatNode, region, documentOffset);
				}
			}
		}
		
		
		if( element != null ) {
			javadocWrapper.setJavaElement(element);
			return javadocWrapper.getHoverInfo2(textViewer, hoverRegion);
		}
		return null;
	}

}
