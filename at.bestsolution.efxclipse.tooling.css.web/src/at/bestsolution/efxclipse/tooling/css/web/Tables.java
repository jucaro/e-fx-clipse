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
package at.bestsolution.efxclipse.tooling.css.web;

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createEnumProperties;
import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;

public class Tables {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(
				createEnumProperties(
					Arrays.asList("top","bottom","inherit"), 
					"caption-side")
			);
		PROPERTIES.addAll(
				createEnumProperties(
					Arrays.asList("auto","fixed","inherit"), 
					"table-layout")
			);
		PROPERTIES.addAll(
				createEnumProperties(
					Arrays.asList("collapse","separate","inherit"), 
					"border-collapse")
			);
		
		PROPERTIES.addAll(
				createEnumProperties(
					Arrays.asList("show","hide","inherit"), 
					"empty-cells")
			);
		PROPERTIES.addAll(createReflective(BorderSpacing.class, "border-spacing"));
		return PROPERTIES;
	}
	
	public static class BorderSpacing extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public BorderSpacing(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
}
