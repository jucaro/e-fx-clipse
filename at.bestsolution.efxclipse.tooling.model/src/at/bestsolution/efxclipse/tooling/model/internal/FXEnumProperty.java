package at.bestsolution.efxclipse.tooling.model.internal;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;

import at.bestsolution.efxclipse.tooling.model.IFXEnumProperty;

public class FXEnumProperty extends FXProperty implements IFXEnumProperty {
	public FXEnumProperty(FXClass fxClass, String name, IJavaElement javaElement) {
		super(fxClass, name, javaElement);
	}

	public static boolean isEnum(IJavaProject jp, String erasedFQNType) throws JavaModelException {
		return jp.findType(erasedFQNType).isEnum();
	}
	
	@Override
	public String toString() {
		return "FXEnumProperty("+getName()+")";
	}
}
