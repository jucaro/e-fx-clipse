package @@packageName_parts@@;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MStackElement;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

import @@packageName_model@@.Media;
import @@packageName_model@@.MediaType;

@SuppressWarnings("restriction")
public class MediaListPart {
	static class MediaCell extends ListCell<Media> {
		@Override
		protected void updateItem(Media item, boolean empty) {
			if(  ! empty && item != null ) {
				setText(item.getName());
				switch (item.getType()) {
				case MOVIE:
					setGraphic(new ImageView("platform:/plugin/@@projectName@@/icons/tool-animator.png"));
					break;
				case PICTURE:
					setGraphic(new ImageView("platform:/plugin/@@projectName@@/icons/games-config-background.png"));
					break;
				default:
					setGraphic(new ImageView("platform:/plugin/@@projectName@@/icons/player-volume.png"));
					break;
				}				
			}
			super.updateItem(item, empty);
		}
	}
	
	
	@Inject
	EPartService partService;
	
	@Inject
	EModelService modelService;
	
	@Inject
	MApplication application;
	
	private ListView<Media> list;
	
	@PostConstruct
	void init(BorderPane pane) {
		list = new ListView<Media>(createList());
		list.setCellFactory(new Callback<ListView<Media>, ListCell<Media>>() {
			
			@Override
			public ListCell<Media> call(ListView<Media> param) {
				return new MediaCell();
			}
		});
		list.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if( event.getClickCount() > 1 ) {
					handleOpen();
				}
			}
		});
		pane.setCenter(list);
	}
	
	void handleOpen() {
		MPartStack stack = (MPartStack) modelService.find("content.stack", application);
		Media m = list.getSelectionModel().getSelectedItem();
		String instance = Media.serialize(m);
				
		for( MStackElement e : stack.getChildren() ) {
			if( e instanceof MPart ) {
				if( instance.equals(e.getPersistedState().get(MediaPart.MEDIA_OBJECT_KEY)) ) {
					partService.activate((MPart) e);
					return;
				}
			}
		}
		
		MPart p = MBasicFactory.INSTANCE.createPart();
		p.setLabel(m.getName());
		if( m.getType() == MediaType.MOVIE ) {
			p.setIconURI("platform:/plugin/@@projectName@@/icons/22/tool-animator.png");	
		} else if( m.getType() == MediaType.PICTURE ) {
			p.setIconURI("platform:/plugin/@@projectName@@/icons/22/games-config-background.png");
		} else {
			p.setIconURI("platform:/plugin/@@projectName@@/icons/22/player-volume.png");
		}
		
		p.setContributionURI("bundleclass://@@projectName@@/@@packageName_parts@@.MediaPart");
		p.getPersistedState().put(MediaPart.MEDIA_OBJECT_KEY, instance);
		stack.getChildren().add(p);
		partService.activate(p,true);
	}
	
	void focus() {
		list.requestFocus();
	}
	
	private static ObservableList<Media> createList() {
		ObservableList<Media> l = FXCollections.observableArrayList();
		l.add(new Media(MediaType.PICTURE, "Desert",     "platform:/plugin/@@projectName@@/icons/resources/pics/pic1.jpg"));
		l.add(new Media(MediaType.PICTURE, "Lighthouse", "platform:/plugin/@@projectName@@/icons/resources/pics/pic2.jpg"));
		l.add(new Media(MediaType.MOVIE,   "Grog",       "platform:/plugin/@@projectName@@/icons/resources/movs/mov1.flv"));
		l.add(new Media(MediaType.MOVIE,   "OTN",        "http://download.oracle.com/otndocs/products/javafx/oow2010-2.flv"));
		return l;
	}
}