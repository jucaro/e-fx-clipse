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
import static at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Util.fromList;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Property;
import at.bestsolution.efxclipse.tooling.css.CssDialectExtension.Proposal;

public class VirtualFormattingModelDetails {
	public static List<Property> init() {
		List<Property> PROPERTIES = new ArrayList<Property>();
		PROPERTIES.addAll(createReflective(WidthHeightProperty.class, "width","height"));
		PROPERTIES.addAll(createReflective(MinWidthHeightProperty.class, "min-width","min-height"));
		PROPERTIES.addAll(createReflective(MaxWidthHeightProperty.class, "max-width","max-height"));
		PROPERTIES.addAll(createReflective(LineHeightProperty.class, "line-height"));
		PROPERTIES.addAll(createReflective(VerticalAlignProperty.class, "vertical-align"));
		return PROPERTIES;
	}
	
	
	public static class WidthHeightProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public WidthHeightProperty(String name) {
			super(name);
			proposals.addAll(WebDialectExtension.createLengthProprosals());
			proposals.add(new Proposal("1%"));
			proposals.add(new Proposal("auto"));
			proposals.add(new Proposal("inherit"));
		}

		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
		
	}
	
	public static class LineHeightProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public LineHeightProperty(String name) {
			super(name);
			proposals.add(new Proposal("normal"));
			proposals.addAll(WebDialectExtension.createLengthProprosals());
			proposals.add(new Proposal("1"));
			proposals.add(new Proposal("1%"));
			proposals.add(new Proposal("inherit"));
		}

		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
	
	public static class MaxWidthHeightProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public MaxWidthHeightProperty(String name) {
			super(name);
			proposals.addAll(WebDialectExtension.createLengthProprosals());
			proposals.add(new Proposal("1%"));
			proposals.add(new Proposal("none"));
			proposals.add(new Proposal("inherit"));
		}

		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
		
	}
	
	public static class MinWidthHeightProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public MinWidthHeightProperty(String name) {
			super(name);
			proposals.addAll(WebDialectExtension.createLengthProprosals());
			proposals.add(new Proposal("1%"));
			proposals.add(new Proposal("inherit"));
		}

		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
		
	}
	
	public static class VerticalAlignProperty extends Property {
		private List<Proposal> proposals = new ArrayList<Proposal>();

		public VerticalAlignProperty(String name) {
			super(name);
			proposals.addAll(fromList("baseline","sub","super","top","text-top","middle","bottom","text-bottom"));
			proposals.addAll(WebDialectExtension.createLengthProprosals());
			proposals.add(new Proposal("1%"));
			proposals.add(new Proposal("inherit"));
		}

		@Override
		public List<Proposal> getInitialTermProposals() {
			return proposals;
		}
	}
}
