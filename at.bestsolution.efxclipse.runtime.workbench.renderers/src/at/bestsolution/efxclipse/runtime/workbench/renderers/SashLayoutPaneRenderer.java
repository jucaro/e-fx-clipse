package at.bestsolution.efxclipse.runtime.workbench.renderers;

import java.util.List;

import javafx.scene.Node;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.workbench.IPresentationEngine;

import at.bestsolution.efxclipse.runtime.panels.SashLayoutPane;
import at.bestsolution.efxclipse.runtime.panels.SashLayoutPane.MGenericTile;
import at.bestsolution.efxclipse.runtime.panels.SashLayoutPane.MUIControl;

@SuppressWarnings("restriction")
public class SashLayoutPaneRenderer extends JFXRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		if( (MUIElement)element.getParent() instanceof MPartSashContainer ) {
			SashLayoutPane.MGenericTile t = new SashLayoutPane.MGenericTile();
			t.setHorizontal(((MPartSashContainer)(MUIElement)element).isHorizontal());
			return t;
		} else {
			SashLayoutPane pane = new SashLayoutPane();
			pane.getRoot().setHorizontal(((MPartSashContainer)(MUIElement)element).isHorizontal());
			return pane;
		}
	}
	
	private SashLayoutPane getLayoutPane(MUIElement element) {
		while( !(element.getParent().getWidget() instanceof SashLayoutPane) ) {
			element = element.getParent();
		}
		return (SashLayoutPane) element.getParent().getWidget();
	}

	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		if ((MUIElement)container instanceof MPartSashContainer) {
			// Process any contents of the newly created ME
			List<MUIElement> parts = container.getChildren();
			if (parts != null) {
				Object parentWidget = (Object) container.getWidget();
				// loading a legacy app will add children to the window while it
				// is
				// being rendered.
				// this is *not* the correct place for this
				// hope that the ADD event will pick up the new part.
				IPresentationEngine renderer = (IPresentationEngine) context.get(IPresentationEngine.class.getName());
				MUIElement[] plist = parts.toArray(new MUIElement[parts.size()]);
				
				for (int i = 0; i < plist.length; i++) {
					MUIElement childME = plist[i];
					Object element = renderer.createGui(childME);
					String data = childME.getContainerData();
					
					
					at.bestsolution.efxclipse.runtime.panels.SashLayoutPane.MUIElement el;
					if (element instanceof Node) {
						el = new MUIControl();
						SashLayoutPane pane = getLayoutPane(childME);
						pane.getChildren().add((Node)element);
						pane.setConstraint((Node)element, (MUIControl)el);
					} else {
						el = (at.bestsolution.efxclipse.runtime.panels.SashLayoutPane.MUIElement) element;
					}
					
					if( data == null ) {
						
					} else {
						try {
							el.setWeight(Double.parseDouble(data));
						} catch (Exception e) {
						}
						
					}
					
					if( parentWidget instanceof SashLayoutPane ) {
						((SashLayoutPane) parentWidget).getRoot().add(el);
					} else if( parentWidget instanceof MGenericTile ) {
						((MGenericTile) parentWidget).add(el);
					}
				}
				
				if( parentWidget instanceof SashLayoutPane ) {
					((SashLayoutPane) parentWidget).layout();
				}
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
