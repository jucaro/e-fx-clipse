package at.bestsolution.efxclipse.runtime.example.photoedit.ui;

import static at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage.Literals.PHOTO_AREA__HEIGHT;
import static at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage.Literals.PHOTO_AREA__WIDTH;
import static at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage.Literals.PHOTO_AREA__X;
import static at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage.Literals.PHOTO_AREA__Y;
import static at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage.Literals.PHOTO__AREAS;

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

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListChangeEvent;
import org.eclipse.core.databinding.observable.list.ListDiffVisitor;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MInputPart;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFValueProperty;

import at.bestsolution.efxclipse.runtime.databinding.IJFXBeanValueProperty;
import at.bestsolution.efxclipse.runtime.databinding.JFXBeanProperties;
import at.bestsolution.efxclipse.runtime.example.photoedit.core.ResourceStore;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Album;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Media;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoArea;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditFactory;

@SuppressWarnings("restriction")
public class MediaEditor {
	@Inject
	ResourceStore store;
	
	@Inject
	MInputPart input;
	
	@Inject
	MApplication application;
	
	private Photo photo;
	
	private String tool;
	
	private PhotoArea sizedArea;
	
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
	
	@Inject
	void setTool(@Named("activetool") @Optional String tool){
		this.tool = tool;
	}
	
	@Focus
	void setFocus() {
		application.getContext().set(Media.class, photo);
	}
	
	private void initPhoto(final BorderPane pane, final Photo photo) {
		Image img = new Image((photo.getSource().getObjectStream()));
		ImageView v = new ImageView(img);
		final AnchorPane stack = new AnchorPane();
		stack.getChildren().add(v);
		
		final EMFDataBindingContext dbc = new EMFDataBindingContext();
		
		final IEMFValueProperty exProp = EMFProperties.value(PHOTO_AREA__X);
		final IEMFValueProperty eyProp = EMFProperties.value(PHOTO_AREA__Y);
		final IEMFValueProperty ewidthProp = EMFProperties.value(PHOTO_AREA__WIDTH);
		final IEMFValueProperty eheightProp = EMFProperties.value(PHOTO_AREA__HEIGHT);
		
		final IJFXBeanValueProperty fxProp = JFXBeanProperties.value("x");
		final IJFXBeanValueProperty fyProp = JFXBeanProperties.value("y");
		final IJFXBeanValueProperty fwidthProp = JFXBeanProperties.value("width");
		final IJFXBeanValueProperty fheightProp = JFXBeanProperties.value("height");
		
		for( PhotoArea a:  photo.getAreas() ) {
			Rectangle r = new Rectangle();
			r.setFill(Color.TRANSPARENT);
			r.setStroke(Color.RED);
			r.setStrokeWidth(5);
			r.setUserData(a);
			
			dbc.bindValue(fxProp.observe(r), exProp.observe(a));
			dbc.bindValue(fyProp.observe(r), eyProp.observe(a));
			dbc.bindValue(fwidthProp.observe(r), ewidthProp.observe(a));
			dbc.bindValue(fheightProp.observe(r), eheightProp.observe(a));

			stack.getChildren().add(r);	
		}
		
		pane.setCenter(stack);
		
		IObservableList l = EMFProperties.list(PHOTO__AREAS).observe(photo);
		l.addListChangeListener(new IListChangeListener() {
			
			@Override
			public void handleListChange(ListChangeEvent event) {
				event.diff.accept(new ListDiffVisitor() {
					
					@Override
					public void handleRemove(int index, Object element) {
						// TODO clean up bindings
					}
					
					@Override
					public void handleAdd(int index, Object element) {
						Rectangle r = new Rectangle();
						r.setFill(Color.TRANSPARENT);
						r.setStroke(Color.RED);
						r.setStrokeWidth(5);
						r.setUserData(element);
						
						dbc.bindValue(fxProp.observe(r), exProp.observe(element));
						dbc.bindValue(fyProp.observe(r), eyProp.observe(element));
						dbc.bindValue(fwidthProp.observe(r), ewidthProp.observe(element));
						dbc.bindValue(fheightProp.observe(r), eheightProp.observe(element));

						stack.getChildren().add(r);	
					}
				});
			}
		});
		
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
				if( !"area".equals(tool) ) {
					deltaEvent.set(event);	
				}
			}
		});
		stack.setOnMousePressed(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if( "area".equals(tool) ) {
					PhotoArea p = PhotoeditFactory.eINSTANCE.createPhotoArea();
					p.setX(event.getX());
					p.setY(event.getY());
					
					photo.getAreas().add(p);
					sizedArea = p;
				}
			}
		});
		
		stack.setOnMouseDragged(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if( "area".equals(tool) ) {
					if( sizedArea != null ) {
						double width = event.getX() - sizedArea.getX();
						double height = event.getY() - sizedArea.getY();
						sizedArea.setWidth(width);
						sizedArea.setHeight(height);
					}
				}
			}
		});
		
		stack.setOnMouseReleased(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				System.err.println("RELEASEDD!!!!!");
				sizedArea = null;
			}
		});
		
		pane.setOnMouseDragged(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if( !"area".equals(tool) ) {
					double deltaX = event.getX() - deltaEvent.get().getX();
					double deltaY = event.getY() - deltaEvent.get().getY();
					
					double targetX = stack.getTranslateX() + deltaX;
					double targetY = stack.getTranslateY() + deltaY;
					
					stack.setTranslateX(targetX);
					stack.setTranslateY(targetY);
					deltaEvent.set(event);
				}
				
			}
		});
	}
}
