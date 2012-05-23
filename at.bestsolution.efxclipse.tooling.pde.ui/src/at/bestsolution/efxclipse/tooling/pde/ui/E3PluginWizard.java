package at.bestsolution.efxclipse.tooling.pde.ui;

import org.eclipse.pde.ui.templates.ITemplateSection;
import org.eclipse.pde.ui.templates.NewPluginTemplateWizard;

public class E3PluginWizard extends NewPluginTemplateWizard {

	@Override
	public ITemplateSection[] createTemplateSections() {
		return new ITemplateSection[]{
				new E3PluginTemplate()
		};
	}
}
