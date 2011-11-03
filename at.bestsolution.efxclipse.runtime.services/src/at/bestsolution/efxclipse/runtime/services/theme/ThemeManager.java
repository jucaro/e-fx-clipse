package at.bestsolution.efxclipse.runtime.services.theme;

import java.util.List;

import javafx.scene.Scene;

public interface ThemeManager {
	public Theme getCurrentTheme();

	public List<Theme> getAvailableThemes();

	public void setCurrentThemeId(String id) throws IllegalArgumentException;

	public void setScene(Scene scene);

	public Scene getScene();
}
