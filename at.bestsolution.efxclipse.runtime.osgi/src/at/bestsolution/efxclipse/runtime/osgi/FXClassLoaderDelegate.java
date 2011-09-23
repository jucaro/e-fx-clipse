package at.bestsolution.efxclipse.runtime.osgi;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;

import org.eclipse.osgi.framework.adaptor.BundleClassLoader;
import org.eclipse.osgi.framework.adaptor.BundleData;
import org.eclipse.osgi.framework.adaptor.ClassLoaderDelegateHook;

public class FXClassLoaderDelegate implements ClassLoaderDelegateHook {
	private URLClassLoader fxClassLoader;
	
	public FXClassLoaderDelegate() {
		try {
			//FIXME We need to find the FX-Jar dynamically
			File f = new File("C:/Program Files (x86)/Oracle/JavaFX Runtime 2.0/lib/jfxrt.jar");
			URL url = f.getCanonicalFile().toURI().toURL();
			fxClassLoader = new URLClassLoader(new URL[] {url});
		} catch (MalformedURLException e) {
		} catch (Exception e) {
		}
		
		
	}
	
	@Override
	public Class<?> preFindClass(String name, BundleClassLoader classLoader,
			BundleData data) throws ClassNotFoundException {
		return null;
	}

	@Override
	public Class<?> postFindClass(String name, BundleClassLoader classLoader,
			BundleData data) throws ClassNotFoundException {
		try {
			if( fxClassLoader != null ) {
				return fxClassLoader.loadClass(name);	
			}
		} catch (Exception e) {
		}
		
		return null;
	}

	@Override
	public URL preFindResource(String name, BundleClassLoader classLoader,
			BundleData data) throws FileNotFoundException {
		return null;
	}

	@Override
	public URL postFindResource(String name, BundleClassLoader classLoader,
			BundleData data) throws FileNotFoundException {
		return null;
	}

	@Override
	public Enumeration<URL> preFindResources(String name,
			BundleClassLoader classLoader, BundleData data)
			throws FileNotFoundException {
		return null;
	}

	@Override
	public Enumeration<URL> postFindResources(String name,
			BundleClassLoader classLoader, BundleData data)
			throws FileNotFoundException {
		return null;
	}

	@Override
	public String preFindLibrary(String name, BundleClassLoader classLoader,
			BundleData data) throws FileNotFoundException {
		return null;
	}

	@Override
	public String postFindLibrary(String name, BundleClassLoader classLoader,
			BundleData data) {
		return null;
	}

}
