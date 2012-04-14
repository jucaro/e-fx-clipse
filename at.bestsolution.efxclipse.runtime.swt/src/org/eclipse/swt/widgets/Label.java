package org.eclipse.swt.widgets;

import javafx.geometry.Pos;
import javafx.scene.Node;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;

public class Label extends Control {
	private javafx.scene.control.Label label;

	public Label(Composite parent, int style) {
		super(parent,style);
	}

	@Override
	protected void createWidget() {
		label = new javafx.scene.control.Label();
	}
	
	public Point computeSize(int wHint, int hHint, boolean flushCache) {
		int width = (int) internal_getNode().prefWidth(javafx.scene.control.Control.USE_COMPUTED_SIZE);
		int height = (int) internal_getNode().prefHeight(javafx.scene.control.Control.USE_COMPUTED_SIZE);

		if (wHint != SWT.DEFAULT)
			width = wHint;
		if (hHint != SWT.DEFAULT)
			height = hHint;

		Point p = new Point(width, height);
		return p;
	}

	@Override
	public Node internal_getNode() {
		return label;
	}

//	public int getAlignment () {
//		//TODO Implement
//	}
	
//	public Image getImage () {
//		checkWidget ();
//		return image;
//	}
	
	public String getText () {
//		checkWidget ();
//		if ((style & SWT.SEPARATOR) != 0) return "";
		return notNullString(label.getText());
	}
	
	public void setAlignment (int alignment) {
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
		label.setAlignment(p);
	}
	
//	public void setImage (Image image) {
//		
//	}
	
	public void setText (String string) {
		label.setText(string);
	}
}
