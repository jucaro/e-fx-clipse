package at.bestsolution.efxclipse.tooling.fxgraph.ui.preview.text;

import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationAccess;
import org.eclipse.jface.text.source.IAnnotationAccessExtension;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;

public class AnnotationAccess implements IAnnotationAccess, IAnnotationAccessExtension {

	public AnnotationAccess() {
	}

	public String getTypeLabel(Annotation annotation) {
		return annotation.getText();
	}

	public int getLayer(Annotation annotation) {
		return IAnnotationAccessExtension.DEFAULT_LAYER;
	}

	public void paint(Annotation annotation, GC gc, Canvas canvas, Rectangle bounds) {
	}

	public boolean isPaintable(Annotation annotation) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSubtype(Object annotationType, Object potentialSupertype) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object[] getSupertypes(Object annotationType) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getType(Annotation annotation) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isMultiLine(Annotation annotation) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isTemporary(Annotation annotation) {
		// TODO Auto-generated method stub
		return false;
	}

}
