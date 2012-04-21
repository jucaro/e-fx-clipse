package at.bestsolution.efxclipse.tooling.model;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;

public interface IFXClassmodel {
	public IFXClass findClass(IJavaProject javaProject, IType type);
}
