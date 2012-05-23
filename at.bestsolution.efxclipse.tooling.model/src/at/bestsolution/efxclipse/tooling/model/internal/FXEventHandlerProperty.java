package at.bestsolution.efxclipse.tooling.model.internal;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;

import at.bestsolution.efxclipse.tooling.model.IFXEventHandlerProperty;
import at.bestsolution.efxclipse.tooling.model.internal.utils.Util;

public class FXEventHandlerProperty extends FXProperty implements IFXEventHandlerProperty {
	private IType eventType;
	
	public FXEventHandlerProperty(FXClass fxClass, String name, IJavaElement javaElement, boolean isStatic) {
		super(fxClass, name, javaElement, isStatic);
	}

	public static boolean isEventHandler(IJavaProject jp, String erasedFQNType) throws JavaModelException {
		String checkType = erasedFQNType;

		do {
			if ("javafx.event.EventHandler".equals(checkType)) {
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
	
	public IType getEventType() {
		if( eventType == null ) {
			try {
				IMethod m = (IMethod) getJavaElement();
				String signature;
				
				if( isSetable() ) {
					signature = m.getParameterTypes()[0];
				} else {
					signature = m.getReturnType();
				}
				
				String genericType = Signature.toString(signature);
				String eType = genericType.substring(genericType.indexOf('<')+1, genericType.indexOf('>'));
				// FIXME Is there a better way?
				if( eType.contains("super") ) {
					eType = eType.substring(eType.indexOf("super")+"super".length()).trim();
				} else if( eType.contains("extends") ) {
					eType = eType.substring(eType.indexOf("extends")+"extends".length()).trim();
				}
				
				IType t = (IType) m.getParent();
				String fqnType = Util.getFQNType(t,eType);
				eventType = getFXClass().getJavaProject().findType(fqnType);
			} catch(JavaModelException e) {
				// TODO Auto-generated method stub
				e.printStackTrace();
			}
		}
		
		return eventType;
	}
	
	@Override
	public String getEventTypeAsString(boolean fqn) {
		IType t = getEventType();
		if( t == null) {
			return "?";
		}
		return fqn ? t.getFullyQualifiedName() : t.getElementName();
	}
	
	@Override
	public String toString() {
		return "FXEventHandlerProperty("+getName()+")";
	}
}