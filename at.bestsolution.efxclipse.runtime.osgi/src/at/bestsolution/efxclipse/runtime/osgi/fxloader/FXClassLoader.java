package at.bestsolution.efxclipse.runtime.osgi.fxloader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map.Entry;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.Properties;

import org.eclipse.osgi.baseadaptor.BaseAdaptor;
import org.eclipse.osgi.baseadaptor.BaseData;
import org.eclipse.osgi.baseadaptor.bundlefile.BundleEntry;
import org.eclipse.osgi.baseadaptor.hooks.AdaptorHook;
import org.eclipse.osgi.baseadaptor.hooks.ClassLoadingHook;
import org.eclipse.osgi.baseadaptor.loader.BaseClassLoader;
import org.eclipse.osgi.baseadaptor.loader.ClasspathEntry;
import org.eclipse.osgi.baseadaptor.loader.ClasspathManager;
import org.eclipse.osgi.framework.adaptor.BundleProtectionDomain;
import org.eclipse.osgi.framework.adaptor.ClassLoaderDelegate;
import org.eclipse.osgi.framework.log.FrameworkLog;
import org.eclipse.osgi.internal.baseadaptor.DefaultClassLoader;
import org.eclipse.osgi.service.datalocation.Location;
import org.eclipse.osgi.service.urlconversion.URLConverter;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.Filter;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.Version;
import org.osgi.framework.wiring.BundleWiring;
import org.osgi.service.packageadmin.PackageAdmin;
import org.osgi.util.tracker.ServiceTracker;

@SuppressWarnings("deprecation")
public class FXClassLoader implements ClassLoadingHook, AdaptorHook {

	private ServiceTracker<PackageAdmin, PackageAdmin> paTracker;

	private ServiceTracker instanceLocationTracker = null;

	private ServiceTracker preferenceServiceTracker = null;

	private ServiceTracker<Location, Location> installLocation = null;

	private BundleContext context = null;

	@Override
	public byte[] processClass(String name, byte[] classbytes, ClasspathEntry classpathEntry, BundleEntry entry, ClasspathManager manager) {
		return null;
	}

	@Override
	public boolean addClassPathEntry(ArrayList<ClasspathEntry> cpEntries, String cp, ClasspathManager hostmanager, BaseData sourcedata, ProtectionDomain sourcedomain) {
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
	public BaseClassLoader createClassLoader(ClassLoader parent, final ClassLoaderDelegate delegate, BundleProtectionDomain domain, BaseData data, String[] bundleclasspath) {
		if (data.getBundle().getSymbolicName().equals("at.bestsolution.efxclipse.runtime.javafx")) {
			try {
				return new MyBundleClassLoader(getPackageAdmin(), getPreferencesService(), parent, delegate, domain, data, bundleclasspath, context);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public void initializedClassLoader(BaseClassLoader baseClassLoader, BaseData data) {
	}

	static class ReflectivePreferenceService {
		private ServiceTracker<?, ?> tracker;

		private static final String SCOPE = "instance";

		public ReflectivePreferenceService(ServiceTracker<?, ?> tracker) {
			this.tracker = tracker;
		}

		public String getInstanceValue(String qualifier, String key, String defaultValue) {
			// IEclipsePreferences pref =
			// IPreferencesService.getDefault().getRootNode().node(getName()).node(qualifier)
			// pref.get(key,defaultValue)

			try {
				Object preferenceService = tracker.getService();
				if (preferenceService != null) {
					Method m = preferenceService.getClass().getMethod("getRootNode");
					Object rootNode = m.invoke(preferenceService);
					if (rootNode == null) {
						return null;
					}
					m = rootNode.getClass().getMethod("node", String.class);
					Object instanceNode = m.invoke(rootNode, SCOPE);

					if (instanceNode == null) {
						return null;
					}
					m = instanceNode.getClass().getMethod("node", String.class);
					Object pref = m.invoke(instanceNode, qualifier);

					if (pref == null) {
						return null;
					}
					m = pref.getClass().getMethod("get", String.class, String.class);
					return (String) m.invoke(pref, key, defaultValue);
				}
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Throwable e) {
				// TODO: handle exception
				e.printStackTrace();
			}

			return null;
		}
	}

	static class MyBundleClassLoader extends DefaultClassLoader {
		private URLClassLoader fxClassLoader;

		public MyBundleClassLoader(PackageAdmin admin, ReflectivePreferenceService prefService, ClassLoader parent, ClassLoaderDelegate delegate, ProtectionDomain domain, BaseData bundledata, String[] classpath, BundleContext context) throws Exception {
			super(parent, delegate, domain, bundledata, classpath);

			// Trying to locate swt bundle so that if the swt integration is
			// used
			// we can load those
			Bundle[] bundles = admin.getBundles("org.eclipse.swt", null);

			if (bundles != null) {
				for (int i = 0; i < bundles.length; i++) {
					if ((bundles[i].getState() & Bundle.INSTALLED) == 0) {
						// Ensure the bundle is started else we are unable to
						// extract the
						// classloader
						if ((bundles[i].getState() & Bundle.ACTIVE) != 0) {
							bundles[i].start();
						}
						parent = bundles[i].adapt(BundleWiring.class).getClassLoader();
						break;
					}
				}
			}

			fxClassLoader = createClassloader(parent, prefService, admin, bundledata, context);
		}

		// Taken from FileLocator / Activator
		private static URLConverter getURLConverter(BundleContext context, URL url) {
			String protocol = url.getProtocol();
			String FILTER_PREFIX = "(&(objectClass=" + URLConverter.class.getName() + ")(protocol="; //$NON-NLS-1$ //$NON-NLS-2$
			String FILTER_POSTFIX = "))"; //$NON-NLS-1$
			try {
				Collection<ServiceReference<URLConverter>> refs;
				refs = context.getServiceReferences(URLConverter.class, FILTER_PREFIX + protocol + FILTER_POSTFIX);
				if (!refs.isEmpty()) {
					return context.getService(refs.iterator().next());
				}
			} catch (InvalidSyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return null;
		}

		private static URL explodJavaFXBundle(String rootPath) throws MalformedURLException {
			if (rootPath.startsWith("file:")) {
				// strip off the file: and the !/
				rootPath = rootPath.substring(5, rootPath.length() - 2);
				File f = new File(rootPath);
				File outDir = new File(System.getProperty("java.io.tmpdir"), f.getName());
				if (outDir.exists() && outDir.isDirectory() && new File(outDir, "javafx/lib/jfxrt.jar").exists()) {
					return outDir.toURL();
				}

				if (outDir.mkdirs()) {
					try {
						JarFile jarFile = new JarFile(f);
						Enumeration<JarEntry> entries = jarFile.entries();
						while (entries.hasMoreElements()) {
							JarEntry e = entries.nextElement();
							File outEntry = new File(outDir, e.getName());
							if (e.isDirectory()) {
								outEntry.mkdir();
							} else {
								InputStream in = jarFile.getInputStream(e);
								FileOutputStream out = new FileOutputStream(outEntry);
								byte[] buf = new byte[1024];
								int l;
								while ((l = in.read(buf)) != -1) {
									out.write(buf, 0, l);
								}
								in.close();
								out.close();
							}
						}
						return outDir.toURL();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			return null;
		}

		private static URLClassLoader createClassLoaderForIDE(ClassLoader parent, ReflectivePreferenceService prefService) {
			String pluginId = "at.bestsolution.efxclipse.tooling.jdt.core";
			String key = pluginId + ".javafx.dirlocation";

			String installPath = prefService.getInstanceValue(pluginId, key, null);
			if (installPath != null) {
				File f = new File(new File(new File(installPath, "rt"), "lib"), "jfxrt.jar");
				if (f.exists()) {
					try {
						URL url = f.getCanonicalFile().toURI().toURL();
						return new URLClassLoader(new URL[] { url }, parent);
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					System.err.println("Could not locate rt/lib/jfxrt.jar in the installation path '" + installPath + "'");
				}
			}

			return null;
		}

		private static URLClassLoader createClassLoaderForSystemProperty(ClassLoader parent) {
			if (System.getProperty("javafx.home") != null) {
				String installPath = System.getProperty("javafx.home");
				File f = new File(installPath + "/lib/jfxrt.jar");
				if (f.exists()) {
					try {
						URL url = f.getCanonicalFile().toURI().toURL();
						return new URLClassLoader(new URL[] { url }, parent);
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					System.err.println("Could not locate lib/jfxrt.jar in the installation path '" + installPath + "'");
				}
			}

			return null;
		}

		private static URLClassLoader createClassLoaderForNextInstall(ClassLoader parent) {
			// TODO Should we use the same as
			// Platform.getInstall/InstanceLocation()
			File installLocation = new File(System.getProperty("osgi.install.area").substring("file:/".length()));
			
			File[] fxInstalls = {
					new File(installLocation, "javafx/"+System.getProperty("osgi.os")+"/"+System.getProperty("osgi.arch")+"/rt/lib/jfxrt.jar"),
					new File(installLocation, "javafx/lib/rt/jfxrt.jar")
			};
			
			for( File fxInstall : fxInstalls ) {
				if (fxInstall.exists()) {
					try {
						URL url = fxInstall.getCanonicalFile().toURI().toURL();
						return new URLClassLoader(new URL[] { url }, parent);
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			return null;
		}

		private static URLClassLoader createClassLoaderForDeployedPlugin(ClassLoader parent, PackageAdmin admin, BundleContext context) {
			try {
				// check if javafx is bundled inside an OSGi-Package
				Bundle[] bundles = admin.getBundles("javafx.osgi", null);
				if (bundles != null) {
					Bundle b = bundles[0];
					if ((b.getState() & Bundle.INSTALLED) == 0) {
						// Ensure the bundle is started else we are unable to
						// extract the
						// classloader
						if ((b.getState() & Bundle.ACTIVE) != 0) {
							b.start();
						}
					}
					URL rootEntry = b.getEntry("/");
					URLConverter converter = getURLConverter(context, rootEntry);
					if (converter != null) {
						rootEntry = converter.resolve(rootEntry);

						if ("jar".equals(rootEntry.getProtocol())) {
							rootEntry = explodJavaFXBundle(rootEntry.getPath());
						}

						if (rootEntry != null && "file".equals(rootEntry.getProtocol())) {
							File installLocation = new File(rootEntry.getPath());
							
							File[] fxInstalls = {
									new File(installLocation, "javafx/"+System.getProperty("osgi.os")+"/"+System.getProperty("osgi.arch")+"/rt/lib/jfxrt.jar"),
									new File(installLocation, "javafx/rt/lib/jfxrt.jar")
							};
							
							for( File fxInstall : fxInstalls ) {
								if (fxInstall.exists()) {
									try {
										URL url = fxInstall.getCanonicalFile().toURI().toURL();
										return new URLClassLoader(new URL[] { url }, parent);
									} catch (MalformedURLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
							}
						}
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return null;
		}

		private static URLClassLoader createClassloader(ClassLoader parent, ReflectivePreferenceService prefService, PackageAdmin admin, BaseData bundledata, BundleContext context) throws Exception {
			String osname = System.getProperty("os.name").toLowerCase();

			URLClassLoader loader = createClassLoaderForIDE(parent, prefService);
			if (loader != null) {
				return loader;
			}

			loader = createClassLoaderForSystemProperty(parent);
			if (loader != null) {
				return loader;
			}

			loader = createClassLoaderForNextInstall(parent);
			if (loader != null) {
				return loader;
			}
			
			loader = createClassLoaderForDeployedPlugin(parent,admin,context);
			if (loader != null) {
				return loader;
			}

			if (osname.indexOf("mac") != -1) {
				String installPath = System.getenv().get("JAVAFX_HOME");
				if (installPath != null) {
					File f = new File(installPath + "/lib/jfxrt.jar");
					if (f.exists()) {
						URL url = f.getCanonicalFile().toURI().toURL();
						return new URLClassLoader(new URL[] { url }, parent);
					} else {
						throw new IllegalStateException("Could not locate lib/jfxrt.jar in the installation path '" + installPath + "'");
					}
				} else {
					throw new IllegalStateException("Could not find a JavaFX 2.0 Installation. Environment variable JAVAFX_HOME is not set.");
				}
			} else {
				Version minVersion = bundledata.getVersion();

				List<Version> versions = new ArrayList<Version>();
				for (String v : WinRegistry.readStringSubKeys(WinRegistry.HKEY_LOCAL_MACHINE, "Software\\Oracle\\JavaFX\\")) {
					try {
						versions.add(new Version(v));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				Collections.sort(versions);
				Collections.reverse(versions);

				Version effectiveVersion = minVersion;

				for (Version v : versions) {
					// The major version must match
					if (v.getMajor() == minVersion.getMajor()) {
						if (v.getMinor() > minVersion.getMinor()) {
							effectiveVersion = v;
							break;
						} else if (v.getMinor() == minVersion.getMinor()) {
							if (v.getMicro() >= minVersion.getMicro()) {
								effectiveVersion = v;
								break;
							}
						}
					}
				}

				String versionString = effectiveVersion.getMajor() + "." + effectiveVersion.getMinor() + "." + effectiveVersion.getMicro();
				String installPath = WinRegistry.readString(WinRegistry.HKEY_LOCAL_MACHINE, "Software\\Oracle\\JavaFX\\" + versionString, "Path");
				if (installPath != null) {
					File f = new File(installPath + "/lib/jfxrt.jar");

					if (f.exists()) {
						URL url = f.getCanonicalFile().toURI().toURL();
						return new URLClassLoader(new URL[] { url }, parent);
					} else {
						throw new IllegalStateException("Could not locate lib/jfxrt.jar in the installation path '" + installPath + "'");
					}
				} else {
					throw new IllegalStateException("Could not find a JavaFX " + versionString + " Installation");
				}
			}
		}

		@Override
		public Class<?> findLocalClass(String classname) throws ClassNotFoundException {
			try {
				return fxClassLoader.loadClass(classname);
			} catch (ClassNotFoundException e) {
				return super.findLocalClass(classname);
			} catch (NoClassDefFoundError e) {
				return super.findLocalClass(classname);
			}
		}

		@Override
		public URL findLocalResource(String resource) {
			try {
				URL url = fxClassLoader.findResource(resource);
				if (url == null) {
					url = super.findLocalResource(resource);
				}
				return url;
			} catch (Throwable e) {
				return super.findLocalResource(resource);
			}
		}

		@Override
		protected Enumeration<URL> findResources(String name) throws IOException {
			try {
				List<URL> tmp = new ArrayList<URL>();

				Enumeration<URL> rv = fxClassLoader.findResources(name);
				while (rv.hasMoreElements()) {
					tmp.add(rv.nextElement());
				}

				rv = super.findResources(name);
				while (rv.hasMoreElements()) {
					tmp.add(rv.nextElement());
				}

				return Collections.enumeration(tmp);
			} catch (Throwable e) {
				return super.findResources(name);
			}
		}
	}

	@Override
	public void initialize(BaseAdaptor adaptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void frameworkStart(BundleContext context) throws BundleException {
		this.context = context;

		paTracker = new ServiceTracker<PackageAdmin, PackageAdmin>(context, PackageAdmin.class.getName(), null);
		paTracker.open();

		try {
			Filter filter = context.createFilter(Location.INSTANCE_FILTER);
			instanceLocationTracker = new ServiceTracker(context, filter, null);
			instanceLocationTracker.open();
		} catch (InvalidSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Filter filter = context.createFilter(Location.INSTALL_FILTER);
			installLocation = new ServiceTracker(context, filter, null);
			installLocation.open();
		} catch (InvalidSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		preferenceServiceTracker = new ServiceTracker(context, "org.eclipse.core.runtime.preferences.IPreferencesService", null);
		preferenceServiceTracker.open();
	}

	@Override
	public void frameworkStop(BundleContext context) throws BundleException {
		paTracker.close();
		paTracker = null;

		instanceLocationTracker.close();
		instanceLocationTracker = null;

		installLocation.close();
		installLocation = null;

		preferenceServiceTracker.close();
		preferenceServiceTracker = null;
	}

	public Bundle ensureStarted(String symbolicName) {
		Bundle[] bundles = getPackageAdmin().getBundles(symbolicName, null);

		if (bundles != null) {
			for (int i = 0; i < bundles.length; i++) {
				if ((bundles[i].getState() & Bundle.INSTALLED) == 0) {
					// Ensure the bundle is started else we are unable to
					// extract the
					// classloader
					if ((bundles[i].getState() & Bundle.ACTIVE) != 0) {
						try {
							bundles[i].start();
						} catch (BundleException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							return null;
						}
					}
					return bundles[i];
				}
			}
		}

		return null;
	}

	private PackageAdmin getPackageAdmin() {
		ServiceTracker<PackageAdmin, PackageAdmin> tracker = paTracker;
		if (tracker == null)
			return null;
		return tracker.getService();
	}

	public Location getInstanceLocation() {
		if (instanceLocationTracker != null)
			return (Location) instanceLocationTracker.getService();
		return null;
	}

	public ReflectivePreferenceService getPreferencesService() {
		if (preferenceServiceTracker != null) {
			ensureStarted("org.eclipse.equinox.preferences");
			return new ReflectivePreferenceService(preferenceServiceTracker);
		}
		return null;
	}

	@Override
	public void frameworkStopping(BundleContext context) {

	}

	@Override
	public void addProperties(Properties properties) {

	}

	@Override
	public URLConnection mapLocationToURLConnection(String location) throws IOException {
		return null;
	}

	@Override
	public void handleRuntimeError(Throwable error) {

	}

	@Override
	public FrameworkLog createFrameworkLog() {
		return null;
	}
}
