package at.bestsolution.efxclipse.runtime.example.photoedit.ui;

import java.io.InputStream;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;

import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Album;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Media;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Photo;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage;

@SuppressWarnings("restriction")
public class AlbumContentView {
	
	private ListView<Media> listView;

	static class MediaCell extends ListCell<Media> { 
		@Override
		protected void updateItem(Media item, boolean empty) {
			if( item != null ) {
				if(item instanceof Photo) {
					InputStream previewImageStream = ((Photo)item).getSource().getPreviewObjectStream();
					Image img = new Image(previewImageStream,128,128,true,true);
					setAlignment(Pos.CENTER);
					setGraphic(new ImageView(img));	
				}
			}
			super.updateItem(item, empty);
		}
	}
	
	@Inject
	public AlbumContentView(BorderPane pane) {
		listView = new ListView<Media>();
		listView.setOrientation(Orientation.HORIZONTAL);
		listView.setCellFactory(new Callback<ListView<Media>, ListCell<Media>>() {
			
			@Override
			public ListCell<Media> call(ListView<Media> param) {
				return new MediaCell();
			}
		});
		pane.setCenter(listView);
	}

	@Inject
	void setAlbum(@Optional Album album) {
		if( album != null ) {
			ObservableList<Media> list = EMFListHelper.adaptList(PhotoeditPackage.Literals.ALBUM__MEDIA, album);
			listView.setItems(list);	
		} else {
			ObservableList<Media> list = FXCollections.emptyObservableList();
			listView.setItems(list);
		}
		
	}
}
