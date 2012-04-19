package org.eclipse.swt.widgets;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Separator;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;

public class Label extends Control {
	private javafx.scene.control.Label control;
	private Separator separator;
	
	public Label(Composite parent, int style) {
		super(parent,style);
	}

	@Override
	protected void createWidget() {
		if( (style & SWT.SEPARATOR) != 0 ) {
			separator = new Separator();
		} else {
			control = new javafx.scene.control.Label();	
		}
	}
	
	public Point computeSize(int wHint, int hHint, boolean flushCache) {
		checkWidget ();
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
	public Node internal_getNativeObject() {
		return control == null ? separator : control;
	}

	public int getAlignment () {
		checkWidget ();
		if ((style & SWT.SEPARATOR) != 0) return 0;
		if ((style & SWT.LEFT) != 0) return SWT.LEFT;
		if ((style & SWT.CENTER) != 0) return SWT.CENTER;
		if ((style & SWT.RIGHT) != 0) return SWT.RIGHT;
		return SWT.LEFT;
	}
	
	public String getText () {
		checkWidget ();
		if ((style & SWT.SEPARATOR) != 0) return "";
		return notNullString(control.getText());
	}
	
	public void setAlignment (int alignment) {
		checkWidget ();
		if ((style & SWT.SEPARATOR) != 0) return;
		if ((alignment & (SWT.LEFT | SWT.RIGHT | SWT.CENTER)) == 0) return;
		style &= ~(SWT.LEFT | SWT.RIGHT | SWT.CENTER);
		style |= alignment & (SWT.LEFT | SWT.RIGHT | SWT.CENTER);
		
		Pos p;
		switch (alignment) {
		case SWT.RIGHT:
			p = Pos.CENTER_RIGHT;
			break;
		case SWT.CENTER:
			p = Pos.CENTER;
			break;
		default:
			p = Pos.CENTER_LEFT;
			break;
		}
		control.setAlignment(p);
	}
	
	public void setText (String string) {
		checkWidget ();
		if (string == null) error (SWT.ERROR_NULL_ARGUMENT);
		if ((style & SWT.SEPARATOR) != 0) return;
		control.setText(string);
	}
	
//	public Image getImage () {
//		
//	}
//	
//	public void setImage (Image image) {
//		
//	}
	
	@Override
	public Point getSize() {
		return new Point((int)control.getWidth(), (int)control.getHeight());
	}
	
}
