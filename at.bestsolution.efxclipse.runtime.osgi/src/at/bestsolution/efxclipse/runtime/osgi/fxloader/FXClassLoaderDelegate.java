package at.bestsolution.efxclipse.runtime.osgi.fxloader;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Enumeration;

import org.eclipse.osgi.framework.adaptor.BundleClassLoader;
import org.eclipse.osgi.framework.adaptor.BundleData;
import org.eclipse.osgi.framework.adaptor.ClassLoaderDelegateHook;

/*
 * Remember the classloader for use in post look ups because of native classloading by javafx' native code
 * See http://javafx-jira.kenai.com/browse/RT-20883
 */
public class FXClassLoaderDelegate implements ClassLoaderDelegateHook {

	@Override
	public Class<?> preFindClass(String name, BundleClassLoader classLoader, BundleData data) throws ClassNotFoundException {
		return null;
	}

	@Override
	public Class<?> postFindClass(String name, BundleClassLoader classLoader, BundleData data) throws ClassNotFoundException {
		if ("org.eclipse.swt".equals(data.getSymbolicName())) {
			if (FXClassLoader.LOADER != null && name.startsWith("com.sun.glass")) {
				try {
					return FXClassLoader.LOADER.loadClass(name);
				} catch (Throwable t) {
				}
			}
		}
		return null;
	}

	@Override
	public URL preFindResource(String name, BundleClassLoader classLoader, BundleData data) throws FileNotFoundException {
		return null;
	}

	@Override
	public URL postFindResource(String name, BundleClassLoader classLoader, BundleData data) throws FileNotFoundException {
		return null;
	}

	@Override
	public Enumeration<URL> preFindResources(String name, BundleClassLoader classLoader, BundleData data) throws FileNotFoundException {
		return null;
	}

	@Override
	public Enumeration<URL> postFindResources(String name, BundleClassLoader classLoader, BundleData data) throws FileNotFoundException {
		return null;
	}

	@Override
	public String preFindLibrary(String name, BundleClassLoader classLoader, BundleData data) throws FileNotFoundException {
		return null;
	}

	@Override
	public String postFindLibrary(String name, BundleClassLoader classLoader, BundleData data) {
		return null;
	}

}
