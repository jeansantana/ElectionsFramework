package com.elections.framework.businessLogic;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ElectionServices implements IElectionServices {

	public ElectionServices() {
	}

	@Override
	public Report doResult(Election election) {
		/*ArrayList<Candidate> candidates = election.getCandidates();
		Collections.sort(candidates, new Comparator<Candidate>() {
			public int compare(Candidate o1, Candidate o2) {
				if (o1.getQttVotes() == o2.getQttVotes()) {
					return 0;
				} else if (o1.getQttVotes() < o2.getQttVotes()) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		return candidates;*/
		
		
		
		return null;
	}

	@Override
	public int countCandidateVotes(Election election, Candidate candidate, Place place) throws CandidateNotFoundException {
		
		election.findCandidate(candidate.getIdentifier());
		
		
		
		return 0;
	}

}
