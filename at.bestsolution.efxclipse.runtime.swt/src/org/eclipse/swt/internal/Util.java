package org.eclipse.swt.internal;

public class Util {
	public static final void logNotImplemented() {
		StackTraceElement e = Thread.currentThread().getStackTrace()[2];
		System.err.println(e + " not implemented yet");
	}
}
