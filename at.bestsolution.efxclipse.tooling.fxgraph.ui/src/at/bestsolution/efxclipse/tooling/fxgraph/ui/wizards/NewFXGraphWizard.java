package at.bestsolution.efxclipse.tooling.fxgraph.ui.wizards;

import java.io.ByteArrayInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.ui.util.CoreUtility;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

@SuppressWarnings("restriction")
public class NewFXGraphWizard extends Wizard implements INewWizard {
	private FXGraphWizardPage page;
	protected IPackageFragmentRoot root;
	
	public NewFXGraphWizard() {
		
	}

	@Override
	public void addPages() {
		super.addPages();
		page = new FXGraphWizardPage("FXGraph", "New FXGraph Wizard",
				"Create a new FXGraph component", root, ResourcesPlugin.getWorkspace()
				.getRoot());
		addPage(page);
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		root = getFragmentRoot(getInitialJavaElement(selection));
	}
	
	protected IPackageFragmentRoot getFragmentRoot(IJavaElement elem) {
		IPackageFragmentRoot initRoot = null;
		if (elem != null) {
			initRoot = (IPackageFragmentRoot) elem
					.getAncestor(IJavaElement.PACKAGE_FRAGMENT_ROOT);
			try {
				if (initRoot == null
						|| initRoot.getKind() != IPackageFragmentRoot.K_SOURCE) {
					IJavaProject jproject = elem.getJavaProject();
					if (jproject != null) {
						initRoot = null;
						if (jproject.exists()) {
							IPackageFragmentRoot[] roots = jproject
									.getPackageFragmentRoots();
							for (int i = 0; i < roots.length; i++) {
								if (roots[i].getKind() == IPackageFragmentRoot.K_SOURCE) {
									initRoot = roots[i];
									break;
								}
							}
						}
						if (initRoot == null) {
							initRoot = jproject.getPackageFragmentRoot(jproject
									.getResource());
						}
					}
				}
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
		}
		return initRoot;
	}

	
	protected IJavaElement getInitialJavaElement(IStructuredSelection selection) {
		IJavaElement jelem = null;
		if (selection != null && !selection.isEmpty()) {
			Object selectedElement = selection.getFirstElement();
			if (selectedElement instanceof IAdaptable) {
				IAdaptable adaptable = (IAdaptable) selectedElement;

				jelem = (IJavaElement) adaptable.getAdapter(IJavaElement.class);
				if (jelem == null || !jelem.exists()) {
					jelem = null;
					IResource resource = (IResource) adaptable
							.getAdapter(IResource.class);
					if (resource != null
							&& resource.getType() != IResource.ROOT) {
						while (jelem == null
								&& resource.getType() != IResource.PROJECT) {
							resource = resource.getParent();
							jelem = (IJavaElement) resource
									.getAdapter(IJavaElement.class);
						}
						if (jelem == null) {
							jelem = JavaCore.create(resource); // java project
						}
					}
				}
			}
		}

		return jelem;
	}
	
	private String getContents() {
		String rv = page.pack != null && page.pack.getElementName() != null && !page.pack.getElementName().equals("default") ? "package " + page.pack.getElementName() + System.getProperty("line.separator") + System.getProperty("line.separator") : ""; 
		rv += "import javafx.scene.layout.*"+System.getProperty("line.separator")+System.getProperty("line.separator")+"component " + page.name + " {"+System.getProperty("line.separator")+"\t"+page.rootElement+" {"+System.getProperty("line.separator")+System.getProperty("line.separator")+"\t}"+System.getProperty("line.separator")+"}";
		return rv;
	}

	@Override
	public boolean performFinish() {
		
		if( page.froot == null ) {
			return false;
		}
		
		IPackageFragment fragment = page.pack;
		if (fragment != null) {
			String fxgraph = page.name + ".fxgraph";
			IFolder p = (IFolder) fragment.getResource();
			IResource resource = p.getFile(fxgraph);
			IFile file = (IFile) resource;
			
			try {
				adjustProject(file);
				if (!file.exists()) {
					file.create(new ByteArrayInputStream(getContents().getBytes()),
							true, null);
				} else {
					file.setContents(new ByteArrayInputStream(getContents().getBytes()),
							IFile.FORCE | IFile.KEEP_HISTORY, null);
				}
				IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), file);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		} else {
			String fxgraph = page.name + ".fxgraph";
			IFolder p = (IFolder) page.froot.getResource();
			IFile file = p.getFile(fxgraph);
			
			try {
				adjustProject(file);
				if (!file.exists()) {
					file.create(new ByteArrayInputStream(getContents().getBytes()),
							true, null);
				} else {
					file.setContents(new ByteArrayInputStream(getContents().getBytes()),
							IFile.FORCE | IFile.KEEP_HISTORY, null);
				}
				IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), file);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		return true;
	}
	
	private void adjustProject(IFile f) throws CoreException {
		IJavaProject jproject = JavaCore.create(f.getProject());
		IPackageFragmentRoot[] roots = jproject
				.getPackageFragmentRoots();
		for (int i = 0; i < roots.length; i++) {
			if (roots[i].getKind() == IPackageFragmentRoot.K_SOURCE) {
				if( "src-gen".equals(roots[i].getElementName()) ) {
					return;
				}
			}
		}
		
		String relPath= "src-gen";

		IFolder folder= jproject.getProject().getFolder(relPath);
		IClasspathEntry newEntry= JavaCore.newSourceEntry(folder.getFullPath());
		
		if (!folder.exists()) {
			CoreUtility.createFolder(folder, true, true, new NullProgressMonitor());
		}
		
		IPath fOutputLocation= jproject.getOutputLocation();
		IClasspathEntry[] fEntries= jproject.getRawClasspath();
		IClasspathEntry[] fEntries_new = new IClasspathEntry[fEntries.length+1];
		System.arraycopy(fEntries, 0, fEntries_new, 0, fEntries.length);
		fEntries_new[fEntries_new.length-1] = newEntry;
		
		jproject.setRawClasspath(fEntries_new, fOutputLocation, new NullProgressMonitor());
		
	}
}
