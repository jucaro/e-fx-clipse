package at.bestsolution.efxclipse.tooling.model.internal;

import org.eclipse.jdt.core.IJavaElement;

import at.bestsolution.efxclipse.tooling.model.IFXProperty;

public abstract class FXProperty implements IFXProperty {
	private final String name;

	private final FXClass fxClass;
	
	private final IJavaElement javaElement;
	
	private boolean setable;
	
	private boolean isStatic;
	
	public FXProperty(FXClass fxClass, String name, IJavaElement javaElement, boolean isStatic) {
		this.fxClass = fxClass;
		this.name = name;
		this.javaElement = javaElement;
		this.isStatic = isStatic;
		this.setable = !( javaElement.getElementName().startsWith("get") || javaElement.getElementName().startsWith("is") );
	}
	
	@Override
	public boolean isStatic() {
		return isStatic;
	}
	
	@Override
	public FXClass getFXClass() { 
		return fxClass;
	}
	
	@Override
	public boolean isSetable() {
		return setable;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public IJavaElement getJavaElement() {
		return javaElement;
	}
}
