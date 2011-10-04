package at.bestsolution.efxclipse.runtime.workbench.renderers;

import javafx.scene.layout.Pane;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;

import at.bestsolution.efxclipse.runtime.panels.FillLayoutPane;

@SuppressWarnings("restriction")
public class PartRenderer extends JFXRenderer {
	
	@Override
	public Object createWidget(MUIElement element, Object parent) {
		FillLayoutPane pane = new FillLayoutPane();
		pane.setStyle("-fx-background-color: #fff; -fx-background-radius: 20px; -fx-effect: dropshadow(one-pass-box,rgb(0,0,0),2,0.0,1,1);");
		
		final MPart part = (MPart) element;
		
		// Create a context for this part
		IEclipseContext localContext = part.getContext();
		localContext.set(Pane.class, pane);

		IContributionFactory contributionFactory = (IContributionFactory) localContext.get(IContributionFactory.class.getName());
		Object newPart = contributionFactory.create(part.getContributionURI(),localContext);
		part.setObject(newPart);
		
		return pane;
	}

	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Object getParentWidget(MUIElement element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void disposeWidget(MUIElement part) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hookControllerLogic(MUIElement me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void childRendered(MElementContainer<MUIElement> parentElement, MUIElement element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Object getImage(MUILabel element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean requiresFocus(MPart element) {
		// TODO Auto-generated method stub
		return false;
	}

}
