package at.bestsolution.efxclipse.runtime.example.photoedit.ui;

import java.io.InputStream;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;

import at.bestsolution.efxclipse.runtime.example.photoedit.core.EventTopics;
import at.bestsolution.efxclipse.runtime.example.photoedit.core.ResourceStore;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Album;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage;

@SuppressWarnings("restriction")
public class AlbumListView {
	@Inject
	ResourceStore store;
	
	private ListView<Album> listView;
	
	static class AlbumCell extends ListCell<Album> {
		@Override
		protected void updateItem(Album item, boolean empty) {
			if( item != null ) {
				InputStream previewImageStream = item.getCoverImage().getSource().getPreviewObjectStream();
				Image img = new Image(previewImageStream,64,64,true,true);
				setContentDisplay(ContentDisplay.TOP);
				setAlignment(Pos.CENTER);
				setGraphic(new ImageView(img));
				setText(item.getTitle());
			}
			super.updateItem(item, empty);
		}
		
		@Override
		protected double computeMinHeight(double width) {
			return 100;
		}
		
		@Override
		protected double computePrefHeight(double width) {
			return 100;
		}
		
		@Override
		protected double computeMaxHeight(double width) {
			return 100;
		}
	}
	
	@Inject
	public AlbumListView(BorderPane pane) {
		listView = new ListView<Album>();
		listView.setCellFactory(new Callback<ListView<Album>, ListCell<Album>>() {
			
			@Override
			public ListCell<Album> call(ListView<Album> param) {
				return new AlbumCell();
			}
		});
		listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Album>() {

			@Override
			public void changed(ObservableValue<? extends Album> observable, Album oldValue, Album newValue) {
				
			}
		});
		
		pane.setCenter(listView);
	}
	
	@Inject
	void storeContentLoaded(@Optional @UIEventTopic(EventTopics.STORE_NEW_CONTENT) ResourceStore store) {
		if( store != null && store.getPhotoEditApp() != null ) {
			ObservableList<Album> list = EMFListHelper.adaptList(PhotoeditPackage.Literals.PHOTO_EDIT_APP__ALBUMS, store.getPhotoEditApp());
			listView.setItems(list);
		}
	}
}
