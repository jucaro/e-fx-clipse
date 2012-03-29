package at.bestsolution.efxclipse.runtime.databinding;

import javafx.application.Platform;

import org.eclipse.core.databinding.observable.Realm;

public class JFXRealm extends Realm {
	public static void createDefault() {
		setDefault(new JFXRealm());
	}
	
	@Override
	public boolean isCurrent() {
		return Platform.isFxApplicationThread();
	}
	
	@Override
	public void asyncExec(Runnable runnable) {
		Platform.runLater(runnable);
	}
	
	@Override
	public void exec(Runnable runnable) {
		if( isCurrent() ) {
			runnable.run();
		} else {
			Platform.runLater(runnable);
		}
	}
}