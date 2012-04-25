package at.bestsolution.efxclipse.tooling.model.internal.utils;

import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IMemberValuePair;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

public class Util {
	@SuppressWarnings("unchecked")
	public static <R> R getAnnotationMemberValue(IAnnotation annotation, String name) throws JavaModelException {
		for (IMemberValuePair pair : annotation.getMemberValuePairs()) {
			if( name.equals(pair.getMemberName()) ) {
				return (R) pair.getValue();
			}
		}
		return null;
	}
	
	public static boolean checkStatemask(int state, int mask) {
		return (state & mask) != 0;
	}
	
	public static String getFQNType(IType referenceType, String name) throws JavaModelException {
		String[][] parts = referenceType.resolveType(name);
		if( parts != null && parts.length > 0 ) {
			return toFQN(parts[0]);
		} else {
			//FIXME Log it
			System.err.println("No type for: " + name);
		}
		return null;
	}
	
	public static String toFQN(String[] array) {
		StringBuilder b = new StringBuilder();
		
		for( String s : array ) {
			if( b.length() > 0 && ! b.toString().endsWith(".") ) {
				b.append(".");
			}
			b.append(s);
		}
		
		return b.toString();
	}
}
