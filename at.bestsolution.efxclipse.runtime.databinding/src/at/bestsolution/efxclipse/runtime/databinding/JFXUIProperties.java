package at.bestsolution.efxclipse.runtime.databinding;

public class JFXUIProperties {
	public static IJFXBeanValueProperty singleListViewSelection() {
		return JFXBeanProperties.value("selectionModel.selectedItem");
	}
}
