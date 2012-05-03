package org.eclipse.swt.widgets;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.SimpleStringProperty;

import org.eclipse.swt.graphics.Image;

public class TableItem extends Item {
	private List<SimpleStringProperty> texts = new ArrayList<SimpleStringProperty>();
	
	public TableItem(Table parent, int style) {
		super(parent.getDisplay(), style);
		parent.internal_itemAdded(this);
	}

	@Override
	protected void doSetImage(Image image) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getText() {
		checkWidget();
		return notNullString(internal_getText(0).get());
	}

	@Override
	public void setText(String string) {
		checkWidget();
		((SimpleStringProperty)internal_getText(0)).set(string);
	}

	public ReadOnlyStringProperty internal_getText(int index) {
		SimpleStringProperty p = null;
		if( index < texts.size() ) {
			p = texts.get(index);
		}
		
		if( p == null ) {
			while( index >= texts.size() ) {
				texts.add(new SimpleStringProperty());
			}
			
			p = texts.get(index);
		}
		
		return p;
	}
	
	@Override
	protected void createWidget() {
		
	}

	@Override
	public Object internal_getNativeObject() {
		return this;
	}

//	public Color getBackground () {
//		
//	}
//	
//	public Color getBackground (int index) {
//		
//	}
//	
//	public Rectangle getBounds () {
//		
//	}
//	
//	public Rectangle getBounds (int index) {
//		
//	}
//	
//	public boolean getChecked () {
//		
//	}
//	
//	public Font getFont () {
//		
//	}
//	
//	public Font getFont (int index) {
//		
//	}
//	
//	public Color getForeground () {
//		
//	}
//	
//	public Color getForeground (int index) {
//		
//	}
//	
//	public boolean getGrayed () {
//		
//	}
//	
//	public Image getImage (int index) {
//		
//	}
//	
//	public Rectangle getImageBounds (int index) {
//		
//	}
//	
//	public int getImageIndent () {
//		
//	}
//	
//	public Table getParent () {
//		
//	}
//	
	public String getText (int index) {
		return notNullString(internal_getText(index).get());
	}
//	
//	public Rectangle getTextBounds (int index) {
//		
//	}
//	
//	public void setBackground (int index, Color color) {
//		
//	}
//	
//	public void setBackground (Color color) {
//		
//	}
//	
//	public void setChecked (boolean checked) {
//		
//	}
//	
//	public void setFont (int index, Font font) {
//		
//	}
//	
//	public void setFont (Font font){
//		
//	}
//	
//	public void setForeground (int index, Color color){
//		
//	}
//	
//	public void setForeground (Color color){
//		
//	}
//	
//	public void setGrayed (boolean grayed) {
//		
//	}
//	
//	public void setImage (int index, Image image) {
//		
//	}
//	
//	public void setImage (Image [] images) {
//		
//	}
//	
	public void setText (int index, String string) {
		((SimpleStringProperty)internal_getText(index)).set(string);
	}
//	
//	public void setText (String [] strings) {
//		
//	}
}
