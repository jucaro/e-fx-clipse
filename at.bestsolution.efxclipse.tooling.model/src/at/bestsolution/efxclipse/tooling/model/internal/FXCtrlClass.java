package at.bestsolution.efxclipse.tooling.model.internal;

import static at.bestsolution.efxclipse.tooling.model.internal.utils.Util.getFQNType;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.osgi.service.log.LogService;

import at.bestsolution.efxclipse.tooling.model.FXPlugin;
import at.bestsolution.efxclipse.tooling.model.IFXCtrlClass;
import at.bestsolution.efxclipse.tooling.model.IFXCtrlEventMethod;
import at.bestsolution.efxclipse.tooling.model.IFXCtrlField;
import at.bestsolution.efxclipse.tooling.model.internal.utils.Util;

public class FXCtrlClass implements IFXCtrlClass {
	private IJavaProject javaProject;
	private IType type;
	private Map<String,IFXCtrlEventMethod> eventMethods;
	private Map<String,IFXCtrlField> fields;
	private IFXCtrlClass superClass;
	
	public FXCtrlClass(IJavaProject jp, IType type) {
		this.javaProject = jp;
		this.type = type;
		
		try {
			String s = type.getSuperclassName();
			
			if( s != null ) {
				s = getFQNType(type,s);
				superClass = FXPlugin.getClassmodel().findCtrlClass(jp, jp.findType(s));
			}
		} catch (JavaModelException e) {
			FXPlugin.getLogger().log(LogService.LOG_ERROR, "Unable to retrieve superclass name of '"+type.getFullyQualifiedName()+"'", e );
		}
	}
	
	IJavaProject getJavaProject() {
		return javaProject;
	}

	@Override
	public String getSimpleName() {
		return type.getElementName();
	}

	public String getFQN() {
		return type.getFullyQualifiedName();
	}
	
	@Override
	public Map<String,IFXCtrlEventMethod> getAllEventMethods() {
		Map<String, IFXCtrlEventMethod> rv = new HashMap<String, IFXCtrlEventMethod>();
		if( superClass != null ) {
			rv.putAll(superClass.getAllEventMethods());
		}
		rv.putAll(getLocalEventMethods());
		return Collections.unmodifiableMap(rv);
	}

	private Map<String,IFXCtrlEventMethod> getLocalEventMethods() {
		if( eventMethods == null )  {
			eventMethods = new HashMap<String, IFXCtrlEventMethod>();
			try {
				for( IMethod m : type.getMethods() ) {
					boolean annotated = false;
					for (IAnnotation a : m.getAnnotations()) {
						if (a.getElementName().endsWith("FXML")) {
							annotated = true;
						}
					}
					
					if( annotated ) {
						String[] types = m.getParameterTypes();
						if( types.length <= 1 ) {
							if( types.length == 1 )  {
								String erasedFQNType = Util.getFQNType((IType)m.getParent(), Signature.getTypeErasure(Signature.toString(types[0])));
								if( FXCtrlEventMethod.isEventMethod(javaProject, erasedFQNType) ) {
									eventMethods.put(m.getElementName(), new FXCtrlEventMethod(this,m, erasedFQNType));	
								}
							} else {
								// Only if there's not already a method with the same id
								if( ! eventMethods.containsKey(m.getElementName()) ) {
									eventMethods.put(m.getElementName(), new FXCtrlEventMethod(this,m,null));	
								}
							}
						}
					}
					
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return eventMethods;
	}
	
	@Override
	public Map<String,IFXCtrlField> getFields() {
		// TODO Auto-generated method stub
		return null;
	}
}
