package org.eclipse.swt.widgets;

import javafx.scene.Node;

import org.eclipse.swt.internal.SWTEventListener;

public abstract class Widget {
	static final int DISPOSED		= 1<<0;
	
	private EventTable eventTable;
	private Display display;
	int style;
	int state;

	public Widget(Display display, int style) {
		this.display = display;
		this.style = style;
		createWidget();
		initListeners();
	}
	
	protected void checkWidget () {
		//FIXME Implement
	}

	public Display getDisplay() {
		return display;
	}
	
	public int getStyle() {
		checkWidget();
		return style;
	}
	
	protected abstract void createWidget();

	public abstract Node internal_getNode();

	protected void registerListener(int eventType, Listener listener) {
		if (eventTable == null)
			eventTable = new EventTable();
		eventTable.hook(eventType, listener);
	}
	
	protected void unregisterListener(int eventType, SWTEventListener listener) {
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
	
	protected void error(int errorNullArgument) {
		// FIXME Implement
		
	}
	
//	public void addDisposeListener (DisposeListener listener) {
//		
//	}
//	
//	public void addListener (int eventType, Listener listener) {
//		
//	}
//	
//	public void dispose () {
//		
//	}
//	
//	public Object getData () {
//		
//	}
//	
//	public Object getData (String key) {
//		
//	}
//	
//	public Listener[] getListeners (int eventType) {
//		
//	}
//	
	public boolean isDisposed () {
		return (state & DISPOSED) != 0;
	}
//	
//	public boolean isListening (int eventType) {
//		
//	}
//	
//	public void notifyListeners (int eventType, Event event) {
//		
//	}
//	
//	public void removeDisposeListener (DisposeListener listener) {
//		
//	}
//	
//	public void removeListener (int eventType, Listener listener) {
//		
//	}
//	
//	public void reskin (int flags) {
//		
//	}
//	
//	public void setData (Object data) {
//		
//	}
//	
//	public void setData (String key, Object value) {
//		
//	}
	
	public String toString () {
		String string = "*Disposed*"; //$NON-NLS-1$
		if (!isDisposed ()) {
			string = "*Wrong Thread*"; //$NON-NLS-1$
			if (isValidThread ()) string = getNameText ();
		}
		return getName () + " {" + string + "}"; //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	boolean isValidThread () {
		return getDisplay ().isValidThread ();
	}
	
	protected String getNameText () {
		return "";
	}
	
	protected String getName () {
		String string = getClass ().getName ();
		int index = string.lastIndexOf ('.');
		if (index == -1) return string;
		return string.substring (index + 1, string.length ());
	}
}
