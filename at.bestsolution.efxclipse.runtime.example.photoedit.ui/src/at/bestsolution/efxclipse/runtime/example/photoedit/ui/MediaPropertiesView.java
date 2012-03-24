package at.bestsolution.efxclipse.runtime.example.photoedit.ui;

import static at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage.Literals.MEDIA__DESCRIPTION;
import static at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage.Literals.MEDIA__TITLE;
import static at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage.Literals.PHOTO_AREA__DESCRIPTION;
import static at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage.Literals.PHOTO_AREA__HEIGHT;
import static at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage.Literals.PHOTO_AREA__WIDTH;
import static at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage.Literals.PHOTO_AREA__X;
import static at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage.Literals.PHOTO_AREA__Y;
import static at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoeditPackage.Literals.PHOTO__AREAS;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.VPos;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFProperties;

import at.bestsolution.efxclipse.runtime.databinding.AdapterFactory;
import at.bestsolution.efxclipse.runtime.databinding.JFXBeanProperties;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.Media;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoArea;

@SuppressWarnings("restriction")
public class MediaPropertiesView {
	
	private WritableValue currentSelection = new WritableValue();
	private TableView<PhotoArea> photoAreas;
	
	@PostConstruct
	void init(BorderPane pane) {
		VBox box = new VBox();
		
		GridPane mediaProperties = new GridPane();
		
		EMFDataBindingContext dbc = new EMFDataBindingContext();
		
		{
			Label l = new Label("Title");
			mediaProperties.add(l, 0, 0);
			
			TextField f = new TextField();
			mediaProperties.add(f, 1, 0);
			GridPane.setHgrow(f, Priority.ALWAYS);
			dbc.bindValue(EMFProperties.value(MEDIA__TITLE).observeDetail(currentSelection), JFXBeanProperties.value("text").observe(f));
		}
		
		{
			Label l = new Label("Description");
			mediaProperties.add(l, 0, 1);
			GridPane.setValignment(l, VPos.TOP);
			
			TextArea area = new TextArea();
			area.setPrefColumnCount(15);
			mediaProperties.add(area, 1, 1);
			GridPane.setHgrow(area, Priority.ALWAYS);
			dbc.bindValue(EMFProperties.value(MEDIA__DESCRIPTION).observeDetail(currentSelection), JFXBeanProperties.value("text").observe(area));
		}
		
		TitledPane generalProps = new TitledPane("General Properties",mediaProperties);
		box.getChildren().add(generalProps);
		
		photoAreas = new TableView<PhotoArea>();
		
		{
			TableColumn<PhotoArea, String> col = new TableColumn<PhotoArea, String>();
			col.setText("Bounds");
			col.setPrefWidth(100);
			
			{
				TableColumn<PhotoArea, Double> subCol = new TableColumn<PhotoArea, Double>();
				subCol.setText("x");
				subCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<PhotoArea,Double>, ObservableValue<Double>>() {
					
					@Override
					public ObservableValue<Double> call(final CellDataFeatures<PhotoArea, Double> param) {
						return AdapterFactory.adapt(EMFProperties.value(PHOTO_AREA__X).observe(param.getValue()));
					}
				});
				
				col.getColumns().add(subCol);
			}
			
			{
				TableColumn<PhotoArea, Double> subCol = new TableColumn<PhotoArea, Double>();
				subCol.setText("y");
				subCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<PhotoArea,Double>, ObservableValue<Double>>() {
					
					@Override
					public ObservableValue<Double> call(final CellDataFeatures<PhotoArea, Double> param) {
						return AdapterFactory.adapt(EMFProperties.value(PHOTO_AREA__Y).observe(param.getValue()));
					}
				});
				
				col.getColumns().add(subCol);
			}
			
			{
				TableColumn<PhotoArea, Double> subCol = new TableColumn<PhotoArea, Double>();
				subCol.setText("width");
				subCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<PhotoArea,Double>, ObservableValue<Double>>() {
					
					@Override
					public ObservableValue<Double> call(final CellDataFeatures<PhotoArea, Double> param) {
						return AdapterFactory.adapt(EMFProperties.value(PHOTO_AREA__WIDTH).observe(param.getValue()));
					}
				});
				
				col.getColumns().add(subCol);
			}
			
			{
				TableColumn<PhotoArea, Double> subCol = new TableColumn<PhotoArea, Double>();
				subCol.setText("heigth");
				subCol.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<PhotoArea,Double>, ObservableValue<Double>>() {
					
					@Override
					public ObservableValue<Double> call(final CellDataFeatures<PhotoArea, Double> param) {
						return AdapterFactory.adapt(EMFProperties.value(PHOTO_AREA__HEIGHT).observe(param.getValue()));
					}
				});
				
				col.getColumns().add(subCol);
			}
			
			photoAreas.getColumns().add(col);
		}
		
		{
			TableColumn<PhotoArea, String> col = new TableColumn<PhotoArea, String>();
			col.setText("Description");
			col.setMaxWidth(100);
			col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<PhotoArea,String>, ObservableValue<String>>() {
				
				@Override
				public ObservableValue<String> call(CellDataFeatures<PhotoArea, String> param) {
					//TODO We need to remove the dispose the observable created here
					IObservableValue v = EMFProperties.value(PHOTO_AREA__DESCRIPTION).observe(param.getValue());
					return AdapterFactory.adapt(v);
				}
			});
			col.setCellFactory(new Callback<TableColumn<PhotoArea,String>, TableCell<PhotoArea,String>>() {
				
				@Override
				public TableCell<PhotoArea, String> call(TableColumn<PhotoArea, String> param) {
					return new EditingCell();
				}
			});
			col.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<PhotoArea,String>>() {
				
				@Override
				public void handle(CellEditEvent<PhotoArea, String> event) {
					photoAreas.getSelectionModel().getSelectedItem().setDescription(event.getNewValue());
				}
			});
			photoAreas.getColumns().add(col);
		}
		photoAreas.setEditable(true);
		
		ContextMenu mCtx = new ContextMenu();
		MenuItem mItem = new MenuItem("Remove");
		mItem.setGraphic(new ImageView(new Image(getClass().getClassLoader().getResource("/icons/edit-delete.png").toExternalForm())));
		mItem.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				PhotoArea area = photoAreas.getSelectionModel().getSelectedItem();
				photoAreas.getItems().remove(area);
			}
		});
		mCtx.getItems().add(mItem);
		photoAreas.setContextMenu(mCtx);
		
		ObservableList<PhotoArea> list = AdapterFactory.adapt(EMFProperties.list(PHOTO__AREAS).observeDetail(currentSelection));
		photoAreas.setItems(list);
		
		TitledPane areaProps = new TitledPane("Media Area Properties",photoAreas);
		box.getChildren().add(areaProps);
		VBox.setVgrow(areaProps, Priority.ALWAYS);
		
		pane.setCenter(box);
	}
	
	@Inject
	void setMedia(@Optional Media photo) {
		currentSelection.setValue(photo);
	}
	
	@Focus
	void focus() {
		System.err.println("the focus is in the properties area");
	}
	
	@Inject
	void setActivePhotoArea(@Optional PhotoArea area) {
		if( area != null && photoAreas != null ) {
			photoAreas.getSelectionModel().select(area);
		}
	}
	
	static class EditingCell extends TableCell<PhotoArea, String> {
		 
        private TextField textField;
 
        public EditingCell() {
        }
 
        @Override
        public void startEdit() {
            super.startEdit();
 
            if (textField == null) {
                createTextField();
            }
            setGraphic(textField);
            setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            textField.selectAll();
        }
 
        @Override
        public void cancelEdit() {
            super.cancelEdit();
 
            setText((String) getItem());
            setContentDisplay(ContentDisplay.TEXT_ONLY);
        }
 
        @Override
        public void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);
 
            if (empty) {
                setText(null);
                setGraphic(null);
            } else {
                if (isEditing()) {
                    if (textField != null) {
                        textField.setText(getString());
                    }
                    setGraphic(textField);
                    setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
                } else {
                    setText(getString());
                    setContentDisplay(ContentDisplay.TEXT_ONLY);
                }
            }
        }
 
        private void createTextField() {
 
            textField = new TextField(getString());
            textField.setMinWidth(this.getWidth() - this.getGraphicTextGap()*2);
            textField.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent t) {
                    if (t.getCode() == KeyCode.ENTER) {
                        commitEdit(textField.getText());
                    } else if (t.getCode() == KeyCode.ESCAPE) {
                        cancelEdit();
                    }
                }
            });
        }
        private String getString() {
            return getItem() == null ? "" : getItem().toString();
        }
    }
}
