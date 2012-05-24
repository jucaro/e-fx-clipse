package at.bestsolution.efxclipse.tooling.fxgraph.ui.preview.bundle;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Activator extends AbstractUIPlugin {

	private Injector injector;
	
	private static Activator plugin;
	
	public static final String PLUGIN_ID = "at.bestsolution.efxclipse.tooling.ui.preview";
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		injector = Guice.createInjector(new LivePreviewModule(), new SharedStateModule());
		super.start(bundleContext);
		plugin = this;
	}

	public static Activator getDefault() {
		return plugin;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		super.stop(bundleContext);
		plugin = null;
	}

	public Injector getInjector() {
		return injector;
	}
}
