package at.bestsolution.efxclipse.tooling.fxgraph.ui.util.prop;

import java.util.ArrayList;
import java.util.List;

import at.bestsolution.efxclipse.tooling.fxgraph.ui.util.JDTHelper.Proposal;

public class KeyCombinationProvider implements IProposalProvider {
	private List<Proposal> list = new ArrayList<Proposal>();
	
	public KeyCombinationProvider() {
		list.add(new Proposal("\"<mod>+<key>\""));
	}
	
	@Override
	public List<Proposal> getProposals() {
		return list;
	}

}
