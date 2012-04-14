package org.eclipse.swt.widgets;

import org.eclipse.swt.SWT;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Shell extends Decorations {
	private Stage stage;

	public Shell(Display d) {
		super(d, SWT.DIALOG_TRIM);
		stage = new Stage();
		stage.setScene(new Scene(internal_getNode()));
	}

	public Shell(Shell s) {
		this(s.getDisplay());
		stage.initOwner(s.stage);
	}

	@Override
	protected void createWidget() {
		super.createWidget();
	}

	public void open() {
		stage.show();
	}

	@Override
	public void setBounds(int x, int y, int width, int height) {
		stage.setX(x);
		stage.setY(y);
		stage.setWidth(width);
		stage.setHeight(height);
	}

	@Override
	public void setText(String string) {
		stage.setTitle(string);
	}

	@Override
	public String getText() {
		return stage.getTitle();
	}
}
