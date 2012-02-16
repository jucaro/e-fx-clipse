package at.bestsolution.efxclipse.formats.fxg.handler;

import java.io.InputStream;
import java.util.List;
import java.util.Stack;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import at.bestsolution.efxclipse.formats.fxg.fxg.ContainerElement;
import at.bestsolution.efxclipse.formats.fxg.fxg.Definition;
import at.bestsolution.efxclipse.formats.fxg.fxg.FXGElement;
import at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage;
import at.bestsolution.efxclipse.formats.fxg.fxg.Graphic;
import at.bestsolution.efxclipse.formats.fxg.fxg.Library;
import at.bestsolution.efxclipse.formats.fxg.fxg.RichText;

public class XMLLoader {

	public Graphic loadGrapic(InputStream in) {
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			factory.setNamespaceAware(true);
			SAXParser parser = factory.newSAXParser();
			Handler handler = new Handler();
			parser.parse(in, handler);
			return handler.graphic;
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}

	static class Handler extends DefaultHandler {
		private Graphic graphic;

		private Stack<FXGElement> elementStack = new Stack<FXGElement>();
		private Stack<EStructuralFeature> targetFeatureStack = new Stack<EStructuralFeature>();
		private Stack<String> foreignNamespace = new Stack<String>();
		private boolean inRichText;
		private boolean inRichTextContent;
		private StringBuilder richtTextContent;
		// private Stack<RichTextContent> richtTextContentStack = new
		// Stack<RichTextContent>();

		private static final String FXG_NS = "http://ns.adobe.com/fxg/2008";

		private String identing() {
			String rv = "";
			for (int i = 0; i < elementStack.size(); i++) {
				rv += " ";
			}
			return rv;
		}

		@SuppressWarnings("unchecked")
		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
			if (FXG_NS.equals(uri)) {
				if (foreignNamespace.isEmpty()) {
					if (Character.isUpperCase(localName.charAt(0))) {
						EClassifier classifier = FxgPackage.eINSTANCE.getEClassifier(localName);
						FXGElement element = null;

						if (classifier == null) {
							if (graphic.get_children().get(0) instanceof Library) {
								Library l = (Library) graphic.get_children().get(0);
								for (Definition d : l.get_children()) {
									if (localName.equals(d.getName())) {
										element = EcoreUtil.copy(d.get_children().get(0));
										break;
									}
								}
							}
						} else {
							element = (FXGElement) EcoreUtil.create((EClass) classifier);
						}

						if (element == null) {
							throw new IllegalStateException();
						}

						if (element instanceof Graphic) {
							graphic = (Graphic) element;
						}

						EStructuralFeature feature = null;
						if (!targetFeatureStack.isEmpty()) {
							feature = targetFeatureStack.lastElement();
						}

						if (feature != null && !elementStack.isEmpty()) {
							if (feature.isMany()) {
								List<FXGElement> list = (List<FXGElement>) elementStack.lastElement().eGet(feature);
								list.add(element);
							} else {
								elementStack.lastElement().eSet(feature, element);
							}
						}

						for (int i = 0; i < attributes.getLength(); i++) {
							if (FXG_NS.equals(attributes.getURI(i)) || "".equals(attributes.getURI(i))) {
								String name = attributes.getLocalName(i);
								EStructuralFeature f = element.eClass().getEStructuralFeature(name);
								if (f != null) {
									Object o = EcoreUtil.createFromString((EDataType) f.getEType(), attributes.getValue(i));
									element.eSet(f, o);
								} else {
									System.err.println("Could not find feature '" + name + "' in " + element.eClass().getName());
								}
							}
						}

						if (element instanceof ContainerElement<?>) {
							targetFeatureStack.add(FxgPackage.Literals.CONTAINER_ELEMENT__CHILDREN);
						} else {
							targetFeatureStack.add(null);
						}
						elementStack.add(element);

						if (element instanceof RichText) {
							inRichText = true;
						}

					} else {
						if (!elementStack.isEmpty()) {
							if (inRichTextContent) {
								richtTextContent.append("<" + localName);
								richtTextContent.append(toString(attributes));
								richtTextContent.append(">");
							} else {
								EStructuralFeature f = elementStack.lastElement().eClass().getEStructuralFeature(localName);
								targetFeatureStack.add(f);
								if (inRichText && f == FxgPackage.Literals.RICH_TEXT__CONTENT) {
									inRichTextContent = true;
									richtTextContent = new StringBuilder();
								}
							}
						}
					}
				}
			} else {
				foreignNamespace.add(uri);
			}
		}

		private static String toString(Attributes attributes) {
			StringBuilder b = new StringBuilder();

			for (int i = 0; i < attributes.getLength(); i++) {
				if (FXG_NS.equals(attributes.getURI(i))) {
					b.append(" " + attributes.getLocalName(i) + "=\"" + attributes.getValue(i) + "\"");
				}
			}

			return b.toString();
		}

		@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
			if (inRichTextContent) {
				richtTextContent.append(new String(ch, start, length));
				// System.err.println("Text-Content: " + new
				// String(ch,start,length));
			}
		}

		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
			if (FXG_NS.equals(uri)) {
				if (!"Graphic".equals(localName) && foreignNamespace.isEmpty()) {
					if (Character.isUpperCase(localName.charAt(0))) {
						targetFeatureStack.pop();
						if (elementStack.pop() instanceof RichText) {
							inRichText = false;
						}
					} else {
						if (inRichText) {
							if ("content".equals(localName)) {
								inRichTextContent = false;
								targetFeatureStack.pop();
								((RichText) elementStack.lastElement()).set_tempcontent(richtTextContent.toString());
							} else {
								richtTextContent.append("</" + localName + ">");
							}
						} else {
							targetFeatureStack.pop();
						}
					}
				}
			} else {
				foreignNamespace.pop();
			}
		}
	}

//	public static void main(String[] args) {
//		XMLLoader l = new XMLLoader();
//		try {
//			// Graphic g = l.loadGrapic(new
//			// File("C:/e-ws/fxclipse/at.bestsolution.efxclipse.formats.fxg/model/banner.fxg").toURL().openStream());
//			// Graphic g = l.loadGrapic(new
//			// File("C:/e-ws/fxclipse/at.bestsolution.efxclipse.formats.fxg/model/Duke Billboard T-Shirt CLEAN.fxg").toURL().openStream());
//			Graphic g = l.loadGrapic(new File("C:/e-ws/fxclipse/fxg-examples/components.fxg").toURL().openStream());
//			XMLResourceImpl r = new XMLResourceImpl();
//			r.getContents().add(g);
//			r.save(System.out, null);
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
