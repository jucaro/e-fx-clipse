/*******************************************************************************
 * Copyright (c) 2010 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *     Kai Tödter - Adoption to contacts demo
 ******************************************************************************/
package com.toedter.e4.javafx.demo.contacts.handlers;

import at.bestsolution.efxclipse.runtime.services.theme.Theme;
import at.bestsolution.efxclipse.runtime.services.theme.ThemeManager;
import java.net.URL;
import java.util.List;
import javafx.scene.Scene;
import javax.inject.Named;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;

@SuppressWarnings("restriction")
public class SwitchThemeHandler {
	@Execute
	public void switchTheme(@Named("contacts.commands.switchtheme.themeid") String themeId,
			@Optional ThemeManager themeManager) {
		if (themeManager != null) {
			Scene scene = themeManager.getScene();
			List<Theme> availableThemes = themeManager.getAvailableThemes();
			for (Theme theme : availableThemes) {
				for (URL url : theme.getStylesheetURL()) {
					scene.getStylesheets().remove(url.toExternalForm());
				}
			}
			for (Theme theme : availableThemes) {
				for (URL url : theme.getStylesheetURL()) {
					if (theme.getId().equals(themeId)) {
						scene.getStylesheets().add(url.toExternalForm());
					}
				}
			}
		}
	}
}