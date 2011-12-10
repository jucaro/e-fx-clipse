package at.bestsolution.efxclipse.tooling.fxml.model;

public abstract class PropertyDefinition {
	private String name;
	
	public PropertyDefinition(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
