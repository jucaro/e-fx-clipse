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
import javafx.geometry.VPos;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.databinding.observable.value.ComputedValue;
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
		
		TableView<PhotoArea> photoAreas = new TableView<PhotoArea>();
		
		{
			TableColumn<PhotoArea, String> col = new TableColumn<PhotoArea, String>();
			col.setText("Bounds");
			col.setPrefWidth(100);
			col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<PhotoArea,String>, ObservableValue<String>>() {
				
				@Override
				public ObservableValue<String> call(final CellDataFeatures<PhotoArea, String> param) {
					//TODO We need to remove the dispose the observable created here
					ComputedValue v = new ComputedValue() {
						IObservableValue x = EMFProperties.value(PHOTO_AREA__X).observe(param.getValue());	
						IObservableValue y = EMFProperties.value(PHOTO_AREA__Y).observe(param.getValue());
						IObservableValue width = EMFProperties.value(PHOTO_AREA__WIDTH).observe(param.getValue());
						IObservableValue height = EMFProperties.value(PHOTO_AREA__HEIGHT).observe(param.getValue());
						
						@Override
						protected Object calculate() {
							return x.getValue() + "," + y.getValue() + "," + width.getValue() + "," + height.getValue();
						}
					};
					
					return AdapterFactory.adapt(v);
				}
			});

			photoAreas.getColumns().add(col);
		}
		
		{
			TableColumn<PhotoArea, String> col = new TableColumn<PhotoArea, String>();
			col.setText("Description");
			col.setPrefWidth(100);
			col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<PhotoArea,String>, ObservableValue<String>>() {
				
				@Override
				public ObservableValue<String> call(CellDataFeatures<PhotoArea, String> param) {
					//TODO We need to remove the dispose the observable created here
					IObservableValue v = EMFProperties.value(PHOTO_AREA__DESCRIPTION).observe(param.getValue());
					return AdapterFactory.adapt(v);
				}
			});
			photoAreas.getColumns().add(col);	
		}
		
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
}
