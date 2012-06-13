package at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard.templates;

import at.bestsolution.efxclipse.tooling.ui.wizards.template.IGenerator;
import at.bestsolution.efxclipse.tooling.ui.wizards.template.JDTElement;
import com.google.common.base.Objects;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ApplicationClassGenerator implements IGenerator<JDTElement> {
  public CharSequence generateContent(final JDTElement clazzDef) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      IPackageFragment _packageFragment = clazzDef.getPackageFragment();
      boolean _notEquals = (!Objects.equal(_packageFragment, null));
      if (!_notEquals) {
        _and = false;
      } else {
        IPackageFragment _packageFragment_1 = clazzDef.getPackageFragment();
        String _elementName = _packageFragment_1.getElementName();
        boolean _isEmpty = _elementName.isEmpty();
        boolean _not = (!_isEmpty);
        _and = (_notEquals && _not);
      }
      if (_and) {
        _builder.append("package ");
        IPackageFragment _packageFragment_2 = clazzDef.getPackageFragment();
        String _elementName_1 = _packageFragment_2.getElementName();
        _builder.append(_elementName_1, "");
        _builder.append(";");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import javafx.application.Application;");
    _builder.newLine();
    _builder.append("import javafx.stage.Stage;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = clazzDef.getName();
    _builder.append(_name, "");
    _builder.append(" extends Application {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void start(Stage primaryStage) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("launch(args);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
