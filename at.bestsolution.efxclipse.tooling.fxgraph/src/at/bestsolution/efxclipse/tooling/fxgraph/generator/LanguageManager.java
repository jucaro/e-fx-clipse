package at.bestsolution.efxclipse.tooling.fxgraph.generator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class LanguageManager {
	private Set<String> languages = new HashSet<String>();
	
	public boolean addLanguage(String language) {
		languages.add(language);
		return true;
	}
	
	public Collection<String> getLanguages() {
		return languages;
	}
}
