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

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.ValidationResult;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslFactory;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.term;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension;

public class JFXDialectExtensionTestCase extends TestCase {
	
	
	public void test_validateAngle() {
		{
			for( String a : JFXDialectExtension.angles() ) {
				term t = CssDslFactory.eINSTANCE.createterm();
				t.setNumber("100" + a);
				List<ValidationResult> results = new ArrayList<ValidationResult>();
				JFXDialectExtension.validateAngle(t, results);
				assertEquals(0, results.size());	
			}
		}
		
		{
			for( String a : JFXDialectExtension.angles() ) {
				term t = CssDslFactory.eINSTANCE.createterm();
				t.setNumber("1.0" + a);
				List<ValidationResult> results = new ArrayList<ValidationResult>();
				JFXDialectExtension.validateAngle(t, results);
				assertEquals(0, results.size());	
			}
		}
		
		{
			term t = CssDslFactory.eINSTANCE.createterm();
			t.setNumber("100");
			List<ValidationResult> results = new ArrayList<ValidationResult>();
			JFXDialectExtension.validateAngle(t, results);
			assertEquals(1, results.size());
			assertEquals(t, results.get(0).object);
			assertEquals(CssDslPackage.Literals.TERM__NUMBER, results.get(0).feature);
		}
		
		{
			term t = CssDslFactory.eINSTANCE.createterm();
			t.setNumber("1arad");
			List<ValidationResult> results = new ArrayList<ValidationResult>();
			JFXDialectExtension.validateAngle(t, results);
			assertEquals(1, results.size());
			assertEquals(t, results.get(0).object);
			assertEquals(CssDslPackage.Literals.TERM__NUMBER, results.get(0).feature);
		}
		
		{
			term t = CssDslFactory.eINSTANCE.createterm();
			t.setNumber("a1rad");
			List<ValidationResult> results = new ArrayList<ValidationResult>();
			JFXDialectExtension.validateAngle(t, results);
			assertEquals(1, results.size());
			assertEquals(t, results.get(0).object);
			assertEquals(CssDslPackage.Literals.TERM__NUMBER, results.get(0).feature);
		}
	}
}
