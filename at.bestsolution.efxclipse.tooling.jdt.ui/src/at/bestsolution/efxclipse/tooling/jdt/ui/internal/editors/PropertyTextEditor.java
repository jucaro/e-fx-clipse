package at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors;

import org.eclipse.jdt.internal.ui.propertiesfileeditor.PropertiesFileEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

import at.bestsolution.efxclipse.tooling.jdt.ui.internal.editors.outline.PropertyContentOutlinePage;

@SuppressWarnings("restriction")
public class PropertyTextEditor extends PropertiesFileEditor {
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (adapter == IContentOutlinePage.class) {
			final PropertyContentOutlinePage contentOutline = new PropertyContentOutlinePage(this);
			return contentOutline;
		}
		//
		// TODO Auto-generated method stub
		return super.getAdapter(adapter);
	}
}