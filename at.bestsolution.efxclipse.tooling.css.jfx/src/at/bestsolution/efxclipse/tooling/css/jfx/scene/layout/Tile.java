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
package at.bestsolution.efxclipse.tooling.css.jfx.scene.layout;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createEnumProperties;
import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.IntegerProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.FxNumberProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.SizeProperty;

public class Tile {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(IntegerProperty.class, "-fx-columns"));
		properties.addAll(createReflective(SizeProperty.class, "-fx-hgap","-fx-vgap"));
		
		properties.addAll(createEnumProperties(Arrays.asList("left","center","right","leading","trailing"), "-fx-hpos","-fx-node-hpos"));
		properties.addAll(createEnumProperties(Arrays.asList("top","center","baseline","bottom","page-end","page-start"), "-fx-vpos","-fx-node-vpos"));
		properties.addAll(createReflective(IntegerProperty.class, "-fx-rows"));
		properties.addAll(createReflective(FxNumberProperty.class, "-fx-tile-height","-fx-tile-width"));
		properties.addAll(createReflective(BooleanProperty.class, "-fx-vertical"));
		
		return properties;
	}
}