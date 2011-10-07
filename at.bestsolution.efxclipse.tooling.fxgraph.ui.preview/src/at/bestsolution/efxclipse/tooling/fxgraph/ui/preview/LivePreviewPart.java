package at.bestsolution.efxclipse.tooling.fxgraph.ui.preview;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

import at.bestsolution.efxclipse.runtime.panels.FillLayoutPane;

import com.google.inject.Inject;


public class LivePreviewPart extends ViewPart {
	
	private static volatile LivePreviewPart CALLBACK;
	
	public static class MyApplication extends Application {
		private final LivePreviewPart callback;
		private Stage primaryStage;
		private FillLayoutPane rootPane;
		
		public MyApplication() {
			this.callback = CALLBACK;
			CALLBACK = null;
		}
		
		@Override
		public void start(Stage stage) throws Exception {
			this.primaryStage = stage;
			rootPane = new FillLayoutPane();
			Scene s = new Scene(rootPane);
			stage.setScene(s);
			stage.setX(100);
			stage.setY(100);
			stage.setWidth(400);
			stage.setHeight(400);
			stage.setTitle("Live Preview");
			stage.show();
			callback.launched(this);
		}
		
		@Override
		public void stop() throws Exception {
			super.stop();
			callback.stopped(this);
		}
		
		public void refreshContent(final String fxml) {
			Platform.runLater(new Runnable() {
				
				@Override
				public void run() {
					FXMLLoader loader = new FXMLLoader();
					loader.setBuilderFactory(new JavaFXBuilderFactory());
					try {
						ByteArrayInputStream out = new ByteArrayInputStream(fxml.getBytes());
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
	}
	
	@Inject
	private LivePreviewSynchronizer synchronizer;
	
	private volatile MyApplication applicationInstance;
	
	private Composite currentComposite;
	
	@Override
	public void init(IViewSite site) throws PartInitException {
		super.init(site);
		site.getWorkbenchWindow().getPartService().addPartListener(synchronizer);
	}
	
	@Override
	public void createPartControl(Composite parent) {
		this.currentComposite = parent;
		launchPreviewApplication();
	}
	
	private void launchPreviewApplication() {
		CALLBACK = this;
		Thread t = new Thread() {
			@Override
			public void run() {
				Application.launch(MyApplication.class, new String[0]);
			}
		};
		t.start();
	}
	
	private void stopped(MyApplication applicationInstance) {
		this.applicationInstance = null;
	}
	
	private void launched(MyApplication applicationInstance) {
		this.applicationInstance = applicationInstance;
	}
	
	@Override
	public void dispose() {
		getSite().getWorkbenchWindow().getPartService().removePartListener(synchronizer);
		if( applicationInstance != null ) {
			Platform.exit();
		}
		super.dispose();
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}

	public void setContents(final String contents) {
		if( currentComposite != null ) {
			currentComposite.getDisplay().asyncExec(new Runnable() {
				
				@Override
				public void run() {
					if( applicationInstance != null ) {
						applicationInstance.refreshContent(contents);
					}
				}
			});
		}
	}

}
