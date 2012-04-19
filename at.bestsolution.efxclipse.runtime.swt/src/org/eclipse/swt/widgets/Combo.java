package org.eclipse.swt.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.internal.TypedListener;
import org.eclipse.swt.internal.Util;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;

public class Combo extends Composite {
	private ComboBox<String> control;
	private ObservableList<String> items;
	
	public Combo(Composite parent, int style) {
		super(parent, style);
	}

	@Override
	protected void createWidget() {
		control = new ComboBox<String>();
		items = FXCollections.observableArrayList();
		control.setItems(items);
	}
	
	@Override
	protected void internal_attachControl(Control c) {
		// TODO Auto-generated method stub
		super.internal_attachControl(c);
	}
	
	@Override
	public Parent internal_getNativeObject() {
		return control;
	}
	
	@Override
	protected double internal_getHeight() {
		return control.getHeight();
	}
	
	@Override
	protected double internal_getPrefHeight() {
		return control.prefHeight(-1);
	}
	
	@Override
	protected double internal_getPrefWidth() {
		return control.prefWidth(-1);
	}
	
	@Override
	protected double internal_getWidth() {
		return control.getWidth();
	}
	
	@Override
	protected void internal_setLayout(Layout layout) {
		// No children supported
	}
	
	public void add (String string) {
		checkWidget ();
		if (string == null) error (SWT.ERROR_NULL_ARGUMENT);
	}
	
	public void add (String string, int index) {
		checkWidget ();
		if (string == null) error (SWT.ERROR_NULL_ARGUMENT);
	}
	
	public void addModifyListener (ModifyListener listener) {
		checkWidget ();
		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		TypedListener typedListener = new TypedListener (listener);
		addListener (SWT.Modify, typedListener);
	}
	
	public void addSelectionListener(SelectionListener listener) {
		checkWidget ();
		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		TypedListener typedListener = new TypedListener (listener);
		addListener (SWT.Selection,typedListener);
		addListener (SWT.DefaultSelection,typedListener);
	}
	
	public void addVerifyListener (VerifyListener listener) {
		checkWidget ();
		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		TypedListener typedListener = new TypedListener (listener);
		addListener (SWT.Verify, typedListener);
	}
	
	public void clearSelection () {
		checkWidget ();
		control.getSelectionModel().clearSelection();
	}
	
	public void copy () {
		//TODO Not implemented
		Util.logNotImplemented();
	}
	
	public void cut () {
		//TODO Not implemented
		Util.logNotImplemented();
	}
	
	public void deselect (int index) {
		checkWidget();
		control.getSelectionModel().clearSelection(index);
	}
	
	public void deselectAll () {
		control.getSelectionModel().clearSelection();
	}
	
	public Point getCaretLocation () {
		//TODO Not implemented
		Util.logNotImplemented();
		return null;
	}
	
	public int getCaretPosition () {
		//TODO Not implemented
		Util.logNotImplemented();
		return 0;
	}
	
	public String getItem (int index) {
		checkWidget();
		return items.get(index);
	}
	
	public int getItemCount () {
		return items.size();
	}
	
	public int getItemHeight () {
		//TODO Not implemented
		Util.logNotImplemented();
		return 0;
	}
	
	public String [] getItems () {
		return items.toArray(new String[0]);
	}
	
	public boolean getListVisible () {
		checkWidget();
		return control.isShowing();
	}
	
	public Point getSelection () {
		//TODO Not implemented
		Util.logNotImplemented();
		return null;
	}
	
	public int getSelectionIndex () {
		checkWidget();
		return control.getSelectionModel().getSelectedIndex();
	}
	
	public String getText () {
		checkWidget();
		return control.getValue();
	}
	
	public int getTextHeight () {
		//TODO Not implemented
		Util.logNotImplemented();
		return 0;
	}
	
	public int getTextLimit () {
		//TODO Not implemented
		Util.logNotImplemented();
		return 0;
	}
	
	public int getVisibleItemCount () {
		checkWidget();
		return control.getVisibleRowCount();
	}
	
	public int indexOf (String string) {
		checkWidget();
		return items.indexOf(string);
	}
	
	public int indexOf (String string, int start) {
		checkWidget();
		return items.subList(start, items.size()-1).indexOf(string);
	}
	
	public void paste () {
		checkWidget ();
		//TODO No JavaFX API yet
		throw new UnsupportedOperationException();
	}
	
	public void remove (int index) {
		checkWidget();
		items.remove(index);
	}
	
	public void remove (int start, int end) {
		checkWidget();
		items.remove(start, end);
	}
	
	public void remove (String string) {
		checkWidget();
		items.remove(string);
	}
	
	public void removeAll () {
		checkWidget();
		items.clear();
	}
	
	public void removeModifyListener (ModifyListener listener) {
		checkWidget ();
		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		unregisterListener(SWT.Modify, listener);
	}
	
	public void removeSelectionListener (SelectionListener listener) {
		checkWidget ();
		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		unregisterListener(SWT.Selection, listener);
		unregisterListener(SWT.DefaultSelection,listener);	
	}
	
	public void removeVerifyListener (VerifyListener listener) {
		checkWidget ();
		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		unregisterListener(SWT.Verify, listener);
	}
	
	public void select (int index) {
		checkWidget ();
		control.getSelectionModel().select(index);
	}
	
	public void setItem (int index, String string) {
		checkWidget ();
		int idx = indexOf(string, index);
		control.getSelectionModel().select(idx);
	}
	
	public void setItems (String [] items) {
		checkWidget ();
		this.items.setAll(items);
	}
	
	public void setListVisible (boolean visible) {
		checkWidget ();
		if( visible ) {
			control.show();	
		} else {
			control.hide();
		}
	}
	
	public void setSelection (Point selection) {
		//TODO Not implemented
		Util.logNotImplemented();
	}
	
	public void setText (String string) {
		checkWidget ();
		control.setValue(string);
	}
	
	public void setTextLimit (int limit) {
		//TODO Not implemented
		Util.logNotImplemented();
	}
	
	public void setVisibleItemCount (int count) {
		checkWidget ();
		control.setVisibleRowCount(count);
	}
}
