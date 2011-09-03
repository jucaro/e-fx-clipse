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
package at.bestsolution.efxclipse.tooling.css.jfx.scene;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createEnumProperties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;

public class Group {
	public static List<Property> init() {
		List<Property> properties = new ArrayList<Property>();
		
		properties.addAll(
				createEnumProperties(
						Arrays.asList("add","blue","color-burn","color-dodge","darken","difference","exclusion",
								"green","hard-light","lighten","multiply","overlay","red","screen","soft-light",
								"src-atop","src-in","src-out","src-over"), 
				"-fx-blend-mode")
			);
		
		return properties;
	}
}
