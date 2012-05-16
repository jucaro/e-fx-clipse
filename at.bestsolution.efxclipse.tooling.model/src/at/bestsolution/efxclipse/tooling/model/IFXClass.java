package at.bestsolution.efxclipse.tooling.model;

import java.util.Map;

public interface IFXClass {
	public IFXProperty getDefaultProperty();
	public String getFQN();
	public String getSimpleName();
	public Map<String,IFXProperty> getAllProperties();
	public Map<String, IFXProperty> getLocalProperties();
	public IFXProperty getProperty(String name);
	
	public Map<String,IFXProperty> getAllStaticProperties();
	public Map<String,IFXProperty> getLocalStaticProperties();
	public IFXProperty getStaticProperty(String name);
}
