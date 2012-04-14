package org.eclipse.swt.widgets;

import org.eclipse.swt.graphics.Point;


public abstract class Control extends Widget {
	
	private Object layoutData;
	
	public Control(Composite parent, int style) {
		super(parent.getDisplay(),style);
		parent.internal_controlAdded(this);
	}
	
	public Control(Display display, int style) {
		super(display,style);
	}

	public void setBounds(int x, int y, int width, int height) {
		internal_getNode().relocate(x, y);
		internal_getNode().resize(width, height);
		
//		System.err.println("Bounds: " + x + "/" +y + " " + width + "/" + height);
	}
	
	public abstract Point computeSize(int wHint, int hHint, boolean flushCache);
	
	public void setLayoutData(Object layoutData) {
		this.layoutData = layoutData;
	}

	public Object getLayoutData() {
		return layoutData;
	}

	public int getBorderWidth() {
		// TODO Auto-generated method stub
		return 0;
	}
}
