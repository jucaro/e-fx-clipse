package com.toedter.e4.javafx.control;

import javafx.scene.control.TabPane;

import com.toedter.e4.javafx.skin.CTabPaneSkin;

public class CTabPane extends TabPane {
	private boolean isMinimizeVisible;
	private boolean isMaximizeVisible;
	private boolean isMaximized;
	private boolean isMinimized;

	private final CTabPaneSkin skin;

	public CTabPane() {
		skin = new CTabPaneSkin(this);
		setSkin(skin);
	}

	public void setMinimizeVisible(boolean isMinimizeVisible) {
		this.isMinimizeVisible = isMinimizeVisible;
	}

	public void setMaximizeVisible(boolean isMaximizeVisible) {
		this.isMaximizeVisible = isMaximizeVisible;
	}

	public void setMaximized(boolean isMaximized) {
		this.isMaximized = isMaximized;
	}

	public void setMinimized(boolean isMinimized) {
		this.isMinimized = isMinimized;
	}

	public void setMaximizedHandler(Runnable handler) {
		skin.setMaximizedHandler(handler);
	}

	public void setMinimizedHandler(Runnable handler) {
		skin.setMinimizedHandler(handler);
	}
}
