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

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.FxNumberProperty;

public class BubbleChart {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(FxNumberProperty.class, "-fx-radius-scale"));
		properties.addAll(createReflective(BooleanProperty.class, "-fx-scale-bubble-radius-using-axis"));
		return properties;
	}
}
