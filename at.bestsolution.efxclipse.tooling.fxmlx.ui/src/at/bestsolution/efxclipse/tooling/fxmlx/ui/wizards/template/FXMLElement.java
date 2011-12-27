package at.bestsolution.efxclipse.tooling.fxmlx.ui.wizards.template;

import org.eclipse.jdt.core.IType;

import at.bestsolution.efxclipse.tooling.ui.wizards.template.JDTElement;

public class FXMLElement extends JDTElement {
	private IType rootElement;

	public IType getRootElement() {
		return rootElement;
	}

	public void setRootElement(IType rootElement) {
		support.firePropertyChange("rootElement", this.rootElement, this.rootElement = rootElement);
	}
	
	
}
