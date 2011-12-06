package at.bestsolution.efxclipse.tooling.fxgraph.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;

import com.google.inject.Inject;

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.PackageDeclaration;

public class FXGraphQualifiedNameProvider extends XbaseQualifiedNameProvider {
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;
	
	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if( obj instanceof ComponentDefinition ) {
			if( obj.eContainer() instanceof Model ) {
				ComponentDefinition compDef = (ComponentDefinition) obj;
				Model model = (Model) obj.eContainer();
				PackageDeclaration packageDec = model.getPackage();
				if( packageDec != null ) {
					return qualifiedNameConverter.toQualifiedName(packageDec.getName()+"."+compDef.getName());
				} else {
					return qualifiedNameConverter.toQualifiedName(compDef.getName());
				}
			}
			
		}
		// TODO Auto-generated method stub
		return super.getFullyQualifiedName(obj);
	}
}
