package at.bestsolution.efxclipse.tooling.model.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;

import at.bestsolution.efxclipse.tooling.model.IFXClass;
import at.bestsolution.efxclipse.tooling.model.IFXClassmodel;

public class FXClassmodel implements IFXClassmodel {
	private Map<String, FXClass> typeCache = new HashMap<String, FXClass>();
	
	public IFXClass findClass(IJavaProject javaProject, IType type) {
		IFXClass rv = typeCache.get(type.getFullyQualifiedName());
		
		if( rv == null ) {
			FXClass c = new FXClass(javaProject, type);
			System.err.println(c);
			typeCache.put(c.getFQN(), c);
			return c;
		}
		
		return rv;
	}
}
