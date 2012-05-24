package at.bestsolution.efxclipse.runtime.example.photoedit.ui.control;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class ScrolledContainer extends HBox {
	private VelocityTracker tracker = new VelocityTracker(); 
	
	public ScrolledContainer() {
//		setStyle("-fx-background-color: red");
		getChildren().add(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-angel.png"))));
		getChildren().add(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-embarrassed.png"))));
		getChildren().add(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-kiss.png"))));
		getChildren().add(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-laugh.png"))));
		getChildren().add(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-plain.png"))));
		getChildren().add(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-raspberry.png"))));
		getChildren().add(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-sad.png"))));
		getChildren().add(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-smile-big.png"))));
		getChildren().add(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-smile.png"))));
		getChildren().add(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-surprise.png"))));
		getChildren().add(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-uncertain.png"))));
		getChildren().add(new ImageView(new Image(TestApplication.class.getResourceAsStream("sampleicons/128_128/face-wink.png"))));
		
//		setOnMousePressed(new EventHandler<MouseEvent>() {
//
//			@Override
//			public void handle(MouseEvent event) {
//				tracker.addMovement(event);
//			}
//		});
//		setOnMouseDragged(new EventHandler<MouseEvent>() {
//
//			@Override
//			public void handle(MouseEvent event) {
//				tracker.addMovement(event);
//			}
//		});
//		setOnMouseReleased(new EventHandler<MouseEvent>() {
//
//			@Override
//			public void handle(MouseEvent event) {
//				tracker.addMovement(event);
//				tracker.computeCurrentVelocity(500);
//				float velocityX = tracker.getXVelocity();
//				float velocityY = tracker.getYVelocity();
//				
//				TranslateTransition translate = new TranslateTransition(new Duration(1000),ScrolledContainer.this);
//				translate.setFromX(getTranslateX());
//				
//				final Bounds b = getBoundsInLocal();
//				
//				System.err.println(b.getWidth());
//				
////				double width = 0;
////				for( Node n : getChildren() ) {
////					width += ((ImageView)n).get
////				}
////				
//				double target = getTranslateX() + velocityX;
//				if( target > 0 ) {
//					target = 200;
//					translate.setOnFinished(new EventHandler<ActionEvent>() {
//						
//						@Override
//						public void handle(ActionEvent event) {
//							TranslateTransition translate = new TranslateTransition(new Duration(500),ScrolledContainer.this);
//							translate.setFromX(getTranslateX());
//							translate.setToX(0);
//							translate.play();
//						}
//					});
//				} else if( target < b.getWidth() * -1 + getWidth()) {
//					target = b.getWidth() * -1 + getWidth() - 200;
//					translate.setOnFinished(new EventHandler<ActionEvent>() {
//						
//						@Override
//						public void handle(ActionEvent event) {
//							TranslateTransition translate = new TranslateTransition(new Duration(500),ScrolledContainer.this);
//							translate.setFromX(getTranslateX());
//							translate.setToX(b.getWidth()*-1 + getWidth());
//							translate.play();
//						}
//					});
//				}
//				
//				System.err.println("Target: " + target);
//				
//				translate.setToX(target);
//					
//				translate.play();
//				
//				
//				System.err.println("velocity: " + velocityX + "/" + velocityY);
//			}
//		});
	}
}
