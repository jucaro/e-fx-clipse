package at.bestsolution.efxclipse.tooling.fxgraph.ui.hover;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.ui.text.java.hover.JavadocHover;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.util.jdt.IJavaElementFinder;
import org.eclipse.xtext.xbase.ui.hover.XbaseHoverProvider;

import com.google.inject.Inject;

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.contentassist.FXGraphProposalProvider;

@SuppressWarnings("restriction")
public class FXHoverProvider extends XbaseHoverProvider {
	
//	@Override
//	protected String getFirstLine(EObject o) {
//		if( o instanceof Property ) {
//			return "FIRSTLINE DOCU " + o;
//		}
//		// TODO Auto-generated method stub
//		return super.getFirstLine(o);
//	}
//	
//	@Override
//	protected String getDocumentation(EObject o) {
//		if( o instanceof Property ) {
//			return "DOKU: " + o;
//		}
////		System.err.println("Getting documentation: " + o);
//		return super.getDocumentation(o);
//	}
	
	@Inject
	private IJavaElementFinder javaElementFinder;
	
	private JavadocHoverWrapper javadocHover = new JavadocHoverWrapper ();
	
	@Override
	public IInformationControlCreatorProvider getHoverInfo(EObject object, ITextViewer viewer, IRegion region) {
		if( object instanceof Property ) {
			if( object.eContainer() instanceof Element ) {
				Property property = (Property) object;
				Element element = (Element) object.eContainer();
				
				JvmType t = element.getType().getType();
				IType jdtType = (IType) javaElementFinder.findElementFor(t);
				
				try {
					for( IMethod m : jdtType.getMethods() ) {
						if( m.getElementName().startsWith("set") && property.getName().equals(FXGraphProposalProvider.extractAttributename(m.getElementName())) ) {
							return createHover(m, object, viewer, region);
						}
					}
					
					while (jdtType != null
							&& jdtType.getSuperclassName() != null) {
						jdtType = jdtType.getJavaProject()
								.findType(jdtType.getSuperclassName());
						if (jdtType != null) {
							for( IMethod m : jdtType.getMethods() ) {
								if( m.getElementName().startsWith("set") && property.getName().equals(FXGraphProposalProvider.extractAttributename(m.getElementName())) ) {
									return createHover(m, object, viewer, region);
								}
							}
						}
					}
					
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return super.getHoverInfo(object, viewer, region);
	}
	
	private IInformationControlCreatorProvider createHover(IJavaElement javaElement, EObject eObject, ITextViewer viewer, IRegion region) {
		javadocHover.setJavaElement(javaElement);
		final Object hoverInfo2 = javadocHover.getHoverInfo2(viewer, region);
		return new IInformationControlCreatorProvider() {

			public IInformationControlCreator getHoverControlCreator() {
				return javadocHover.getHoverControlCreator();
			}

			public Object getInfo() {
				return hoverInfo2;
			}
			
		};
	}
	
	@Override
	protected boolean hasHover(EObject o) {
		System.err.println(o);
		return super.hasHover(o);
	}
	
	static class JavadocHoverWrapper extends JavadocHover {

		IJavaElement currentElement;
		
		void setJavaElement (IJavaElement element) {
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
