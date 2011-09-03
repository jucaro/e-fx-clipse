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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;

public class JFXBuildConfigurationEditor extends MultiPageEditorPart implements
		IResourceChangeListener {
	private PropertyTextEditor editor;
	
	private FormToolkit toolkit;
	private Form form;
	private Properties properties = new Properties();
	private BuildPropertyBean bean = new BuildPropertyBean(properties);
	private boolean syncForm = true;
	
	public static final String BUILD_DIRECTORY = "buildDirectory";
	public static final Map<String,String> MAPPING = new HashMap<String, String>() { 
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
			put(BUILD_DIRECTORY,"jfx.build.stagingdir");
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
		form.setText("FX Build");
		toolkit.decorateFormHeading(form);
		
		form.getBody().setLayout(new GridLayout());
		
		dbc = new DataBindingContext();
		IWidgetValueProperty textModify = WidgetProperties.text(SWT.Modify);
		
		{
			Section section = toolkit.createSection(form.getBody(), 
					  Section.DESCRIPTION|Section.TITLE_BAR|
					  Section.TWISTIE|Section.EXPANDED);
			section.setText("Build Properties");
			section.setDescription("The following properties are needed to build the JavaFX-Application");
			section.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			
			Composite sectionClient = toolkit.createComposite(section);
			sectionClient.setLayout(new GridLayout(3, false));
			
			{
				toolkit.createLabel(sectionClient, "Build Directory:");
				Text t = toolkit.createText(sectionClient, "");
				t.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				toolkit.createButton(sectionClient, "Browse ...", SWT.PUSH);
				dbc.bindValue(textModify.observeDelayed(200, t), BeanProperties.value(BUILD_DIRECTORY).observe(bean));
			}
			
			{
				toolkit.createLabel(sectionClient, "Vendor name*:");
				toolkit.createText(sectionClient, "").setLayoutData(new GridData(GridData.FILL,GridData.CENTER,true,false,2,1));
			}
			
			{
				toolkit.createLabel(sectionClient, "Application title*:");
				toolkit.createText(sectionClient, "").setLayoutData(new GridData(GridData.FILL,GridData.CENTER,true,false,2,1));
			}
			
			{
				toolkit.createLabel(sectionClient, "Application version*:");
				toolkit.createText(sectionClient, "").setLayoutData(new GridData(GridData.FILL,GridData.CENTER,true,false,2,1));
			}
			
			{
				toolkit.createLabel(sectionClient, "Application class*:");
				toolkit.createText(sectionClient, "").setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				toolkit.createButton(sectionClient, "Browse ...", SWT.PUSH);	
			}
			
			
			section.setClient(sectionClient);
		}
		
		{
			Section section = toolkit.createSection(form.getBody(), 
					  Section.DESCRIPTION|Section.TITLE_BAR|
					  Section.TWISTIE|Section.EXPANDED);
			section.setText("Deploy Properties");
			section.setDescription("The following properties are needed to create a Java Webstart Deployment");
			section.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			
			Composite sectionClient = toolkit.createComposite(section);
			sectionClient.setLayout(new GridLayout(3, false));
			
			{
				toolkit.createLabel(sectionClient, "Applet Width:");
				toolkit.createText(sectionClient, "").setLayoutData(new GridData(GridData.FILL,GridData.CENTER,true,false,2,1));
			}
			
			{
				toolkit.createLabel(sectionClient, "Applet Height:");
				toolkit.createText(sectionClient, "").setLayoutData(new GridData(GridData.FILL,GridData.CENTER,true,false,2,1));
			}
			
			section.setClient(sectionClient);
		}
		
		int index = addPage(composite);
		setPageText(index, "Build Properties");
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
							while( (line = r.readLine()) != null ) {
								if( line.startsWith(key) ) {
									line = key + " = " + evt.getNewValue();
								}
								b.append(line + "\n");
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
		
		public void setBuildDirectory(String directory) {
			if( directory == null || directory.trim().isEmpty() ) {
				support.firePropertyChange(BUILD_DIRECTORY, properties.remove(MAPPING.get(BUILD_DIRECTORY)), null);
			} else {
				support.firePropertyChange(BUILD_DIRECTORY, properties.setProperty(MAPPING.get(BUILD_DIRECTORY), directory), directory);
			}
		}
		
		public String getBuildDirectory() {
			return properties.getProperty("jfx.build.stagingdir");
		}
	}
}