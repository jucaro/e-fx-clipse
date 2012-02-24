package at.bestsolution.efxclipse.runtime.example.photoedit.ui.control;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;
import javafx.util.Duration;

public class ImageStackPane extends BorderPane {
	private ObservableList<ImageStackItem> items = FXCollections.observableArrayList();
	
	private ToolBar headerBar;
	private ListView<ImageStackItem> stackItemsBar;
	private BorderPane contentArea;

	static class StackItemCell extends ListCell<ImageStackItem> {
		@Override
		protected void updateItem(ImageStackItem item, boolean empty) {
			super.updateItem(item, empty);
			
			if( item != null ) {
				Image img = item.getDescriptor().getImage();
				setContentDisplay(ContentDisplay.TOP);
				setAlignment(Pos.CENTER);
				setGraphic(new ImageView(img));	
			}
		}
	}
	
	public ImageStackPane() {
		headerBar = new ToolBar();
		
		Button b = new Button("Show Item Selector");
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if( ! stackItemsBar.isVisible() ) {
					FadeTransition t = new FadeTransition(new Duration(500), stackItemsBar);
					t.setFromValue(0);
					t.setToValue(0.8);
					t.play();
					stackItemsBar.setVisible(true);
				} else {
					FadeTransition t = new FadeTransition(new Duration(500), stackItemsBar);
					t.setFromValue(0.8);
					t.setToValue(0);
					t.setOnFinished(new EventHandler<ActionEvent>() {
						
						@Override
						public void handle(ActionEvent event) {
							stackItemsBar.setVisible(false);
						}
					});
					t.play();
				}
			}
		});
		headerBar.getItems().add(b);
		
		setTop(headerBar);

		AnchorPane contentPane = new AnchorPane();

		contentArea = new BorderPane();
		
		AnchorPane.setLeftAnchor(contentArea, 0.0);
		AnchorPane.setRightAnchor(contentArea, 0.0);
		AnchorPane.setTopAnchor(contentArea, 0.0);
		AnchorPane.setBottomAnchor(contentArea, 0.0);
		
		contentPane.getChildren().add(contentArea);
		
		stackItemsBar = new ListView<ImageStackItem>();
		stackItemsBar.setCellFactory(new Callback<ListView<ImageStackItem>, ListCell<ImageStackItem>>() {
			
			@Override
			public ListCell<ImageStackItem> call(ListView<ImageStackItem> param) {
				return new StackItemCell();
			}
		});
		stackItemsBar.setOrientation(Orientation.HORIZONTAL);
		stackItemsBar.setPrefHeight(50);
		stackItemsBar.setItems(items);
		
		AnchorPane.setLeftAnchor(stackItemsBar, 0.0);
		AnchorPane.setRightAnchor(stackItemsBar, 0.0);
		AnchorPane.setTopAnchor(stackItemsBar, 0.0);
		stackItemsBar.setVisible(false);
		
		contentPane.getChildren().add(stackItemsBar);

		setCenter(contentPane);
		
		selectedItemProperty().addListener(new ChangeListener<ImageStackItem>() {

			@Override
			public void changed(ObservableValue<? extends ImageStackItem> observable, ImageStackItem oldValue, ImageStackItem newValue) {
				changeContentControl(newValue != null ? newValue.getLayoutContent() : null);
			}
		});
	}

	private void changeContentControl(final Node node) {
		if( node != null ) {
			node.setScaleX(0);
			node.setScaleY(0);
			
			final ScaleTransition showTransition = new ScaleTransition(new Duration(1000), node);
			showTransition.setFromX(0.0);
			showTransition.setFromY(0.0);
			
			showTransition.setToX(1.0);
			showTransition.setToY(1.0);
			
			if( contentArea.getCenter() != null ) {
				ScaleTransition scale = new ScaleTransition(new Duration(1000));
				scale.setFromX(1.0);
				scale.setFromY(1.0);
				
				scale.setToX(10.0);
				scale.setToY(10.0);
				
				FadeTransition fade = new FadeTransition(new Duration(1000));
				fade.setFromValue(1.0);
				fade.setToValue(0.0);
				
				ParallelTransition transition = new ParallelTransition(contentArea.getCenter(),scale,fade);
				
				transition.setOnFinished(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent event) {
						node.setOpacity(1.0);
						showTransition.play();
						contentArea.setCenter(node);
					}
				});
				transition.play();
			} else {
				contentArea.setCenter(node);
				showTransition.play();
			}
		} else {
			contentArea.setCenter(null);
		}
	}
	
	public ObservableList<ImageStackItem> getItems() {
		return items;
	}

	public void setSelection(ImageStackItem item) {
		stackItemsBar.getSelectionModel().select(item);
	}

	public ReadOnlyObjectProperty<ImageStackItem> selectedItemProperty() {
		return stackItemsBar.getSelectionModel().selectedItemProperty();
	}
}
