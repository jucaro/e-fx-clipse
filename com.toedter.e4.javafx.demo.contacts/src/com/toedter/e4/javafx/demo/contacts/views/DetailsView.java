/*******************************************************************************
 * Copyright (c) 2009, 2010 Siemens AG and others.
 * 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Kai Tödter - initial implementation
 ******************************************************************************/

package com.toedter.e4.javafx.demo.contacts.views;

import com.toedter.e4.javafx.demo.contacts.databinding.AggregateNameObservableValue;
import com.toedter.e4.javafx.demo.contacts.model.Contact;

import at.bestsolution.efxclipse.runtime.databinding.IJFXBeanValueProperty;
import at.bestsolution.efxclipse.runtime.databinding.JFXBeanProperties;
import javafx.animation.FadeTransition;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.util.Duration;
import javax.inject.Inject;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;

public class DetailsView {
	private final WritableValue writableValue = new WritableValue();

	private int detailsPanelRow;
	private GridPane grid;

	private IJFXBeanValueProperty uiProp;

	private DataBindingContext ctx;

	private ImageView imageView;

	private FadeTransition fadeOutTransition;

	private FadeTransition fadeInTransition;

	@Inject
	public DetailsView(BorderPane parent, final MApplication application) {
		createDetailsPanel();

		parent.setCenter(grid);
	}

	private Node createDetailsPanel() {
		uiProp = JFXBeanProperties.value("text");
		ctx = new DataBindingContext();

		grid = new GridPane();
		grid.getStyleClass().add("my-gridpane");

		grid.setHgap(10);
		grid.setVgap(5);
		grid.setPadding(new Insets(10, 10, 10, 10));

		detailsPanelRow = 0;
		addSeparator("General");

		addProperty("Title", "title");
		addProperty("Name", "name");
		addProperty("Company", "company");
		addProperty("Job Title", "jobTitle");
		addProperty("Note", "note", 2);

		Image portrait = new Image(getClass().getResourceAsStream("dummy.png"));
		imageView = new ImageView(portrait);
		grid.add(imageView, 3, 0, 1, 5);
		GridPane.setValignment(imageView, VPos.BOTTOM);
		GridPane.setHalignment(imageView, HPos.LEFT);

		addSeparator("Business Address");
		TextField street = addProperty("Street", "street", 2);
		addProperty("City", "city", 2);
		addProperty("Zip", "zip", 2);
		addProperty("Country", "country", 2);

		addSeparator("Business Phones");
		addProperty("Phone", "phone", 2);
		addProperty("Mobile", "mobile", 2);

		addSeparator("Business Internet");
		addProperty("E-Mail", "email", 2);
		addProperty("Web Site", "webPage", 2);

		fadeOutTransition = new FadeTransition(Duration.millis(1000), street);
		fadeOutTransition.setFromValue(1.0f);
		fadeOutTransition.setToValue(0.0f);
		// fadeOutTransition.setAutoReverse(true);

		fadeInTransition = new FadeTransition(Duration.millis(1000), street);
		fadeInTransition.setFromValue(0.0f);
		fadeInTransition.setToValue(1.0f);
		// fadeInTransition.setAutoReverse(true);

		return grid;
	}

	public void addSeparator(String text) {
		Label label = new Label(text);
		label.getStyleClass().add("separator-label");
		grid.add(label, 0, detailsPanelRow++, 4, 1);
	}

	public TextField addProperty(String labelText, String property, int span) {
		Label label = new Label(labelText + ":");
		grid.add(label, 1, detailsPanelRow);

		TextField textField = new TextField();
		grid.add(textField, 2, detailsPanelRow);

		grid.setConstraints(textField, 2, detailsPanelRow, span, 1, HPos.LEFT, VPos.BASELINE, Priority.ALWAYS,
				Priority.NEVER);

		detailsPanelRow++;
		if ("Name".equals(labelText)) {
			ctx.bindValue(uiProp.observe(textField), new AggregateNameObservableValue(writableValue));
		} else {
			ctx.bindValue(uiProp.observe(textField), BeanProperties.value(property).observeDetail(writableValue));
		}

		return textField;
	}

	public TextField addProperty(String labelText, String inputText) {
		return addProperty(labelText, inputText, 1);
	}

	@Inject
	public void setSelection(@Optional final Contact contact) {
		if (contact != null) {
			// if (fadeOutTransition != null) {
			// fadeOutTransition.setOnFinished(new EventHandler<ActionEvent>() {
			// public void handle(ActionEvent arg0) {
			writableValue.setValue(contact);
			Image image = contact.getImage();
			imageView.setImage(contact.getImage());
			// imageView.setScaleX(100.0 / image.getHeight());
			// imageView.setScaleY(100.0 / image.getHeight());
			// fadeOutTransition.setOnFinished(null);
			// fadeInTransition.playFromStart();
			// }
			// });
			// fadeOutTransition.playFromStart();
			// }
		}
	}
}
