package at.bestsolution.efxclipse.tooling.wb.javafx.internal.gef;

import org.eclipse.wb.gef.core.EditPart;
import org.eclipse.wb.gef.core.IEditPartFactory;

import at.bestsolution.efxclipse.tooling.wb.javafx.internal.gef.part.NodeEditPart;
import at.bestsolution.efxclipse.tooling.wb.javafx.internal.gef.part.PaneEditPart;
import at.bestsolution.efxclipse.tooling.wb.javafx.internal.model.component.NodeInfo;
import at.bestsolution.efxclipse.tooling.wb.javafx.internal.model.component.PaneInfo;

public class EditPartFactory implements IEditPartFactory {
	private final IEditPartFactory[] FACTORIES = { GENERIC_FACTORY };

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		for (IEditPartFactory factory : FACTORIES) {
			EditPart editPart = factory.createEditPart(null, model);
			if (editPart != null) {
				return editPart;
			}
		}
		return null;
	}

	private static final IEditPartFactory GENERIC_FACTORY = new IEditPartFactory() {

		@Override
		public EditPart createEditPart(EditPart context, Object model) {
			if (model instanceof PaneInfo) {
				return new PaneEditPart((PaneInfo) model);
			}
			if (model instanceof NodeInfo) {
				return new NodeEditPart((NodeInfo) model);
			}
			return null;
		}

	};
}
