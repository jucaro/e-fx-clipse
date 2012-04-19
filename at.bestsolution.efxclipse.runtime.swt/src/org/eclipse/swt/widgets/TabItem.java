package org.eclipse.swt.widgets;

import javafx.scene.control.Tab;
import javafx.scene.image.ImageView;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;

public class TabItem extends Item {
	private Tab tab;
	private Control control;
	
	public TabItem(TabFolder parent, int style) {
		super(parent.getDisplay(), style);
		parent.internal_addTabItem(this);
	}

	@Override
	protected void doSetImage(Image image) {
		if( image != null ) {
			tab.setGraphic(new ImageView(image.internal_getImage()));	
		} else {
			tab.setGraphic(null);
		}
		
	}
	
	@Override
	public String getText() {
		checkWidget();
		return notNullString(tab.getText());
	}

	@Override
	public void setText(String string) {
		checkWidget();
		if (string == null) error (SWT.ERROR_NULL_ARGUMENT);
		tab.setText(string);
	}

	@Override
	protected void createWidget() {
		this.tab = new Tab();
	}

	@Override
	public Tab internal_getNativeObject() {
		return tab;
	}
	
	public void setControl(Control control) {
		this.control = control;
		tab.setContent(control.internal_getNativeObject());
	}
	
	public Control getControl() {
		return control;
	}
}