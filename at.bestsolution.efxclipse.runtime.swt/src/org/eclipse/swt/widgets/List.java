package org.eclipse.swt.widgets;

import java.util.Arrays;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.ListView;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.internal.TypedListener;
import org.eclipse.swt.internal.Util;

public class List extends Scrollable {
	private ListView<String> control;
	private ObservableList<String> items;
	
	public List(Composite parent, int style) {
		super(parent, style);
	}

	@Override
	public Node internal_getNativeObject() {
		return control;
	}

	@Override
	public Point computeSize(int wHint, int hHint, boolean flushCache) {
		int width = (int) control.prefWidth(-1);
		int height = (int) control.prefHeight(-1);
		
		if (wHint != SWT.DEFAULT) width = wHint;
		if (hHint != SWT.DEFAULT) height = hHint;
				
		return new Point(width, height);
	}

	@Override
	public Point getSize() {
		return new Point((int)control.getWidth(), (int)control.getHeight());
	}

	@Override
	protected void createWidget() {
		control = new ListView<String>();
		items = FXCollections.observableArrayList();
		control.setItems(items);
	}

	public void add (String string) {
		checkWidget ();
		if (string == null) error (SWT.ERROR_NULL_ARGUMENT);
		items.add(string);
	}
	
	public void add (String string, int index) {
		checkWidget ();
		if (string == null) error (SWT.ERROR_NULL_ARGUMENT);
		items.add(index, string);
	}
	
	public void addSelectionListener(SelectionListener listener) {
		checkWidget ();
		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		TypedListener typedListener = new TypedListener (listener);
		addListener (SWT.Selection,typedListener);
		addListener (SWT.DefaultSelection,typedListener);
	}
	
	public void deselect (int index) {
		checkWidget ();
		control.getSelectionModel().clearSelection(index);
	}

	public void deselect (int start, int end) {
		checkWidget ();
		for( ; start <= end; start++ ) {
			control.getSelectionModel().clearSelection(start);
		}
	}
	
	public void deselect (int [] indices) {
		checkWidget ();
		for( int i : indices ) {
			control.getSelectionModel().clearSelection(i);
		}
	}
	
	public void deselectAll () {
		checkWidget ();
		control.getSelectionModel().clearSelection();
	}
	
	public int getFocusIndex () {
		checkWidget ();
		return control.getFocusModel().getFocusedIndex();
	}
	
	public String getItem (int index) {
		checkWidget ();
		return items.get(index);
	}
	
	public int getItemCount () {
		checkWidget ();
		return items.size();
	}
	
	public int getItemHeight () {
		//TODO Not implemented
		Util.logNotImplemented();
		return -1;
	}
	
	public String [] getItems () {
		checkWidget ();
		return items.toArray(new String[0]);
	}
	
	public String [] getSelection () {
		checkWidget ();
		return control.getSelectionModel().getSelectedItems().toArray(new String[0]);
	}
	
	public int getSelectionCount () {
		checkWidget ();
		return control.getSelectionModel().getSelectedIndices().size();
	}
	
	public int getSelectionIndex () {
		checkWidget ();
		return control.getSelectionModel().getSelectedIndex();
	}
	
	public int [] getSelectionIndices () {
		checkWidget ();
		ObservableList<Integer> l = control.getSelectionModel().getSelectedIndices();
		int[] rv = new int[l.size()];
		for( int i = 0; i < l.size(); i++ ) {
			rv[i] = l.get(i).intValue();
		}
		return rv;
	}
	
	public int getTopIndex () {
		//TODO Not implemented
		Util.logNotImplemented();
		return -1;
	}
	
	public int indexOf (String string) {
		checkWidget ();
		return items.indexOf(string);
	}
	
	public int indexOf (String string, int start) {
		checkWidget ();
		return items.subList(start, items.size()-1).indexOf(string);
	}
	
	public boolean isSelected (int index) {
		checkWidget ();
		return control.getSelectionModel().isSelected(index);
	}
	
	public void remove (int index) {
		checkWidget ();
		items.remove(index);
	}
	
	public void remove (int start, int end) {
		checkWidget ();
		items.remove(start, end);
	}
	
	public void remove (int [] indices) {
		checkWidget ();
		Util.removeListIndices(items, indices);
	}
	
	public void remove (String string) {
		checkWidget ();
		items.remove(string);
	}
	
	public void removeAll () {
		checkWidget ();
		items.clear();
	}
	
	public void removeSelectionListener(SelectionListener listener) {
		//TODO Not implemented
		Util.logNotImplemented();
	}
	
	public void select (int index) {
		checkWidget ();
		control.getSelectionModel().select(index);
	}
	
	public void select (int start, int end) {
		checkWidget ();
		control.getSelectionModel().selectRange(start, end);
	}
	
	public void select (int [] indices) {
		checkWidget ();
		if( indices.length == 0 ) {
			control.getSelectionModel().clearSelection();
		} else if( indices.length == 1 ) {
			control.getSelectionModel().selectIndices(indices[0]);
		} else {
			int idx = indices[0];
			int[] rest = new int[indices.length-1];
			System.arraycopy(indices, 1, rest, 0, indices.length-1);
			control.getSelectionModel().selectIndices(idx,rest);
		}
	}
	
	public void selectAll () {
		checkWidget ();
		control.getSelectionModel().selectAll();
	}
	
	public void setItem (int index, String string) {
		checkWidget ();
		items.set(index, string);
	}
	
	public void setItems (String [] items) {
		checkWidget ();
		this.items.setAll(items);
	}
	
	public void setSelection (int index) {
		checkWidget ();
		control.getSelectionModel().clearAndSelect(index);
		control.getFocusModel().focus(index);
	}
	
	public void setSelection (int start, int end) {
		checkWidget ();
		control.getSelectionModel().clearSelection();
		select(start, end);
		control.getFocusModel().focus(end);
	}
	
	public void setSelection(int [] indices) {
		checkWidget ();
		control.getSelectionModel().clearSelection();
		select(indices);
		if( indices.length > 0 ) {
			int[] sorted = new int[indices.length];
			System.arraycopy(indices, 0, sorted, 0, indices.length);
			Arrays.sort(sorted);
			control.getFocusModel().focus(sorted[sorted.length-1]);
		}
	}
	
	public void setSelection (String [] items) {
		checkWidget ();
		for( String i : items ) {
			control.getSelectionModel().select(i);	
		}
	}
	
	public void setTopIndex (int index) {
		//TODO Not implemented
		Util.logNotImplemented();
	}
	
	public void showSelection () {
		checkWidget ();
		int indices[] = getSelectionIndices();
		if( indices.length > 0 ) {
			int[] sorted = new int[indices.length];
			System.arraycopy(indices, 0, sorted, 0, indices.length);
			Arrays.sort(sorted);
			control.getFocusModel().focus(sorted[sorted.length-1]);
		}
	}
}
