package at.bestsolution.efxclipse.runtime.di;

import java.util.Map;

import javafx.application.Application;
import javafx.stage.Stage;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.equinox.app.IApplicationContext;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.osgi.service.packageadmin.PackageAdmin;

import at.bestsolution.efxclipse.runtime.application.AbstractJFXApplication;

@SuppressWarnings({ "restriction", "deprecation" })
public class DIApplication extends AbstractJFXApplication implements IExecutableExtension {
	private String bundleName;
	private String applicationClass;
	
	@Override
	protected void jfxStart(IApplicationContext applicationContext,
			Application jfxApplication, Stage primaryStage) {
		BundleContext context = FrameworkUtil.getBundle(DIApplication.class).getBundleContext();
		ServiceReference<PackageAdmin> ref = context.getServiceReference(PackageAdmin.class);
		PackageAdmin packageAdmin = context.getService(ref);
		Bundle[] bundles = packageAdmin.getBundles(bundleName, null);
		if( bundles != null && bundles.length > 0 ) {
			try {
				Class<?> cl = bundles[0].loadClass(applicationClass);
				IEclipseContext eContext = EclipseContextFactory.getServiceContext(context);
				eContext.set(IApplicationContext.class, applicationContext);
				eContext.set(Application.class, jfxApplication);
				eContext.set(Stage.class, primaryStage);
				ContextInjectionFactory.make(cl, eContext);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		bundleName = config.getContributor().getName();
		applicationClass = ((Map<String,String>) data).get("mainClass");
	}

}
