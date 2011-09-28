package at.bestsolution.efxclipse.tooling.pde.ui;

import org.eclipse.pde.ui.templates.ITemplateSection;
import org.eclipse.pde.ui.templates.NewPluginTemplateWizard;

public class FXOSGiBundleWizard extends NewPluginTemplateWizard {

	@Override
	public ITemplateSection[] createTemplateSections() {
		return new ITemplateSection[] { new FXOSGiBundleTemplate() };
	}

}
