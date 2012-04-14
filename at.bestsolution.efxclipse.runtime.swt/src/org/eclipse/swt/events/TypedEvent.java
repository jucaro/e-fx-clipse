package org.eclipse.swt.events;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Widget;

public class TypedEvent extends SWTEventObject {
	public Display display;
		
	public Widget widget;
	
	public int time;
	
	public Object data;
	
	static final long serialVersionUID = 3257285846578377524L;
	
	public TypedEvent(Object source) {
		super(source);
	}	
}