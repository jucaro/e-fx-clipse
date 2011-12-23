package at.bestsolution.efxclipse.tooling.ui.wizards.template;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;

public class JDTElement {
	protected PropertyChangeSupport support = new PropertyChangeSupport(this);

	private IPackageFragmentRoot fragmentRoot;
	private IPackageFragment packageFragment;
	private String name;

//	public JDTElement(IPackageFragmentRoot fragmentRoot) {
//		this.fragmentRoot = fragmentRoot;
//	}

	public IPackageFragmentRoot getFragmentRoot() {
		return fragmentRoot;
	}

	public void setFragmentRoot(IPackageFragmentRoot fragmentRoot) {
		support.firePropertyChange("fragementRoot", this.fragmentRoot, this.fragmentRoot = fragmentRoot);
	}

	public IPackageFragment getPackageFragment() {
		return packageFragment;
	}

	public void setPackageFragment(IPackageFragment packageFragment) {
		support.firePropertyChange("packageFragment", this.packageFragment, this.packageFragment = packageFragment);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		support.firePropertyChange("name", this.name, this.name = name);
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		support.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		support.removePropertyChangeListener(listener);
	}
}
