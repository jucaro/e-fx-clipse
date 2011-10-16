package at.bestsolution.efxclipse.tooling.fxgraph.ui.preview;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Scene;

import javax.swing.JRootPane;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.list.ListDiff;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

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
				FXMLLoader loader = new FXMLLoader();
				loader.setBuilderFactory(new JavaFXBuilderFactory());
				try {
					Scene scene = rootPane.getScene();
					ListDiff d = Diffs.computeListDiff(scene.getStylesheets(), contentData.cssFiles);
					if( ! d.isEmpty() ) {
						d.applyTo(scene.getStylesheets());
					}
					
					ByteArrayInputStream out = new ByteArrayInputStream(contentData.contents.getBytes());
					Node root = (Node) loader.load(out);
					out.close();
					
					rootPane.getChildren().clear();
					rootPane.getChildren().add(root);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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

		public ContentData(String contents, List<String> cssFiles, String resourceBundle) {
			this.contents = contents;
			this.cssFiles = new ArrayList<String>(cssFiles);
			this.resourceBundle = resourceBundle;
		}
	}
}
