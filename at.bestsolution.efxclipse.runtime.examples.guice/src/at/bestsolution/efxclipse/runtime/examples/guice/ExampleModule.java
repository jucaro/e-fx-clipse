package at.bestsolution.efxclipse.runtime.examples.guice;

import at.bestsolution.efxclipse.runtime.examples.guice.service.ILoginService;
import at.bestsolution.efxclipse.runtime.examples.guice.service.impl.MockLoginService;

import com.google.inject.AbstractModule;

public class ExampleModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ILoginService.class).to(MockLoginService.class);
	}

}
