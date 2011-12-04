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
package at.bestsolution.efxclipse.tooling.fxml2.ui.highlighting;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class FXMLDslHighlightingConfiguration extends DefaultHighlightingConfiguration {
	public final static String ELEMENT = "Element";
	public final static String ATTRIBUTENAME = "AttributeName"; 
	public final static String ATTRIBUTEVALUE = "AttributeValue";
	public final static String PROCESSINGINSTR = "ProcessingInstr";
	

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(ELEMENT, "Element", elementTextStyle());
		acceptor.acceptDefaultHighlighting(ATTRIBUTENAME, "Attribute name", elementTextStyle());
		acceptor.acceptDefaultHighlighting(ATTRIBUTEVALUE, "Attribute value", attributeValueTextStyle());
		acceptor.acceptDefaultHighlighting(PROCESSINGINSTR, "Processing instruction", processingInstructionTextStyle());
	}

	public TextStyle stringTextStyle() {
		return attributeValueTextStyle();
	}
	
	@Override
	public TextStyle defaultTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(0, 0, 0));
		return textStyle;
	}
	
	public TextStyle elementTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 0, 128));
		return textStyle;
	}

	public TextStyle attributeValueTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(0, 128, 0));
		return textStyle;
	}
	
	public TextStyle processingInstructionTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(128, 128, 128));
		return textStyle;
	}
}