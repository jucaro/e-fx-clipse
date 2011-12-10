package at.bestsolution.efxclipse.tooling.fxml.model;

import java.util.ArrayList;
import java.util.List;

public class ListPropertyDefinition extends PropertyDefinition {
	private List<Object> values = new ArrayList<Object>();
	
	public ListPropertyDefinition(String name) {
		super(name);
	}

	public List<Object> getValues() {
		return values;
	}
	
}
