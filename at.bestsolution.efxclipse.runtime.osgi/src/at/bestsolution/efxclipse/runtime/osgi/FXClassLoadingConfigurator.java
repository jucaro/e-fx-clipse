package at.bestsolution.efxclipse.runtime.osgi;

import org.eclipse.osgi.baseadaptor.HookConfigurator;
import org.eclipse.osgi.baseadaptor.HookRegistry;

public class FXClassLoadingConfigurator implements HookConfigurator {

	@Override
	public void addHooks(HookRegistry hookRegistry) {
		hookRegistry.addClassLoadingHook(new FXClassLoader());
//		hookRegistry.addClassLoaderDelegateHook(new FXClassLoaderDelegate());
	}

}
