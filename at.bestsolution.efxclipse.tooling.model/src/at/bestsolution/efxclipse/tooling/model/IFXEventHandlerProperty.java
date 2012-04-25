package at.bestsolution.efxclipse.tooling.model;

import org.eclipse.jdt.core.IType;

public interface IFXEventHandlerProperty extends IFXProperty {
	public String getEventTypeAsString(boolean fqn);
	public IType getEventType();
}
