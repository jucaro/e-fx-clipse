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
			assertEquals(results.get(0).object,t2);
			assertEquals(results.get(0).feature,CssDslPackage.Literals.TERM__NUMBER);
		}
	}
}
