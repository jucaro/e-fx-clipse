
package at.bestsolution.efxclipse.tooling.svgpath;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SvgPathStandaloneSetup extends SvgPathStandaloneSetupGenerated{

	public static void doSetup() {
		new SvgPathStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

