package at.bestsolution.efxclipse.tooling.model.internal;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;

import at.bestsolution.efxclipse.tooling.model.IFXCollectionProperty;
import at.bestsolution.efxclipse.tooling.model.internal.utils.Util;

public class FXCollectionProperty extends FXProperty implements IFXCollectionProperty {
	private String collectionTypeAsString;
	private String genericType;
	private IType elementType;
	
	public FXCollectionProperty(FXClass fxClass, String name, IMethod javaElement, String erasedFQNType, String genericType) {
		super(fxClass, name, javaElement);
		this.collectionTypeAsString = erasedFQNType;
		this.genericType = genericType;
	}

	public static boolean isList(IJavaProject jp, String erasedFQNType) throws JavaModelException {
		String checkType = erasedFQNType;

		do {
			if ("javafx.collections.ObservableList".equals(checkType) || "javafx.collections.ObservableSet".equals(checkType) || "java.util.Collection".equals(checkType)) {
				return true;
			}

			IType t = jp.findType(checkType);
			checkType = t.getSuperclassName();

			if (checkType != null) {
				checkType = Util.getFQNType(t, checkType);
			}

		} while (checkType != null);
		return false;
	}
	
	@Override
	public String toString() {
		return "FXCollectionProperty("+getName()+")";
	}

	public String getCollectionTypeAsString(boolean fqn) {
		return fqn ? collectionTypeAsString : Signature.getSimpleName(collectionTypeAsString);
	}
	
	@Override
	public String getCollectionAsString() {
		return Signature.getSimpleName(genericType);
	}
	
	@Override
	public IType getElementType() {
		if( elementType == null ) {
			try {
				IMethod m = (IMethod) getJavaElement();
				String signature;
				
				if( isSetable() ) {
					signature = m.getParameterTypes()[0];
				} else {
					signature = m.getReturnType();
				}
				
				//TODO if the value is a generic parameter we need to resolve it
				//using the class' generic parameter
				String genericType = Signature.toString(signature);
				
				String eType;
				if( genericType.contains("extends") ) {
					eType = genericType.substring(genericType.indexOf("extends")+"extends".length(), genericType.indexOf('>'));
				} else if( genericType.contains("super") ) {
					eType = genericType.substring(genericType.indexOf("super")+"super".length(), genericType.indexOf('>'));
				} else {
					eType = genericType.substring(genericType.indexOf('<')+1, genericType.indexOf('>'));	
				}
				
				eType = eType.trim();
				
				IType t = (IType) m.getParent();
				String fqnType = Util.getFQNType(t,eType);
				if( fqnType == null ) {
					return null;
				}
				elementType = getFXClass().getJavaProject().findType(fqnType);
			} catch(JavaModelException e) {
				// TODO Auto-generated method stub
				e.printStackTrace();
			}
		}
		
		return elementType;
	}
}
