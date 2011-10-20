package at.bestsolution.efxclipse.tooling.fxgraph.ui.preview;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model;
import at.bestsolution.efxclipse.tooling.fxgraph.generator.FXGraphGenerator;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.preview.LivePreviewPart.ContentData;

import com.google.inject.Inject;

public class LivePreviewSynchronizer implements IPartListener, IXtextModelListener {
	@Inject
	private LivePreviewPart view;
	
	private IXtextDocument lastActiveDocument;
	
	public void partActivated(IWorkbenchPart part) {
		updateView(part);
	}

	private void updateView(IWorkbenchPart part) {
		if (part instanceof XtextEditor) {
			XtextEditor xtextEditor = (XtextEditor) part;
			IXtextDocument xtextDocument = xtextEditor.getDocument();
			if (xtextDocument != lastActiveDocument) {
				final ContentData contents = xtextDocument.readOnly(new IUnitOfWork<ContentData, XtextResource>() {
					public ContentData exec(XtextResource resource) throws Exception {
						return createContents(resource);
					}
				});
				if (contents != null) {
					view.setContents(contents);
					if (lastActiveDocument != null) {
						lastActiveDocument.removeModelListener(this);
					}
					lastActiveDocument = xtextDocument;
					lastActiveDocument.addModelListener(this);
				}
			}
		}
	}
	
	private ContentData createContents(XtextResource resource) {
		EList<EObject> contents = resource.getContents();
		if (!contents.isEmpty()) {
			EObject rootObject = contents.get(0);
			if( rootObject instanceof Model ) {
				FXGraphGenerator generator = new FXGraphGenerator();
				ComponentDefinition def = ((Model) rootObject).getComponentDef();
				List<String> l;
				List<URL> extraPaths = new ArrayList<URL>();
				
				URI uri = resource.getURI();
				IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(uri.segment(1));
				IJavaProject jp = JavaCore.create(p);
				
				if( def != null ) {
					l = new ArrayList<String>(def.getPreviewCssFiles().size());
					for( String cssFile : def.getPreviewCssFiles() ) {
						if( cssFile.trim().length() > 0 ) {
							IFile f = p.getFile(cssFile);
							if( f.exists() ) {
								try {
									l.add(f.getLocation().toFile().getAbsoluteFile().toURI().toURL().toExternalForm());
								} catch (MalformedURLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							} else if( jp != null ) {
								// Check the build path
								
							}
						}
					}
					
					for( String path : def.getPreviewClasspathEntries() ) {
						try {
							URI cpUri = URI.createURI(path);
							if( cpUri.isPlatformResource() ) {
								Path cpPath = new Path(cpUri.toPlatformString(true));
								IWorkspaceRoot root = jp.getProject().getWorkspace().getRoot();
								IFile jarFile = root.getFile(cpPath);
								if( jarFile.exists() ) {
									try {
										extraPaths.add(jarFile.getLocation().toFile().toURI().toURL());
									} catch (MalformedURLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
							} else if( uri.isFile() ) {
								File ioFile = new File(uri.toFileString());
								if( ioFile.exists() ) {
									try {
										extraPaths.add(ioFile.toURI().toURL());
									} catch (MalformedURLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
							}
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
					
				} else {
					l = Collections.emptyList();
				}
				
				
				
				return new ContentData(generator.doGeneratePreview(resource), l, def != null ? def.getPreviewResourceBundle() : null,extraPaths);				
			}
		}
		
		return null;
	}

	@Override
	public void modelChanged(XtextResource resource) {
		view.setContents(createContents(resource));
	}

	@Override
	public void partBroughtToTop(IWorkbenchPart part) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void partClosed(IWorkbenchPart part) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void partDeactivated(IWorkbenchPart part) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void partOpened(IWorkbenchPart part) {
		// TODO Auto-generated method stub
		
	}
}
