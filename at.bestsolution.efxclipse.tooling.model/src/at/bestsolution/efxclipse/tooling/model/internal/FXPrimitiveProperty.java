package at.bestsolution.efxclipse.tooling.model.internal;

import org.eclipse.jdt.core.IMethod;

import at.bestsolution.efxclipse.tooling.model.IFXPrimitiveProperty;

public class FXPrimitiveProperty extends FXProperty implements IFXPrimitiveProperty {
	private final Type type;
	
	public FXPrimitiveProperty(FXClass fxClass, String name, IMethod javaElement, Type type) {
		super(fxClass, name, javaElement);
		this.type = type;
	}

	@Override
	public Type getType() {
		return type;
	}
	
	public static boolean isPrimitive(String genericTypeValue) {
		return Type.parseType(genericTypeValue) != null;
	}
	
	@Override
	public String toString() {
		return "FXPrimitiveProperty("+getName()+")";
	}
}
