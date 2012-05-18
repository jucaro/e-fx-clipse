package at.bestsolution.efxclipse.tooling.fxgraph.ui.preview;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.embed.swt.FXCanvas;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;
import org.osgi.service.prefs.BackingStoreException;

import at.bestsolution.efxclipse.tooling.fxgraph.ui.preview.bundle.Activator;

import com.google.inject.Inject;

public class LivePreviewPart extends ViewPart {
	public static final String PREF_LOAD_CONTROLLER = "PREF_LOAD_CONTROLLER";
	@Inject
	private LivePreviewSynchronizer synchronizer;
	
	private Parent rootPane_new;

	private Text logStatement;

	private CTabFolder folder;
	
	private static final String IMAGE_OK = LivePreviewPart.class.getName() + ".IMAGE_OK";
	private static final String IMAGE_WARNING = LivePreviewPart.class.getName() + ".IMAGE_WARNING";
	private static final String IMAGE_ERROR = LivePreviewPart.class.getName() + ".IMAGE_ERROR";
	private static final String IMAGE_PREVIEW = LivePreviewPart.class.getName() + ".IMAGE_PREVIEW";
	
	private static final String IMAGE_TAB_ERROR = LivePreviewPart.class.getName() + ".IMAGE_TAB_ERROR";
	private static final String IMAGE_TAB_WARNING = LivePreviewPart.class.getName() + ".IMAGE_TAB_WARNING";
	private static final String IMAGE_TAB_NORMAL = LivePreviewPart.class.getName() + ".IMAGE_TAB_NORMAL";
	
	private static final String IMAGE_STATUS_ERROR = LivePreviewPart.class.getName() + ".IMAGE_STATUS_ERROR";
	private static final String IMAGE_STATUS_WARNING = LivePreviewPart.class.getName() + ".IMAGE_STATUS_WARNING";
	private static final String IMAGE_STATUS_OK = LivePreviewPart.class.getName() + ".IMAGE_STATUS_OK";
	private static final String IMAGE_STATUS_NOPREVIEW = LivePreviewPart.class.getName() + ".IMAGE_STATUS_NOPREVIEW";
	
	private static final String IMAGE_LOAD_CONTROLLER = LivePreviewPart.class.getName() + ".IMAGE_LOAD_CONTROLLER";
	private static final String IMAGE_REFRESH = LivePreviewPart.class.getName() + ".IMAGE_REFRESH";
	
	private static final String NO_PREVIEW_TEXT = "No preview available";

	private IEclipsePreferences preference = InstanceScope.INSTANCE.getNode(Activator.PLUGIN_ID);
	
	private CTabItem logItem;

	private Label statusLabelIcon;

	private Label statusLabelText;

	private FXCanvas swtFXContainer;
	
	private IPartListener listener;

	private Spinner scale;
	
	private Map<IFile, Integer> scaleMap = new HashMap<IFile, Integer>();
	
	private IFile currentFile;
	
	static {
		JFaceResources.getImageRegistry().put(IMAGE_OK, Activator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui.preview", "/icons/16_16/security-high.png"));
		JFaceResources.getImageRegistry().put(IMAGE_WARNING, Activator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui.preview", "/icons/16_16/security-medium.png"));
		JFaceResources.getImageRegistry().put(IMAGE_ERROR, Activator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui.preview", "/icons/16_16/security-low.png"));
		JFaceResources.getImageRegistry().put(IMAGE_PREVIEW, Activator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui.preview", "/icons/16_16/view-ldap-resource.png"));

		JFaceResources.getImageRegistry().put(IMAGE_TAB_NORMAL, Activator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui.preview", "/icons/16_16/view-presentation.png"));
		JFaceResources.getImageRegistry().put(IMAGE_TAB_ERROR, new DecorationOverlayIcon(JFaceResources.getImage(IMAGE_TAB_NORMAL),Activator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui.preview", "/icons/ovr/error_co.gif"),IDecoration.BOTTOM_LEFT));
		JFaceResources.getImageRegistry().put(IMAGE_TAB_WARNING, new DecorationOverlayIcon(JFaceResources.getImage(IMAGE_TAB_NORMAL),Activator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui.preview", "/icons/ovr/warning_co.gif"),IDecoration.BOTTOM_LEFT));
		
		JFaceResources.getImageRegistry().put(IMAGE_STATUS_ERROR, Activator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui.preview", "/icons/16_16/task-reject.png"));
		JFaceResources.getImageRegistry().put(IMAGE_STATUS_WARNING, Activator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui.preview", "/icons/16_16/task-attempt.png"));
		JFaceResources.getImageRegistry().put(IMAGE_STATUS_OK, Activator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui.preview", "/icons/16_16/task-complete.png"));
		JFaceResources.getImageRegistry().put(IMAGE_STATUS_NOPREVIEW, Activator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui.preview", "/icons/16_16/dialog-information.png"));
	
		JFaceResources.getImageRegistry().put(IMAGE_LOAD_CONTROLLER, Activator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui.preview", "/icons/16_16/debug-step-into.png"));
		JFaceResources.getImageRegistry().put(IMAGE_REFRESH, Activator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui.preview", "/icons/16_16/run-build-clean.png"));
		
	}

	@Override
	public void init(IViewSite site) throws PartInitException {
		super.init(site);
		
		listener = new IPartListener() {
			
			@Override
			public void partOpened(IWorkbenchPart part) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void partDeactivated(IWorkbenchPart part) {
				if( part == LivePreviewPart.this ) {
					swtFXContainer.setEnabled(false);
				}
			}
			
			@Override
			public void partClosed(IWorkbenchPart part) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void partBroughtToTop(IWorkbenchPart part) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void partActivated(IWorkbenchPart part) {
				if( part == LivePreviewPart.this && swtFXContainer != null ) {
					swtFXContainer.setEnabled(true);	
				}
			}
		};
		
		site.getWorkbenchWindow().getPartService().addPartListener(synchronizer);
		site.getWorkbenchWindow().getPartService().addPartListener(listener);
	}

	@Override
	public void createPartControl(final Composite parent) {
		final Composite container = new Composite(parent, SWT.NONE); 
		container.setLayout(new GridLayout(3,false));
		
		folder = new CTabFolder(container, SWT.BOTTOM|SWT.BORDER);
		folder.setLayoutData(new GridData(GridData.FILL,GridData.FILL,true,true,3,1));
		
		parent.getDisplay().asyncExec(new Runnable() {
			
			@Override
			public void run() {
				
				{
					CTabItem item = new CTabItem(folder, SWT.NONE);
					
					item.setText("Preview");
					item.setImage(JFaceResources.getImage(IMAGE_PREVIEW));
					
					swtFXContainer = new FXCanvas(folder, SWT.NONE);
					swtFXContainer.setEnabled(false);

					item.setControl(swtFXContainer);
					
					Platform.runLater(new Runnable() {
						@Override
						public void run() {
							initFX(swtFXContainer);
						}
					});
				}
				
				{
					logItem = new CTabItem(folder, SWT.NONE);
					logItem.setText("Error log");
					logItem.setImage(JFaceResources.getImage(IMAGE_OK));
					
					logStatement = new Text(folder, SWT.MULTI|SWT.V_SCROLL|SWT.H_SCROLL);
					logStatement.setEditable(false);
					logItem.setControl(logStatement);
					
					Menu m = new Menu(logStatement);
					logStatement.setMenu(m);
					MenuItem clearItem = new MenuItem(m, SWT.PUSH);
					clearItem.setText("Clear Log");
					clearItem.addSelectionListener(new SelectionAdapter() {
						@Override
						public void widgetSelected(SelectionEvent e) {
							logStatement.setText("");
						}
					});
				}
				folder.setSelection(0);
				
				statusLabelIcon = new Label(container, SWT.NONE);
				statusLabelIcon.setImage(JFaceResources.getImage(IMAGE_STATUS_NOPREVIEW));
				
				statusLabelText = new Label(container, SWT.NONE);
				statusLabelText.setText(NO_PREVIEW_TEXT);
				statusLabelText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				
				Composite scaleControl = new Composite(container, SWT.NONE);
				scaleControl.setLayoutData(new GridData(GridData.END,GridData.CENTER,false,false));
				scaleControl.setLayout(new GridLayout(2,false));
				
				Label l = new Label(scaleControl, SWT.NONE);
				l.setText("Zoom");
				
				scale = new Spinner(scaleControl, SWT.BORDER);
				scale.setMinimum(10);
				scale.setMaximum(500);
				scale.setIncrement(10);
				scale.setSelection(100);
				scale.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						rootPane_new.setScaleX(scale.getSelection()/100.0);
						rootPane_new.setScaleY(scale.getSelection()/100.0);
						if( currentFile != null ) {
							scaleMap.put(currentFile, scale.getSelection());
						}
					}
				});
				
				parent.layout();
			}
		});
		
		Action loadController = new Action("",IAction.AS_CHECK_BOX) {
			@Override
			public void run() {
				preference.putBoolean(PREF_LOAD_CONTROLLER, ! preference.getBoolean(PREF_LOAD_CONTROLLER, false));
				try {
					preference.flush();
					synchronizer.refreshPreview();
				} catch (BackingStoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		loadController.setChecked(preference.getBoolean(PREF_LOAD_CONTROLLER, false));
		loadController.setImageDescriptor(JFaceResources.getImageRegistry().getDescriptor(IMAGE_LOAD_CONTROLLER));
		loadController.setToolTipText("Load the controller");
		
		Action refresh = new Action("",JFaceResources.getImageRegistry().getDescriptor(IMAGE_REFRESH)) {
			@Override
			public void run() {
				synchronizer.refreshPreview();
			}
		};
		refresh.setToolTipText("Force a refresh");
		
		getViewSite().getActionBars().getToolBarManager().add(refresh);
		getViewSite().getActionBars().getToolBarManager().add(loadController);
	}
	
	@Override
	public void dispose() {
		getSite().getWorkbenchWindow().getPartService().removePartListener(synchronizer);
		getSite().getWorkbenchWindow().getPartService().addPartListener(listener);
		
		super.dispose();
	}

	private void initFX(FXCanvas fxPanel) {
		// This method is invoked on the JavaFX thread
		rootPane_new = new BorderPane();
		Scene scene = new Scene(rootPane_new,1000,1000);
		fxPanel.setScene(scene);
	}

	@Override
	public void setFocus() {
		folder.setFocus();
	}

	private void refreshContent(final ContentData contentData) {
		folder.getDisplay().syncExec(new Runnable() {
			
			@Override
			public void run() {
				folder.setVisible(true);
			}
		});
		
		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				ClassLoader cl = null;
				
				FXMLLoader loader;
				if( contentData.extraJarPath != null && ! contentData.extraJarPath.isEmpty() ) {
					URLClassLoader previewClassLoader = new PreviewURLClassloader(contentData.extraJarPath.toArray(new URL[0]),swtFXContainer.getClass().getClassLoader());

					if( isJavaFX20() ) {
						cl = Thread.currentThread().getContextClassLoader();
						Thread.currentThread().setContextClassLoader(previewClassLoader);
						
						loader = new FXMLLoader();
					} else {
						// Bugfix for jfx betas should be removed maybe later on
						cl = Thread.currentThread().getContextClassLoader();
						Thread.currentThread().setContextClassLoader(previewClassLoader);
						
						loader = new FXMLLoader();
						loader.setClassLoader(previewClassLoader);
					}
				} else {
					loader = new FXMLLoader();
				}
				
				
				String exception = null;
				
				try {
					currentFile = contentData.file;
					loader.setStaticLoad(!preference.getBoolean(PREF_LOAD_CONTROLLER, false));
					try {
						//TODO Should we set this to the bin-Folder??
						loader.setLocation(contentData.file.getParent().getLocation().toFile().getAbsoluteFile().toURI().toURL());
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					if( contentData.resourceBundle != null ) {
						FileInputStream in = null;
						try {
							in = new FileInputStream(new File(contentData.resourceBundle));
							Properties p = new Properties();
							p.load(in);
							
							final Object[][] entries = new Object[p.entrySet().size()][];
							int i = 0;
							for( Entry<Object,Object> e : p.entrySet() ) {
								entries[i++] = new Object[]{e.getKey(),e.getValue()};
							}
							
							ListResourceBundle b = new ListResourceBundle() {
								
								@Override
								protected Object[][] getContents() {
									return entries;
								}
							};	
							loader.setResources(b);
						} catch(Exception e) {
							e.printStackTrace();
						} finally {
							if( in != null ) {
								try {
									in.close();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					}
					
					// If we are on 2.0.x we need to use another constructor
					if( isJavaFX20() ) {
						try {
							Constructor<JavaFXBuilderFactory> c = JavaFXBuilderFactory.class.getConstructor(boolean.class);
							loader.setBuilderFactory(c.newInstance(false));
						} catch (Throwable e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						loader.setBuilderFactory(new JavaFXBuilderFactory());
					}
					
					try {
						
						ByteArrayInputStream out = new ByteArrayInputStream(contentData.contents.getBytes());
						Object root = loader.load(out);
						out.close();
						
						Scene scene = null;
						if( root instanceof Scene ) {
							scene = (Scene) root;
							rootPane_new = scene.getRoot();
						} else {
							rootPane_new = (Parent) root;
							scene = new Scene(rootPane_new,10000,10000,Platform.isSupported(ConditionalFeature.SCENE3D));
						}
						
						if( scaleMap.containsKey(currentFile) ) {
							int value = scaleMap.get(currentFile).intValue();
							scale.setSelection(value);
						
							rootPane_new.setScaleX(value/100.0);
							rootPane_new.setScaleY(value/100.0);
						
						} else {
							scale.setSelection(100);
							rootPane_new.setScaleX(1);
							rootPane_new.setScaleY(1);
						}
						
						swtFXContainer.setScene(scene);
						
						scene.getStylesheets().addAll(contentData.cssFiles);
						
					} catch (Exception e) {
						StringWriter sw = new StringWriter();
						e.printStackTrace(new PrintWriter(sw));
						exception = sw.toString();
					}
				} finally {
					if( cl != null ) {
						Thread.currentThread().setContextClassLoader(cl);
					}
				}
				
				if( exception != null ) {
					final String innerException = exception;
					if( folder.isDisposed() ) {
						return;
					}
					
					folder.getDisplay().asyncExec(new Runnable() {
						
						@Override
						public void run() {
							if( innerException != null ) {
								logItem.setImage(JFaceResources.getImage(IMAGE_ERROR));
								statusLabelIcon.setImage(JFaceResources.getImage(IMAGE_STATUS_ERROR));
								statusLabelText.setText( SimpleDateFormat.getTimeInstance().format(new Date()) + ": Error while updateing preview");
								setTitleImage(JFaceResources.getImage(IMAGE_TAB_ERROR));
								folder.setSelection(logItem);
							}
							
							logStatement.setText("");
							logStatement.append("================================================================="+logStatement.getLineDelimiter());
							logStatement.append("Preview loading @ " + new Date() + logStatement.getLineDelimiter());
							logStatement.append("================================================================="+logStatement.getLineDelimiter());
							
							if( innerException != null ) {
								logStatement.append("Exception:" + logStatement.getLineDelimiter());
								logStatement.append("----------" + logStatement.getLineDelimiter());
								logStatement.append(innerException + logStatement.getLineDelimiter());
								logStatement.append(logStatement.getLineDelimiter()+logStatement.getLineDelimiter());
								logStatement.setSelection(0);
							}
						}
					});
					
				} else {
					folder.getDisplay().asyncExec(new Runnable() {
						
						@Override
						public void run() {
							folder.setSelection(0);
							logItem.setImage(JFaceResources.getImage(IMAGE_OK));
							statusLabelIcon.setImage(JFaceResources.getImage(IMAGE_STATUS_OK));
							statusLabelText.setText( SimpleDateFormat.getTimeInstance().format(new Date()) + ": Preview updated");
							setTitleImage(JFaceResources.getImage(IMAGE_TAB_NORMAL));
						}
					});
				}
			}
		});
	}
	
	private static boolean  isJavaFX20() {
		return System.getProperty("javafx.version") != null && System.getProperty("javafx.version").startsWith("2.0");
	}

	public void setContents(final ContentData contentData) {
		if( folder.isDisposed() ) {
			return;
		}
		
		if (contentData != null && contentData.contents != null) {
			refreshContent(contentData);
		} else if( rootPane_new != null ) {
			folder.getDisplay().syncExec(new Runnable() {
				
				@Override
				public void run() {
					statusLabelIcon.setImage(JFaceResources.getImage(IMAGE_STATUS_NOPREVIEW));
					statusLabelText.setText(NO_PREVIEW_TEXT);
					folder.setVisible(false);
				}
			});
		}
	}

	public static class ContentData {
		public String contents;
		public List<String> cssFiles;
		public String resourceBundle;
		public List<URL> extraJarPath;
		public IFile file;
		
		public ContentData(String contents, List<String> cssFiles, String resourceBundle, List<URL> extraJarPath, IFile file) {
			this.contents = contents;
			this.cssFiles = new ArrayList<String>(cssFiles);
			this.resourceBundle = resourceBundle;
			this.extraJarPath = extraJarPath;
			this.file = file;
//			this.relativePath = relativePath;
//			this.filePath = filePath;
		}
	}
	
	static class PreviewURLClassloader extends URLClassLoader {

		public PreviewURLClassloader(URL[] urls, ClassLoader parent) {
			super(urls, parent);
		}
		
//		public URL getResource(String name) {
//			URL url = super.getResource(name);
//			System.err.println("Get resource is called: " + name + " => " + url);
//			// If the value is not found retry with removed leading '/'
//			if( url == null && name.startsWith("/") ) {
//				url = super.getResource(name.substring(1));
//			}
//			
//			return url;
//		}
//		
//		public URL findResource(String name) {
//			URL url = super.findResource(name);
//			
//			System.err.println("Find resource is called: " + name + " => " + url);
//			// If the value is not found retry with removed leading '/'
//			if( url == null && name.startsWith("/") ) {
//				url = super.findResource(name.substring(1));
//			}
//			
//			return url;
//		}
	}
}
