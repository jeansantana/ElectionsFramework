package com.elections.framework.businessLogic;

public abstract class ElectionServices implements IElectionServices {

	@Override
	public Report doResult(String title, String typePlace, Election election) {
		
		for (Place place: election.getPlaces()) {
			place = getPlaceByType(place, typePlace);
		}
		
		return null;
	}

	//busca place pelo tipo, estado, pais, cidade são exemplos
	private Place getPlaceByType(Place place, String typePlace) {
		return null;
	}

	@Override
	public int countCandidateVotes(Election election, Candidate candidate,
			Place place) throws CandidateNotFoundException {
		return 0;
	}
	
	private int countCandidateVotes(Candidature c, Candidate candidate) {
		return -1;
	}
	

}
