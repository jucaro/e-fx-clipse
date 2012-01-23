package at.bestsolution.efxclipse.tooling.fxmlx.ui.hover;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.ui.text.java.hover.JavadocHover;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.util.jdt.IJavaElementFinder;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

import at.bestsolution.efxclipse.tooling.fxgraph.ui.util.JDTHelper;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.AttributePropertyDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ContainerElementDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.EmptyElementDefinition;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXML;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.QualifiedNameWithWildCard;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class FXHoverProvider extends DefaultEObjectHoverProvider {/*extends XbaseHoverProvider {*/

	@Inject
	private IJvmTypeProvider.Factory jvmTypeProviderFactory;

	@Inject
	private IJavaElementFinder elementProvider;

	@Inject
	private IJavaElementFinder javaElementFinder;

	private JavadocHoverWrapper javadocHover = new JavadocHoverWrapper();

	@Override
	public IInformationControlCreatorProvider getHoverInfo(EObject object, ITextViewer viewer, IRegion region) {
		if (object instanceof ContainerElementDefinition || object instanceof EmptyElementDefinition ) {
			String name = null;
			
			if( object instanceof ContainerElementDefinition ) {
				ContainerElementDefinition def = (ContainerElementDefinition) object;
				name = def.getName();	
			} else {
				EmptyElementDefinition def = (EmptyElementDefinition) object;
				name = def.getName();
			}
			
			if (name != null ) {
				if( Character.isUpperCase(name.charAt(0)) ) {
					if( name.contains(".") ) {
						//TODO This is a static definition
					} else {
						JvmType t = toJvmType(name, (FXML) object.eResource().getContents().get(0));
						if( t != null ) {
							return createHover(elementProvider.findElementFor(t), object, viewer, region);
						}
					}
				} else {
					EObject parent = object.eContainer();
					String typeName = null;
					
					if( parent instanceof ContainerElementDefinition ) {
						ContainerElementDefinition def = (ContainerElementDefinition) parent;
						typeName = def.getName();	
					} else if( parent instanceof EmptyElementDefinition ) {
						EmptyElementDefinition def = (EmptyElementDefinition) parent;
						typeName = def.getName();
					}
					
					if( typeName != null ) {
						JvmType type = toJvmType(typeName, (FXML) object.eResource().getContents().get(0));
						if( type != null ) {
							return handleElementProperty(type, name, object, viewer, region);
						}
					}
				}
			}
		} else if( object instanceof QualifiedNameWithWildCard ) {
			QualifiedNameWithWildCard def = (QualifiedNameWithWildCard) object;
			if( def.eContainer() instanceof ProcessingInstruction ) {
				ProcessingInstruction parentDef = (ProcessingInstruction) def.eContainer();
				
				if( "import".equals(parentDef.getType()) ) {
					if( ! def.getValue().endsWith("*") ) {
						JvmType t = jvmTypeProviderFactory.createTypeProvider(def.eResource().getResourceSet()).findTypeByName(def.getValue());
						if( t != null ) {
							return createHover(elementProvider.findElementFor(t), object, viewer, region);
						}
					}
				}	
			}
		} else if( object instanceof AttributePropertyDefinition ) {
			AttributePropertyDefinition def = (AttributePropertyDefinition) object;
			
			if( !def.getName().contains(":") && def.getNamespace() == null ) {
				String name = null;
				if( def.eContainer() instanceof ContainerElementDefinition ) {
					name = ((ContainerElementDefinition)def.eContainer()).getName();
				} else if( def.eContainer() instanceof EmptyElementDefinition ) {
					name = ((EmptyElementDefinition)def.eContainer()).getName();
				}
				
				if( name != null ) {
					JvmType type = toJvmType(name, (FXML) def.eResource().getContents().get(0));
					if( type != null ) {
						return handleElementProperty(type, def.getName(), object, viewer, region);
					}
				}
			}
		}

		return super.getHoverInfo(object, viewer, region);
	}

	private IInformationControlCreatorProvider findFieldJavaDoc(JvmType t, String fieldname, EObject object, ITextViewer viewer, IRegion region) {
		IType jdtType = (IType) javaElementFinder.findElementFor(t);

		try {
			for (IField f : jdtType.getFields()) {
				if (f.getElementName().equals(fieldname)) {
					return createHover(f, object, viewer, region);
				}
			}

			while (jdtType != null && jdtType.getSuperclassName() != null) {
				jdtType = jdtType.getJavaProject().findType(jdtType.getSuperclassName());
				if (jdtType != null) {
					for (IField f : jdtType.getFields()) {
						if (f.getElementName().equals(fieldname)) {
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
			for (IMethod m : jdtType.getMethods()) {
				if (m.getElementName().equals(method)) {
					return createHover(m, object, viewer, region);
				}
			}

			while (jdtType != null && jdtType.getSuperclassName() != null) {
				jdtType = jdtType.getJavaProject().findType(jdtType.getSuperclassName());
				if (jdtType != null) {
					for (IMethod m : jdtType.getMethods()) {
						if (m.getElementName().equals(method)) {
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

	private IInformationControlCreatorProvider handleElementProperty(JvmType type, String propertyName, EObject object, ITextViewer viewer, IRegion region) {
		IType originalType = (IType) javaElementFinder.findElementFor(type);
		IType jdtType = originalType;

		try {

			// First check if there's a setter
			for (IMethod m : jdtType.getMethods()) {
				if (m.getElementName().startsWith("set") && propertyName.equals(JDTHelper.extractAttributename(m.getElementName()))) {
					return createHover(m, object, viewer, region);
				}
			}

			while (jdtType != null && jdtType.getSuperclassName() != null) {
				jdtType = jdtType.getJavaProject().findType(jdtType.getSuperclassName());
				if (jdtType != null) {
					for (IMethod m : jdtType.getMethods()) {
						if (m.getElementName().startsWith("set") && propertyName.equals(JDTHelper.extractAttributename(m.getElementName()))) {
							return createHover(m, object, viewer, region);
						}
					}
				}
			}

			jdtType = originalType;

			// Check if there's a getter
			for (IMethod m : jdtType.getMethods()) {
				if ((m.getElementName().startsWith("get") || m.getElementName().startsWith("is")) && propertyName.equals(JDTHelper.extractAttributename(m.getElementName()))) {
					return createHover(m, object, viewer, region);
				}
			}

			while (jdtType != null && jdtType.getSuperclassName() != null) {
				jdtType = jdtType.getJavaProject().findType(jdtType.getSuperclassName());
				if (jdtType != null) {
					for (IMethod m : jdtType.getMethods()) {
						if ((m.getElementName().startsWith("get") || m.getElementName().startsWith("is")) && propertyName.equals(JDTHelper.extractAttributename(m.getElementName()))) {
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
//		System.err.println(o);
		return super.hasHover(o);
	}

	private static List<String> getImports(FXML fxml) {
		List<String> imports = new ArrayList<String>();

		for (ProcessingInstruction p : fxml.getProcessingInstructions()) {
			if (p.getType().equals("import")) {
				imports.add(p.getImportedNamespace().getValue());
			}
		}

		return imports;
	}

	private JvmType toJvmType(String name, FXML fxml) {
		JvmType type = null;
		IJvmTypeProvider jvmTypeProvider = jvmTypeProviderFactory.createTypeProvider(fxml.eResource().getResourceSet());
		
		for (String imp : getImports(fxml)) {
			if (imp.lastIndexOf(".") > 0 && Character.isLowerCase(imp.charAt(imp.lastIndexOf(".")+1))) {
				JvmType t = jvmTypeProvider.findTypeByName(imp + "." + name);
				if (t != null) {
					return t;
				}
			} else {
				if (imp.endsWith(name)) {
					JvmType t = jvmTypeProvider.findTypeByName(imp);
					if (t != null) {
						return t;
					}
				}
			}
		}

		return type;
	}

	static class JavadocHoverWrapper extends JavadocHover {

		IJavaElement currentElement;

		void setJavaElement(IJavaElement element) {
			currentElement = element;
		}

		@Override
		protected IJavaElement[] getJavaElementsAt(ITextViewer textViewer, IRegion hoverRegion) {
			// hack: return previously registered element
			// required as JavadocHover.getHoverInfo(IJavaElement[]
			// elements,...) is private
			return new IJavaElement[] { currentElement };
		}

	}
}
