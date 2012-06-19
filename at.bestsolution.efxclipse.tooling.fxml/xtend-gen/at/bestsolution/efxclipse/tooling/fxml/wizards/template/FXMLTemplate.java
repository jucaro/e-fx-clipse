package at.bestsolution.efxclipse.tooling.fxml.wizards.template;

import at.bestsolution.efxclipse.tooling.fxml.wizards.template.FXMLElement;
import at.bestsolution.efxclipse.tooling.ui.wizards.template.IGenerator;
import org.eclipse.jdt.core.IType;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class FXMLTemplate implements IGenerator<FXMLElement> {
  public CharSequence generateContent(final FXMLElement element) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<?import ");
    IType _rootElement = element.getRootElement();
    String _fullyQualifiedName = _rootElement.getFullyQualifiedName();
    _builder.append(_fullyQualifiedName, "");
    _builder.append("?>");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("<");
    IType _rootElement_1 = element.getRootElement();
    String _elementName = _rootElement_1.getElementName();
    _builder.append(_elementName, "");
    _builder.append(" xmlns:fx=\"http://javafx.com/fxml\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<!-- TODO Add Nodes -->");
    _builder.newLine();
    _builder.append("</");
    IType _rootElement_2 = element.getRootElement();
    String _elementName_1 = _rootElement_2.getElementName();
    _builder.append(_elementName_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
}
