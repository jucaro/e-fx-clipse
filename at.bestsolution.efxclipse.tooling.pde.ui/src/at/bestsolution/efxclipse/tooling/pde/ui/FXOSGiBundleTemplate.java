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
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginReference;
import org.eclipse.pde.internal.core.bundle.BundlePluginBase;
import org.eclipse.pde.internal.core.ibundle.IBundle;
import org.eclipse.pde.ui.templates.PluginReference;
import org.osgi.framework.Constants;

import at.bestsolution.efxclipse.tooling.jdt.core.JavaFXCore;

public class FXOSGiBundleTemplate extends FXPDETemplateSection {

	public FXOSGiBundleTemplate() {
		setPageCount(1);
	}
	
	public void addPages(Wizard wizard) {
		WizardPage page = createPage(0);
		page.setTitle("JavaFX Bundle");
		page.setDescription("Template to create JavaFX application");
		wizard.addPage(page);
		markPagesAdded();
	}
	
	public int getNumberOfWorkUnits() {
		return super.getNumberOfWorkUnits() + 1;
	}
	
	@Override
	public String getUsedExtensionPoint() {
		return null;
	}

	@Override
	public String getSectionId() {
		return "javaFXBundle";
	}

	@Override
	protected void updateModel(IProgressMonitor monitor) throws CoreException {
		updateBuildModel();
	}
	
	public IPluginReference[] getDependencies(String schemaVersion) {
		IPluginReference[] dep = new IPluginReference[1];
		dep[0] = new PluginReference("org.eclipse.core.runtime", null, 0); //$NON-NLS-1$
		
		return dep;
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
