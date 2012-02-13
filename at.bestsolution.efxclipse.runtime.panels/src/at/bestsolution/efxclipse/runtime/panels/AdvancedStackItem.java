package at.bestsolution.efxclipse.runtime.panels;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AdvancedStackItem {
	private StringProperty titleProperty;
	private ObjectProperty<ImageDescriptor> iconDescriptorProperty;
	
	public AdvancedStackItem(String title, ImageDescriptor icon) {
		titleProperty = new SimpleStringProperty(this, "titleProperty", title);
		iconDescriptorProperty = new SimpleObjectProperty<ImageDescriptor>(this,"iconDescriptorProperty",icon);
	}
	
	public StringProperty titleProperty() {
		return titleProperty;
	}
	
	public void setTitle(String title) {
		titleProperty.set(title);
	}
	
	public String getTitle() {
		return titleProperty.get();
	}
	
	public ObjectProperty<ImageDescriptor> iconDescriptorProperty() {
		return iconDescriptorProperty;
	}
	
	public ImageDescriptor getIconDescriptorProperty() {
		return iconDescriptorProperty.get();
	}
	
	public void setIconDescriptor(ImageDescriptor iconDescriptor) {
		iconDescriptorProperty.set(iconDescriptor);
	}
}
