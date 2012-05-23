package at.bestsolution.efxclipse.tooling.pde.ui;

import java.net.URL;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator extends AbstractUIPlugin {
	public static final String PLUGIN_ID = "at.bestsolution.efxclipse.tooling.pde.ui";

	// Shared instance
	private static Activator fInstance;

	public URL getInstallURL() {
		return getDefault().getBundle().getEntry("/"); //$NON-NLS-1$
	}

	public static Activator getDefault() {
		return fInstance;
	}

	public static String getPluginId() {
		return getDefault().getBundle().getSymbolicName();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		fInstance = this;
	}

	public void stop(BundleContext context) throws Exception {
		fInstance = null;
		super.stop(context);
	}
	
	public <S> S acquireService(Class<S> serviceClass) {
		ServiceReference<S> reference = getBundle().getBundleContext().getServiceReference(serviceClass);
		if (reference == null)
			return null;
		S service = getBundle().getBundleContext().getService(reference);
		if (service != null) {
			getBundle().getBundleContext().ungetService(reference);
		}
		return service;
	}
}