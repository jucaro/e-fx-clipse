package org.eclipse.swt.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Shell extends Decorations {
	private Stage stage;

	public Shell(Display d) {
		super(d, SWT.DIALOG_TRIM);
		stage = new Stage();
		stage.setScene(new Scene(internal_getNativeObject()));
	}

	public Shell(Display d, int style) {
		super(d, style);
		stage = new Stage();
		stage.setScene(new Scene(internal_getNativeObject()));
	}
	
	public Shell(Shell s) {
		this(s.getDisplay());
		stage.initOwner(s.stage);
	}

	public Shell(int style) {
		this(Display.getDefault(),style);
	}

	public Shell(Shell shell, int style) {
		this(shell.getDisplay(), style);
		stage.initOwner(shell.stage);
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
		setFullScreen(false);
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
	
	@Override
	public Point getSize() {
		return new Point((int)stage.getWidth(), (int)stage.getHeight());
	}
	
	@Override
	public void setSize(int width, int height) {
		stage.setWidth(width);
		stage.setHeight(height);
	}

	public void setFullScreen(boolean selection) {
		stage.setFullScreen(selection);
	}
	
	@Override
	public Composite getParent() {
		// TODO Does it need another implementation???
		return super.getParent();
	}
}
