package com.elections.framework.businessLogic;

import java.util.HashMap;
import java.util.Map;

public class ElectionServices implements IElectionServices {

	@Override
	public Report getResult(Election election, AbstractPlace place) {
		Map <Integer, Candidate> report = new HashMap<Integer, Candidate>();
		
		for (Candidature candidature : place.getCandidatures()) {
			report.put(place.countVotes(candidature.getCandidate()), candidature.getCandidate());
		}
		
		return new Report(report);
	}
	

}
