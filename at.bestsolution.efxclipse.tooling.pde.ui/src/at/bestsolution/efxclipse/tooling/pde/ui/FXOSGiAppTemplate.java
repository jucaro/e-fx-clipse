package at.bestsolution.efxclipse.tooling.pde.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.pde.core.plugin.IPluginBase;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginReference;
import org.eclipse.pde.ui.IFieldData;
import org.eclipse.pde.ui.templates.PluginReference;

import at.bestsolution.efxclipse.tooling.jdt.core.JavaFXCore;

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
		return "javaFXRCP"; //$NON-NLS-1$
	}

	@Override
	protected void updateModel(IProgressMonitor monitor) throws CoreException {
		createApplicationExtension();
		
		if (getBooleanOption(KEY_PRODUCT_BRANDING))
			createProductExtension();
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
}
