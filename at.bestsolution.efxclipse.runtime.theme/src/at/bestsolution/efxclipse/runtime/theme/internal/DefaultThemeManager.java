package at.bestsolution.efxclipse.runtime.theme.internal;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.RegistryFactory;
import org.osgi.framework.Bundle;

import at.bestsolution.efxclipse.runtime.services.theme.Theme;
import at.bestsolution.efxclipse.runtime.services.theme.ThemeManager;

public class DefaultThemeManager implements ThemeManager {
	static final String ATT_ID = "id";
	static final String ATT_THEME_ID = "themeId";
	static final String ATT_BASETYLESHEET = "basestylesheet";
	static final String ATT_RESOURCE = "resource";
	
	static class ThemeImpl implements Theme {
		private final IConfigurationElement element;
		private List<IConfigurationElement> stylesheetElements = new ArrayList<IConfigurationElement>(); 
		private List<URL> resolvedUrls = new ArrayList<URL>();
		
		public ThemeImpl(IConfigurationElement element) {
			this.element = element;
		}
		
		void addStylesheet(IConfigurationElement stylesheet) {
			this.resolvedUrls.clear();
			this.stylesheetElements.add(stylesheet);
		}
		
		@Override
		public String getId() {
			return this.element.getAttribute(ATT_ID);
		}
		
		@Override
		public String getName() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<URL> getStylesheetURL() {
			if( resolvedUrls.isEmpty() ) {
				URL url = getUrl(element, ATT_BASETYLESHEET);
				
				if( url != null ) {
					resolvedUrls.add(url);	
				} else {
					//TODO Log an error
				}
				
				for( IConfigurationElement e : stylesheetElements ) {
					url = getUrl(e, ATT_RESOURCE);
					if( url != null ) {
						resolvedUrls.add(url);
					} else {
						//TODO Log an error
					}
				}
				
			}
			return resolvedUrls;
		}
		
		private URL getUrl(IConfigurationElement e, String attributeName) {
			String resource = e.getAttribute(attributeName);
			String contributer = e.getDeclaringExtension().getContributor().getName();
			Bundle b = Platform.getBundle(contributer);
			return b.getResource(resource);
		}
	}
	
	private List<Theme> themes = new ArrayList<Theme>();
	private String currentThemeId;
	
	public DefaultThemeManager() {
		IExtensionRegistry registry = RegistryFactory.getRegistry();
		for( IConfigurationElement e : registry.getConfigurationElementsFor("at.bestsolution.efxclipse.runtime.theme")) {
			if( e.getName().equals("theme") ) {
				themes.add(new ThemeImpl(e));
			}
		}
		
		for( IConfigurationElement e : registry.getConfigurationElementsFor("at.bestsolution.efxclipse.runtime.theme")) {
			if( e.getName().equals("stylesheet") ) {
				String themeId = e.getAttribute(ATT_THEME_ID);
				for( Theme t : themes ) {
					if( t.getId().equals(themeId) ) {
						
					}
				}
			}
		}
		
	}
	
	@Override
	public Theme getCurrentTheme() {
		if( themes.size() == 1 ) {
			return themes.get(0);
		} else {
			String id = getCurrentThemeId();
			if( id != null ) {
				for( Theme t : themes ) {
					if( t.getId().equals(id) ) {
						return t;
					}
				}
			}
			
			themes.get(0);
		}
		
		return null;
	}

	@Override
	public List<Theme> getAvailableThemes() {
		return themes;
	}

	@Override
	public void setCurrentThemeId(String id) {
		for( Theme t : themes ) {
			if( t.getId().equals(id) ) {
				currentThemeId = id;
				return;
			}
		}
		throw new IllegalArgumentException("Theme with id '"+id+"' is not known.");
	}
	
	private String getCurrentThemeId() {
		return currentThemeId;
	}
}
