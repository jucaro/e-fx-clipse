package at.bestsolution.efxclipse.tooling.fxgraph.ui.preview;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Scene;

import javax.swing.JRootPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import at.bestsolution.efxclipse.runtime.panels.FillLayoutPane;

import com.google.inject.Inject;

public class LivePreviewPart extends ViewPart {
	
	@Inject
	private LivePreviewSynchronizer synchronizer;
	
	private FillLayoutPane rootPane;

	@Override
	public void init(IViewSite site) throws PartInitException {
		super.init(site);
		site.getWorkbenchWindow().getPartService().addPartListener(synchronizer);
	}

	@Override
	public void createPartControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NO_BACKGROUND | SWT.EMBEDDED);
		
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
	
	@Override
	public void dispose() {
		getSite().getWorkbenchWindow().getPartService().removePartListener(synchronizer);
		super.dispose();
	}

	private void initFX(JFXPanel fxPanel) {
		// This method is invoked on the JavaFX thread
		rootPane = new FillLayoutPane();
		Scene scene = new Scene(rootPane);
		fxPanel.setScene(scene);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	private void refreshContent(final ContentData contentData) {
		Platform.runLater(new Runnable() {

			@Override
			public void run() {
				ClassLoader cl = null;
				
				if( contentData.extraJarPath != null && ! contentData.extraJarPath.isEmpty() ) {
					cl = Thread.currentThread().getContextClassLoader();	
					Thread.currentThread().setContextClassLoader(new URLClassLoader(contentData.extraJarPath.toArray(new URL[0]),cl));
				}
				
				
				try {
					FXMLLoader loader = new FXMLLoader();
					loader.setBuilderFactory(new JavaFXBuilderFactory());
					try {
						Scene scene = rootPane.getScene();
						scene.getStylesheets().setAll(contentData.cssFiles);
						
						ByteArrayInputStream out = new ByteArrayInputStream(contentData.contents.getBytes());
						Node root = (Node) loader.load(out);
						out.close();
						
						rootPane.getChildren().clear();
						rootPane.getChildren().add(root);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				} finally {
					if( cl != null ) {
						Thread.currentThread().setContextClassLoader(cl);
					}
				}
				
			}
		});
	}

	public void setContents(final ContentData contentData) {
		if (contentData != null && contentData.contents != null) {
			refreshContent(contentData);
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
