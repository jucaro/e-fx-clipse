package org.eclipse.swt.examples.controlexample;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import at.bestsolution.efxclipse.runtime.examples.swt.SWTApplication;

public class ControlLauncher extends SWTApplication {

	@Override
	public void run() {
		Display display = new Display();
		Shell shell = new Shell(display, SWT.SHELL_TRIM);
		shell.setLayout(new FillLayout());
		ControlExample instance = new ControlExample(shell);
//		shell.setText(getResourceString("window.title"));
//		setShellSize(instance, shell);
		shell.open();
		
		spinEventLoop();
	}

}
