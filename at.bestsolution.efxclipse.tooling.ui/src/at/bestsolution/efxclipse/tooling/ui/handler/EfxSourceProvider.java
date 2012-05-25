package at.bestsolution.efxclipse.tooling.ui.handler;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.program.Program;
import org.eclipse.ui.AbstractSourceProvider;

public class EfxSourceProvider extends AbstractSourceProvider {
	private Map<String, Object> map = new HashMap<String, Object>();
	
	public EfxSourceProvider() {
		map.put("efx_sceneBuilderAvailable",Program.findProgram(".fxml") != null);
	}
	
	@Override
	public void dispose() {
		map.clear();
	}

	@Override
	public Map getCurrentState() {
		return map;
	}

	@Override
	public String[] getProvidedSourceNames() {
		return new String[]{
			"efx_sceneBuilderAvailable"
		};
	}

}
