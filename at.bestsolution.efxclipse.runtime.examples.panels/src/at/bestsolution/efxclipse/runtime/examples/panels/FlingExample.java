package at.bestsolution.efxclipse.runtime.examples.panels;


import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import at.bestsolution.efxclipse.runtime.panels.FlingPane;
import at.bestsolution.efxclipse.runtime.panels.FlingPane.FlingDirection;

public class FlingExample extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane rootPane = new BorderPane();
		
		rootPane.setTop(createTop());
		rootPane.setCenter(createContent());
		rootPane.setBottom(createBottom());
		
		Scene s = new Scene(rootPane);
		s.getStylesheets().add(FlingExample.class.getResource("fling/css/flingexample.css").toExternalForm());
		primaryStage.setScene(s);
		primaryStage.setWidth(320);
		primaryStage.setHeight(480);
		primaryStage.show();
	}

	private Node createContent() {
		FlingPane pane = new FlingPane();
		pane.setFlingDirection(FlingDirection.VERTICAL);
		
		VBox box = new VBox();
		
		HBox searchBox = new HBox();
		searchBox.getStyleClass().add("iphone-list-search-entry");
		TextField field = new TextField();
		field.getStyleClass().add("iphone-search-box");
		field.setPromptText("Search in inbox");
		searchBox.getChildren().add(field);
		HBox.setHgrow(field, Priority.ALWAYS);
		box.getChildren().add(searchBox);
		
		for( int i = 0; i < 30; i++ ) {
			box.getChildren().add(createMailItem("Sender " + i, "Title " + 1, "Lorem ipsum lorem ipsum lorem ipsum lorem ipsum ..."));
		}
		
		pane.setContent(box);
		
		return pane;
	}
	
	private Node createMailItem(String sender, String title, String teaser) {
		HBox entry = new HBox();
		entry.getStyleClass().add("iphone-list-entry");
		
		Region spacer = new Region();
		spacer.getStyleClass().add("iphone-list-entry-spacer");
		entry.getChildren().add(spacer);
		
		VBox p = new VBox();
		
		{
			Label l = new Label(sender);
			l.getStyleClass().add("iphone-list-entry-header");
			p.getChildren().add(l);
		}
		
		{
			Label l = new Label(title);
			l.getStyleClass().add("iphone-list-entry-subheader");
			p.getChildren().add(l);
		}
		
		{
			Label l = new Label(teaser);
			l.getStyleClass().add("iphone-list-entry-extra");
			p.getChildren().add(l);
		}
		
		entry.getChildren().add(p);
		
		BorderPane icon = new BorderPane();
		Rectangle r = new Rectangle(10, 60/2.3);
		r.setFill(Color.GRAY);
		r.setClip(new ImageView(new Image(FlingExample.class.getResourceAsStream("fling/icons/right.png"),10, 60/2.3,true,true)));
		icon.setCenter(r);
		entry.getChildren().add(icon);
		
		return entry;
	}
	
	private Node createTop() {
		BorderPane top = new BorderPane();
		top.setId("iphone-toolbar");
		
		Button inboxesButton = new Button();
		inboxesButton.getStyleClass().add("iphone-button");
		inboxesButton.setText("Back");
		top.setLeft(inboxesButton);
		
		Label l = new Label("Inbox");
		l.getStyleClass().add("iphone-header");
		top.setCenter(l);
		
		Button editButton = new Button();
		editButton.getStyleClass().add("iphone-button");
		editButton.setText("Edit");
		top.setRight(editButton);
		
		return top;
	}
	
	private Node createBottom() {
		BorderPane bottom = new BorderPane();
		bottom.setId("iphone-toolbar");
		
		Rectangle refresh = new Rectangle();
		refresh.setFill(Color.WHITE);
		refresh.setClip(new ImageView(new Image(FlingExample.class.getResourceAsStream("fling/icons/refresh.png"),20,20,true,true)));
		refresh.setHeight(20);
		refresh.setWidth(20);
		bottom.setLeft(refresh);
		
		Label l = new Label("Refresh: 12.02.12 18:31");
		l.getStyleClass().add("iphone-status");
		bottom.setCenter(l);
		
		Rectangle compose = new Rectangle();
		compose.setFill(Color.WHITE);
		compose.setClip(new ImageView(new Image(FlingExample.class.getResourceAsStream("fling/icons/compose.png"),20,20,true,true)));
		compose.setHeight(20);
		compose.setWidth(20);
		bottom.setRight(compose);
		
		return bottom;
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
