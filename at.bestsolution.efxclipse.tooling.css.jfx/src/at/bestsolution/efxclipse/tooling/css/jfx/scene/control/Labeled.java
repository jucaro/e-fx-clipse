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
package at.bestsolution.efxclipse.tooling.css.jfx.scene.control;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createEnumProperties;
import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.StringProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.UrlProperty;
import at.bestsolution.efxclipse.tooling.css.jfx.JFXDialectExtension.SizeProperty;

public class Labeled {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(UrlProperty.class, "-fx-graphic"));
		properties.addAll(createEnumProperties(Arrays.asList("left","center","right","leading","trailing"), "-fx-graphic-hpos")); 
		properties.addAll(createReflective(SizeProperty.class, "-fx-graphic-text-gap"));
		properties.addAll(createEnumProperties(Arrays.asList("top","center","baseline","bottom","page-end","page-start"), "-fx-graphic-vpos")); 
		properties.addAll(createEnumProperties(Arrays.asList("left","center","right","leading","trailing"), "-fx-hpos")); 
		properties.addAll(createReflective(StringProperty.class, "-fx-text"));
		properties.addAll(createEnumProperties(Arrays.asList("left","center","right","justify"), "-fx-text-alignment")); 
		properties.addAll(createEnumProperties(Arrays.asList("center-ellipses","center-word-ellipses","clip","ellipses","leading-ellipses","leading-word-ellipses","word-ellipses"), "-fx-text-overrun")); 
		properties.addAll(createReflective(BooleanProperty.class, "-fx-text-wrap"));
		properties.addAll(createEnumProperties(Arrays.asList("top","center","baseline","bottom","page-end","page-start"), "-fx-vpos")); 
		
		return properties;
	}
}
