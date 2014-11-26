package com.elections.framework.businessLogic;

public interface IElectionServices {
	public Report doResult(String title, String typePlace, Election election);
	public int countCandidateVotes(Election election, Candidate candidate, Place place) throws CandidateNotFoundException;
	//public List<Candidate>
}
