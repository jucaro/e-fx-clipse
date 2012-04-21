package at.bestsolution.efxclipse.tooling.model.internal;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

import at.bestsolution.efxclipse.tooling.model.IFXEventHandlerProperty;
import at.bestsolution.efxclipse.tooling.model.internal.utils.Util;

public class FXEventHandlerProperty extends FXProperty implements IFXEventHandlerProperty {

	public FXEventHandlerProperty(FXClass fxClass, String name, IJavaElement javaElement) {
		super(fxClass, name, javaElement);
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
	
	@Override
	public String toString() {
		return "FXEventHandlerProperty("+getName()+")";
	}
}