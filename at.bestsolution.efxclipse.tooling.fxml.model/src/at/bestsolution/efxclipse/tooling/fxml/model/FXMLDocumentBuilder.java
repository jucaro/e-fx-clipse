package at.bestsolution.efxclipse.tooling.fxml.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Stack;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import at.bestsolution.efxclipse.tooling.fxml.model.generator.FXMLGen;

public class FXMLDocumentBuilder {
	
	static class SaxHandler extends DefaultHandler {
		FXMLDocumentDefinition documentDefinition;
		Stack<ElementDefinition> elementStack = new Stack<ElementDefinition>();
		Stack<PropertyDefinition> propertyStack = new Stack<PropertyDefinition>();
		
		@Override
		public void startDocument() throws SAXException {
			documentDefinition = new FXMLDocumentDefinition();
		}
		
		@Override
		public void processingInstruction(String target, String data)
				throws SAXException {
			if( "import".equals(target) ) {
				documentDefinition.addImport(new ImportDefinition(data));
			}
		}
		
		@Override
		public void startElement(String uri, String localName, String qName,
				Attributes attributes) throws SAXException {
			if( Character.isUpperCase(qName.charAt(0)) ) {
				// This is a static property
				if( qName.contains(".") ) {
					StaticValuePropertyDefinition currentDefinition = new StaticValuePropertyDefinition(qName);
					propertyStack.add(currentDefinition);
					elementStack.lastElement().addStaticPropertyDefinitions(currentDefinition);
				} else {
					ElementDefinition elementDef = new ElementDefinition(qName);
					if( elementStack.isEmpty() ) {
						documentDefinition.setRootElement(elementDef);
						elementStack.add(elementDef);
					} else if( ! propertyStack.isEmpty() ) {
						if( propertyStack.lastElement() instanceof ValuePropertyDefinition ) {
							((ValuePropertyDefinition) propertyStack.lastElement()).setValue(elementDef); 
						} else if( propertyStack.lastElement() instanceof ListPropertyDefinition ) {
							((ListPropertyDefinition) propertyStack.lastElement()).getValues().add(elementDef);
						} else if( propertyStack.lastElement() instanceof MapPropertyDefinition ) {
							System.err.println("It is a property");
						}
						
						elementStack.add(elementDef);
					}
				}
			} else {
				if( elementStack.lastElement() != null ) {
					PropertyDefinition currentDefinition;
					// Need to look up the type
					if( qName.equals("children") ) {
						currentDefinition = new ListPropertyDefinition(qName);	
					} else if(qName.equals("properties")) {
						currentDefinition = new MapPropertyDefinition(qName);
					} else {
						currentDefinition = new ValuePropertyDefinition(qName);	
					}
					
					if( ! propertyStack.isEmpty() && propertyStack.lastElement() instanceof MapPropertyDefinition ) {
						((MapPropertyDefinition)propertyStack.lastElement()).addSubelementProperty(currentDefinition);
					} else {
						elementStack.lastElement().addElementPropertyDefinitions(currentDefinition); 
					}
					
					propertyStack.add(currentDefinition);
				}
			}
		}
		
		@Override
		public void endElement(String uri, String localName, String qName)
				throws SAXException {
			if( Character.isUpperCase(qName.charAt(0)) ) {
				if( ! qName.contains(".") ) {
					elementStack.pop();
				}
			} else {
				propertyStack.pop();
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			FXMLDocumentDefinition d = buildModel(new FileInputStream(new File("C:/Users/Tom Schindl/git/e-fx-clipse/at.bestsolution.efxclipse.runtime.examples.fxgraph/src-gen/at/bestsolution/efxclipse/runtime/examples/fxgraph/login.fxml")));
			System.err.println(new FXMLGen().generate(d));
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