package at.bestsolution.efxclipse.tooling.model;

import java.util.Map;

public interface IFXClass {
	public IFXProperty getDefaultProperty();
	public String getFQN();
	public Map<String,IFXProperty> getAllProperties();
	public Map<String, IFXProperty> getLocalProperties();
	public IFXProperty getProperty(String name);
}
