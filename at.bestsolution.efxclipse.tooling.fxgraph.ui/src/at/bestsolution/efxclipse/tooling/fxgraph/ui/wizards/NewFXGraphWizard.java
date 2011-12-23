package at.bestsolution.efxclipse.tooling.fxgraph.ui.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;

import at.bestsolution.efxclipse.tooling.fxgraph.ui.wizards.template.FXGraphElement;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.wizards.template.FXGraphTemplate;
import at.bestsolution.efxclipse.tooling.ui.wizards.AbstractNewJDTElementWizard;
import at.bestsolution.efxclipse.tooling.ui.wizards.template.IGenerator;

public class NewFXGraphWizard extends AbstractNewJDTElementWizard<FXGraphElement> {

	@Override
	protected IGenerator<FXGraphElement> getGenerator() {
		return new FXGraphTemplate();
	}
	
	@Override
	public void addPages() {
		addPage(new FXGraphWizardPage(root,fragment,ResourcesPlugin.getWorkspace().getRoot()));
	}
	

	@Override
	protected IFile createFile() {
		if (fragment != null) {
			String fxgraph = getDomainClass().getName() + ".fxgraph";
			IFolder p = (IFolder) fragment.getResource();
			IResource resource = p.getFile(fxgraph);
			return (IFile) resource;
		} else {
			String fxgraph = getDomainClass().getName() + ".fxgraph";
			IFolder p = (IFolder) getDomainClass().getFragmentRoot().getResource();
			return p.getFile(fxgraph);
		}
	}
}
