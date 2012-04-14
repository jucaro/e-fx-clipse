package org.eclipse.swt.widgets;

import javafx.event.EventHandler;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.internal.TypedListener;


public class Button extends Control {
	private javafx.scene.control.Button pushButton;
	
	public Button(Composite parent, int style) {
		super(parent,style);
	}
	
	@Override
	protected void createWidget() {
		pushButton = new javafx.scene.control.Button();
	}
	
	public Point computeSize(int wHint, int hHint, boolean flushCache) {
		int width = (int) internal_getNode().prefWidth(javafx.scene.control.Control.USE_COMPUTED_SIZE);
		int height = (int) internal_getNode().prefHeight(javafx.scene.control.Control.USE_COMPUTED_SIZE);
		
		if (wHint != SWT.DEFAULT) width = wHint;
		if (hHint != SWT.DEFAULT) height = hHint;
		
		Point p = new Point(width, height);
		return p;
	}
	
	protected void initListeners() {
		pushButton.setOnMouseReleased(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				Event evt = new Event();
				evt.button = event.getButton().ordinal();
				if (event.isAltDown()) evt.stateMask |= SWT.ALT;
				if (event.isShiftDown()) evt.stateMask |= SWT.SHIFT;
				if (event.isControlDown()) evt.stateMask |= SWT.CONTROL;
				if (event.getButton() == MouseButton.PRIMARY) evt.stateMask |= SWT.BUTTON1;
				if (event.getButton() == MouseButton.MIDDLE) evt.stateMask |= SWT.BUTTON2;
				if (event.getButton() == MouseButton.SECONDARY) evt.stateMask |= SWT.BUTTON3;
				
				sendEvent(SWT.Selection, evt, true);
			}
		});
	}

	@Override
	public javafx.scene.control.Button internal_getNode() {
		return pushButton;
	}
	
	public void setText(String string) {
		pushButton.setText(string);
	}
	
	public String getText() {
		return notNullString(pushButton.getText());
	}
	
	public void addSelectionListener (SelectionListener listener) {
//		checkWidget ();
//		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		TypedListener typedListener = new TypedListener (listener);
		addListener (SWT.Selection,typedListener);
		addListener (SWT.DefaultSelection,typedListener);
	}
	
	public void removeSelectionListener(SelectionListener listener) {
//		checkWidget ();
//		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		removeListener(SWT.Selection, listener);
		removeListener(SWT.DefaultSelection,listener);	
	}
}