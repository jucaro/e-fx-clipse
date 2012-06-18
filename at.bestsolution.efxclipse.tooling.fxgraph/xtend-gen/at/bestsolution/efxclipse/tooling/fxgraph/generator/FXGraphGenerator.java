package at.bestsolution.efxclipse.tooling.fxgraph.generator;

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.BindValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ControllerHandledValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.CopyValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Define;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.FactoryValueElement;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.IncludeValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueElement;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ListValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.LocationValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.MapValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.PackageDeclaration;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ReferenceType;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ReferenceValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ResourceValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Script;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptHandlerHandledValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptValueExpression;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ScriptValueReference;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.SimpleValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticCallValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StaticValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.StringValue;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ValueProperty;
import at.bestsolution.efxclipse.tooling.fxgraph.generator.LanguageManager;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class FXGraphGenerator implements IGenerator {
  public String calculateRelativePath(final Resource resource) {
    try {
      URI _uRI = resource.getURI();
      boolean _isPlatformResource = _uRI.isPlatformResource();
      if (_isPlatformResource) {
        URI uri = resource.getURI();
        IWorkspace _workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRoot root = _workspace.getRoot();
        String _segment = uri.segment(1);
        IProject project = root.getProject(_segment);
        String projectRelativePath = "";
        int i = 0;
        IJavaProject jproject = JavaCore.create(project);
        String[] _segments = uri.segments();
        for (final String seg : _segments) {
          {
            boolean _greaterEqualsThan = (i >= 1);
            if (_greaterEqualsThan) {
              String _plus = (projectRelativePath + "/");
              String _segment_1 = uri.segment(i);
              String _plus_1 = (_plus + _segment_1);
              projectRelativePath = _plus_1;
            }
            int _plus_2 = (i + 1);
            i = _plus_2;
          }
        }
        boolean inSourceFound = false;
        IClasspathEntry[] _rawClasspath = jproject.getRawClasspath();
        for (final IClasspathEntry packroot : _rawClasspath) {
          int _entryKind = packroot.getEntryKind();
          boolean _equals = (_entryKind == IClasspathEntry.CPE_SOURCE);
          if (_equals) {
            IPath _path = packroot.getPath();
            String _string = _path.toString();
            boolean _startsWith = projectRelativePath.startsWith(_string);
            if (_startsWith) {
              IPath _path_1 = packroot.getPath();
              String _string_1 = _path_1.toString();
              int _length = _string_1.length();
              String _substring = projectRelativePath.substring(_length);
              projectRelativePath = _substring;
              inSourceFound = true;
            }
          }
        }
        if (inSourceFound) {
          return projectRelativePath;
        }
        return null;
      } else {
        return null;
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String doGeneratePreview(final Resource resource, final boolean skipController, final boolean skipIncludes) {
    try {
      final String projectRelativePath = this.calculateRelativePath(resource);
      boolean _notEquals = (!Objects.equal(projectRelativePath, null));
      if (_notEquals) {
        CharSequence _createContent = this.createContent(resource, projectRelativePath, true, skipController, skipIncludes);
        return _createContent.toString();
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return null;
  }
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    try {
      final String projectRelativePath = this.calculateRelativePath(resource);
      boolean _notEquals = (!Objects.equal(projectRelativePath, null));
      if (_notEquals) {
        final String relativeOutPath = projectRelativePath.replaceFirst(".fxgraph$", ".fxml");
        CharSequence _createContent = this.createContent(resource, projectRelativePath, false, false, false);
        fsa.generateFile(relativeOutPath, _createContent);
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public CharSequence createContent(final Resource resource, final String projectRelativePath, final boolean preview, final boolean skipController, final boolean skipIncludes) {
    StringConcatenation _builder = new StringConcatenation();
    ImportManager _importManager = new ImportManager(true);
    final ImportManager importManager = _importManager;
    _builder.newLineIfNotEmpty();
    LanguageManager _languageManager = new LanguageManager();
    final LanguageManager languageManager = _languageManager;
    _builder.newLineIfNotEmpty();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<!-- ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Do not edit this file it is generated by e(fx)clipse from ");
    _builder.append(projectRelativePath, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("-->");
    _builder.newLine();
    _builder.newLine();
    {
      EList<EObject> _contents = resource.getContents();
      EObject _get = _contents.get(0);
      EList<EObject> _eContents = _get.eContents();
      Iterable<ComponentDefinition> _filter = Iterables.<ComponentDefinition>filter(_eContents, ComponentDefinition.class);
      for(final ComponentDefinition rootElement : _filter) {
        final CharSequence body = this.componentDefinition(rootElement, importManager, languageManager, preview, skipController, skipIncludes);
        _builder.newLineIfNotEmpty();
        _builder.append("<?import java.lang.*?>");
        _builder.newLine();
        {
          List<String> _imports = importManager.getImports();
          for(final String i : _imports) {
            _builder.append("<?import ");
            _builder.append(i, "");
            _builder.append("?>");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          Collection<String> _languages = languageManager.getLanguages();
          for(final String i_1 : _languages) {
            _builder.append("<?language ");
            _builder.append(i_1, "");
            _builder.append("?>");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
        _builder.append(body, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence componentDefinition(final ComponentDefinition definition, final ImportManager importManager, final LanguageManager languageManager, final boolean preview, final boolean skipController, final boolean skipIncludes) {
    StringConcatenation _builder = new StringConcatenation();
    final Element element = definition.getRootNode();
    _builder.newLineIfNotEmpty();
    _builder.append("<");
    JvmTypeReference _type = element.getType();
    String _shortName = this.shortName(_type, importManager);
    _builder.append(_shortName, "");
    _builder.append(" xmlns:fx=\"http://javafx.com/fxml\"");
    String _fxElementAttributes = this.fxElementAttributes(element, importManager, skipController);
    _builder.append(_fxElementAttributes, "");
    {
      boolean _and = false;
      JvmTypeReference _controller = definition.getController();
      boolean _notEquals = (!Objects.equal(_controller, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _not = (!skipController);
        _and = (_notEquals && _not);
      }
      if (_and) {
        _builder.append(" fx:controller=\"");
        JvmTypeReference _controller_1 = definition.getController();
        String _qualifiedName = _controller_1.getQualifiedName();
        _builder.append(_qualifiedName, "");
        _builder.append("\"");
      }
    }
    {
      boolean _hasAttributeProperties = this.hasAttributeProperties(element, preview);
      if (_hasAttributeProperties) {
        EList<Property> _properties = element.getProperties();
        StringBuilder _elementAttributes = this.elementAttributes(_properties, preview, skipController);
        _builder.append(_elementAttributes, "");
        EList<StaticValueProperty> _staticProperties = element.getStaticProperties();
        StringBuilder _elementStaticAttributes = this.elementStaticAttributes(_staticProperties, importManager, preview, skipController);
        _builder.append(_elementStaticAttributes, "");
        EList<StaticCallValueProperty> _staticCallProperties = element.getStaticCallProperties();
        StringBuilder _elementStaticCallAttributes = this.elementStaticCallAttributes(_staticCallProperties, importManager, preview, skipController);
        _builder.append(_elementStaticCallAttributes, "");
      }
    }
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    {
      EList<Define> _defines = definition.getDefines();
      int _size = _defines.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("\t");
        _builder.append("<fx:define>");
        _builder.newLine();
        {
          EList<Define> _defines_1 = definition.getDefines();
          for(final Define define : _defines_1) {
            {
              Element _element = define.getElement();
              boolean _notEquals_1 = (!Objects.equal(_element, null));
              if (_notEquals_1) {
                _builder.append("\t");
                _builder.append("\t");
                Element _element_1 = define.getElement();
                CharSequence _elementContent = this.elementContent(_element_1, importManager, preview, skipController, skipIncludes);
                _builder.append(_elementContent, "		");
                _builder.newLineIfNotEmpty();
              } else {
                IncludeValueProperty _includeElement = define.getIncludeElement();
                boolean _notEquals_2 = (!Objects.equal(_includeElement, null));
                if (_notEquals_2) {
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("<fx:include");
                  {
                    IncludeValueProperty _includeElement_1 = define.getIncludeElement();
                    String _name = _includeElement_1.getName();
                    boolean _notEquals_3 = (!Objects.equal(_name, null));
                    if (_notEquals_3) {
                      _builder.append(" fx:id=\"");
                      IncludeValueProperty _includeElement_2 = define.getIncludeElement();
                      String _name_1 = _includeElement_2.getName();
                      _builder.append(_name_1, "		");
                      _builder.append("\"");
                    }
                  }
                  _builder.append(" source=\"/");
                  IncludeValueProperty _includeElement_3 = define.getIncludeElement();
                  ComponentDefinition _source = _includeElement_3.getSource();
                  String _fullyQualifiedName = this.fullyQualifiedName(_source);
                  String _replaceAll = _fullyQualifiedName.replaceAll("\\.", "/");
                  _builder.append(_replaceAll, "		");
                  _builder.append(".fxml\" />");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
        _builder.append("\t");
        _builder.append("</fx:define>");
        _builder.newLine();
      }
    }
    {
      boolean _not_1 = (!skipController);
      if (_not_1) {
        {
          EList<Script> _scripts = definition.getScripts();
          for(final Script script : _scripts) {
            _builder.append("\t");
            String _language = script.getLanguage();
            String _addLanguage = languageManager.addLanguage(_language);
            _builder.append(_addLanguage, "	");
            _builder.newLineIfNotEmpty();
            {
              String _sourcecode = script.getSourcecode();
              boolean _notEquals_4 = (!Objects.equal(_sourcecode, null));
              if (_notEquals_4) {
                _builder.append("\t");
                _builder.append("<fx:script>");
                String _sourcecode_1 = script.getSourcecode();
                String _sourcecode_2 = script.getSourcecode();
                int _length = _sourcecode_2.length();
                int _minus = (_length - 2);
                String _substring = _sourcecode_1.substring(2, _minus);
                _builder.append(_substring, "	");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("</fx:script>");
                _builder.newLine();
              } else {
                _builder.append("\t");
                _builder.append("<fx:script source=\"");
                String _source_1 = script.getSource();
                _builder.append(_source_1, "	");
                _builder.append("\"/>");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.newLine();
    {
      boolean _hasNestedProperties = this.hasNestedProperties(element, preview);
      if (_hasNestedProperties) {
        {
          EList<Element> _defaultChildren = element.getDefaultChildren();
          for(final Element e : _defaultChildren) {
            _builder.append("\t");
            CharSequence _elementContent_1 = this.elementContent(e, importManager, preview, skipController, skipIncludes);
            _builder.append(_elementContent_1, "	");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        EList<Property> _properties_1 = element.getProperties();
        CharSequence _propContents = this.propContents(_properties_1, importManager, preview, false, skipController, skipIncludes);
        _builder.append(_propContents, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        EList<StaticValueProperty> _staticProperties_1 = element.getStaticProperties();
        CharSequence _statPropContent = this.statPropContent(_staticProperties_1, importManager, preview, skipController, skipIncludes);
        _builder.append(_statPropContent, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        EList<StaticCallValueProperty> _staticCallProperties_1 = element.getStaticCallProperties();
        CharSequence _statCallPropContent = this.statCallPropContent(_staticCallProperties_1, importManager, preview, skipController, skipIncludes);
        _builder.append(_statCallPropContent, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("</");
    JvmTypeReference _type_1 = element.getType();
    String _shortName_1 = this.shortName(_type_1, importManager);
    _builder.append(_shortName_1, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence elementContent(final Element element, final ImportManager importManager, final boolean preview, final boolean skipController, final boolean skipIncludes) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<");
    JvmTypeReference _type = element.getType();
    String _shortName = this.shortName(_type, importManager);
    _builder.append(_shortName, "");
    String _fxElementAttributes = this.fxElementAttributes(element, importManager, skipController);
    _builder.append(_fxElementAttributes, "");
    {
      boolean _hasAttributeProperties = this.hasAttributeProperties(element, preview);
      if (_hasAttributeProperties) {
        EList<Property> _properties = element.getProperties();
        StringBuilder _elementAttributes = this.elementAttributes(_properties, preview, skipController);
        _builder.append(_elementAttributes, "");
        EList<StaticValueProperty> _staticProperties = element.getStaticProperties();
        StringBuilder _elementStaticAttributes = this.elementStaticAttributes(_staticProperties, importManager, preview, skipController);
        _builder.append(_elementStaticAttributes, "");
        EList<StaticCallValueProperty> _staticCallProperties = element.getStaticCallProperties();
        StringBuilder _elementStaticCallAttributes = this.elementStaticCallAttributes(_staticCallProperties, importManager, preview, skipController);
        _builder.append(_elementStaticCallAttributes, "");
      }
    }
    {
      boolean _hasNestedProperties = this.hasNestedProperties(element, preview);
      boolean _not = (!_hasNestedProperties);
      if (_not) {
        _builder.append("/");
      }
    }
    _builder.append("> ");
    _builder.newLineIfNotEmpty();
    {
      boolean _hasNestedProperties_1 = this.hasNestedProperties(element, preview);
      if (_hasNestedProperties_1) {
        {
          EList<Element> _defaultChildren = element.getDefaultChildren();
          for(final Element e : _defaultChildren) {
            _builder.append("\t");
            CharSequence _elementContent = this.elementContent(e, importManager, preview, skipController, skipIncludes);
            _builder.append(_elementContent, "	");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        EList<Property> _properties_1 = element.getProperties();
        CharSequence _propContents = this.propContents(_properties_1, importManager, preview, false, skipController, skipIncludes);
        _builder.append(_propContents, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        EList<StaticValueProperty> _staticProperties_1 = element.getStaticProperties();
        CharSequence _statPropContent = this.statPropContent(_staticProperties_1, importManager, preview, skipController, skipIncludes);
        _builder.append(_statPropContent, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        EList<StaticCallValueProperty> _staticCallProperties_1 = element.getStaticCallProperties();
        CharSequence _statCallPropContent = this.statCallPropContent(_staticCallProperties_1, importManager, preview, skipController, skipIncludes);
        _builder.append(_statCallPropContent, "	");
        _builder.newLineIfNotEmpty();
        {
          EList<FactoryValueElement> _values = element.getValues();
          for(final FactoryValueElement e_1 : _values) {
            {
              if ((e_1 instanceof Element)) {
                _builder.append("\t");
                CharSequence _elementContent_1 = this.elementContent(((Element) e_1), importManager, preview, skipController, skipIncludes);
                _builder.append(_elementContent_1, "	");
                _builder.newLineIfNotEmpty();
              } else {
                if ((e_1 instanceof SimpleValueProperty)) {
                  _builder.append("\t");
                  String _objectLiteral = this.objectLiteral(((SimpleValueProperty) e_1));
                  _builder.append(_objectLiteral, "	");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
        _builder.append("</");
        JvmTypeReference _type_1 = element.getType();
        String _shortName_1 = this.shortName(_type_1, importManager);
        _builder.append(_shortName_1, "");
        _builder.append(">");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public String objectLiteral(final SimpleValueProperty value) {
    String _stringValue = value.getStringValue();
    boolean _notEquals = (!Objects.equal(_stringValue, null));
    if (_notEquals) {
      String _stringValue_1 = value.getStringValue();
      String _plus = ("<String fx:value=\"" + _stringValue_1);
      return (_plus + "\" />");
    } else {
      String _booleanValue = value.getBooleanValue();
      boolean _notEquals_1 = (!Objects.equal(_booleanValue, null));
      if (_notEquals_1) {
        String _booleanValue_1 = value.getBooleanValue();
        String _plus_1 = ("<Boolean fx:value=\"" + _booleanValue_1);
        return (_plus_1 + "\" />");
      } else {
        double _realValue = value.getRealValue();
        boolean _notEquals_2 = (_realValue != 0);
        if (_notEquals_2) {
          boolean _isNegative = value.isNegative();
          if (_isNegative) {
            double _realValue_1 = value.getRealValue();
            String _plus_2 = ("<Double fx:value=\"-" + Double.valueOf(_realValue_1));
            return (_plus_2 + "\" />");
          } else {
            double _realValue_2 = value.getRealValue();
            String _plus_3 = ("<Double fx:value=\"" + Double.valueOf(_realValue_2));
            return (_plus_3 + "\" />");
          }
        } else {
          boolean _isNegative_1 = value.isNegative();
          if (_isNegative_1) {
            int _intValue = value.getIntValue();
            String _plus_4 = ("<Integer fx:value=\"-" + Integer.valueOf(_intValue));
            return (_plus_4 + "\" />");
          } else {
            int _intValue_1 = value.getIntValue();
            String _plus_5 = ("<Integer fx:value=\"" + Integer.valueOf(_intValue_1));
            return (_plus_5 + "\" />");
          }
        }
      }
    }
  }
  
  public CharSequence propContents(final List<Property> properties, final ImportManager importManager, final boolean preview, final boolean simpleAsElement, final boolean skipController, final boolean skipIncludes) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if (simpleAsElement) {
        {
          for(final Property prop : properties) {
            CharSequence _propContent = this.propContent(prop, importManager, preview, simpleAsElement, skipController, skipIncludes);
            _builder.append(_propContent, "");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        {
          final Function1<Property,Boolean> _function = new Function1<Property,Boolean>() {
              public Boolean apply(final Property p) {
                boolean _previewFilter = FXGraphGenerator.this.previewFilter(p, preview);
                return Boolean.valueOf(_previewFilter);
              }
            };
          Iterable<Property> _filter = IterableExtensions.<Property>filter(properties, _function);
          final Function1<Property,Boolean> _function_1 = new Function1<Property,Boolean>() {
              public Boolean apply(final Property p) {
                boolean _subelementFilter = FXGraphGenerator.this.subelementFilter(p);
                return Boolean.valueOf(_subelementFilter);
              }
            };
          Iterable<Property> _filter_1 = IterableExtensions.<Property>filter(_filter, _function_1);
          for(final Property prop_1 : _filter_1) {
            CharSequence _propContent_1 = this.propContent(prop_1, importManager, preview, simpleAsElement, skipController, skipIncludes);
            _builder.append(_propContent_1, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence propContent(final Property prop, final ImportManager importManager, final boolean preview, final boolean simpleAsElement, final boolean skipController, final boolean skipIncludes) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ValueProperty _value = prop.getValue();
      if ((_value instanceof SimpleValueProperty)) {
        {
          ValueProperty _value_1 = prop.getValue();
          String _stringValue = ((SimpleValueProperty) _value_1).getStringValue();
          boolean _notEquals = (!Objects.equal(_stringValue, null));
          if (_notEquals) {
            _builder.append("<");
            String _name = prop.getName();
            _builder.append(_name, "");
            _builder.append(">");
            ValueProperty _value_2 = prop.getValue();
            String _stringValue_1 = ((SimpleValueProperty) _value_2).getStringValue();
            _builder.append(_stringValue_1, "");
            _builder.append("</");
            String _name_1 = prop.getName();
            _builder.append(_name_1, "");
            _builder.append(">");
            _builder.newLineIfNotEmpty();
          } else {
            if (simpleAsElement) {
              _builder.append("<");
              String _name_2 = prop.getName();
              _builder.append(_name_2, "");
              _builder.append(">");
              ValueProperty _value_3 = prop.getValue();
              Object _simpleAttributeValue = this.simpleAttributeValue(((SimpleValueProperty) _value_3));
              _builder.append(_simpleAttributeValue, "");
              _builder.append("</");
              String _name_3 = prop.getName();
              _builder.append(_name_3, "");
              _builder.append(">");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      } else {
        ValueProperty _value_4 = prop.getValue();
        if ((_value_4 instanceof ListValueProperty)) {
          _builder.append("<");
          String _name_4 = prop.getName();
          _builder.append(_name_4, "");
          _builder.append(">");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          ValueProperty _value_5 = prop.getValue();
          CharSequence _propListContent = this.propListContent(((ListValueProperty) _value_5), importManager, preview, skipController, skipIncludes);
          _builder.append(_propListContent, "	");
          _builder.newLineIfNotEmpty();
          _builder.append("</");
          String _name_5 = prop.getName();
          _builder.append(_name_5, "");
          _builder.append(">");
          _builder.newLineIfNotEmpty();
        } else {
          ValueProperty _value_6 = prop.getValue();
          if ((_value_6 instanceof MapValueProperty)) {
            _builder.append("<");
            String _name_6 = prop.getName();
            _builder.append(_name_6, "");
            _builder.append(">");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            ValueProperty _value_7 = prop.getValue();
            EList<Property> _properties = ((MapValueProperty) _value_7).getProperties();
            CharSequence _propContents = this.propContents(_properties, importManager, preview, true, skipController, skipIncludes);
            _builder.append(_propContents, "	");
            _builder.newLineIfNotEmpty();
            _builder.append("</");
            String _name_7 = prop.getName();
            _builder.append(_name_7, "");
            _builder.append(">");
            _builder.newLineIfNotEmpty();
          } else {
            ValueProperty _value_8 = prop.getValue();
            if ((_value_8 instanceof Element)) {
              _builder.append("<");
              String _name_8 = prop.getName();
              _builder.append(_name_8, "");
              _builder.append(">");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              ValueProperty _value_9 = prop.getValue();
              CharSequence _elementContent = this.elementContent(((Element) _value_9), importManager, preview, skipController, skipIncludes);
              _builder.append(_elementContent, "	");
              _builder.newLineIfNotEmpty();
              _builder.append("</");
              String _name_9 = prop.getName();
              _builder.append(_name_9, "");
              _builder.append(">");
              _builder.newLineIfNotEmpty();
            } else {
              ValueProperty _value_10 = prop.getValue();
              if ((_value_10 instanceof ReferenceValueProperty)) {
                {
                  boolean _not = (!skipIncludes);
                  if (_not) {
                    _builder.append("<");
                    String _name_10 = prop.getName();
                    _builder.append(_name_10, "");
                    _builder.append(">");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("<fx:reference source=\"");
                    ValueProperty _value_11 = prop.getValue();
                    ReferenceType _reference = ((ReferenceValueProperty) _value_11).getReference();
                    String _refname = this.refname(_reference);
                    _builder.append(_refname, "	");
                    _builder.append("\" />");
                    _builder.newLineIfNotEmpty();
                    _builder.append("</");
                    String _name_11 = prop.getName();
                    _builder.append(_name_11, "");
                    _builder.append(">");
                    _builder.newLineIfNotEmpty();
                  }
                }
              } else {
                ValueProperty _value_12 = prop.getValue();
                if ((_value_12 instanceof IncludeValueProperty)) {
                  {
                    boolean _not_1 = (!skipIncludes);
                    if (_not_1) {
                      _builder.append("<");
                      String _name_12 = prop.getName();
                      _builder.append(_name_12, "");
                      _builder.append(">");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("<fx:include");
                      {
                        ValueProperty _value_13 = prop.getValue();
                        String _name_13 = ((IncludeValueProperty) _value_13).getName();
                        boolean _notEquals_1 = (!Objects.equal(_name_13, null));
                        if (_notEquals_1) {
                          _builder.append(" fx:id=\"");
                          ValueProperty _value_14 = prop.getValue();
                          String _name_14 = ((IncludeValueProperty) _value_14).getName();
                          _builder.append(_name_14, "	");
                          _builder.append("\"");
                        }
                      }
                      _builder.append(" source=\"/");
                      ValueProperty _value_15 = prop.getValue();
                      ComponentDefinition _source = ((IncludeValueProperty) _value_15).getSource();
                      String _fullyQualifiedName = this.fullyQualifiedName(_source);
                      String _replaceAll = _fullyQualifiedName.replaceAll("\\.", "/");
                      _builder.append(_replaceAll, "	");
                      _builder.append(".fxml\" />");
                      _builder.newLineIfNotEmpty();
                      _builder.append("</");
                      String _name_15 = prop.getName();
                      _builder.append(_name_15, "");
                      _builder.append(">");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                } else {
                  ValueProperty _value_16 = prop.getValue();
                  if ((_value_16 instanceof CopyValueProperty)) {
                    _builder.append("<");
                    String _name_16 = prop.getName();
                    _builder.append(_name_16, "");
                    _builder.append(">");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("<fx:copy source=\"");
                    ValueProperty _value_17 = prop.getValue();
                    Element _reference_1 = ((CopyValueProperty) _value_17).getReference();
                    String _name_17 = _reference_1.getName();
                    _builder.append(_name_17, "	");
                    _builder.append("\" />");
                    _builder.newLineIfNotEmpty();
                    _builder.append("</");
                    String _name_18 = prop.getName();
                    _builder.append(_name_18, "");
                    _builder.append(">");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence statCallPropContent(final List<StaticCallValueProperty> properties, final ImportManager importManager, final boolean preview, final boolean skipController, final boolean skipIncludes) {
    StringConcatenation _builder = new StringConcatenation();
    {
      final Function1<StaticCallValueProperty,Boolean> _function = new Function1<StaticCallValueProperty,Boolean>() {
          public Boolean apply(final StaticCallValueProperty p) {
            boolean _previewFilter = FXGraphGenerator.this.previewFilter(p, preview);
            return Boolean.valueOf(_previewFilter);
          }
        };
      Iterable<StaticCallValueProperty> _filter = IterableExtensions.<StaticCallValueProperty>filter(properties, _function);
      final Function1<StaticCallValueProperty,Boolean> _function_1 = new Function1<StaticCallValueProperty,Boolean>() {
          public Boolean apply(final StaticCallValueProperty p) {
            boolean _subelementFilter = FXGraphGenerator.this.subelementFilter(p);
            return Boolean.valueOf(_subelementFilter);
          }
        };
      Iterable<StaticCallValueProperty> _filter_1 = IterableExtensions.<StaticCallValueProperty>filter(_filter, _function_1);
      for(final StaticCallValueProperty prop : _filter_1) {
        {
          ValueProperty _value = prop.getValue();
          if ((_value instanceof SimpleValueProperty)) {
            {
              ValueProperty _value_1 = prop.getValue();
              String _stringValue = ((SimpleValueProperty) _value_1).getStringValue();
              boolean _notEquals = (!Objects.equal(_stringValue, null));
              if (_notEquals) {
                _builder.append("<");
                JvmTypeReference _type = prop.getType();
                String _shortName = this.shortName(_type, importManager);
                _builder.append(_shortName, "");
                _builder.append(".");
                String _name = prop.getName();
                _builder.append(_name, "");
                _builder.append(">");
                ValueProperty _value_2 = prop.getValue();
                String _stringValue_1 = ((SimpleValueProperty) _value_2).getStringValue();
                _builder.append(_stringValue_1, "");
                _builder.append("</");
                JvmTypeReference _type_1 = prop.getType();
                String _shortName_1 = this.shortName(_type_1, importManager);
                _builder.append(_shortName_1, "");
                _builder.append(".");
                String _name_1 = prop.getName();
                _builder.append(_name_1, "");
                _builder.append(">");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("<");
                JvmTypeReference _type_2 = prop.getType();
                String _shortName_2 = this.shortName(_type_2, importManager);
                _builder.append(_shortName_2, "");
                _builder.append(".");
                String _name_2 = prop.getName();
                _builder.append(_name_2, "");
                _builder.append(">");
                ValueProperty _value_3 = prop.getValue();
                Object _simpleAttributeValue = this.simpleAttributeValue(((SimpleValueProperty) _value_3));
                _builder.append(_simpleAttributeValue, "");
                _builder.append("</");
                JvmTypeReference _type_3 = prop.getType();
                String _shortName_3 = this.shortName(_type_3, importManager);
                _builder.append(_shortName_3, "");
                _builder.append(".");
                String _name_3 = prop.getName();
                _builder.append(_name_3, "");
                _builder.append(">");
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            ValueProperty _value_4 = prop.getValue();
            if ((_value_4 instanceof ListValueProperty)) {
              _builder.append("<");
              JvmTypeReference _type_4 = prop.getType();
              String _shortName_4 = this.shortName(_type_4, importManager);
              _builder.append(_shortName_4, "");
              _builder.append(".");
              String _name_4 = prop.getName();
              _builder.append(_name_4, "");
              _builder.append(">");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              ValueProperty _value_5 = prop.getValue();
              CharSequence _propListContent = this.propListContent(((ListValueProperty) _value_5), importManager, preview, skipController, skipIncludes);
              _builder.append(_propListContent, "	");
              _builder.newLineIfNotEmpty();
              _builder.append("</");
              JvmTypeReference _type_5 = prop.getType();
              String _shortName_5 = this.shortName(_type_5, importManager);
              _builder.append(_shortName_5, "");
              _builder.append(".");
              String _name_5 = prop.getName();
              _builder.append(_name_5, "");
              _builder.append(">");
              _builder.newLineIfNotEmpty();
            } else {
              ValueProperty _value_6 = prop.getValue();
              if ((_value_6 instanceof MapValueProperty)) {
                _builder.append("<");
                JvmTypeReference _type_6 = prop.getType();
                String _shortName_6 = this.shortName(_type_6, importManager);
                _builder.append(_shortName_6, "");
                _builder.append(".");
                String _name_6 = prop.getName();
                _builder.append(_name_6, "");
                _builder.append(">");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                ValueProperty _value_7 = prop.getValue();
                EList<Property> _properties = ((MapValueProperty) _value_7).getProperties();
                CharSequence _propContents = this.propContents(_properties, importManager, preview, true, skipController, skipIncludes);
                _builder.append(_propContents, "	");
                _builder.newLineIfNotEmpty();
                _builder.append("</");
                JvmTypeReference _type_7 = prop.getType();
                String _shortName_7 = this.shortName(_type_7, importManager);
                _builder.append(_shortName_7, "");
                _builder.append(".");
                String _name_7 = prop.getName();
                _builder.append(_name_7, "");
                _builder.append(">");
                _builder.newLineIfNotEmpty();
              } else {
                ValueProperty _value_8 = prop.getValue();
                if ((_value_8 instanceof Element)) {
                  _builder.append("<");
                  JvmTypeReference _type_8 = prop.getType();
                  String _shortName_8 = this.shortName(_type_8, importManager);
                  _builder.append(_shortName_8, "");
                  _builder.append(".");
                  String _name_8 = prop.getName();
                  _builder.append(_name_8, "");
                  _builder.append(">");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  ValueProperty _value_9 = prop.getValue();
                  CharSequence _elementContent = this.elementContent(((Element) _value_9), importManager, preview, skipController, skipIncludes);
                  _builder.append(_elementContent, "	");
                  _builder.newLineIfNotEmpty();
                  _builder.append("</");
                  JvmTypeReference _type_9 = prop.getType();
                  String _shortName_9 = this.shortName(_type_9, importManager);
                  _builder.append(_shortName_9, "");
                  _builder.append(".");
                  String _name_9 = prop.getName();
                  _builder.append(_name_9, "");
                  _builder.append(">");
                  _builder.newLineIfNotEmpty();
                } else {
                  ValueProperty _value_10 = prop.getValue();
                  if ((_value_10 instanceof ReferenceValueProperty)) {
                    _builder.append("<");
                    JvmTypeReference _type_10 = prop.getType();
                    String _shortName_10 = this.shortName(_type_10, importManager);
                    _builder.append(_shortName_10, "");
                    _builder.append(".");
                    String _name_10 = prop.getName();
                    _builder.append(_name_10, "");
                    _builder.append(">");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("<fx:reference source=\"");
                    ValueProperty _value_11 = prop.getValue();
                    ReferenceType _reference = ((ReferenceValueProperty) _value_11).getReference();
                    String _refname = this.refname(_reference);
                    _builder.append(_refname, "	");
                    _builder.append("\" />");
                    _builder.newLineIfNotEmpty();
                    _builder.append("</");
                    JvmTypeReference _type_11 = prop.getType();
                    String _shortName_11 = this.shortName(_type_11, importManager);
                    _builder.append(_shortName_11, "");
                    _builder.append(".");
                    String _name_11 = prop.getName();
                    _builder.append(_name_11, "");
                    _builder.append(">");
                    _builder.newLineIfNotEmpty();
                  } else {
                    ValueProperty _value_12 = prop.getValue();
                    if ((_value_12 instanceof IncludeValueProperty)) {
                      {
                        boolean _not = (!skipIncludes);
                        if (_not) {
                          _builder.append("<");
                          JvmTypeReference _type_12 = prop.getType();
                          String _shortName_12 = this.shortName(_type_12, importManager);
                          _builder.append(_shortName_12, "");
                          _builder.append(".");
                          String _name_12 = prop.getName();
                          _builder.append(_name_12, "");
                          _builder.append(">");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.append("<fx:include");
                          {
                            ValueProperty _value_13 = prop.getValue();
                            String _name_13 = ((IncludeValueProperty) _value_13).getName();
                            boolean _notEquals_1 = (!Objects.equal(_name_13, null));
                            if (_notEquals_1) {
                              _builder.append(" fx:id=\"");
                              ValueProperty _value_14 = prop.getValue();
                              String _name_14 = ((IncludeValueProperty) _value_14).getName();
                              _builder.append(_name_14, "	");
                              _builder.append("\"");
                            }
                          }
                          _builder.append(" source=\"/");
                          ValueProperty _value_15 = prop.getValue();
                          ComponentDefinition _source = ((IncludeValueProperty) _value_15).getSource();
                          String _fullyQualifiedName = this.fullyQualifiedName(_source);
                          String _replaceAll = _fullyQualifiedName.replaceAll("\\.", "/");
                          _builder.append(_replaceAll, "	");
                          _builder.append(".fxml\" />");
                          _builder.newLineIfNotEmpty();
                          _builder.append("</");
                          JvmTypeReference _type_13 = prop.getType();
                          String _shortName_13 = this.shortName(_type_13, importManager);
                          _builder.append(_shortName_13, "");
                          _builder.append(".");
                          String _name_15 = prop.getName();
                          _builder.append(_name_15, "");
                          _builder.append(">");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    } else {
                      ValueProperty _value_16 = prop.getValue();
                      if ((_value_16 instanceof CopyValueProperty)) {
                        _builder.append("<");
                        JvmTypeReference _type_14 = prop.getType();
                        String _shortName_14 = this.shortName(_type_14, importManager);
                        _builder.append(_shortName_14, "");
                        _builder.append(".");
                        String _name_16 = prop.getName();
                        _builder.append(_name_16, "");
                        _builder.append(">");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("<fx:copy source=\"");
                        ValueProperty _value_17 = prop.getValue();
                        Element _reference_1 = ((CopyValueProperty) _value_17).getReference();
                        String _name_17 = _reference_1.getName();
                        _builder.append(_name_17, "	");
                        _builder.append("\" />");
                        _builder.newLineIfNotEmpty();
                        _builder.append("</");
                        JvmTypeReference _type_15 = prop.getType();
                        String _shortName_15 = this.shortName(_type_15, importManager);
                        _builder.append(_shortName_15, "");
                        _builder.append(".");
                        String _name_18 = prop.getName();
                        _builder.append(_name_18, "");
                        _builder.append(">");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence statPropContent(final List<StaticValueProperty> properties, final ImportManager importManager, final boolean preview, final boolean skipController, final boolean skipIncludes) {
    StringConcatenation _builder = new StringConcatenation();
    {
      final Function1<StaticValueProperty,Boolean> _function = new Function1<StaticValueProperty,Boolean>() {
          public Boolean apply(final StaticValueProperty p) {
            boolean _previewFilter = FXGraphGenerator.this.previewFilter(p, preview);
            return Boolean.valueOf(_previewFilter);
          }
        };
      Iterable<StaticValueProperty> _filter = IterableExtensions.<StaticValueProperty>filter(properties, _function);
      final Function1<StaticValueProperty,Boolean> _function_1 = new Function1<StaticValueProperty,Boolean>() {
          public Boolean apply(final StaticValueProperty p) {
            boolean _subelementFilter = FXGraphGenerator.this.subelementFilter(p);
            return Boolean.valueOf(_subelementFilter);
          }
        };
      Iterable<StaticValueProperty> _filter_1 = IterableExtensions.<StaticValueProperty>filter(_filter, _function_1);
      for(final StaticValueProperty prop : _filter_1) {
        {
          ValueProperty _value = prop.getValue();
          if ((_value instanceof SimpleValueProperty)) {
            {
              ValueProperty _value_1 = prop.getValue();
              String _stringValue = ((SimpleValueProperty) _value_1).getStringValue();
              boolean _notEquals = (!Objects.equal(_stringValue, null));
              if (_notEquals) {
                _builder.append("<");
                JvmTypeReference _type = this.type(prop);
                String _shortName = this.shortName(_type, importManager);
                _builder.append(_shortName, "");
                _builder.append(".");
                String _name = prop.getName();
                _builder.append(_name, "");
                _builder.append(">");
                ValueProperty _value_2 = prop.getValue();
                String _stringValue_1 = ((SimpleValueProperty) _value_2).getStringValue();
                _builder.append(_stringValue_1, "");
                _builder.append("</");
                JvmTypeReference _type_1 = this.type(prop);
                String _shortName_1 = this.shortName(_type_1, importManager);
                _builder.append(_shortName_1, "");
                _builder.append(".");
                String _name_1 = prop.getName();
                _builder.append(_name_1, "");
                _builder.append(">");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("<");
                JvmTypeReference _type_2 = this.type(prop);
                String _shortName_2 = this.shortName(_type_2, importManager);
                _builder.append(_shortName_2, "");
                _builder.append(".");
                String _name_2 = prop.getName();
                _builder.append(_name_2, "");
                _builder.append(">");
                ValueProperty _value_3 = prop.getValue();
                Object _simpleAttributeValue = this.simpleAttributeValue(((SimpleValueProperty) _value_3));
                _builder.append(_simpleAttributeValue, "");
                _builder.append("</");
                JvmTypeReference _type_3 = this.type(prop);
                String _shortName_3 = this.shortName(_type_3, importManager);
                _builder.append(_shortName_3, "");
                _builder.append(".");
                String _name_3 = prop.getName();
                _builder.append(_name_3, "");
                _builder.append(">");
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            ValueProperty _value_4 = prop.getValue();
            if ((_value_4 instanceof ListValueProperty)) {
              _builder.append("<");
              JvmTypeReference _type_4 = this.type(prop);
              String _shortName_4 = this.shortName(_type_4, importManager);
              _builder.append(_shortName_4, "");
              _builder.append(".");
              String _name_4 = prop.getName();
              _builder.append(_name_4, "");
              _builder.append(">");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              ValueProperty _value_5 = prop.getValue();
              CharSequence _propListContent = this.propListContent(((ListValueProperty) _value_5), importManager, preview, skipController, skipIncludes);
              _builder.append(_propListContent, "	");
              _builder.newLineIfNotEmpty();
              _builder.append("</");
              JvmTypeReference _type_5 = this.type(prop);
              String _shortName_5 = this.shortName(_type_5, importManager);
              _builder.append(_shortName_5, "");
              _builder.append(".");
              String _name_5 = prop.getName();
              _builder.append(_name_5, "");
              _builder.append(">");
              _builder.newLineIfNotEmpty();
            } else {
              ValueProperty _value_6 = prop.getValue();
              if ((_value_6 instanceof MapValueProperty)) {
                _builder.append("<");
                JvmTypeReference _type_6 = this.type(prop);
                String _shortName_6 = this.shortName(_type_6, importManager);
                _builder.append(_shortName_6, "");
                _builder.append(".");
                String _name_6 = prop.getName();
                _builder.append(_name_6, "");
                _builder.append(">");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                ValueProperty _value_7 = prop.getValue();
                EList<Property> _properties = ((MapValueProperty) _value_7).getProperties();
                CharSequence _propContents = this.propContents(_properties, importManager, preview, true, skipController, skipIncludes);
                _builder.append(_propContents, "	");
                _builder.newLineIfNotEmpty();
                _builder.append("</");
                JvmTypeReference _type_7 = this.type(prop);
                String _shortName_7 = this.shortName(_type_7, importManager);
                _builder.append(_shortName_7, "");
                _builder.append(".");
                String _name_7 = prop.getName();
                _builder.append(_name_7, "");
                _builder.append(">");
                _builder.newLineIfNotEmpty();
              } else {
                ValueProperty _value_8 = prop.getValue();
                if ((_value_8 instanceof Element)) {
                  _builder.append("<");
                  JvmTypeReference _type_8 = this.type(prop);
                  String _shortName_8 = this.shortName(_type_8, importManager);
                  _builder.append(_shortName_8, "");
                  _builder.append(".");
                  String _name_8 = prop.getName();
                  _builder.append(_name_8, "");
                  _builder.append(">");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t");
                  ValueProperty _value_9 = prop.getValue();
                  CharSequence _elementContent = this.elementContent(((Element) _value_9), importManager, preview, skipController, skipIncludes);
                  _builder.append(_elementContent, "	");
                  _builder.newLineIfNotEmpty();
                  _builder.append("</");
                  JvmTypeReference _type_9 = this.type(prop);
                  String _shortName_9 = this.shortName(_type_9, importManager);
                  _builder.append(_shortName_9, "");
                  _builder.append(".");
                  String _name_9 = prop.getName();
                  _builder.append(_name_9, "");
                  _builder.append(">");
                  _builder.newLineIfNotEmpty();
                } else {
                  ValueProperty _value_10 = prop.getValue();
                  if ((_value_10 instanceof ReferenceValueProperty)) {
                    _builder.append("<");
                    JvmTypeReference _type_10 = this.type(prop);
                    String _shortName_10 = this.shortName(_type_10, importManager);
                    _builder.append(_shortName_10, "");
                    _builder.append(".");
                    String _name_10 = prop.getName();
                    _builder.append(_name_10, "");
                    _builder.append(">");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("<fx:reference source=\"");
                    ValueProperty _value_11 = prop.getValue();
                    ReferenceType _reference = ((ReferenceValueProperty) _value_11).getReference();
                    String _refname = this.refname(_reference);
                    _builder.append(_refname, "	");
                    _builder.append("\" />");
                    _builder.newLineIfNotEmpty();
                    _builder.append("</");
                    JvmTypeReference _type_11 = this.type(prop);
                    String _shortName_11 = this.shortName(_type_11, importManager);
                    _builder.append(_shortName_11, "");
                    _builder.append(".");
                    String _name_11 = prop.getName();
                    _builder.append(_name_11, "");
                    _builder.append(">");
                    _builder.newLineIfNotEmpty();
                  } else {
                    ValueProperty _value_12 = prop.getValue();
                    if ((_value_12 instanceof IncludeValueProperty)) {
                      {
                        boolean _not = (!skipIncludes);
                        if (_not) {
                          _builder.append("<");
                          JvmTypeReference _type_12 = this.type(prop);
                          String _shortName_12 = this.shortName(_type_12, importManager);
                          _builder.append(_shortName_12, "");
                          _builder.append(".");
                          String _name_12 = prop.getName();
                          _builder.append(_name_12, "");
                          _builder.append(">");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t");
                          _builder.append("<fx:include");
                          {
                            ValueProperty _value_13 = prop.getValue();
                            String _name_13 = ((IncludeValueProperty) _value_13).getName();
                            boolean _notEquals_1 = (!Objects.equal(_name_13, null));
                            if (_notEquals_1) {
                              _builder.append(" fx:id=\"");
                              ValueProperty _value_14 = prop.getValue();
                              String _name_14 = ((IncludeValueProperty) _value_14).getName();
                              _builder.append(_name_14, "	");
                              _builder.append("\"");
                            }
                          }
                          _builder.append(" source=\"/");
                          ValueProperty _value_15 = prop.getValue();
                          ComponentDefinition _source = ((IncludeValueProperty) _value_15).getSource();
                          String _fullyQualifiedName = this.fullyQualifiedName(_source);
                          String _replaceAll = _fullyQualifiedName.replaceAll("\\.", "/");
                          _builder.append(_replaceAll, "	");
                          _builder.append(".fxml\" />");
                          _builder.newLineIfNotEmpty();
                          _builder.append("</");
                          JvmTypeReference _type_13 = this.type(prop);
                          String _shortName_13 = this.shortName(_type_13, importManager);
                          _builder.append(_shortName_13, "");
                          _builder.append(".");
                          String _name_15 = prop.getName();
                          _builder.append(_name_15, "");
                          _builder.append(">");
                          _builder.newLineIfNotEmpty();
                        }
                      }
                    } else {
                      ValueProperty _value_16 = prop.getValue();
                      if ((_value_16 instanceof CopyValueProperty)) {
                        _builder.append("<");
                        JvmTypeReference _type_14 = this.type(prop);
                        String _shortName_14 = this.shortName(_type_14, importManager);
                        _builder.append(_shortName_14, "");
                        _builder.append(".");
                        String _name_16 = prop.getName();
                        _builder.append(_name_16, "");
                        _builder.append(">");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t");
                        _builder.append("<fx:copy source=\"");
                        ValueProperty _value_17 = prop.getValue();
                        Element _reference_1 = ((CopyValueProperty) _value_17).getReference();
                        String _name_17 = _reference_1.getName();
                        _builder.append(_name_17, "	");
                        _builder.append("\" />");
                        _builder.newLineIfNotEmpty();
                        _builder.append("</");
                        JvmTypeReference _type_15 = this.type(prop);
                        String _shortName_15 = this.shortName(_type_15, importManager);
                        _builder.append(_shortName_15, "");
                        _builder.append(".");
                        String _name_18 = prop.getName();
                        _builder.append(_name_18, "");
                        _builder.append(">");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public JvmTypeReference type(final StaticValueProperty prop) {
    EObject el = prop.eContainer();
    EObject _eContainer = el.eContainer();
    boolean _notEquals = (!Objects.equal(_eContainer, null));
    boolean _while = _notEquals;
    while (_while) {
      {
        EObject _eContainer_1 = el.eContainer();
        if ((_eContainer_1 instanceof Element)) {
          EObject _eContainer_2 = el.eContainer();
          final Element e = ((Element) _eContainer_2);
          return e.getType();
        }
        EObject _eContainer_3 = el.eContainer();
        el = _eContainer_3;
      }
      EObject _eContainer_1 = el.eContainer();
      boolean _notEquals_1 = (!Objects.equal(_eContainer_1, null));
      _while = _notEquals_1;
    }
    return null;
  }
  
  public String refname(final ReferenceType e) {
    if ((e instanceof Element)) {
      return ((Element) e).getName();
    } else {
      return ((IncludeValueProperty) e).getName();
    }
  }
  
  public CharSequence propListContent(final ListValueProperty listProp, final ImportManager importManager, final boolean preview, final boolean skipController, final boolean skipIncludes) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ListValueElement> _value = listProp.getValue();
      for(final ListValueElement e : _value) {
        {
          if ((e instanceof Element)) {
            CharSequence _elementContent = this.elementContent(((Element) e), importManager, preview, skipController, skipIncludes);
            _builder.append(_elementContent, "");
            _builder.newLineIfNotEmpty();
          } else {
            if ((e instanceof ReferenceValueProperty)) {
              _builder.append("<fx:reference source=\"");
              ReferenceType _reference = ((ReferenceValueProperty) e).getReference();
              String _refname = this.refname(_reference);
              _builder.append(_refname, "");
              _builder.append("\" />");
              _builder.newLineIfNotEmpty();
            } else {
              if ((e instanceof IncludeValueProperty)) {
                {
                  boolean _not = (!skipIncludes);
                  if (_not) {
                    _builder.append("<fx:include");
                    {
                      String _name = ((IncludeValueProperty) e).getName();
                      boolean _notEquals = (!Objects.equal(_name, null));
                      if (_notEquals) {
                        _builder.append(" fx:id=\"");
                        String _name_1 = ((IncludeValueProperty) e).getName();
                        _builder.append(_name_1, "");
                        _builder.append("\"");
                      }
                    }
                    _builder.append(" source=\"/");
                    ComponentDefinition _source = ((IncludeValueProperty) e).getSource();
                    String _fullyQualifiedName = this.fullyQualifiedName(_source);
                    String _replaceAll = _fullyQualifiedName.replaceAll("\\.", "/");
                    _builder.append(_replaceAll, "");
                    _builder.append(".fxml\" />");
                    _builder.newLineIfNotEmpty();
                  }
                }
              } else {
                if ((e instanceof SimpleValueProperty)) {
                  String _objectLiteral = this.objectLiteral(((SimpleValueProperty) e));
                  _builder.append(_objectLiteral, "");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public String fullyQualifiedName(final ComponentDefinition cp) {
    Resource _eResource = cp.eResource();
    EList<EObject> _contents = _eResource.getContents();
    EObject _get = _contents.get(0);
    final Model m = ((Model) _get);
    PackageDeclaration _package = m.getPackage();
    boolean _notEquals = (!Objects.equal(_package, null));
    if (_notEquals) {
      PackageDeclaration _package_1 = m.getPackage();
      String _name = _package_1.getName();
      String _plus = (_name + ".");
      String _name_1 = cp.getName();
      return (_plus + _name_1);
    } else {
      return cp.getName();
    }
  }
  
  public String fxElementAttributes(final Element element, final ImportManager importManager, final boolean skipController) {
    StringBuilder _stringBuilder = new StringBuilder();
    StringBuilder builder = _stringBuilder;
    String _name = element.getName();
    boolean _notEquals = (!Objects.equal(_name, null));
    if (_notEquals) {
      String _name_1 = element.getName();
      String _plus = (" fx:id=\"" + _name_1);
      String _plus_1 = (_plus + "\"");
      builder.append(_plus_1);
    }
    SimpleValueProperty _value = element.getValue();
    boolean _notEquals_1 = (!Objects.equal(_value, null));
    if (_notEquals_1) {
      SimpleValueProperty _value_1 = element.getValue();
      Object _simpleAttributeValue = this.simpleAttributeValue(_value_1);
      String _plus_2 = (" fx:value=\"" + ((Comparable<Object>)_simpleAttributeValue));
      String _plus_3 = (_plus_2 + "\"");
      builder.append(_plus_3);
    } else {
      String _factory = element.getFactory();
      boolean _notEquals_2 = (!Objects.equal(_factory, null));
      if (_notEquals_2) {
        String _factory_1 = element.getFactory();
        String _plus_4 = (" fx:factory=\"" + _factory_1);
        String _plus_5 = (_plus_4 + "\"");
        builder.append(_plus_5);
      }
    }
    return builder.toString();
  }
  
  public StringBuilder elementAttributes(final List<Property> properties, final boolean preview, final boolean skipController) {
    StringBuilder _stringBuilder = new StringBuilder();
    StringBuilder builder = _stringBuilder;
    final Function1<Property,Boolean> _function = new Function1<Property,Boolean>() {
        public Boolean apply(final Property p) {
          boolean _previewFilter = FXGraphGenerator.this.previewFilter(p, preview);
          return Boolean.valueOf(_previewFilter);
        }
      };
    Iterable<Property> _filter = IterableExtensions.<Property>filter(properties, _function);
    final Function1<Property,Boolean> _function_1 = new Function1<Property,Boolean>() {
        public Boolean apply(final Property p) {
          boolean _elementAttributeFilter = FXGraphGenerator.this.elementAttributeFilter(p);
          return Boolean.valueOf(_elementAttributeFilter);
        }
      };
    Iterable<Property> _filter_1 = IterableExtensions.<Property>filter(_filter, _function_1);
    for (final Property p : _filter_1) {
      ValueProperty _value = p.getValue();
      if ((_value instanceof SimpleValueProperty)) {
        String _name = p.getName();
        String _plus = (" " + _name);
        String _plus_1 = (_plus + "=\"");
        ValueProperty _value_1 = p.getValue();
        Object _simpleAttributeValue = this.simpleAttributeValue(((SimpleValueProperty) _value_1));
        String _plus_2 = (_plus_1 + ((Comparable<Object>)_simpleAttributeValue));
        String _plus_3 = (_plus_2 + "\"");
        builder.append(_plus_3);
      } else {
        ValueProperty _value_2 = p.getValue();
        if ((_value_2 instanceof ReferenceValueProperty)) {
          String _name_1 = p.getName();
          String _plus_4 = (" " + _name_1);
          String _plus_5 = (_plus_4 + "=\"$");
          ValueProperty _value_3 = p.getValue();
          ReferenceType _reference = ((ReferenceValueProperty) _value_3).getReference();
          String _refname = this.refname(_reference);
          String _plus_6 = (_plus_5 + _refname);
          String _plus_7 = (_plus_6 + "\"");
          builder.append(_plus_7);
        } else {
          ValueProperty _value_4 = p.getValue();
          if ((_value_4 instanceof ControllerHandledValueProperty)) {
            boolean _not = (!skipController);
            if (_not) {
              String _name_2 = p.getName();
              String _plus_8 = (" " + _name_2);
              String _plus_9 = (_plus_8 + "=\"#");
              ValueProperty _value_5 = p.getValue();
              String _methodname = ((ControllerHandledValueProperty) _value_5).getMethodname();
              String _plus_10 = (_plus_9 + _methodname);
              String _plus_11 = (_plus_10 + "\"");
              builder.append(_plus_11);
            }
          } else {
            ValueProperty _value_6 = p.getValue();
            if ((_value_6 instanceof ScriptHandlerHandledValueProperty)) {
              boolean _not_1 = (!skipController);
              if (_not_1) {
                String _name_3 = p.getName();
                String _plus_12 = (" " + _name_3);
                String _plus_13 = (_plus_12 + "=\"");
                ValueProperty _value_7 = p.getValue();
                String _functionname = ((ScriptHandlerHandledValueProperty) _value_7).getFunctionname();
                String _plus_14 = (_plus_13 + _functionname);
                String _plus_15 = (_plus_14 + "\"");
                builder.append(_plus_15);
              }
            } else {
              ValueProperty _value_8 = p.getValue();
              if ((_value_8 instanceof ScriptValueExpression)) {
                boolean _not_2 = (!skipController);
                if (_not_2) {
                  String _name_4 = p.getName();
                  String _plus_16 = (" " + _name_4);
                  String _plus_17 = (_plus_16 + "=\"");
                  ValueProperty _value_9 = p.getValue();
                  String _sourcecode = ((ScriptValueExpression) _value_9).getSourcecode();
                  ValueProperty _value_10 = p.getValue();
                  String _sourcecode_1 = ((ScriptValueExpression) _value_10).getSourcecode();
                  int _length = _sourcecode_1.length();
                  int _minus = (_length - 2);
                  String _substring = _sourcecode.substring(2, _minus);
                  String _trim = _substring.trim();
                  String _plus_18 = (_plus_17 + _trim);
                  String _plus_19 = (_plus_18 + ";\"");
                  builder.append(_plus_19);
                }
              } else {
                ValueProperty _value_11 = p.getValue();
                if ((_value_11 instanceof ScriptValueReference)) {
                  boolean _not_3 = (!skipController);
                  if (_not_3) {
                    String _name_5 = p.getName();
                    String _plus_20 = (" " + _name_5);
                    String _plus_21 = (_plus_20 + "=\"$");
                    ValueProperty _value_12 = p.getValue();
                    String _reference_1 = ((ScriptValueReference) _value_12).getReference();
                    String _plus_22 = (_plus_21 + _reference_1);
                    String _plus_23 = (_plus_22 + "\"");
                    builder.append(_plus_23);
                  }
                } else {
                  ValueProperty _value_13 = p.getValue();
                  if ((_value_13 instanceof LocationValueProperty)) {
                    String _name_6 = p.getName();
                    String _plus_24 = (" " + _name_6);
                    String _plus_25 = (_plus_24 + "=\"@");
                    ValueProperty _value_14 = p.getValue();
                    String _value_15 = ((LocationValueProperty) _value_14).getValue();
                    String _plus_26 = (_plus_25 + _value_15);
                    String _plus_27 = (_plus_26 + "\"");
                    builder.append(_plus_27);
                  } else {
                    ValueProperty _value_16 = p.getValue();
                    if ((_value_16 instanceof ResourceValueProperty)) {
                      String _name_7 = p.getName();
                      String _plus_28 = (" " + _name_7);
                      String _plus_29 = (_plus_28 + "=\"%");
                      ValueProperty _value_17 = p.getValue();
                      StringValue _value_18 = ((ResourceValueProperty) _value_17).getValue();
                      String _value_19 = _value_18.getValue();
                      String _plus_30 = (_plus_29 + _value_19);
                      String _plus_31 = (_plus_30 + "\"");
                      builder.append(_plus_31);
                    } else {
                      ValueProperty _value_20 = p.getValue();
                      if ((_value_20 instanceof BindValueProperty)) {
                        String _name_8 = p.getName();
                        String _plus_32 = (" " + _name_8);
                        String _plus_33 = (_plus_32 + "=\"${");
                        ValueProperty _value_21 = p.getValue();
                        Element _elementReference = ((BindValueProperty) _value_21).getElementReference();
                        String _name_9 = _elementReference.getName();
                        String _plus_34 = (_plus_33 + _name_9);
                        String _plus_35 = (_plus_34 + ".");
                        ValueProperty _value_22 = p.getValue();
                        String _attribute = ((BindValueProperty) _value_22).getAttribute();
                        String _plus_36 = (_plus_35 + _attribute);
                        String _plus_37 = (_plus_36 + "}\"");
                        builder.append(_plus_37);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return builder;
  }
  
  public StringBuilder elementStaticCallAttributes(final List<StaticCallValueProperty> properties, final ImportManager importManager, final boolean preview, final boolean skipController) {
    StringBuilder _stringBuilder = new StringBuilder();
    StringBuilder builder = _stringBuilder;
    final Function1<StaticCallValueProperty,Boolean> _function = new Function1<StaticCallValueProperty,Boolean>() {
        public Boolean apply(final StaticCallValueProperty p) {
          boolean _previewFilter = FXGraphGenerator.this.previewFilter(p, preview);
          return Boolean.valueOf(_previewFilter);
        }
      };
    Iterable<StaticCallValueProperty> _filter = IterableExtensions.<StaticCallValueProperty>filter(properties, _function);
    final Function1<StaticCallValueProperty,Boolean> _function_1 = new Function1<StaticCallValueProperty,Boolean>() {
        public Boolean apply(final StaticCallValueProperty p) {
          boolean _elementAttributeFilter = FXGraphGenerator.this.elementAttributeFilter(p);
          return Boolean.valueOf(_elementAttributeFilter);
        }
      };
    Iterable<StaticCallValueProperty> _filter_1 = IterableExtensions.<StaticCallValueProperty>filter(_filter, _function_1);
    for (final StaticCallValueProperty p : _filter_1) {
      ValueProperty _value = p.getValue();
      if ((_value instanceof SimpleValueProperty)) {
        JvmTypeReference _type = p.getType();
        String _shortName = this.shortName(_type, importManager);
        String _plus = (" " + _shortName);
        String _plus_1 = (_plus + ".");
        String _name = p.getName();
        String _plus_2 = (_plus_1 + _name);
        String _plus_3 = (_plus_2 + "=\"");
        ValueProperty _value_1 = p.getValue();
        Object _simpleAttributeValue = this.simpleAttributeValue(((SimpleValueProperty) _value_1));
        String _plus_4 = (_plus_3 + ((Comparable<Object>)_simpleAttributeValue));
        String _plus_5 = (_plus_4 + "\"");
        builder.append(_plus_5);
      } else {
        ValueProperty _value_2 = p.getValue();
        if ((_value_2 instanceof ReferenceValueProperty)) {
          JvmTypeReference _type_1 = p.getType();
          String _shortName_1 = this.shortName(_type_1, importManager);
          String _plus_6 = (" " + _shortName_1);
          String _plus_7 = (_plus_6 + ".");
          String _name_1 = p.getName();
          String _plus_8 = (_plus_7 + _name_1);
          String _plus_9 = (_plus_8 + "=\"$");
          ValueProperty _value_3 = p.getValue();
          ReferenceType _reference = ((ReferenceValueProperty) _value_3).getReference();
          String _refname = this.refname(_reference);
          String _plus_10 = (_plus_9 + _refname);
          String _plus_11 = (_plus_10 + "\"");
          builder.append(_plus_11);
        } else {
          ValueProperty _value_4 = p.getValue();
          if ((_value_4 instanceof ControllerHandledValueProperty)) {
            boolean _not = (!skipController);
            if (_not) {
              JvmTypeReference _type_2 = p.getType();
              String _shortName_2 = this.shortName(_type_2, importManager);
              String _plus_12 = (" " + _shortName_2);
              String _plus_13 = (_plus_12 + ".");
              String _name_2 = p.getName();
              String _plus_14 = (_plus_13 + _name_2);
              String _plus_15 = (_plus_14 + "=\"#");
              ValueProperty _value_5 = p.getValue();
              String _methodname = ((ControllerHandledValueProperty) _value_5).getMethodname();
              String _plus_16 = (_plus_15 + _methodname);
              String _plus_17 = (_plus_16 + "\"");
              builder.append(_plus_17);
            }
          } else {
            ValueProperty _value_6 = p.getValue();
            if ((_value_6 instanceof ScriptHandlerHandledValueProperty)) {
              boolean _not_1 = (!skipController);
              if (_not_1) {
                JvmTypeReference _type_3 = p.getType();
                String _shortName_3 = this.shortName(_type_3, importManager);
                String _plus_18 = (" " + _shortName_3);
                String _plus_19 = (_plus_18 + ".");
                String _name_3 = p.getName();
                String _plus_20 = (_plus_19 + _name_3);
                String _plus_21 = (_plus_20 + "=\"");
                ValueProperty _value_7 = p.getValue();
                String _functionname = ((ScriptHandlerHandledValueProperty) _value_7).getFunctionname();
                String _plus_22 = (_plus_21 + _functionname);
                String _plus_23 = (_plus_22 + "\"");
                builder.append(_plus_23);
              }
            } else {
              ValueProperty _value_8 = p.getValue();
              if ((_value_8 instanceof ScriptValueExpression)) {
                boolean _not_2 = (!skipController);
                if (_not_2) {
                  JvmTypeReference _type_4 = p.getType();
                  String _shortName_4 = this.shortName(_type_4, importManager);
                  String _plus_24 = (" " + _shortName_4);
                  String _plus_25 = (_plus_24 + ".");
                  String _name_4 = p.getName();
                  String _plus_26 = (_plus_25 + _name_4);
                  String _plus_27 = (_plus_26 + "=\"");
                  ValueProperty _value_9 = p.getValue();
                  String _sourcecode = ((ScriptValueExpression) _value_9).getSourcecode();
                  ValueProperty _value_10 = p.getValue();
                  String _sourcecode_1 = ((ScriptValueExpression) _value_10).getSourcecode();
                  int _length = _sourcecode_1.length();
                  int _minus = (_length - 2);
                  String _substring = _sourcecode.substring(2, _minus);
                  String _trim = _substring.trim();
                  String _plus_28 = (_plus_27 + _trim);
                  String _plus_29 = (_plus_28 + ";\"");
                  builder.append(_plus_29);
                }
              } else {
                ValueProperty _value_11 = p.getValue();
                if ((_value_11 instanceof ScriptValueReference)) {
                  boolean _not_3 = (!skipController);
                  if (_not_3) {
                    JvmTypeReference _type_5 = p.getType();
                    String _shortName_5 = this.shortName(_type_5, importManager);
                    String _plus_30 = (" " + _shortName_5);
                    String _plus_31 = (_plus_30 + ".");
                    String _name_5 = p.getName();
                    String _plus_32 = (_plus_31 + _name_5);
                    String _plus_33 = (_plus_32 + "=\"$");
                    ValueProperty _value_12 = p.getValue();
                    String _reference_1 = ((ScriptValueReference) _value_12).getReference();
                    String _plus_34 = (_plus_33 + _reference_1);
                    String _plus_35 = (_plus_34 + "\"");
                    builder.append(_plus_35);
                  }
                } else {
                  ValueProperty _value_13 = p.getValue();
                  if ((_value_13 instanceof LocationValueProperty)) {
                    JvmTypeReference _type_6 = p.getType();
                    String _shortName_6 = this.shortName(_type_6, importManager);
                    String _plus_36 = (" " + _shortName_6);
                    String _plus_37 = (_plus_36 + ".");
                    String _name_6 = p.getName();
                    String _plus_38 = (_plus_37 + _name_6);
                    String _plus_39 = (_plus_38 + "=\"@");
                    ValueProperty _value_14 = p.getValue();
                    String _value_15 = ((LocationValueProperty) _value_14).getValue();
                    String _plus_40 = (_plus_39 + _value_15);
                    String _plus_41 = (_plus_40 + "\"");
                    builder.append(_plus_41);
                  } else {
                    ValueProperty _value_16 = p.getValue();
                    if ((_value_16 instanceof ResourceValueProperty)) {
                      JvmTypeReference _type_7 = p.getType();
                      String _shortName_7 = this.shortName(_type_7, importManager);
                      String _plus_42 = (" " + _shortName_7);
                      String _plus_43 = (_plus_42 + ".");
                      String _name_7 = p.getName();
                      String _plus_44 = (_plus_43 + _name_7);
                      String _plus_45 = (_plus_44 + "=\"%");
                      ValueProperty _value_17 = p.getValue();
                      StringValue _value_18 = ((ResourceValueProperty) _value_17).getValue();
                      String _value_19 = _value_18.getValue();
                      String _plus_46 = (_plus_45 + _value_19);
                      String _plus_47 = (_plus_46 + "\"");
                      builder.append(_plus_47);
                    } else {
                      ValueProperty _value_20 = p.getValue();
                      if ((_value_20 instanceof BindValueProperty)) {
                        JvmTypeReference _type_8 = p.getType();
                        String _shortName_8 = this.shortName(_type_8, importManager);
                        String _plus_48 = (" " + _shortName_8);
                        String _plus_49 = (_plus_48 + ".");
                        String _name_8 = p.getName();
                        String _plus_50 = (_plus_49 + _name_8);
                        String _plus_51 = (_plus_50 + "=\"${");
                        ValueProperty _value_21 = p.getValue();
                        Element _elementReference = ((BindValueProperty) _value_21).getElementReference();
                        String _name_9 = _elementReference.getName();
                        String _plus_52 = (_plus_51 + _name_9);
                        String _plus_53 = (_plus_52 + ".");
                        ValueProperty _value_22 = p.getValue();
                        String _attribute = ((BindValueProperty) _value_22).getAttribute();
                        String _plus_54 = (_plus_53 + _attribute);
                        String _plus_55 = (_plus_54 + "}\"");
                        builder.append(_plus_55);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return builder;
  }
  
  public StringBuilder elementStaticAttributes(final List<StaticValueProperty> properties, final ImportManager importManager, final boolean preview, final boolean skipController) {
    StringBuilder _stringBuilder = new StringBuilder();
    StringBuilder builder = _stringBuilder;
    final Function1<StaticValueProperty,Boolean> _function = new Function1<StaticValueProperty,Boolean>() {
        public Boolean apply(final StaticValueProperty p) {
          boolean _previewFilter = FXGraphGenerator.this.previewFilter(p, preview);
          return Boolean.valueOf(_previewFilter);
        }
      };
    Iterable<StaticValueProperty> _filter = IterableExtensions.<StaticValueProperty>filter(properties, _function);
    final Function1<StaticValueProperty,Boolean> _function_1 = new Function1<StaticValueProperty,Boolean>() {
        public Boolean apply(final StaticValueProperty p) {
          boolean _elementAttributeFilter = FXGraphGenerator.this.elementAttributeFilter(p);
          return Boolean.valueOf(_elementAttributeFilter);
        }
      };
    Iterable<StaticValueProperty> _filter_1 = IterableExtensions.<StaticValueProperty>filter(_filter, _function_1);
    for (final StaticValueProperty p : _filter_1) {
      ValueProperty _value = p.getValue();
      if ((_value instanceof SimpleValueProperty)) {
        JvmTypeReference _type = this.type(p);
        String _shortName = this.shortName(_type, importManager);
        String _plus = (" " + _shortName);
        String _plus_1 = (_plus + ".");
        String _name = p.getName();
        String _plus_2 = (_plus_1 + _name);
        String _plus_3 = (_plus_2 + "=\"");
        ValueProperty _value_1 = p.getValue();
        Object _simpleAttributeValue = this.simpleAttributeValue(((SimpleValueProperty) _value_1));
        String _plus_4 = (_plus_3 + ((Comparable<Object>)_simpleAttributeValue));
        String _plus_5 = (_plus_4 + "\"");
        builder.append(_plus_5);
      } else {
        ValueProperty _value_2 = p.getValue();
        if ((_value_2 instanceof ReferenceValueProperty)) {
          JvmTypeReference _type_1 = this.type(p);
          String _shortName_1 = this.shortName(_type_1, importManager);
          String _plus_6 = (" " + _shortName_1);
          String _plus_7 = (_plus_6 + ".");
          String _name_1 = p.getName();
          String _plus_8 = (_plus_7 + _name_1);
          String _plus_9 = (_plus_8 + "=\"$");
          ValueProperty _value_3 = p.getValue();
          ReferenceType _reference = ((ReferenceValueProperty) _value_3).getReference();
          String _refname = this.refname(_reference);
          String _plus_10 = (_plus_9 + _refname);
          String _plus_11 = (_plus_10 + "\"");
          builder.append(_plus_11);
        } else {
          ValueProperty _value_4 = p.getValue();
          if ((_value_4 instanceof ControllerHandledValueProperty)) {
            boolean _not = (!skipController);
            if (_not) {
              JvmTypeReference _type_2 = this.type(p);
              String _shortName_2 = this.shortName(_type_2, importManager);
              String _plus_12 = (" " + _shortName_2);
              String _plus_13 = (_plus_12 + ".");
              String _name_2 = p.getName();
              String _plus_14 = (_plus_13 + _name_2);
              String _plus_15 = (_plus_14 + "=\"#");
              ValueProperty _value_5 = p.getValue();
              String _methodname = ((ControllerHandledValueProperty) _value_5).getMethodname();
              String _plus_16 = (_plus_15 + _methodname);
              String _plus_17 = (_plus_16 + "\"");
              builder.append(_plus_17);
            }
          } else {
            ValueProperty _value_6 = p.getValue();
            if ((_value_6 instanceof ScriptHandlerHandledValueProperty)) {
              boolean _not_1 = (!skipController);
              if (_not_1) {
                JvmTypeReference _type_3 = this.type(p);
                String _shortName_3 = this.shortName(_type_3, importManager);
                String _plus_18 = (" " + _shortName_3);
                String _plus_19 = (_plus_18 + ".");
                String _name_3 = p.getName();
                String _plus_20 = (_plus_19 + _name_3);
                String _plus_21 = (_plus_20 + "=\"");
                ValueProperty _value_7 = p.getValue();
                String _functionname = ((ScriptHandlerHandledValueProperty) _value_7).getFunctionname();
                String _plus_22 = (_plus_21 + _functionname);
                String _plus_23 = (_plus_22 + "\"");
                builder.append(_plus_23);
              }
            } else {
              ValueProperty _value_8 = p.getValue();
              if ((_value_8 instanceof ScriptValueExpression)) {
                boolean _not_2 = (!skipController);
                if (_not_2) {
                  JvmTypeReference _type_4 = this.type(p);
                  String _shortName_4 = this.shortName(_type_4, importManager);
                  String _plus_24 = (" " + _shortName_4);
                  String _plus_25 = (_plus_24 + ".");
                  String _name_4 = p.getName();
                  String _plus_26 = (_plus_25 + _name_4);
                  String _plus_27 = (_plus_26 + "=\"");
                  ValueProperty _value_9 = p.getValue();
                  String _sourcecode = ((ScriptValueExpression) _value_9).getSourcecode();
                  ValueProperty _value_10 = p.getValue();
                  String _sourcecode_1 = ((ScriptValueExpression) _value_10).getSourcecode();
                  int _length = _sourcecode_1.length();
                  int _minus = (_length - 2);
                  String _substring = _sourcecode.substring(2, _minus);
                  String _trim = _substring.trim();
                  String _plus_28 = (_plus_27 + _trim);
                  String _plus_29 = (_plus_28 + ";\"");
                  builder.append(_plus_29);
                }
              } else {
                ValueProperty _value_11 = p.getValue();
                if ((_value_11 instanceof ScriptValueReference)) {
                  boolean _not_3 = (!skipController);
                  if (_not_3) {
                    JvmTypeReference _type_5 = this.type(p);
                    String _shortName_5 = this.shortName(_type_5, importManager);
                    String _plus_30 = (" " + _shortName_5);
                    String _plus_31 = (_plus_30 + ".");
                    String _name_5 = p.getName();
                    String _plus_32 = (_plus_31 + _name_5);
                    String _plus_33 = (_plus_32 + "=\"$");
                    ValueProperty _value_12 = p.getValue();
                    String _reference_1 = ((ScriptValueReference) _value_12).getReference();
                    String _plus_34 = (_plus_33 + _reference_1);
                    String _plus_35 = (_plus_34 + "\"");
                    builder.append(_plus_35);
                  }
                } else {
                  ValueProperty _value_13 = p.getValue();
                  if ((_value_13 instanceof LocationValueProperty)) {
                    JvmTypeReference _type_6 = this.type(p);
                    String _shortName_6 = this.shortName(_type_6, importManager);
                    String _plus_36 = (" " + _shortName_6);
                    String _plus_37 = (_plus_36 + ".");
                    String _name_6 = p.getName();
                    String _plus_38 = (_plus_37 + _name_6);
                    String _plus_39 = (_plus_38 + "=\"@");
                    ValueProperty _value_14 = p.getValue();
                    String _value_15 = ((LocationValueProperty) _value_14).getValue();
                    String _plus_40 = (_plus_39 + _value_15);
                    String _plus_41 = (_plus_40 + "\"");
                    builder.append(_plus_41);
                  } else {
                    ValueProperty _value_16 = p.getValue();
                    if ((_value_16 instanceof ResourceValueProperty)) {
                      JvmTypeReference _type_7 = this.type(p);
                      String _shortName_7 = this.shortName(_type_7, importManager);
                      String _plus_42 = (" " + _shortName_7);
                      String _plus_43 = (_plus_42 + ".");
                      String _name_7 = p.getName();
                      String _plus_44 = (_plus_43 + _name_7);
                      String _plus_45 = (_plus_44 + "=\"%");
                      ValueProperty _value_17 = p.getValue();
                      StringValue _value_18 = ((ResourceValueProperty) _value_17).getValue();
                      String _value_19 = _value_18.getValue();
                      String _plus_46 = (_plus_45 + _value_19);
                      String _plus_47 = (_plus_46 + "\"");
                      builder.append(_plus_47);
                    } else {
                      ValueProperty _value_20 = p.getValue();
                      if ((_value_20 instanceof BindValueProperty)) {
                        JvmTypeReference _type_8 = this.type(p);
                        String _shortName_8 = this.shortName(_type_8, importManager);
                        String _plus_48 = (" " + _shortName_8);
                        String _plus_49 = (_plus_48 + ".");
                        String _name_8 = p.getName();
                        String _plus_50 = (_plus_49 + _name_8);
                        String _plus_51 = (_plus_50 + "=\"${");
                        ValueProperty _value_21 = p.getValue();
                        Element _elementReference = ((BindValueProperty) _value_21).getElementReference();
                        String _name_9 = _elementReference.getName();
                        String _plus_52 = (_plus_51 + _name_9);
                        String _plus_53 = (_plus_52 + ".");
                        ValueProperty _value_22 = p.getValue();
                        String _attribute = ((BindValueProperty) _value_22).getAttribute();
                        String _plus_54 = (_plus_53 + _attribute);
                        String _plus_55 = (_plus_54 + "}\"");
                        builder.append(_plus_55);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return builder;
  }
  
  public boolean subelementFilter(final Property property) {
    boolean _elementAttributeFilter = this.elementAttributeFilter(property);
    return (!_elementAttributeFilter);
  }
  
  public boolean elementAttributeFilter(final Property property) {
    ValueProperty _value = property.getValue();
    return this.elementAttributeFilter(_value);
  }
  
  public boolean subelementFilter(final StaticCallValueProperty property) {
    boolean _elementAttributeFilter = this.elementAttributeFilter(property);
    return (!_elementAttributeFilter);
  }
  
  public boolean elementAttributeFilter(final StaticCallValueProperty property) {
    ValueProperty _value = property.getValue();
    return this.elementAttributeFilter(_value);
  }
  
  public boolean subelementFilter(final StaticValueProperty property) {
    boolean _elementAttributeFilter = this.elementAttributeFilter(property);
    return (!_elementAttributeFilter);
  }
  
  public boolean elementAttributeFilter(final StaticValueProperty property) {
    ValueProperty _value = property.getValue();
    return this.elementAttributeFilter(_value);
  }
  
  public boolean elementAttributeFilter(final ValueProperty value) {
    if ((value instanceof SimpleValueProperty)) {
      return true;
    } else {
      if ((value instanceof ReferenceValueProperty)) {
        return true;
      } else {
        if ((value instanceof ControllerHandledValueProperty)) {
          return true;
        } else {
          if ((value instanceof ScriptHandlerHandledValueProperty)) {
            return true;
          } else {
            if ((value instanceof ScriptValueReference)) {
              return true;
            } else {
              if ((value instanceof ScriptValueExpression)) {
                return true;
              } else {
                if ((value instanceof LocationValueProperty)) {
                  return true;
                } else {
                  if ((value instanceof ResourceValueProperty)) {
                    return true;
                  } else {
                    if ((value instanceof BindValueProperty)) {
                      return true;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return false;
  }
  
  public Object simpleAttributeValue(final SimpleValueProperty value) {
    String _stringValue = value.getStringValue();
    boolean _notEquals = (!Objects.equal(_stringValue, null));
    if (_notEquals) {
      return value.getStringValue();
    } else {
      String _booleanValue = value.getBooleanValue();
      boolean _notEquals_1 = (!Objects.equal(_booleanValue, null));
      if (_notEquals_1) {
        return value.getBooleanValue();
      } else {
        double _realValue = value.getRealValue();
        boolean _notEquals_2 = (_realValue != 0);
        if (_notEquals_2) {
          boolean _isNegative = value.isNegative();
          if (_isNegative) {
            double _realValue_1 = value.getRealValue();
            return ("-" + Double.valueOf(_realValue_1));
          } else {
            return Double.valueOf(value.getRealValue());
          }
        } else {
          boolean _isNegative_1 = value.isNegative();
          if (_isNegative_1) {
            int _intValue = value.getIntValue();
            return ("-" + Integer.valueOf(_intValue));
          } else {
            return Integer.valueOf(value.getIntValue());
          }
        }
      }
    }
  }
  
  public boolean previewFilter(final Property property, final boolean preview) {
    boolean _not = (!preview);
    if (_not) {
      String _modifier = property.getModifier();
      boolean _equals = "preview".equals(_modifier);
      if (_equals) {
        return false;
      }
    } else {
      String _modifier_1 = property.getModifier();
      boolean _equals_1 = "runtime-only".equals(_modifier_1);
      if (_equals_1) {
        return false;
      }
    }
    return true;
  }
  
  public boolean previewFilter(final StaticCallValueProperty property, final boolean preview) {
    boolean _not = (!preview);
    if (_not) {
      String _modifier = property.getModifier();
      boolean _equals = "preview".equals(_modifier);
      if (_equals) {
        return false;
      }
    } else {
      String _modifier_1 = property.getModifier();
      boolean _equals_1 = "runtime-only".equals(_modifier_1);
      if (_equals_1) {
        return false;
      }
    }
    return true;
  }
  
  public boolean previewFilter(final StaticValueProperty property, final boolean preview) {
    boolean _not = (!preview);
    if (_not) {
      String _modifier = property.getModifier();
      boolean _equals = "preview".equals(_modifier);
      if (_equals) {
        return false;
      }
    } else {
      String _modifier_1 = property.getModifier();
      boolean _equals_1 = "runtime-only".equals(_modifier_1);
      if (_equals_1) {
        return false;
      }
    }
    return true;
  }
  
  public boolean hasAttributeProperties(final Element element, final boolean preview) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _and = false;
    EList<Property> _properties = element.getProperties();
    int _size = _properties.size();
    boolean _greaterThan = (_size > 0);
    if (!_greaterThan) {
      _and = false;
    } else {
      EList<Property> _properties_1 = element.getProperties();
      final Function1<Property,Boolean> _function = new Function1<Property,Boolean>() {
          public Boolean apply(final Property p) {
            boolean _previewFilter = FXGraphGenerator.this.previewFilter(p, preview);
            return Boolean.valueOf(_previewFilter);
          }
        };
      Iterable<Property> _filter = IterableExtensions.<Property>filter(_properties_1, _function);
      final Function1<Property,Boolean> _function_1 = new Function1<Property,Boolean>() {
          public Boolean apply(final Property p) {
            boolean _elementAttributeFilter = FXGraphGenerator.this.elementAttributeFilter(p);
            return Boolean.valueOf(_elementAttributeFilter);
          }
        };
      Iterable<Property> _filter_1 = IterableExtensions.<Property>filter(_filter, _function_1);
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(_filter_1);
      boolean _not = (!_isNullOrEmpty);
      _and = (_greaterThan && _not);
    }
    if (_and) {
      _or_1 = true;
    } else {
      boolean _and_1 = false;
      EList<StaticCallValueProperty> _staticCallProperties = element.getStaticCallProperties();
      int _size_1 = _staticCallProperties.size();
      boolean _greaterThan_1 = (_size_1 > 0);
      if (!_greaterThan_1) {
        _and_1 = false;
      } else {
        EList<StaticCallValueProperty> _staticCallProperties_1 = element.getStaticCallProperties();
        final Function1<StaticCallValueProperty,Boolean> _function_2 = new Function1<StaticCallValueProperty,Boolean>() {
            public Boolean apply(final StaticCallValueProperty p) {
              boolean _previewFilter = FXGraphGenerator.this.previewFilter(p, preview);
              return Boolean.valueOf(_previewFilter);
            }
          };
        Iterable<StaticCallValueProperty> _filter_2 = IterableExtensions.<StaticCallValueProperty>filter(_staticCallProperties_1, _function_2);
        final Function1<StaticCallValueProperty,Boolean> _function_3 = new Function1<StaticCallValueProperty,Boolean>() {
            public Boolean apply(final StaticCallValueProperty p) {
              boolean _elementAttributeFilter = FXGraphGenerator.this.elementAttributeFilter(p);
              return Boolean.valueOf(_elementAttributeFilter);
            }
          };
        Iterable<StaticCallValueProperty> _filter_3 = IterableExtensions.<StaticCallValueProperty>filter(_filter_2, _function_3);
        boolean _isNullOrEmpty_1 = IterableExtensions.isNullOrEmpty(_filter_3);
        boolean _not_1 = (!_isNullOrEmpty_1);
        _and_1 = (_greaterThan_1 && _not_1);
      }
      _or_1 = (_and || _and_1);
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _and_2 = false;
      EList<StaticValueProperty> _staticProperties = element.getStaticProperties();
      int _size_2 = _staticProperties.size();
      boolean _greaterThan_2 = (_size_2 > 0);
      if (!_greaterThan_2) {
        _and_2 = false;
      } else {
        EList<StaticValueProperty> _staticProperties_1 = element.getStaticProperties();
        final Function1<StaticValueProperty,Boolean> _function_4 = new Function1<StaticValueProperty,Boolean>() {
            public Boolean apply(final StaticValueProperty p) {
              boolean _previewFilter = FXGraphGenerator.this.previewFilter(p, preview);
              return Boolean.valueOf(_previewFilter);
            }
          };
        Iterable<StaticValueProperty> _filter_4 = IterableExtensions.<StaticValueProperty>filter(_staticProperties_1, _function_4);
        final Function1<StaticValueProperty,Boolean> _function_5 = new Function1<StaticValueProperty,Boolean>() {
            public Boolean apply(final StaticValueProperty p) {
              boolean _elementAttributeFilter = FXGraphGenerator.this.elementAttributeFilter(p);
              return Boolean.valueOf(_elementAttributeFilter);
            }
          };
        Iterable<StaticValueProperty> _filter_5 = IterableExtensions.<StaticValueProperty>filter(_filter_4, _function_5);
        boolean _isNullOrEmpty_2 = IterableExtensions.isNullOrEmpty(_filter_5);
        boolean _not_2 = (!_isNullOrEmpty_2);
        _and_2 = (_greaterThan_2 && _not_2);
      }
      _or = (_or_1 || _and_2);
    }
    return _or;
  }
  
  public boolean hasNestedProperties(final Element element, final boolean preview) {
    EList<FactoryValueElement> _values = element.getValues();
    int _size = _values.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      return true;
    }
    EList<Element> _defaultChildren = element.getDefaultChildren();
    int _size_1 = _defaultChildren.size();
    boolean _greaterThan_1 = (_size_1 > 0);
    if (_greaterThan_1) {
      return true;
    }
    EList<StaticCallValueProperty> _staticCallProperties = element.getStaticCallProperties();
    int _size_2 = _staticCallProperties.size();
    boolean _greaterThan_2 = (_size_2 > 0);
    if (_greaterThan_2) {
      EList<StaticCallValueProperty> _staticCallProperties_1 = element.getStaticCallProperties();
      final Function1<StaticCallValueProperty,Boolean> _function = new Function1<StaticCallValueProperty,Boolean>() {
          public Boolean apply(final StaticCallValueProperty p) {
            boolean _previewFilter = FXGraphGenerator.this.previewFilter(p, preview);
            return Boolean.valueOf(_previewFilter);
          }
        };
      Iterable<StaticCallValueProperty> _filter = IterableExtensions.<StaticCallValueProperty>filter(_staticCallProperties_1, _function);
      final Function1<StaticCallValueProperty,Boolean> _function_1 = new Function1<StaticCallValueProperty,Boolean>() {
          public Boolean apply(final StaticCallValueProperty p) {
            boolean _subelementFilter = FXGraphGenerator.this.subelementFilter(p);
            return Boolean.valueOf(_subelementFilter);
          }
        };
      Iterable<StaticCallValueProperty> _filter_1 = IterableExtensions.<StaticCallValueProperty>filter(_filter, _function_1);
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(_filter_1);
      return (!_isNullOrEmpty);
    }
    EList<StaticValueProperty> _staticProperties = element.getStaticProperties();
    int _size_3 = _staticProperties.size();
    boolean _greaterThan_3 = (_size_3 > 0);
    if (_greaterThan_3) {
      EList<StaticValueProperty> _staticProperties_1 = element.getStaticProperties();
      final Function1<StaticValueProperty,Boolean> _function_2 = new Function1<StaticValueProperty,Boolean>() {
          public Boolean apply(final StaticValueProperty p) {
            boolean _previewFilter = FXGraphGenerator.this.previewFilter(p, preview);
            return Boolean.valueOf(_previewFilter);
          }
        };
      Iterable<StaticValueProperty> _filter_2 = IterableExtensions.<StaticValueProperty>filter(_staticProperties_1, _function_2);
      final Function1<StaticValueProperty,Boolean> _function_3 = new Function1<StaticValueProperty,Boolean>() {
          public Boolean apply(final StaticValueProperty p) {
            boolean _subelementFilter = FXGraphGenerator.this.subelementFilter(p);
            return Boolean.valueOf(_subelementFilter);
          }
        };
      Iterable<StaticValueProperty> _filter_3 = IterableExtensions.<StaticValueProperty>filter(_filter_2, _function_3);
      boolean _isNullOrEmpty_1 = IterableExtensions.isNullOrEmpty(_filter_3);
      return (!_isNullOrEmpty_1);
    }
    EList<Property> _properties = element.getProperties();
    int _size_4 = _properties.size();
    boolean _greaterThan_4 = (_size_4 > 0);
    if (_greaterThan_4) {
      EList<Property> _properties_1 = element.getProperties();
      final Function1<Property,Boolean> _function_4 = new Function1<Property,Boolean>() {
          public Boolean apply(final Property p) {
            boolean _previewFilter = FXGraphGenerator.this.previewFilter(p, preview);
            return Boolean.valueOf(_previewFilter);
          }
        };
      Iterable<Property> _filter_4 = IterableExtensions.<Property>filter(_properties_1, _function_4);
      final Function1<Property,Boolean> _function_5 = new Function1<Property,Boolean>() {
          public Boolean apply(final Property p) {
            boolean _subelementFilter = FXGraphGenerator.this.subelementFilter(p);
            return Boolean.valueOf(_subelementFilter);
          }
        };
      Iterable<Property> _filter_5 = IterableExtensions.<Property>filter(_filter_4, _function_5);
      boolean _isNullOrEmpty_2 = IterableExtensions.isNullOrEmpty(_filter_5);
      return (!_isNullOrEmpty_2);
    }
    return false;
  }
  
  public String shortName(final JvmTypeReference r, final ImportManager importManager) {
    String _xblockexpression = null;
    {
      StringBuilder _stringBuilder = new StringBuilder();
      final StringBuilder builder = _stringBuilder;
      JvmType _type = r.getType();
      importManager.appendType(_type, builder);
      String _string = builder.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
}
