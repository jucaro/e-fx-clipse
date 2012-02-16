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
package at.bestsolution.efxclipse.tooling.css.ui.hover;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

import at.bestsolution.efxclipse.tooling.css.cssDsl.function;
import at.bestsolution.efxclipse.tooling.css.cssDsl.term;
import at.bestsolution.efxclipse.tooling.css.cssDsl.termGroup;

public class CssHoverProvider extends DefaultEObjectHoverProvider {
	protected String getHoverInfoAsHtml(EObject o) {
		if( o instanceof function ) {
			function f = (function) o;
			if( "rgb".equals(f.getName()) ) {
				EList<termGroup> g = f.getExpression().getTermGroups();
				String red = g.get(0).getTerms().get(0).getNumber();
				String green = g.get(1).getTerms().get(0).getNumber();
				String blue = g.get(2).getTerms().get(0).getNumber();
				String style = "rgb("+red+","+green+","+blue+")";
				String hexRed = Integer.toHexString(Integer.parseInt(red));
				String hexGreen = Integer.toHexString(Integer.parseInt(green));
				String hexBlue = Integer.toHexString(Integer.parseInt(blue));
				String hexVal = "#" + (hexRed.length() == 1 ? "0" : "") + hexRed;
				hexVal += (hexGreen.length() == 1 ? "0" : "") + hexGreen;
				hexVal += (hexBlue.length() == 1 ? "0" : "") + hexBlue;
				
				String rv = "<table><tr><td><div style='height: 20px; width: 20px;border:1;border-style:solid;background-color: "+style+"'></div></td><td>"+hexVal+"</td></tr></table>";
				return rv;
			}
		} else if( o instanceof term ) {
			term t = (term) o;
			if( t.getHexColor() != null ) {
				String rv = "<table><tr><td><div style='height: 20px; width: 20px;border:1;border-style:solid;background-color: "+t.getHexColor()+"'></div></td><td>"+t.getHexColor()+"</td></tr></table>";
				return rv;
			}
		}
		return super.getHoverInfoAsHtml(o);
	}
	
	protected boolean hasHover(EObject o) {
		if( o instanceof function ) {
			function f = (function) o;
			if( "rgb".equals(f.getName()) ) {
				return true;
			}
		} else if( o instanceof term ) {
			term t = (term) o;
			if( t.getHexColor() != null ) {
				return true;
			}
		}
		return super.hasHover(o);
	}
}
