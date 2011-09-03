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
import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.fromList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;
import at.bestsolution.efxclipse.tooling.css.web.WebDialectExtension.ColorProperty;
import at.bestsolution.efxclipse.tooling.css.web.WebDialectExtension.TransparentColorProperty;

public class ColorsAndBackgrounds {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		
		PROPERTIES.addAll(createReflective(ColorProperty.class, "color"));
		PROPERTIES.addAll(createReflective(TransparentColorProperty.class, "background-color"));
		PROPERTIES.addAll(createReflective(BackgroundImageProperty.class, "background-image"));
		PROPERTIES.addAll(createEnumProperties(
			Arrays.asList("repeat","repeat-x","repeat-y","no-repeat"), "background-repeat")
		);
		PROPERTIES.addAll(createEnumProperties(
				Arrays.asList("scroll","fixed","inherit"), "background-attachment")
			);
		PROPERTIES.addAll(createReflective(BackgroundPositionProperty.class, "background-position"));
		PROPERTIES.addAll(createReflective(BackgroundProperty.class, "background"));
		
		return PROPERTIES;
	}
	
	public static class BackgroundImageProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public BackgroundImageProperty(String name) {
			super(name);
			proposals.add(new Proposal("url(\"bg.png\")"));
			proposals.addAll(fromList("none","inherit"));
		}

		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class BackgroundPositionProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public BackgroundPositionProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class BackgroundProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public BackgroundProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
}