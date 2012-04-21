package at.bestsolution.efxclipse.tooling.model;

import org.eclipse.jdt.core.IJavaElement;


public interface IFXProperty {
	public String getName();
	public IJavaElement getJavaElement();
	public boolean canWrite();
//	public IStatus validateValue(IJavaProject jp, Object value);
}
