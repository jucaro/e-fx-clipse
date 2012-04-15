package org.eclipse.swt.widgets;

import javafx.scene.control.IndexRange;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SegmentListener;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.internal.TypedListener;

public class Text extends Scrollable {
	public static final int LIMIT;
	public static final String DELIMITER;
	
	static {
		LIMIT = Integer.MAX_VALUE; //FIXME Check with JavaFX people
		DELIMITER = System.getProperty("line.separator");
	}
	
	private TextInputControl control;
	
	public Text(Composite parent, int style) {
		super(parent,style);
	}
	
	@Override
	protected void createWidget() {
		if( (getStyle() & SWT.MULTI) != 0 ) {
			control = new TextArea();
		} else if( (getStyle() & SWT.PASSWORD) != 0 ) {
			control = new PasswordField();
		} else {
			control = new TextField();	
		}
		
		if( (getStyle() & SWT.READ_ONLY) != 0 ) {
			control.setEditable(false);
		}
	}
	
	protected void initListeners() {
		
	}

	@Override
	public TextInputControl internal_getNode() {
		return control;
	}
	
	public void addModifyListener (ModifyListener listener) {
		checkWidget ();
		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		TypedListener typedListener = new TypedListener (listener);
		registerListener (SWT.Modify, typedListener);
	}
	
	public void addSegmentListener (SegmentListener listener) {
		checkWidget ();
		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		registerListener (SWT.Segments, new TypedListener (listener));
	}
	
	public void addSelectionListener (SelectionListener listener) {
		checkWidget ();
		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		TypedListener typedListener = new TypedListener (listener);
		registerListener (SWT.Selection,typedListener);
		registerListener (SWT.DefaultSelection,typedListener);
	}
	
	public void addVerifyListener (VerifyListener listener) {
		checkWidget ();
		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		TypedListener typedListener = new TypedListener (listener);
		registerListener (SWT.Verify, typedListener);
	}
	
	public void append (String string) {
		checkWidget ();
		if (string == null) error (SWT.ERROR_NULL_ARGUMENT);
		control.appendText(string);
	}
	
	public void clearSelection () {
		checkWidget ();
		control.deselect();
	}

	@Override
	public Point computeSize(int wHint, int hHint, boolean flushCache) {
		checkWidget ();
		int width = (int) internal_getNode().prefWidth(javafx.scene.control.Control.USE_COMPUTED_SIZE);
		int height = (int) internal_getNode().prefHeight(javafx.scene.control.Control.USE_COMPUTED_SIZE);
		
		if (wHint != SWT.DEFAULT) width = wHint;
		if (hHint != SWT.DEFAULT) height = hHint;
				
		return new Point(width, height);
	}
	
	public String getText() {
		checkWidget ();
		return control.getText();
	}
	
	public void copy () {
		checkWidget ();
		control.copy();
	}
	
	public void cut () {
		checkWidget ();
		if ((getStyle() & SWT.READ_ONLY) != 0) return;
		control.cut();
	}
	
	public int getCaretLineNumber () {
		checkWidget ();
		// FIXME Check if 0 or 1 based value
		if( control instanceof TextArea ) {
			return 1;
		} else {
			//TODO No JavaFX API yet
			throw new UnsupportedOperationException();
		}
	}
	
	public Point getCaretLocation () {
		checkWidget ();
		//TODO No JavaFX API yet
		throw new UnsupportedOperationException();
	}
	
	public int getCaretPosition () {
		checkWidget ();
		return control.getCaretPosition();
	}
	
	public int getCharCount () {
		checkWidget ();
		return control.getLength();
	}
	
	public boolean getDoubleClickEnabled () {
		checkWidget ();
		//TODO No JavaFX API yet
		throw new UnsupportedOperationException();
	}
	
	public char getEchoChar () {
		checkWidget ();
		//TODO No JavaFX API yet
		throw new UnsupportedOperationException();
	}
	
	public boolean getEditable () {
		checkWidget ();
		return control.isEditable();
	}
	
	public int getLineCount () {
		checkWidget ();
		if( control instanceof TextField ) {
			return 1;
		} else {
			return ((TextArea)control).getParagraphs().size();
		}
	}
	
	public String getLineDelimiter () {
		checkWidget ();
		return DELIMITER;
	}
	
	public int getLineHeight () {
		checkWidget ();
		//TODO No JavaFX API yet
		throw new UnsupportedOperationException();
	}
	
	public String getMessage () {
		checkWidget ();
		if( control instanceof TextField ) {
			return ((TextField) control).getPromptText();
		} else {
			//TODO No JavaFX API yet
			throw new UnsupportedOperationException();
		}
	}
	
	public Point getSelection () {
		checkWidget ();
		IndexRange r = control.getSelection();
		return new Point(r.getStart(),r.getEnd());
	}
	
	public int getSelectionCount () {
		checkWidget ();
		return control.getSelection().getLength();
	}
	
	public String getSelectionText () {
		checkWidget ();
		return control.getSelectedText();
	}
	
	public int getTabs () {
		//TODO No JavaFX API yet
		throw new UnsupportedOperationException();	
	}
	
	public String getText (int start, int end) {
		checkWidget();
		return control.getText(start, end);
	}
	
	public char[] getTextChars () {
		checkWidget();
		return control.getText().toCharArray();
	}
	
	public int getTextLimit () {
		checkWidget();
		// TODO No JavaFX API yet
		// see http://javafx-jira.kenai.com/browse/RT-19585
		throw new UnsupportedOperationException();
	}
	
	public int getTopIndex () {
		if( control instanceof TextField ) {
			return 0;
		} else {
			//TODO No JavaFX API yet
			throw new UnsupportedOperationException();	
		}
	}
	
	public int getTopPixel () {
		if( control instanceof TextField ) {
			return 0;
		} else {
			return (int)((TextArea) control).getScrollTop();
		}
	}
	
	public void insert (String string) {
		checkWidget();
		if (string == null) error (SWT.ERROR_NULL_ARGUMENT);
		control.insertText(control.getCaretPosition(), string);
	}

	public void paste () {
		checkWidget();
		if ((getStyle() & SWT.READ_ONLY) != 0) return;
		control.paste();
	}
	
	public void removeModifyListener (ModifyListener listener) {
		checkWidget ();
		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		unregisterListener(SWT.Modify, listener);
	}
	
	public void removeSegmentListener (SegmentListener listener) {
		checkWidget ();
		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		unregisterListener (SWT.Segments, listener);
	}
	
	public void removeSelectionListener (SelectionListener listener) {
		checkWidget ();
		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		unregisterListener (SWT.Selection, listener);
		unregisterListener (SWT.DefaultSelection,listener);	
	}
	
	public void removeVerifyListener (VerifyListener listener) {
		checkWidget ();
		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		unregisterListener (SWT.Verify, listener);	
	}
	
	public void selectAll () {
		control.selectAll();
	}
	
	public void setDoubleClickEnabled (boolean doubleClick) {
		//TODO No JavaFX API yet
		throw new UnsupportedOperationException();	
	}
	
	public void setEchoChar (char echo) {
		//TODO No JavaFX API yet
		throw new UnsupportedOperationException();
	}
	
	public void setEditable (boolean editable) {
		control.setEditable(editable);
	}
	
	public void setMessage (String message) {
		checkWidget();
		if (message == null) error (SWT.ERROR_NULL_ARGUMENT);
		if( control instanceof TextField ) {
			((TextField)control).setPromptText(message);	
		} else {
			//TODO No JavaFX API yet
			throw new UnsupportedOperationException();
		}
	}
	
	public void setSelection (int start) {
		checkWidget();
		control.selectRange(start, notNullString(control.getText()).length());
	}
	
	public void setSelection (int start, int end) {
		checkWidget();
		control.selectRange(start, end);
	}
	
	public void setSelection (Point selection) {
		checkWidget();
		if (selection == null) error (SWT.ERROR_NULL_ARGUMENT);
		setSelection(selection.x, selection.y);
	}
	
	public void setTabs (int tabs) {
		//TODO No JavaFX API yet
		throw new UnsupportedOperationException();	
	}
	
	public void setText (String string) {
		control.setText(string);
	}
	
	public void setTextChars (char[] text) {
		setText(String.valueOf(text));
	}
	
	public void setTextLimit (int limit) {
		//TODO No JavaFX API yet
		throw new UnsupportedOperationException();	
	}
	
	public void setTopIndex (int index) {
		//TODO No JavaFX API yet
		throw new UnsupportedOperationException();		
	}
	
	public void showSelection () {
		//TODO No JavaFX API yet
		throw new UnsupportedOperationException();
	}
}
