package at.bestsolution.efxclipse.runtime.examples.panels;

import at.bestsolution.efxclipse.runtime.panels.AdvancedStackItem;
import at.bestsolution.efxclipse.runtime.panels.AdvancedStackPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdvancedStackExample extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		AdvancedStackPane root = new AdvancedStackPane();
		root.getItems().add(new AdvancedStackItem("Face Angle", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-angel.png"))));
		root.getItems().add(new AdvancedStackItem("Face Embarrassed", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-embarrassed.png"))));
		root.getItems().add(new AdvancedStackItem("Face Kiss", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-kiss.png"))));
		root.getItems().add(new AdvancedStackItem("Face Laugh", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-laugh.png"))));
		root.getItems().add(new AdvancedStackItem("Face Plain", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-plain.png"))));
		root.getItems().add(new AdvancedStackItem("Face Raspberry", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-raspberry.png"))));
		root.getItems().add(new AdvancedStackItem("Face Sad", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-sad.png"))));
		root.getItems().add(new AdvancedStackItem("Face Smile Big", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-smile-big.png"))));
		root.getItems().add(new AdvancedStackItem("Face Smile", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-smile.png"))));
		root.getItems().add(new AdvancedStackItem("Face Surprise", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-smile.png"))));
		root.getItems().add(new AdvancedStackItem("Face Uncertain", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-uncertain.png"))));
		root.getItems().add(new AdvancedStackItem("Face Wink", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-wink.png"))));

		root.getItems().add(new AdvancedStackItem("Face Angle", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-angel.png"))));
		root.getItems().add(new AdvancedStackItem("Face Embarrassed", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-embarrassed.png"))));
		root.getItems().add(new AdvancedStackItem("Face Kiss", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-kiss.png"))));
		root.getItems().add(new AdvancedStackItem("Face Laugh", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-laugh.png"))));
		root.getItems().add(new AdvancedStackItem("Face Plain", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-plain.png"))));
		root.getItems().add(new AdvancedStackItem("Face Raspberry", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-raspberry.png"))));
		root.getItems().add(new AdvancedStackItem("Face Sad", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-sad.png"))));
		root.getItems().add(new AdvancedStackItem("Face Smile Big", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-smile-big.png"))));
		root.getItems().add(new AdvancedStackItem("Face Smile", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-smile.png"))));
		root.getItems().add(new AdvancedStackItem("Face Surprise", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-smile.png"))));
		root.getItems().add(new AdvancedStackItem("Face Uncertain", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-uncertain.png"))));
		root.getItems().add(new AdvancedStackItem("Face Wink", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-wink.png"))));

		
		root.getItems().add(new AdvancedStackItem("Face Angle", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-angel.png"))));
		root.getItems().add(new AdvancedStackItem("Face Embarrassed", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-embarrassed.png"))));
		root.getItems().add(new AdvancedStackItem("Face Kiss", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-kiss.png"))));
		root.getItems().add(new AdvancedStackItem("Face Laugh", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-laugh.png"))));
		root.getItems().add(new AdvancedStackItem("Face Plain", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-plain.png"))));
		root.getItems().add(new AdvancedStackItem("Face Raspberry", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-raspberry.png"))));
		root.getItems().add(new AdvancedStackItem("Face Sad", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-sad.png"))));
		root.getItems().add(new AdvancedStackItem("Face Smile Big", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-smile-big.png"))));
		root.getItems().add(new AdvancedStackItem("Face Smile", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-smile.png"))));
		root.getItems().add(new AdvancedStackItem("Face Surprise", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-smile.png"))));
		root.getItems().add(new AdvancedStackItem("Face Uncertain", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-uncertain.png"))));
		root.getItems().add(new AdvancedStackItem("Face Wink", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-wink.png"))));

		
		root.getItems().add(new AdvancedStackItem("Face Angle", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-angel.png"))));
		root.getItems().add(new AdvancedStackItem("Face Embarrassed", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-embarrassed.png"))));
		root.getItems().add(new AdvancedStackItem("Face Kiss", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-kiss.png"))));
		root.getItems().add(new AdvancedStackItem("Face Laugh", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-laugh.png"))));
		root.getItems().add(new AdvancedStackItem("Face Plain", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-plain.png"))));
		root.getItems().add(new AdvancedStackItem("Face Raspberry", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-raspberry.png"))));
		root.getItems().add(new AdvancedStackItem("Face Sad", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-sad.png"))));
		root.getItems().add(new AdvancedStackItem("Face Smile Big", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-smile-big.png"))));
		root.getItems().add(new AdvancedStackItem("Face Smile", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-smile.png"))));
		root.getItems().add(new AdvancedStackItem("Face Surprise", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-smile.png"))));
		root.getItems().add(new AdvancedStackItem("Face Uncertain", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-uncertain.png"))));
		root.getItems().add(new AdvancedStackItem("Face Wink", at.bestsolution.efxclipse.runtime.panels.ImageDescriptor.fromInputStream(AdvancedStackExample.class.getResourceAsStream("advancedstack/icons/48_48/face-wink.png"))));

		
		Scene s = new Scene(root);
		s.getStylesheets().add(AdvancedStackExample.class.getResource("advancedstack/css/stackexample.css").toExternalForm());
		primaryStage.setScene(s);
		primaryStage.setWidth(640);
		primaryStage.setHeight(480);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
