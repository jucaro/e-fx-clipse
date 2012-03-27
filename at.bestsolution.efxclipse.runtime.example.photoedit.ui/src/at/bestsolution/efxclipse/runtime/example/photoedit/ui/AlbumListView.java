package at.bestsolution.efxclipse.runtime.example.photoedit.ui;

import java.io.InputStream;
import java.util.Map.Entry;

import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.impl.ApplicationPackageImpl;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MInputPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;

import at.bestsolution.efxclipse.runtime.example.photoedit.core.EventTopics;
import at.bestsolution.efxclipse.runtime.example.photoedit.core.ResourceStore;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Album;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Media;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoEditApp;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage;

@SuppressWarnings("restriction")
public class AlbumListView {
	private static final String PERSISTED_STATE_SELECTED_ALBUM = "PERSISTED_STATE_SELECTED_ALBUM";
	
	@Inject
	ResourceStore store;
	
	@Inject
	MPart part;
	
	@Inject
	MApplication application;
	
	@Inject
	EModelService modelService;
	
	@Inject
	EPartService partService;
	
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
		listView.getStyleClass().add("album-list");
		listView.setCellFactory(new Callback<ListView<Album>, ListCell<Album>>() {
			
			@Override
			public ListCell<Album> call(ListView<Album> param) {
				return new AlbumCell();
			}
		});
		listView.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				if( event.getClickCount() == 2 ) {
					handleOpenAlbum(listView.getSelectionModel().getSelectedItem());
				}
			}
		});
		
		pane.setCenter(listView);
	}
	
	void handleOpenAlbum(Album album) {
		part.getPersistedState().put(PERSISTED_STATE_SELECTED_ALBUM,album.getUuid());
		
		// Remove old stacks
		MPartStack stack = (MPartStack) modelService.find("editorcontainer", application);
		for( MPart p : stack.getChildren().toArray(new MPart[0]) ) {
			partService.hidePart(p, true);
		}
		
		// Add new stacks
		for( Media m : album.getMedia() ) {
			MInputPart p = MBasicFactory.INSTANCE.createInputPart();
			p.setLabel(m.getTitle());
			p.setContributionURI("bundleclass://at.bestsolution.efxclipse.runtime.example.photoedit.ui/at.bestsolution.efxclipse.runtime.example.photoedit.ui.MediaEditor");
			p.setInputURI("cdo-object://" + m.getUuid());
			stack.getChildren().add(p);
			System.err.println("Adding part" + p);
		}
		
		if( ! stack.getChildren().isEmpty() ) {
			System.err.println("Setting selection");
//			stack.setSelectedElement(stack.getChildren().get(1));
			partService.activate((MPart)stack.getChildren().get(1), true);
		}
	}
	
//	@Inject
	void albumSelectionChanged(Entry<String, String> entry) {
		if( entry != null && store.getPhotoEditApp() != null && PERSISTED_STATE_SELECTED_ALBUM.equals(entry.getKey()) ) {
			for( Album a : store.getPhotoEditApp().getAlbums() ) {
				if( a.getUuid().equals(entry.getValue()) ) {
					application.getContext().set(Album.class, a);
					return;
				}
			}
			
			application.getContext().set(Album.class, null);
		}
	}
	
	@Inject
	void storeContentLoaded(@Optional @UIEventTopic(EventTopics.STORE_NEW_CONTENT) PhotoEditApp rootElement) {
		if( store != null && store.getPhotoEditApp() != null ) {
			ObservableList<Album> list = EMFListHelper.adaptList(PhotoeditPackage.Literals.PHOTO_EDIT_APP__ALBUMS, store.getPhotoEditApp());
			listView.setItems(list);
		}
	}
	
	@PostConstruct
	void init() {
		((EObject)part).eAdapters().add(new EContentAdapter() {
			@SuppressWarnings("unchecked")
			@Override
			public void notifyChanged(Notification msg) {
				super.notifyChanged(msg);
				if( msg.getFeature() == ApplicationPackageImpl.Literals.APPLICATION_ELEMENT__PERSISTED_STATE ) {
					albumSelectionChanged((Entry<String, String>) msg.getNewValue());
				} else if( msg.getFeature() == ApplicationPackageImpl.Literals.STRING_TO_STRING_MAP__VALUE ) {
					albumSelectionChanged((Entry<String, String>) msg.getNotifier());
				}
			}			
		});
	}
	
	@Focus
	void setFocus() {
		System.err.println("Focus in album list");
	}
}
