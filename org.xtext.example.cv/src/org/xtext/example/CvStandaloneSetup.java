/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class CvStandaloneSetup extends CvStandaloneSetupGenerated {

	public static void doSetup() {
		new CvStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}