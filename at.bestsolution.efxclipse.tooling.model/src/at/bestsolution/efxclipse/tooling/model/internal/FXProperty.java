package at.bestsolution.efxclipse.tooling.model.internal;

import org.eclipse.jdt.core.IJavaElement;

import at.bestsolution.efxclipse.tooling.model.IFXProperty;

public abstract class FXProperty implements IFXProperty {
	private final String name;

	private final FXClass fxClass;
	
	private final IJavaElement javaElement;
	
	private boolean setable;
	
	public FXProperty(FXClass fxClass, String name, IJavaElement javaElement) {
		this.fxClass = fxClass;
		this.name = name;
		this.javaElement = javaElement;
		this.setable = !( javaElement.getElementName().startsWith("get") || javaElement.getElementName().startsWith("is") );
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
