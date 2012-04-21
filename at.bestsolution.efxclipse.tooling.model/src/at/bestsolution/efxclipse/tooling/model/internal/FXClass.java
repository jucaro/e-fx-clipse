package at.bestsolution.efxclipse.tooling.model.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.osgi.service.log.LogService;

import at.bestsolution.efxclipse.tooling.model.FXPlugin;
import at.bestsolution.efxclipse.tooling.model.IFXClass;
import at.bestsolution.efxclipse.tooling.model.IFXProperty;

import static at.bestsolution.efxclipse.tooling.model.internal.utils.PropertiesUtil.*;
import static at.bestsolution.efxclipse.tooling.model.internal.utils.Util.*;

public class FXClass implements IFXClass {
	public static final int STATE_DEFAULT_RESOLVED = 1;
	private IFXClass superClass;
	private IType type;
	
	private IJavaProject javaProject;
	private int state = 0;
	private IFXProperty defaultProperty;
	private Map<String,IFXProperty> properties;
	
	public FXClass(IJavaProject jp, IType type) {
		this.type = type;
		this.javaProject = jp;
		
		try {
			String s = type.getSuperclassName();
			
			if( s != null ) {
				s = getFQNType(type,s);
				superClass = FXPlugin.getClassmodel().findClass(jp, jp.findType(s));
			}
		} catch (JavaModelException e) {
			FXPlugin.getLogger().log(LogService.LOG_ERROR, "Unable to retrieve superclass name of '"+type.getFullyQualifiedName()+"'", e );
		}
	}
	
	public String getFQN() {
		return type.getFullyQualifiedName();
	}

	public IType getType() {
		return type;
	}
	
	public IJavaProject getJavaProject() {
		return javaProject;
	}
	
	@Override
	public IFXProperty getDefaultProperty() {
		if( ! checkStatemask(state, STATE_DEFAULT_RESOLVED) ) {
			IAnnotation annotation = type.getAnnotation("javafx.beans.DefaultProperty");
			if( annotation.exists() ) {
				try {
					String v = getAnnotationMemberValue(annotation, "value");
					System.err.println(v);
					if( v != null ) {
						defaultProperty = getProperty(v);	
					}
				} catch (JavaModelException e) {
					FXPlugin.getLogger().log(LogService.LOG_ERROR, "Unable to retrieve default annotation value for '"+type.getFullyQualifiedName()+"'", e);
				}
			}
			state |= STATE_DEFAULT_RESOLVED;
		}
		
		if( defaultProperty == null ) {
			if( superClass != null ) {
				return superClass.getDefaultProperty();
			}
		}
		
		return defaultProperty;
	}
	
	public IFXProperty getProperty(String name) {
		Map<String,IFXProperty> props = getAllProperties();
		return props.get(name);
	}
	
	public Map<String,IFXProperty> getAllProperties() {
		Map<String, IFXProperty> rv = new HashMap<String, IFXProperty>();
		if( superClass != null ) {
			rv.putAll(superClass.getAllProperties());
		}
		rv.putAll(getLocalProperties());
		return Collections.unmodifiableMap(rv);
	}
	
	public Map<String, IFXProperty> getLocalProperties() {
		if( properties == null ) {
			try {
				properties = resolveProperties(this);
			} catch (JavaModelException e) {
				FXPlugin.getLogger().log(LogService.LOG_ERROR, "Unable to retrieve properties of '"+type.getFullyQualifiedName()+"'", e);
			}
		}
		return Collections.unmodifiableMap(properties);
	}
}
