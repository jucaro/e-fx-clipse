package at.bestsolution.efxclipse.tooling.fxml.editors;

import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.wst.sse.ui.internal.contentassist.IRelevanceCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;

public class FXMLCompletionProposal extends ConfigurableCompletionProposal implements IRelevanceCompletionProposal {
	public FXMLCompletionProposal(String replacementString, int replacementOffset, int replacementLength, int cursorPosition) {
		super(replacementString, replacementOffset, replacementLength, cursorPosition);
	}
	
	public FXMLCompletionProposal(String replacementString, int replacementOffset, int replacementLength, int cursorPosition, Image image, StyledString displayString, String additionalProposalInfo) {
		super(replacementString, replacementOffset, replacementLength, cursorPosition, image, displayString, null, additionalProposalInfo);
	}

	@Override
	public int getRelevance() {
		return getPriority();
	}
}