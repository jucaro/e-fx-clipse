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
package at.bestsolution.efxclipse.tooling.css.jfx.scene.chart;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createEnumProperties;
import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.FontProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.Number4TimesProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.PaintProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.SizeProperty;

public class Chart {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(PaintProperty.class, 
				"-fx-chart-background-fill","-fx-chart-background-stroke","-fx-hover-stroke","-fx-title-fill"));
		properties.addAll(createReflective(SizeProperty.class, 
				"-fx-chart-background-stroke-width","-fx-hover-stroke-width","-fx-legend-gap","-fx-title-gap"));
		properties.addAll(createReflective(Number4TimesProperty.class, "-fx-insets"));
		properties.addAll(createEnumProperties(Arrays.asList("top","bottom","left","right"), "-fx-legend-side","-fx-title-side"));
		properties.addAll(createReflective(FontProperty.class, "-fx-title-font"));
		return properties;
	}
}