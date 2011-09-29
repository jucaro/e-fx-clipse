package at.bestsolution.efxclipse.runtime.osgi;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.prefs.Preferences;

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
		
		private static String readKey(String key, String value) throws Exception {
			int HKEY_LOCAL_MACHINE = 0x80000002; // WindowsPreferences#HKEY_LOCAL_MACHINE
			int KEY_READ = 0x20019; // WindowsPreferences#KEY_READ
			int REG_SUCCESS = 0; // WindowsPreferences#REG_SUCCESS

			Preferences root = Preferences.systemRoot();

//			int[] handles = root.WindowsRegOpenKey(HKEY_LOCAL_MACHINE, toNullTerminatedString(key),KEY_READ);
//			byte[] byteValue = root.WindowsRegQueryValueEx(handles[0],toNullTerminatedString(value));
//			root.WindowsRegCloseKey(handles[0]);
			
			Method WindowsRegOpenKey = Preferences.systemRoot().getClass().getDeclaredMethod("WindowsRegOpenKey", int.class, byte[].class, int.class );
			WindowsRegOpenKey.setAccessible(true);
			
			Method WindowsRegQueryValueEx = Preferences.systemRoot().getClass().getDeclaredMethod("WindowsRegQueryValueEx", int.class, byte[].class );
			WindowsRegQueryValueEx.setAccessible(true);
			
			Method WindowsRegCloseKey = Preferences.systemRoot().getClass().getDeclaredMethod("WindowsRegCloseKey", int.class );
			WindowsRegCloseKey.setAccessible(true);
			
			int[] handles = (int[]) WindowsRegOpenKey.invoke(root, new Object[] { Integer.valueOf(HKEY_LOCAL_MACHINE), toNullTerminatedString(key), Integer.valueOf(KEY_READ) });
			if (handles[1] != REG_SUCCESS) {
				return null;
			}
			byte[] byteValue = (byte[]) WindowsRegQueryValueEx.invoke(root, new Object[] { Integer.valueOf(handles[0]), toNullTerminatedString(value) });
			WindowsRegCloseKey.invoke(root, new Object[] { Integer.valueOf(handles[0]) });
			return (byteValue != null ? new String(byteValue).trim() : null);
		}
		
		private static byte[] toNullTerminatedString(String str) throws IOException {
			ByteArrayOutputStream stream = new ByteArrayOutputStream(str.length()+1);
			stream.write(str.getBytes());
			stream.write(0);
			byte[] rv = stream.toByteArray();
			stream.close();
			return rv;
		}
		
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
			String installPath = readKey("Software\\Oracle\\JavaFX\\" + versionString, "Path");
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
