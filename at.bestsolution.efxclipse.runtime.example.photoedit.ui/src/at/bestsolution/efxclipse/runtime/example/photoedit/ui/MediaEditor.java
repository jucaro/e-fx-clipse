package at.bestsolution.efxclipse.runtime.example.photoedit.ui;

import java.util.concurrent.atomic.AtomicReference;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.RectangleBuilder;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MInputPart;

import at.bestsolution.efxclipse.runtime.example.photoedit.core.ResourceStore;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Album;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Media;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoArea;

@SuppressWarnings("restriction")
public class MediaEditor {
	@Inject
	ResourceStore store;
	
	@Inject
	MInputPart input;
	
	@Inject
	MApplication application;
	
	private Photo photo;
	
	@PostConstruct
	void init(BorderPane pane) {
		String uuid = input.getInputURI().substring("cdo-object://".length());
		for( Album a : store.getPhotoEditApp().getAlbums() ) {
			for( Media m : a.getMedia() ) {
				if( m instanceof Photo && m.getUuid().equals(uuid) ) {
					initPhoto(pane, (Photo) m);
					this.photo = (Photo) m;
					break;
				}
			}
		}
	}
	
	@Focus
	void setFocus() {
		application.getContext().set(Media.class, photo);
	}
	
	private void initPhoto(final BorderPane pane, Photo photo) {
		Image img = new Image((photo.getSource().getObjectStream()));
		ImageView v = new ImageView(img);
		final AnchorPane stack = new AnchorPane();
		stack.getChildren().add(v);
		
		for( PhotoArea a:  photo.getAreas() ) {
			Rectangle r = RectangleBuilder.create().
					width(a.getWidth()).
					height(a.getHeight()).
					x(a.getX()).
					y(a.getY()).
					fill(Color.TRANSPARENT).
					stroke(Color.RED).strokeWidth(5).build();
		
			stack.getChildren().add(r);	
		}
		
		pane.setCenter(stack);
		
		final AtomicReference<MouseEvent> deltaEvent = new AtomicReference<MouseEvent>();
		pane.setOnScroll(new EventHandler<ScrollEvent>() {

			@Override
			public void handle(ScrollEvent event) {
				int direction = event.getDeltaY() < 0 || event.isShiftDown() ? -1 : 1;
				double v = Math.max(stack.getScaleX() + 0.05 * direction,0.1);
				
				stack.setScaleX(v);
				stack.setScaleY(v);
			}
		});
		pane.setOnMousePressed(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				deltaEvent.set(event);
			}
		});
		
		pane.setOnMouseDragged(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if( event.isControlDown() ) {
					double deltaX = event.getX() - deltaEvent.get().getX();
					double deltaY = event.getY() - deltaEvent.get().getY();
					
					double targetX = stack.getTranslateX() + deltaX;
					double targetY = stack.getTranslateY() + deltaY;
					
					stack.setTranslateX(targetX);
					stack.setTranslateY(targetY);
				}
				deltaEvent.set(event);
			}
		});
	}
}
