package at.bestsolution.efxclipse.tooling.fxml.editors.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class FXMLDocumentBuilder {
	
	static class SaxHandler extends DefaultHandler {
		FXMLDocumentDefinition documentDefinition;
		List<ElementDefinition> elementStack = new ArrayList<ElementDefinition>();
		int identCount;
		
		@Override
		public void startDocument() throws SAXException {
			documentDefinition = new FXMLDocumentDefinition();
		}
		
		@Override
		public void startElement(String uri, String localName, String qName,
				Attributes attributes) throws SAXException {
			if( identCount % 2 == 0 ) {
				System.err.println("This is an element: " + qName);
			}
			
			identCount++;
		}
		
		@Override
		public void endElement(String uri, String localName, String qName)
				throws SAXException {
			identCount--;
		}
	}
	
	public static void main(String[] args) {
		try {
			buildModel(new FileInputStream(new File("C:/Users/Tom Schindl/git/e-fx-clipse/at.bestsolution.efxclipse.runtime.examples.fxgraph/src-gen/at/bestsolution/efxclipse/runtime/examples/fxgraph/login.fxml")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static FXMLDocumentDefinition buildModel(InputStream inputStream) {
		try {
			SAXParserFactory fact = SAXParserFactory.newInstance();
			SAXParser parser = fact.newSAXParser();
			SaxHandler dh = new SaxHandler();
			parser.parse(inputStream, dh);
			
			return dh.documentDefinition;
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
