package at.bestsolution.efxclipse.runtime.workbench3;

import javafx.embed.swt.FXCanvas;
import javafx.scene.Scene;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public abstract class FXViewPart extends ViewPart {
	private FXCanvas canvas;
	
	@Override
	public void createPartControl(Composite parent) {
		canvas = new FXCanvas(parent, SWT.NONE);
		canvas.setScene(createFxScene());
	}
	
	protected abstract Scene createFxScene();
	
	@Override
	public void setFocus() {
		canvas.setFocus();
		setFxFocus();
	}
	
	protected abstract void setFxFocus();
}
