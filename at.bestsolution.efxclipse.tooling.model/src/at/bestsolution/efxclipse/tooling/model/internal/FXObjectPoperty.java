package at.bestsolution.efxclipse.tooling.model.internal;

import org.eclipse.jdt.core.IJavaElement;

import at.bestsolution.efxclipse.tooling.model.IFXObjectProperty;

public class FXObjectPoperty extends FXProperty implements IFXObjectProperty {

	public FXObjectPoperty(FXClass fxClass, String name, IJavaElement javaElement) {
		super(fxClass, name, javaElement);
	}

	@Override
	public String toString() {
		return "FXObjectPoperty("+getName()+")";
	}
}
