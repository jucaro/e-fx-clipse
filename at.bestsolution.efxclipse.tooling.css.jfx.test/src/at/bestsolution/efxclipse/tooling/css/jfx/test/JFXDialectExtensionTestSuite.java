/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.css.jfx.test;

import at.bestsolution.efxclipse.tooling.css.jfx.test.validators.GradientValidatorTestCase;
import at.bestsolution.efxclipse.tooling.css.jfx.test.validators.LinearGradientValidatorTestCase;
import at.bestsolution.efxclipse.tooling.css.jfx.test.validators.RadialGradientValidatorTestCase;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author Tom Schindl
 *
 */
public class JFXDialectExtensionTestSuite extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				JFXDialectExtensionTestSuite.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(GradientValidatorTestCase.class);
		suite.addTestSuite(LinearGradientValidatorTestCase.class);
		suite.addTestSuite(RadialGradientValidatorTestCase.class);
		suite.addTestSuite(JFXDialectExtensionTestCase.class);
		//$JUnit-END$
		return suite;
	}

}
