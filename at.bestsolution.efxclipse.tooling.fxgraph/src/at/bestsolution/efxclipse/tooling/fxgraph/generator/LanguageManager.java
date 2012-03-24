package at.bestsolution.efxclipse.tooling.fxgraph.generator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class LanguageManager {
	private Set<String> languages = new HashSet<String>();
	
	public String addLanguage(String language) {
		languages.add(language);
		return "";
	}
	
	public Collection<String> getLanguages() {
		return languages;
	}
}
