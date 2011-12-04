
package at.bestsolution.efxclipse.tooling.fxml2;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class FXMLStandaloneSetup extends FXMLStandaloneSetupGenerated{

	public static void doSetup() {
		new FXMLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

