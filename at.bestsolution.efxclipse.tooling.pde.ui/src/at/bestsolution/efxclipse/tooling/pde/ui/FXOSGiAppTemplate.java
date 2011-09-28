package at.bestsolution.efxclipse.tooling.pde.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.pde.core.build.IBuildEntry;
import org.eclipse.pde.core.build.IBuildModel;
import org.eclipse.pde.core.plugin.IPluginBase;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginReference;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.internal.core.bundle.BundlePluginBase;
import org.eclipse.pde.internal.core.ibundle.IBundle;
import org.eclipse.pde.ui.IFieldData;
import org.eclipse.pde.ui.templates.PluginReference;
import org.osgi.framework.Constants;

import at.bestsolution.efxclipse.tooling.jdt.core.JavaFXCore;
import at.bestsolution.efxclipse.tooling.jdt.core.internal.JavaFXCorePlugin;
import at.bestsolution.efxclipse.tooling.jdt.core.internal.JavaFXPreferencesConstants;

@SuppressWarnings("restriction")
public class FXOSGiAppTemplate extends FXPDETemplateSection {
	public static final String KEY_APPLICATION_CLASS = "applicationClass"; //$NON-NLS-1$
	public static final String KEY_WINDOW_TITLE = "windowTitle"; //$NON-NLS-1$

	public FXOSGiAppTemplate() {
		setPageCount(1);
		createOptions();
	}
	
	private void createOptions() {
		addOption(KEY_WINDOW_TITLE, "Title", "Hello JavaFX", 0); //$NON-NLS-1$ 
		addOption(KEY_PACKAGE_NAME, "Package", (String) null, 0);
		addOption(KEY_APPLICATION_CLASS, "Application class", "Application", 0); //$NON-NLS-1$
		
		createBrandingOptions();
	}
	
	public void addPages(Wizard wizard) {
		WizardPage page = createPage(0);
		page.setTitle("JavaFX Application");
		page.setDescription("Template to create JavaFX application");
		wizard.addPage(page);
		markPagesAdded();
	}
	
	protected void initializeFields(IFieldData data) {
		// In a new project wizard, we don't know this yet - the
		// model has not been created
		String packageName = getFormattedPackageName(data.getId());
		initializeOption(KEY_PACKAGE_NAME, packageName);
	}
	
	public void initializeFields(IPluginModelBase model) {
		String packageName = getFormattedPackageName(model.getPluginBase().getId());
		initializeOption(KEY_PACKAGE_NAME, packageName);
	}
	
	@Override
	public String getUsedExtensionPoint() {
		return null;
	}

	@Override
	public String getSectionId() {
		return "javaFXApp"; //$NON-NLS-1$
	}

	@Override
	protected void updateModel(IProgressMonitor monitor) throws CoreException {
		createApplicationExtension();
		
		if (getBooleanOption(KEY_PRODUCT_BRANDING))
			createProductExtension();
		
		updateBuildModel();
	}

	private void createApplicationExtension() throws CoreException {
		IPluginBase plugin = model.getPluginBase();

		IPluginExtension extension = createExtension("org.eclipse.core.runtime.applications", true); //$NON-NLS-1$
		extension.setId(VALUE_APPLICATION_ID);

		IPluginElement element = model.getPluginFactory().createElement(extension);
		element.setName("application"); //$NON-NLS-1$
		extension.add(element);

		IPluginElement run = model.getPluginFactory().createElement(element);
		run.setName("run"); //$NON-NLS-1$
		run.setAttribute("class", getStringOption(KEY_PACKAGE_NAME) + "." + getStringOption(KEY_APPLICATION_CLASS)); //$NON-NLS-1$ //$NON-NLS-2$
		element.add(run);

		if (!extension.isInTheModel())
			plugin.add(extension);
	}
	
	private void createProductExtension() throws CoreException {
		IPluginBase plugin = model.getPluginBase();
		IPluginExtension extension = createExtension("org.eclipse.core.runtime.products", true); //$NON-NLS-1$
		extension.setId(VALUE_PRODUCT_ID);

		IPluginElement element = model.getFactory().createElement(extension);
		element.setName("product"); //$NON-NLS-1$
		element.setAttribute("name", getStringOption(KEY_WINDOW_TITLE)); //$NON-NLS-1$  
		element.setAttribute("application", plugin.getId() + "." + VALUE_APPLICATION_ID); //$NON-NLS-1$ //$NON-NLS-2$

		IPluginElement property = model.getFactory().createElement(element);

		property = model.getFactory().createElement(element);
		property.setName("property"); //$NON-NLS-1$
		property.setAttribute("name", "windowImages"); //$NON-NLS-1$ //$NON-NLS-2$
		property.setAttribute("value", "icons/alt_window_16.gif,icons/alt_window_32.gif"); //$NON-NLS-1$ //$NON-NLS-2$
		element.add(property);

		extension.add(element);

		if (!extension.isInTheModel())
			plugin.add(extension);
	}
	
	@Override
	public void execute(IProject project, IPluginModelBase model,
			IProgressMonitor monitor) throws CoreException {
		IJavaProject jProject = JavaCore.create(project);
		List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>(Arrays.asList(jProject.getRawClasspath()));
		entries.add(JavaCore.newContainerEntry(JavaFXCore.JAVAFX_CONTAINER_PATH));
		jProject.setRawClasspath(entries.toArray(new IClasspathEntry[0]), monitor);
		
		if( model.getPluginBase() instanceof BundlePluginBase ) {
			IBundle bundle = ((BundlePluginBase) model.getPluginBase()).getBundle();
			
			String imports = bundle.getHeader(Constants.IMPORT_PACKAGE);
			if( imports == null ) {
				imports = "";
			}
			
			imports += getCommaValuesFromPackagesArray(getImports(), null);
			
			bundle.setHeader(Constants.IMPORT_PACKAGE, imports);
		}
		
		super.execute(project, model, monitor);
	}
	
	public IPluginReference[] getDependencies(String schemaVersion) {
		IPluginReference[] dep = new IPluginReference[2];
		dep[0] = new PluginReference("org.eclipse.core.runtime", null, 0); //$NON-NLS-1$
		dep[1] = new PluginReference("at.bestsolution.efxclipse.runtime.application", null, 0); //$NON-NLS-1$
		
		return dep;
	}
	
	public boolean isDependentOnParentWizard() {
		return true;
	}
	
	public int getNumberOfWorkUnits() {
		return super.getNumberOfWorkUnits() + 1;
	}
	
	public String[] getNewFiles() {
		if (copyBrandingDirectory())
			return new String[] {"icons/", "splash.bmp"}; //$NON-NLS-1$ //$NON-NLS-2$
		return super.getNewFiles();
	}
	
	protected String getCommaValuesFromPackagesArray(String[] values, String version) {
		StringBuffer buffer = new StringBuffer();
		for (String value : values) {
			if (buffer.length() > 0) {
				buffer.append(",\n "); //$NON-NLS-1$ // space required for multiline headers
			}
			buffer.append(value);

			if (value.indexOf(";version=") == -1 && (version != null) && (values.length == 1)) { //$NON-NLS-1$
				buffer.append(";version=\"").append(version).append("\""); //$NON-NLS-1$ //$NON-NLS-2$
			}
		}
		return buffer.toString();
	}
	
	private static String[] getImports() {
		return new String[] {
				"javafx.animation;version=\"2.0.0\"",
				"javafx.application;version=\"2.0.0\"",
				"javafx.beans;version=\"2.0.0\"",
				"javafx.beans.binding;version=\"2.0.0\"",
				"javafx.beans.property;version=\"2.0.0\"",
				"javafx.beans.value;version=\"2.0.0\"",
				"javafx.collections;version=\"2.0.0\"",
				"javafx.concurrent;version=\"2.0.0\"",
				"javafx.embed.swing;version=\"2.0.0\"",
				"javafx.event;version=\"2.0.0\"",
				"javafx.fxml;version=\"2.0.0\"",
				"javafx.geometry;version=\"2.0.0\"",
				"javafx.scene;version=\"2.0.0\"",
				"javafx.scene.chart;version=\"2.0.0\"",
				"javafx.scene.control;version=\"2.0.0\"",
				"javafx.scene.control.cell;version=\"2.0.0\"",
				"javafx.scene.effect;version=\"2.0.0\"",
				"javafx.scene.image;version=\"2.0.0\"",
				"javafx.scene.input;version=\"2.0.0\"",
				"javafx.scene.layout;version=\"2.0.0\"",
				"javafx.scene.media;version=\"2.0.0\"",
				"javafx.scene.paint;version=\"2.0.0\"",
				"javafx.scene.shape;version=\"2.0.0\"",
				"javafx.scene.text;version=\"2.0.0\"",
				"javafx.scene.transform;version=\"2.0.0\"",
				"javafx.scene.web;version=\"2.0.0\"",
				"javafx.stage;version=\"2.0.0\"",
				"javafx.util;version=\"2.0.0\""
			};
	}
}
