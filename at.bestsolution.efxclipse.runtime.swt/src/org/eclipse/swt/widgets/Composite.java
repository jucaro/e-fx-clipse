package org.eclipse.swt.widgets;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.Parent;
import javafx.scene.layout.Pane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;


public class Composite extends Scrollable {
	
	private List<Control> children = new ArrayList<Control>();
	
	private FXLayoutPane pane;
	
	public Composite(Composite parent, int style) {
		super(parent,style);
	}

	
	Composite(Display display, int style) {
		super(display,style);
	}

	@Override
	protected void createWidget() {
		pane = new FXLayoutPane(this);
	}

	public void internal_controlAdded(Control c) {
		children.add(c);
		internal_attachControl(c);
	}

	public void setLayout(Layout layout) {
		internal_setLayout(layout);
	}
	
	@Override
	public Parent internal_getNativeObject() {
		return pane;
	}
	
	public Rectangle getClientArea() {
		return new Rectangle(0, 0, (int)internal_getWidth(), (int)internal_getHeight());
	}

	public Control[] getChildren() {
		return children.toArray(new Control[0]);
	}

	public Point computeSize(int wHint, int hHint, boolean flushCache) {
		int width = (int) internal_getPrefWidth();
		int height = (int) internal_getPrefHeight();
		
		if (wHint != SWT.DEFAULT) width = wHint;
		if (hHint != SWT.DEFAULT) height = hHint;
				
		return new Point(width, height);
	}
	
	protected double internal_getPrefWidth() {
		return ((Pane)internal_getNativeObject()).prefWidth(-1);
	}
	
	protected double internal_getPrefHeight() {
		return ((Pane)internal_getNativeObject()).prefHeight(-1);
	}
	
	protected double internal_getWidth() {
		return ((Pane)internal_getNativeObject()).getWidth();
	}
	
	protected double internal_getHeight() {
		return ((Pane)internal_getNativeObject()).getHeight();
	}
	
	protected void internal_setLayout(Layout layout) {
		((FXLayoutPane)internal_getNativeObject()).setLayout(layout);
	}
	
	protected void internal_attachControl(Control c) {
		((Pane)internal_getNativeObject()).getChildren().add(c.internal_getNativeObject());
	}
	
	@Override
	public Point getSize() {
		return new Point((int)internal_getWidth(), (int)internal_getHeight());
	}
	
	public void setBackgroundMode (int mode) {
//FIXME IMPLEMENT FOR FX		
	}
}
