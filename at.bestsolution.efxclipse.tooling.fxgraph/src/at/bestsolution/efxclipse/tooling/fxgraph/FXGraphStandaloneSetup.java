
package at.bestsolution.efxclipse.tooling.fxgraph;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FXGraphStandaloneSetup extends FXGraphStandaloneSetupGenerated{

	public static void doSetup() {
		new FXGraphStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

