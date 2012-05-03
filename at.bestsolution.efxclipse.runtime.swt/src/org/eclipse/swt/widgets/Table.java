package org.eclipse.swt.widgets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.TableViewSelectionModel;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.internal.Util;

public class Table extends Composite {
	private TableView<TableItem> view;
	private ObservableList<TableItem> list;

	private List<TableColumn> columns = new ArrayList<TableColumn>();

	public Table(Composite parent, int style) {
		super(parent, style);
	}
	
	@Override
	protected void internal_attachControl(Control c) {
		// TODO Auto-generated method stub
		super.internal_attachControl(c);
	}
	
	@Override
	public Parent internal_getNativeObject() {
		return view;
	}
	
	@Override
	protected double internal_getHeight() {
		return view.getHeight();
	}
	
	@Override
	protected double internal_getPrefHeight() {
		return view.prefHeight(-1);
	}
	
	@Override
	protected double internal_getPrefWidth() {
		return view.prefWidth(-1);
	}
	
	@Override
	protected double internal_getWidth() {
		return view.getHeight();
	}
	
	public void internal_itemAdded(TableItem item) {
		list.add(item);
	}

	public void internal_columnAdded(TableColumn column) {
		columns.add(column);
		view.getColumns().add(column.internal_getNativeObject());
	}
	
	@Override
	protected void createWidget() {
		this.list = FXCollections.observableArrayList();
		this.view = new TableView<TableItem>(list);
	}

	public void clear(int index) {
		// TODO Not implemented
		Util.logNotImplemented();
	}

	public void clear(int start, int end) {
		// TODO Not implemented
		Util.logNotImplemented();
	}

	public void clear(int[] indices) {
		// TODO Not implemented
		Util.logNotImplemented();
	}

	public void clearAll() {
		// TODO Not implemented
		Util.logNotImplemented();
	}

	public void deselect(int index) {
		checkWidget();
		view.getSelectionModel().clearSelection(index);
	}

	public void deselect(int start, int end) {
		checkWidget();
		TableViewSelectionModel<TableItem> model = view.getSelectionModel();
		for (; start <= end; start++) {
			model.clearSelection(start);
		}
	}

	public void deselect(int[] indices) {
		checkWidget();
		TableViewSelectionModel<TableItem> model = view.getSelectionModel();
		for (int idx : indices) {
			model.clearSelection(idx);
		}
	}

	public void deselectAll() {
		checkWidget();
		view.getSelectionModel().clearSelection();
	}

	public TableColumn getColumn(int index) {
		checkWidget();
		if (!(0 <= index && index < getColumnCount())) {
			error(SWT.ERROR_INVALID_RANGE);
		}
		return columns.get(index);
	}

	public int getColumnCount() {
		return columns.size();
	}

	public int[] getColumnOrder() {
		// TODO Not implemented
		Util.logNotImplemented();
		return null;
	}

	public TableColumn[] getColumns() {
		checkWidget();
		return columns.toArray(new TableColumn[0]);
	}

	public int getGridLineWidth() {
		// TODO Not implemented
		Util.logNotImplemented();
		return 0;
	}

	public int getHeaderHeight() {
		// TODO Not implemented
		Util.logNotImplemented();
		return 0;
	}

	public boolean getHeaderVisible() {
		// TODO Not implemented
		Util.logNotImplemented();
		return true;
	}

	public TableItem getItem(int index) {
		if (!(0 <= index && index < getItemCount())) {
			error(SWT.ERROR_INVALID_RANGE);
		}
		return list.get(index);
	}

	public TableItem getItem(Point point) {
		// TODO Not implemented
		Util.logNotImplemented();
		return null;
	}

	public int getItemCount() {
		checkWidget();
		return list.size();
	}

	public int getItemHeight() {
		// TODO Not implemented
		Util.logNotImplemented();
		return 0;
	}

	public TableItem[] getItems() {
		checkWidget();
		return list.toArray(new TableItem[0]);
	}

	public boolean getLinesVisible() {
		// TODO Not implemented
		Util.logNotImplemented();
		return true;
	}

	public TableItem[] getSelection() {
		checkWidget();
		return view.getSelectionModel().getSelectedItems().toArray(new TableItem[0]);
	}

	public int getSelectionCount() {
		checkWidget();
		return view.getSelectionModel().getSelectedIndices().size();
	}

	public int getSelectionIndex() {
		checkWidget();
		return view.getSelectionModel().getSelectedIndex();
	}

	public int[] getSelectionIndices() {
		checkWidget();
		ObservableList<Integer> l = view.getSelectionModel().getSelectedIndices();
		int[] rv = new int[l.size()];
		int j = 0;
		for( Integer i : l ) {
			rv[j++] = i.intValue();
		}
		return rv;
	}

	public TableColumn getSortColumn() {
		// TODO Not implemented
		Util.logNotImplemented();
		return null;
	}

	public int getSortDirection() {
		// TODO Not implemented
		Util.logNotImplemented();
		return 0;
	}

	public int getTopIndex() {
		// TODO Not implemented
		Util.logNotImplemented();
		return 0;
	}

	public int indexOf(TableColumn column) {
		checkWidget();
		return columns.indexOf(column);
	}

	public int indexOf(TableItem item) {
		checkWidget();
		return list.indexOf(item);
	}

	public boolean isSelected(int index) {
		checkWidget();
		return view.getSelectionModel().isSelected(index);
	}

	public void remove(int index) {
		checkWidget();
		list.remove(index);
	}

	public void remove(int start, int end) {
		checkWidget();
		list.remove(start, end);
	}

	public void remove(int[] indices) {
		checkWidget();
		Util.removeListIndices(list, indices);
	}

	public void removeAll() {
		checkWidget();
		list.clear();
	}

	public void removeSelectionListener(SelectionListener listener) {
		// TODO Not implemented
		Util.logNotImplemented();
	}

	public void select(int index) {
		checkWidget();
		view.getSelectionModel().select(index);
	}

	public void select(int start, int end) {
		checkWidget();
		view.getSelectionModel().selectRange(start, end);
	}

	public void select(int[] indices) {
		checkWidget();
		if( indices.length == 0 ) {
			view.getSelectionModel().clearSelection();
		} else if( indices.length == 1 ) {
			view.getSelectionModel().selectIndices(indices[0]);
		} else {
			int idx = indices[0];
			int[] rest = new int[indices.length-1];
			System.arraycopy(indices, 1, rest, 0, indices.length-1);
			view.getSelectionModel().selectIndices(idx,rest);
		}
	}

	public void selectAll() {
		checkWidget();
		view.getSelectionModel().clearSelection();
	}

	public void setColumnOrder(int[] order) {
		// TODO Not implemented
		Util.logNotImplemented();
	}

	public void setHeaderVisible(boolean show) {
		// TODO Not implemented
		Util.logNotImplemented();
	}

	public void setItemCount(int count) {
		// TODO Not implemented
		Util.logNotImplemented();
	}

	public void setLinesVisible(boolean show) {
		// TODO Not implemented
		Util.logNotImplemented();
	}

	public void setSelection(int index) {
		checkWidget();
		view.getSelectionModel().clearAndSelect(index);
		view.getFocusModel().focus(index);
	}

	public void setSelection(int start, int end) {
		checkWidget();
		view.getSelectionModel().clearSelection();
		select(start, end);
		view.getFocusModel().focus(end);
	}

	public void setSelection(int[] indices) {
		checkWidget();
		view.getSelectionModel().clearSelection();
		if( indices.length > 0 ) {
			int[] sorted = new int[indices.length];
			System.arraycopy(indices, 0, sorted, 0, indices.length);
			Arrays.sort(sorted);
			view.getFocusModel().focus(sorted[sorted.length-1]);
		}
	}

	public void setSelection(TableItem item) {
		checkWidget();
		view.getSelectionModel().clearSelection();
		view.getSelectionModel().select(item);
		view.getFocusModel().focus(view.getSelectionModel().getSelectedIndex());
	}

	public void setSelection(TableItem[] items) {
		checkWidget();
		view.getSelectionModel().clearSelection();
		for( TableItem t : items ) {
			view.getSelectionModel().select(t);	
		}
		view.getFocusModel().focus(view.getSelectionModel().getSelectedIndex());
	}

	public void setSortColumn(TableColumn column) {
		// TODO Not implemented
		Util.logNotImplemented();
	}

	public void setSortDirection(int direction) {
		// TODO Not implemented
		Util.logNotImplemented();
	}

	public void setTopIndex(int index) {
		// TODO Not implemented
		Util.logNotImplemented();
	}

	public void showColumn(TableColumn column) {
		// TODO Not implemented
		Util.logNotImplemented();
	}

	public void showItem(TableItem item) {
		// TODO Not implemented
		Util.logNotImplemented();
	}

	public void showSelection() {
		// TODO Not implemented
		Util.logNotImplemented();
	}
}
