
package at.bestsolution.efxclipse.tooling.css;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CssDslStandaloneSetup extends CssDslStandaloneSetupGenerated{

	public static void doSetup() {
		new CssDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

