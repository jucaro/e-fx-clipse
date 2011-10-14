package at.bestsolution.efxclipse.runtime.workbench.renderers;

import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.NodeBuilder;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.FlowPane;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.IPresentationEngine;

@SuppressWarnings("restriction")
public class TrimbarRenderer extends JFXRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		ToolBar pane = new ToolBar();
		return pane;
	}

	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		IPresentationEngine renderer = (IPresentationEngine) context.get(IPresentationEngine.class.getName());
		ToolBar pane = (ToolBar) container.getWidget();
		
		for( MUIElement e : container.getChildren() ) {
			Node n = (Node) renderer.createGui(e);
			if( n != null ) {
				pane.getItems().add(n);
			}
		}
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
