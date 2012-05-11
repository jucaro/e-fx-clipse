package at.bestsolution.efxclipse.tooling.model;

import org.eclipse.jdt.core.IType;

public interface IFXCtrlEventMethod {
	public String getName();
	public boolean hasArgument();
	public Visibility getVisibility();
	public IType getArgumentType();
}
