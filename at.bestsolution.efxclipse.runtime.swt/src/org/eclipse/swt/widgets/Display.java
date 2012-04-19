package org.eclipse.swt.widgets;

import javafx.application.Platform;

import org.eclipse.swt.graphics.Device;

public class Display extends Device {
	private static Display DEFAULT;
	
	public Display() {

	}

	public boolean filters(int eventType) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getLastEventTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void postEvent(Event event) {
		// TODO Auto-generated method stub
		
	}

	public boolean filterEvent(Event event) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isValidThread() {
		return Platform.isFxApplicationThread();
	}

	public static Display getDefault() {
		if( DEFAULT == null ) {
			DEFAULT = new Display();
		}
		return DEFAULT;
	}
}
