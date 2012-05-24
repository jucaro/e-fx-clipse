package at.bestsolution.efxclipse.tooling.ui.preview;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartConstants;
import org.eclipse.ui.part.EditorPart;

import at.bestsolution.efxclipse.tooling.ui.editor.IFXMLProviderAdapter;
import at.bestsolution.efxclipse.tooling.ui.editor.IFXPreviewAdapter;
import at.bestsolution.efxclipse.tooling.ui.preview.LivePreviewPart.ContentData;

import com.google.inject.Inject;

public class LivePreviewSynchronizer implements IPartListener, IPropertyListener {
	@Inject
	private LivePreviewPart view;

	private IFXPreviewAdapter currentEditor;
	private IFXMLProviderAdapter currentContentProvider;
	
	public void partActivated(IWorkbenchPart part) {
		updateView(part);
	}

	private void updateView(IWorkbenchPart part) {
		IFXPreviewAdapter adapted;
		if( part instanceof IFXPreviewAdapter ) {
			adapted = (IFXPreviewAdapter) part;
		} else {
			adapted = (IFXPreviewAdapter) part.getAdapter(IFXPreviewAdapter.class);
		}
		
		if( adapted != null ) {
			if( currentEditor == null || ! currentEditor.getEditorPart().equals(adapted.getEditorPart()) ) {
				if( currentEditor != null ) {
					currentEditor.getEditorPart().removePropertyListener(this);
				}
				currentEditor = (IFXPreviewAdapter) adapted;
				
				if( currentEditor != null ) {
					currentEditor.getEditorPart().addPropertyListener(this);	
				}
				
				if( currentEditor instanceof IFXMLProviderAdapter && ( currentContentProvider == null || ! currentContentProvider.getEditorPart().equals(currentEditor.getEditorPart()) ) ) {
					currentContentProvider = (IFXMLProviderAdapter) currentEditor;
					view.setContents(createContentData(currentContentProvider));
				}	
			}
		} else if( part instanceof EditorPart ) {
			if( currentEditor != null ) {
				currentEditor.getEditorPart().removePropertyListener(this);
			}
			
			currentContentProvider = null;
			currentEditor = null;
			view.setContents(null);
		}
	}
	
	@Override
	public void propertyChanged(Object source, int propId) {
		if( propId == IWorkbenchPartConstants.PROP_DIRTY ) {
			if( currentEditor != null && ! currentEditor.getEditorPart().isDirty() && currentContentProvider != null ) {
				view.setContents(createContentData(currentContentProvider));
			}
		}
	}

	public void refreshPreview() {
		if( currentContentProvider != null ) {
			view.setContents(createContentData(currentContentProvider));
		}
	}

	
	
	private ContentData createContentData(IFXMLProviderAdapter contentProvider) {
		String contents = contentProvider.getPreviewFXML();
		List<String> cssFiles = contentProvider.getPreviewCSSFiles();
		String resourceBundle = contentProvider.getPreviewResourceBundle();
		List<URL> previewUrls = contentProvider.getPreviewClasspath();
		IFile file = contentProvider.getFile();
		
		List<URL> extraJarPath = new ArrayList<URL>();
		extraJarPath.addAll(previewUrls);
		
		if( file != null ) {
			boolean pluginProject = false;
			try {
				if (file.getProject().hasNature("org.eclipse.pde.PluginNature")) {
					pluginProject = true;
				}
			} catch (CoreException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			if( !pluginProject ) {
				extraJarPath.addAll(calculateProjectClasspath(JavaCore.create(file.getProject())));
			}
		}
		
		return new ContentData(contents, cssFiles, resourceBundle, extraJarPath, file);
	}

	
	private void resolveDataProject(IJavaProject project, Set<IPath> outputPath, Set<IPath> listRefLibraries) {
		try {
			IClasspathEntry[] entries = project.getRawClasspath();
			outputPath.add(project.getOutputLocation());
			for (IClasspathEntry e : entries) {
				if (e.getEntryKind() == IClasspathEntry.CPE_PROJECT) {
					IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(e.getPath().lastSegment());
					if (p.exists()) {
						resolveDataProject(JavaCore.create(p), outputPath, listRefLibraries);
					}
				} else if (e.getEntryKind() == IClasspathEntry.CPE_LIBRARY) {
					listRefLibraries.add(e.getPath());
				}
			}
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private List<URL> calculateProjectClasspath(IJavaProject jp) {
		HashSet<IPath> outputPath = new HashSet<IPath>();
		HashSet<IPath> libraries = new HashSet<IPath>();
		resolveDataProject(jp, outputPath, libraries);

		IWorkspaceRoot root = jp.getProject().getWorkspace().getRoot();

		List<URL> rv = new ArrayList<URL>();
		for (IPath out : outputPath) {
			IFolder f = root.getFolder(out);
			if (f.exists()) {
				try {
					rv.add(f.getLocation().toFile().toURI().toURL());
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		for (IPath lib : libraries) {
			IFile f = root.getFile(lib);
			if (f.exists()) {
				try {
					rv.add(f.getLocation().toFile().toURI().toURL());
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return rv;
	}

	@Override
	public void partBroughtToTop(IWorkbenchPart part) {
	}

	@Override
	public void partClosed(IWorkbenchPart part) {
	}

	@Override
	public void partDeactivated(IWorkbenchPart part) {
	}

	@Override
	public void partOpened(IWorkbenchPart part) {
	}
}
