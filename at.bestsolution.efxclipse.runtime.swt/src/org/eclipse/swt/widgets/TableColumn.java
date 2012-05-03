package org.eclipse.swt.widgets;

import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.util.Callback;

import org.eclipse.swt.graphics.Image;

public class TableColumn extends Item {
	private javafx.scene.control.TableColumn<TableItem, String> column;
	private int index;
	
	public TableColumn(Table parent, int style) {
		super(parent.getDisplay(), style);
		// before we call the add because we'll maybe get called immediately
		index = parent.getColumnCount();
		parent.internal_columnAdded(this);
	}
	
	@Override
	protected void doSetImage(Image image) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getText() {
		checkWidget();
		return notNullString(column.getText());
	}

	@Override
	public void setText(String string) {
		checkWidget();
		column.setText(string);
	}

	@Override
	protected void createWidget() {
		column = new javafx.scene.control.TableColumn<TableItem, String>();
		column.setCellValueFactory(new Callback<CellDataFeatures<TableItem,String>, ObservableValue<String>>() {
			
			@Override
			public ObservableValue<String> call(CellDataFeatures<TableItem, String> param) {
				return param.getValue().internal_getText(index);
			}
		});
	}

	@Override
	public javafx.scene.control.TableColumn<TableItem, String> internal_getNativeObject() {
		return column;
	}

}
