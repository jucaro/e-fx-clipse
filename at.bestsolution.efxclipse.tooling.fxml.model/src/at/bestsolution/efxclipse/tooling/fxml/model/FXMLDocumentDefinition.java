package at.bestsolution.efxclipse.tooling.fxml.model;

import java.util.ArrayList;
import java.util.List;

public class FXMLDocumentDefinition {
	private List<ImportDefinition> imports = new ArrayList<ImportDefinition>();
	private ElementDefinition rootElement;
	
	public FXMLDocumentDefinition() {
		
	}
	
	public void setRootElement(ElementDefinition rootElement) {
		this.rootElement = rootElement;
	}
	
	public ElementDefinition getRootElement() {
		return rootElement;
	}
	
	public void addImport(ImportDefinition importDef) {
		imports.add(importDef);
	}
	
	public List<ImportDefinition> getImports() {
		return imports;
	}
}
