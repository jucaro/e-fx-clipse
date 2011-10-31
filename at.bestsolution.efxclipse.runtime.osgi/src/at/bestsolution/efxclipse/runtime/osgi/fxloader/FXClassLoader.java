package at.bestsolution.efxclipse.runtime.osgi.fxloader;

import java.io.File;
import java.io.IOException;
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
import org.osgi.framework.Version;

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
				BaseData bundledata, String[] classpath) throws Exception {
			super(parent, delegate, domain, bundledata, classpath);
			
			Version minVersion = bundledata.getVersion(); 
			
			List<Version> versions = new ArrayList<Version>();
			for( String v : WinRegistry.readStringSubKeys(WinRegistry.HKEY_LOCAL_MACHINE, "Software\\Oracle\\JavaFX\\")) {
				try {
					versions.add(new Version(v));	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			Collections.sort(versions);
			Collections.reverse(versions);
			
			Version effectiveVersion = minVersion;
			
			for( Version v : versions ) {
				// The major version must match
				if( v.getMajor() == minVersion.getMajor() ) {
					if( v.getMinor() > minVersion.getMinor() ) {
						effectiveVersion = v;
						break;
					}  else if( v.getMinor() == minVersion.getMinor() ) {
						if( v.getMicro() >= minVersion.getMicro() ) {
							effectiveVersion = v;
							break;
						}
					}
				}
			}
			
			String versionString = effectiveVersion.getMajor() + "."+effectiveVersion.getMinor()+"." + effectiveVersion.getMicro();
			String installPath = WinRegistry.readString(WinRegistry.HKEY_LOCAL_MACHINE,"Software\\Oracle\\JavaFX\\" + versionString, "Path");
			if( installPath != null ) {
				File f = new File(installPath + "/lib/jfxrt.jar");
				
				if( f.exists() ) {
					URL url = f.getCanonicalFile().toURI().toURL();
					fxClassLoader = new URLClassLoader(new URL[] {url}, parent);
				} else {
					throw new IllegalStateException("Could not locate lib/jfxrt.jar in the installation path '"+installPath+"'");
				}
			} else {
				throw new IllegalStateException("Could not find a JavaFX "+versionString+" Installation");
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
