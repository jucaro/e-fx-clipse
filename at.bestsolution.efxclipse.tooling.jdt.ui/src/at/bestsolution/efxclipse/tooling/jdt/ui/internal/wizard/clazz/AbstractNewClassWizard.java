/*******************************************************************************
 * Copyright (c) 2010 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 ******************************************************************************/
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard.clazz;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.pde.core.project.IBundleProjectDescription;
import org.eclipse.pde.core.project.IBundleProjectService;
import org.eclipse.pde.core.project.IRequiredBundleDescription;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard.templates.IGenerator;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.wizard.templates.model.JavaClass;


public abstract class AbstractNewClassWizard<O extends JavaClass> extends Wizard implements INewWizard {
	protected IPackageFragmentRoot root;
	protected IFile file;
	
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		root = getFragmentRoot(getInitialJavaElement(selection));
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
				// TODO
				e.printStackTrace();
			}
		}
		return initRoot;
	}

	protected abstract IGenerator<O> getGenerator();
	
	@SuppressWarnings("unchecked")
	public O getDomainClass() {
		return ((AbstractNewClassPage<O>) getPages()[0]).getClazz();
	}
	
	protected void checkRequiredBundles() {
//		IProject project = getDomainClass().getFragmentRoot().getJavaProject().getProject();
//		BundleContext context = FrameworkUtil.getBundle(AbstractNewClassWizard.class).getBundleContext();
//		ServiceReference<IBundleProjectService> ref = context.getServiceReference(IBundleProjectService.class);
//		IBundleProjectService service = context.getService(ref);
//		try {
//			IBundleProjectDescription description = service.getDescription(project);
//			Set<String> requiredBundles = getRequiredBundles();
//			IRequiredBundleDescription[] arTmp = description.getRequiredBundles();
//			List<IRequiredBundleDescription> descs = new ArrayList<IRequiredBundleDescription>();
//			if( arTmp != null ) {
//				descs.addAll(Arrays.asList(arTmp));
//			}
//			for( IRequiredBundleDescription bd : descs ) {
//				requiredBundles.remove(bd.getName());
//			}
//			
//			if( requiredBundles.size() > 0 ) {
//				for( String b : requiredBundles ) {
//					descs.add(service.newRequiredBundle(b, null, false, false));
//				}
//				description.setRequiredBundles(descs.toArray(new IRequiredBundleDescription[0]));
//				description.apply(new NullProgressMonitor());
//			}
//		} catch (CoreException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	protected Set<String> getRequiredBundles() {
		Set<String> rv = new HashSet<String>();
		rv.add("javax.inject");
		return rv;
	}
	
	@Override
	public boolean performFinish() {
		O clazz = getDomainClass();
		String content = getGenerator().generateContent(clazz).toString();
		
		if( clazz.getFragmentRoot() == null ) {
			return false;
		}
		
		checkRequiredBundles();
		
		IPackageFragment fragment = clazz.getPackageFragment();
		if (fragment != null) {
			String cuName = clazz.getName() + ".java";
			ICompilationUnit unit = fragment.getCompilationUnit(cuName); 
			IResource resource = unit.getResource();
			file = (IFile) resource;
			try {
				if (!file.exists()) {
					file.create(new ByteArrayInputStream(content.getBytes()),
							true, null);
				} else {
					file.setContents(new ByteArrayInputStream(content.getBytes()),
							IFile.FORCE | IFile.KEEP_HISTORY, null);
				}
				IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), file);
//				unit.open(null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			String cuName = clazz.getName() + ".java";
			IFolder p = (IFolder) clazz.getFragmentRoot().getResource();
			file = p.getFile(cuName);
			try {
				if (!file.exists()) {
					file.create(new ByteArrayInputStream(content.getBytes()),
							true, null);
				} else {
					file.setContents(new ByteArrayInputStream(content.getBytes()),
							IFile.FORCE | IFile.KEEP_HISTORY, null);
				}
				IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), file);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return true;

	}
	
	public IFile getFile() {
		return file;
	}
}
