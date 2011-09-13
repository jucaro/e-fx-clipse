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

import junit.framework.TestCase;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.ValidationResult;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslFactory;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.expr;
import at.bestsolution.efxclipse.tooling.css.cssDsl.function;
import at.bestsolution.efxclipse.tooling.css.cssDsl.term;
import at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension;
import at.bestsolution.efxclipse.tooling.css.jfx.validators.RadialGradientValidator;

/**
 * @author Tom Schindl
 * 
 */
public class RadialGradientValidatorTestCase extends TestCase {
	public void test_validateRadialGradient_ColorStopOnly() {

		// red 100%
		{
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("red");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("100%");

			termGroup group = CssDslFactory.eINSTANCE.createtermGroup();
			group.getTerms().addAll(Arrays.asList(t1, t2));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().add(group);

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("radial-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			RadialGradientValidator.validateRadialGradient(function, results);
			assertEquals(0, results.size());
		}

		// red 0%, blue 50%
		{
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("red");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("0%");

			termGroup colorStop1 = CssDslFactory.eINSTANCE.createtermGroup();
			colorStop1.getTerms().addAll(Arrays.asList(t1, t2));

			term t3 = CssDslFactory.eINSTANCE.createterm();
			t3.setIdentifier("blue");

			term t4 = CssDslFactory.eINSTANCE.createterm();
			t4.setNumber("100%");

			termGroup colorStop2 = CssDslFactory.eINSTANCE.createtermGroup();
			colorStop2.getTerms().addAll(Arrays.asList(t3, t4));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().add(colorStop1);
			expr.getTermGroups().add(colorStop2);

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("radial-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			RadialGradientValidator.validateRadialGradient(function, results);
			assertEquals(0, results.size());
		}

		// black 60%, #141414 60.1%, black 100%
		{
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("black");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("60%");

			termGroup colorStop1 = CssDslFactory.eINSTANCE.createtermGroup();
			colorStop1.getTerms().addAll(Arrays.asList(t1, t2));

			term t3 = CssDslFactory.eINSTANCE.createterm();
			t3.setHexColor("#141414");

			term t4 = CssDslFactory.eINSTANCE.createterm();
			t4.setNumber("60.1%");

			termGroup colorStop2 = CssDslFactory.eINSTANCE.createtermGroup();
			colorStop2.getTerms().addAll(Arrays.asList(t3, t4));

			term t5 = CssDslFactory.eINSTANCE.createterm();
			t5.setIdentifier("black");

			term t6 = CssDslFactory.eINSTANCE.createterm();
			t6.setNumber("100%");

			termGroup colorStop3 = CssDslFactory.eINSTANCE.createtermGroup();
			colorStop3.getTerms().addAll(Arrays.asList(t5, t6));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().add(colorStop1);
			expr.getTermGroups().add(colorStop2);
			expr.getTermGroups().add(colorStop3);

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("radial-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			RadialGradientValidator.validateRadialGradient(function, results);
			assertEquals(0, results.size());
		}

		// red 10 ("px","mm","cm","in","pt","pc","em","ex")
		for (String length : JFXDialectExtension.sizeUnits()) {
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("red");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("10" + length);

			termGroup group = CssDslFactory.eINSTANCE.createtermGroup();
			group.getTerms().addAll(Arrays.asList(t1, t2));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().add(group);

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("radial-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			RadialGradientValidator.validateRadialGradient(function, results);
			assertEquals(0, results.size());
		}

		// red 101% == Invalid
		{
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("red");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("101%");

			termGroup group = CssDslFactory.eINSTANCE.createtermGroup();
			group.getTerms().addAll(Arrays.asList(t1, t2));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().add(group);

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("radial-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			RadialGradientValidator.validateRadialGradient(function, results);
			assertEquals(1, results.size());
			assertEquals(t2, results.get(0).object);
			assertEquals(CssDslPackage.Literals.TERM__NUMBER,
					results.get(0).feature);
		}

		// red 101%, red -1% == Invalid
		{
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("red");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("101%");

			termGroup group1 = CssDslFactory.eINSTANCE.createtermGroup();
			group1.getTerms().addAll(Arrays.asList(t1, t2));

			term t3 = CssDslFactory.eINSTANCE.createterm();
			t3.setIdentifier("red");

			term t4 = CssDslFactory.eINSTANCE.createterm();
			t4.setNumber("-1%");

			termGroup group2 = CssDslFactory.eINSTANCE.createtermGroup();
			group2.getTerms().addAll(Arrays.asList(t3, t4));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().addAll(Arrays.asList(group1, group2));

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("radial-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			RadialGradientValidator.validateRadialGradient(function, results);
			assertEquals(2, results.size());
			assertEquals(t2, results.get(0).object);
			assertEquals(CssDslPackage.Literals.TERM__NUMBER,
					results.get(0).feature);
			assertEquals(t4, results.get(1).object);
			assertEquals(CssDslPackage.Literals.TERM__NUMBER,
					results.get(1).feature);
		}
	}

	public void test_validateLinearGradient_focusAngle() {
		// radial-gradient(focus-angle 10grad, red 100%)
		{
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("focus-angle");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("10grad");

			termGroup focusAngleGroup = CssDslFactory.eINSTANCE
					.createtermGroup();
			focusAngleGroup.getTerms().addAll(Arrays.asList(t1, t2));

			term t3 = CssDslFactory.eINSTANCE.createterm();
			t3.setIdentifier("red");

			term t4 = CssDslFactory.eINSTANCE.createterm();
			t4.setNumber("100%");

			termGroup colorStopGroup = CssDslFactory.eINSTANCE
					.createtermGroup();
			colorStopGroup.getTerms().addAll(Arrays.asList(t3, t4));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().addAll(
					Arrays.asList(focusAngleGroup, colorStopGroup));

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("radial-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			RadialGradientValidator.validateRadialGradient(function, results);
			assertEquals(0, results.size());
		}

		// radial-gradient(focus-angle 10grad, red 100%)
		{
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("focus-angle");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("10");

			termGroup focusAngleGroup = CssDslFactory.eINSTANCE
					.createtermGroup();
			focusAngleGroup.getTerms().addAll(Arrays.asList(t1, t2));

			term t3 = CssDslFactory.eINSTANCE.createterm();
			t3.setIdentifier("red");

			term t4 = CssDslFactory.eINSTANCE.createterm();
			t4.setNumber("100%");

			termGroup colorStopGroup = CssDslFactory.eINSTANCE
					.createtermGroup();
			colorStopGroup.getTerms().addAll(Arrays.asList(t3, t4));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().addAll(
					Arrays.asList(focusAngleGroup, colorStopGroup));

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("radial-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			RadialGradientValidator.validateRadialGradient(function, results);
			assertEquals(1, results.size());
			assertEquals(t2, results.get(0).object);
			assertEquals(CssDslPackage.Literals.TERM__NUMBER,
					results.get(0).feature);
		}

		// radial-gradient(focus-angle 10grad)
		{
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("focus-angle");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("10grad");

			termGroup focusAngleGroup = CssDslFactory.eINSTANCE
					.createtermGroup();
			focusAngleGroup.getTerms().addAll(Arrays.asList(t1, t2));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().addAll(Arrays.asList(focusAngleGroup));

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("radial-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			RadialGradientValidator.validateRadialGradient(function, results);
			assertEquals(1, results.size());
			assertEquals(function, results.get(0).object);
			assertEquals(CssDslPackage.Literals.FUNCTION__EXPRESSION,
					results.get(0).feature);
		}
	}

	public void test_validateLinearGradient_focusDistance() {
		// radial-gradient(focus-distance 10%, red 100%)
		{
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("focus-distance");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("10%");

			termGroup focusDistanceGroup = CssDslFactory.eINSTANCE
					.createtermGroup();
			focusDistanceGroup.getTerms().addAll(Arrays.asList(t1, t2));

			term t3 = CssDslFactory.eINSTANCE.createterm();
			t3.setIdentifier("red");

			term t4 = CssDslFactory.eINSTANCE.createterm();
			t4.setNumber("100%");

			termGroup colorStopGroup = CssDslFactory.eINSTANCE
					.createtermGroup();
			colorStopGroup.getTerms().addAll(Arrays.asList(t3, t4));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().addAll(
					Arrays.asList(focusDistanceGroup, colorStopGroup));

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("radial-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			RadialGradientValidator.validateRadialGradient(function, results);
			assertEquals(0, results.size());
		}

		// radial-gradient(focus-angle 10grad, focus-distance 10%, red 100%)
		{
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("focus-angle");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("10grad");

			termGroup focusAngleGroup = CssDslFactory.eINSTANCE
					.createtermGroup();
			focusAngleGroup.getTerms().addAll(Arrays.asList(t1, t2));

			term t3 = CssDslFactory.eINSTANCE.createterm();
			t3.setIdentifier("focus-distance");

			term t4 = CssDslFactory.eINSTANCE.createterm();
			t4.setNumber("10%");

			termGroup focusDistanceGroup = CssDslFactory.eINSTANCE
					.createtermGroup();
			focusDistanceGroup.getTerms().addAll(Arrays.asList(t3, t4));

			term t5 = CssDslFactory.eINSTANCE.createterm();
			t5.setIdentifier("red");

			term t6 = CssDslFactory.eINSTANCE.createterm();
			t6.setNumber("100%");

			termGroup colorStopGroup = CssDslFactory.eINSTANCE
					.createtermGroup();
			colorStopGroup.getTerms().addAll(Arrays.asList(t5, t6));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().addAll(
					Arrays.asList(focusAngleGroup, focusDistanceGroup,
							colorStopGroup));

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("radial-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			RadialGradientValidator.validateRadialGradient(function, results);
			assertEquals(0, results.size());
		}

		// radial-gradient(focus-distance 10, red 100%)
		{
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("focus-distance");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("10");

			termGroup focusDistanceGroup = CssDslFactory.eINSTANCE
					.createtermGroup();
			focusDistanceGroup.getTerms().addAll(Arrays.asList(t1, t2));

			term t3 = CssDslFactory.eINSTANCE.createterm();
			t3.setIdentifier("red");

			term t4 = CssDslFactory.eINSTANCE.createterm();
			t4.setNumber("100%");

			termGroup colorStopGroup = CssDslFactory.eINSTANCE
					.createtermGroup();
			colorStopGroup.getTerms().addAll(Arrays.asList(t3, t4));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().addAll(
					Arrays.asList(focusDistanceGroup, colorStopGroup));

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("radial-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			RadialGradientValidator.validateRadialGradient(function, results);
			assertEquals(1, results.size());
			assertEquals(t2, results.get(0).object);
			assertEquals(CssDslPackage.Literals.TERM__NUMBER,
					results.get(0).feature);
		}

		// radial-gradient(focus-distance 10)
		{
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("focus-distance");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("10%");

			termGroup focusDistanceGroup = CssDslFactory.eINSTANCE
					.createtermGroup();
			focusDistanceGroup.getTerms().addAll(Arrays.asList(t1, t2));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().addAll(
					Arrays.asList(focusDistanceGroup));

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("radial-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			RadialGradientValidator.validateRadialGradient(function, results);
			assertEquals(1, results.size());
			assertEquals(function, results.get(0).object);
			assertEquals(CssDslPackage.Literals.FUNCTION__EXPRESSION,
					results.get(0).feature);
		}
	}
}
