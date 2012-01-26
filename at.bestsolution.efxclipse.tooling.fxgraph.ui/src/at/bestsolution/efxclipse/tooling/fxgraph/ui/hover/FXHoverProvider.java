package at.bestsolution.efxclipse.tooling.fxgraph.ui.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.internal.ui.text.java.hover.JavadocHover;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipse.xtext.common.types.util.jdt.IJavaElementFinder;
import org.eclipse.xtext.xbase.ui.hover.XbaseHoverProvider;

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ControllerHandledValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.util.JDTHelper;

import com.google.inject.Inject;

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
	
	@Inject
	private IJavaProjectProvider javaProjectProvider;
	
	private JavadocHoverWrapper javadocHover = new JavadocHoverWrapper ();
	
	@Override
	public IInformationControlCreatorProvider getHoverInfo(EObject object, ITextViewer viewer, IRegion region) {
		if( object instanceof SimpleValueProperty ) {
			SimpleValueProperty v = (SimpleValueProperty) object;
			if( v.getStringValue() != null ) {
				if( v.eContainer() instanceof StaticValueProperty ) {
					StaticValueProperty sProp = (StaticValueProperty) v.eContainer();
					IType type = getEnumType(sProp);
					if( type != null ) {
						return findFieldJavaDoc(type, v.getStringValue(), object, viewer, region);
					}
				}
			}
		}
		
		if( object instanceof Property ) {
			if( object.eContainer() instanceof Element ) {
				Property property = (Property) object;
				Element element = (Element) object.eContainer();
				
				IInformationControlCreatorProvider rv = handleElementProperty(element, property, object, viewer, region);
				if( rv != null ) {
					return rv;
				}
			}
		} else if( object instanceof ControllerHandledValueProperty ) {
			ControllerHandledValueProperty prop = (ControllerHandledValueProperty) object;
			Model m = (Model) object.eResource().getContents().get(0);
			
			if( m != null ) {
				ComponentDefinition def = m.getComponentDef();
				if( def != null ) {
					if( def.getController() != null ) {
						IInformationControlCreatorProvider rv = findMethodJavaDoc(def.getController().getType(), prop.getMethodname(), object, viewer, region);
						if( rv != null ) {
							return rv;
						}
					}
				}
			}
		} else if( object instanceof Element ) {
			Element element = (Element) object;
			if( element.getName() != null ) {
				Model m = (Model) object.eResource().getContents().get(0);
				
				if( m != null ) {
					ComponentDefinition def = m.getComponentDef();
					if( def.getController() != null ) {
						IType jdtType = (IType) javaElementFinder.findElementFor(def.getController().getType());
						IInformationControlCreatorProvider rv = findFieldJavaDoc(jdtType, element.getName(),object,viewer,region);
						if( rv != null ) {
							return rv; 
						}
					}
				}
			}
		} else if( object instanceof StaticValueProperty ) {
			StaticValueProperty p = (StaticValueProperty) object;
			if( p.getName() != null ) {
				JvmTypeReference typeRef = p.getType();
				if( typeRef != null ) {
					return findMethodJavaDoc(typeRef.getType(), "set" + Character.toUpperCase(p.getName().charAt(0))+p.getName().substring(1), object, viewer, region);
				}
			}
		}
		
		return super.getHoverInfo(object, viewer, region);
	}
	
	private IInformationControlCreatorProvider findFieldJavaDoc(IType jdtType, String fieldname, EObject object, ITextViewer viewer, IRegion region) {
		try {
			for( IField f : jdtType.getFields() ) {
				if( f.getElementName().equals(fieldname) ) {
					return createHover(f, object, viewer, region);
				}
			}
			
			
			while (jdtType != null
					&& jdtType.getSuperclassName() != null) {
				jdtType = jdtType.getJavaProject()
						.findType(jdtType.getSuperclassName());
				if (jdtType != null) {
					for( IField f : jdtType.getFields() ) {
						if( f.getElementName().equals(fieldname) ) {
							return createHover(f, object, viewer, region);
						}
					}
				}
			}
		} catch (JavaModelException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return null;
	}
	
	private IInformationControlCreatorProvider findMethodJavaDoc(JvmType t, String method, EObject object, ITextViewer viewer, IRegion region) {
		IType jdtType = (IType) javaElementFinder.findElementFor(t);
		
		try {
			for( IMethod m : jdtType.getMethods() ) {
				if( m.getElementName().equals(method) ) {
					return createHover(m, object, viewer, region);
				}
			}
			
			while (jdtType != null
					&& jdtType.getSuperclassName() != null) {
				jdtType = jdtType.getJavaProject()
						.findType(jdtType.getSuperclassName());
				if (jdtType != null) {
					for( IMethod m : jdtType.getMethods() ) {
						if( m.getElementName().equals(method) ) {
							return createHover(m, object, viewer, region);
						}
					}
				}
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	private IInformationControlCreatorProvider handleElementProperty(Element element, Property property, EObject object, ITextViewer viewer, IRegion region) {
		JvmType t = element.getType().getType();
		IType originalType = (IType) javaElementFinder.findElementFor(t); 
		IType jdtType = originalType;
		
		try {
			
			// First check if there's a setter
			for( IMethod m : jdtType.getMethods() ) {
				if( m.getElementName().startsWith("set") && property.getName().equals(JDTHelper.extractAttributename(m.getElementName())) ) {
					return createHover(m, object, viewer, region);
				}
			}
			
			while (jdtType != null
					&& jdtType.getSuperclassName() != null) {
				jdtType = jdtType.getJavaProject()
						.findType(jdtType.getSuperclassName());
				if (jdtType != null) {
					for( IMethod m : jdtType.getMethods() ) {
						if( m.getElementName().startsWith("set") && property.getName().equals(JDTHelper.extractAttributename(m.getElementName())) ) {
							return createHover(m, object, viewer, region);
						}
					}
				}
			}
			
			jdtType = originalType;
			
			// Check if there's a getter
			for( IMethod m : jdtType.getMethods() ) {
				if( (m.getElementName().startsWith("get") || m.getElementName().startsWith("is")) && property.getName().equals(JDTHelper.extractAttributename(m.getElementName())) ) {
					return createHover(m, object, viewer, region);
				}
			}
			
			while (jdtType != null
					&& jdtType.getSuperclassName() != null) {
				jdtType = jdtType.getJavaProject()
						.findType(jdtType.getSuperclassName());
				if (jdtType != null) {
					for( IMethod m : jdtType.getMethods() ) {
						if( (m.getElementName().startsWith("get") || m.getElementName().startsWith("is")) && property.getName().equals(JDTHelper.extractAttributename(m.getElementName())) ) {
							return createHover(m, object, viewer, region);
						}
					}
				}
			}
			
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
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
		if( o instanceof SimpleValueProperty ) {
			SimpleValueProperty v = (SimpleValueProperty) o;
			if( v.getStringValue() != null ) {
				if( v.eContainer() instanceof StaticValueProperty ) {
					StaticValueProperty sProp = (StaticValueProperty) v.eContainer();
					return getEnumType(sProp) != null;
				}
			}
		}
		return super.hasHover(o);
	}
	
	private IType getEnumType(StaticValueProperty sProp) {
		IType t = (IType) javaElementFinder.findElementFor(sProp.getType().getType());
		String methodName = "set" + Character.toUpperCase(sProp.getName().charAt(0)) + sProp.getName().substring(1);
		try {
			for( IMethod m : t.getMethods() ) {
				if( Flags.isPublic(m.getFlags()) && Flags.isStatic(m.getFlags()) && m.getElementName().endsWith(methodName) && m.getParameterTypes().length == 2 ) {
					String valueType = m.getParameterTypes()[1];
					String fqType = Signature.toString(valueType);
					IJavaProject jp = javaProjectProvider.getJavaProject(sProp.eResource().getResourceSet());
					
					IType type = jp.findType(fqType);
					
					if( type != null ) {
						if( type.isEnum() ) {
							return type;
						}
					}
				}
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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
