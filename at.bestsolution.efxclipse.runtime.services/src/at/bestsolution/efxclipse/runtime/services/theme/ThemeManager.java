package at.bestsolution.efxclipse.runtime.services.theme;

import java.util.List;


public interface ThemeManager {
	public Theme getCurrentTheme();
	public List<Theme> getAvailableThemes();
	public void setCurrentThemeId(String id) throws IllegalArgumentException;
}
