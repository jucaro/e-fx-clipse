package at.bestsolution.efxclipse.runtime.examples.guice.service.impl;

import at.bestsolution.efxclipse.runtime.examples.guice.service.ILoginService;

public class MockLoginService implements ILoginService {

	@Override
	public long login(String username, String password) throws IllegalArgumentException {
		if( "demo".equals(username) && "demo".equals(password) ) {
			return 1;
		}
		throw new IllegalArgumentException("Username or password incorrect");
	}

}
