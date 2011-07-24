package at.bestsolution.efxclipse.tooling.wb.javafx.internal.model.component;

import javafx.scene.Node;

import org.eclipse.wb.core.model.AbstractComponentInfo;
import org.eclipse.wb.internal.core.model.JavaInfoUtils;
import org.eclipse.wb.internal.core.model.creation.CreationSupport;
import org.eclipse.wb.internal.core.model.description.ComponentDescription;
import org.eclipse.wb.internal.core.utils.ast.AstEditor;

public class NodeInfo extends AbstractComponentInfo {
	private static final Class<?>[] EXPOSED_TYPES = {Node.class};

	public NodeInfo(AstEditor editor, ComponentDescription description,
			CreationSupport creationSupport) throws Exception {
		super(editor, description, creationSupport);
	}

	 @Override
	  public void createExposedChildren() throws Exception {
	    super.createExposedChildren();
	    JavaInfoUtils.addExposedChildren(this, EXPOSED_TYPES);
	  }
}
