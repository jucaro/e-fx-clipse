package org.eclipse.swt.widgets;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.internal.TypedListener;


public class Button extends Control {
	private javafx.scene.control.ButtonBase control;
	
	private Image image;
	
	public Button(Composite parent, int style) {
		super(parent,style);
	}
	
	@Override
	protected void createWidget() {
		if( (style & SWT.RADIO) != 0 ) {
			control = new RadioButton();
		} else if( (style & SWT.CHECK) != 0 ) {
			control = new CheckBox();
			((CheckBox)control).setAllowIndeterminate(true);
		} else {
			control = new javafx.scene.control.Button();	
		}
		
	}
	
	public Point computeSize(int wHint, int hHint, boolean flushCache) {
		int width = (int) internal_getNativeObject().prefWidth(javafx.scene.control.Control.USE_COMPUTED_SIZE);
		int height = (int) internal_getNativeObject().prefHeight(javafx.scene.control.Control.USE_COMPUTED_SIZE);
		
		if (wHint != SWT.DEFAULT) width = wHint;
		if (hHint != SWT.DEFAULT) height = hHint;
		
		Point p = new Point(width, height);
		return p;
	}
	
	protected void initListeners() {
		control.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Event evt = new Event();
//				evt.button = event.getButton().ordinal();
//				if (event.isAltDown()) evt.stateMask |= SWT.ALT;
//				if (event.isShiftDown()) evt.stateMask |= SWT.SHIFT;
//				if (event.isControlDown()) evt.stateMask |= SWT.CONTROL;
//				if (event.getButton() == MouseButton.PRIMARY) evt.stateMask |= SWT.BUTTON1;
//				if (event.getButton() == MouseButton.MIDDLE) evt.stateMask |= SWT.BUTTON2;
//				if (event.getButton() == MouseButton.SECONDARY) evt.stateMask |= SWT.BUTTON3;
//				
				sendEvent(SWT.Selection, evt, true);
			}
		});
	}

	@Override
	public javafx.scene.control.ButtonBase internal_getNativeObject() {
		return control;
	}
	
	public void setText(String string) {
		control.setText(string);
	}
	
	public String getText() {
		return notNullString(control.getText());
	}
	
	public void addSelectionListener (SelectionListener listener) {
		checkWidget ();
		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		TypedListener typedListener = new TypedListener (listener);
		registerListener (SWT.Selection,typedListener);
		registerListener (SWT.DefaultSelection,typedListener);
	}
	
	public int getAlignment () {
		checkWidget ();
		if ((style & SWT.ARROW) != 0) {
			if ((style & SWT.UP) != 0) return SWT.UP;
			if ((style & SWT.DOWN) != 0) return SWT.DOWN;
			if ((style & SWT.LEFT) != 0) return SWT.LEFT;
			if ((style & SWT.RIGHT) != 0) return SWT.RIGHT;
			return SWT.UP;
		}
		if ((style & SWT.LEFT) != 0) return SWT.LEFT;
		if ((style & SWT.CENTER) != 0) return SWT.CENTER;
		if ((style & SWT.RIGHT) != 0) return SWT.RIGHT;
		return SWT.LEFT;
	}
	
	public boolean getGrayed () {
		if( control instanceof CheckBox ) {
			return ((CheckBox) control).isIndeterminate();
		}
		return false;
	}
	
	public Image getImage () {
		return image;
	}
	
	public boolean getSelection () {
		checkWidget ();
		if( control instanceof RadioButton ) {
			return ((RadioButton) control).isSelected();
		} else if( control instanceof CheckBox ) {
			return ((CheckBox) control).isSelected();
		}
		return false;
	}
	
	public void removeSelectionListener(SelectionListener listener) {
		checkWidget ();
		if (listener == null) error (SWT.ERROR_NULL_ARGUMENT);
		unregisterListener(SWT.Selection, listener);
		unregisterListener(SWT.DefaultSelection,listener);	
	}
	
	public void setAlignment (int alignment) {
		checkWidget ();
		if ((style & SWT.ARROW) != 0) {
			if ((style & (SWT.UP | SWT.DOWN | SWT.LEFT | SWT.RIGHT)) == 0) return; 
			style &= ~(SWT.UP | SWT.DOWN | SWT.LEFT | SWT.RIGHT);
			style |= alignment & (SWT.UP | SWT.DOWN | SWT.LEFT | SWT.RIGHT);
			return;
		}
		
		if ((alignment & (SWT.LEFT | SWT.RIGHT | SWT.CENTER)) == 0) return;
		
		Pos jAlignment;
		
		switch (alignment) {
		case SWT.RIGHT:
			jAlignment = Pos.CENTER_RIGHT;
			break;
		case SWT.CENTER:
			jAlignment = Pos.CENTER;
			break;
		default:
			jAlignment = Pos.CENTER_LEFT;
			break;
		}
		
		control.setAlignment(jAlignment);
	}
	
	public void setGrayed (boolean grayed) {
		if( control instanceof CheckBox ) {
			((CheckBox)control).setIndeterminate(grayed);
		}
	}
	
	public void setImage (Image image) {
		this.image = image;
		
		if( image != null ) {
			control.setGraphic(new ImageView(image.internal_getImage()));
		} else {
			control.setGraphic(null);
		}
	}
	
	public void setSelection (boolean selected) {
		checkWidget ();
		if( control instanceof RadioButton ) {
			((RadioButton) control).setSelected(selected);
		} else if( control instanceof CheckBox ) {
			((CheckBox) control).setSelected(selected);
		}
	}
	
	@Override
	public Point getSize() {
		return new Point((int)control.getWidth(), (int)control.getHeight());
	}
}