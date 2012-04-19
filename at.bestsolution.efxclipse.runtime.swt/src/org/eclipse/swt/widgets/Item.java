package org.eclipse.swt.widgets;

import org.eclipse.swt.graphics.Image;

public abstract class Item extends Widget {
	private Image image;
	
	public Item(Display display, int style) {
		super(display, style);
	}

	public Image getImage () {
		checkWidget();
		return image;
	}
	
	public void setImage (Image image) {
		checkWidget();
		this.image = image;
	}
	
	protected abstract void doSetImage(Image image);
	public abstract String getText ();
	public abstract void setText (String string);
}
