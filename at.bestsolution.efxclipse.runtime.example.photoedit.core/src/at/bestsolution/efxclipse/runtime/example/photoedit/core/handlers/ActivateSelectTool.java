package at.bestsolution.efxclipse.runtime.example.photoedit.core.handlers;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;

@SuppressWarnings("restriction")
public class ActivateSelectTool {
	
	@Execute
	public void activateArea(IEclipseContext context) {
		IEclipseContext c = context;
		if( c.getParent() != null ) {
			c = c.getParent();
		}
		c.set("activetool", "select");
	}
}
