package at.bestsolution.efxclipse.tooling.model;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

public class Util {
	public static boolean assignable(IType fromType, IType toType) {
		if( fromType.equals(toType) ) {
			return true;
		}
		
		try {
			return fromType.newSupertypeHierarchy(new NullProgressMonitor()).contains(toType);
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
