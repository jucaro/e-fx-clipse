package at.bestsolution.efxclipse.tooling.css.ui;

import java.util.List;

public interface CssDialectExtension {
	public abstract static class Property {
		private final String name;
		
		public Property(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public abstract List<Proposal> getInitialValueProposals();
	}
	
	
	public static class Proposal {
		private String proposal;
		private String label;
		private String imageUrl;
		
		public Proposal(String label) {
			this.proposal = label;
			this.label = label;
		}

		public String getProposal() {
			return proposal;
		}
		
		public String getImageUrl() {
			return imageUrl;
		}
		
		public String getLabel() {
			return label;
		}
	}
	
	public List<Property> getProperties();
}
