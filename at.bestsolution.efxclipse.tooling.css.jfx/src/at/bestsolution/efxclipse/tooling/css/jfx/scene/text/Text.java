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
package at.bestsolution.efxclipse.tooling.css.jfx.scene.text;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createEnumProperties;
import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.osgi.framework.Version;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.BooleanProperty;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;

public class Text {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		properties.addAll(createReflective(BooleanProperty.class, "-fx-strikethrough","-fx-underline"));
		properties.addAll(createEnumProperties(Arrays.asList("left","center","right","justify"), "-fx-text-alignment"));
		properties.addAll(createEnumProperties(Arrays.asList("baseline","top","bottom"), "-fx-text-alignment"));
		properties.addAll(createEnumProperties(new Version("2.1.0"), Arrays.asList("gray","lcd"), "-fx-font-smoothing-type"));
		
		return properties;
	}
}
