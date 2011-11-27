package at.bestsolution.efxclipse.tooling.fxgraph.ui.preview;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartConstants;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.ComponentDefinition;
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model;
import at.bestsolution.efxclipse.tooling.fxgraph.generator.FXGraphGenerator;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.preview.LivePreviewPart.ContentData;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.preview.bundle.Activator;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.util.RelativeFileLocator;

import com.google.inject.Inject;

public class LivePreviewSynchronizer implements IPartListener, IXtextModelListener, IPropertyListener {
	@Inject
	private LivePreviewPart view;
	
	private IXtextDocument lastFXMLActiveDocument;
	private XtextEditor lastCssEditor;
	private XtextEditor lastFXMLEditor;
	private IEclipsePreferences preference = InstanceScope.INSTANCE.getNode(Activator.PLUGIN_ID);
	
	public static final String PREF_REFRESH_WHILE_TYPE = "PREF_REFRESH_WHILE_TYPE";
	
	static enum Type {
		UNKNOWN,
		CSS,
		FXGRAPH
	}
	
	public void partActivated(IWorkbenchPart part) {
		updateView(part);	
	}

	private void updateView(IWorkbenchPart part) {
		if (part instanceof XtextEditor) {
			XtextEditor xtextEditor = (XtextEditor) part;
			IXtextDocument xtextDocument = xtextEditor.getDocument();
			
			Type type = xtextDocument.readOnly(new IUnitOfWork<Type, XtextResource>() {

				@Override
				public Type exec(XtextResource state) throws Exception {
					EList<EObject> contents = state.getContents();
					if (!contents.isEmpty()) {
						EObject rootObject = contents.get(0);
						if( rootObject instanceof Model ) {
							return Type.FXGRAPH;
						} else if( rootObject instanceof stylesheet ) {
							return Type.CSS;
						}
					}
					return Type.UNKNOWN;
				}
			});
			
			if( type == Type.FXGRAPH ) {
				final ContentData contents = xtextDocument.readOnly(new IUnitOfWork<ContentData, XtextResource>() {
					public ContentData exec(XtextResource resource) throws Exception {
						return createContents(resource);
					}
				});
				if (contents != null) {
					view.setContents(contents);
					if (lastFXMLActiveDocument != null) {
						lastFXMLActiveDocument.removeModelListener(this);
					}
					lastFXMLActiveDocument = xtextDocument;
					lastFXMLActiveDocument.addModelListener(this);
					
					if( lastFXMLEditor != part ) {
						if( lastFXMLEditor != null ) {
							lastFXMLEditor.removePropertyListener(this);
						}
						
						lastFXMLEditor = xtextEditor;
						lastFXMLEditor.addPropertyListener(this);
					}
				} else {
					view.setContents(null);
				}
			} else if( type == Type.CSS ) {
				if( lastCssEditor != part ) {
					if( lastCssEditor != null ) {
						lastCssEditor.removePropertyListener(this);
					}
					
					lastCssEditor = xtextEditor;
					lastCssEditor.addPropertyListener(this);
				}
			} else {
				view.setContents(null);
			}
		} else if( part instanceof EditorPart ) {
			view.setContents(null);
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
						File absFile = RelativeFileLocator.locateFile(uri, cssFile);
						
						if( absFile != null ) {
							try {
								// Trick to make CSS-Reloaded
								File absParent = absFile.getParentFile();
								absParent = new File(absParent,System.currentTimeMillis()+"");
								l.add(absFile.toURI().toURL().toExternalForm());
							} catch (Throwable e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						
					}
					
					for( String path : def.getPreviewClasspathEntries() ) {
						try {
							URI cpUri = URI.createURI(path);
							if( cpUri.isPlatformResource() ) {
								if( cpUri.lastSegment().equals("*") ) {
									cpUri = cpUri.trimSegments(1);
									Path cpPath = new Path(cpUri.toPlatformString(true));
									IWorkspaceRoot root = jp.getProject().getWorkspace().getRoot();
									IFolder f = root.getFolder(cpPath);
									if( f.exists() ) {
										for( IResource r : f.members() ) {
											IFile jarFile = (IFile)r;
											if( r instanceof IFile ) {
												if( "jar".equals(jarFile.getFileExtension()) ) {
													extraPaths.add(jarFile.getLocation().toFile().toURI().toURL());
												}
											}
										}
									}
								} else {
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
								}
							} else if( cpUri.isFile() ) {
								if( cpUri.toFileString().endsWith("*") ) {
									File ioFile = new File(cpUri.toFileString()).getParentFile();
									if( ioFile.exists() ) {
										try {
											for( File jarFile : ioFile.listFiles() ) {
												if( jarFile.getName().endsWith(".jar") ) {
													extraPaths.add(jarFile.toURI().toURL());
												}
											}
										} catch (MalformedURLException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}	
								} else {
									File ioFile = new File(cpUri.toFileString());
									if( ioFile.exists() ) {
										try {
											extraPaths.add(ioFile.toURI().toURL());
										} catch (MalformedURLException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
								}
							}
						} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}
					
				} else {
					l = Collections.emptyList();
				}
				
				String resourcePropertiesFile = null;
				if( def != null && def.getPreviewResourceBundle() != null ) {
					File f = RelativeFileLocator.locateFile(uri, def.getPreviewResourceBundle());
					if( f.exists() ) {
						resourcePropertiesFile = f.getAbsolutePath();
					}
				}
				
				return new ContentData(generator.doGeneratePreview(resource), l, resourcePropertiesFile,extraPaths);				
			}
		}
		
		return null;
	}

	@Override
	public void modelChanged(XtextResource resource) {
//		if( preference.getBoolean(PREF_REFRESH_WHILE_TYPE, false) ) {
//			view.setContents(createContents(resource));
//		}
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

	@Override
	public void propertyChanged(Object source, int propId) {
		if( propId == IWorkbenchPartConstants.PROP_DIRTY ) {
			if( lastCssEditor != null && ! lastCssEditor.isDirty() && lastFXMLActiveDocument != null ) {
				view.setContents(lastFXMLActiveDocument.readOnly(new IUnitOfWork<ContentData, XtextResource>() {
					public ContentData exec(XtextResource resource) throws Exception {
						return createContents(resource);
					}
				}));
			} else if( lastFXMLEditor != null && ! lastFXMLEditor.isDirty() && lastFXMLActiveDocument != null ) {
//				if( ! preference.getBoolean(PREF_REFRESH_WHILE_TYPE, false) ) {
					view.setContents(lastFXMLActiveDocument.readOnly(new IUnitOfWork<ContentData, XtextResource>() {
						public ContentData exec(XtextResource resource) throws Exception {
							return createContents(resource);
						}
					}));	
//				}
			}
		}
	}
}
