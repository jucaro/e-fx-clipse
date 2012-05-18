package at.bestsolution.efxclipse.tooling.fxml.editors;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.ui.text.java.hover.JavadocHover;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHoverExtension;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocumentRegion;
import org.eclipse.wst.sse.core.internal.provisional.text.ITextRegion;
import org.eclipse.wst.sse.ui.contentassist.CompletionProposalInvocationContext;
import org.eclipse.wst.sse.ui.contentassist.ICompletionProposalComputer;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;
import org.eclipse.wst.xml.ui.internal.contentassist.AbstractXMLCompletionProposalComputer;
import org.eclipse.wst.xml.ui.internal.contentassist.ContentAssistRequest;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher;
import org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher.CamelCase;
import org.eclipse.xtext.ui.editor.hover.IEObjectHover;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;

import at.bestsolution.efxclipse.tooling.model.FXPlugin;
import at.bestsolution.efxclipse.tooling.model.IFXClass;
import at.bestsolution.efxclipse.tooling.model.IFXCollectionProperty;
import at.bestsolution.efxclipse.tooling.model.IFXEnumProperty;
import at.bestsolution.efxclipse.tooling.model.IFXEventHandlerProperty;
import at.bestsolution.efxclipse.tooling.model.IFXObjectProperty;
import at.bestsolution.efxclipse.tooling.model.IFXPrimitiveProperty;
import at.bestsolution.efxclipse.tooling.model.IFXProperty;
import at.bestsolution.efxclipse.tooling.ui.util.IconKeys;

@SuppressWarnings("restriction")
public class FXMLCompletionProposalComputer extends AbstractXMLCompletionProposalComputer implements ICompletionProposalComputer {
	private static final PrefixMatcher MATCHER = new CamelCase();
	public FXMLCompletionProposalComputer() {
		System.err.println("Created proposal provider");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sessionStarted() {
		// TODO Auto-generated method stub

	}

	// @SuppressWarnings("rawtypes")
	// @Override
	// public List
	// computeCompletionProposals(CompletionProposalInvocationContext context,
	// IProgressMonitor monitor) {
	// System.err.println(context);
	// ConfigurableCompletionProposal prop = new
	// ConfigurableCompletionProposal("bla", 0, "bla".length(),
	// context.getInvocationOffset());
	// // CompletionProposal prop = new CompletionProposal("bla", 0,
	// "bla".length(), context.getInvocationOffset());
	//
	// // TODO Auto-generated method stub
	// return Collections.singletonList(prop);
	// }
	//
	// @Override
	// public List computeContextInformation(CompletionProposalInvocationContext
	// context, IProgressMonitor monitor) {
	// System.err.println("Get context infos");
	// // TODO Auto-generated method stub
	// return Collections.emptyList();
	// }

	@Override
	public String getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sessionEnded() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void addAttributeNameProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
		// TODO Auto-generated method stub
		System.err.println("Adding attribiute proposal");

		String typeName = null;
		Node parent = contentAssistRequest.getParent();
		if (parent.getNodeType() == Node.ELEMENT_NODE) {
			typeName = parent.getNodeName();
		}

		if (typeName != null) {
			IType type = findType(typeName, contentAssistRequest, context);
			if( type != null ) {
				IFXClass fxClass = FXPlugin.getClassmodel().findClass(type.getJavaProject(), type);
				for( IFXProperty property : fxClass.getAllProperties().values() ) {
					if( "id".equals(property.getName()) ) {
						
					} else {
						createAttributeNameProposal(contentAssistRequest, context, property);
					}
				}
			}
		}

	}
	
	private void createAttributeNameProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXProperty fxProperty) {
		if( fxProperty.isSetable() ) {
			if( fxProperty instanceof IFXPrimitiveProperty ) {
				createPrimitivePropnameProposal(contentAssistRequest, context, (IFXPrimitiveProperty) fxProperty);
			} else if( fxProperty instanceof IFXEnumProperty ) {
				createEnumPropnameProposals(contentAssistRequest, context, (IFXEnumProperty) fxProperty);
			} else if( fxProperty instanceof IFXEventHandlerProperty ) {
				createEventHandlerPropnameProposals(contentAssistRequest, context, (IFXEventHandlerProperty) fxProperty);
			} else if (fxProperty instanceof IFXObjectProperty) {
				createObjectPropnameProposals(contentAssistRequest, context, (IFXObjectProperty) fxProperty);
			}
		}
	}
	
	private void createEnumPropnameProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXEnumProperty prop) {
		StyledString s = new StyledString(prop.getName() + " : " + prop.getEnumTypeAsString(false));
		s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);
		
		String propValue = prop.getName() + "=\"\"";
		
		FXMLCompletionProposal cp = createAttributeProposal(contentAssistRequest, context, propValue, s);
		if( cp != null ) {
			cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
			cp.setHover(new HoverImpl(prop.getJavaElement()));
			
			contentAssistRequest.addProposal(cp);			
		}
	}
	
	private void createEventHandlerPropnameProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXEventHandlerProperty prop) {
		StyledString s = new StyledString(prop.getName() + " : " + prop.getEventTypeAsString(false));
		s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);
		
		String propValue = prop.getName() + "=\"#\"";
		
		FXMLCompletionProposal cp = createAttributeProposal(contentAssistRequest, context, propValue, s); 
		if( cp != null ) {
			cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
			cp.setHover(new HoverImpl(prop.getJavaElement()));

			contentAssistRequest.addProposal(cp);			
		}
	}
	
	private void createObjectPropnameProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXObjectProperty prop) {
		String type = prop.getElementTypeAsString(true);
		
		// TODO Should we allow other elements because one can use $... to reference elements
		if( "java.lang.Boolean".equals(type) || isIntegerType(type) || isDoubleType(type) || prop.hasValueOf() ) {
			StyledString s = new StyledString(prop.getName() + " : " + prop.getElementTypeAsString(false));
			s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);

			String propValue = prop.getName() + "=\"\"";
			FXMLCompletionProposal cp = createAttributeProposal(contentAssistRequest, context, propValue, s); 
			if( cp != null ) {
				cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
				cp.setHover(new HoverImpl(prop.getJavaElement()));
				
				contentAssistRequest.addProposal(cp);				
			}
		}
	}
	
	private void createPrimitivePropnameProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXPrimitiveProperty fxProperty) {
		String typeName;
		String proposalValue = fxProperty.getName() + "=\"\"";
		switch (fxProperty.getType()) {
		case BOOLEAN:
			typeName = "boolean";
			break;
		case BYTE:
			typeName = "byte";
			break;
		case CHAR:
			typeName = "char";
			break;
		case DOUBLE:
			typeName = "double";
			break;
		case FLOAT:
			typeName = "float";
			break;
		case INTEGER:
			typeName = "integer";
			break;
		case LONG:
			typeName = "long";
			break;
		case SHORT:
			typeName = "short";
			break;
		default:
			typeName = "String";
			proposalValue += "\"\"";
			break;
		}

		StyledString s = new StyledString(fxProperty.getName() + " : " + typeName);
		s.append(" - " + fxProperty.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);
		
		FXMLCompletionProposal cp = createAttributeProposal(contentAssistRequest, context, proposalValue, s);
		if( cp != null ) {
			cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
			cp.setHover(new HoverImpl(fxProperty.getJavaElement()));
			
			contentAssistRequest.addProposal(cp);			
		}
	}
	
	private FXMLCompletionProposal createAttributeProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, String proposalValue, StyledString s) {
		if( MATCHER.isCandidateMatchingPrefix(proposalValue, contentAssistRequest.getMatchString()) ) {
			FXMLCompletionProposal cp = new FXMLCompletionProposal(proposalValue, context.getInvocationOffset()-contentAssistRequest.getMatchString().length(), proposalValue.length(), proposalValue.length()-1, IconKeys.getIcon(IconKeys.FIELD_KEY), s, null);
			cp.setMatcher(new CamelCase());
			return cp;	
		}
		return null;
	}
	
	private FXMLCompletionProposal createElementProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, String proposalValue, StyledString s) {
		if( MATCHER.isCandidateMatchingPrefix(proposalValue, contentAssistRequest.getMatchString()) ) {
			FXMLCompletionProposal cp = new FXMLCompletionProposal(proposalValue, context.getInvocationOffset()-contentAssistRequest.getMatchString().length(), proposalValue.length(), proposalValue.length(), IconKeys.getIcon(IconKeys.FIELD_KEY), s, null);
			cp.setMatcher(new CamelCase());
			return cp;	
		}
		return null;
	}

	@Override
	protected void addTagNameProposals(ContentAssistRequest contentAssistRequest, int childPosition, CompletionProposalInvocationContext context) {
		Node parent = contentAssistRequest.getParent();
		
		if( parent.getNodeType() == Node.ELEMENT_NODE ) {
			if( Character.isUpperCase(parent.getNodeName().charAt(0)) ) {
				IType type = findType(parent.getNodeName(), contentAssistRequest, context);
				if( type != null ) {
					IFXClass fxClass = FXPlugin.getClassmodel().findClass(type.getJavaProject(), type);
					if( fxClass != null ) {
						for( IFXProperty property : fxClass.getAllProperties().values() ) {
							createPropertyElementNameProposal(contentAssistRequest, context, property);
						}
					}
				}
			} else {
				
			}
		}
	}
	
	
	private void createPropertyElementNameProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXProperty fxProperty) {
		if( fxProperty instanceof IFXCollectionProperty ) {
			createListPropertyElementProposal(contentAssistRequest, context, (IFXCollectionProperty) fxProperty);
		} else if( fxProperty instanceof IFXObjectProperty ) {
			
		}
	}
	
	private void createListPropertyElementProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXCollectionProperty prop) {
		StyledString s = new StyledString(prop.getName() + " : " + prop.getCollectionAsString());
		s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);
		
		String propValue = prop.getName() + " ";
		
		FXMLCompletionProposal cp = createElementProposal(contentAssistRequest, context, propValue, s); 
		if( cp != null ) {
			cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
			cp.setHover(new HoverImpl(prop.getJavaElement()));

			contentAssistRequest.addProposal(cp);			
		}
	}
	
	
	
	
	
	
	
	private static boolean isIntegerType(String fqnType) {
		if( "java.lang.Integer".equals(fqnType) ) {
			return true;
		} else if( "java.lang.Long".equals(fqnType) ) {
			return true;
		} else if( "java.lang.Short".equals(fqnType) ) {
			return true;
		} else if( "java.lang.Byte".equals(fqnType) ) {
			return true;
		}
		return false;
	}
	
	private static boolean isDoubleType(String fqnType) {
		if( "java.lang.Float".equals(fqnType) ) {
			return true;
		} else if( "java.lang.Double".equals(fqnType) ) {
			return true;
		}
		return false;
	}

	private IType findType(String name, ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
		Document xmlDoc = contentAssistRequest.getNode().getOwnerDocument();
		NodeList list = xmlDoc.getChildNodes();

		String baseLocation = ((IDOMNode) xmlDoc).getModel().getBaseLocation();
		IFile f = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(baseLocation));
		IProject project = f.getProject();
		IJavaProject jpProject = JavaCore.create(project);

		List<String> imports = new ArrayList<String>();
		for (int i = 0; i < list.getLength(); i++) {
			Node n = list.item(i);
			if (n.getNodeType() == Node.PROCESSING_INSTRUCTION_NODE) {
				String data = ((ProcessingInstruction) n).getData();
				if (data.endsWith("?")) {
					data = data.substring(0, data.length() - 1);
				}
				imports.add(data);
			}
		}

		for (String i : imports) {
			if (i.endsWith("." + name)) {
				try {
					IType t = jpProject.findType(i);
					if( t != null ) {
						return t;
					}
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		for (String i : imports) {
			if (i.endsWith("*")) {
				try {
					IType t = jpProject.findType(i.substring(0,i.length()-1)+name);
					if( t != null ) {
						return t;
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
	protected void addAttributeValueProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
	}

	@Override
	protected void addCommentProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
	}

	@Override
	protected void addEmptyDocumentProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
	}

	@Override
	protected void addEndTagNameProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
	}

	@Override
	protected void addEndTagProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
	}

	@Override
	protected void addPCDATAProposal(String nodeName, ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {

	}

	@Override
	protected void addStartDocumentProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
	}

	@Override
	protected void addTagCloseProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
	}

	@Override
	protected void addTagInsertionProposals(ContentAssistRequest contentAssistRequest, int childPosition, CompletionProposalInvocationContext context) {
	}

	@Override
	protected void addEntityProposals(ContentAssistRequest contentAssistRequest, ITextRegion completionRegion, IDOMNode treeNode, CompletionProposalInvocationContext context) {

	}

	@Override
	protected void addEntityProposals(Vector proposals, Properties map, String key, int nodeOffset, IStructuredDocumentRegion sdRegion, ITextRegion completionRegion, CompletionProposalInvocationContext context) {

	}

	public static class HoverImpl implements IEObjectHover, ITextHoverExtension {
		private JavadocHoverWrapper javadocWrapper = new JavadocHoverWrapper();
		private IJavaElement currentElement;
		
		public HoverImpl(IJavaElement currentElement) {
			this.currentElement = currentElement;
		}
		
		@Override
		public IInformationControlCreator getHoverControlCreator() {
			javadocWrapper.setJavaElement(currentElement);
			return javadocWrapper.getHoverControlCreator();
		}

		@Override
		public Object getHoverInfo(EObject eObject, ITextViewer textViewer, IRegion hoverRegion) {
			javadocWrapper.setJavaElement(currentElement);
			return javadocWrapper.getHoverInfo2(textViewer, hoverRegion);
		}
		
	}
	
	public static class JavadocHoverWrapper extends JavadocHover {
		private IJavaElement currentElement;
		
		public void setJavaElement (IJavaElement element) {
			currentElement = element;
		}
		
		@Override
		protected IJavaElement[] getJavaElementsAt(ITextViewer textViewer, IRegion hoverRegion) {
			// hack: return previously registered element
			// required as JavadocHover.getHoverInfo(IJavaElement[] elements,...) is private
			return new IJavaElement[] { currentElement };
		}	
	}
}
