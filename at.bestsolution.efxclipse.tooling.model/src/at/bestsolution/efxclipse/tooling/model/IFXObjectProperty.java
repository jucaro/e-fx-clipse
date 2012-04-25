package at.bestsolution.efxclipse.tooling.model;

import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;

public interface IFXObjectProperty extends IFXProperty {
	public String getElementTypeAsString(boolean fqn);
	public boolean hasValueOf();
	public IType getElementType();
	public IMethod getValueOfMethod();
}
