package at.bestsolution.efxclipse.tooling.fxml.editors.model;

public class AbstractElement {
	private int offset;
	private int length;
	
	public AbstractElement(int offset, int length) {
		this.offset = offset;
		this.length = length;
	}
}
