package at.bestsolution.efxclipse.tooling.fxml.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class FXMLEditor extends TextEditor {

	private ColorManager colorManager;

	public FXMLEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
