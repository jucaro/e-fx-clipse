package at.bestsolution.efxclipse.runtime.examples.guice.service;

public interface ILoginService {
	public long login(String username, String password) throws IllegalArgumentException;
}
