package at.bestsolution.efxclipse.runtime.workbench.renderers;

import java.util.List;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.IPresentationEngine;

import at.bestsolution.efxclipse.runtime.panels.FillLayoutPane;

@SuppressWarnings("restriction")
public class WorkbenchWindowRenderer extends JFXRenderer {

	@Override
	public Object createWidget(MUIElement element, Object parent) {
		if (element instanceof MWindow) {
			MWindow e = (MWindow) element;
			Stage stage = new Stage();
			stage.setX(e.getX());
			stage.setY(e.getY());
			stage.setWidth(e.getWidth());
			stage.setHeight(e.getHeight());
			stage.setTitle(((MWindow) element).getLocalizedLabel());
			FillLayoutPane root = new FillLayoutPane();
			root.setMarginHeight(5);
			root.setMarginWidth(5);
			root.setStyle("-fx-background-color: #999;");
			Scene scene = new Scene(root,Integer.MAX_VALUE,Integer.MAX_VALUE);
			stage.setScene(scene);

			return stage;
		}

		return null;
	}

	@Override
	public void postProcess(MUIElement childElement) {
		super.postProcess(childElement);

		Stage stage = (Stage) childElement.getWidget();
		stage.toFront();
		stage.show();
	}

	@Override
	public Object getUIContainer(MUIElement element) {
		Stage stage = (Stage) element.getParent().getWidget();
		return stage.getScene().getRoot();
	}
	
	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		if ((MUIElement) container instanceof MWindow) {
			MWindow wbwModel = (MWindow) ((MUIElement) container);
			
			// Process any contents of the newly created ME
			List<MUIElement> parts = container.getChildren();
			if (parts != null) {
				// loading a legacy app will add children to the window while it is
				// being rendered.
				// this is *not* the correct place for this
				// hope that the ADD event will pick up the new part.
				IPresentationEngine renderer = (IPresentationEngine) context.get(IPresentationEngine.class.getName());
				MUIElement[] plist = parts.toArray(new MUIElement[parts.size()]);
				for (int i = 0; i < plist.length; i++) {
					MUIElement childME = plist[i];
					Object element = renderer.createGui(childME);
					if( element instanceof Node ) {
						((FillLayoutPane)getUIContainer(childME)).getChildren().add((Node) element);
					}
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
