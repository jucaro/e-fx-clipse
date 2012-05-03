package org.eclipse.swt.widgets;

import org.eclipse.swt.SWT;

import javafx.scene.control.TitledPane;

public class Group extends Composite {
	private TitledPane pane;
	private FXLayoutPane layoutPane;
	
	public Group(Composite parent, int style) {
		super(parent, style);
	}
	
	@Override
	protected void createWidget() {
		pane = new TitledPane();
		pane.setCollapsible(false);
		layoutPane = new FXLayoutPane(this);
		pane.setContent(layoutPane);
	}
	
	@Override
	public TitledPane internal_getNativeObject() {
		return pane;
	}
	
	public String getText () {
		checkWidget();
		return notNullString(pane.getText());
	}
	
	@Override
	protected void internal_attachControl(Control c) {
		layoutPane.getChildren().add(c.internal_getNativeObject());
	}
	
	@Override
	protected double internal_getHeight() {
		return pane.getHeight();
	}
	
	@Override
	protected double internal_getPrefHeight() {
		return pane.prefHeight(javafx.scene.control.Control.USE_COMPUTED_SIZE);
	}
	
	@Override
	protected double internal_getPrefWidth() {
		return pane.prefWidth(javafx.scene.control.Control.USE_COMPUTED_SIZE);
	}
	
	@Override
	protected double internal_getWidth() {
		return pane.getWidth();
	}
	
	@Override
	protected void internal_setLayout(Layout layout) {
		layoutPane.setLayout(layout);
	}
	
	public void setText (String string) {
		checkWidget ();
		if (string == null) error (SWT.ERROR_NULL_ARGUMENT);
		pane.setText(string);
	}
}
