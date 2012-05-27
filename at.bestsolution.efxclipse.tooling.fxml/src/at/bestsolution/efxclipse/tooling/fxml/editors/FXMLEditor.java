package at.bestsolution.efxclipse.tooling.fxml.editors;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.wst.sse.ui.StructuredTextEditor;

import at.bestsolution.efxclipse.tooling.ui.editor.IFXMLProviderAdapter;
import at.bestsolution.efxclipse.tooling.ui.util.RelativeFileLocator;

public class FXMLEditor extends StructuredTextEditor implements IFXMLProviderAdapter {

	@Override
	public String getPreviewFXML() {
		return getSourceViewer().getDocument().get();
	}

	@Override
	public List<String> getPreviewCSSFiles() {
		IFile file = getFile();
		List<String> cssFiles = new ArrayList<String>();
		Properties propFile = getProperties();

		if (propFile != null) {
			if (propFile.getProperty("fxmlpreview.all.stylesheets") != null) {
				for (String f : propFile.getProperty("fxmlpreview.all.stylesheets").split(",")) {
					File absFile = RelativeFileLocator.locateFile(file, f.trim());
					if (absFile != null) {
						try {
							cssFiles.add(absFile.toURI().toURL().toExternalForm());
						} catch (MalformedURLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}

			String fileConfig = "fxmlpreview.file." + file.getName().substring(0, file.getName().length() - 5);
			if (propFile.getProperty(fileConfig + ".stylesheets") != null) {
				for (String f : propFile.getProperty(fileConfig + ".stylesheets").split(",")) {
					File absFile = RelativeFileLocator.locateFile(file, f.trim());
					if (absFile != null) {
						try {
							cssFiles.add(absFile.toURI().toURL().toExternalForm());
						} catch (MalformedURLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}

		return cssFiles;
	}

	@Override
	public String getPreviewResourceBundle() {
		Properties propFile = getProperties();

		IFile file = getFile();
		if (propFile != null) {
			String fileConfig = "fxmlpreview.file." + file.getName().substring(0, file.getName().length() - 5);

			if (propFile.getProperty("fxmlpreview.all.messagefile") != null) {
				File f = RelativeFileLocator.locateFile(file, propFile.getProperty("fxmlpreview.all.messagefile"));
				if (f != null && f.exists()) {
					return f.getAbsolutePath();
				}
			}

			if (propFile.getProperty(fileConfig + ".messagefile") != null) {
				File f = RelativeFileLocator.locateFile(file, propFile.getProperty(fileConfig + ".messagefile").trim());
				if (f != null && f.exists()) {
					return f.getAbsolutePath();
				}
			}
		}

		return null;
	}

	private Properties getProperties() {
		IFile file = getFile();
		IProject project = file.getProject();
		IFile previewConfig = project.getFile(new Path("fxml-preview.properties"));

		if (previewConfig.exists()) {
			InputStream stream = null;

			Properties propFile = new Properties();
			try {
				stream = previewConfig.getContents(true);
				propFile.load(stream);
				return propFile;
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (stream != null) {
					try {
						stream.close();
					} catch (IOException e) {
					}
				}
			}
		}

		return null;
	}

	@Override
	public List<URL> getPreviewClasspath() {
		return Collections.emptyList();
	}

	@Override
	public IFile getFile() {
		if (getEditorInput() instanceof IFileEditorInput) {
			IFileEditorInput input = (IFileEditorInput) getEditorInput();
			return input.getFile();
		}
		return null;
	}

	@Override
	public String getPreviewSceneFXML() {
		return null;
	}

}
