package org.eclipse.swt.internal;

import java.util.Arrays;

import javafx.collections.ObservableList;

public class Util {
	public static final void logNotImplemented() {
		StackTraceElement e = Thread.currentThread().getStackTrace()[2];
		System.err.println(e + " not implemented yet");
	}
	
	public static final void removeListIndices(ObservableList<?> list, int[] indices) {
		int[] sorted = new int[indices.length];
		System.arraycopy(indices, 0, sorted, 0, indices.length);
		Arrays.sort(sorted);
		
		int correction = 0;
		for( int i : sorted ) {
			list.remove(i - correction);
			correction++;
		}
	}
}
