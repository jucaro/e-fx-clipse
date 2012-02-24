package at.bestsolution.efxclipse.runtime.example.photoedit.ui.control;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import at.bestsolution.efxclipse.runtime.panels.AdvancedStackItem;
import at.bestsolution.efxclipse.runtime.panels.AdvancedStackPane;

public class TestApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
//		ImageStackPane pane = new ImageStackPane();
//		
//		{
//			ImageStackItem item = new ImageStackItem("Face Angle",ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/32_32/face-angel.png")));
//			item.setContent(BorderPaneBuilder.create().center(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-angel.png")))).build());
//			pane.getItems().add(item);
//		}
//		
//		{
//			ImageStackItem item = new ImageStackItem("Face Embarrassed",ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/32_32/face-embarrassed.png")));
//			item.setContent(BorderPaneBuilder.create().center(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-embarrassed.png")))).build());
//			pane.getItems().add(item);
//		}
//		
//		{
//			ImageStackItem item = new ImageStackItem("Face Kiss",ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/32_32/face-kiss.png")));
//			item.setContent(BorderPaneBuilder.create().center(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-kiss.png")))).build());
//			pane.getItems().add(item);
//		}
//		
//		{
//			ImageStackItem item = new ImageStackItem("Face Laugh",ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/32_32/face-laugh.png")));
//			item.setContent(BorderPaneBuilder.create().center(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-laugh.png")))).build());
//			pane.getItems().add(item);
//		}
//		
//		{
//			ImageStackItem item = new ImageStackItem("Face Plain",ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/32_32/face-plain.png")));
//			item.setContent(BorderPaneBuilder.create().center(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-plain.png")))).build());
//			pane.getItems().add(item);
//		}
//		
//		{
//			ImageStackItem item = new ImageStackItem("Face Raspberry",ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/32_32/face-raspberry.png")));
//			item.setContent(BorderPaneBuilder.create().center(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-raspberry.png")))).build());
//			pane.getItems().add(item);
//		}
//		
//		{
//			ImageStackItem item = new ImageStackItem("Face Sad",ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/32_32/face-sad.png")));
//			item.setContent(BorderPaneBuilder.create().center(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-sad.png")))).build());
//			pane.getItems().add(item);
//		}
//		
//		{
//			ImageStackItem item = new ImageStackItem("Face Smile Big",ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/32_32/face-smile-big.png")));
//			item.setContent(BorderPaneBuilder.create().center(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-smile-big.png")))).build());
//			pane.getItems().add(item);
//		}
//		
//		{
//			ImageStackItem item = new ImageStackItem("Face Smile",ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/32_32/face-surprise.png")));
//			item.setContent(BorderPaneBuilder.create().center(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-surprise.png")))).build());
//			pane.getItems().add(item);
//		}
//
//		{
//			ImageStackItem item = new ImageStackItem("Face Surprise",ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/32_32/face-surprise.png")));
//			item.setContent(BorderPaneBuilder.create().center(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-surprise.png")))).build());
//			pane.getItems().add(item);
//		}
//
//		{
//			ImageStackItem item = new ImageStackItem("Face Uncertain",ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/32_32/face-uncertain.png")));
//			item.setContent(BorderPaneBuilder.create().center(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-uncertain.png")))).build());
//			pane.getItems().add(item);
//		}
//		
//		{
//			ImageStackItem item = new ImageStackItem("Face Wink",ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/32_32/face-wink.png")));
//			item.setContent(BorderPaneBuilder.create().center(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-wink.png")))).build());
//			pane.getItems().add(item);
//		}
		
//		BorderPane root = new BorderPane();
//		root.setTop(new Label("Top"));
//		root.setLeft(new Label("Left"));
//		root.setRight(new Label("Right"));
//		root.setBottom(new Label("Bottom"));
//		
//		FlingPane pane = new FlingPane();
//		pane.setFlingDirection(FlingDirection.BOTH); 
//		ScrolledContainer gallery = new ScrolledContainer();
//		pane.setContent(gallery);
//		
//		root.setCenter(pane);
		
		AdvancedStackPane root = new AdvancedStackPane();
		root.getItems().add(new AdvancedStackItem("Face Angle", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/48_48/face-angel.png"))));
		root.getItems().add(new AdvancedStackItem("Face Embarrassed", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/48_48/face-embarrassed.png"))));
		root.getItems().add(new AdvancedStackItem("Face Kiss", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/48_48/face-kiss.png"))));
		root.getItems().add(new AdvancedStackItem("Face Laugh", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/48_48/face-laugh.png"))));
		root.getItems().add(new AdvancedStackItem("Face Plain", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/48_48/face-plain.png"))));
		root.getItems().add(new AdvancedStackItem("Face Raspberry", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/48_48/face-raspberry.png"))));
		root.getItems().add(new AdvancedStackItem("Face Sad", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/48_48/face-sad.png"))));
		root.getItems().add(new AdvancedStackItem("Face Smile Big", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/48_48/face-smile-big.png"))));
		root.getItems().add(new AdvancedStackItem("Face Smile", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/48_48/face-smile.png"))));
		root.getItems().add(new AdvancedStackItem("Face Surprise", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/48_48/face-smile.png"))));
		root.getItems().add(new AdvancedStackItem("Face Uncertain", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/48_48/face-uncertain.png"))));
		root.getItems().add(new AdvancedStackItem("Face Wink", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(TestApplication.class.getResourceAsStream("sampleicons/48_48/face-wink.png"))));
			
		primaryStage.setScene(new Scene(root));
		primaryStage.setHeight(480);
		primaryStage.setWidth(640);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
