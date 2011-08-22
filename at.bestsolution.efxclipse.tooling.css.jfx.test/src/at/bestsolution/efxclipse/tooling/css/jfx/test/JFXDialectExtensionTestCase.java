package at.bestsolution.efxclipse.tooling.css.jfx.test;

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

public class JFXDialectExtensionTestCase extends TestCase {
	/*
	 * <linear-gradient> = linear-gradient( [ [from <point> to <point>] | [ to
	 * <side-or-corner> ] ] ,]? [ [ repeat | reflect ] ,]? <color-stop>[,
	 * <color-stop>]+ )
	 * 
	 * <point> = <percentage> <percentage> | <length> <length> <side-or-corner>
	 * = [left | right] || [top | bottom] <color-stop> = <color> <length>
	 */

	public void test_isGradient_ColorStopOnly() {

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
			function.setName("linear-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			assertTrue(JFXDialectExtension.isGradient(term, results));
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
			function.setName("linear-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			assertTrue(JFXDialectExtension.isGradient(term, results));
			assertEquals(0, results.size());
		}

		// red 10 ("px","mm","cm","in","pt","pc","em","ex")
		for (String length : JFXDialectExtension.sizeUnits()) {
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("red");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("10px");

			termGroup group = CssDslFactory.eINSTANCE.createtermGroup();
			group.getTerms().addAll(Arrays.asList(t1, t2));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().add(group);

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("linear-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			assertTrue(JFXDialectExtension.isGradient(term, results));
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
			function.setName("linear-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			assertTrue(JFXDialectExtension.isGradient(term, results));
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
			function.setName("linear-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			assertTrue(JFXDialectExtension.isGradient(term, results));
			assertEquals(2, results.size());
			assertEquals(t2, results.get(0).object);
			assertEquals(CssDslPackage.Literals.TERM__NUMBER,
					results.get(0).feature);
			assertEquals(t4, results.get(1).object);
			assertEquals(CssDslPackage.Literals.TERM__NUMBER,
					results.get(1).feature);
		}
	}

	public void test_isGradient_FromTo() {
		// from 100px 100px to 200px 200px, red 100%
		{
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("from");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("100px");

			term t3 = CssDslFactory.eINSTANCE.createterm();
			t3.setNumber("100px");

			term t4 = CssDslFactory.eINSTANCE.createterm();
			t4.setIdentifier("to");

			term t5 = CssDslFactory.eINSTANCE.createterm();
			t5.setNumber("100px");

			term t6 = CssDslFactory.eINSTANCE.createterm();
			t6.setNumber("100px");

			termGroup fromToGroup = CssDslFactory.eINSTANCE.createtermGroup();
			fromToGroup.getTerms()
					.addAll(Arrays.asList(t1, t2, t3, t4, t5, t6));

			term t7 = CssDslFactory.eINSTANCE.createterm();
			t7.setIdentifier("red");

			term t8 = CssDslFactory.eINSTANCE.createterm();
			t8.setNumber("100%");

			termGroup stopGroup = CssDslFactory.eINSTANCE.createtermGroup();
			stopGroup.getTerms().addAll(Arrays.asList(t7, t8));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().add(fromToGroup);
			expr.getTermGroups().add(stopGroup);

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("linear-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			assertTrue(JFXDialectExtension.isGradient(term, results));
			assertEquals(0, results.size());
		}

		// from 100px 100px to 200px 200px, red 0%, red 100%
		{
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("from");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("100px");

			term t3 = CssDslFactory.eINSTANCE.createterm();
			t3.setNumber("100px");

			term t4 = CssDslFactory.eINSTANCE.createterm();
			t4.setIdentifier("to");

			term t5 = CssDslFactory.eINSTANCE.createterm();
			t5.setNumber("100px");

			term t6 = CssDslFactory.eINSTANCE.createterm();
			t6.setNumber("100px");

			termGroup fromToGroup = CssDslFactory.eINSTANCE.createtermGroup();
			fromToGroup.getTerms()
					.addAll(Arrays.asList(t1, t2, t3, t4, t5, t6));

			term t7 = CssDslFactory.eINSTANCE.createterm();
			t7.setIdentifier("red");

			term t8 = CssDslFactory.eINSTANCE.createterm();
			t8.setNumber("0%");

			termGroup stopGroup1 = CssDslFactory.eINSTANCE.createtermGroup();
			stopGroup1.getTerms().addAll(Arrays.asList(t7, t8));

			term t9 = CssDslFactory.eINSTANCE.createterm();
			t9.setIdentifier("red");

			term t10 = CssDslFactory.eINSTANCE.createterm();
			t10.setNumber("100%");

			termGroup stopGroup2 = CssDslFactory.eINSTANCE.createtermGroup();
			stopGroup2.getTerms().addAll(Arrays.asList(t9, t10));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().add(fromToGroup);
			expr.getTermGroups().add(stopGroup1);
			expr.getTermGroups().add(stopGroup2);

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("linear-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			assertTrue(JFXDialectExtension.isGradient(term, results));
			assertEquals(0, results.size());
		}

		// from 100px 100px to 200px 200px, repeat, red 0%, red 100%
		{
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("from");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("100px");

			term t3 = CssDslFactory.eINSTANCE.createterm();
			t3.setNumber("100px");

			term t4 = CssDslFactory.eINSTANCE.createterm();
			t4.setIdentifier("to");

			term t5 = CssDslFactory.eINSTANCE.createterm();
			t5.setNumber("100px");

			term t6 = CssDslFactory.eINSTANCE.createterm();
			t6.setNumber("100px");

			termGroup fromToGroup = CssDslFactory.eINSTANCE.createtermGroup();
			fromToGroup.getTerms()
					.addAll(Arrays.asList(t1, t2, t3, t4, t5, t6));

			term repeatTerm = CssDslFactory.eINSTANCE.createterm();
			repeatTerm.setIdentifier("repeat");

			termGroup repeatGroup = CssDslFactory.eINSTANCE.createtermGroup();
			repeatGroup.getTerms().add(repeatTerm);

			term t7 = CssDslFactory.eINSTANCE.createterm();
			t7.setIdentifier("red");

			term t8 = CssDslFactory.eINSTANCE.createterm();
			t8.setNumber("0%");

			termGroup stopGroup1 = CssDslFactory.eINSTANCE.createtermGroup();
			stopGroup1.getTerms().addAll(Arrays.asList(t7, t8));

			term t9 = CssDslFactory.eINSTANCE.createterm();
			t9.setIdentifier("red");

			term t10 = CssDslFactory.eINSTANCE.createterm();
			t10.setNumber("100%");

			termGroup stopGroup2 = CssDslFactory.eINSTANCE.createtermGroup();
			stopGroup2.getTerms().addAll(Arrays.asList(t9, t10));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().add(fromToGroup);
			expr.getTermGroups().add(repeatGroup);
			expr.getTermGroups().add(stopGroup1);
			expr.getTermGroups().add(stopGroup2);

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("linear-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			assertTrue(JFXDialectExtension.isGradient(term, results));
			assertEquals(results.toString(), 0, results.size());
		}

		// from 100px 100px to 200px 200px, reflect, red 0%, red 100%
		{
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("from");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("100px");

			term t3 = CssDslFactory.eINSTANCE.createterm();
			t3.setNumber("100px");

			term t4 = CssDslFactory.eINSTANCE.createterm();
			t4.setIdentifier("to");

			term t5 = CssDslFactory.eINSTANCE.createterm();
			t5.setNumber("100px");

			term t6 = CssDslFactory.eINSTANCE.createterm();
			t6.setNumber("100px");

			termGroup fromToGroup = CssDslFactory.eINSTANCE.createtermGroup();
			fromToGroup.getTerms()
					.addAll(Arrays.asList(t1, t2, t3, t4, t5, t6));

			term repeatTerm = CssDslFactory.eINSTANCE.createterm();
			repeatTerm.setIdentifier("reflect");

			termGroup repeatGroup = CssDslFactory.eINSTANCE.createtermGroup();
			repeatGroup.getTerms().add(repeatTerm);

			term t7 = CssDslFactory.eINSTANCE.createterm();
			t7.setIdentifier("red");

			term t8 = CssDslFactory.eINSTANCE.createterm();
			t8.setNumber("0%");

			termGroup stopGroup1 = CssDslFactory.eINSTANCE.createtermGroup();
			stopGroup1.getTerms().addAll(Arrays.asList(t7, t8));

			term t9 = CssDslFactory.eINSTANCE.createterm();
			t9.setIdentifier("red");

			term t10 = CssDslFactory.eINSTANCE.createterm();
			t10.setNumber("100%");

			termGroup stopGroup2 = CssDslFactory.eINSTANCE.createtermGroup();
			stopGroup2.getTerms().addAll(Arrays.asList(t9, t10));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().add(fromToGroup);
			expr.getTermGroups().add(repeatGroup);
			expr.getTermGroups().add(stopGroup1);
			expr.getTermGroups().add(stopGroup2);

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("linear-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			assertTrue(JFXDialectExtension.isGradient(term, results));
			assertEquals(results.toString(), 0, results.size());
		}

		// from 100px 100px to 200px 200px, unknown, red 0%, red 100% == Invalid
		{
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("from");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("100px");

			term t3 = CssDslFactory.eINSTANCE.createterm();
			t3.setNumber("100px");

			term t4 = CssDslFactory.eINSTANCE.createterm();
			t4.setIdentifier("to");

			term t5 = CssDslFactory.eINSTANCE.createterm();
			t5.setNumber("100px");

			term t6 = CssDslFactory.eINSTANCE.createterm();
			t6.setNumber("100px");

			termGroup fromToGroup = CssDslFactory.eINSTANCE.createtermGroup();
			fromToGroup.getTerms()
					.addAll(Arrays.asList(t1, t2, t3, t4, t5, t6));

			term repeatTerm = CssDslFactory.eINSTANCE.createterm();
			repeatTerm.setIdentifier("unknown");

			termGroup repeatGroup = CssDslFactory.eINSTANCE.createtermGroup();
			repeatGroup.getTerms().add(repeatTerm);

			term t7 = CssDslFactory.eINSTANCE.createterm();
			t7.setIdentifier("red");

			term t8 = CssDslFactory.eINSTANCE.createterm();
			t8.setNumber("0%");

			termGroup stopGroup1 = CssDslFactory.eINSTANCE.createtermGroup();
			stopGroup1.getTerms().addAll(Arrays.asList(t7, t8));

			term t9 = CssDslFactory.eINSTANCE.createterm();
			t9.setIdentifier("red");

			term t10 = CssDslFactory.eINSTANCE.createterm();
			t10.setNumber("100%");

			termGroup stopGroup2 = CssDslFactory.eINSTANCE.createtermGroup();
			stopGroup2.getTerms().addAll(Arrays.asList(t9, t10));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().add(fromToGroup);
			expr.getTermGroups().add(repeatGroup);
			expr.getTermGroups().add(stopGroup1);
			expr.getTermGroups().add(stopGroup2);

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("linear-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			assertTrue(JFXDialectExtension.isGradient(term, results));
			assertEquals(results.toString(), 1, results.size());
			assertEquals(repeatTerm, results.get(0).object);
			assertEquals(CssDslPackage.Literals.TERM__IDENTIFIER,
					results.get(0).feature);
		}

		// from 100px 100px to 200px 200px
		{
			term t1 = CssDslFactory.eINSTANCE.createterm();
			t1.setIdentifier("from");

			term t2 = CssDslFactory.eINSTANCE.createterm();
			t2.setNumber("100px");

			term t3 = CssDslFactory.eINSTANCE.createterm();
			t3.setNumber("100px");

			term t4 = CssDslFactory.eINSTANCE.createterm();
			t4.setIdentifier("to");

			term t5 = CssDslFactory.eINSTANCE.createterm();
			t5.setNumber("100px");

			term t6 = CssDslFactory.eINSTANCE.createterm();
			t6.setNumber("100px");

			termGroup fromToGroup = CssDslFactory.eINSTANCE.createtermGroup();
			fromToGroup.getTerms()
					.addAll(Arrays.asList(t1, t2, t3, t4, t5, t6));

			expr expr = CssDslFactory.eINSTANCE.createexpr();
			expr.getTermGroups().add(fromToGroup);

			function function = CssDslFactory.eINSTANCE.createfunction();
			function.setName("linear-gradient");
			function.setExpression(expr);

			term term = CssDslFactory.eINSTANCE.createterm();
			term.setFunction(function);

			List<ValidationResult> results = new ArrayList<ValidationResult>();
			assertTrue(JFXDialectExtension.isGradient(term, results));
			assertEquals(results.toString(), 1, results.size());
			assertEquals(function, results.get(0).object);
			assertEquals(CssDslPackage.Literals.FUNCTION__EXPRESSION,
					results.get(0).feature);
		}
	}
}
