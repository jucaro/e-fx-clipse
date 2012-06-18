/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
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

	private Text sdkDirectoryLocation;
	private Text customJarLocation;
	private Text customAntJarLocation;
	private Text customJavadocLocation;
	private Button customType;
	private Button builtinType;
	private Button sdkType;
	private Button browseForSDKDirectory;

	@Override
	public void init(IWorkbench workbench) {
		
	}
	
	@Override
	protected Control createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(3, false));
		
		IEclipsePreferences pref = InstanceScope.INSTANCE.getNode(JavaFXCorePlugin.PLUGIN_ID);
		String type = pref.get(JavaFXPreferencesConstants.JAVAFX_CONFIGTYPE, JavaFXPreferencesConstants.DEFAULT_TYPE);
		
		if( JavaFXPreferencesConstants.isJDKBuiltin() )
		{
			builtinType = new Button(container, SWT.RADIO);
			builtinType.setText("JDK Built-in");
			builtinType.setLayoutData(new GridData(SWT.BEGINNING,SWT.CENTER,true,false,3,1));
			builtinType.setSelection(type.equals(JavaFXPreferencesConstants.CONFIG_TYPE_BUILTIN));
			builtinType.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					updateSelection();
				}
			});				
		}
		
		new Label(container, SWT.NONE).setLayoutData(new GridData(SWT.FILL,SWT.CENTER,true,false,3,1));
		
		{
			customType = new Button(container, SWT.RADIO);
			customType.setText("Custom Location");
			customType.setLayoutData(new GridData(SWT.BEGINNING,SWT.CENTER,true,false,3,1));
			boolean selected = type.equals(JavaFXPreferencesConstants.CONFIG_TYPE_CUSTOM);
			customType.setSelection(selected);
			customType.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					updateSelection();
				}
			});
			
			{
				Label l = new Label(container, SWT.NONE);
				l.setText("Jar");
				
				customJarLocation = new Text(container, SWT.BORDER);
				customJarLocation.setLayoutData(new GridData(SWT.FILL,SWT.CENTER,true,false,2,1));
				customJarLocation.setEnabled(selected);
			}
			
			{
				Label l = new Label(container, SWT.NONE);
				l.setText("JavaDoc");
				
				customJavadocLocation = new Text(container, SWT.BORDER);
				customJavadocLocation.setLayoutData(new GridData(SWT.FILL,SWT.CENTER,true,false,2,1));
				customJavadocLocation.setEnabled(selected);
			}
			
			{
				Label l = new Label(container, SWT.NONE);
				l.setText("FX-Ant Jar");
				
				customAntJarLocation = new Text(container, SWT.BORDER);
				customAntJarLocation.setLayoutData(new GridData(SWT.FILL,SWT.CENTER,true,false,2,1));
				customAntJarLocation.setEnabled(selected);
			}
		}
		
		new Label(container, SWT.NONE).setLayoutData(new GridData(SWT.FILL,SWT.CENTER,true,false,3,1));
		
		{
			sdkType = new Button(container, SWT.RADIO);
			sdkType.setText("SDK-Directory");
			sdkType.setLayoutData(new GridData(SWT.BEGINNING,SWT.CENTER,true,false,3,1));	
			boolean selected = type.equals(JavaFXPreferencesConstants.CONFIG_TYPE_SDK);
			sdkType.setSelection(selected);
			sdkType.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					updateSelection();
				}
			});
			
			String dir = pref.get(JavaFXPreferencesConstants.JAVAFX_DIR,"");
			
			{
				Label l = new Label(container, SWT.NONE);
				l.setText("JavaFX-SDK-Directory");
				
				sdkDirectoryLocation = new Text(container, SWT.BORDER);
				sdkDirectoryLocation.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				sdkDirectoryLocation.setEnabled(selected);
				if( dir != null ) {
					sdkDirectoryLocation.setText(dir);
				}
				
				browseForSDKDirectory = new Button(container, SWT.PUSH);
				browseForSDKDirectory.setText("Browse ...");
				browseForSDKDirectory.setEnabled(selected);
				browseForSDKDirectory.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						DirectoryDialog dialog = new DirectoryDialog(sdkDirectoryLocation.getShell(),SWT.OPEN);
						String dir = dialog.open();
						if( dir != null ) {
							sdkDirectoryLocation.setText(dir);
						}
					}
				});
			}
		}
				
		return container;
	}

	private void updateSelection() {
		customJarLocation.setEnabled(customType.getSelection());
		customJavadocLocation.setEnabled(customType.getSelection());
		customAntJarLocation.setEnabled(customType.getSelection());
		
		sdkDirectoryLocation.setEnabled(sdkType.getSelection());
		browseForSDKDirectory.setEnabled(sdkType.getSelection());
	}
	
	@Override
	public boolean performOk() {
		IEclipsePreferences pref = InstanceScope.INSTANCE.getNode(JavaFXCorePlugin.PLUGIN_ID);
		
		if( builtinType != null && builtinType.getSelection() ) {
			pref.put(JavaFXPreferencesConstants.JAVAFX_CONFIGTYPE, JavaFXPreferencesConstants.CONFIG_TYPE_BUILTIN);
			try {
				pref.flush();
			} catch (BackingStoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return super.performOk();
		} else if( customType.getSelection() ) {
			pref.put(JavaFXPreferencesConstants.JAVAFX_CONFIGTYPE, JavaFXPreferencesConstants.CONFIG_TYPE_CUSTOM);

			File f = new File(customJarLocation.getText());
			if( ! f.exists() ) {
				setErrorMessage("The jar location is invalid");
				return false;
			}
			
			if( ! customJavadocLocation.getText().isEmpty() ) {
				f = new File(customJarLocation.getText());
				if( !f.exists() ) {
					setErrorMessage("The JavaDoc location is invalid");
					return false;
				}
			}
			
			if( ! customAntJarLocation.getText().isEmpty() ) {
				f = new File(customAntJarLocation.getText());
				if( !f.exists() ) {
					setErrorMessage("The Ant jar location is invalid");
					return false;
				}
			}
			
			try {
				pref.flush();
			} catch (BackingStoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return super.performOk();
		} else if( sdkType.getSelection() ) {
			pref.put(JavaFXPreferencesConstants.JAVAFX_CONFIGTYPE, JavaFXPreferencesConstants.CONFIG_TYPE_SDK);
			String dir = sdkDirectoryLocation.getText();
			
			if( validateSDKDirectory(dir) ) {
				pref.put(JavaFXPreferencesConstants.JAVAFX_DIR,dir);
				try {
					pref.flush();
				} catch (BackingStoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return super.performOk();
			}
		}
		
		return false;
	}
	
	public static boolean validateSDKDirectory(String dir) {
		if( dir.trim().length() > 0 ) {
			File f = new File(dir);
			if( f.exists() ) {
				File jarPath = new File(new File(new File(dir,"rt"),"lib"),"jfxrt.jar");
				File javaDocPath = new File(new File(new File(dir,"docs"),"api"),"package-list");
				return jarPath.exists() && javaDocPath.exists();
			}
		}
		return false;
	}
}