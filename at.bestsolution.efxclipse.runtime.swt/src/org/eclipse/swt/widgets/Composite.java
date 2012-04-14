package org.eclipse.swt.widgets;

import java.util.ArrayList;
import java.util.List;

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
		internal_getNode().getChildren().add(c.internal_getNode());
	}

	public void setLayout(Layout layout) {
		internal_getNode().setLayout(layout);
	}
	
	@Override
	public FXLayoutPane internal_getNode() {
		return pane;
	}

	public Rectangle getClientArea() {
		return new Rectangle(0, 0, (int)internal_getNode().getWidth(), (int)internal_getNode().getHeight());
	}

	public Control[] getChildren() {
		return children.toArray(new Control[0]);
	}


	public Point computeSize(int wHint, int hHint, boolean flushCache) {
		int width = (int) internal_getNode().getPrefWidth();
		int height = (int) internal_getNode().getPrefHeight();
		
		if (wHint != SWT.DEFAULT) width = wHint;
		if (hHint != SWT.DEFAULT) height = hHint;
				
		return new Point(width, height);
	}
}
