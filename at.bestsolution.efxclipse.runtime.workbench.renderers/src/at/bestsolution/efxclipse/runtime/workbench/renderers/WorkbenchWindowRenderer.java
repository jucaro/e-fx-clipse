package at.bestsolution.efxclipse.runtime.workbench.renderers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.IPresentationEngine;
import org.eclipse.emf.common.util.URI;
import org.osgi.framework.Bundle;

import at.bestsolution.efxclipse.runtime.di.InjectingFXMLLoader;
import at.bestsolution.efxclipse.runtime.panels.FillLayoutPane;
import at.bestsolution.efxclipse.runtime.services.theme.Theme;
import at.bestsolution.efxclipse.runtime.services.theme.ThemeManager;

@SuppressWarnings("restriction")
public class WorkbenchWindowRenderer extends JFXRenderer {
	@Inject
	@Optional
	ThemeManager themeManager;
	
	@Override
	public Object createWidget(MUIElement element, Object parent) {
		if (element instanceof MWindow) {
			MWindow e = (MWindow) element;
			Stage stage = new Stage();
			stage.setX(e.getX());
			stage.setY(e.getY());
			stage.setWidth(e.getWidth());
			stage.setHeight(e.getHeight());
			stage.setTitle(((MWindow) element).getLocalizedLabel());
			stage.initStyle(StageStyle.UNDECORATED);
			
			BorderPane root = new BorderPane();
			VBox topAreaBox = new VBox();
			root.setTop(topAreaBox);
			
			root.setStyle("-fx-background-color: #999;");
			Scene scene = new Scene(root,Integer.MAX_VALUE,Integer.MAX_VALUE);
			
			if( themeManager != null ) {
				Theme theme = themeManager.getCurrentTheme();
				if( theme != null ) {
					List<String> sUrls = new ArrayList<String>();
					for( URL url : theme.getStylesheetURL() ) {
						sUrls.add(url.toExternalForm());
					}
					
					scene.getStylesheets().addAll(sUrls);
				}
			}
			
			stage.setScene(scene);

			return stage;
		}

		return null;
	}

	@Override
	public void postProcess(MUIElement childElement) {
		super.postProcess(childElement);

		Stage stage = (Stage) childElement.getWidget();
		stage.toFront();
		stage.show();
	}

	@Override
	public Object getUIContainer(MUIElement element) {
//		Stage stage = (Stage) element.getParent().getWidget();
//		return stage.getScene().getRoot();
		return null;
	}
	
	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		if ((MUIElement) container instanceof MWindow) {
			Stage stage = (Stage) container.getWidget();
			BorderPane rootPane = (BorderPane)stage.getScene().getRoot();
			VBox topAreaBox = (VBox) rootPane.getTop();
			
			IPresentationEngine renderer = (IPresentationEngine) context.get(IPresentationEngine.class.getName());
			
			MWindow window = (MWindow)(MUIElement) container;
			
			Node topDecoration = createTopDecoration(stage,window);
			if( topDecoration != null ) {
				topAreaBox.getChildren().add(topDecoration);	
			}
			
			if( window.getMainMenu() != null ) {
				Node n = (Node) renderer.createGui(window.getMainMenu());
				if( n != null ) {
					topAreaBox.getChildren().add(n);
				}
			}
			
			if( window instanceof MTrimmedWindow ) {
				MTrimmedWindow tWindow = (MTrimmedWindow) window;
				for( MTrimBar trim : tWindow.getTrimBars() ) {
					Node n = (Node) renderer.createGui(trim);
					if( n != null ) {
						switch (trim.getSide()) {
						case BOTTOM:
							rootPane.setBottom(n);
							break;
						case LEFT:
							rootPane.setLeft(n);
							break;
						case RIGHT:
							rootPane.setRight(n);
							break;
						case TOP:
							topAreaBox.getChildren().add(n);
							break;
						}
					}
				}
			}
			
			
			FillLayoutPane filllayout = new FillLayoutPane();
			rootPane.setCenter(filllayout);
			
			// Process any contents of the newly created ME
			List<MUIElement> parts = container.getChildren();
			if (parts != null) {
				// loading a legacy app will add children to the window while it is
				// being rendered.
				// this is *not* the correct place for this
				// hope that the ADD event will pick up the new part.
				MUIElement[] plist = parts.toArray(new MUIElement[parts.size()]);
				for (int i = 0; i < plist.length; i++) {
					MUIElement childME = plist[i];
					Object element = renderer.createGui(childME);
					if( element instanceof Node ) {
						filllayout.getChildren().add((Node) element);
					}
				}
			}
		}
	}
	
	protected Node createTopDecoration(final Stage stage, MWindow window) {
		String fxml = null;
		URI uri = null;
		
		for( String t : window.getTags() ) {
			if( t.startsWith("decoration#") ) {
				uri = URI.createURI(window.getContributorURI());
				fxml = t.substring("decoration#".length());
			}
		}
		
		if( fxml != null && uri != null ) {
			Bundle b = org.eclipse.core.runtime.Platform.getBundle(uri.segment(1));
			if( b != null ) {
				try {
					return (Node)InjectingFXMLLoader.create(context, b, fxml).load();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		return null;
	}
	
	@Override
	protected Object getParentWidget(MUIElement element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void disposeWidget(MUIElement part) {
		// TODO Auto-generated method stub
	}

	@Override
	public void hookControllerLogic(MUIElement me) {
		// TODO Auto-generated method stub

	}

	@Override
	public void childRendered(MElementContainer<MUIElement> parentElement, MUIElement element) {
		// TODO Auto-generated method stub

	}

	@Override
	protected Object getImage(MUILabel element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean requiresFocus(MPart element) {
		// TODO Auto-generated method stub
		return false;
	}
}
