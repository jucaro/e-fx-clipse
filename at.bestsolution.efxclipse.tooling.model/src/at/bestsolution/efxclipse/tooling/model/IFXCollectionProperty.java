package at.bestsolution.efxclipse.tooling.model;

import org.eclipse.jdt.core.IType;

public interface IFXCollectionProperty extends IFXProperty {
	public IType getElementType();
	public String getCollectionAsString();
	public String getCollectionTypeAsString(boolean fqn);
}
