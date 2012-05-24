package at.bestsolution.efxclipse.tooling.ui.preview;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.handlers.HandlerUtil;

public class SwitchUpdatePreferenceHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Command command = event.getCommand();
		HandlerUtil.toggleCommandState(command);
//		System.err.println("executed .... ");
	     
//		IEclipsePreferences p = InstanceScope.INSTANCE.getNode(Activator.PLUGIN_ID); 
//		boolean b = p.getBoolean(LivePreviewSynchronizer.PREF_REFRESH_WHILE_TYPE, false);
//		p.putBoolean(LivePreviewSynchronizer.PREF_REFRESH_WHILE_TYPE, !b);
//		try {
//			p.flush();
//		} catch (BackingStoreException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return null;
	}

}
