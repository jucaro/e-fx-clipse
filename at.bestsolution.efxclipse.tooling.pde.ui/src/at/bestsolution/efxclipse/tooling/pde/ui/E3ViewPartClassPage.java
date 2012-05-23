package at.bestsolution.efxclipse.tooling.pde.ui;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import at.bestsolution.efxclipse.tooling.ui.wizards.AbstractJDTElementPage;
import at.bestsolution.efxclipse.tooling.ui.wizards.template.JDTElement;

public class E3ViewPartClassPage extends AbstractJDTElementPage<JDTElement> {

	protected E3ViewPartClassPage(IPackageFragmentRoot froot, IPackageFragment fragment,
			IWorkspaceRoot fWorkspaceRoot) {
		super("newE3ViewPartClass", "JavaFX 3.x ViewPart", "Create a new JavaFX ViewPart class", froot, fragment, fWorkspaceRoot);
	}

	@Override
	protected void createFields(Composite parent, DataBindingContext dbc) {
		
	}

	@Override
	protected JDTElement createInstance() {
		return new JDTElement();
	}

	@Override
	protected ImageDescriptor getTitleAreaImage(Display display) {
		return Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "/icons/wizban/newclass_wiz.png");
	}

}
