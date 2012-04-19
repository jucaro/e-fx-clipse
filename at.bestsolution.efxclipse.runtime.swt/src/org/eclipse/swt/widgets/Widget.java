package org.eclipse.swt.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.internal.SWTEventListener;

public abstract class Widget {
	static final int DISPOSED		= 1<<0;
	static final int KEYED_DATA		= 1<<2;
	
	private EventTable eventTable;
	private Display display;
	int style;
	int state;
	Object data;

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

	public abstract Object internal_getNativeObject();

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
	public void addListener (int eventType, Listener listener) {
		if (eventTable == null) eventTable = new EventTable ();
		eventTable.hook (eventType, listener);
	}
	
	public void dispose () {
		//FIXME Implement
	}
	
	public Object getData () {
		checkWidget();
		return (state & KEYED_DATA) != 0 ? ((Object []) data) [0] : data;
	}
	
	public Object getData (String key) {
		checkWidget();
		if (key == null) error (SWT.ERROR_NULL_ARGUMENT);
		if ((state & KEYED_DATA) != 0) {
			Object [] table = (Object []) data;
			for (int i=1; i<table.length; i+=2) {
				if (key.equals (table [i])) return table [i+1];
			}
		}
		return null;
	}
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
	public void setData (Object data) {
		checkWidget();
		if ((state & KEYED_DATA) != 0) {
			((Object []) this.data) [0] = data;
		} else {
			this.data = data;
		}
	}
	
	public void setData (String key, Object value) {
		checkWidget();
		if (key == null) error (SWT.ERROR_NULL_ARGUMENT);
		int index = 1;
		Object [] table = null;
		if ((state & KEYED_DATA) != 0) {
			table = (Object []) data;
			while (index < table.length) {
				if (key.equals (table [index])) break;
				index += 2;
			}
		}
		if (value != null) {
			if ((state & KEYED_DATA) != 0) {
				if (index == table.length) {
					Object [] newTable = new Object [table.length + 2];
					System.arraycopy (table, 0, newTable, 0, table.length);
					data = table = newTable;
				}
			} else {
				table = new Object [3];
				table [0] = data;
				data = table;
				state |= KEYED_DATA;
			}
			table [index] = key;
			table [index + 1] = value;
		} else {
			if ((state & KEYED_DATA) != 0) {
				if (index != table.length) {
					int length = table.length - 2;
					if (length == 1) {
						data = table [0];
						state &= ~KEYED_DATA;
					} else {
						Object [] newTable = new Object [length];
						System.arraycopy (table, 0, newTable, 0, index);
						System.arraycopy (table, index + 2, newTable, index, length - index);
						data = newTable;
					}
				}
			}
		}
		if (key.equals(SWT.SKIN_CLASS) || key.equals(SWT.SKIN_ID)) this.reskin(SWT.ALL);
	}

	public void reskin (int flags) {
		checkWidget ();
		reskinWidget ();
		if ((flags & SWT.ALL) != 0) reskinChildren (flags);
	}
	
	void reskinChildren (int flags) {	
	}

	void reskinWidget() {
//		if ((state & SKIN_NEEDED) != SKIN_NEEDED) {
//			this.state |= SKIN_NEEDED;
//			display.addSkinnableWidget(this);
//		}
	}

	
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
