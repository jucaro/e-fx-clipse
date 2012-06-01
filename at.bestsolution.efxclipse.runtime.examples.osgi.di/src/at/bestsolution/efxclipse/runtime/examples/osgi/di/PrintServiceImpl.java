package at.bestsolution.efxclipse.runtime.examples.osgi.di;

public class PrintServiceImpl implements PrintService {
	@Override
	public void pring(String message) {
		System.err.println(message);
	}
}
