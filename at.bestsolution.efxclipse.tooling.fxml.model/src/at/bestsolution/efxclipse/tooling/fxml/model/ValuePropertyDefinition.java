package at.bestsolution.efxclipse.tooling.fxml.model;

public class ValuePropertyDefinition extends PropertyDefinition {
	private Object value;
	
	public ValuePropertyDefinition(String name) {
		super(name);
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	public Object getValue() {
		return value;
	}
}
