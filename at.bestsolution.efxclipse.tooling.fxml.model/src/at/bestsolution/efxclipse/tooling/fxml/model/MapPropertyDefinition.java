package at.bestsolution.efxclipse.tooling.fxml.model;

import java.util.ArrayList;
import java.util.List;

public class MapPropertyDefinition extends PropertyDefinition {
	private List<PropertyDefinition> subelementValues = new ArrayList<PropertyDefinition>();
	
	public MapPropertyDefinition(String name) {
		super(name);
	}

	public void addSubelementProperty(PropertyDefinition prop) {
		subelementValues.add(prop);
	}
	
	public List<PropertyDefinition> getSubelementValues() {
		return subelementValues;
	}
}
