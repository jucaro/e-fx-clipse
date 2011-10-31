package at.bestsolution.efxclipse.tooling.fxgraph.ui.preview;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Scene;

import javax.swing.JRootPane;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

import at.bestsolution.efxclipse.runtime.panels.FillLayoutPane;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.preview.bundle.Activator;

import com.google.inject.Inject;

public class LivePreviewPart extends ViewPart {
	
	@Inject
	private LivePreviewSynchronizer synchronizer;
	
	private FillLayoutPane rootPane;

	private Text logStatement;

	private CTabFolder folder;
	
	private static final String IMAGE_OK = LivePreviewPart.class.getName() + ".IMAGE_OK";
	private static final String IMAGE_WARNING = LivePreviewPart.class.getName() + ".IMAGE_WARNING";
	private static final String IMAGE_ERROR = LivePreviewPart.class.getName() + ".IMAGE_ERROR";
	private static final String IMAGE_PREVIEW = LivePreviewPart.class.getName() + ".IMAGE_PREVIEW";

	private CTabItem logItem;
	
	static {
		JFaceResources.getImageRegistry().put(IMAGE_OK, Activator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui.preview", "/icons/16_16/security-high.png"));
		JFaceResources.getImageRegistry().put(IMAGE_WARNING, Activator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui.preview", "/icons/16_16/security-medium.png"));
		JFaceResources.getImageRegistry().put(IMAGE_ERROR, Activator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui.preview", "/icons/16_16/security-low.png"));
		JFaceResources.getImageRegistry().put(IMAGE_PREVIEW, Activator.imageDescriptorFromPlugin("at.bestsolution.efxclipse.tooling.fxgraph.ui.preview", "/icons/16_16/view-ldap-resource.png"));
	}

	@Override
	public void init(IViewSite site) throws PartInitException {
		super.init(site);
		site.getWorkbenchWindow().getPartService().addPartListener(synchronizer);
	}

	@Override
	public void createPartControl(Composite parent) {
		folder = new CTabFolder(parent, SWT.BOTTOM|SWT.BORDER);
		
		{
			CTabItem item = new CTabItem(folder, SWT.NONE);
			
			Composite composite = new Composite(folder, SWT.NO_BACKGROUND | SWT.EMBEDDED);
			composite.setLayout(new FillLayout());
			item.setControl(composite);
			item.setText("Preview");
			item.setImage(JFaceResources.getImage(IMAGE_PREVIEW));
			
			Frame frame = SWT_AWT.new_Frame(composite);
			Panel panel = new Panel(new BorderLayout()) {
				public void update(java.awt.Graphics g) {
					/* Do not erase the background */
					paint(g);
				}
			};
			frame.add(panel);

			JRootPane root = new JRootPane();
			panel.add(root);
			java.awt.Container contentPane = root.getContentPane();

			final JFXPanel jfxPanel = new JFXPanel();

			contentPane.setLayout(new BorderLayout());
			contentPane.add(jfxPanel);

			Platform.runLater(new Runnable() {
				@Override
				public void run() {
					initFX(jfxPanel);
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
	}
	
	@Override
	public void dispose() {
		getSite().getWorkbenchWindow().getPartService().removePartListener(synchronizer);
		super.dispose();
	}

	private void initFX(JFXPanel fxPanel) {
		// This method is invoked on the JavaFX thread
		rootPane = new FillLayoutPane();
		Scene scene = new Scene(rootPane,1000,1000);
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
				
				if( contentData.extraJarPath != null && ! contentData.extraJarPath.isEmpty() ) {
					cl = Thread.currentThread().getContextClassLoader();	
					Thread.currentThread().setContextClassLoader(new URLClassLoader(contentData.extraJarPath.toArray(new URL[0]),cl));
				}
				
				PrintStream syserr = System.err;
				PrintStream sysout = System.out;
				
				final ByteArrayOutputStream redirectedError = new ByteArrayOutputStream();
				final ByteArrayOutputStream redirectedOut = new ByteArrayOutputStream();
				String exception = null;
				
				try {
					System.setErr(new PrintStream(redirectedError));
					System.setErr(new PrintStream(redirectedOut));
					
					FXMLLoader loader = new FXMLLoader();
					loader.setBuilderFactory(new JavaFXBuilderFactory());
					try {
						
						ByteArrayInputStream out = new ByteArrayInputStream(contentData.contents.getBytes());
						Node root = (Node) loader.load(out);
						out.close();
						
						Scene scene = rootPane.getScene();
						
						rootPane.getChildren().clear();
						scene.getStylesheets().clear();
						scene.getStylesheets().addAll(contentData.cssFiles);
						
						rootPane.getChildren().add(root);
					} catch (Exception e) {
						StringWriter sw = new StringWriter();
						e.printStackTrace(new PrintWriter(sw));
						exception = sw.toString();
					}
				} finally {
					System.setErr(syserr);
					System.setOut(sysout);
					
					if( cl != null ) {
						Thread.currentThread().setContextClassLoader(cl);
					}
				}
				
				if( exception != null || redirectedError.size() > 0 || redirectedOut.size() > 0 ) {
					final String innerException = exception;
					folder.getDisplay().syncExec(new Runnable() {
						
						@Override
						public void run() {
							if( innerException != null ) {
								logItem.setImage(JFaceResources.getImage(IMAGE_ERROR));
							} else {
								logItem.setImage(JFaceResources.getImage(IMAGE_WARNING));
							}
							
							logStatement.append("================================================================="+logStatement.getLineDelimiter());
							logStatement.append("Preview loading @ " + new Date() + logStatement.getLineDelimiter());
							logStatement.append("================================================================="+logStatement.getLineDelimiter());
							
							if( innerException != null ) {
								logStatement.append("Exception:" + logStatement.getLineDelimiter());
								logStatement.append("----------" + logStatement.getLineDelimiter());
								logStatement.append(innerException + logStatement.getLineDelimiter());
								logStatement.append(logStatement.getLineDelimiter()+logStatement.getLineDelimiter());
							}
							
							if( redirectedError.size() > 0 ) {
								logStatement.append("STDERR:" + logStatement.getLineDelimiter());
								logStatement.append("-------" + logStatement.getLineDelimiter());
								logStatement.append(new String(redirectedError.toByteArray())+logStatement.getLineDelimiter());
								logStatement.append(logStatement.getLineDelimiter()+logStatement.getLineDelimiter());
							}
							
							if( redirectedOut.size() > 0 ) {
								logStatement.append("STDOUT:" + logStatement.getLineDelimiter());
								logStatement.append("-------"+logStatement.getLineDelimiter());
								logStatement.append(new String(redirectedOut.toByteArray())+logStatement.getLineDelimiter());
								logStatement.append(logStatement.getLineDelimiter()+logStatement.getLineDelimiter());
							}
						}
					});
					
				} else {
					folder.getDisplay().syncExec(new Runnable() {
						
						@Override
						public void run() {
							folder.setSelection(0);
							logItem.setImage(JFaceResources.getImage(IMAGE_OK));
						}
					});
				}
			}
		});
	}

	public void setContents(final ContentData contentData) {
		if (contentData != null && contentData.contents != null) {
			refreshContent(contentData);
		} else if( rootPane != null ) {
			folder.getDisplay().syncExec(new Runnable() {
				
				@Override
				public void run() {
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

		public ContentData(String contents, List<String> cssFiles, String resourceBundle, List<URL> extraJarPath) {
			this.contents = contents;
			this.cssFiles = new ArrayList<String>(cssFiles);
			this.resourceBundle = resourceBundle;
			this.extraJarPath = extraJarPath;
		}
	}
}
