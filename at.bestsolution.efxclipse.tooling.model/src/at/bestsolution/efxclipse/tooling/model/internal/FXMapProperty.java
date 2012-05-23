package at.bestsolution.efxclipse.tooling.model.internal;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

import at.bestsolution.efxclipse.tooling.model.IFXMapProperty;
import at.bestsolution.efxclipse.tooling.model.internal.utils.Util;

public class FXMapProperty extends FXProperty implements IFXMapProperty {

	public FXMapProperty(FXClass fxClass, String name, IJavaElement javaElement, boolean isStatic) {
		super(fxClass, name, javaElement, isStatic);
	}

	public static boolean isMap(IJavaProject jp, String erasedFQNType) throws JavaModelException {
		String checkType = erasedFQNType;

		do {
			if ("javafx.collections.ObservableMap".equals(checkType)) {
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
		return "FXMapProperty("+getName()+")";
	}
}
