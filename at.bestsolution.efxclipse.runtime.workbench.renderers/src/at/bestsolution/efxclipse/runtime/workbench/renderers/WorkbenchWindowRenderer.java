package at.bestsolution.efxclipse.runtime.workbench.renderers;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
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

import at.bestsolution.efxclipse.runtime.panels.FillLayoutPane;
import at.bestsolution.efxclipse.runtime.services.theme.Theme;
import at.bestsolution.efxclipse.runtime.services.theme.ThemeManager;

@SuppressWarnings("restriction")
public class WorkbenchWindowRenderer extends JFXRenderer {
	@Inject
	@Optional
	ThemeManager themeManager;
	
	private double mouseDragOffsetX = 0;
    private double mouseDragOffsetY = 0;
	
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
		Stage stage = (Stage) element.getParent().getWidget();
		return stage.getScene().getRoot();
	}
	
	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		if ((MUIElement) container instanceof MWindow) {
			Stage stage = (Stage) container.getWidget();
			BorderPane rootPane = (BorderPane)stage.getScene().getRoot();
			VBox topAreaBox = (VBox) rootPane.getTop();
			
			IPresentationEngine renderer = (IPresentationEngine) context.get(IPresentationEngine.class.getName());
			
			MWindow window = (MWindow)(MUIElement) container;
			
			Node topDecoration = createTopDecoration(stage);
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
	
	protected Node createTopDecoration(final Stage stage) {
		ToolBar toolBar = new ToolBar();
		toolBar.setPrefHeight(66);
        toolBar.setMinHeight(66);
        toolBar.setMaxHeight(66);
        toolBar.setId("decorationArea");
        
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);
        toolBar.getItems().add(spacer);
        toolBar.getItems().add(new WindowButtons(stage));
        
        toolBar.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent event) {
                mouseDragOffsetX = event.getSceneX();
                mouseDragOffsetY = event.getSceneY();
            }
        });
        toolBar.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent event) {
                stage.setX(event.getScreenX()-mouseDragOffsetX);
                stage.setY(event.getScreenY()-mouseDragOffsetY);
            }
        });
        
		return toolBar;
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

	static class WindowButtons extends VBox{
	    private Rectangle2D backupWindowBounds;

	    public WindowButtons(final Stage stage) {
	        super(4);
	        // create buttons
	        VBox buttonBox = new VBox(4);
	        Button closeBtn = new Button();
	        closeBtn.setId("window-close");
	        closeBtn.setOnAction(new EventHandler<ActionEvent>() {
	            @Override public void handle(ActionEvent actionEvent) {
	                Platform.exit();
	            }
	        });
	        Button minBtn = new Button();
	        minBtn.setId("window-min");
	        minBtn.setOnAction(new EventHandler<ActionEvent>() {
	            @Override public void handle(ActionEvent actionEvent) {
	                stage.setIconified(true);
	            }
	        });
	        Button maxBtn = new Button();
	        maxBtn.setId("window-max");
	        maxBtn.setOnAction(new EventHandler<ActionEvent>() {
	            @Override public void handle(ActionEvent actionEvent) {
	                final double stageY = stage.getY();
	                final Screen screen = Screen.getScreensForRectangle(stage.getX(), stageY, 1, 1).get(0);
	                Rectangle2D bounds = screen.getVisualBounds();
	                if (bounds.getMinX() == stage.getX() && bounds.getMinY() == stageY &&
	                        bounds.getWidth() == stage.getWidth() && bounds.getHeight() == stage.getHeight()) {
	                    if (backupWindowBounds != null) {
	                        stage.setX(backupWindowBounds.getMinX());
	                        stage.setY(backupWindowBounds.getMinY());
	                        stage.setWidth(backupWindowBounds.getWidth());
	                        stage.setHeight(backupWindowBounds.getHeight());
	                    }
	                } else {
	                    backupWindowBounds = new Rectangle2D(stage.getX(), stage.getY(), stage.getWidth(), stage.getHeight());
	                    final double newStageY = screen.getVisualBounds().getMinY();
	                    stage.setX(screen.getVisualBounds().getMinX());
	                    stage.setY(newStageY);
	                    stage.setWidth(screen.getVisualBounds().getWidth());
	                    stage.setHeight(screen.getVisualBounds().getHeight());
	                }
	            }
	        });
	        getChildren().addAll(closeBtn, minBtn, maxBtn);
	    }
	}
}
