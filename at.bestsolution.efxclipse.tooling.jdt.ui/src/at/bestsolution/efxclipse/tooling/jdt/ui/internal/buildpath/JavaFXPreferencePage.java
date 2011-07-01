package at.bestsolution.efxclipse.tooling.jdt.ui.internal.buildpath;

import java.io.File;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.osgi.service.prefs.BackingStoreException;

import at.bestsolution.efxclipse.tooling.jdt.core.internal.JavaFXCorePlugin;
import at.bestsolution.efxclipse.tooling.jdt.core.internal.JavaFXPreferencesConstants;

public class JavaFXPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {

	private Text sdkDirectory;

	@Override
	public void init(IWorkbench workbench) {
		
	}

	@Override
	protected Control createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(3, false));
		
		IEclipsePreferences pref = InstanceScope.INSTANCE.getNode(JavaFXCorePlugin.PLUGIN_ID);
		String dir = pref.get(JavaFXPreferencesConstants.JAVAFX_DIR,"");
		
		Label l = new Label(container, SWT.NONE);
		l.setText("JavaFX-SDK-Directory");
		
		sdkDirectory = new Text(container, SWT.BORDER);
		sdkDirectory.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		if( dir != null ) {
			sdkDirectory.setText(dir);
		}
		
		Button b = new Button(container, SWT.PUSH);
		b.setText("Browse ...");
		b.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				DirectoryDialog dialog = new DirectoryDialog(sdkDirectory.getShell(),SWT.OPEN);
				String dir = dialog.open();
				if( dir != null ) {
					sdkDirectory.setText(dir);
				}
			}
		});
		
		return container;
	}

	@Override
	public boolean performOk() {
		String dir = sdkDirectory.getText();
		
		if( dir.trim().length() > 0 ) {
			File f = new File(dir);
			if( f.exists() ) {
				File jarPath = new File(new File(new File(dir,"rt"),"lib"),"jfxrt.jar");
				File javaDocPath = new File(new File(new File(dir,"docs"),"api"),"package-list");
				
				if( jarPath.exists() && javaDocPath.exists() ) {
					IEclipsePreferences pref = InstanceScope.INSTANCE.getNode(JavaFXCorePlugin.PLUGIN_ID);
					pref.put(JavaFXPreferencesConstants.JAVAFX_DIR,dir);
					try {
						pref.sync();
						pref.flush();
					} catch (BackingStoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					return super.performOk();
				}
			}
		}
		
		return false;
	}
}