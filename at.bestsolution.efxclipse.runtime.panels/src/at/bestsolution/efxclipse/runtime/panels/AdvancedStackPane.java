package at.bestsolution.efxclipse.runtime.panels;

import at.bestsolution.efxclipse.runtime.panels.FlingPane.FlingDirection;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;

public class AdvancedStackPane extends Region {
	private BorderPane container = new BorderPane();
	
	private BorderPane topArea;
	private BorderPane contentArea;
	
	private ObservableList<AdvancedStackItem> items = FXCollections.observableArrayList();
	
	public AdvancedStackPane() {
		this.container = new BorderPane();
		this.container.setStyle("-fx-background-color: green;");
		setStyle("-fx-background-color: red;");
		
		initTopTrim();
		initContentArea();
		
		getChildren().add(container);
	}
	
	private void initTopTrim() {
		topArea = new BorderPane();
		topArea.setCenter(new Label("Title Area"));
		topArea.setRight(new Button("Show Tab Selector"));
		topArea.setStyle("-fx-background-color: blue;");
		container.setTop(topArea);
	}
	
	private void initContentArea() {
		contentArea = new BorderPane();
		
		AnchorPane p = new AnchorPane();
		AnchorPane.setLeftAnchor(contentArea, 0.0);
		AnchorPane.setRightAnchor(contentArea, 0.0);
		AnchorPane.setTopAnchor(contentArea, 0.0);
		AnchorPane.setBottomAnchor(contentArea, 0.0);
		
		p.getChildren().add(contentArea);
		
		FlingPane flingPanel = new FlingPane();
		flingPanel.setFlingDirection(FlingDirection.HORIZONTAL);
		AnchorPane.setLeftAnchor(flingPanel, 0.0);
		AnchorPane.setRightAnchor(flingPanel, 0.0);
		AnchorPane.setTopAnchor(flingPanel, 0.0);
		
		flingPanel.setStyle("-fx-background-color: white;");
		final HBox itemsPanel = new HBox();
		itemsPanel.setStyle("-fx-background-color: green;");
		flingPanel.setContent(itemsPanel);
		items.addListener(new ListChangeListener<AdvancedStackItem>() {
			@Override
			public void onChanged(javafx.collections.ListChangeListener.Change<? extends AdvancedStackItem> c) {
				while( c.next() ) {
					if( c.wasPermutated() ) {
						
					} else {
						if( c.wasRemoved() ) {
							
						}

						if( c.wasAdded() ) {
							for( AdvancedStackItem i : c.getAddedSubList() ) {
								Label l = new Label(null, new ImageView(i.getIconDescriptorProperty().getImage()));
								itemsPanel.getChildren().add(l);
							}
						}
					}
				}
			}
		});
		
		p.getChildren().add(flingPanel);
		
		contentArea.setStyle("-fx-background-color: yellow;");
		container.setCenter(p);
	}
	
	@Override
	protected void layoutChildren() {
		super.layoutChildren();
		container.resizeRelocate(0, 0, getWidth(), getHeight());
	}
	
	public ObservableList<AdvancedStackItem> getItems() {
		return items;
	}
}
