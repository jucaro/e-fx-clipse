package org.eclipse.swt.widgets;

import javafx.scene.Node;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.internal.Util;

public class Slider extends Control {
	private javafx.scene.control.Slider slider;

	public Slider(Composite parent, int style) {
		super(parent, style);
	}

	@Override
	public Node internal_getNativeObject() {
		return slider;
	}

	@Override
	public Point computeSize(int wHint, int hHint, boolean flushCache) {
		int width = (int) internal_getNativeObject().prefWidth(javafx.scene.control.Control.USE_COMPUTED_SIZE);
		int height = (int) internal_getNativeObject().prefHeight(javafx.scene.control.Control.USE_COMPUTED_SIZE);

		if (wHint != SWT.DEFAULT)
			width = wHint;
		if (hHint != SWT.DEFAULT)
			height = hHint;

		Point p = new Point(width, height);
		return p;
	}

	@Override
	public Point getSize() {
		return new Point((int) slider.getWidth(), (int) slider.getHeight());
	}

	@Override
	protected void createWidget() {
		slider = new javafx.scene.control.Slider(0, 100, 0);
		slider.setMajorTickUnit(1);
	}

	public void addSelectionListener(SelectionListener listener) {
		// TODO Not implemented
		Util.logNotImplemented();
	}

	public int getIncrement() {
		checkWidget();
		return (int) slider.getMajorTickUnit();
	}

	public int getMaximum() {
		checkWidget();
		return (int) slider.getMax();
	}

	public int getMinimum() {
		checkWidget();
		return (int) slider.getMin();
	}

	public int getPageIncrement() {
		// TODO Not implemented
		Util.logNotImplemented();
		return 0;
	}

	public int getSelection() {
		checkWidget();
		return (int) slider.getValue();
	}

	public int getThumb() {
		checkWidget();
		return (int) slider.getBlockIncrement();
	}

	public void removeSelectionListener(SelectionListener listener) {
		// TODO Not implemented
		Util.logNotImplemented();
	}

	public void setIncrement(int value) {
		checkWidget();
		slider.setMajorTickUnit(value);
	}

	public void setMaximum(int value) {
		checkWidget();
		slider.setMax(value);
	}

	public void setMinimum(int value) {
		checkWidget();
		slider.setMin(value);
	}

	public void setPageIncrement(int value) {
		// TODO Not implemented
		Util.logNotImplemented();
	}

	public void setSelection(int value) {
		checkWidget();
		slider.setValue(value);
	}

	public void setThumb(int value) {
		checkWidget();
		slider.setBlockIncrement(value);
	}

	public void setValues(int selection, int minimum, int maximum, int thumb, int increment, int pageIncrement) {
		setMinimum(minimum);
		setMinimum(maximum);

		setSelection(selection);

		setThumb(thumb);
		setIncrement(increment);
		setPageIncrement(pageIncrement);
	}
}
