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
package at.bestsolution.efxclipse.tooling.css.jfx.test.validators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.ValidationResult;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslFactory;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.term;
import at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension;
import at.bestsolution.efxclipse.tooling.css.jfx.validators.GradientValidator;
import junit.framework.TestCase;

/**
 * @author Tom Schindl
 * 
 */
public class GradientValidatorTestCase extends TestCase {
	public void test_validateColorStop() {
		{
			termGroup group = CssDslFactory.eINSTANCE.createtermGroup();
			
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setHexColor("#000");
			
			group.getTerms().addAll(Arrays.asList(t1));
			
			List<ValidationResult> results = new ArrayList<ValidationResult>();
			GradientValidator.validateColorStop(group, results);
			assertEquals(0, results.size());
		}
		
		for( String l : JFXDialectExtension.sizeUnits() )
		{
			termGroup group = CssDslFactory.eINSTANCE.createtermGroup();
			
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setHexColor("#000");
			
			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("10"+l);
			
			group.getTerms().addAll(Arrays.asList(t1,t2));
			
			List<ValidationResult> results = new ArrayList<ValidationResult>();
			GradientValidator.validateColorStop(group, results);
			assertEquals(0, results.size());
		}
		
		{
			termGroup group = CssDslFactory.eINSTANCE.createtermGroup();
			
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setHexColor("#000");
			
			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("10%");
			
			group.getTerms().addAll(Arrays.asList(t1,t2));
			
			List<ValidationResult> results = new ArrayList<ValidationResult>();
			GradientValidator.validateColorStop(group, results);
			assertEquals(0, results.size());
		}
		
		{
			termGroup group = CssDslFactory.eINSTANCE.createtermGroup();
			
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setHexColor("#000");
			
			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("101%");
			
			group.getTerms().addAll(Arrays.asList(t1,t2));
			
			List<ValidationResult> results = new ArrayList<ValidationResult>();
			GradientValidator.validateColorStop(group, results);
			assertEquals(1, results.size());
			assertEquals(t2, results.get(0).object);
			assertEquals(CssDslPackage.Literals.TERM__NUMBER, results.get(0).feature);
		}
	}
}
