package at.bestsolution.efxclipse.tooling.model.internal;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;

import at.bestsolution.efxclipse.tooling.model.IFXEnumProperty;

public class FXEnumProperty extends FXProperty implements IFXEnumProperty {
	private String enumTypeAsString;
	private IType enumType;
	
	public FXEnumProperty(FXClass fxClass, String name, IJavaElement javaElement, String erasedFQNType, boolean isStatic) {
		super(fxClass, name, javaElement, isStatic);
		this.enumTypeAsString = erasedFQNType;
	}

	public static boolean isEnum(IJavaProject jp, String erasedFQNType) throws JavaModelException {
		return jp.findType(erasedFQNType).isEnum();
	}
	
	@Override
	public String toString() {
		return "FXEnumProperty("+getName()+")";
	}

	@Override
	public String getEnumTypeAsString(boolean fqn) {
		return fqn ? enumTypeAsString : Signature.getSimpleName(enumTypeAsString);
	}
	
	@Override
	public IType getEnumType() {
		if( enumType == null ) {
			try {
				enumType = getFXClass().getJavaProject().findType(enumTypeAsString);
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return enumType;
	}
}
