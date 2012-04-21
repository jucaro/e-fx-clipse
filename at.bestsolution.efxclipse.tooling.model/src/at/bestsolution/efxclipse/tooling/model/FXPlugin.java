package at.bestsolution.efxclipse.tooling.model;

import org.eclipse.equinox.log.ExtendedLogService;
import org.eclipse.equinox.log.Logger;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

import at.bestsolution.efxclipse.tooling.model.internal.FXClassmodel;

public class FXPlugin implements BundleActivator {

	private static BundleContext context;
	private static IFXClassmodel classmodel;
	private static ServiceTracker<ExtendedLogService, ExtendedLogService> logServiceTracker;
	private static ExtendedLogService logService;
	
	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		FXPlugin.context = bundleContext;
		
		logServiceTracker = new ServiceTracker<ExtendedLogService, ExtendedLogService>(context, ExtendedLogService.class, null);
		logServiceTracker.open();
		logService = logServiceTracker.getService();
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		FXPlugin.context = null;
		
		logServiceTracker.close();
		logServiceTracker = null;
		logService = null;
	}

	public static IFXClassmodel getClassmodel() {
		if( classmodel == null ) {
			classmodel = new FXClassmodel();
		}
		return classmodel;
	}
	
	public static Logger getLogger() {
		return logService.getLogger(null);
	}
}
