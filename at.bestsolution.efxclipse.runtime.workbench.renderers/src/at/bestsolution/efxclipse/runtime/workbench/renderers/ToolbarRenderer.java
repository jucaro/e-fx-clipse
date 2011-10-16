package at.bestsolution.efxclipse.runtime.workbench.renderers;

import java.net.URL;

import javax.inject.Inject;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.ui.model.application.ui.MContext;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.menu.MDirectToolItem;
import org.eclipse.e4.ui.model.application.ui.menu.MItem;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.common.util.URI;

@SuppressWarnings("restriction")
public class ToolbarRenderer extends JFXRenderer {
	
	@Inject
	IContributionFactory contributionFactory;
	
	@Inject
	EModelService modelService;
	
	@Override
	public Object createWidget(MUIElement element, Object parent) {
		HBox toolBar = new HBox();
		return toolBar;
	}

	@Override
	public void processContents(MElementContainer<MUIElement> container) {
		HBox bar = (HBox) container.getWidget();
		for( MUIElement e : container.getChildren() ) {
			MToolItem toolItem = (MToolItem) e;
			if( toolItem instanceof MDirectToolItem ) {
				bar.getChildren().add(handleDirectToolItem((MDirectToolItem) toolItem));
			}
		}
	}

	private Button handleDirectToolItem(final MDirectToolItem item) {
		Button b = new Button();
		
		if( item.getIconURI() != null ) {
			URL url = Util.convertToOSGiURL(URI.createURI(item.getIconURI()));
			Image img = new Image(url.toExternalForm());
			b.setGraphic(new ImageView(img));
		}
		
		item.setObject(contributionFactory.create(item.getContributionURI(),getContext(item)));
		
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				final IEclipseContext lclContext = getContext(item);
				lclContext.set(MItem.class, item);
				ContextInjectionFactory.invoke(item.getObject(), Execute.class,
						lclContext);
				lclContext.remove(MItem.class);
			}
		});
		
		return b;
	}
	
	/**
	 * Return a parent context for this part.
	 * 
	 * @param element
	 *            the part to start searching from
	 * @return the parent's closest context, or global context if none in the
	 *         hierarchy
	 */
	protected IEclipseContext getContextForParent(MUIElement element) {
		return modelService.getContainingContext(element);
	}

	/**
	 * Return a context for this part.
	 * 
	 * @param part
	 *            the part to start searching from
	 * @return the closest context, or global context if none in the hierarchy
	 */
	protected IEclipseContext getContext(MUIElement part) {
		if (part instanceof MContext) {
			return ((MContext) part).getContext();
		}
		return getContextForParent(part);
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
