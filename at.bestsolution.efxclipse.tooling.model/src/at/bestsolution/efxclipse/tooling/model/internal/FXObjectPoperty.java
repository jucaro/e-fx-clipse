package at.bestsolution.efxclipse.tooling.model.internal;

import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;

import at.bestsolution.efxclipse.tooling.model.IFXObjectProperty;

public class FXObjectPoperty extends FXProperty implements IFXObjectProperty {
	private String erasedFQNType;
	private IType type;
	private Boolean valueOf;
	private IMethod valueOfMethod;
	private boolean valueOfMethodResolved;

	public FXObjectPoperty(FXClass fxClass, String name, IJavaElement javaElement, String erasedFQNType, boolean isStatic) {
		super(fxClass, name, javaElement, isStatic);
		this.erasedFQNType = erasedFQNType;
	}

	@Override
	public String toString() {
		return "FXObjectPoperty(" + getName() + ")";
	}

	@Override
	public String getElementTypeAsString(boolean fqn) {
		return fqn ? erasedFQNType : Signature.getSimpleName(erasedFQNType);
	}

	@Override
	public boolean hasValueOf() {
		if( valueOf == null ) {
			valueOf = Boolean.valueOf(getValueOfMethod() != null );
		}
		return valueOf.booleanValue();
	}

	public IMethod getValueOfMethod() {
		if( ! valueOfMethodResolved ) {
			try {
				for( IMethod m : getElementType().getMethods() ) {
					if( Flags.isStatic(m.getFlags()) && Flags.isPublic(m.getFlags()) && "valueOf".equals(m.getElementName()) ) {
						valueOfMethod = m;
					}
				}
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			valueOfMethodResolved = true;
		}
		
		return valueOfMethod;
	}
	
	@Override
	public IType getElementType() {
		if (type == null) {
			try {
				type = getFXClass().getJavaProject().findType(erasedFQNType);
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return type;
	}
}
