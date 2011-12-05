package at.bestsolution.efxclipse.tooling.fxgraph.ui.handler;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class FXMLToFXGraphConverterHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection s = HandlerUtil.getActiveMenuSelection(event);
		
		if( ! s.isEmpty() && s instanceof IStructuredSelection ) {
			for( IResource r : (List<IResource>)((IStructuredSelection)s).toList() ) {
				if( r instanceof IFile ) {
					IFile f = (IFile) r;
					if( "fxml".equals(f.getFileExtension()) ) {
						URI uri = URI.createPlatformResourceURI(f.getFullPath().toString(), true);
						System.err.println(uri);
						ResourceSet rSet = new ResourceSetImpl();
						Resource resource = rSet.getResource(uri,true);
						System.err.println("The model: " + resource.getContents().get(0));
					}
				}
			}
		}
		
		// TODO Auto-generated method stub
		return null;
	}

}
