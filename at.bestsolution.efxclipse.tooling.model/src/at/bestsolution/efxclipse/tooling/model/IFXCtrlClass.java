package at.bestsolution.efxclipse.tooling.model;

import java.util.Map;

public interface IFXCtrlClass {
	public String getSimpleName();
	public String getFQN();
	public Map<String,IFXCtrlEventMethod> getAllEventMethods();
	public Map<String,IFXCtrlField> getFields();
}
