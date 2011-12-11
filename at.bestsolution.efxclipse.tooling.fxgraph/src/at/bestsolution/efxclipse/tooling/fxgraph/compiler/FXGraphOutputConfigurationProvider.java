package at.bestsolution.efxclipse.tooling.fxgraph.compiler;

import static com.google.common.collect.Sets.newHashSet;

import java.util.Set;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;

public class FXGraphOutputConfigurationProvider extends
		OutputConfigurationProvider {

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		OutputConfiguration defaultOutput = new OutputConfiguration(
				IFileSystemAccess.DEFAULT_OUTPUT);
		defaultOutput.setDescription("Output folder for generated Java files");
		defaultOutput.setOutputDirectory("src");
		defaultOutput.setOverrideExistingResources(true);
		defaultOutput.setCreateOutputDirectory(true);
		defaultOutput.setCanClearOutputDirectory(false);
		defaultOutput.setCleanUpDerivedResources(false);
		defaultOutput.setSetDerivedProperty(false);
		return newHashSet(defaultOutput);
	}
}
