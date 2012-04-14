package org.eclipse.swt.widgets;

import org.eclipse.swt.internal.SWTEventListener;

import javafx.scene.Node;

public abstract class Widget {
	private EventTable eventTable;
	private Display display;
	private int style;

	public Widget(Display display, int style) {
		this.display = display;
		this.style = style;
		createWidget();
		initListeners();
	}

	public Display getDisplay() {
		return display;
	}
	
	public int getStyle() {
		return style;
	}
	
	protected abstract void createWidget();

	public abstract Node internal_getNode();

	public void addListener(int eventType, Listener listener) {
		if (eventTable == null)
			eventTable = new EventTable();
		eventTable.hook(eventType, listener);
	}
	
	protected void removeListener(int eventType, SWTEventListener listener) {
		if (eventTable == null) return;
		eventTable.unhook (eventType, listener);
	}
	
	protected void initListeners() {
		
	}
	
	void sendEvent (int eventType, Event event, boolean send) {
		if (eventTable == null && !display.filters (eventType)) {
			return;
		}
		if (event == null) event = new Event ();
		event.type = eventType;
		event.display = display;
		event.widget = this;
		if (event.time == 0) {
			event.time = display.getLastEventTime ();
		}
		if (send) {
			sendEvent (event);
		} else {
			display.postEvent (event);
		}
	}
	
	void sendEvent (Event event) {
		Display display = event.display;
		if (!display.filterEvent (event)) {
			if (eventTable != null) eventTable.sendEvent (event);
		}
	}
	
	protected static String notNullString(String s) {
		return s == null ? "" : s;
	}
}
