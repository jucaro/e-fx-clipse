package at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler;

import java.io.InputStream;
import java.util.Properties;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISources;

public class RunBuildHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEvaluationContext context = (IEvaluationContext) event.getApplicationContext();
		ISelection s = (ISelection) context.getVariable(ISources.ACTIVE_MENU_SELECTION_NAME);
		if( s instanceof IStructuredSelection ) {
			Object o = ((IStructuredSelection) s).getFirstElement();
			if( o instanceof IFile ) {
				IFile f = (IFile) o;
				try {
					InputStream in = f.getContents();
					Properties prop = new Properties();
					prop.load(in);
					in.close();
				} catch (Exception e) {
					throw new ExecutionException("Failed to export application",e);
				}
			}
		}
		// TODO Auto-generated method stub
		return null;
	}
}