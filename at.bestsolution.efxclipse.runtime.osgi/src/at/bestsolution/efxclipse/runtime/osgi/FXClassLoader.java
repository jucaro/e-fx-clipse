package at.bestsolution.efxclipse.runtime.osgi;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.osgi.baseadaptor.BaseData;
import org.eclipse.osgi.baseadaptor.bundlefile.BundleEntry;
import org.eclipse.osgi.baseadaptor.hooks.ClassLoadingHook;
import org.eclipse.osgi.baseadaptor.loader.BaseClassLoader;
import org.eclipse.osgi.baseadaptor.loader.ClasspathEntry;
import org.eclipse.osgi.baseadaptor.loader.ClasspathManager;
import org.eclipse.osgi.framework.adaptor.BundleProtectionDomain;
import org.eclipse.osgi.framework.adaptor.ClassLoaderDelegate;
import org.eclipse.osgi.internal.baseadaptor.DefaultClassLoader;

public class FXClassLoader implements ClassLoadingHook {

	@Override
	public byte[] processClass(String name, byte[] classbytes,
			ClasspathEntry classpathEntry, BundleEntry entry,
			ClasspathManager manager) {
		return null;
	}

	@Override
	public boolean addClassPathEntry(ArrayList<ClasspathEntry> cpEntries,
			String cp, ClasspathManager hostmanager, BaseData sourcedata,
			ProtectionDomain sourcedomain) {
		return false;
	}

	@Override
	public String findLibrary(BaseData data, String libName) {
		return null;
	}

	@Override
	public ClassLoader getBundleClassLoaderParent() {
		return null;
	}

	@Override
	public BaseClassLoader createClassLoader(ClassLoader parent,
			final ClassLoaderDelegate delegate, BundleProtectionDomain domain,
			BaseData data, String[] bundleclasspath) {
		if( data.getBundle().getSymbolicName().equals("at.bestsolution.efxclipse.runtime.javafx") ) {
			try {
				
				return new MyBundleClassLoader(parent, delegate, domain, data, bundleclasspath);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public void initializedClassLoader(BaseClassLoader baseClassLoader,
			BaseData data) {
		
	}

	static class MyBundleClassLoader extends DefaultClassLoader {
		private URLClassLoader fxClassLoader;
		
		public MyBundleClassLoader(ClassLoader parent,
				ClassLoaderDelegate delegate, ProtectionDomain domain,
				BaseData bundledata, String[] classpath) {
			super(parent, delegate, domain, bundledata, classpath);
			//FIXME We need to have locate the jar dynamically
			File f = new File("C:/Program Files (x86)/Oracle/JavaFX Runtime 2.0/lib/jfxrt.jar");
			try {
				URL url = f.getCanonicalFile().toURI().toURL();
				fxClassLoader = new URLClassLoader(new URL[] {url}, parent);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public Class<?> findLocalClass(String classname)
				throws ClassNotFoundException {
			try {
				return fxClassLoader.loadClass(classname);
			} catch (ClassNotFoundException e) {
				return super.findLoadedClass(classname);
			}
		}
		
		@Override
		public URL findLocalResource(String resource) {
			try {
				URL url = fxClassLoader.findResource(resource);
				if( url == null ) {
					url = super.findLocalResource(resource);
				}
				return url;
			} catch (Throwable e) {
				return super.findLocalResource(resource);
			}
		}
		
		@Override
		protected Enumeration<URL> findResources(String name)
				throws IOException {
			try {
				List<URL> tmp = new ArrayList<URL>();
				
				Enumeration<URL> rv = fxClassLoader.findResources(name);
				while( rv.hasMoreElements() ) {
					tmp.add(rv.nextElement());
				}
				
				rv = super.findResources(name);
				while( rv.hasMoreElements() ) {
					tmp.add(rv.nextElement());
				}
				
				return Collections.enumeration(tmp);
			} catch (Throwable e) {
				return super.findResources(name);
			}
		}
	}
}
