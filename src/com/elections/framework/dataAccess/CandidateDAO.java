package com.elections.framework.dataAccess;

import java.util.ArrayList;

import com.elections.framework.businessLogic.Candidate;


public class CandidateDAO implements ICandidateDAO{
	
	private static CandidateDAO instance;
	private ArrayList<Candidate> candidates;
	
	public Candidate getCandidateById(Object id){
		for(Candidate candidate : candidates){
			if(candidate.getIdentifier().equals(id)) return candidate;
		}
		return null;
	}
	
	private CandidateDAO() {
		candidates = new ArrayList<Candidate>();
	}
	
	public boolean registerCandidate(Candidate candidate){
		candidates.add(candidate);
		return true;
	}
	
	public static CandidateDAO getInstance(){
		if(instance == null) instance = new CandidateDAO();
		return instance;
	}

	public ArrayList<Candidate> getCandidates() {
		return candidates;
	}

	public void setCandidates(ArrayList<Candidate> candidates) {
		this.candidates = candidates;
	}
}
