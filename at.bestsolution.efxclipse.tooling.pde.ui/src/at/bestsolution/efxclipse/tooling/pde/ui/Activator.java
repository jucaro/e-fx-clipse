package at.bestsolution.efxclipse.tooling.pde.ui;

import java.net.URL;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

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
}