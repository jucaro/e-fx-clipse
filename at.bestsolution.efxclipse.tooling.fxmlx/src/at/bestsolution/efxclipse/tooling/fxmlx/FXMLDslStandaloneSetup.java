
package at.bestsolution.efxclipse.tooling.fxmlx;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FXMLDslStandaloneSetup extends FXMLDslStandaloneSetupGenerated{

	public static void doSetup() {
		new FXMLDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

