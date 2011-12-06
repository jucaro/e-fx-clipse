package at.bestsolution.efxclipse.tooling.fxml.editors.completion;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposalExtension6;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;

import at.bestsolution.efxclipse.tooling.fxgraph.ui.util.JDTHelper;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.util.JDTHelper.PrimitivValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.util.JDTHelper.Property;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.util.JDTHelper.TypeData;
import at.bestsolution.efxclipse.tooling.fxml.editors.FXMLEditor;

public class AttributeCompletionProcessor implements IContentAssistProcessor {
	private final FXMLEditor editor;
	private final JDTHelper helper;
	
	static class ContextData {
		String elementName;
		String attributeName;
		String attributePrefix;
	}

	static class ExtendedCompleteProposal implements ICompletionProposal, ICompletionProposalExtension6 {
		private final CompletionProposal orginal;
		private StyledString displayString;
		
		public ExtendedCompleteProposal(CompletionProposal original, StyledString displayString) {
			this.orginal = original;
			this.displayString = displayString;
		}
		
		@Override
		public StyledString getStyledDisplayString() {
			return displayString;
		}

		@Override
		public void apply(IDocument document) {
			orginal.apply(document);
		}

		@Override
		public Point getSelection(IDocument document) {
			return orginal.getSelection(document);
		}

		@Override
		public String getAdditionalProposalInfo() {
			return orginal.getAdditionalProposalInfo();
		}

		@Override
		public String getDisplayString() {
			return displayString.getString();
		}

		@Override
		public Image getImage() {
			return orginal.getImage();
		}

		@Override
		public IContextInformation getContextInformation() {
			return orginal.getContextInformation();
		}
	}
	
	public AttributeCompletionProcessor(FXMLEditor editor) {
		this.editor = editor;
		this.helper = new JDTHelper();
	}

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer,
			int offset) {
		
		IDocument document = viewer.getDocument();
		IJavaProject jProject = getProject();

		if (jProject != null) {
			String elementName = extractElementname(document, offset);
			List<ICompletionProposal> rv = new ArrayList<ICompletionProposal>();
			
			String prefix = "";
			try {
				if( !Character.isWhitespace(document.getChar(offset-1)) ) {
					prefix = " ";
				}
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (elementName != null) {
				IType type = toJavaClass(elementName, document, jProject);
				if (type != null) {
					TypeData typeData = helper.getTypeData(jProject, type);
					if( typeData != null ) {
						for( Property p : typeData.properties ) {
							if( p instanceof PrimitivValueProperty ) {
								String replacement = prefix + p.name + "=\"\"";
								rv.add(new ExtendedCompleteProposal(new CompletionProposal(replacement, offset, 0, replacement.length()-1, p.getIcon(), p.name, null, null),p.getDescription()));
							}
						}
					}
				}
			}
			return rv.toArray(new ICompletionProposal[0]);
		}

		return new ICompletionProposal[0];
	}
	
//	private ContextData calculateContextData(IDocument document, int offset) {
//		try {
//			int line = document.getLineOfOffset(offset);
//			int lineStart = document.getLineOffset(line);
//			
//			ContextData data = new ContextData();
//			
//			data.elementName = extractElementname(document, offset);
//			
//			boolean isEscaped = false;
//			boolean insideAttributeContent = false;
//			
//			String attributeName = "";
//			// Search for the element start
//			for( int i = lineStart; i < offset; i++ ) {
//				char c = document.getChar(i);
//				if( c == '"' || c == '\'' ) {
//					if( ! isEscaped ) {
//						insideAttributeContent = !insideAttributeContent;
//					}
//				} else if( Character.isWhitespace(c) ) {
//					attributeName = "";
//				} else if( ! insideAttributeContent ) {
//					attributeName += c;
//				}
//				
//				isEscaped = false;
//				
//				if( c == '\\' ) {
//					isEscaped = true;
//				}
//			}
//			
//			if( !attributeName.isEmpty() && !Character.isUpperCase(attributeName.charAt(0)) ) {
//				if( insideAttributeContent ) {
//					data.attributeName = attributeName;
//				}	
//			}
//			
//		} catch (BadLocationException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		return null;
//	}
//	
//	private String getCurrentPrefix(IDocument document, int offset) {
//		int count = 0;
//		
//		for (int n = offset - 1; n >= 0; n--) {
//			try {
//				char c = document.getChar(n);
//				if( Character.isWhitespace(c) ) {
//					return document.get(n, count);
//				} else if( c == '<' || c == '"' || c == '\'' ) {
//					// We hit the start of the element or another attribute
//					return null;
//				}
//				count++;
//			} catch (BadLocationException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		return null;
//	}

	private IJavaProject getProject() {
		URI uri = EditUIUtil.getURI(editor.getEditorInput());

		if (uri != null) {
			IProject p = ResourcesPlugin.getWorkspace().getRoot()
					.getProject(uri.segment(1));
			if (p != null && p.exists()) {
				return JavaCore.create(p);
			}
		}

		return null;
	}

	private IType toJavaClass(String name, IDocument document,
			IJavaProject jProject) {
		IType type = null;

		for (String imp : getImports(document)) {
			if (imp.endsWith("*")) {
				try {
					IType t = jProject.findType(imp.substring(0,
							imp.length() - 1) + name);
					if (t != null) {
						return t;
					}
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				if (imp.endsWith(name)) {
					try {
						IType t = jProject.findType(imp);
						if (t != null) {
							return t;
						}
					} catch (JavaModelException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

		return type;
	}

	private List<String> getImports(IDocument document) {
		List<String> imports = new ArrayList<String>();

		for (int i = 0; i < document.getNumberOfLines(); i++) {
			try {
				String c = document.get(document.getLineOffset(i),
						document.getLineLength(i)).trim();
				if (c.startsWith("<?import ")) {
					imports.add(c.substring("<?import ".length(),
							c.length() - 2).trim());
				}
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return imports;
	}

	private String extractElementname(IDocument document, int offset) {
		for (int n = offset - 1; n >= 0; n--) {
			try {
				if (document.getChar(n) == '<') {
					int count = 0;
					for (int m = n + 1; m < document.getLength(); m++) {
						count++;
						if (Character.isWhitespace(document.getChar(m))) {
							return document.get(n + 1, count - 1);
						}
					}
				}
			} catch (BadLocationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return null;
	}

	@Override
	public IContextInformation[] computeContextInformation(ITextViewer viewer,
			int offset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] getCompletionProposalAutoActivationCharacters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] getContextInformationAutoActivationCharacters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContextInformationValidator getContextInformationValidator() {
		// TODO Auto-generated method stub
		return null;
	}
}
