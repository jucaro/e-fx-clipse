package at.bestsolution.efxclipse.tooling.model;

import org.eclipse.jdt.core.IType;

public interface IFXEnumProperty extends IFXProperty {
	public String getEnumTypeAsString(boolean fqn);
	public IType getEnumType();
}
