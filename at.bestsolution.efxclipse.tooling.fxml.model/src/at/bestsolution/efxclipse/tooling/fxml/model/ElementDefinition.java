package at.bestsolution.efxclipse.tooling.fxml.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.IType;

public class ElementDefinition {
	private String name;
	private String id;
	
	private IType jdtType;
	private List<ValuePropertyDefinition> attributePropertyDefinitions = new ArrayList<ValuePropertyDefinition>();
	private List<PropertyDefinition> elementPropertyDefinitions = new ArrayList<PropertyDefinition>();
	private List<PropertyDefinition> staticPropertyDefinitions = new ArrayList<PropertyDefinition>();
	
	public ElementDefinition(String name) {
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void addAttributePropertyDefinitions(ValuePropertyDefinition definition) {
		attributePropertyDefinitions.add(definition);
	}
	
	public void addElementPropertyDefinitions(PropertyDefinition definition) {
		elementPropertyDefinitions.add(definition);
	}
	
	public void addStaticPropertyDefinitions(PropertyDefinition definition) {
		staticPropertyDefinitions.add(definition);
	}
	
	public String getName() {
		return name;
	}
	
	public List<ValuePropertyDefinition> getAttributePropertyDefinitions() {
		return attributePropertyDefinitions;
	}
	
	public List<PropertyDefinition> getElementPropertyDefinitions() {
		return elementPropertyDefinitions;
	}
	
	public List<PropertyDefinition> getStaticPropertyDefinitions() {
		return staticPropertyDefinitions;
	}
}
