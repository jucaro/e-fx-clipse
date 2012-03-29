package at.bestsolution.efxclipse.runtime.workbench.renderers;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.osgi.framework.Bundle;

public class Util {
	public static URL convertToOSGiURL(URI uri) {
		Bundle b = org.eclipse.core.runtime.Platform.getBundle(uri.segment(1));
		StringBuilder bundlePath = new StringBuilder();
		for( int i = 2; i < uri.segmentCount(); i++ ) {
			if( bundlePath.length() != 0 ) {
				bundlePath.append("/");
			}
			bundlePath.append(uri.segment(i));
		}
		System.err.println(uri.segment(1));
		return b.getResource(bundlePath.toString());
	}
}
