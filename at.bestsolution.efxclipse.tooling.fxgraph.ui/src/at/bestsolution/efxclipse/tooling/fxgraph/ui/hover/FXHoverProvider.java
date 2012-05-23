package at.bestsolution.efxclipse.tooling.fxgraph.ui.hover;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.ui.text.java.hover.JavadocHover;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.xtext.common.types.JvmType;
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
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ValueProperty;
import at.bestsolution.efxclipse.tooling.model.FXPlugin;
import at.bestsolution.efxclipse.tooling.model.IFXClass;
import at.bestsolution.efxclipse.tooling.model.IFXCtrlClass;
import at.bestsolution.efxclipse.tooling.model.IFXCtrlEventMethod;
import at.bestsolution.efxclipse.tooling.model.IFXEnumProperty;
import at.bestsolution.efxclipse.tooling.model.IFXProperty;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class FXHoverProvider extends XbaseHoverProvider {
	
	@Inject
	private IJavaElementFinder javaElementFinder;
	
	@Inject
	private IJavaProjectProvider javaProjectProvider;
	
	private JavadocHoverWrapper javadocHover = new JavadocHoverWrapper ();
	
	private IType getJDTType(JvmType jvmTypeRef) {
		try {
			IJavaProject javaProject = javaProjectProvider.getJavaProject(jvmTypeRef.eResource().getResourceSet());
			return javaProject.findType(jvmTypeRef.getQualifiedName());			
		} catch(JavaModelException e) {
			//TODO Logging
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public IInformationControlCreatorProvider getHoverInfo(EObject object, ITextViewer viewer, IRegion region) {
		if( object instanceof Element ) {
			Element e = (Element) object;
			if( e.getType() != null ) {
				IType t = getJDTType(e.getType().getType());
				if( t != null ) {
					return createHover(t, object, viewer, region);
				}
			}
		} else if( object instanceof Property ) {
			Property p = (Property) object;
			if( p.eContainer() instanceof Element ) {
				Element e = (Element) p.eContainer();
				if( e.getType() != null ) {
					IType t = getJDTType(e.getType().getType());
					if( t != null ) {
						IFXClass fxClass = FXPlugin.getClassmodel().findClass(t.getJavaProject(), t);
						if( fxClass != null ) {
							IFXProperty fxp = fxClass.getProperty(p.getName());
							if( fxp != null ) {
								return createHover(fxp.getJavaElement(), object, viewer, region);
							}
						}
					}
				}
			}
		} else if( object instanceof StaticValueProperty ) {
			StaticValueProperty sp = (StaticValueProperty) object;
			if( sp.getType() != null ) {
				IType t = getJDTType(sp.getType().getType());
				if( t != null ) {
					IFXClass fxClass = FXPlugin.getClassmodel().findClass(t.getJavaProject(), t);
					if( fxClass != null ) {
						IFXProperty fxp = fxClass.getStaticProperty(sp.getName());
						if( fxp != null ) {
							return createHover(fxp.getJavaElement(), object, viewer, region);
						}
					}
				}
			}
		} else if( object instanceof ValueProperty ) {
			if( object instanceof ControllerHandledValueProperty ) {
				ControllerHandledValueProperty cp = (ControllerHandledValueProperty) object;
				
				Model m = (Model) object.eResource().getContents().get(0);
				
				if( m != null ) {
					ComponentDefinition def = m.getComponentDef();
					if( def != null ) {
						if( def.getController() != null && def.getController().getType() != null) {
							IType t = getJDTType(def.getController().getType());
							if( t != null ) {
								IFXCtrlClass fxClass = FXPlugin.getClassmodel().findCtrlClass(t.getJavaProject(), t);
								if( fxClass != null ) {
									IFXCtrlEventMethod fxp = fxClass.getAllEventMethods().get(cp.getMethodname());
									if( fxp != null ) {
										return createHover(fxp.getJavaElement(), object, viewer, region);
									}
								}
							}
						}
					}
				}
			} else if( object instanceof SimpleValueProperty ) {
				SimpleValueProperty sp = (SimpleValueProperty) object;
				if( sp.eContainer() instanceof Property && sp.getStringValue() != null ) {
					Property p = (Property) sp.eContainer();
					
					if( p.eContainer() instanceof Element ) {
						Element e = (Element) p.eContainer();
						if( e.getType() != null ) {
							IType t = getJDTType(e.getType().getType());
							if( t != null ) {
								IFXClass fxClass = FXPlugin.getClassmodel().findClass(t.getJavaProject(), t);
								if( fxClass != null ) {
									IFXProperty fxp = fxClass.getProperty(p.getName());
									if( fxp instanceof IFXEnumProperty ) {
										IType enumType = ((IFXEnumProperty) fxp).getEnumType();
										try {
											for (IField f : enumType.getFields()) {
												if (Flags.isEnum(f.getFlags())) {
													if( f.getElementName().equals(sp.getStringValue()) ) {
														return createHover(f, object, viewer, region);
													}
												}
											}
										} catch (JavaModelException ex) {
											// TODO Auto-generated catch block
											ex.printStackTrace();
										}
									}
								}
							}
						}
					}
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
