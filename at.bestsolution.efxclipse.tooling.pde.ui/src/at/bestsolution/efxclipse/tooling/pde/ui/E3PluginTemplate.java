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
import org.eclipse.pde.core.plugin.IPluginModelFactory;
import org.eclipse.pde.core.plugin.IPluginReference;
import org.eclipse.pde.internal.core.bundle.BundlePluginBase;
import org.eclipse.pde.internal.core.ibundle.IBundle;
import org.eclipse.pde.ui.IFieldData;
import org.eclipse.pde.ui.templates.PluginReference;
import org.osgi.framework.Constants;

import at.bestsolution.efxclipse.tooling.jdt.core.JavaFXCore;

public class E3PluginTemplate extends FXPDETemplateSection {
	public static final String KEY_VIEW_PART_CLASS = "viewPartClass"; //$NON-NLS-1$
	public static final String KEY_VIEW_NAME = "viewName";

	public E3PluginTemplate() {
		setPageCount(1);
		createOptions();
	}
	
	public int getNumberOfWorkUnits() {
		return super.getNumberOfWorkUnits() + 1;
	}
	
	protected void initializeFields(IFieldData data) {
		// In a new project wizard, we don't know this yet - the
		// model has not been created
		initializeFields(data.getId());

	}

	public void initializeFields(IPluginModelBase model) {
		// In the new extension wizard, the model exists so 
		// we can initialize directly from it
		initializeFields(model.getPluginBase().getId());
	}

	public void initializeFields(String id) {
		initializeOption(KEY_PACKAGE_NAME, getFormattedPackageName(id));
	}
	
	public boolean isDependentOnParentWizard() {
		return true;
	}
	
	private void createOptions() {
		addOption(KEY_PACKAGE_NAME, "Package", (String) null, 0);
		addOption(KEY_VIEW_PART_CLASS, "ViewPart class", "MyViewPart", 0); //$NON-NLS-1$
		addOption(KEY_VIEW_NAME, "Name", "My FX View", 0);
	}

	@Override
	public void addPages(Wizard wizard) {
		WizardPage page = createPage(0);
		page.setTitle("Eclipse 3.x ViewPart plugin");
		page.setDescription("Template to create an Eclipse 3.x ViewPart plugin");
		wizard.addPage(page);
		markPagesAdded();
	}
	
	@Override
	public String getUsedExtensionPoint() {
		return "org.eclipse.ui.views";
	}

	@Override
	public String getSectionId() {
		return "eclipse3xplugin";
	}

	@Override
	protected void updateModel(IProgressMonitor monitor) throws CoreException {
		IPluginBase plugin = model.getPluginBase();
		IPluginExtension extension = createExtension("org.eclipse.ui.views", true); //$NON-NLS-1$
		IPluginModelFactory factory = model.getPluginFactory();
		
		String fullClassName = getStringOption(KEY_PACKAGE_NAME) + "." + getStringOption(KEY_VIEW_PART_CLASS); //$NON-NLS-1$ //$NON-NLS-2$
		IPluginElement viewElement = factory.createElement(extension);
		viewElement.setName("view"); //$NON-NLS-1$
		viewElement.setAttribute("id", fullClassName); //$NON-NLS-1$
		viewElement.setAttribute("name", getStringOption(KEY_VIEW_NAME)); //$NON-NLS-1$ //$NON-NLS-2$
		viewElement.setAttribute("icon", "icons/sample.gif"); //$NON-NLS-1$ //$NON-NLS-2$
		viewElement.setAttribute("class", fullClassName); //$NON-NLS-1$
		extension.add(viewElement);
		
		if (!extension.isInTheModel())
			plugin.add(extension);
	}
	
	public IPluginReference[] getDependencies(String schemaVersion) {
		ArrayList<IPluginReference> result = new ArrayList<IPluginReference>();
		if (schemaVersion != null)
			result.add(new PluginReference("org.eclipse.core.runtime", null, 0)); //$NON-NLS-1$
		result.add(new PluginReference("org.eclipse.ui", null, 0)); //$NON-NLS-1$
		result.add(new PluginReference("at.bestsolution.efxclipse.runtime.workbench3", null, 0));
		return (IPluginReference[]) result.toArray(new IPluginReference[result.size()]);
	}

	protected String getFormattedPackageName(String id) {
		String packageName = super.getFormattedPackageName(id);
		if (packageName.length() != 0)
			return packageName + ".views"; //$NON-NLS-1$
		return "views"; //$NON-NLS-1$
	}
	
	public void execute(IProject project, IPluginModelBase model,
			IProgressMonitor monitor) throws CoreException {
//		IJavaProject jProject = JavaCore.create(project);
//		List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>(Arrays.asList(jProject.getRawClasspath()));
//		entries.add(JavaCore.newContainerEntry(JavaFXCore.JAVAFX_CONTAINER_PATH));
//		jProject.setRawClasspath(entries.toArray(new IClasspathEntry[0]), monitor);
		
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
