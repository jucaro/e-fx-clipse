package at.bestsolution.efxclipse.tooling.jdt.core.internal;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.ClasspathContainerInitializer;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

import at.bestsolution.efxclipse.tooling.jdt.core.JavaFXCore;

public class JavaFXClasspathContainerInitializer extends
		ClasspathContainerInitializer {

	private static class JavaFXContainer implements IClasspathContainer {

		private final IClasspathEntry[] fEntries;
		private final IPath fPath;

		public JavaFXContainer(IPath path, IClasspathEntry[] entries) {
			fPath= path;
			fEntries= entries;
		}

		public IClasspathEntry[] getClasspathEntries() {
			return fEntries;
		}

		public String getDescription() {
			return "JavaFX";
		}

		public int getKind() {
			return IClasspathContainer.K_APPLICATION;
		}

		public IPath getPath() {
			return fPath;
		}

	}
	
	public JavaFXClasspathContainerInitializer() {
		System.err.println("Classpath container initializer");
	}

	@Override
	public void initialize(IPath containerPath, IJavaProject project)
			throws CoreException {
		if (isValidJUnitContainerPath(containerPath)) {
			JavaFXContainer container= getNewContainer(containerPath);
			JavaCore.setClasspathContainer(containerPath, new IJavaProject[] { project }, 	new IClasspathContainer[] { container }, null);
		}
	}
	
	private static JavaFXContainer getNewContainer(IPath containerPath) {
		IClasspathEntry entry= null;
		entry= BuildPathSupport.getJavaFXLibraryEntry();
		
		IClasspathEntry[] entries;
		if (entry == null) {
			entries= new IClasspathEntry[] { };
		} else {
			entries= new IClasspathEntry[] { entry };
		}
		return new JavaFXContainer(containerPath, entries);
	}

	private static boolean isValidJUnitContainerPath(IPath path) {
		return path != null && JavaFXCore.JAVAFX_CONTAINER_ID.equals(path.segment(0));
	}
}
