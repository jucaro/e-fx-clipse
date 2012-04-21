package at.bestsolution.efxclipse.tooling.model.internal;

import org.eclipse.jdt.core.IJavaElement;

import at.bestsolution.efxclipse.tooling.model.IFXProperty;

public abstract class FXProperty implements IFXProperty {
	private final String name;

	private final FXClass fxClass;
	
	private final IJavaElement javaElement;
	
	private boolean canWrite;
	
	public FXProperty(FXClass fxClass, String name, IJavaElement javaElement) {
		this.fxClass = fxClass;
		this.name = name;
		this.javaElement = javaElement;
		this.canWrite = !( javaElement.getElementName().startsWith("get") || javaElement.getElementName().startsWith("is") );
	}
	
	protected FXClass getFXClass() {
		return fxClass;
	}
	
	@Override
	public boolean canWrite() {
		return canWrite;
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
