package at.bestsolution.efxclipse.tooling.pde.ui.classpath;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.osgi.service.resolver.BundleDescription;

import at.bestsolution.efxclipse.tooling.jdt.core.internal.JavaFXCorePlugin;
import at.bestsolution.efxclipse.tooling.jdt.core.internal.JavaFXPreferencesConstants;
import at.bestsolution.efxclipse.tooling.pde.adaptor.IClasspathContributor;

public class JavaFXClassPathExtender implements IClasspathContributor {

	@Override
	public List<Contribution> getContributions(BundleDescription desc) {
		IEclipsePreferences pref = InstanceScope.INSTANCE.getNode(JavaFXCorePlugin.PLUGIN_ID);
		String dir = pref.get(JavaFXPreferencesConstants.JAVAFX_DIR,"");
		
		if( dir.length() > 0 ) {
			IPath jarLocationPath = new Path(dir).append("rt").append("lib").append("jfxrt.jar");
			IPath javadocLocation = new Path(dir).append("docs").append("api");
			
			return Collections.singletonList(new Contribution(jarLocationPath, javadocLocation, null, null));
		}
		return Collections.emptyList();
	}

	@Override
	public boolean isActiveFor(BundleDescription desc) {
		return "at.bestsolution.efxclipse.runtime.javafx".equals(desc.getName());
	}

	@Override
	public List<String> exportEnvironmentLibraryAdditions(String environmentId) {
		IEclipsePreferences pref = InstanceScope.INSTANCE.getNode(JavaFXCorePlugin.PLUGIN_ID);
		String dir = pref.get(JavaFXPreferencesConstants.JAVAFX_DIR,"");
		if( dir.length() > 0 ) {
			IPath jarLocationPath = new Path(dir).append("rt").append("lib").append("jfxrt.jar");
			return Collections.singletonList(jarLocationPath.toOSString());
		}
		return Collections.emptyList();
	}

}
