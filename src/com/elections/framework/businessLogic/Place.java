package com.elections.framework.businessLogic;

import java.util.List;

public class Place extends AbstractPlace {
	
	public Place(String name, int idPlace) {
		this.name = name;
		this.idPlace = idPlace;
	}

	protected List<Candidature> candidatures;
	
	public List<Candidature> getCandidatures() {
		return candidatures;
	}
	
	
	public void setCandidatures(List<Candidature> candidatures) {
		this.candidatures = candidatures;
	}


	@Override
	public int countVotes(Candidate candidate) {
		int votes = 0;
		for (Candidature  candidature : candidatures) {
			if(candidature.getCandidate().equals(candidate)){
				votes = candidature.getQttvotes();
			}
		}
		return votes;
	}

}
