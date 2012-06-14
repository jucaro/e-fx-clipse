package at.bestsolution.efxclipse.tooling.pde.ui.classpath;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.osgi.service.resolver.BundleDescription;

import at.bestsolution.efxclipse.tooling.jdt.core.internal.BuildPathSupport;
import at.bestsolution.efxclipse.tooling.pde.adaptor.IClasspathContributor;

@SuppressWarnings("restriction")
public class JavaFXClassPathExtender implements IClasspathContributor {

	@Override
	public List<Contribution> getContributions(BundleDescription desc) {
		IPath[] paths = BuildPathSupport.getPreferencePaths();
		
		if( paths != null ) {
			return Collections.singletonList(new Contribution(paths[0], paths[1] == null ? BuildPathSupport.WEB_JAVADOC_LOCATION : paths[1].toFile().toURI().toString(), null, null));
		}
		
		return Collections.emptyList();
	}

	@Override
	public boolean isActiveFor(BundleDescription desc) {
		return "at.bestsolution.efxclipse.runtime.javafx".equals(desc.getName());
	}

	@Override
	public List<String> exportEnvironmentLibraryAdditions(String environmentId) {
		IPath[] paths = BuildPathSupport.getPreferencePaths();
		
		if( paths != null ) {
			return Collections.singletonList(paths[0].toOSString());
		}
		
		return Collections.emptyList();
	}

}
