package at.bestsolution.efxclipse.runtime.examples.layouts;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import org.eclipse.equinox.app.IApplicationContext;

import at.bestsolution.efxclipse.runtime.application.AbstractJFXApplication;
import at.bestsolution.efxclipse.runtime.panels.FillLayoutPane;
import at.bestsolution.efxclipse.runtime.panels.SashLayoutPane;

/**
 * This class controls all aspects of the JavaFX OSGi application's execution
 */
public class Application extends AbstractJFXApplication {

	@Override
	protected void jfxStart(IApplicationContext applicationContext, javafx.application.Application jfxApplication, Stage primaryStage) {
		primaryStage.setTitle("Hello JavaFX");
		
		TabPane root = new TabPane();
		root.getTabs().add(createFillLayout());
		root.getTabs().add(createSashLayout());
		root.getTabs().add(createBorderLayout());
		root.getTabs().add(createHBoxLayout());
		
		Scene scene = new Scene(root, 800, 800);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private Tab createHBoxLayout() {
		Tab tab = new Tab("HBoxLayout");
		tab.setClosable(false);
		
		HBox borderPane = new HBox();
		borderPane.setStyle("-fx-background-color: red;");
		
		Label l = new Label();
		l.setStyle("-fx-background-color: white;");
		l.setText("Hello World");
		
		borderPane.getChildren().add(l);
		tab.setContent(borderPane);
		
		return tab;
	}
	
	
	private Tab createBorderLayout() {
		Tab tab = new Tab("BorderLayout");
		tab.setClosable(false);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setStyle("-fx-background-color: red;");
		
		Label l = new Label();
		l.setStyle("-fx-background-color: white; -fx-padding: 10px;");
		l.setText("Hello World");
		
		borderPane.setCenter(l);
		tab.setContent(borderPane);
		
		return tab;
	}
	
	private Tab createSashLayout() {
		Tab tab = new Tab("SashLayout");
		tab.setClosable(false);
		
		FillLayoutPane fillLayout = new FillLayoutPane();
		fillLayout.setStyle("-fx-background-color: red");
		fillLayout.setMarginHeight(5);
		fillLayout.setMarginWidth(5);
		
		SashLayoutPane sashLayout = new SashLayoutPane();
		sashLayout.setStyle("-fx-background-color: blue");
		sashLayout.getRoot().setHorizontal(true);
		
		Label l = new Label();
		l.setStyle("-fx-background-color: white");
		
		SashLayoutPane.MUIControl data = new SashLayoutPane.MUIControl();
		data.setWeight(49.81605562579014);
		sashLayout.getRoot().add(data);
		sashLayout.getChildren().add(l);
		sashLayout.setConstraint(l, data);
		
		l = new Label();
		l.setStyle("-fx-background-color: white");
		data = new SashLayoutPane.MUIControl();
		data.setWeight(50.377192982456144);
		sashLayout.getRoot().add(data);
		sashLayout.getChildren().add(l);
		sashLayout.setConstraint(l, data);
		
		fillLayout.getChildren().add(sashLayout);
		
		tab.setContent(fillLayout);
		
		return tab;
	}
	
	private Tab createFillLayout() {
		Tab tab = new Tab("FillLayout");
		tab.setClosable(false);
		
		FillLayoutPane fillLayout = new FillLayoutPane();
		fillLayout.setStyle("-fx-background-color: red; -fx-blabla: true");
		fillLayout.setMarginHeight(5);
		fillLayout.setMarginWidth(5);
		
		Label l = new Label();
		l.setStyle("-fx-background-color: white");
		fillLayout.getChildren().add(l);
		
		l = new Label();
		l.setStyle("-fx-background-color: blue");
		fillLayout.getChildren().add(l);
		
		tab.setContent(fillLayout);
		
		return tab;
	}
}