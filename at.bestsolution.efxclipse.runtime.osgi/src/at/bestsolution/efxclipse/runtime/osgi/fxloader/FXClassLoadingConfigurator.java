package at.bestsolution.efxclipse.runtime.osgi.fxloader;

import org.eclipse.osgi.baseadaptor.HookConfigurator;
import org.eclipse.osgi.baseadaptor.HookRegistry;

public class FXClassLoadingConfigurator implements HookConfigurator {
	public static final boolean DEBUG = Boolean.getBoolean("efxclipse.osgi.hook.debug");
	
	public FXClassLoadingConfigurator() {
		if( DEBUG ) {
			System.err.println("FXClassLoadingConfigurator - This is the classloading configurator");	
		}
		
	}
	
	@Override
	public void addHooks(HookRegistry hookRegistry) {
		if( DEBUG ) {
			System.err.println("FXClassLoadingConfigurator - Adding hooks for classloading");	
		}
		FXClassLoader cl = new FXClassLoader();
		hookRegistry.addAdaptorHook(cl);
		hookRegistry.addClassLoadingHook(cl);
		hookRegistry.addClassLoaderDelegateHook(new FXClassLoaderDelegate());
	}

}
