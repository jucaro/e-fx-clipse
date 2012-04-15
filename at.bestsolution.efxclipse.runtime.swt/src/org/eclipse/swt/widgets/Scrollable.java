package org.eclipse.swt.widgets;

import org.eclipse.swt.graphics.Rectangle;

public abstract class Scrollable extends Control {

	public Scrollable(Composite parent, int style) {
		super(parent,style);
	}

	Scrollable(Display display, int style) {
		super(display,style);
	}

	public Rectangle computeTrim(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		return new Rectangle(0, 0, 0, 0);
	}

//	public Rectangle getClientArea () {
//		
//	}
//	
//	public ScrollBar getHorizontalBar () {
//		
//	}
//	
//	public int getScrollbarsMode () {
//		
//	}
//	
//	public ScrollBar getVerticalBar () {
//		
//	}
}
