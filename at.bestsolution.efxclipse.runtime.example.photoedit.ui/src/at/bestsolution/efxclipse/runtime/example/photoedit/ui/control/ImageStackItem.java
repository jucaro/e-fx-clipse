package at.bestsolution.efxclipse.runtime.example.photoedit.ui.control;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;


public class ImageStackItem { 
	private String title;
	private ImageDescriptor descriptor;
	private AnchorPane layoutContainer = new AnchorPane();
	private Node content;
	
	public ImageStackItem(String title, ImageDescriptor descriptor) {
		this.title = title;
		this.descriptor = descriptor;
	}
	
	public ImageDescriptor getDescriptor() {
		return descriptor;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setContent(Node node) {
		layoutContainer.getChildren().clear();
		if( node != null ) {
			AnchorPane.setLeftAnchor(node, 0.0);
			AnchorPane.setRightAnchor(node, 0.0);
			AnchorPane.setTopAnchor(node, 0.0);
			AnchorPane.setBottomAnchor(node, 0.0);
			layoutContainer.getChildren().add(node);
		}
	}
	
	public Node getContent() {
		return content;
	}
	
	Node getLayoutContent() {
		return layoutContainer;
	}
}
