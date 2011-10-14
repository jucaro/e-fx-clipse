package at.bestsolution.efxclipse.runtime.databinding;

import org.eclipse.core.databinding.property.value.IValueProperty;

public interface IJFXBeanValueProperty extends IJFXBeanProperty, IValueProperty {
	public IJFXBeanValueProperty value(String propertyName);

	public IJFXBeanValueProperty value(String propertyName, Class<?> valueType);

	public IJFXBeanValueProperty value(IJFXBeanValueProperty property);
}
