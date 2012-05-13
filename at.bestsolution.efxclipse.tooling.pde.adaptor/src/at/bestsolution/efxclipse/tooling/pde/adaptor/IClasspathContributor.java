package at.bestsolution.efxclipse.tooling.pde.adaptor;

import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.osgi.service.resolver.BundleDescription;

public interface IClasspathContributor {
	public static class Contribution {
		public final IPath jarLocation;
		public final String javaDocLocation;
		public final IPath sourceLocation;
		public final IClasspathAttribute[] attributes;
		
		public Contribution(IPath jarLocation, String javaDocLocation, IPath sourceLocation, IClasspathAttribute[] attributes) {
			super();
			this.jarLocation = jarLocation;
			this.javaDocLocation = javaDocLocation;
			this.sourceLocation = sourceLocation;
			this.attributes = attributes;
		}
	}
	
	public List<Contribution> getContributions(BundleDescription desc);
	public boolean isActiveFor(BundleDescription desc);
	public List<String> exportEnvironmentLibraryAdditions(String environmentId);
}
