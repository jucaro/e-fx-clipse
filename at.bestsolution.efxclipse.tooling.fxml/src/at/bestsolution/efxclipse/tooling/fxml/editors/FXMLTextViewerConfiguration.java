package at.bestsolution.efxclipse.tooling.fxml.editors;

import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.wst.xml.ui.StructuredTextViewerConfigurationXML;

public class FXMLTextViewerConfiguration extends StructuredTextViewerConfigurationXML {
	
	public FXMLTextViewerConfiguration() {
		System.err.println("Created ::::::");
	}
	
	@Override
	protected IContentAssistProcessor[] getContentAssistProcessors(
			ISourceViewer sourceViewer, String partitionType) {
		// TODO Auto-generated method stub
		return super.getContentAssistProcessors(sourceViewer, partitionType);
	}
}
