package at.bestsolution.efxclipse.tooling.fxml.editors;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;

import at.bestsolution.efxclipse.tooling.fxml.model.FXMLDocumentBuilder;
import at.bestsolution.efxclipse.tooling.fxml.model.FXMLDocumentDefinition;
import at.bestsolution.efxclipse.tooling.fxml.model.generator.FXMLGen;

public class XMLDocumentProvider extends FileDocumentProvider {

	protected IDocument createDocument(Object element) throws CoreException {
		IDocument document = super.createDocument(element);
		if (document != null) {
			IDocumentPartitioner partitioner =
				new FastPartitioner(
					new XMLPartitionScanner(),
					new String[] {
						XMLPartitionScanner.XML_TAG,
						XMLPartitionScanner.XML_COMMENT });
			partitioner.connect(document);
			document.setDocumentPartitioner(partitioner);
		}
		document.addDocumentListener(new IDocumentListener() {
			
			@Override
			public void documentChanged(DocumentEvent event) {
				try {
					ByteArrayInputStream in = new ByteArrayInputStream(event.getDocument().get().getBytes());
					FXMLDocumentDefinition def = FXMLDocumentBuilder.buildModel(in);
					
					if( def != null ) {
						FXMLGen g = new FXMLGen();
						System.err.println(g.generate(def));	
					}
					
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			@Override
			public void documentAboutToBeChanged(DocumentEvent event) {
				
			}
		});
		return document;
	}
}