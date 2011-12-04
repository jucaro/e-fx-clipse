package at.bestsolution.efxclipse.tooling.fxml.editors.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FXMLDocument extends AbstractElement {
	private List<ImportElement> imports = new ArrayList<ImportElement>();
	private ClassElement rootElement;
	
	public FXMLDocument(int offset, int length) {
		super(offset, length);
	}

	public void addImport(ImportElement element) {
		imports.add(element);
	}
	
	public List<ImportElement> getImports() {
		return Collections.unmodifiableList(imports);
	}
	
	public void setRootElement(ClassElement element) {
		this.rootElement = element;
	}
	
	public ClassElement getRootElement() {
		return rootElement;
	}
}
