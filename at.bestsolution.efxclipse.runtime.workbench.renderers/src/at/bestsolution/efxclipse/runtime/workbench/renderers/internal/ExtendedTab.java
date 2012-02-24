package at.bestsolution.efxclipse.runtime.workbench.renderers.internal;

import javafx.scene.control.Tab;

public class ExtendedTab extends Tab {
	private Object data;
	
	public ExtendedTab(String text) {
		super(text);
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public Object getData() {
		return data;
	}
}
