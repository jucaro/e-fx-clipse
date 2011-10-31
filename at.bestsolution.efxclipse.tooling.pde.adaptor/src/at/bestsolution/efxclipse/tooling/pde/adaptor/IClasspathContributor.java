package at.bestsolution.efxclipse.tooling.pde.adaptor;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.osgi.service.resolver.BundleDescription;

public interface IClasspathContributor {
	public static class Contribution {
		public final IPath jarLocation;
		public final IPath javaDocLocation;
		public final IPath sourceLocation;
		public final IClasspathAttribute[] attributes;
		
		public Contribution(IPath jarLocation, IPath javaDocLocation, IPath sourceLocation, IClasspathAttribute[] attributes) {
			super();
			this.jarLocation = jarLocation;
			this.javaDocLocation = javaDocLocation;
			this.sourceLocation = sourceLocation;
			this.attributes = attributes;
		}
	}
	
	public Contribution getContributions(BundleDescription desc);
	public boolean isActiveFor(BundleDescription desc);
}
