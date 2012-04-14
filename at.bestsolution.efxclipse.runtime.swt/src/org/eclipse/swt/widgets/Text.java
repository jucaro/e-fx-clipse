package org.eclipse.swt.widgets;

import javafx.scene.control.TextField;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SegmentListener;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.internal.TypedListener;

public class Text extends Scrollable {
	private TextField textField;
	
	public Text(Composite parent, int style) {
		super(parent,style);
	}
	
	@Override
	protected void createWidget() {
		textField = new TextField();
	}
	
	protected void initListeners() {
		
	}

	@Override
	public TextField internal_getNode() {
		return textField;
	}
	
	public void addModifyListener (ModifyListener listener) {
//		checkWidget ();
//		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		TypedListener typedListener = new TypedListener (listener);
		addListener (SWT.Modify, typedListener);
	}
	
	public void addSegmentListener (SegmentListener listener) {
//		checkWidget ();
//		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		addListener (SWT.Segments, new TypedListener (listener));
	}
	
	public void addSelectionListener (SelectionListener listener) {
//		checkWidget ();
//		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		TypedListener typedListener = new TypedListener (listener);
		addListener (SWT.Selection,typedListener);
		addListener (SWT.DefaultSelection,typedListener);
	}
	
	public void addVerifyListener (VerifyListener listener) {
//		checkWidget ();
//		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		TypedListener typedListener = new TypedListener (listener);
		addListener (SWT.Verify, typedListener);
	}
	
	public void append (String string) {
//		checkWidget ();
//		if (string == null) error (SWT.ERROR_NULL_ARGUMENT);
		textField.appendText(string);
	}
	
	public void clearSelection () {
		textField.deselect();
	}

	@Override
	public Point computeSize(int wHint, int hHint, boolean flushCache) {
		int width = (int) internal_getNode().prefWidth(javafx.scene.control.Control.USE_COMPUTED_SIZE);
		int height = (int) internal_getNode().prefHeight(javafx.scene.control.Control.USE_COMPUTED_SIZE);
		
		if (wHint != SWT.DEFAULT) width = wHint;
		if (hHint != SWT.DEFAULT) height = hHint;
				
		return new Point(width, height);
	}
	
	public String getText() {
		return textField.getText();
	}
}
