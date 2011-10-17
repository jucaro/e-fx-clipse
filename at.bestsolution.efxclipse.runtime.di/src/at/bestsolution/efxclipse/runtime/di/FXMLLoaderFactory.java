package at.bestsolution.efxclipse.runtime.di;


public interface FXMLLoaderFactory {
	public static final String CONTEXT_KEY = "fxmlcomponent";
	
	public <N> FXMLBuilder<N> loadBundleRelative(String relativePath);
	public <N> FXMLBuilder<N> loadRequestorRelative(String relativePath);
}
