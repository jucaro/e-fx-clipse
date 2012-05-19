package at.bestsolution.efxclipse.tooling.fxml.editors;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.TypeNameRequestor;
import org.eclipse.jdt.internal.ui.text.java.hover.JavadocHover;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentRewriteSession;
import org.eclipse.jface.text.DocumentRewriteSessionType;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension4;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHoverExtension;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocumentRegion;
import org.eclipse.wst.sse.core.internal.provisional.text.ITextRegion;
import org.eclipse.wst.sse.ui.contentassist.CompletionProposalInvocationContext;
import org.eclipse.wst.sse.ui.contentassist.ICompletionProposalComputer;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;
import org.eclipse.wst.xml.ui.internal.contentassist.AbstractXMLCompletionProposalComputer;
import org.eclipse.wst.xml.ui.internal.contentassist.ContentAssistRequest;
import org.eclipse.xtext.common.types.xtext.ui.IntersectingJavaSearchScope;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal.IReplacementTextApplier;
import org.eclipse.xtext.ui.editor.contentassist.FQNPrefixMatcher;
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
	private static final CamelCase MATCHER = new CamelCase();
	private static final FQNPrefixMatcher FQN_MATCHER = new FQNPrefixMatcher();
	
	{
		FQN_MATCHER.setLastSegmentFinder(new FQNPrefixMatcher.DefaultLastSegmentFinder());
		FQN_MATCHER.setDelegate(MATCHER);
	}
	
	@Override
	public void sessionStarted() {
	}

	@Override
	public String getErrorMessage() {
		return null;
	}

	@Override
	public void sessionEnded() {
	}

	@Override
	protected void addAttributeNameProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
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
	
	private FXMLCompletionProposal createElementProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, String proposalValue, StyledString s, boolean withEnd, int priority, Image img, PrefixMatcher m) {
		if( m.isCandidateMatchingPrefix(proposalValue, contentAssistRequest.getMatchString()) ) {
			FXMLCompletionProposal cp = new FXMLCompletionProposal(proposalValue, context.getInvocationOffset()-contentAssistRequest.getMatchString().length(), proposalValue.length(), withEnd ? proposalValue.length()/2-1 : proposalValue.length(), img, s, null);
			cp.setPriority(priority);
			cp.setMatcher(m);
			return cp;	
		}
		return null;
	}

	@Override
	protected void addTagNameProposals(ContentAssistRequest contentAssistRequest, int childPosition, CompletionProposalInvocationContext context) {
		Node parent = contentAssistRequest.getParent();
		
		if( parent.getNodeType() == Node.ELEMENT_NODE ) {
			if( Character.isUpperCase(parent.getNodeName().charAt(0)) ) {
				if( !contentAssistRequest.getMatchString().isEmpty() && Character.isUpperCase(contentAssistRequest.getMatchString().charAt(0)) ) {
					IJavaProject jproject = findProject(contentAssistRequest);
					try {
						IType superType = jproject.findType("javafx.scene.Parent");
						if( superType != null ) {
							createSubtypeProposals(contentAssistRequest, context, superType);	
						}
					} catch (JavaModelException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					IJavaProject jproject = findProject(contentAssistRequest);
					try {
						IType superType = jproject.findType("javafx.scene.Parent");
						if( superType != null ) {
							createSubtypeProposals(contentAssistRequest, context, superType);	
						}
					} catch (JavaModelException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					IType type = findType(parent.getNodeName(), contentAssistRequest, context);
					if( type != null ) {
						IFXClass fxClass = FXPlugin.getClassmodel().findClass(type.getJavaProject(), type);
						if( fxClass != null ) {
							for( IFXProperty property : fxClass.getAllProperties().values() ) {
								createPropertyElementNameProposal(contentAssistRequest, context, property);
							}
						}
					}					
				}
			} else {
				createClassElementNameProposal(contentAssistRequest, context);
			}
		}
	}
	
	private void createClassElementNameProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
		Node propertyType = contentAssistRequest.getParent();
		Node elementType = propertyType.getParentNode();
		
		IType type = findType(elementType.getNodeName(), contentAssistRequest, context);
		if( type != null ) {
			IFXClass fxClass = FXPlugin.getClassmodel().findClass(type.getJavaProject(), type);
			if( fxClass != null ) {
				IFXProperty p = fxClass.getProperty(propertyType.getNodeName());
				if( p instanceof IFXObjectProperty ) {
					IFXObjectProperty op = (IFXObjectProperty) p;
					createSubtypeProposals(contentAssistRequest, context, op.getElementType());
				} else if( p instanceof IFXCollectionProperty ) {
					IFXCollectionProperty cp = (IFXCollectionProperty) p;
					createSubtypeProposals(contentAssistRequest, context, cp.getElementType());
				}
			}
		}
	}
	
	
	private void createPropertyElementNameProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXProperty fxProperty) {
		if( fxProperty instanceof IFXCollectionProperty ) {
			createListPropertyElementProposal(contentAssistRequest, context, (IFXCollectionProperty) fxProperty);
		} else if( fxProperty instanceof IFXObjectProperty ) {
			createObjectPropertyElementProposal(contentAssistRequest, context, (IFXObjectProperty) fxProperty);
		}
	}
	
	private void createListPropertyElementProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXCollectionProperty prop) {
		StyledString s = new StyledString(prop.getName() + " : " + prop.getCollectionAsString());
		s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);
		
		String propValue = prop.getName() + "></"+prop.getName()+">";
		
		FXMLCompletionProposal cp = createElementProposal(contentAssistRequest, context, propValue, s, true, 200, IconKeys.getIcon(IconKeys.FIELD_KEY),MATCHER); 
		if( cp != null ) {
			cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
			cp.setHover(new HoverImpl(prop.getJavaElement()));

			contentAssistRequest.addProposal(cp);			
		}
	}
	
	private void createObjectPropertyElementProposal(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context, IFXObjectProperty prop) {
		StyledString s = new StyledString(prop.getName() + " : " + prop.getElementTypeAsString(false));
		s.append(" - " + prop.getFXClass().getSimpleName(), StyledString.QUALIFIER_STYLER);
		
		String propValue = prop.getName() + "></"+prop.getName()+">";
		
		FXMLCompletionProposal cp = createElementProposal(contentAssistRequest, context, propValue, s, true, 200, IconKeys.getIcon(IconKeys.FIELD_KEY),MATCHER); 
		if( cp != null ) {
			cp.setAdditionalProposalInfo(EcoreFactory.eINSTANCE.createEClass());
			cp.setHover(new HoverImpl(prop.getJavaElement()));

			contentAssistRequest.addProposal(cp);			
		}
	}
	
	private void createSubtypeProposals(final ContentAssistRequest contentAssistRequest, final CompletionProposalInvocationContext context, IType superType) {
		IJavaProject jproject = findProject(contentAssistRequest);
		
		try {
			IJavaSearchScope hierarchyScope = SearchEngine.createHierarchyScope(superType);
			IJavaSearchScope projectScope = SearchEngine.createJavaSearchScope(new IJavaElement[] { jproject });
			IJavaSearchScope scope = new IntersectingJavaSearchScope(projectScope, hierarchyScope);
			SearchEngine searchEngine = new SearchEngine();
			
			char[] typeName = null;
			char[] packageName = null;
			if( ! contentAssistRequest.getMatchString().isEmpty()) {
				typeName = contentAssistRequest.getMatchString().toCharArray();
			}
			
			searchEngine.searchAllTypeNames(packageName, SearchPattern.R_PATTERN_MATCH, 
					typeName, SearchPattern.R_PREFIX_MATCH | SearchPattern.R_CAMELCASE_MATCH, 
					IJavaSearchConstants.CLASS, scope, 
					new TypeNameRequestor() {
						@Override
						public void acceptType(int modifiers, char[] packageName, char[] simpleTypeName, char[][] enclosingTypeNames, String path) {
							String sPackageName = new String(packageName);
							int priority = 100;
							if( sPackageName.startsWith("com.sun.javafx") ) {
								priority -= 10; 
							}
							StyledString s = new StyledString(new String(simpleTypeName));
							s.append(" - " + sPackageName, StyledString.QUALIFIER_STYLER);
							FXMLCompletionProposal prop = createElementProposal(contentAssistRequest, context, sPackageName + "." + new String(simpleTypeName) + " ", s, false, priority, IconKeys.getIcon(IconKeys.CLASS_KEY),FQN_MATCHER);
							
							if( prop != null ) {
								prop.setMatcher(FQN_MATCHER);
								prop.setTextApplier(new IReplacementTextApplier() {
									
									@Override
									public void apply(IDocument document, ConfigurableCompletionProposal proposal) throws BadLocationException {
										String proposalReplacementString = proposal.getReplacementString();
										List<String> s = getImportedTypes(contentAssistRequest);
										String shortened = proposalReplacementString.substring(proposalReplacementString.lastIndexOf('.')+1);
										
										if( s.contains(proposalReplacementString.trim()) ) {
											proposal.setCursorPosition(shortened.length());
											document.replace(proposal.getReplacementOffset(), proposal.getReplacementLength(), shortened);
										} else {
											DocumentRewriteSession rewriteSession = null;
											try {
												if (document instanceof IDocumentExtension4) {
													rewriteSession = ((IDocumentExtension4) document).startRewriteSession(DocumentRewriteSessionType.UNRESTRICTED_SMALL);
												}
												
											} finally {
												if (rewriteSession != null) {
													((IDocumentExtension4) document).stopRewriteSession(rewriteSession);
												}
//												if (viewerExtension != null)
//													viewerExtension.setRedraw(true);
											}
											
											boolean startWithLineBreak = true;
											boolean endWithLineBreak = false;
											Document xmlDoc = contentAssistRequest.getNode().getOwnerDocument();
											NodeList list = xmlDoc.getChildNodes();
											int offset = 0;
											List<Node> prs = new ArrayList<Node>();
											for (int i = 0; i < list.getLength(); i++) {
												Node n = list.item(i);
												if (n.getNodeType() == Node.PROCESSING_INSTRUCTION_NODE) {
													prs.add(n);
												}
											}
											
											if( ! prs.isEmpty() ) {
												offset = ((IDOMNode)prs.get(prs.size()-1)).getEndOffset();	
											}
											
											
											offset = Math.min(proposal.getReplacementOffset(), offset);
											proposal.setCursorPosition(shortened.length());
											document.replace(proposal.getReplacementOffset(), proposal.getReplacementLength(), shortened);
											
											String importStatement = (startWithLineBreak ? "\n<?import " : "import ") + proposalReplacementString.trim();
											importStatement += "?>";
											
											if (endWithLineBreak)
												importStatement += "\n\n";
											document.replace(offset, 0, importStatement.toString());
											proposal.setCursorPosition(proposal.getCursorPosition() + importStatement.length());	
											
//											document.replace(proposal.getReplacementOffset(), proposal.getReplacementLength(), proposal.getReplacementString());	
										}
									}
								});
								contentAssistRequest.addProposal(prop);
							}
						}
					}, IJavaSearchConstants.WAIT_UNTIL_READY_TO_SEARCH, new NullProgressMonitor());
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Override
	protected void addStartDocumentProposals(ContentAssistRequest contentAssistRequest, CompletionProposalInvocationContext context) {
		IJavaProject jproject = findProject(contentAssistRequest);
		try {
			IType superType = jproject.findType("javafx.scene.Parent");
			if( superType != null ) {
				createSubtypeProposals(contentAssistRequest, context, superType);
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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

	private IJavaProject findProject(ContentAssistRequest contentAssistRequest) {
		Document xmlDoc = contentAssistRequest.getNode().getOwnerDocument();

		String baseLocation = ((IDOMNode) xmlDoc).getModel().getBaseLocation();
		IFile f = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(baseLocation));
		return JavaCore.create(f.getProject());
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
	
	private List<String> getImportedTypes(ContentAssistRequest contentAssistRequest) {
		Document xmlDoc = contentAssistRequest.getNode().getOwnerDocument();
		NodeList list = xmlDoc.getChildNodes();

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
		return imports;
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
