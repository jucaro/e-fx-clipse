package at.bestsolution.efxclipse.runtime.workbench.renderers;

import java.util.List;

import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.SplitPane;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.workbench.IPresentationEngine;

@SuppressWarnings("restriction")
public class SashRenderer extends JFXRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		SplitPane pane = new SplitPane();
		MPartSashContainer msash = (MPartSashContainer) element;
		pane.setOrientation(msash.isHorizontal()?Orientation.HORIZONTAL:Orientation.VERTICAL);

		return pane;
	}

	@Override
	public void processContents(MElementContainer<MUIElement> container) {	
		if ((MUIElement)container instanceof MPartSashContainer) {
			// Process any contents of the newly created ME
			List<MUIElement> parts = container.getChildren();
			if (parts != null) {
				SplitPane parentWidget = (SplitPane) container.getWidget();
				// loading a legacy app will add children to the window while it
				// is
				// being rendered.
				// this is *not* the correct place for this
				// hope that the ADD event will pick up the new part.
				IPresentationEngine renderer = (IPresentationEngine) context.get(IPresentationEngine.class.getName());
				MUIElement[] plist = parts.toArray(new MUIElement[parts.size()]);
				double[] ratios = new double[plist.length];
				
				for (int i = 0; i < plist.length; i++) {
					MUIElement childME = plist[i];
					Object element = renderer.createGui(childME);
					String data = childME.getContainerData();
					if( data == null ) {
						ratios[i] = 0;
					} else {
						try {
							ratios[i] = Double.parseDouble(data);
						} catch (Exception e) {
							ratios[i] = 0;
						}
						
					}
					if (element instanceof Node) {
						parentWidget.getItems().add((Node) element);
					}
				}
				if( ratios.length > 0 ) {
					double total = 0;
					for( double r : ratios ) {
						total += r;
					}
					
					double[] positions = new double[ratios.length-1];
					double current = 0;
					for( int i = 0; i < positions.length; i++ ) {
						positions[i] = current + ratios[i] / total;
						current = positions[i];
					}
					
					parentWidget.setDividerPositions(positions);
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
