/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.internal.ui.dialogs.MainTypeSelectionDialog;
import org.eclipse.jdt.internal.ui.util.BusyIndicatorRunnableContext;
import org.eclipse.jdt.internal.ui.wizards.TypedViewerFilter;
import org.eclipse.jdt.internal.ui.wizards.buildpaths.FolderSelectionDialog;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import at.bestsolution.efxclipse.tooling.jdt.core.internal.JavaFXCorePlugin;
import at.bestsolution.efxclipse.tooling.jdt.core.internal.JavaFXPreferencesConstants;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.buildpath.JavaFXPreferencePage;
import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.outline.PropertyContentOutlinePage;


@SuppressWarnings("restriction")
public class JFXBuildConfigurationEditor extends MultiPageEditorPart implements
		IResourceChangeListener {
	private PropertyTextEditor editor;
	
	private FormToolkit toolkit;
	private Form form;
	private Properties properties = new Properties();
	private BuildPropertyBean bean = new BuildPropertyBean(properties);
	private boolean syncForm = true;
	
	public static final String BUILD_JFXSDK = "buildJfxSDK";
	public static final String BUILD_DIRECTORY = "buildDirectory";
	public static final String BUILD_VENDOR_NAME = "buildVendorName";
	public static final String BUILD_APP_TITLE = "buildAppTitle";
	public static final String BUILD_APP_VERSION = "buildAppVersion";
	public static final String BUILD_APPLICATION_CLASS = "buildApplicationClass";
	
	public static final String DEPLOY_APPLET_WIDTH = "deployAppletWith";
	public static final String DEPLOY_APPLET_HEIGHT = "deployAppletHeight";
	
	public static final String SIGN_KEYSTORE = "signKeystore";
	public static final String SIGN_ALIAS    = "signAlias";
	public static final String SIGN_PASSWORD = "signPassword";
	
	private static final int DELAY = 500;
	
	public static final Map<String,String> MAPPING = new HashMap<String, String>() { 
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			put(BUILD_JFXSDK,"jfx.build.jfxsdkdir");
			put(BUILD_DIRECTORY,"jfx.build.stagingdir");
			put(BUILD_VENDOR_NAME, "jfx.build.vendorname");
			put(BUILD_APP_TITLE,"jfx.build.apptitle");
			put(BUILD_APP_VERSION,"jfx.build.appversion");
			put(BUILD_APPLICATION_CLASS,"jfx.build.applicationClass");
			
			put(DEPLOY_APPLET_WIDTH,"jfx.deploy.appletWith");
			put(DEPLOY_APPLET_HEIGHT,"jfx.deploy.appletHeight");
			
			put(SIGN_KEYSTORE,"jfx.sign.keystore");
			put(SIGN_ALIAS,"jfx.sign.alias");
			put(SIGN_PASSWORD,"jfx.sign.password");
		}
	};

	private DataBindingContext dbc;
	
	public JFXBuildConfigurationEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}

	@Override
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		getEditor(1).doSave(monitor);
	}

	@Override
	public void doSaveAs() {
		IEditorPart editor = getEditor(1);
		editor.doSaveAs();
		setPageText(0, editor.getTitle());
		setInput(editor.getEditorInput());
	}

	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	@Override
	protected void createPages() {
		createPage0();
		createPage1();
	}

	@Override
	public void init(IEditorSite site, IEditorInput editorInput)
			throws PartInitException {
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException(
					"Invalid Input: Must be IFileEditorInput");
		super.init(site, editorInput);
		try {
			IFileEditorInput i = (IFileEditorInput) editorInput;
			properties.load(i.getFile().getContents());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void createPage0() {
		Composite composite = new Composite(getContainer(), SWT.NONE);
		FillLayout layout = new FillLayout();
		composite.setLayout(layout);
		
		toolkit = new FormToolkit(composite.getDisplay());
		
		form = toolkit.createForm(composite);
		form.setText("FX Build Configuration");
		form.setImage(getTitleImage());
		form.getBody().setLayout(new FillLayout());
		toolkit.decorateFormHeading(form);
		
		IToolBarManager mgr = form.getToolBarManager();
		mgr.add(new Action("Run Build",ImageDescriptor.createFromURL(getClass().getClassLoader().getResource("/icons/exportrunnablejar_wiz.gif"))) {
			@Override
			public void run() {
				try {
					IHandlerService hs = (IHandlerService) PlatformUI.getWorkbench().getService(IHandlerService.class);
					hs.executeCommand("at.bestsolution.efxclipse.tooling.jdt.ui.export", null);
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NotDefinedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NotEnabledException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NotHandledException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
		});
//		mgr.add(new Action("Export Ant File",ImageDescriptor.createFromURL(getClass().getClassLoader().getResource("/icons/exportAnt_co.gif"))) {
//			@Override
//			public void run() {
//				
//			}
//		});
		form.updateToolBar();
		
		ScrolledForm scrolledForm = toolkit.createScrolledForm(form.getBody());
		scrolledForm.getBody().setLayout(new GridLayout());
		Composite sectionParent = scrolledForm.getBody();
		
		dbc = new DataBindingContext();
		IWidgetValueProperty textModify = WidgetProperties.text(SWT.Modify);
		
		{
			Section section = toolkit.createSection(sectionParent, 
					  Section.DESCRIPTION|Section.TITLE_BAR|
					  Section.TWISTIE|Section.EXPANDED);
			section.setText("Build Properties");
			section.setDescription("The following properties are needed to build the JavaFX-Application");
			section.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			
			Composite sectionClient = toolkit.createComposite(section);
			sectionClient.setLayout(new GridLayout(4, false));
			
			{
				toolkit.createLabel(sectionClient, "Build Directory:");
				final Text t = toolkit.createText(sectionClient, "");
				t.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				toolkit.createButton(sectionClient, "Filesystem ...", SWT.PUSH).addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						String dir = handleBuildFilesystemDirectorySelection(t.getShell());
						if( dir != null ) {
							t.setText(dir);	
						}
					}
				});
				toolkit.createButton(sectionClient, "Workspace ...", SWT.PUSH).addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						String dir = handleBuildWorkbencDirectorySelection(t.getShell());
						if( dir != null ) {
							t.setText(dir);	
						}
					}
				});
				dbc.bindValue(textModify.observeDelayed(DELAY, t), BeanProperties.value(BUILD_DIRECTORY).observe(bean));
			}
			
			{
				IEclipsePreferences pref = InstanceScope.INSTANCE.getNode(JavaFXCorePlugin.PLUGIN_ID);
				final String prefDir = pref.get(JavaFXPreferencesConstants.JAVAFX_DIR,"");
				
				toolkit.createLabel(sectionClient, "JFX-SDK Directory:");
				final Text t = toolkit.createText(sectionClient, "");
				t.setMessage(prefDir);
				t.setLayoutData(new GridData(GridData.FILL,GridData.CENTER,true,false,2,1));
				Button b = toolkit.createButton(sectionClient, "Browse ...", SWT.PUSH);
				b.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						String dir = handleJFxSDKDirectorySelection(t.getShell(),prefDir);
						if( dir != null ) {
							t.setText(dir);	
						}
					}
				});
				b.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, false, false));
				dbc.bindValue(textModify.observeDelayed(DELAY, t), BeanProperties.value(BUILD_JFXSDK).observe(bean));
			}
			
			{
				toolkit.createLabel(sectionClient, "Vendor name*:");
				Text t = toolkit.createText(sectionClient, "");
				t.setLayoutData(new GridData(GridData.FILL,GridData.CENTER,true,false,3,1));
				dbc.bindValue(textModify.observeDelayed(DELAY, t), BeanProperties.value(BUILD_VENDOR_NAME).observe(bean));
			}
			
			{
				toolkit.createLabel(sectionClient, "Application title*:");
				Text t = toolkit.createText(sectionClient, "");
				t.setLayoutData(new GridData(GridData.FILL,GridData.CENTER,true,false,3,1));
				dbc.bindValue(textModify.observeDelayed(DELAY, t), BeanProperties.value(BUILD_APP_TITLE).observe(bean));
			}
			
			{
				toolkit.createLabel(sectionClient, "Application version*:");
				Text t = toolkit.createText(sectionClient, "");
				t.setLayoutData(new GridData(GridData.FILL,GridData.CENTER,true,false,3,1));
				dbc.bindValue(textModify.observeDelayed(DELAY, t), BeanProperties.value(BUILD_APP_VERSION).observe(bean));
			}
			
			{
				toolkit.createLabel(sectionClient, "Application class*:");
				final Text t = toolkit.createText(sectionClient, "");
				t.setLayoutData(new GridData(GridData.FILL,GridData.CENTER,true,false,2,1));
				Button b = toolkit.createButton(sectionClient, "Browse ...", SWT.PUSH);
				b.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						String name = handleRootclassSelection(t.getShell());
						if( name != null ) {
							t.setText(name);
						}
					}
				});
				b.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, false, false));
				dbc.bindValue(textModify.observeDelayed(DELAY, t), BeanProperties.value(BUILD_APPLICATION_CLASS).observe(bean));
			}
			
			
			section.setClient(sectionClient);
		}
		
		{
			Section section = toolkit.createSection(sectionParent, 
					  Section.DESCRIPTION|Section.TITLE_BAR|
					  Section.TWISTIE|Section.EXPANDED);
			section.setText("Deploy Properties");
			section.setDescription("The following properties are needed to create a Java Webstart Deployment");
			section.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			
			Composite sectionClient = toolkit.createComposite(section);
			sectionClient.setLayout(new GridLayout(2, false));
			
			{
				toolkit.createLabel(sectionClient, "Applet Width:");
				Text t = toolkit.createText(sectionClient, "");
				t.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				dbc.bindValue(textModify.observeDelayed(DELAY, t), BeanProperties.value(DEPLOY_APPLET_WIDTH).observe(bean));
			}
			
			{
				toolkit.createLabel(sectionClient, "Applet Height:");
				Text t = toolkit.createText(sectionClient, "");
				t.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				dbc.bindValue(textModify.observeDelayed(DELAY, t), BeanProperties.value(DEPLOY_APPLET_HEIGHT).observe(bean));
			}
			
			section.setClient(sectionClient);
		}
		
		{
			Section section = toolkit.createSection(sectionParent, 
					  Section.DESCRIPTION|Section.TITLE_BAR|
					  Section.TWISTIE|Section.EXPANDED);
			section.setText("Signing Properties");
			section.setDescription("Information for signing result jar");
			section.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			
			Composite sectionClient = toolkit.createComposite(section);
			sectionClient.setLayout(new GridLayout(4, false));
			
			{
				toolkit.createLabel(sectionClient, "Keystore:");
				Text t = toolkit.createText(sectionClient, "");
				t.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				toolkit.createButton(sectionClient, "Filesystem ...", SWT.PUSH);
				toolkit.createButton(sectionClient, "Workspace ...", SWT.PUSH);
				dbc.bindValue(textModify.observeDelayed(DELAY, t), BeanProperties.value(SIGN_KEYSTORE).observe(bean));
			}
			
			{
				toolkit.createLabel(sectionClient, "Alias:");
				Text t = toolkit.createText(sectionClient, "");
				t.setLayoutData(new GridData(GridData.FILL,GridData.CENTER,true,false,3,1));
				dbc.bindValue(textModify.observeDelayed(DELAY, t), BeanProperties.value(SIGN_ALIAS).observe(bean));
			}
			
			{
				toolkit.createLabel(sectionClient, "Password:");
				Text t = toolkit.createText(sectionClient, "");
				t.setLayoutData(new GridData(GridData.FILL,GridData.CENTER,true,false,3,1));
				dbc.bindValue(textModify.observeDelayed(DELAY, t), BeanProperties.value(SIGN_PASSWORD).observe(bean));
			}
			
			section.setClient(sectionClient);
		}
		
		int index = addPage(composite);
		setPageText(index, "Build Properties");
	}
	
	String handleJFxSDKDirectorySelection(Shell parent,
			String originalDir) {
		DirectoryDialog dialog = new DirectoryDialog(parent);
		dialog.setFilterPath(originalDir);
		
		String dir = dialog.open();
		if( dir != null ) {
			if( ! JavaFXPreferencePage.validateSDKDirectory(dir) ) {
				MessageDialog.openError(parent, "Not a JFX-SDK Directory", "The directory '"+dir+"' is not a valid SDK-directory");
				return handleJFxSDKDirectorySelection(parent, originalDir);
			} else {
				return dir;
			}
		}
		return null;
	}
	
	String handleBuildFilesystemDirectorySelection(Shell parent) {
		DirectoryDialog dialog = new DirectoryDialog(parent);
		return dialog.open();
	}
	
	String handleBuildWorkbencDirectorySelection(Shell parent) {
		ILabelProvider lp= new WorkbenchLabelProvider();
		ITreeContentProvider cp= new WorkbenchContentProvider();

		Class<?>[] acceptedClasses= new Class[] { IProject.class, IFolder.class };
		ViewerFilter filter= new TypedViewerFilter(acceptedClasses);

		FolderSelectionDialog dialog= new FolderSelectionDialog(parent, lp, cp);
		dialog.setTitle("Output directory");
		dialog.setMessage("Select output directory");
		dialog.addFilter(filter);
		dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
		if (dialog.open() == Window.OK) {
			IContainer c = (IContainer)dialog.getFirstResult();
			return "${workspace}/" + c.getProject().getName() + "/" + c.getProjectRelativePath().toString();
		}
		return null;
	}
	
	String handleRootclassSelection(Shell parent) {
		IFileEditorInput i = (IFileEditorInput) getEditorInput();
		IJavaProject project= JavaCore.create(i.getFile().getProject());
		if (project == null) {
			return null;
		}
		
		IJavaElement[] elements= new IJavaElement[] { project };

		int constraints = IJavaSearchScope.SOURCES;
		constraints |= IJavaSearchScope.APPLICATION_LIBRARIES;
		
		IJavaSearchScope searchScope = SearchEngine.createJavaSearchScope(elements, constraints);		
		BusyIndicatorRunnableContext context = new BusyIndicatorRunnableContext();
		
		MainTypeSelectionDialog dialog = new MainTypeSelectionDialog(parent, context, searchScope, 0);
		dialog.setTitle("Find class");
		dialog.setMessage("Find the class used to launch the application");
		if (dialog.open() == Window.CANCEL) {
			return null;
		}
		Object[] results = dialog.getResult();	
		IType type = (IType)results[0];
		if (type != null) {
			return type.getFullyQualifiedName();
		}
		
		return null;
	}
	
	protected void pageChange(int newPageIndex) {
		if( newPageIndex == 0 ) {
			syncForm();
		}
	}
	
	void syncForm() {
		properties.clear();
		try { 
			properties.load(new StringReader(editor.getDocumentProvider().getDocument(editor.getEditorInput()).get()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dbc.updateTargets();
	}
	
	void createPage1() {
		try {
			editor = new PropertyTextEditor();
			int index = addPage(editor, getEditorInput());
			setPageText(index, editor.getTitle());
			setPartName(editor.getTitle());
			editor.getDocumentProvider().getDocument(editor.getEditorInput()).addDocumentListener(new IDocumentListener() {
				
				@Override
				public void documentChanged(DocumentEvent event) {
					if( syncForm && getActivePage() == 0 ) {
						syncForm();
					}
				}
				
				@Override
				public void documentAboutToBeChanged(DocumentEvent event) {
					
				}
			});
			bean.addPropertyChangeListener(new PropertyChangeListener() {
				
				@Override
				public void propertyChange(PropertyChangeEvent evt) {
					try {
						syncForm = false;
						
						String key = MAPPING.get(evt.getPropertyName());
						
						String editorText = editor.getDocumentProvider().getDocument(editor.getEditorInput()).get();
						BufferedReader r = new BufferedReader(new StringReader(editorText));
						String line;
						StringBuilder b = new StringBuilder();
						try {
							boolean found = false;
							while( (line = r.readLine()) != null ) {
								if( line.startsWith(key) ) {
									if( line.endsWith("\\") ) {
										while( (line = r.readLine()) != null && line.endsWith("\\") ) {
											// remove all of them
										}
									}
									
									if( evt.getNewValue() == null ) {
										line = null;
									} else {
										line = key + " = " + evt.getNewValue();
									}
									
									found = true;
								}
								
								if( line != null ) {
									b.append(line + "\n");
								}
							}
							
							if( ! found && evt.getNewValue() != null ) {
								b.append(line = key + " = " + evt.getNewValue());
							}
							
							editor.getDocumentProvider().getDocument(editor.getEditorInput()).set(b.toString());
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					} finally {
						syncForm = true;
					}
					
				}
			});
		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(),
					"Error creating nested text editor", null, e.getStatus());
		}
	}

	@Override
	public void resourceChanged(final IResourceChangeEvent event) {
		if (event.getType() == IResourceChangeEvent.PRE_CLOSE) {
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow()
							.getPages();
					for (int i = 0; i < pages.length; i++) {
						if (((FileEditorInput) editor.getEditorInput())
								.getFile().getProject()
								.equals(event.getResource())) {
							IEditorPart editorPart = pages[i].findEditor(editor
									.getEditorInput());
							pages[i].closeEditor(editorPart, true);
						}
					}
				}
			});
		}
	}
	
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (adapter == IContentOutlinePage.class) {
			final PropertyContentOutlinePage contentOutline = new PropertyContentOutlinePage(editor);
			return contentOutline;
		}
		//
		return super.getAdapter(adapter);
	}
	
	public static class BuildPropertyBean {
		private PropertyChangeSupport support = new PropertyChangeSupport(this);
		private Properties properties;
		
		public BuildPropertyBean(Properties properties) {
			this.properties = properties;
		}
		
		public void addPropertyChangeListener(PropertyChangeListener listener) {
			support.addPropertyChangeListener(listener);
		}
		
		public void removePropertyChangeListener(PropertyChangeListener listener) {
			support.addPropertyChangeListener(listener);
		}
		
		
		private String get(String key) {
			return properties.getProperty(MAPPING.get(key));
		}
		
		private void set(String key, String value) {
			if( value == null || value.trim().isEmpty() ) {
				support.firePropertyChange(key, properties.remove(MAPPING.get(key)), null);
			} else {
				support.firePropertyChange(key, properties.setProperty(MAPPING.get(key), value), value);
			}
		}
		
		public void setBuildDirectory(String value) {
			set(BUILD_DIRECTORY,value);
		}
		
		public String getBuildDirectory() {
			return get(BUILD_DIRECTORY);
		}
		
		public void setBuildVendorName(String value) {
			set(BUILD_VENDOR_NAME,value);
		}
		
		public String getBuildVendorName() {
			return get(BUILD_VENDOR_NAME);
		}
		
		public void setBuildAppTitle(String value) {
			set(BUILD_APP_TITLE,value);
		}
		
		public String getBuildAppTitle() {
			return get(BUILD_APP_TITLE);
		}
		
		public void setBuildAppVersion(String value) {
			set(BUILD_APP_VERSION,value);
		}
		
		public String getBuildAppVersion() {
			return get(BUILD_APP_VERSION);
		}
		
		public void setBuildApplicationClass(String value) {
			set(BUILD_APPLICATION_CLASS,value);
		}
		
		public String getBuildApplicationClass() {
			return get(BUILD_APPLICATION_CLASS);
		}
		
		public void setDeployAppletWith(String value) {
			set(DEPLOY_APPLET_WIDTH,value);
		}
		
		public String getDeployAppletWith() {
			return get(DEPLOY_APPLET_WIDTH);
		}
		
		public void setDeployAppletHeight(String value) {
			set(DEPLOY_APPLET_HEIGHT,value);
		}
		
		public String getDeployAppletHeight() {
			return get(DEPLOY_APPLET_HEIGHT);
		}
		
		public void setBuildJfxSDK(String value) {
			set(BUILD_JFXSDK,value);
		}
		
		public String getBuildJfxSDK() {
			return get(BUILD_JFXSDK);
		}
		
		public void setSignKeystore(String value) {
			set(SIGN_KEYSTORE,value);
		}
		
		public String getSignKeystore() {
			return get(SIGN_KEYSTORE);
		}
		
		public void setSignAlias(String value) {
			set(SIGN_ALIAS,value);
		}
		
		public String getSignAlias() {
			return get(SIGN_ALIAS);
		}
		
		public void setSignPassword(String value) {
			set(SIGN_PASSWORD,value);
		}
		
		public String getSignPassword() {
			return get(SIGN_PASSWORD);
		}
	}
}