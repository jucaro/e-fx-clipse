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

import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.createReflective;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;

public class UserInterface {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(createReflective(OutlineProperty.class, "outline"));
		PROPERTIES.addAll(createReflective(OutlineWidthProperty.class, "outline-width"));
		PROPERTIES.addAll(createReflective(OutlineStyleProperty.class, "outline-style"));
		PROPERTIES.addAll(createReflective(OutlineColorProperty.class, "outline-color"));
		return PROPERTIES;
	}
	
	public static class OutlineProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public OutlineProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class OutlineWidthProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public OutlineWidthProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class OutlineStyleProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public OutlineStyleProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class OutlineColorProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();
		
		public OutlineColorProperty(String name) {
			super(name);
		}
		
		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
}
