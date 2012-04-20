package at.bestsolution.efxclipse.tooling.fxgraph.ui.util.prop;

import java.util.List;

import org.eclipse.jdt.core.IJavaProject;

import at.bestsolution.efxclipse.tooling.fxgraph.ui.util.JDTHelper.Proposal;

public interface IProposalProvider {
	public List<Proposal> getProposals(IJavaProject jp);
}
